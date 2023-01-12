package typings.pkijs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IAttribute extends StObject {
  
  /**
    * Specifies type of attribute value
    */
  var `type`: String
  
  /**
    * List of attribute values
    */
  var values: js.Array[Any]
}
object IAttribute {
  
  inline def apply(`type`: String, values: js.Array[Any]): IAttribute = {
    val __obj = js.Dynamic.literal(values = values.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IAttribute]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IAttribute] (val x: Self) extends AnyVal {
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValues(value: js.Array[Any]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    inline def setValuesVarargs(value: Any*): Self = StObject.set(x, "values", js.Array(value*))
  }
}
