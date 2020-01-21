package typings.phosphorCoreutils

import typings.phosphorCoreutils.jsonMod.JSONValue
import typings.phosphorCoreutils.jsonMod.ReadonlyJSONArray
import typings.phosphorCoreutils.jsonMod.ReadonlyJSONObject
import typings.phosphorCoreutils.jsonMod.ReadonlyJSONValue
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@phosphor/coreutils", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class MimeData ()
    extends typings.phosphorCoreutils.mimeMod.MimeData
  
  @js.native
  /**
    * Construct a new promise delegate.
    */
  class PromiseDelegate[T] ()
    extends typings.phosphorCoreutils.promiseMod.PromiseDelegate[T]
  
  @js.native
  class Token[T] protected ()
    extends typings.phosphorCoreutils.tokenMod.Token[T] {
    /**
      * Construct a new token.
      *
      * @param name - A human readable name for the token.
      */
    def this(name: String) = this()
  }
  
  @js.native
  object JSONExt extends js.Object {
    /**
      * A shared frozen empty JSONArray
      */
    val emptyArray: ReadonlyJSONArray = js.native
    /**
      * A shared frozen empty JSONObject
      */
    val emptyObject: ReadonlyJSONObject = js.native
    def deepCopy(): Null = js.native
    def deepCopy(value: String): String = js.native
    def deepCopy(value: js.Array[ReadonlyJSONValue]): js.Array[ReadonlyJSONValue] = js.native
    /**
      * Create a deep copy of a JSON value.
      *
      * @param value - The JSON value to copy.
      *
      * @returns A deep copy of the given JSON value.
      */
    def deepCopy(value: Boolean): Boolean = js.native
    def deepCopy(value: Double): Double = js.native
    def deepCopy(value: ReadonlyJSONObject): ReadonlyJSONObject = js.native
    /**
      * Compare two JSON values for deep equality.
      *
      * @param first - The first JSON value of interest.
      *
      * @param second - The second JSON value of interest.
      *
      * @returns `true` if the values are equivalent, `false` otherwise.
      */
    def deepEqual(first: ReadonlyJSONValue, second: ReadonlyJSONValue): Boolean = js.native
    /**
      * Test whether a JSON value is an array.
      *
      * @param value - The JSON value of interest.
      *
      * @returns `true` if the value is a an array, `false` otherwise.
      */
    def isArray(value: JSONValue | ReadonlyJSONValue): /* is @phosphor/coreutils.@phosphor/coreutils/lib/json.JSONArray */ Boolean = js.native
    /**
      * Test whether a JSON value is an object.
      *
      * @param value - The JSON value of interest.
      *
      * @returns `true` if the value is a an object, `false` otherwise.
      */
    def isObject(value: JSONValue | ReadonlyJSONValue): /* is @phosphor/coreutils.@phosphor/coreutils/lib/json.JSONObject */ Boolean = js.native
    /**
      * Test whether a JSON value is a primitive.
      *
      * @param value - The JSON value of interest.
      *
      * @returns `true` if the value is a primitive,`false` otherwise.
      */
    def isPrimitive(value: ReadonlyJSONValue): /* is @phosphor/coreutils.@phosphor/coreutils/lib/json.JSONPrimitive */ Boolean = js.native
  }
  
  @js.native
  object Random extends js.Object {
    /**
      * A function which generates random bytes.
      *
      * @param buffer - The `Uint8Array` to fill with random bytes.
      *
      * #### Notes
      * A cryptographically strong random number generator will be used if
      * available. Otherwise, `Math.random` will be used as a fallback for
      * randomness.
      *
      * The following RNGs are supported, listed in order of precedence:
      *   - `window.crypto.getRandomValues`
      *   - `window.msCrypto.getRandomValues`
      *   - `require('crypto').randomFillSync
      *   - `require('crypto').randomBytes
      *   - `Math.random`
      */
    def getRandomValues(buffer: Uint8Array): Unit = js.native
  }
  
  @js.native
  object UUID extends js.Object {
    /**
      * A function which generates UUID v4 identifiers.
      *
      * @returns A new UUID v4 string.
      *
      * #### Notes
      * This implementation complies with RFC 4122.
      *
      * This uses `Random.getRandomValues()` for random bytes, which in
      * turn will use the underlying `crypto` module of the platform if
      * it is available. The fallback for randomness is `Math.random`.
      */
    def uuid4(): String = js.native
  }
  
}

