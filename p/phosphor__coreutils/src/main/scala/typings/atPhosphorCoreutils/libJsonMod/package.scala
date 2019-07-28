package typings.atPhosphorCoreutils

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libJsonMod {
  type JSONPrimitive = Boolean | Double | String | Null
  /* Rewritten from type alias, can be one of: 
    - typings.atPhosphorCoreutils.libJsonMod.JSONPrimitive
    - typings.atPhosphorCoreutils.libJsonMod.JSONObject
    - typings.atPhosphorCoreutils.libJsonMod.JSONArray
  */
  type JSONValue = _JSONValue | JSONPrimitive
  /* Rewritten from type alias, can be one of: 
    - typings.atPhosphorCoreutils.libJsonMod.JSONPrimitive
    - typings.atPhosphorCoreutils.libJsonMod.ReadonlyJSONObject
    - typings.atPhosphorCoreutils.libJsonMod.ReadonlyJSONArray
  */
  type ReadonlyJSONValue = _ReadonlyJSONValue | JSONPrimitive
}
