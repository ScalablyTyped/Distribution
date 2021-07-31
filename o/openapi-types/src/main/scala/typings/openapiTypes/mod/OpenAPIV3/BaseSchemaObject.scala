package typings.openapiTypes.mod.OpenAPIV3

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BaseSchemaObject extends StObject {
  
  var default: js.UndefOr[js.Any] = js.undefined
  
  var additionalProperties: js.UndefOr[Boolean | ReferenceObject | SchemaObject] = js.undefined
  
  var allOf: js.UndefOr[js.Array[ReferenceObject | SchemaObject]] = js.undefined
  
  var anyOf: js.UndefOr[js.Array[ReferenceObject | SchemaObject]] = js.undefined
  
  var deprecated: js.UndefOr[Boolean] = js.undefined
  
  var description: js.UndefOr[String] = js.undefined
  
  var discriminator: js.UndefOr[DiscriminatorObject] = js.undefined
  
  var `enum`: js.UndefOr[js.Array[js.Any]] = js.undefined
  
  var example: js.UndefOr[js.Any] = js.undefined
  
  var exclusiveMaximum: js.UndefOr[Boolean] = js.undefined
  
  var exclusiveMinimum: js.UndefOr[Boolean] = js.undefined
  
  var externalDocs: js.UndefOr[ExternalDocumentationObject] = js.undefined
  
  var format: js.UndefOr[String] = js.undefined
  
  var maxItems: js.UndefOr[Double] = js.undefined
  
  var maxLength: js.UndefOr[Double] = js.undefined
  
  var maxProperties: js.UndefOr[Double] = js.undefined
  
  var maximum: js.UndefOr[Double] = js.undefined
  
  var minItems: js.UndefOr[Double] = js.undefined
  
  var minLength: js.UndefOr[Double] = js.undefined
  
  var minProperties: js.UndefOr[Double] = js.undefined
  
  var minimum: js.UndefOr[Double] = js.undefined
  
  var multipleOf: js.UndefOr[Double] = js.undefined
  
  var not: js.UndefOr[ReferenceObject | SchemaObject] = js.undefined
  
  var nullable: js.UndefOr[Boolean] = js.undefined
  
  var oneOf: js.UndefOr[js.Array[ReferenceObject | SchemaObject]] = js.undefined
  
  var pattern: js.UndefOr[String] = js.undefined
  
  var properties: js.UndefOr[StringDictionary[ReferenceObject | SchemaObject]] = js.undefined
  
  var readOnly: js.UndefOr[Boolean] = js.undefined
  
  var required: js.UndefOr[js.Array[String]] = js.undefined
  
  var title: js.UndefOr[String] = js.undefined
  
  var uniqueItems: js.UndefOr[Boolean] = js.undefined
  
  var writeOnly: js.UndefOr[Boolean] = js.undefined
  
  var xml: js.UndefOr[XMLObject] = js.undefined
}
object BaseSchemaObject {
  
