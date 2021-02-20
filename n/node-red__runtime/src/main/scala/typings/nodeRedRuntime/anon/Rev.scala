package typings.nodeRedRuntime.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Rev extends StObject {
  
  var rev: String = js.native
}
object Rev {
  
  @scala.inline
  def apply(rev: String): Rev = {
    val __obj = js.Dynamic.literal(rev = rev.asInstanceOf[js.Any])
    __obj.asInstanceOf[Rev]
  }
  
  @scala.inline
  implicit class RevMutableBuilder[Self <: Rev] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRev(value: String): Self = StObject.set(x, "rev", value.asInstanceOf[js.Any])
  }
}
