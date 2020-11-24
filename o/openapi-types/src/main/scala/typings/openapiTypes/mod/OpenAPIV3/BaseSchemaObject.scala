package typings.openapiTypes.mod.OpenAPIV3

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BaseSchemaObject extends js.Object {
  
  var additionalProperties: js.UndefOr[Boolean | ReferenceObject | SchemaObject] = js.native
  
  var allOf: js.UndefOr[js.Array[ReferenceObject | SchemaObject]] = js.native
  
  var anyOf: js.UndefOr[js.Array[ReferenceObject | SchemaObject]] = js.native
  
  var default: js.UndefOr[js.Any] = js.native
  
  var deprecated: js.UndefOr[Boolean] = js.native
  
  var description: js.UndefOr[String] = js.native
  
  var discriminator: js.UndefOr[DiscriminatorObject] = js.native
  
  var enum: js.UndefOr[js.Array[_]] = js.native
  
  var example: js.UndefOr[js.Any] = js.native
  
  var exclusiveMaximum: js.UndefOr[Boolean] = js.native
  
  var exclusiveMinimum: js.UndefOr[Boolean] = js.native
  
  var externalDocs: js.UndefOr[ExternalDocumentationObject] = js.native
  
  var format: js.UndefOr[String] = js.native
  
  var maxItems: js.UndefOr[Double] = js.native
  
  var maxLength: js.UndefOr[Double] = js.native
  
  var maxProperties: js.UndefOr[Double] = js.native
  
  var maximum: js.UndefOr[Double] = js.native
  
  var minItems: js.UndefOr[Double] = js.native
  
  var minLength: js.UndefOr[Double] = js.native
  
  var minProperties: js.UndefOr[Double] = js.native
  
  var minimum: js.UndefOr[Double] = js.native
  
  var multipleOf: js.UndefOr[Double] = js.native
  
  var not: js.UndefOr[ReferenceObject | SchemaObject] = js.native
  
  var nullable: js.UndefOr[Boolean] = js.native
  
  var oneOf: js.UndefOr[js.Array[ReferenceObject | SchemaObject]] = js.native
  
  var pattern: js.UndefOr[String] = js.native
  
  var properties: js.UndefOr[StringDictionary[ReferenceObject | SchemaObject]] = js.native
  
  var readOnly: js.UndefOr[Boolean] = js.native
  
  var required: js.UndefOr[js.Array[String]] = js.native
  
  var title: js.UndefOr[String] = js.native
  
  var uniqueItems: js.UndefOr[Boolean] = js.native
  
  var writeOnly: js.UndefOr[Boolean] = js.native
  
  var xml: js.UndefOr[XMLObject] = js.native
}
object BaseSchemaObject {
  
