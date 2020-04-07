package typings.openapiTypes.mod.OpenAPIV2

import org.scalablytyped.runtime.StringDictionary
import typings.openapiTypes.mod.IJsonSchema
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.openapiTypes.mod.OpenAPIV2.SchemaObject
  - typings.openapiTypes.mod.OpenAPIV2.ReferenceObject
*/
trait Schema extends js.Object

object Schema {
  @scala.inline
  def SchemaObject(
    $schema: String = null,
    StringDictionary: /* index */ StringDictionary[js.Any] = null,
    additionalItems: Boolean | IJsonSchema = null,
    additionalProperties: Boolean | IJsonSchema = null,
    allOf: js.Array[IJsonSchema] = null,
    anyOf: js.Array[IJsonSchema] = null,
    default: js.Any = null,
    definitions: StringDictionary[IJsonSchema] = null,
    dependencies: StringDictionary[IJsonSchema | js.Array[String]] = null,
    description: String = null,
    discriminator: String = null,
    enum: js.Array[_] = null,
    example: js.Any = null,
    exclusiveMaximum: js.UndefOr[Boolean] = js.undefined,
    exclusiveMinimum: js.UndefOr[Boolean] = js.undefined,
    externalDocs: ExternalDocumentationObject = null,
    id: String = null,
    items: ItemsObject = null,
    maxItems: Int | Double = null,
    maxLength: Int | Double = null,
    maxProperties: Int | Double = null,
    maximum: Int | Double = null,
    minItems: Int | Double = null,
    minLength: Int | Double = null,
    minProperties: Int | Double = null,
    minimum: Int | Double = null,
    multipleOf: Int | Double = null,
    not: IJsonSchema = null,
    oneOf: js.Array[IJsonSchema] = null,
    pattern: String = null,
    patternProperties: StringDictionary[IJsonSchema] = null,
    properties: StringDictionary[typings.openapiTypes.mod.OpenAPIV2.SchemaObject] = null,
    readOnly: js.UndefOr[Boolean] = js.undefined,
    required: js.Array[String] = null,
    title: String = null,
    `type`: String | js.Array[String] = null,
    uniqueItems: js.UndefOr[Boolean] = js.undefined,
    xml: XMLObject = null
  ): Schema = {
    val __obj = js.Dynamic.literal()
    if ($schema != null) __obj.updateDynamic("$schema")($schema.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (additionalItems != null) __obj.updateDynamic("additionalItems")(additionalItems.asInstanceOf[js.Any])
    if (additionalProperties != null) __obj.updateDynamic("additionalProperties")(additionalProperties.asInstanceOf[js.Any])
    if (allOf != null) __obj.updateDynamic("allOf")(allOf.asInstanceOf[js.Any])
    if (anyOf != null) __obj.updateDynamic("anyOf")(anyOf.asInstanceOf[js.Any])
    if (default != null) __obj.updateDynamic("default")(default.asInstanceOf[js.Any])
    if (definitions != null) __obj.updateDynamic("definitions")(definitions.asInstanceOf[js.Any])
    if (dependencies != null) __obj.updateDynamic("dependencies")(dependencies.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (discriminator != null) __obj.updateDynamic("discriminator")(discriminator.asInstanceOf[js.Any])
    if (enum != null) __obj.updateDynamic("enum")(enum.asInstanceOf[js.Any])
    if (example != null) __obj.updateDynamic("example")(example.asInstanceOf[js.Any])
    if (!js.isUndefined(exclusiveMaximum)) __obj.updateDynamic("exclusiveMaximum")(exclusiveMaximum.asInstanceOf[js.Any])
    if (!js.isUndefined(exclusiveMinimum)) __obj.updateDynamic("exclusiveMinimum")(exclusiveMinimum.asInstanceOf[js.Any])
    if (externalDocs != null) __obj.updateDynamic("externalDocs")(externalDocs.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (maxItems != null) __obj.updateDynamic("maxItems")(maxItems.asInstanceOf[js.Any])
    if (maxLength != null) __obj.updateDynamic("maxLength")(maxLength.asInstanceOf[js.Any])
    if (maxProperties != null) __obj.updateDynamic("maxProperties")(maxProperties.asInstanceOf[js.Any])
    if (maximum != null) __obj.updateDynamic("maximum")(maximum.asInstanceOf[js.Any])
    if (minItems != null) __obj.updateDynamic("minItems")(minItems.asInstanceOf[js.Any])
    if (minLength != null) __obj.updateDynamic("minLength")(minLength.asInstanceOf[js.Any])
    if (minProperties != null) __obj.updateDynamic("minProperties")(minProperties.asInstanceOf[js.Any])
    if (minimum != null) __obj.updateDynamic("minimum")(minimum.asInstanceOf[js.Any])
    if (multipleOf != null) __obj.updateDynamic("multipleOf")(multipleOf.asInstanceOf[js.Any])
    if (not != null) __obj.updateDynamic("not")(not.asInstanceOf[js.Any])
    if (oneOf != null) __obj.updateDynamic("oneOf")(oneOf.asInstanceOf[js.Any])
    if (pattern != null) __obj.updateDynamic("pattern")(pattern.asInstanceOf[js.Any])
    if (patternProperties != null) __obj.updateDynamic("patternProperties")(patternProperties.asInstanceOf[js.Any])
    if (properties != null) __obj.updateDynamic("properties")(properties.asInstanceOf[js.Any])
    if (!js.isUndefined(readOnly)) __obj.updateDynamic("readOnly")(readOnly.asInstanceOf[js.Any])
    if (required != null) __obj.updateDynamic("required")(required.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(uniqueItems)) __obj.updateDynamic("uniqueItems")(uniqueItems.asInstanceOf[js.Any])
    if (xml != null) __obj.updateDynamic("xml")(xml.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema]
  }
  @scala.inline
  def ReferenceObject($ref: String): Schema = {
    val __obj = js.Dynamic.literal($ref = $ref.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Schema]
  }
}

