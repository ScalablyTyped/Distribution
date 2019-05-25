package typings
package olLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/geom/flat/inflate", JSImport.Namespace)
@js.native
object geomFlatInflateMod extends js.Object {
  def inflateCoordinates(
    flatCoordinates: js.Array[scala.Double],
    offset: scala.Double,
    end: scala.Double,
    stride: scala.Double
  ): js.Array[olLib.coordinateMod.Coordinate] = js.native
  def inflateCoordinates(
    flatCoordinates: js.Array[scala.Double],
    offset: scala.Double,
    end: scala.Double,
    stride: scala.Double,
    opt_coordinates: js.Array[olLib.coordinateMod.Coordinate]
  ): js.Array[olLib.coordinateMod.Coordinate] = js.native
  def inflateCoordinatesArray(
    flatCoordinates: js.Array[scala.Double],
    offset: scala.Double,
    ends: js.Array[scala.Double],
    stride: scala.Double
  ): js.Array[js.Array[olLib.coordinateMod.Coordinate]] = js.native
  def inflateCoordinatesArray(
    flatCoordinates: js.Array[scala.Double],
    offset: scala.Double,
    ends: js.Array[scala.Double],
    stride: scala.Double,
    opt_coordinatess: js.Array[js.Array[olLib.coordinateMod.Coordinate]]
  ): js.Array[js.Array[olLib.coordinateMod.Coordinate]] = js.native
  def inflateMultiCoordinatesArray(
    flatCoordinates: js.Array[scala.Double],
    offset: scala.Double,
    endss: js.Array[js.Array[scala.Double]],
    stride: scala.Double
  ): js.Array[js.Array[js.Array[olLib.coordinateMod.Coordinate]]] = js.native
  def inflateMultiCoordinatesArray(
    flatCoordinates: js.Array[scala.Double],
    offset: scala.Double,
    endss: js.Array[js.Array[scala.Double]],
    stride: scala.Double,
    opt_coordinatesss: js.Array[js.Array[js.Array[olLib.coordinateMod.Coordinate]]]
  ): js.Array[js.Array[js.Array[olLib.coordinateMod.Coordinate]]] = js.native
}

