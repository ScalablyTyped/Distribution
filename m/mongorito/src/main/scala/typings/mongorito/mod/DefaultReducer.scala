package typings.mongorito.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DefaultReducer extends StObject {
  
  def fields(state: js.Object, action: Action): Reducer[Any]
  @JSName("fields")
  var fields_Original: Reducer[js.Object]
  
  def unset(state: js.Array[String], action: Action): Reducer[Any]
  @JSName("unset")
  var unset_Original: Reducer[js.Array[String]]
}
object DefaultReducer {
  
  inline def apply(fields: Reducer[js.Object], unset: Reducer[js.Array[String]]): DefaultReducer = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any], unset = unset.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefaultReducer]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DefaultReducer] (val x: Self) extends AnyVal {
    
    inline def setFields(value: Reducer[js.Object]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    inline def setUnset(value: Reducer[js.Array[String]]): Self = StObject.set(x, "unset", value.asInstanceOf[js.Any])
  }
}
