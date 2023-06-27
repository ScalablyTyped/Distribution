package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CustomSecurityAttributeDefinition
  extends StObject
     with Entity {
  
  /**
    * Values that are predefined for this custom security attribute. This navigation property is not returned by default and
    * must be specified in an $expand query. For example,
    * /directory/customSecurityAttributeDefinitions?$expand=allowedValues.
    */
  var allowedValues: js.UndefOr[NullableOption[js.Array[AllowedValue]]] = js.undefined
  
  // Name of the attribute set. Case insensitive.
  var attributeSet: js.UndefOr[String] = js.undefined
  
  /**
    * Description of the custom security attribute. Can be up to 128 characters long and include Unicode characters. Can be
    * changed later.
    */
  var description: js.UndefOr[NullableOption[String]] = js.undefined
  
  /**
    * Indicates whether multiple values can be assigned to the custom security attribute. Cannot be changed later. If type is
    * set to Boolean, isCollection cannot be set to true.
    */
  var isCollection: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Indicates whether custom security attribute values are indexed for searching on objects that are assigned attribute
    * values. Cannot be changed later.
    */
  var isSearchable: js.UndefOr[NullableOption[Boolean]] = js.undefined
  
  /**
    * Name of the custom security attribute. Must be unique within an attribute set. Can be up to 32 characters long and
    * include Unicode characters. Cannot contain spaces or special characters. Cannot be changed later. Case insensitive.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies whether the custom security attribute is active or deactivated. Acceptable values are: Available and
    * Deprecated. Can be changed later.
    */
  var status: js.UndefOr[String] = js.undefined
  
  /**
    * Data type for the custom security attribute values. Supported types are: Boolean, Integer, and String. Cannot be
    * changed later.
    */
  var `type`: js.UndefOr[String] = js.undefined
  
  /**
    * Indicates whether only predefined values can be assigned to the custom security attribute. If set to false, free-form
    * values are allowed. Can later be changed from true to false, but cannot be changed from false to true. If type is set
    * to Boolean, usePreDefinedValuesOnly cannot be set to true.
    */
  var usePreDefinedValuesOnly: js.UndefOr[NullableOption[Boolean]] = js.undefined
}
object CustomSecurityAttributeDefinition {
  
  inline def apply(): CustomSecurityAttributeDefinition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CustomSecurityAttributeDefinition]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CustomSecurityAttributeDefinition] (val x: Self) extends AnyVal {
    
    inline def setAllowedValues(value: NullableOption[js.Array[AllowedValue]]): Self = StObject.set(x, "allowedValues", value.asInstanceOf[js.Any])
    
    inline def setAllowedValuesNull: Self = StObject.set(x, "allowedValues", null)
    
    inline def setAllowedValuesUndefined: Self = StObject.set(x, "allowedValues", js.undefined)
    
    inline def setAllowedValuesVarargs(value: AllowedValue*): Self = StObject.set(x, "allowedValues", js.Array(value*))
    
    inline def setAttributeSet(value: String): Self = StObject.set(x, "attributeSet", value.asInstanceOf[js.Any])
    
    inline def setAttributeSetUndefined: Self = StObject.set(x, "attributeSet", js.undefined)
    
    inline def setDescription(value: NullableOption[String]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setIsCollection(value: Boolean): Self = StObject.set(x, "isCollection", value.asInstanceOf[js.Any])
    
    inline def setIsCollectionUndefined: Self = StObject.set(x, "isCollection", js.undefined)
    
    inline def setIsSearchable(value: NullableOption[Boolean]): Self = StObject.set(x, "isSearchable", value.asInstanceOf[js.Any])
    
    inline def setIsSearchableNull: Self = StObject.set(x, "isSearchable", null)
    
    inline def setIsSearchableUndefined: Self = StObject.set(x, "isSearchable", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setUsePreDefinedValuesOnly(value: NullableOption[Boolean]): Self = StObject.set(x, "usePreDefinedValuesOnly", value.asInstanceOf[js.Any])
    
    inline def setUsePreDefinedValuesOnlyNull: Self = StObject.set(x, "usePreDefinedValuesOnly", null)
    
    inline def setUsePreDefinedValuesOnlyUndefined: Self = StObject.set(x, "usePreDefinedValuesOnly", js.undefined)
  }
}
