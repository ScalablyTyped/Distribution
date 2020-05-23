package typings.objection.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JSONSchema extends js.Object {
  @JSName("$comment")
  var $comment: js.UndefOr[String] = js.undefined
  @JSName("$id")
  var $id: js.UndefOr[String] = js.undefined
  @JSName("$ref")
  var $ref: js.UndefOr[String] = js.undefined
  @JSName("$schema")
  var $schema: js.UndefOr[JSONSchemaVersion] = js.undefined
  var additionalItems: js.UndefOr[JSONSchemaDefinition] = js.undefined
  var additionalProperties: js.UndefOr[JSONSchemaDefinition] = js.undefined
  /**
    * @see https://tools.ietf.org/html/draft-handrews-json-schema-validation-01#section-6.7
    */
  var allOf: js.UndefOr[js.Array[JSONSchemaDefinition]] = js.undefined
  var anyOf: js.UndefOr[js.Array[JSONSchemaDefinition]] = js.undefined
  var const: js.UndefOr[JSONSchemaType] = js.undefined
  var contains: js.UndefOr[JSONSchema] = js.undefined
  var contentEncoding: js.UndefOr[String] = js.undefined
  /**
    * @see https://tools.ietf.org/html/draft-handrews-json-schema-validation-01#section-8
    */
  var contentMediaType: js.UndefOr[String] = js.undefined
  var default: js.UndefOr[JSONSchemaType] = js.undefined
  /**
    * @see https://tools.ietf.org/html/draft-handrews-json-schema-validation-01#section-9
    */
  var definitions: js.UndefOr[StringDictionary[JSONSchemaDefinition]] = js.undefined
  var dependencies: js.UndefOr[StringDictionary[JSONSchemaDefinition | js.Array[String]]] = js.undefined
  var description: js.UndefOr[String] = js.undefined
  var `else`: js.UndefOr[JSONSchemaDefinition] = js.undefined
  var enum: js.UndefOr[js.Array[JSONSchemaType]] = js.undefined
  var examples: js.UndefOr[JSONSchemaType] = js.undefined
  var exclusiveMaximum: js.UndefOr[Double] = js.undefined
  var exclusiveMinimum: js.UndefOr[Double] = js.undefined
  /**
    * @see https://tools.ietf.org/html/draft-handrews-json-schema-validation-01#section-7
    */
  var format: js.UndefOr[String] = js.undefined
  /**
    * @see https://tools.ietf.org/html/draft-handrews-json-schema-validation-01#section-6.6
    */
  var `if`: js.UndefOr[JSONSchemaDefinition] = js.undefined
  /**
    * @see https://tools.ietf.org/html/draft-handrews-json-schema-validation-01#section-6.4
    */
  var items: js.UndefOr[JSONSchemaDefinition | js.Array[JSONSchemaDefinition]] = js.undefined
  var maxItems: js.UndefOr[Double] = js.undefined
  /**
    * @see https://tools.ietf.org/html/draft-handrews-json-schema-validation-01#section-6.3
    */
  var maxLength: js.UndefOr[Double] = js.undefined
  /**
    * @see https://tools.ietf.org/html/draft-handrews-json-schema-validation-01#section-6.5
    */
  var maxProperties: js.UndefOr[Double] = js.undefined
  var maximum: js.UndefOr[Double] = js.undefined
  var minItems: js.UndefOr[Double] = js.undefined
  var minLength: js.UndefOr[Double] = js.undefined
  var minProperties: js.UndefOr[Double] = js.undefined
  var minimum: js.UndefOr[Double] = js.undefined
  /**
    * @see https://tools.ietf.org/html/draft-handrews-json-schema-validation-01#section-6.2
    */
  var multipleOf: js.UndefOr[Double] = js.undefined
  var not: js.UndefOr[JSONSchemaDefinition] = js.undefined
  var oneOf: js.UndefOr[js.Array[JSONSchemaDefinition]] = js.undefined
  var pattern: js.UndefOr[String] = js.undefined
  var patternProperties: js.UndefOr[StringDictionary[JSONSchemaDefinition]] = js.undefined
  var properties: js.UndefOr[StringDictionary[JSONSchemaDefinition]] = js.undefined
  var propertyNames: js.UndefOr[JSONSchemaDefinition] = js.undefined
  var readOnly: js.UndefOr[Boolean] = js.undefined
  var required: js.UndefOr[js.Array[String]] = js.undefined
  var `then`: js.UndefOr[JSONSchemaDefinition] = js.undefined
  /**
    * @see https://tools.ietf.org/html/draft-handrews-json-schema-validation-01#section-10
    */
  var title: js.UndefOr[String] = js.undefined
  /**
    * @see https://tools.ietf.org/html/draft-handrews-json-schema-validation-01#section-6.1
    */
  var `type`: js.UndefOr[JSONSchemaTypeName | js.Array[JSONSchemaTypeName]] = js.undefined
  var uniqueItems: js.UndefOr[Boolean] = js.undefined
  var writeOnly: js.UndefOr[Boolean] = js.undefined
}

