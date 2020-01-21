package typings.phosphorCoreutils

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object jsonMod {
  type JSONPrimitive = scala.Boolean | scala.Double | java.lang.String | scala.Null
  /* Rewritten from type alias, can be one of: 
    - typings.phosphorCoreutils.jsonMod.JSONPrimitive
    - typings.phosphorCoreutils.jsonMod.JSONObject
    - typings.phosphorCoreutils.jsonMod.JSONArray
  */
  type JSONValue = typings.phosphorCoreutils.jsonMod._JSONValue | typings.phosphorCoreutils.jsonMod.JSONPrimitive
  /* Rewritten from type alias, can be one of: 
    - typings.phosphorCoreutils.jsonMod.JSONPrimitive
    - typings.phosphorCoreutils.jsonMod.ReadonlyJSONObject
    - typings.phosphorCoreutils.jsonMod.ReadonlyJSONArray
  */
  type ReadonlyJSONValue = typings.phosphorCoreutils.jsonMod._ReadonlyJSONValue | typings.phosphorCoreutils.jsonMod.JSONPrimitive
}
