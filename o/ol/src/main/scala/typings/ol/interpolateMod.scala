package typings.ol

import typings.ol.coordinateMod.Coordinate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object interpolateMod {
  
  @JSImport("ol/geom/flat/interpolate", "interpolatePoint")
  @js.native
  def interpolatePoint(flatCoordinates: js.Array[Double], offset: Double, end: Double, stride: Double, fraction: Double): js.Array[Double] = js.native
  @JSImport("ol/geom/flat/interpolate", "interpolatePoint")
  @js.native
  def interpolatePoint(
    flatCoordinates: js.Array[Double],
    offset: Double,
    end: Double,
    stride: Double,
    fraction: Double,
    opt_dest: js.UndefOr[scala.Nothing],
    opt_dimension: Double
  ): js.Array[Double] = js.native
  @JSImport("ol/geom/flat/interpolate", "interpolatePoint")
  @js.native
  def interpolatePoint(
    flatCoordinates: js.Array[Double],
    offset: Double,
    end: Double,
    stride: Double,
    fraction: Double,
    opt_dest: js.Array[Double]
  ): js.Array[Double] = js.native
  @JSImport("ol/geom/flat/interpolate", "interpolatePoint")
  @js.native
  def interpolatePoint(
    flatCoordinates: js.Array[Double],
    offset: Double,
    end: Double,
    stride: Double,
    fraction: Double,
    opt_dest: js.Array[Double],
    opt_dimension: Double
  ): js.Array[Double] = js.native
  
  @JSImport("ol/geom/flat/interpolate", "lineStringCoordinateAtM")
  @js.native
  def lineStringCoordinateAtM(
    flatCoordinates: js.Array[Double],
    offset: Double,
    end: Double,
    stride: Double,
    m: Double,
    extrapolate: Boolean
  ): Coordinate = js.native
  
  @JSImport("ol/geom/flat/interpolate", "lineStringsCoordinateAtM")
  @js.native
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
