package typings.ol

import typings.ol.coordinateMod.Coordinate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/geom/flat/interpolate", JSImport.Namespace)
@js.native
object interpolateMod extends js.Object {
  def interpolatePoint(flatCoordinates: js.Array[Double], offset: Double, end: Double, stride: Double, fraction: Double): js.Array[Double] = js.native
  def interpolatePoint(
    flatCoordinates: js.Array[Double],
    offset: Double,
    end: Double,
    stride: Double,
    fraction: Double,
    opt_dest: js.Array[Double]
  ): js.Array[Double] = js.native
  def lineStringCoordinateAtM(
    flatCoordinates: js.Array[Double],
    offset: Double,
    end: Double,
    stride: Double,
    m: Double,
    extrapolate: Boolean
  ): Coordinate = js.native
  def lineStringsCoordinateAtM(
    flatCoordinates: js.Array[Double],
    offset: Double,
    ends: js.Array[Double],
    stride: Double,
    m: Double,
    extrapolate: Boolean,
    interpolate: Boolean
  ): Coordinate = js.native
}

