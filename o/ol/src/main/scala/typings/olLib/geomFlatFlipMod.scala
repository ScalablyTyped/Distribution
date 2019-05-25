package typings
package olLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/geom/flat/flip", JSImport.Namespace)
@js.native
object geomFlatFlipMod extends js.Object {
  def flipXY(
    flatCoordinates: js.Array[scala.Double],
    offset: scala.Double,
    end: scala.Double,
    stride: scala.Double
  ): js.Array[scala.Double] = js.native
  def flipXY(
    flatCoordinates: js.Array[scala.Double],
    offset: scala.Double,
    end: scala.Double,
    stride: scala.Double,
    opt_dest: js.Array[scala.Double]
  ): js.Array[scala.Double] = js.native
  def flipXY(
    flatCoordinates: js.Array[scala.Double],
    offset: scala.Double,
    end: scala.Double,
    stride: scala.Double,
    opt_dest: js.Array[scala.Double],
    opt_destOffset: scala.Double
  ): js.Array[scala.Double] = js.native
}

