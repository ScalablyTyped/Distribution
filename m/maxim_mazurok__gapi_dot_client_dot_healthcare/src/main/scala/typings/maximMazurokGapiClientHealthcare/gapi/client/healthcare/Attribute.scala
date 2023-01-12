package typings.maximMazurokGapiClientHealthcare.gapi.client.healthcare

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Attribute extends StObject {
  
  /** Indicates the name of an attribute defined in the consent store. */
  var attributeDefinitionId: js.UndefOr[String] = js.undefined
  
  /**
    * Required. The value of the attribute. Must be an acceptable value as defined in the consent store. For example, if the consent store defines "data type" with acceptable values
    * "questionnaire" and "step-count", when the attribute name is data type, this field must contain one of those values.
    */
  var values: js.UndefOr[js.Array[String]] = js.undefined
}
object Attribute {
  
  inline def apply(): Attribute = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Attribute]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Attribute] (val x: Self) extends AnyVal {
    
    inline def setAttributeDefinitionId(value: String): Self = StObject.set(x, "attributeDefinitionId", value.asInstanceOf[js.Any])
    
    inline def setAttributeDefinitionIdUndefined: Self = StObject.set(x, "attributeDefinitionId", js.undefined)
    
    inline def setValues(value: js.Array[String]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    inline def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
    
    inline def setValuesVarargs(value: String*): Self = StObject.set(x, "values", js.Array(value*))
  }
}
