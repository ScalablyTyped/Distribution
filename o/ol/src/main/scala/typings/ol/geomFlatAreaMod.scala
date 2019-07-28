package typings.ol

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/geom/flat/area", JSImport.Namespace)
@js.native
object geomFlatAreaMod extends js.Object {
  def linearRing(flatCoordinates: js.Array[Double], offset: Double, end: Double, stride: Double): Double = js.native
  def linearRings(flatCoordinates: js.Array[Double], offset: Double, ends: js.Array[Double], stride: Double): Double = js.native
  def linearRingss(
    flatCoordinates: js.Array[Double],
    offset: Double,
    endss: js.Array[js.Array[Double]],
    stride: Double
  ): Double = js.native
}

