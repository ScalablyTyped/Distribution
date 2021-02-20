package typings.postmanCollection.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Unresolved extends StObject {
  
  var unresolved: Boolean = js.native
}
object Unresolved {
  
  @scala.inline
  def apply(unresolved: Boolean): Unresolved = {
    val __obj = js.Dynamic.literal(unresolved = unresolved.asInstanceOf[js.Any])
    __obj.asInstanceOf[Unresolved]
  }
  
  @scala.inline
  implicit class UnresolvedMutableBuilder[Self <: Unresolved] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setUnresolved(value: Boolean): Self = StObject.set(x, "unresolved", value.asInstanceOf[js.Any])
  }
}