  @scala.inline
  def apply(): BaseSchemaObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BaseSchemaObject]
  }
  
  @scala.inline
  implicit class BaseSchemaObjectMutableBuilder[Self <: BaseSchemaObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdditionalProperties(value: Boolean | ReferenceObject | SchemaObject): Self = StObject.set(x, "additionalProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdditionalPropertiesUndefined: Self = StObject.set(x, "additionalProperties", js.undefined)
    
    @scala.inline
    def setAllOf(value: js.Array[ReferenceObject | SchemaObject]): Self = StObject.set(x, "allOf", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllOfUndefined: Self = StObject.set(x, "allOf", js.undefined)
    
    @scala.inline
    def setAllOfVarargs(value: (ReferenceObject | SchemaObject)*): Self = StObject.set(x, "allOf", js.Array(value :_*))
    
    @scala.inline
    def setAnyOf(value: js.Array[ReferenceObject | SchemaObject]): Self = StObject.set(x, "anyOf", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnyOfUndefined: Self = StObject.set(x, "anyOf", js.undefined)
    
    @scala.inline
    def setAnyOfVarargs(value: (ReferenceObject | SchemaObject)*): Self = StObject.set(x, "anyOf", js.Array(value :_*))
    
    @scala.inline
    def setDefault(value: js.Any): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
    
    @scala.inline
    def setDeprecated(value: Boolean): Self = StObject.set(x, "deprecated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeprecatedUndefined: Self = StObject.set(x, "deprecated", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setDiscriminator(value: DiscriminatorObject): Self = StObject.set(x, "discriminator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDiscriminatorUndefined: Self = StObject.set(x, "discriminator", js.undefined)
    
    @scala.inline
    def setEnum(value: js.Array[js.Any]): Self = StObject.set(x, "enum", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnumUndefined: Self = StObject.set(x, "enum", js.undefined)
    
    @scala.inline
    def setEnumVarargs(value: js.Any*): Self = StObject.set(x, "enum", js.Array(value :_*))
    
    @scala.inline
    def setExample(value: js.Any): Self = StObject.set(x, "example", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExampleUndefined: Self = StObject.set(x, "example", js.undefined)
    
    @scala.inline
    def setExclusiveMaximum(value: Boolean): Self = StObject.set(x, "exclusiveMaximum", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExclusiveMaximumUndefined: Self = StObject.set(x, "exclusiveMaximum", js.undefined)
    
    @scala.inline
    def setExclusiveMinimum(value: Boolean): Self = StObject.set(x, "exclusiveMinimum", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExclusiveMinimumUndefined: Self = StObject.set(x, "exclusiveMinimum", js.undefined)
    
    @scala.inline
    def setExternalDocs(value: ExternalDocumentationObject): Self = StObject.set(x, "externalDocs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExternalDocsUndefined: Self = StObject.set(x, "externalDocs", js.undefined)
    
    @scala.inline
    def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    @scala.inline
    def setMaxItems(value: Double): Self = StObject.set(x, "maxItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxItemsUndefined: Self = StObject.set(x, "maxItems", js.undefined)
    
    @scala.inline
    def setMaxLength(value: Double): Self = StObject.set(x, "maxLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxLengthUndefined: Self = StObject.set(x, "maxLength", js.undefined)
    
    @scala.inline
    def setMaxProperties(value: Double): Self = StObject.set(x, "maxProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxPropertiesUndefined: Self = StObject.set(x, "maxProperties", js.undefined)
    
    @scala.inline
    def setMaximum(value: Double): Self = StObject.set(x, "maximum", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaximumUndefined: Self = StObject.set(x, "maximum", js.undefined)
    
    @scala.inline
    def setMinItems(value: Double): Self = StObject.set(x, "minItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinItemsUndefined: Self = StObject.set(x, "minItems", js.undefined)
    
    @scala.inline
    def setMinLength(value: Double): Self = StObject.set(x, "minLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinLengthUndefined: Self = StObject.set(x, "minLength", js.undefined)
    
    @scala.inline
    def setMinProperties(value: Double): Self = StObject.set(x, "minProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinPropertiesUndefined: Self = StObject.set(x, "minProperties", js.undefined)
    
    @scala.inline
    def setMinimum(value: Double): Self = StObject.set(x, "minimum", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinimumUndefined: Self = StObject.set(x, "minimum", js.undefined)
    
    @scala.inline
    def setMultipleOf(value: Double): Self = StObject.set(x, "multipleOf", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMultipleOfUndefined: Self = StObject.set(x, "multipleOf", js.undefined)
    
    @scala.inline
    def setNot(value: ReferenceObject | SchemaObject): Self = StObject.set(x, "not", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotUndefined: Self = StObject.set(x, "not", js.undefined)
    
    @scala.inline
    def setNullable(value: Boolean): Self = StObject.set(x, "nullable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNullableUndefined: Self = StObject.set(x, "nullable", js.undefined)
    
    @scala.inline
    def setOneOf(value: js.Array[ReferenceObject | SchemaObject]): Self = StObject.set(x, "oneOf", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOneOfUndefined: Self = StObject.set(x, "oneOf", js.undefined)
    
    @scala.inline
    def setOneOfVarargs(value: (ReferenceObject | SchemaObject)*): Self = StObject.set(x, "oneOf", js.Array(value :_*))
    
    @scala.inline
    def setPattern(value: String): Self = StObject.set(x, "pattern", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPatternUndefined: Self = StObject.set(x, "pattern", js.undefined)
    
    @scala.inline
    def setProperties(value: StringDictionary[ReferenceObject | SchemaObject]): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
    
    @scala.inline
    def setReadOnly(value: Boolean): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadOnlyUndefined: Self = StObject.set(x, "readOnly", js.undefined)
    
    @scala.inline
    def setRequired(value: js.Array[String]): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
    
    @scala.inline
    def setRequiredVarargs(value: String*): Self = StObject.set(x, "required", js.Array(value :_*))
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    @scala.inline
    def setUniqueItems(value: Boolean): Self = StObject.set(x, "uniqueItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUniqueItemsUndefined: Self = StObject.set(x, "uniqueItems", js.undefined)
    
    @scala.inline
    def setWriteOnly(value: Boolean): Self = StObject.set(x, "writeOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWriteOnlyUndefined: Self = StObject.set(x, "writeOnly", js.undefined)
    
    @scala.inline
    def setXml(value: XMLObject): Self = StObject.set(x, "xml", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXmlUndefined: Self = StObject.set(x, "xml", js.undefined)
  }
}
