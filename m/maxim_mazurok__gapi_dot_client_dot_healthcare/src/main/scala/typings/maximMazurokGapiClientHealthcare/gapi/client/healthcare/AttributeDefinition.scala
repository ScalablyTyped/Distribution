package typings.maximMazurokGapiClientHealthcare.gapi.client.healthcare

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AttributeDefinition extends StObject {
  
  /** Required. Possible values for the attribute. The number of allowed values must not exceed 500. An empty list is invalid. The list can only be expanded after creation. */
  var allowedValues: js.UndefOr[js.Array[String]] = js.undefined
  
  /** Required. The category of the attribute. The value of this field cannot be changed after creation. */
  var category: js.UndefOr[String] = js.undefined
  
  /** Optional. Default values of the attribute in Consents. If no default values are specified, it defaults to an empty value. */
  var consentDefaultValues: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Optional. Default value of the attribute in User data mappings. If no default value is specified, it defaults to an empty value. This field is only applicable to attributes of the
    * category `RESOURCE`.
    */
  var dataMappingDefaultValue: js.UndefOr[String] = js.undefined
  
  /** Optional. A description of the attribute. */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * Resource name of the Attribute definition, of the form
    * `projects/{project_id}/locations/{location_id}/datasets/{dataset_id}/consentStores/{consent_store_id}/attributeDefinitions/{attribute_definition_id}`. Cannot be changed after
    * creation.
    */
  var name: js.UndefOr[String] = js.undefined
}
object AttributeDefinition {
  
  inline def apply(): AttributeDefinition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AttributeDefinition]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AttributeDefinition] (val x: Self) extends AnyVal {
    
    inline def setAllowedValues(value: js.Array[String]): Self = StObject.set(x, "allowedValues", value.asInstanceOf[js.Any])
    
    inline def setAllowedValuesUndefined: Self = StObject.set(x, "allowedValues", js.undefined)
    
    inline def setAllowedValuesVarargs(value: String*): Self = StObject.set(x, "allowedValues", js.Array(value*))
    
    inline def setCategory(value: String): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
    
    inline def setCategoryUndefined: Self = StObject.set(x, "category", js.undefined)
    
    inline def setConsentDefaultValues(value: js.Array[String]): Self = StObject.set(x, "consentDefaultValues", value.asInstanceOf[js.Any])
    
    inline def setConsentDefaultValuesUndefined: Self = StObject.set(x, "consentDefaultValues", js.undefined)
    
    inline def setConsentDefaultValuesVarargs(value: String*): Self = StObject.set(x, "consentDefaultValues", js.Array(value*))
    
    inline def setDataMappingDefaultValue(value: String): Self = StObject.set(x, "dataMappingDefaultValue", value.asInstanceOf[js.Any])
    
    inline def setDataMappingDefaultValueUndefined: Self = StObject.set(x, "dataMappingDefaultValue", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
