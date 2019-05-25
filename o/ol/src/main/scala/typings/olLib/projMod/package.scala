package typings
package olLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object projMod {
  type ProjectionLike = olLib.projProjectionMod.default | java.lang.String
  type TransformFunction = js.Function3[
    /* param0 */ js.Array[scala.Double], 
    /* param1 */ js.Array[scala.Double], 
    /* param2 */ scala.Double, 
    js.Array[scala.Double]
  ]
}
