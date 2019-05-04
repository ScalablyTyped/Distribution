package typings
package atPhosphorCoreutilsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libJsonMod {
  type JSONPrimitive = scala.Boolean | scala.Double | java.lang.String | scala.Null
  /* Rewritten from type alias, can be one of: 
    - JSONPrimitive
    - JSONObject
    - JSONArray
  */
  type JSONValue = _JSONValue | JSONPrimitive
  /* Rewritten from type alias, can be one of: 
    - JSONPrimitive
    - ReadonlyJSONObject
    - ReadonlyJSONArray
  */
  type ReadonlyJSONValue = _ReadonlyJSONValue | JSONPrimitive
}
