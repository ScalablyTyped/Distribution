package typings
package openapiDashSchemasLib.libJsonDashSchemaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JsonSchema extends js.Object {
  @JSName("$schema")
  var $schema: js.UndefOr[java.lang.String] = js.undefined
  var additionalItems: js.UndefOr[scala.Boolean | JsonSchema] = js.undefined
  var additionalProperties: js.UndefOr[scala.Boolean | JsonSchema] = js.undefined
  var allOf: js.UndefOr[js.Array[JsonSchema]] = js.undefined
  var anyOf: js.UndefOr[js.Array[JsonSchema]] = js.undefined
  var definitions: js.UndefOr[org.scalablytyped.runtime.StringDictionary[JsonSchema]] = js.undefined
  var dependencies: js.UndefOr[
    org.scalablytyped.runtime.StringDictionary[JsonSchema | js.Array[java.lang.String]]
  ] = js.undefined
  var description: js.UndefOr[java.lang.String] = js.undefined
  var enum: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var exclusiveMaximum: js.UndefOr[scala.Boolean] = js.undefined
  var exclusiveMinimum: js.UndefOr[scala.Boolean] = js.undefined
  var id: js.UndefOr[java.lang.String] = js.undefined
  var items: js.UndefOr[JsonSchema | js.Array[JsonSchema]] = js.undefined
  var maxItems: js.UndefOr[scala.Double] = js.undefined
  var maxLength: js.UndefOr[scala.Double] = js.undefined
  var maxProperties: js.UndefOr[scala.Double] = js.undefined
  var maximum: js.UndefOr[scala.Double] = js.undefined
  var minItems: js.UndefOr[scala.Double] = js.undefined
  var minLength: js.UndefOr[scala.Double] = js.undefined
  var minProperties: js.UndefOr[scala.Double] = js.undefined
  var minimum: js.UndefOr[scala.Double] = js.undefined
  var multipleOf: js.UndefOr[scala.Double] = js.undefined
  var not: js.UndefOr[JsonSchema] = js.undefined
  var oneOf: js.UndefOr[js.Array[JsonSchema]] = js.undefined
  var pattern: js.UndefOr[java.lang.String] = js.undefined
  var patternProperties: js.UndefOr[org.scalablytyped.runtime.StringDictionary[JsonSchema]] = js.undefined
  var properties: js.UndefOr[org.scalablytyped.runtime.StringDictionary[JsonSchema]] = js.undefined
  var required: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var title: js.UndefOr[java.lang.String] = js.undefined
  var `type`: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  var uniqueItems: js.UndefOr[scala.Boolean] = js.undefined
}

object JsonSchema {
  @scala.inline
  def apply(
    $schema: java.lang.String = null,
    additionalItems: scala.Boolean | JsonSchema = null,
    additionalProperties: scala.Boolean | JsonSchema = null,
    allOf: js.Array[JsonSchema] = null,
    anyOf: js.Array[JsonSchema] = null,
    definitions: org.scalablytyped.runtime.StringDictionary[JsonSchema] = null,
    dependencies: org.scalablytyped.runtime.StringDictionary[JsonSchema | js.Array[java.lang.String]] = null,
    description: java.lang.String = null,
    enum: js.Array[java.lang.String] = null,
    exclusiveMaximum: js.UndefOr[scala.Boolean] = js.undefined,
    exclusiveMinimum: js.UndefOr[scala.Boolean] = js.undefined,
    id: java.lang.String = null,
    items: JsonSchema | js.Array[JsonSchema] = null,
    maxItems: scala.Int | scala.Double = null,
    maxLength: scala.Int | scala.Double = null,
    maxProperties: scala.Int | scala.Double = null,
    maximum: scala.Int | scala.Double = null,
    minItems: scala.Int | scala.Double = null,
    minLength: scala.Int | scala.Double = null,
    minProperties: scala.Int | scala.Double = null,
    minimum: scala.Int | scala.Double = null,
    multipleOf: scala.Int | scala.Double = null,
    not: JsonSchema = null,
    oneOf: js.Array[JsonSchema] = null,
    pattern: java.lang.String = null,
    patternProperties: org.scalablytyped.runtime.StringDictionary[JsonSchema] = null,
    properties: org.scalablytyped.runtime.StringDictionary[JsonSchema] = null,
    required: js.Array[java.lang.String] = null,
    title: java.lang.String = null,
    `type`: java.lang.String | js.Array[java.lang.String] = null,
    uniqueItems: js.UndefOr[scala.Boolean] = js.undefined
  ): JsonSchema = {
    val __obj = js.Dynamic.literal()
    if ($schema != null) __obj.updateDynamic("$schema")($schema)
    if (additionalItems != null) __obj.updateDynamic("additionalItems")(additionalItems.asInstanceOf[js.Any])
    if (additionalProperties != null) __obj.updateDynamic("additionalProperties")(additionalProperties.asInstanceOf[js.Any])
    if (allOf != null) __obj.updateDynamic("allOf")(allOf)
    if (anyOf != null) __obj.updateDynamic("anyOf")(anyOf)
    if (definitions != null) __obj.updateDynamic("definitions")(definitions)
    if (dependencies != null) __obj.updateDynamic("dependencies")(dependencies)
    if (description != null) __obj.updateDynamic("description")(description)
    if (enum != null) __obj.updateDynamic("enum")(enum)
    if (!js.isUndefined(exclusiveMaximum)) __obj.updateDynamic("exclusiveMaximum")(exclusiveMaximum)
    if (!js.isUndefined(exclusiveMinimum)) __obj.updateDynamic("exclusiveMinimum")(exclusiveMinimum)
    if (id != null) __obj.updateDynamic("id")(id)
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
    if (not != null) __obj.updateDynamic("not")(not)
    if (oneOf != null) __obj.updateDynamic("oneOf")(oneOf)
    if (pattern != null) __obj.updateDynamic("pattern")(pattern)
    if (patternProperties != null) __obj.updateDynamic("patternProperties")(patternProperties)
    if (properties != null) __obj.updateDynamic("properties")(properties)
    if (required != null) __obj.updateDynamic("required")(required)
    if (title != null) __obj.updateDynamic("title")(title)
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(uniqueItems)) __obj.updateDynamic("uniqueItems")(uniqueItems)
    __obj.asInstanceOf[JsonSchema]
  }
}