  @scala.inline
  def apply(): BaseSchemaObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BaseSchemaObject]
  }
  
  @scala.inline
  implicit class BaseSchemaObjectOps[Self <: BaseSchemaObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAdditionalProperties(value: Boolean | ReferenceObject | SchemaObject): Self = this.set("additionalProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAdditionalProperties: Self = this.set("additionalProperties", js.undefined)
    
    @scala.inline
    def setAllOfVarargs(value: (ReferenceObject | SchemaObject)*): Self = this.set("allOf", js.Array(value :_*))
    
    @scala.inline
    def setAllOf(value: js.Array[ReferenceObject | SchemaObject]): Self = this.set("allOf", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllOf: Self = this.set("allOf", js.undefined)
    
    @scala.inline
    def setAnyOfVarargs(value: (ReferenceObject | SchemaObject)*): Self = this.set("anyOf", js.Array(value :_*))
    
    @scala.inline
    def setAnyOf(value: js.Array[ReferenceObject | SchemaObject]): Self = this.set("anyOf", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnyOf: Self = this.set("anyOf", js.undefined)
    
    @scala.inline
    def setDefault(value: js.Any): Self = this.set("default", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefault: Self = this.set("default", js.undefined)
    
    @scala.inline
    def setDeprecated(value: Boolean): Self = this.set("deprecated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeprecated: Self = this.set("deprecated", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setDiscriminator(value: DiscriminatorObject): Self = this.set("discriminator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDiscriminator: Self = this.set("discriminator", js.undefined)
    
    @scala.inline
    def setEnumVarargs(value: js.Any*): Self = this.set("enum", js.Array(value :_*))
    
    @scala.inline
    def setEnum(value: js.Array[_]): Self = this.set("enum", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnum: Self = this.set("enum", js.undefined)
    
    @scala.inline
    def setExample(value: js.Any): Self = this.set("example", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExample: Self = this.set("example", js.undefined)
    
    @scala.inline
    def setExclusiveMaximum(value: Boolean): Self = this.set("exclusiveMaximum", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExclusiveMaximum: Self = this.set("exclusiveMaximum", js.undefined)
    
    @scala.inline
    def setExclusiveMinimum(value: Boolean): Self = this.set("exclusiveMinimum", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExclusiveMinimum: Self = this.set("exclusiveMinimum", js.undefined)
    
    @scala.inline
    def setExternalDocs(value: ExternalDocumentationObject): Self = this.set("externalDocs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExternalDocs: Self = this.set("externalDocs", js.undefined)
    
    @scala.inline
    def setFormat(value: String): Self = this.set("format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFormat: Self = this.set("format", js.undefined)
    
    @scala.inline
    def setMaxItems(value: Double): Self = this.set("maxItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxItems: Self = this.set("maxItems", js.undefined)
    
    @scala.inline
    def setMaxLength(value: Double): Self = this.set("maxLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxLength: Self = this.set("maxLength", js.undefined)
    
    @scala.inline
    def setMaxProperties(value: Double): Self = this.set("maxProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxProperties: Self = this.set("maxProperties", js.undefined)
    
    @scala.inline
    def setMaximum(value: Double): Self = this.set("maximum", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaximum: Self = this.set("maximum", js.undefined)
    
    @scala.inline
    def setMinItems(value: Double): Self = this.set("minItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinItems: Self = this.set("minItems", js.undefined)
    
    @scala.inline
    def setMinLength(value: Double): Self = this.set("minLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinLength: Self = this.set("minLength", js.undefined)
    
    @scala.inline
    def setMinProperties(value: Double): Self = this.set("minProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinProperties: Self = this.set("minProperties", js.undefined)
    
    @scala.inline
    def setMinimum(value: Double): Self = this.set("minimum", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinimum: Self = this.set("minimum", js.undefined)
    
    @scala.inline
    def setMultipleOf(value: Double): Self = this.set("multipleOf", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMultipleOf: Self = this.set("multipleOf", js.undefined)
    
    @scala.inline
    def setNot(value: ReferenceObject | SchemaObject): Self = this.set("not", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNot: Self = this.set("not", js.undefined)
    
    @scala.inline
    def setNullable(value: Boolean): Self = this.set("nullable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNullable: Self = this.set("nullable", js.undefined)
    
    @scala.inline
    def setOneOfVarargs(value: (ReferenceObject | SchemaObject)*): Self = this.set("oneOf", js.Array(value :_*))
    
    @scala.inline
    def setOneOf(value: js.Array[ReferenceObject | SchemaObject]): Self = this.set("oneOf", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOneOf: Self = this.set("oneOf", js.undefined)
    
    @scala.inline
    def setPattern(value: String): Self = this.set("pattern", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePattern: Self = this.set("pattern", js.undefined)
    
    @scala.inline
    def setProperties(value: StringDictionary[ReferenceObject | SchemaObject]): Self = this.set("properties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProperties: Self = this.set("properties", js.undefined)
    
    @scala.inline
    def setReadOnly(value: Boolean): Self = this.set("readOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReadOnly: Self = this.set("readOnly", js.undefined)
    
    @scala.inline
    def setRequiredVarargs(value: String*): Self = this.set("required", js.Array(value :_*))
    
    @scala.inline
    def setRequired(value: js.Array[String]): Self = this.set("required", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequired: Self = this.set("required", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    
    @scala.inline
    def setUniqueItems(value: Boolean): Self = this.set("uniqueItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUniqueItems: Self = this.set("uniqueItems", js.undefined)
    
    @scala.inline
    def setWriteOnly(value: Boolean): Self = this.set("writeOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWriteOnly: Self = this.set("writeOnly", js.undefined)
    
    @scala.inline
    def setXml(value: XMLObject): Self = this.set("xml", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteXml: Self = this.set("xml", js.undefined)
  }
}
