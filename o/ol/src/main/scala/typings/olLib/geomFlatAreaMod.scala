package typings
package olLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/geom/flat/area", JSImport.Namespace)
@js.native
object geomFlatAreaMod extends js.Object {
  def linearRing(
    flatCoordinates: js.Array[scala.Double],
    offset: scala.Double,
    end: scala.Double,
    stride: scala.Double
  ): scala.Double = js.native
  def linearRings(
    flatCoordinates: js.Array[scala.Double],
    offset: scala.Double,
    ends: js.Array[scala.Double],
    stride: scala.Double
  ): scala.Double = js.native
  def linearRingss(
    flatCoordinates: js.Array[scala.Double],
    offset: scala.Double,
    endss: js.Array[js.Array[scala.Double]],
    stride: scala.Double
  ): scala.Double = js.native
}

