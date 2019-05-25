package typings
package olLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/geom/flat/interpolate", JSImport.Namespace)
@js.native
object geomFlatInterpolateMod extends js.Object {
  def interpolatePoint(
    flatCoordinates: js.Array[scala.Double],
    offset: scala.Double,
    end: scala.Double,
    stride: scala.Double,
    fraction: scala.Double
  ): js.Array[scala.Double] = js.native
  def interpolatePoint(
    flatCoordinates: js.Array[scala.Double],
    offset: scala.Double,
    end: scala.Double,
    stride: scala.Double,
    fraction: scala.Double,
    opt_dest: js.Array[scala.Double]
  ): js.Array[scala.Double] = js.native
  def lineStringCoordinateAtM(
    flatCoordinates: js.Array[scala.Double],
    offset: scala.Double,
    end: scala.Double,
    stride: scala.Double,
    m: scala.Double,
    extrapolate: scala.Boolean
  ): olLib.coordinateMod.Coordinate = js.native
  def lineStringsCoordinateAtM(
    flatCoordinates: js.Array[scala.Double],
    offset: scala.Double,
    ends: js.Array[scala.Double],
    stride: scala.Double,
    m: scala.Double,
    extrapolate: scala.Boolean,
    interpolate: scala.Boolean
  ): olLib.coordinateMod.Coordinate = js.native
}

