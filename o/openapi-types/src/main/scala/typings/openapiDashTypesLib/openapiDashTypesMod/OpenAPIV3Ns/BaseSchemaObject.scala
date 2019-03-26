package typings
package openapiDashTypesLib.openapiDashTypesMod.OpenAPIV3Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseSchemaObject extends js.Object {
  var additionalProperties: js.UndefOr[scala.Boolean | ReferenceObject | SchemaObject] = js.undefined
  var allOf: js.UndefOr[js.Array[ReferenceObject | SchemaObject]] = js.undefined
  var anyOf: js.UndefOr[js.Array[ReferenceObject | SchemaObject]] = js.undefined
  var default: js.UndefOr[js.Any] = js.undefined
  var deprecated: js.UndefOr[scala.Boolean] = js.undefined
  var description: js.UndefOr[java.lang.String] = js.undefined
  var discriminator: js.UndefOr[DiscriminatorObject] = js.undefined
  var enum: js.UndefOr[js.Array[_]] = js.undefined
  var example: js.UndefOr[js.Any] = js.undefined
  var exclusiveMaximum: js.UndefOr[scala.Boolean] = js.undefined
  var exclusiveMinimum: js.UndefOr[scala.Boolean] = js.undefined
  var externalDocs: js.UndefOr[ExternalDocumentationObject] = js.undefined
  var format: js.UndefOr[java.lang.String] = js.undefined
  var maxItems: js.UndefOr[scala.Double] = js.undefined
  var maxLength: js.UndefOr[scala.Double] = js.undefined
  var maxProperties: js.UndefOr[scala.Double] = js.undefined
  var maximum: js.UndefOr[scala.Double] = js.undefined
  var minItems: js.UndefOr[scala.Double] = js.undefined
  var minLength: js.UndefOr[scala.Double] = js.undefined
  var minProperties: js.UndefOr[scala.Double] = js.undefined
  var minimum: js.UndefOr[scala.Double] = js.undefined
  var multipleOf: js.UndefOr[scala.Double] = js.undefined
  var not: js.UndefOr[ReferenceObject | SchemaObject] = js.undefined
  var nullable: js.UndefOr[scala.Boolean] = js.undefined
  var oneOf: js.UndefOr[js.Array[ReferenceObject | SchemaObject]] = js.undefined
  var pattern: js.UndefOr[java.lang.String] = js.undefined
  var properties: js.UndefOr[org.scalablytyped.runtime.StringDictionary[ReferenceObject | SchemaObject]] = js.undefined
  var readOnly: js.UndefOr[scala.Boolean] = js.undefined
  var required: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var title: js.UndefOr[java.lang.String] = js.undefined
  var uniqueItems: js.UndefOr[scala.Boolean] = js.undefined
  var writeOnly: js.UndefOr[scala.Boolean] = js.undefined
  var xml: js.UndefOr[XMLObject] = js.undefined
}

object BaseSchemaObject {
  @scala.inline
  def apply(
    additionalProperties: scala.Boolean | ReferenceObject | SchemaObject = null,
    allOf: js.Array[ReferenceObject | SchemaObject] = null,
    anyOf: js.Array[ReferenceObject | SchemaObject] = null,
    default: js.Any = null,
    deprecated: js.UndefOr[scala.Boolean] = js.undefined,
    description: java.lang.String = null,
    discriminator: DiscriminatorObject = null,
    enum: js.Array[_] = null,
    example: js.Any = null,
    exclusiveMaximum: js.UndefOr[scala.Boolean] = js.undefined,
    exclusiveMinimum: js.UndefOr[scala.Boolean] = js.undefined,
    externalDocs: ExternalDocumentationObject = null,
    format: java.lang.String = null,
    maxItems: scala.Int | scala.Double = null,
    maxLength: scala.Int | scala.Double = null,
    maxProperties: scala.Int | scala.Double = null,
    maximum: scala.Int | scala.Double = null,
    minItems: scala.Int | scala.Double = null,
    minLength: scala.Int | scala.Double = null,
    minProperties: scala.Int | scala.Double = null,
    minimum: scala.Int | scala.Double = null,
    multipleOf: scala.Int | scala.Double = null,
    not: ReferenceObject | SchemaObject = null,
    nullable: js.UndefOr[scala.Boolean] = js.undefined,
    oneOf: js.Array[ReferenceObject | SchemaObject] = null,
    pattern: java.lang.String = null,
    properties: org.scalablytyped.runtime.StringDictionary[ReferenceObject | SchemaObject] = null,
    readOnly: js.UndefOr[scala.Boolean] = js.undefined,
    required: js.Array[java.lang.String] = null,
    title: java.lang.String = null,
    uniqueItems: js.UndefOr[scala.Boolean] = js.undefined,
    writeOnly: js.UndefOr[scala.Boolean] = js.undefined,
    xml: XMLObject = null
  ): BaseSchemaObject = {
    val __obj = js.Dynamic.literal()
    if (additionalProperties != null) __obj.updateDynamic("additionalProperties")(additionalProperties.asInstanceOf[js.Any])
    if (allOf != null) __obj.updateDynamic("allOf")(allOf)
    if (anyOf != null) __obj.updateDynamic("anyOf")(anyOf)
    if (default != null) __obj.updateDynamic("default")(default)
    if (!js.isUndefined(deprecated)) __obj.updateDynamic("deprecated")(deprecated)
    if (description != null) __obj.updateDynamic("description")(description)
    if (discriminator != null) __obj.updateDynamic("discriminator")(discriminator)
    if (enum != null) __obj.updateDynamic("enum")(enum)
    if (example != null) __obj.updateDynamic("example")(example)
    if (!js.isUndefined(exclusiveMaximum)) __obj.updateDynamic("exclusiveMaximum")(exclusiveMaximum)
    if (!js.isUndefined(exclusiveMinimum)) __obj.updateDynamic("exclusiveMinimum")(exclusiveMinimum)
    if (externalDocs != null) __obj.updateDynamic("externalDocs")(externalDocs)
    if (format != null) __obj.updateDynamic("format")(format)
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
    if (!js.isUndefined(nullable)) __obj.updateDynamic("nullable")(nullable)
    if (oneOf != null) __obj.updateDynamic("oneOf")(oneOf)
    if (pattern != null) __obj.updateDynamic("pattern")(pattern)
    if (properties != null) __obj.updateDynamic("properties")(properties)
    if (!js.isUndefined(readOnly)) __obj.updateDynamic("readOnly")(readOnly)
    if (required != null) __obj.updateDynamic("required")(required)
    if (title != null) __obj.updateDynamic("title")(title)
    if (!js.isUndefined(uniqueItems)) __obj.updateDynamic("uniqueItems")(uniqueItems)
    if (!js.isUndefined(writeOnly)) __obj.updateDynamic("writeOnly")(writeOnly)
    if (xml != null) __obj.updateDynamic("xml")(xml)
    __obj.asInstanceOf[BaseSchemaObject]
  }
}

