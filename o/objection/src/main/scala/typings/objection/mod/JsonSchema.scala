package typings.objection.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JsonSchema extends js.Object {
  @JSName("$ref")
  var $ref: js.UndefOr[String] = js.native
  /**
    * It is recommended that the meta-schema is
    * included in the root of any JSON Schema
    */
  @JSName("$schema")
  var $schema: js.UndefOr[JsonSchema] = js.native
  /////////////////////////////////////////////////
  // Array Validation
  /////////////////////////////////////////////////
  var additionalItems: js.UndefOr[Boolean | JsonSchema] = js.native
  var additionalProperties: js.UndefOr[Boolean | JsonSchema] = js.native
  /////////////////////////////////////////////////
  // Combining Schemas
  /////////////////////////////////////////////////
  var allOf: js.UndefOr[js.Array[JsonSchema]] = js.native
  var anyOf: js.UndefOr[js.Array[JsonSchema]] = js.native
  /**
    * Default json for the object represented by
    * this schema
    */
  var default: js.UndefOr[js.Any] = js.native
  /**
    * Holds simple JSON Schema definitions for
    * referencing from elsewhere.
    */
  var definitions: js.UndefOr[StringDictionary[JsonSchema]] = js.native
  /**
    * If the key is present as a property then the
    * string of properties must also be present.
    * If the value is a JSON Schema then it must
    * also be valid for the object if the key is
    * present.
    */
  var dependencies: js.UndefOr[StringDictionary[JsonSchema | js.Array[String]]] = js.native
  /**
    * Schema description
    */
  var description: js.UndefOr[String] = js.native
  /////////////////////////////////////////////////
  // Generic
  /////////////////////////////////////////////////
  /**
    * Enumerates the values that this schema can be
    * e.g.
    * {"type": "string",
    *  "enum": ["red", "green", "blue"]}
    */
  var enum: js.UndefOr[js.Array[_]] = js.native
  /**
    * If true maximum must be > value, >= otherwise
    */
  var exclusiveMaximum: js.UndefOr[Boolean] = js.native
  /**
    * If true minimum must be < value, <= otherwise
    */
  var exclusiveMinimum: js.UndefOr[Boolean] = js.native
  /**
    * fallback raw string for custom formats,
    * or formats that aren't in the standard yet
    */
  var format: js.UndefOr[JsonSchemaFormatType | String] = js.native
  /////////////////////////////////////////////////
  // Schema Metadata
  /////////////////////////////////////////////////
  /**
    * This is important because it tells refs where
    * the root of the document is located
    */
  var id: js.UndefOr[String] = js.native
  var items: js.UndefOr[JsonSchema | js.Array[JsonSchema]] = js.native
  var maxItems: js.UndefOr[Double] = js.native
  /////////////////////////////////////////////////
  // String Validation
  /////////////////////////////////////////////////
  var maxLength: js.UndefOr[Double] = js.native
  /////////////////////////////////////////////////
  // Object Validation
  /////////////////////////////////////////////////
  var maxProperties: js.UndefOr[Double] = js.native
  var maximum: js.UndefOr[Double] = js.native
  var minItems: js.UndefOr[Double] = js.native
  var minLength: js.UndefOr[Double] = js.native
  var minProperties: js.UndefOr[Double] = js.native
  var minimum: js.UndefOr[Double] = js.native
  /////////////////////////////////////////////////
  // Number Validation
  /////////////////////////////////////////////////
  /**
    * The value must be a multiple of the number
    * (e.g. 10 is a multiple of 5)
    */
  var multipleOf: js.UndefOr[Double] = js.native
  /**
    * The entity being validated must not match this schema
    */
  var not: js.UndefOr[JsonSchema] = js.native
  var oneOf: js.UndefOr[js.Array[JsonSchema]] = js.native
  /**
    * This is a regex string that the value must
    * conform to
    */
  var pattern: js.UndefOr[String] = js.native
  /**
    * The key of this object is a regex for which
    * properties the schema applies to
    */
  var patternProperties: js.UndefOr[StringDictionary[JsonSchema]] = js.native
  /**
    * The keys that can exist on the object with the
    * json schema that should validate their value
    */
  var properties: js.UndefOr[StringDictionary[JsonSchema]] = js.native
  var required: js.UndefOr[js.Array[String]] = js.native
  /**
    * Title of the schema
    */
  var title: js.UndefOr[String] = js.native
  /**
    * The basic type of this schema, can be one of
    * [string, number, object, array, boolean, null]
    * or an array of the acceptable types
    */
  var `type`: js.UndefOr[String | js.Array[String]] = js.native
  var uniqueItems: js.UndefOr[Boolean] = js.native
}

