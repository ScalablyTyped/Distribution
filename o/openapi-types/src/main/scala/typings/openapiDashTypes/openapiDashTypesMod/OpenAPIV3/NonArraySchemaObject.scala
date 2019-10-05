package typings.openapiDashTypes.openapiDashTypesMod.OpenAPIV3

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NonArraySchemaObject
  extends BaseSchemaObject
     with SchemaObject {
  var `type`: NonArraySchemaObjectType
}

object NonArraySchemaObject {
  @scala.inline
  def apply(
    `type`: NonArraySchemaObjectType,
    additionalProperties: Boolean | ReferenceObject | SchemaObject = null,
    allOf: js.Array[ReferenceObject | SchemaObject] = null,
    anyOf: js.Array[ReferenceObject | SchemaObject] = null,
    default: js.Any = null,
    deprecated: js.UndefOr[Boolean] = js.undefined,
    description: String = null,
    discriminator: DiscriminatorObject = null,
    enum: js.Array[_] = null,
    example: js.Any = null,
    exclusiveMaximum: js.UndefOr[Boolean] = js.undefined,
    exclusiveMinimum: js.UndefOr[Boolean] = js.undefined,
    externalDocs: ExternalDocumentationObject = null,
    format: String = null,
    maxItems: Int | Double = null,
    maxLength: Int | Double = null,
    maxProperties: Int | Double = null,
    maximum: Int | Double = null,
    minItems: Int | Double = null,
    minLength: Int | Double = null,
    minProperties: Int | Double = null,
    minimum: Int | Double = null,
    multipleOf: Int | Double = null,
    not: ReferenceObject | SchemaObject = null,
    nullable: js.UndefOr[Boolean] = js.undefined,
    oneOf: js.Array[ReferenceObject | SchemaObject] = null,
    pattern: String = null,
    properties: StringDictionary[ReferenceObject | SchemaObject] = null,
    readOnly: js.UndefOr[Boolean] = js.undefined,
    required: js.Array[String] = null,
    title: String = null,
    uniqueItems: js.UndefOr[Boolean] = js.undefined,
    writeOnly: js.UndefOr[Boolean] = js.undefined,
    xml: XMLObject = null
  ): NonArraySchemaObject = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
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
    __obj.asInstanceOf[NonArraySchemaObject]
  }
}

