package typings.openapiTypes.mod.OpenAPIV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ItemsObject extends StObject {
  
  var default: js.UndefOr[js.Any] = js.undefined
  
  @JSName("$ref")
  var $ref: js.UndefOr[String] = js.undefined
  
  var collectionFormat: js.UndefOr[String] = js.undefined
  
  var `enum`: js.UndefOr[js.Array[js.Any]] = js.undefined
  
  var exclusiveMaximum: js.UndefOr[Boolean] = js.undefined
  
  var exclusiveMinimum: js.UndefOr[Boolean] = js.undefined
  
  var format: js.UndefOr[String] = js.undefined
  
  var items: js.UndefOr[ItemsObject] = js.undefined
  
  var maxItems: js.UndefOr[Double] = js.undefined
  
  var maxLength: js.UndefOr[Double] = js.undefined
  
  var maximum: js.UndefOr[Double] = js.undefined
  
  var minItems: js.UndefOr[Double] = js.undefined
  
  var minLength: js.UndefOr[Double] = js.undefined
  
  var minimum: js.UndefOr[Double] = js.undefined
  
  var multipleOf: js.UndefOr[Double] = js.undefined
  
  var pattern: js.UndefOr[String] = js.undefined
  
  var `type`: String
  
  var uniqueItems: js.UndefOr[Boolean] = js.undefined
}
object ItemsObject {
  
  inline def apply(`type`: String): ItemsObject = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ItemsObject]
  }
  
  extension [Self <: ItemsObject](x: Self) {
    
    inline def set$ref(value: String): Self = StObject.set(x, "$ref", value.asInstanceOf[js.Any])
    
    inline def set$refUndefined: Self = StObject.set(x, "$ref", js.undefined)
    
    inline def setCollectionFormat(value: String): Self = StObject.set(x, "collectionFormat", value.asInstanceOf[js.Any])
    
    inline def setCollectionFormatUndefined: Self = StObject.set(x, "collectionFormat", js.undefined)
    
    inline def setDefault(value: js.Any): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
    
    inline def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
    
    inline def setEnum(value: js.Array[js.Any]): Self = StObject.set(x, "enum", value.asInstanceOf[js.Any])
    
    inline def setEnumUndefined: Self = StObject.set(x, "enum", js.undefined)
    
    inline def setEnumVarargs(value: js.Any*): Self = StObject.set(x, "enum", js.Array(value :_*))
    
    inline def setExclusiveMaximum(value: Boolean): Self = StObject.set(x, "exclusiveMaximum", value.asInstanceOf[js.Any])
    
    inline def setExclusiveMaximumUndefined: Self = StObject.set(x, "exclusiveMaximum", js.undefined)
    
    inline def setExclusiveMinimum(value: Boolean): Self = StObject.set(x, "exclusiveMinimum", value.asInstanceOf[js.Any])
    
    inline def setExclusiveMinimumUndefined: Self = StObject.set(x, "exclusiveMinimum", js.undefined)
    
    inline def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    inline def setItems(value: ItemsObject): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setMaxItems(value: Double): Self = StObject.set(x, "maxItems", value.asInstanceOf[js.Any])
    
    inline def setMaxItemsUndefined: Self = StObject.set(x, "maxItems", js.undefined)
    
    inline def setMaxLength(value: Double): Self = StObject.set(x, "maxLength", value.asInstanceOf[js.Any])
    
    inline def setMaxLengthUndefined: Self = StObject.set(x, "maxLength", js.undefined)
    
    inline def setMaximum(value: Double): Self = StObject.set(x, "maximum", value.asInstanceOf[js.Any])
    
    inline def setMaximumUndefined: Self = StObject.set(x, "maximum", js.undefined)
    
    inline def setMinItems(value: Double): Self = StObject.set(x, "minItems", value.asInstanceOf[js.Any])
    
    inline def setMinItemsUndefined: Self = StObject.set(x, "minItems", js.undefined)
    
    inline def setMinLength(value: Double): Self = StObject.set(x, "minLength", value.asInstanceOf[js.Any])
    
    inline def setMinLengthUndefined: Self = StObject.set(x, "minLength", js.undefined)
    
    inline def setMinimum(value: Double): Self = StObject.set(x, "minimum", value.asInstanceOf[js.Any])
    
    inline def setMinimumUndefined: Self = StObject.set(x, "minimum", js.undefined)
    
    inline def setMultipleOf(value: Double): Self = StObject.set(x, "multipleOf", value.asInstanceOf[js.Any])
    
    inline def setMultipleOfUndefined: Self = StObject.set(x, "multipleOf", js.undefined)
    
    inline def setPattern(value: String): Self = StObject.set(x, "pattern", value.asInstanceOf[js.Any])
    
    inline def setPatternUndefined: Self = StObject.set(x, "pattern", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setUniqueItems(value: Boolean): Self = StObject.set(x, "uniqueItems", value.asInstanceOf[js.Any])
    
    inline def setUniqueItemsUndefined: Self = StObject.set(x, "uniqueItems", js.undefined)
  }
}
