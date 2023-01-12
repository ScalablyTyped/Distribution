package typings.openapiTypes.mod.OpenAPIV31

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined openapi-types.openapi-types.OpenAPIV3_1.Modify<std.Omit<openapi-types.openapi-types.OpenAPIV3.BaseSchemaObject, 'nullable'>, {  examples :std.Array<openapi-types.openapi-types.OpenAPIV3.BaseSchemaObject['example']> | undefined,   exclusiveMinimum :boolean | number | undefined,   exclusiveMaximum :boolean | number | undefined,   contentMediaType :string | undefined,   $schema :string | undefined,   additionalProperties :boolean | openapi-types.openapi-types.OpenAPIV3_1.ReferenceObject | openapi-types.openapi-types.OpenAPIV3_1.SchemaObject | undefined,   properties :{[name: string] : openapi-types.openapi-types.OpenAPIV3_1.ReferenceObject | openapi-types.openapi-types.OpenAPIV3_1.SchemaObject} | undefined,   allOf :std.Array<openapi-types.openapi-types.OpenAPIV3_1.ReferenceObject | openapi-types.openapi-types.OpenAPIV3_1.SchemaObject> | undefined,   oneOf :std.Array<openapi-types.openapi-types.OpenAPIV3_1.ReferenceObject | openapi-types.openapi-types.OpenAPIV3_1.SchemaObject> | undefined,   anyOf :std.Array<openapi-types.openapi-types.OpenAPIV3_1.ReferenceObject | openapi-types.openapi-types.OpenAPIV3_1.SchemaObject> | undefined,   not :openapi-types.openapi-types.OpenAPIV3_1.ReferenceObject | openapi-types.openapi-types.OpenAPIV3_1.SchemaObject | undefined,   discriminator :openapi-types.openapi-types.OpenAPIV3_1.DiscriminatorObject | undefined,   externalDocs :openapi-types.openapi-types.OpenAPIV3_1.ExternalDocumentationObject | undefined,   xml :openapi-types.openapi-types.OpenAPIV3_1.XMLObject | undefined}> */
trait BaseSchemaObject extends StObject {
  
  var default: js.UndefOr[Any] = js.undefined
  
  @JSName("$schema")
  var $schema: js.UndefOr[String] = js.undefined
  
  var additionalProperties: js.UndefOr[Boolean | ReferenceObject | SchemaObject] = js.undefined
  
  var allOf: js.UndefOr[js.Array[ReferenceObject | SchemaObject]] = js.undefined
  
  var anyOf: js.UndefOr[js.Array[ReferenceObject | SchemaObject]] = js.undefined
  
  var contentMediaType: js.UndefOr[String] = js.undefined
  
  var deprecated: js.UndefOr[Boolean] = js.undefined
  
  var description: js.UndefOr[String] = js.undefined
  
  var discriminator: js.UndefOr[DiscriminatorObject] = js.undefined
  
  var `enum`: js.UndefOr[js.Array[Any]] = js.undefined
  
  var example: js.UndefOr[Any] = js.undefined
  
  var examples: js.UndefOr[js.Array[js.UndefOr[Any]]] = js.undefined
  
  var exclusiveMaximum: js.UndefOr[Boolean | Double] = js.undefined
  
  var exclusiveMinimum: js.UndefOr[Boolean | Double] = js.undefined
  
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
  