object JSONSchema {
  @scala.inline
  def apply(
    $comment: String = null,
    $id: String = null,
    $ref: String = null,
    $schema: JSONSchemaVersion = null,
    additionalItems: JSONSchemaDefinition = null,
    additionalProperties: JSONSchemaDefinition = null,
    allOf: js.Array[JSONSchemaDefinition] = null,
    anyOf: js.Array[JSONSchemaDefinition] = null,
    const: js.UndefOr[Null | JSONSchemaType] = js.undefined,
    contains: JSONSchema = null,
    contentEncoding: String = null,
    contentMediaType: String = null,
    default: js.UndefOr[Null | JSONSchemaType] = js.undefined,
    definitions: StringDictionary[JSONSchemaDefinition] = null,
    dependencies: StringDictionary[JSONSchemaDefinition | js.Array[String]] = null,
    description: String = null,
    `else`: JSONSchemaDefinition = null,
    enum: js.Array[JSONSchemaType] = null,
    examples: js.UndefOr[Null | JSONSchemaType] = js.undefined,
    exclusiveMaximum: js.UndefOr[Double] = js.undefined,
    exclusiveMinimum: js.UndefOr[Double] = js.undefined,
    format: String = null,
    `if`: JSONSchemaDefinition = null,
    items: JSONSchemaDefinition | js.Array[JSONSchemaDefinition] = null,
    maxItems: js.UndefOr[Double] = js.undefined,
    maxLength: js.UndefOr[Double] = js.undefined,
    maxProperties: js.UndefOr[Double] = js.undefined,
    maximum: js.UndefOr[Double] = js.undefined,
    minItems: js.UndefOr[Double] = js.undefined,
    minLength: js.UndefOr[Double] = js.undefined,
    minProperties: js.UndefOr[Double] = js.undefined,
    minimum: js.UndefOr[Double] = js.undefined,
    multipleOf: js.UndefOr[Double] = js.undefined,
    not: JSONSchemaDefinition = null,
    oneOf: js.Array[JSONSchemaDefinition] = null,
    pattern: String = null,
    patternProperties: StringDictionary[JSONSchemaDefinition] = null,
    properties: StringDictionary[JSONSchemaDefinition] = null,
    propertyNames: JSONSchemaDefinition = null,
    readOnly: js.UndefOr[Boolean] = js.undefined,
    required: js.Array[String] = null,
    `then`: JSONSchemaDefinition = null,
    title: String = null,
    `type`: JSONSchemaTypeName | js.Array[JSONSchemaTypeName] = null,
    uniqueItems: js.UndefOr[Boolean] = js.undefined,
    writeOnly: js.UndefOr[Boolean] = js.undefined
  ): JSONSchema = {
    val __obj = js.Dynamic.literal()
    if ($comment != null) __obj.updateDynamic("$comment")($comment.asInstanceOf[js.Any])
    if ($id != null) __obj.updateDynamic("$id")($id.asInstanceOf[js.Any])
    if ($ref != null) __obj.updateDynamic("$ref")($ref.asInstanceOf[js.Any])
    if ($schema != null) __obj.updateDynamic("$schema")($schema.asInstanceOf[js.Any])
    if (additionalItems != null) __obj.updateDynamic("additionalItems")(additionalItems.asInstanceOf[js.Any])
    if (additionalProperties != null) __obj.updateDynamic("additionalProperties")(additionalProperties.asInstanceOf[js.Any])
    if (allOf != null) __obj.updateDynamic("allOf")(allOf.asInstanceOf[js.Any])
    if (anyOf != null) __obj.updateDynamic("anyOf")(anyOf.asInstanceOf[js.Any])
    if (!js.isUndefined(const)) __obj.updateDynamic("const")(const.asInstanceOf[js.Any])
    if (contains != null) __obj.updateDynamic("contains")(contains.asInstanceOf[js.Any])
    if (contentEncoding != null) __obj.updateDynamic("contentEncoding")(contentEncoding.asInstanceOf[js.Any])
    if (contentMediaType != null) __obj.updateDynamic("contentMediaType")(contentMediaType.asInstanceOf[js.Any])
    if (!js.isUndefined(default)) __obj.updateDynamic("default")(default.asInstanceOf[js.Any])
    if (definitions != null) __obj.updateDynamic("definitions")(definitions.asInstanceOf[js.Any])
    if (dependencies != null) __obj.updateDynamic("dependencies")(dependencies.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (`else` != null) __obj.updateDynamic("else")(`else`.asInstanceOf[js.Any])
    if (enum != null) __obj.updateDynamic("enum")(enum.asInstanceOf[js.Any])
    if (!js.isUndefined(examples)) __obj.updateDynamic("examples")(examples.asInstanceOf[js.Any])
    if (!js.isUndefined(exclusiveMaximum)) __obj.updateDynamic("exclusiveMaximum")(exclusiveMaximum.get.asInstanceOf[js.Any])
    if (!js.isUndefined(exclusiveMinimum)) __obj.updateDynamic("exclusiveMinimum")(exclusiveMinimum.get.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (`if` != null) __obj.updateDynamic("if")(`if`.asInstanceOf[js.Any])
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (!js.isUndefined(maxItems)) __obj.updateDynamic("maxItems")(maxItems.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxLength)) __obj.updateDynamic("maxLength")(maxLength.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxProperties)) __obj.updateDynamic("maxProperties")(maxProperties.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maximum)) __obj.updateDynamic("maximum")(maximum.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minItems)) __obj.updateDynamic("minItems")(minItems.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minLength)) __obj.updateDynamic("minLength")(minLength.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minProperties)) __obj.updateDynamic("minProperties")(minProperties.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minimum)) __obj.updateDynamic("minimum")(minimum.get.asInstanceOf[js.Any])
    if (!js.isUndefined(multipleOf)) __obj.updateDynamic("multipleOf")(multipleOf.get.asInstanceOf[js.Any])
    if (not != null) __obj.updateDynamic("not")(not.asInstanceOf[js.Any])
    if (oneOf != null) __obj.updateDynamic("oneOf")(oneOf.asInstanceOf[js.Any])
    if (pattern != null) __obj.updateDynamic("pattern")(pattern.asInstanceOf[js.Any])
    if (patternProperties != null) __obj.updateDynamic("patternProperties")(patternProperties.asInstanceOf[js.Any])
    if (properties != null) __obj.updateDynamic("properties")(properties.asInstanceOf[js.Any])
    if (propertyNames != null) __obj.updateDynamic("propertyNames")(propertyNames.asInstanceOf[js.Any])
    if (!js.isUndefined(readOnly)) __obj.updateDynamic("readOnly")(readOnly.get.asInstanceOf[js.Any])
    if (required != null) __obj.updateDynamic("required")(required.asInstanceOf[js.Any])
    if (`then` != null) __obj.updateDynamic("then")(`then`.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(uniqueItems)) __obj.updateDynamic("uniqueItems")(uniqueItems.get.asInstanceOf[js.Any])
    if (!js.isUndefined(writeOnly)) __obj.updateDynamic("writeOnly")(writeOnly.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[JSONSchema]
  }
}

