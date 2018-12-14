package typings
package objectionLib.objectionMod.ObjectionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait JsonSchema extends js.Object {
  @JSName("$ref")
  var $ref: js.UndefOr[java.lang.String] = js.undefined
  /**
       * It is recommended that the meta-schema is
       * included in the root of any JSON Schema
       */
  @JSName("$schema")
  var $schema: js.UndefOr[JsonSchema] = js.undefined
  /////////////////////////////////////////////////
  // Array Validation
  /////////////////////////////////////////////////
  var additionalItems: js.UndefOr[scala.Boolean | JsonSchema] = js.undefined
  var additionalProperties: js.UndefOr[scala.Boolean | JsonSchema] = js.undefined
  /////////////////////////////////////////////////
  // Combining Schemas
  /////////////////////////////////////////////////
  var allOf: js.UndefOr[js.Array[JsonSchema]] = js.undefined
  var anyOf: js.UndefOr[js.Array[JsonSchema]] = js.undefined
  /**
       * Default json for the object represented by
       * this schema
       */
  var default: js.UndefOr[js.Any] = js.undefined
  /**
       * Holds simple JSON Schema definitions for
       * referencing from elsewhere.
       */
  var definitions: js.UndefOr[org.scalablytyped.runtime.StringDictionary[JsonSchema]] = js.undefined
  /**
       * If the key is present as a property then the
       * string of properties must also be present.
       * If the value is a JSON Schema then it must
       * also be valid for the object if the key is
       * present.
       */
  var dependencies: js.UndefOr[
    org.scalablytyped.runtime.StringDictionary[JsonSchema | js.Array[java.lang.String]]
  ] = js.undefined
  /**
       * Schema description
       */
  var description: js.UndefOr[java.lang.String] = js.undefined
  /////////////////////////////////////////////////
  // Generic
  /////////////////////////////////////////////////
  /**
       * Enumerates the values that this schema can be
       * e.g.
       * {"type": "string",
       *  "enum": ["red", "green", "blue"]}
       */
  var enum: js.UndefOr[js.Array[_]] = js.undefined
  /**
       * If true maximum must be > value, >= otherwise
       */
  var exclusiveMaximum: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * If true minimum must be < value, <= otherwise
       */
  var exclusiveMinimum: js.UndefOr[scala.Boolean] = js.undefined
  /////////////////////////////////////////////////
  // Schema Metadata
  /////////////////////////////////////////////////
  /**
       * This is important because it tells refs where
       * the root of the document is located
       */
  var id: js.UndefOr[java.lang.String] = js.undefined
  var items: js.UndefOr[JsonSchema | js.Array[JsonSchema]] = js.undefined
  var maxItems: js.UndefOr[scala.Double] = js.undefined
  /////////////////////////////////////////////////
  // String Validation
  /////////////////////////////////////////////////
  var maxLength: js.UndefOr[scala.Double] = js.undefined
  /////////////////////////////////////////////////
  // Object Validation
  /////////////////////////////////////////////////
  var maxProperties: js.UndefOr[scala.Double] = js.undefined
  var maximum: js.UndefOr[scala.Double] = js.undefined
  var minItems: js.UndefOr[scala.Double] = js.undefined
  var minLength: js.UndefOr[scala.Double] = js.undefined
  var minProperties: js.UndefOr[scala.Double] = js.undefined
  var minimum: js.UndefOr[scala.Double] = js.undefined
  /////////////////////////////////////////////////
  // Number Validation
  /////////////////////////////////////////////////
  /**
       * The value must be a multiple of the number
       * (e.g. 10 is a multiple of 5)
       */
  var multipleOf: js.UndefOr[scala.Double] = js.undefined
  /**
       * The entity being validated must not match this schema
       */
  var not: js.UndefOr[JsonSchema] = js.undefined
  var oneOf: js.UndefOr[js.Array[JsonSchema]] = js.undefined
  /**
       * This is a regex string that the value must
       * conform to
       */
  var pattern: js.UndefOr[java.lang.String] = js.undefined
  /**
       * The key of this object is a regex for which
       * properties the schema applies to
       */
  var patternProperties: js.UndefOr[org.scalablytyped.runtime.StringDictionary[JsonSchema]] = js.undefined
  /**
       * The keys that can exist on the object with the
       * json schema that should validate their value
       */
  var properties: js.UndefOr[org.scalablytyped.runtime.StringDictionary[JsonSchema]] = js.undefined
  var required: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
       * Title of the schema
       */
  var title: js.UndefOr[java.lang.String] = js.undefined
  /**
       * The basic type of this schema, can be one of
       * [string, number, object, array, boolean, null]
       * or an array of the acceptable types
       */
  var `type`: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  var uniqueItems: js.UndefOr[scala.Boolean] = js.undefined
}

