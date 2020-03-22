package typings.objection.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JSONSchema extends js.Object {
  @JSName("$comment")
  var $comment: js.UndefOr[String] = js.native
  @JSName("$id")
  var $id: js.UndefOr[String] = js.native
  @JSName("$ref")
  var $ref: js.UndefOr[String] = js.native
  @JSName("$schema")
  var $schema: js.UndefOr[JSONSchemaVersion] = js.native
  var additionalItems: js.UndefOr[JSONSchemaDefinition] = js.native
  var additionalProperties: js.UndefOr[JSONSchemaDefinition] = js.native
  /**
    * @see https://tools.ietf.org/html/draft-handrews-json-schema-validation-01#section-6.7
    */
  var allOf: js.UndefOr[js.Array[JSONSchemaDefinition]] = js.native
  var anyOf: js.UndefOr[js.Array[JSONSchemaDefinition]] = js.native
  var const: js.UndefOr[JSONSchemaType] = js.native
  var contains: js.UndefOr[JSONSchema] = js.native
  var contentEncoding: js.UndefOr[String] = js.native
  /**
    * @see https://tools.ietf.org/html/draft-handrews-json-schema-validation-01#section-8
    */
  var contentMediaType: js.UndefOr[String] = js.native
  var default: js.UndefOr[JSONSchemaType] = js.native
  /**
    * @see https://tools.ietf.org/html/draft-handrews-json-schema-validation-01#section-9
    */
  var definitions: js.UndefOr[StringDictionary[JSONSchemaDefinition]] = js.native
  var dependencies: js.UndefOr[StringDictionary[JSONSchemaDefinition | js.Array[String]]] = js.native
  var description: js.UndefOr[String] = js.native
  var `else`: js.UndefOr[JSONSchemaDefinition] = js.native
  var enum: js.UndefOr[js.Array[JSONSchemaType]] = js.native
  var examples: js.UndefOr[JSONSchemaType] = js.native
  var exclusiveMaximum: js.UndefOr[Double] = js.native
  var exclusiveMinimum: js.UndefOr[Double] = js.native
  /**
    * @see https://tools.ietf.org/html/draft-handrews-json-schema-validation-01#section-7
    */
  var format: js.UndefOr[String] = js.native
  /**
    * @see https://tools.ietf.org/html/draft-handrews-json-schema-validation-01#section-6.6
    */
  var `if`: js.UndefOr[JSONSchemaDefinition] = js.native
  /**
    * @see https://tools.ietf.org/html/draft-handrews-json-schema-validation-01#section-6.4
    */
  var items: js.UndefOr[JSONSchemaDefinition | js.Array[JSONSchemaDefinition]] = js.native
  var maxItems: js.UndefOr[Double] = js.native
  /**
    * @see https://tools.ietf.org/html/draft-handrews-json-schema-validation-01#section-6.3
    */
  var maxLength: js.UndefOr[Double] = js.native
  /**
    * @see https://tools.ietf.org/html/draft-handrews-json-schema-validation-01#section-6.5
    */
  var maxProperties: js.UndefOr[Double] = js.native
  var maximum: js.UndefOr[Double] = js.native
  var minItems: js.UndefOr[Double] = js.native
  var minLength: js.UndefOr[Double] = js.native
  var minProperties: js.UndefOr[Double] = js.native
  var minimum: js.UndefOr[Double] = js.native
  /**
    * @see https://tools.ietf.org/html/draft-handrews-json-schema-validation-01#section-6.2
    */
  var multipleOf: js.UndefOr[Double] = js.native
  var not: js.UndefOr[JSONSchemaDefinition] = js.native
  var oneOf: js.UndefOr[js.Array[JSONSchemaDefinition]] = js.native
  var pattern: js.UndefOr[String] = js.native
  var patternProperties: js.UndefOr[StringDictionary[JSONSchemaDefinition]] = js.native
  var properties: js.UndefOr[StringDictionary[JSONSchemaDefinition]] = js.native
  var propertyNames: js.UndefOr[JSONSchemaDefinition] = js.native
  var readOnly: js.UndefOr[Boolean] = js.native
  var required: js.UndefOr[js.Array[String]] = js.native
  var `then`: js.UndefOr[JSONSchemaDefinition] = js.native
  /**
    * @see https://tools.ietf.org/html/draft-handrews-json-schema-validation-01#section-10
    */
  var title: js.UndefOr[String] = js.native
  /**
    * @see https://tools.ietf.org/html/draft-handrews-json-schema-validation-01#section-6.1
    */
  var `type`: js.UndefOr[JSONSchemaTypeName | js.Array[JSONSchemaTypeName]] = js.native
  var uniqueItems: js.UndefOr[Boolean] = js.native
  var writeOnly: js.UndefOr[Boolean] = js.native
}

