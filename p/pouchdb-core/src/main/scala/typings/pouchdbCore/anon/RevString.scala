package typings.pouchdbCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RevString extends StObject {
  
  var rev: String = js.native
}
object RevString {
  
  @scala.inline
  def apply(rev: String): RevString = {
    val __obj = js.Dynamic.literal(rev = rev.asInstanceOf[js.Any])
    __obj.asInstanceOf[RevString]
  }
  
  @scala.inline
  implicit class RevStringMutableBuilder[Self <: RevString] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRev(value: String): Self = StObject.set(x, "rev", value.asInstanceOf[js.Any])
  }
}
