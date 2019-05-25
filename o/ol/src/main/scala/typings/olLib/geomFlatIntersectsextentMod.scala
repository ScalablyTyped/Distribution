package typings
package olLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/geom/flat/intersectsextent", JSImport.Namespace)
@js.native
object geomFlatIntersectsextentMod extends js.Object {
  def intersectsLineString(
    flatCoordinates: js.Array[scala.Double],
    offset: scala.Double,
    end: scala.Double,
    stride: scala.Double,
    extent: olLib.extentMod.Extent
  ): scala.Boolean = js.native
  def intersectsLineStringArray(
    flatCoordinates: js.Array[scala.Double],
    offset: scala.Double,
    ends: js.Array[scala.Double],
    stride: scala.Double,
    extent: olLib.extentMod.Extent
  ): scala.Boolean = js.native
  def intersectsLinearRing(
    flatCoordinates: js.Array[scala.Double],
    offset: scala.Double,
    end: scala.Double,
    stride: scala.Double,
    extent: olLib.extentMod.Extent
  ): scala.Boolean = js.native
  def intersectsLinearRingArray(
    flatCoordinates: js.Array[scala.Double],
    offset: scala.Double,
    ends: js.Array[scala.Double],
    stride: scala.Double,
    extent: olLib.extentMod.Extent
  ): scala.Boolean = js.native
  def intersectsLinearRingMultiArray(
    flatCoordinates: js.Array[scala.Double],
    offset: scala.Double,
    endss: js.Array[js.Array[scala.Double]],
    stride: scala.Double,
    extent: olLib.extentMod.Extent
  ): scala.Boolean = js.native
}

