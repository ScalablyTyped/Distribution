package typings
package olLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/geom/flat/deflate", JSImport.Namespace)
@js.native
object geomFlatDeflateMod extends js.Object {
  def deflateCoordinate(
    flatCoordinates: js.Array[scala.Double],
    offset: scala.Double,
    coordinate: olLib.coordinateMod.Coordinate,
    stride: scala.Double
  ): scala.Double = js.native
  def deflateCoordinates(
    flatCoordinates: js.Array[scala.Double],
    offset: scala.Double,
    coordinates: js.Array[olLib.coordinateMod.Coordinate],
    stride: scala.Double
  ): scala.Double = js.native
  def deflateCoordinatesArray(
    flatCoordinates: js.Array[scala.Double],
    offset: scala.Double,
    coordinatess: js.Array[js.Array[olLib.coordinateMod.Coordinate]],
    stride: scala.Double
  ): js.Array[scala.Double] = js.native
  def deflateCoordinatesArray(
    flatCoordinates: js.Array[scala.Double],
    offset: scala.Double,
    coordinatess: js.Array[js.Array[olLib.coordinateMod.Coordinate]],
    stride: scala.Double,
    opt_ends: js.Array[scala.Double]
  ): js.Array[scala.Double] = js.native
  def deflateMultiCoordinatesArray(
    flatCoordinates: js.Array[scala.Double],
    offset: scala.Double,
    coordinatesss: js.Array[js.Array[js.Array[olLib.coordinateMod.Coordinate]]],
    stride: scala.Double
  ): js.Array[js.Array[scala.Double]] = js.native
  def deflateMultiCoordinatesArray(
    flatCoordinates: js.Array[scala.Double],
    offset: scala.Double,
    coordinatesss: js.Array[js.Array[js.Array[olLib.coordinateMod.Coordinate]]],
    stride: scala.Double,
    opt_endss: js.Array[js.Array[scala.Double]]
  ): js.Array[js.Array[scala.Double]] = js.native
}

