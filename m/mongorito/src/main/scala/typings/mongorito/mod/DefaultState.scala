package typings.mongorito.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DefaultState extends StObject {
  
  var fields: js.Object = js.native
  
  var unset: js.Array[String] = js.native
}
object DefaultState {
  
  @scala.inline
  def apply(fields: js.Object, unset: js.Array[String]): DefaultState = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any], unset = unset.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefaultState]
  }
  
  @scala.inline
  implicit class DefaultStateMutableBuilder[Self <: DefaultState] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFields(value: js.Object): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnset(value: js.Array[String]): Self = StObject.set(x, "unset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnsetVarargs(value: String*): Self = StObject.set(x, "unset", js.Array(value :_*))
  }
}
