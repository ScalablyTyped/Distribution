package typings
package olLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/geom/flat/contains", JSImport.Namespace)
@js.native
object geomFlatContainsMod extends js.Object {
  def linearRingContainsExtent(
    flatCoordinates: js.Array[scala.Double],
    offset: scala.Double,
    end: scala.Double,
    stride: scala.Double,
    extent: olLib.extentMod.Extent
  ): scala.Boolean = js.native
  def linearRingContainsXY(
    flatCoordinates: js.Array[scala.Double],
    offset: scala.Double,
    end: scala.Double,
    stride: scala.Double,
    x: scala.Double,
    y: scala.Double
  ): scala.Boolean = js.native
  def linearRingsContainsXY(
    flatCoordinates: js.Array[scala.Double],
    offset: scala.Double,
    ends: js.Array[scala.Double],
    stride: scala.Double,
    x: scala.Double,
    y: scala.Double
  ): scala.Boolean = js.native
  def linearRingssContainsXY(
    flatCoordinates: js.Array[scala.Double],
    offset: scala.Double,
    endss: js.Array[js.Array[scala.Double]],
    stride: scala.Double,
    x: scala.Double,
    y: scala.Double
  ): scala.Boolean = js.native
}

