package typings
package natsDashHemeraLib.natsDashHemeraMod.HemeraNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ObjectSchema extends AnySchema {
  /**
           * Defines an all-or-nothing relationship between keys where if one of the peers is present, all of them are required as well.
           * @param peers - the key names of which if one present, all are required. peers can be a single string value,
           * an array of string values, or each peer provided as an argument.
           */
  def and(peers: java.lang.String*): this.type = js.native
  def and(peers: js.Array[java.lang.String]): this.type = js.native
  /**
           * Verifies an assertion where.
           */
  def assert(ref: java.lang.String, schema: SchemaLike): this.type = js.native
  /**
           * Verifies an assertion where.
           */
  def assert(ref: java.lang.String, schema: SchemaLike, message: java.lang.String): this.type = js.native
  /**
           * Verifies an assertion where.
           */
  def assert(ref: Reference, schema: SchemaLike): this.type = js.native
  /**
           * Verifies an assertion where.
           */
  def assert(ref: Reference, schema: SchemaLike, message: java.lang.String): this.type = js.native
  /**
           * Sets the allowed object keys.
           */
  def keys[R](): R = js.native
  /**
           * Sets the allowed object keys.
           */
  def keys[R](schema: R): R = js.native
  /**
           * Specifies the exact number of keys in the object.
           */
  def length(limit: scala.Double): this.type = js.native
  /**
           * Specifies the maximum number of keys in the object.
           */
  def max(limit: scala.Double): this.type = js.native
  /**
           * Specifies the minimum number of keys in the object.
           */
  def min(limit: scala.Double): this.type = js.native
  /**
           * Defines a relationship between keys where not all peers can be present at the same time.
           * @param peers - the key names of which if one present, the others may not all be present.
           * peers can be a single string value, an array of string values, or each peer provided as an argument.
           */
  def nand(peers: java.lang.String*): this.type = js.native
  def nand(peers: js.Array[java.lang.String]): this.type = js.native
  def optionalKeys(children: java.lang.String*): this.type = js.native
  /**
           * Sets the specified children to optional.
           *
           * @param children - can be a single string value, an array of string values, or each child provided as an argument.
           *
           * The behavior is exactly the same as requiredKeys.
           */
  def optionalKeys(children: js.Array[java.lang.String]): this.type = js.native
  /**
           * Defines a relationship between keys where one of the peers is required (and more than one is allowed).
           */
  def or(peers: java.lang.String*): this.type = js.native
  def or(peers: js.Array[java.lang.String]): this.type = js.native
  /**
           * Specify validation rules for unknown keys matching a pattern.
           */
  def pattern(regex: stdLib.RegExp, schema: SchemaLike): this.type = js.native
  /**
           * Renames a key to another name (deletes the renamed key).
           */
  def rename(from: java.lang.String, to: java.lang.String): this.type = js.native
  /**
           * Renames a key to another name (deletes the renamed key).
           */
  def rename(from: java.lang.String, to: java.lang.String, options: RenameOptions): this.type = js.native
  def requiredKeys(children: java.lang.String*): this.type = js.native
  /**
           * Sets the specified children to required.
           *
           * @param children - can be a single string value, an array of string values, or each child provided as an argument.
           *
           *   var schema = Joi.object().keys({ a: { b: Joi.number() }, c: { d: Joi.string() } });
           *   var requiredSchema = schema.requiredKeys('', 'a.b', 'c', 'c.d');
           *
           * Note that in this example '' means the current object, a is not required but b is, as well as c and d.
           */
  def requiredKeys(children: js.Array[java.lang.String]): this.type = js.native
  /**
           * Requires the object to be an instance of a given constructor.
           *
           * @param constructor - the constructor function that the object must be an instance of.
           * @param name - an alternate name to use in validation errors. This is useful when the constructor function does not have a name.
           */
  def `type`(constructor: js.Function0[scala.Unit]): this.type = js.native
  /**
           * Requires the object to be an instance of a given constructor.
           *
           * @param constructor - the constructor function that the object must be an instance of.
           * @param name - an alternate name to use in validation errors. This is useful when the constructor function does not have a name.
           */
  def `type`(constructor: js.Function0[scala.Unit], name: java.lang.String): this.type = js.native
  /**
           * Overrides the handling of unknown keys for the scope of the current object only (does not apply to children).
           */
  def unknown(): this.type = js.native
  /**
           * Overrides the handling of unknown keys for the scope of the current object only (does not apply to children).
           */
  def unknown(allow: scala.Boolean): this.type = js.native
  /**
           * Requires the presence of other keys whenever the specified key is present.
           */
  def `with`(key: java.lang.String, peers: java.lang.String): this.type = js.native
  /**
           * Requires the presence of other keys whenever the specified key is present.
           */
  def `with`(key: java.lang.String, peers: js.Array[java.lang.String]): this.type = js.native
  /**
           * Forbids the presence of other keys whenever the specified is present.
           */
  def without(key: java.lang.String, peers: java.lang.String): this.type = js.native
  /**
           * Forbids the presence of other keys whenever the specified is present.
           */
  def without(key: java.lang.String, peers: js.Array[java.lang.String]): this.type = js.native
  /**
           * Defines an exclusive relationship between a set of keys. one of them is required but not at the same time where:
           */
  def xor(peers: java.lang.String*): this.type = js.native
  def xor(peers: js.Array[java.lang.String]): this.type = js.native
}

