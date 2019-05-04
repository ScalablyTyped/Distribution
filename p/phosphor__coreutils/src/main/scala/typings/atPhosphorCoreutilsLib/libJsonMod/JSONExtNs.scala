package typings
package atPhosphorCoreutilsLib.libJsonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@phosphor/coreutils/lib/json", "JSONExt")
@js.native
object JSONExtNs extends js.Object {
  /**
    * A shared frozen empty JSONArray
    */
  val emptyArray: atPhosphorCoreutilsLib.libJsonMod.ReadonlyJSONArray = js.native
  /**
    * A shared frozen empty JSONObject
    */
  val emptyObject: atPhosphorCoreutilsLib.libJsonMod.ReadonlyJSONObject = js.native
  def deepCopy(): scala.Null = js.native
  def deepCopy(value: atPhosphorCoreutilsLib.libJsonMod.ReadonlyJSONArray): atPhosphorCoreutilsLib.libJsonMod.ReadonlyJSONArray = js.native
  def deepCopy(value: atPhosphorCoreutilsLib.libJsonMod.ReadonlyJSONObject): atPhosphorCoreutilsLib.libJsonMod.ReadonlyJSONObject = js.native
  def deepCopy(value: java.lang.String): java.lang.String = js.native
  /**
    * Create a deep copy of a JSON value.
    *
    * @param value - The JSON value to copy.
    *
    * @returns A deep copy of the given JSON value.
    */
  def deepCopy(value: scala.Boolean): scala.Boolean = js.native
  def deepCopy(value: scala.Double): scala.Double = js.native
  /**
    * Compare two JSON values for deep equality.
    *
    * @param first - The first JSON value of interest.
    *
    * @param second - The second JSON value of interest.
    *
    * @returns `true` if the values are equivalent, `false` otherwise.
    */
  def deepEqual(
    first: atPhosphorCoreutilsLib.libJsonMod.ReadonlyJSONValue,
    second: atPhosphorCoreutilsLib.libJsonMod.ReadonlyJSONValue
  ): scala.Boolean = js.native
  /**
    * Test whether a JSON value is an array.
    *
    * @param value - The JSON value of interest.
    *
    * @returns `true` if the value is a an array, `false` otherwise.
    */
  def isArray(
    value: atPhosphorCoreutilsLib.libJsonMod.JSONValue | atPhosphorCoreutilsLib.libJsonMod.ReadonlyJSONValue
  ): /* is @phosphor/coreutils.@phosphor/coreutils/lib/json.JSONArray */ scala.Boolean = js.native
  /**
    * Test whether a JSON value is an object.
    *
    * @param value - The JSON value of interest.
    *
    * @returns `true` if the value is a an object, `false` otherwise.
    */
  def isObject(
    value: atPhosphorCoreutilsLib.libJsonMod.JSONValue | atPhosphorCoreutilsLib.libJsonMod.ReadonlyJSONValue
  ): /* is @phosphor/coreutils.@phosphor/coreutils/lib/json.JSONObject */ scala.Boolean = js.native
  /**
    * Test whether a JSON value is a primitive.
    *
    * @param value - The JSON value of interest.
    *
    * @returns `true` if the value is a primitive,`false` otherwise.
    */
  def isPrimitive(value: atPhosphorCoreutilsLib.libJsonMod.ReadonlyJSONValue): /* is @phosphor/coreutils.@phosphor/coreutils/lib/json.JSONPrimitive */ scala.Boolean = js.native
}

