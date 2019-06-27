package typings
package olLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object projMod {
  type ProjectionLike = olLib.projProjectionMod.default | java.lang.String
  type TransformFunction = js.Function3[
    /* p0 */ js.Array[scala.Double], 
    /* p1 */ js.UndefOr[js.Array[scala.Double]], 
    /* p2 */ js.UndefOr[scala.Double], 
    js.Array[scala.Double]
  ]
}