  inline def apply(): BaseSchemaObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BaseSchemaObject]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BaseSchemaObject] (val x: Self) extends AnyVal {
    
    inline def set$schema(value: String): Self = StObject.set(x, "$schema", value.asInstanceOf[js.Any])
    
    inline def set$schemaUndefined: Self = StObject.set(x, "$schema", js.undefined)
    
    inline def setAdditionalProperties(value: Boolean | ReferenceObject | SchemaObject): Self = StObject.set(x, "additionalProperties", value.asInstanceOf[js.Any])
    
    inline def setAdditionalPropertiesUndefined: Self = StObject.set(x, "additionalProperties", js.undefined)
    
    inline def setAllOf(value: js.Array[ReferenceObject | SchemaObject]): Self = StObject.set(x, "allOf", value.asInstanceOf[js.Any])
    
    inline def setAllOfUndefined: Self = StObject.set(x, "allOf", js.undefined)
    
    inline def setAllOfVarargs(value: (ReferenceObject | SchemaObject)*): Self = StObject.set(x, "allOf", js.Array(value*))
    
    inline def setAnyOf(value: js.Array[ReferenceObject | SchemaObject]): Self = StObject.set(x, "anyOf", value.asInstanceOf[js.Any])
    
    inline def setAnyOfUndefined: Self = StObject.set(x, "anyOf", js.undefined)
    
    inline def setAnyOfVarargs(value: (ReferenceObject | SchemaObject)*): Self = StObject.set(x, "anyOf", js.Array(value*))
    
    inline def setContentMediaType(value: String): Self = StObject.set(x, "contentMediaType", value.asInstanceOf[js.Any])
    
    inline def setContentMediaTypeUndefined: Self = StObject.set(x, "contentMediaType", js.undefined)
    
    inline def setDefault(value: Any): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
    
    inline def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
    
    inline def setDeprecated(value: Boolean): Self = StObject.set(x, "deprecated", value.asInstanceOf[js.Any])
    
    inline def setDeprecatedUndefined: Self = StObject.set(x, "deprecated", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setDiscriminator(value: DiscriminatorObject): Self = StObject.set(x, "discriminator", value.asInstanceOf[js.Any])
    
    inline def setDiscriminatorUndefined: Self = StObject.set(x, "discriminator", js.undefined)
    
    inline def setEnum(value: js.Array[Any]): Self = StObject.set(x, "enum", value.asInstanceOf[js.Any])
    
    inline def setEnumUndefined: Self = StObject.set(x, "enum", js.undefined)
    
    inline def setEnumVarargs(value: Any*): Self = StObject.set(x, "enum", js.Array(value*))
    
    inline def setExample(value: Any): Self = StObject.set(x, "example", value.asInstanceOf[js.Any])
    
    inline def setExampleUndefined: Self = StObject.set(x, "example", js.undefined)
    
    inline def setExamples(value: js.Array[js.UndefOr[Any]]): Self = StObject.set(x, "examples", value.asInstanceOf[js.Any])
    
    inline def setExamplesUndefined: Self = StObject.set(x, "examples", js.undefined)
    
    inline def setExamplesVarargs(value: js.UndefOr[Any]*): Self = StObject.set(x, "examples", js.Array(value*))
    
    inline def setExclusiveMaximum(value: Boolean | Double): Self = StObject.set(x, "exclusiveMaximum", value.asInstanceOf[js.Any])
    
    inline def setExclusiveMaximumUndefined: Self = StObject.set(x, "exclusiveMaximum", js.undefined)
    
    inline def setExclusiveMinimum(value: Boolean | Double): Self = StObject.set(x, "exclusiveMinimum", value.asInstanceOf[js.Any])
    
    inline def setExclusiveMinimumUndefined: Self = StObject.set(x, "exclusiveMinimum", js.undefined)
    
    inline def setExternalDocs(value: ExternalDocumentationObject): Self = StObject.set(x, "externalDocs", value.asInstanceOf[js.Any])
    
    inline def setExternalDocsUndefined: Self = StObject.set(x, "externalDocs", js.undefined)
    
    inline def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    inline def setMaxItems(value: Double): Self = StObject.set(x, "maxItems", value.asInstanceOf[js.Any])
    
    inline def setMaxItemsUndefined: Self = StObject.set(x, "maxItems", js.undefined)
    
    inline def setMaxLength(value: Double): Self = StObject.set(x, "maxLength", value.asInstanceOf[js.Any])
    
    inline def setMaxLengthUndefined: Self = StObject.set(x, "maxLength", js.undefined)
    
    inline def setMaxProperties(value: Double): Self = StObject.set(x, "maxProperties", value.asInstanceOf[js.Any])
    
    inline def setMaxPropertiesUndefined: Self = StObject.set(x, "maxProperties", js.undefined)
    
    inline def setMaximum(value: Double): Self = StObject.set(x, "maximum", value.asInstanceOf[js.Any])
    
    inline def setMaximumUndefined: Self = StObject.set(x, "maximum", js.undefined)
    
    inline def setMinItems(value: Double): Self = StObject.set(x, "minItems", value.asInstanceOf[js.Any])
    
    inline def setMinItemsUndefined: Self = StObject.set(x, "minItems", js.undefined)
    
    inline def setMinLength(value: Double): Self = StObject.set(x, "minLength", value.asInstanceOf[js.Any])
    
    inline def setMinLengthUndefined: Self = StObject.set(x, "minLength", js.undefined)
    
    inline def setMinProperties(value: Double): Self = StObject.set(x, "minProperties", value.asInstanceOf[js.Any])
    
    inline def setMinPropertiesUndefined: Self = StObject.set(x, "minProperties", js.undefined)
    
    inline def setMinimum(value: Double): Self = StObject.set(x, "minimum", value.asInstanceOf[js.Any])
    
    inline def setMinimumUndefined: Self = StObject.set(x, "minimum", js.undefined)
    
    inline def setMultipleOf(value: Double): Self = StObject.set(x, "multipleOf", value.asInstanceOf[js.Any])
    
    inline def setMultipleOfUndefined: Self = StObject.set(x, "multipleOf", js.undefined)
    
    inline def setNot(value: ReferenceObject | SchemaObject): Self = StObject.set(x, "not", value.asInstanceOf[js.Any])
    
    inline def setNotUndefined: Self = StObject.set(x, "not", js.undefined)
    
    inline def setOneOf(value: js.Array[ReferenceObject | SchemaObject]): Self = StObject.set(x, "oneOf", value.asInstanceOf[js.Any])
    
    inline def setOneOfUndefined: Self = StObject.set(x, "oneOf", js.undefined)
    
    inline def setOneOfVarargs(value: (ReferenceObject | SchemaObject)*): Self = StObject.set(x, "oneOf", js.Array(value*))
    
    inline def setPattern(value: String): Self = StObject.set(x, "pattern", value.asInstanceOf[js.Any])
    
    inline def setPatternUndefined: Self = StObject.set(x, "pattern", js.undefined)
    
    inline def setProperties(value: StringDictionary[ReferenceObject | SchemaObject]): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    inline def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
    
    inline def setReadOnly(value: Boolean): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
    
    inline def setReadOnlyUndefined: Self = StObject.set(x, "readOnly", js.undefined)
    
    inline def setRequired(value: js.Array[String]): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
    
    inline def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
    
    inline def setRequiredVarargs(value: String*): Self = StObject.set(x, "required", js.Array(value*))
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setUniqueItems(value: Boolean): Self = StObject.set(x, "uniqueItems", value.asInstanceOf[js.Any])
    
    inline def setUniqueItemsUndefined: Self = StObject.set(x, "uniqueItems", js.undefined)
    
    inline def setWriteOnly(value: Boolean): Self = StObject.set(x, "writeOnly", value.asInstanceOf[js.Any])
    
    inline def setWriteOnlyUndefined: Self = StObject.set(x, "writeOnly", js.undefined)
    
    inline def setXml(value: XMLObject): Self = StObject.set(x, "xml", value.asInstanceOf[js.Any])
    
    inline def setXmlUndefined: Self = StObject.set(x, "xml", js.undefined)
  }
}
