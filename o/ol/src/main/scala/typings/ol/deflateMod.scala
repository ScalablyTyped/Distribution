package typings.ol

import typings.ol.coordinateMod.Coordinate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/geom/flat/deflate", JSImport.Namespace)
@js.native
object deflateMod extends js.Object {
  def deflateCoordinate(flatCoordinates: js.Array[Double], offset: Double, coordinate: Coordinate, stride: Double): Double = js.native
  def deflateCoordinates(
    flatCoordinates: js.Array[Double],
    offset: Double,
    coordinates: js.Array[Coordinate],
    stride: Double
  ): Double = js.native
  def deflateCoordinatesArray(
    flatCoordinates: js.Array[Double],
    offset: Double,
    coordinatess: js.Array[js.Array[Coordinate]],
    stride: Double
  ): js.Array[Double] = js.native
  def deflateCoordinatesArray(
    flatCoordinates: js.Array[Double],
    offset: Double,
    coordinatess: js.Array[js.Array[Coordinate]],
    stride: Double,
    opt_ends: js.Array[Double]
  ): js.Array[Double] = js.native
  def deflateMultiCoordinatesArray(
    flatCoordinates: js.Array[Double],
    offset: Double,
    coordinatesss: js.Array[js.Array[js.Array[Coordinate]]],
    stride: Double
  ): js.Array[js.Array[Double]] = js.native
  def deflateMultiCoordinatesArray(
    flatCoordinates: js.Array[Double],
    offset: Double,
    coordinatesss: js.Array[js.Array[js.Array[Coordinate]]],
    stride: Double,
    opt_endss: js.Array[js.Array[Double]]
  ): js.Array[js.Array[Double]] = js.native
}

