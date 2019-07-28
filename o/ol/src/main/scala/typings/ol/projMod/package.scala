package typings.ol

import typings.ol.projProjectionMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object projMod {
  type ProjectionLike = default | String
  type TransformFunction = js.Function3[
    /* p0 */ js.Array[Double], 
    /* p1 */ js.UndefOr[js.Array[Double]], 
    /* p2 */ js.UndefOr[Double], 
    js.Array[Double]
  ]
}
