package typings.ol

import typings.ol.coordinateMod.Coordinate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object geomFlatInterpolateMod {
  
  @JSImport("ol/geom/flat/interpolate", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def interpolatePoint(flatCoordinates: js.Array[Double], offset: Double, end: Double, stride: Double, fraction: Double): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("interpolatePoint")(flatCoordinates.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], end.asInstanceOf[js.Any], stride.asInstanceOf[js.Any], fraction.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  inline def interpolatePoint(
    flatCoordinates: js.Array[Double],
    offset: Double,
    end: Double,
    stride: Double,
    fraction: Double,
    opt_dest: js.Array[Double]
  ): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("interpolatePoint")(flatCoordinates.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], end.asInstanceOf[js.Any], stride.asInstanceOf[js.Any], fraction.asInstanceOf[js.Any], opt_dest.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  inline def interpolatePoint(
    flatCoordinates: js.Array[Double],
    offset: Double,
    end: Double,
    stride: Double,
    fraction: Double,
    opt_dest: js.Array[Double],
    opt_dimension: Double
  ): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("interpolatePoint")(flatCoordinates.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], end.asInstanceOf[js.Any], stride.asInstanceOf[js.Any], fraction.asInstanceOf[js.Any], opt_dest.asInstanceOf[js.Any], opt_dimension.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  inline def interpolatePoint(
    flatCoordinates: js.Array[Double],
    offset: Double,
    end: Double,
    stride: Double,
    fraction: Double,
    opt_dest: Unit,
    opt_dimension: Double
  ): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("interpolatePoint")(flatCoordinates.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], end.asInstanceOf[js.Any], stride.asInstanceOf[js.Any], fraction.asInstanceOf[js.Any], opt_dest.asInstanceOf[js.Any], opt_dimension.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  
  inline def lineStringCoordinateAtM(
    flatCoordinates: js.Array[Double],
    offset: Double,
    end: Double,
    stride: Double,
    m: Double,
    extrapolate: Boolean
  ): Coordinate = (^.asInstanceOf[js.Dynamic].applyDynamic("lineStringCoordinateAtM")(flatCoordinates.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], end.asInstanceOf[js.Any], stride.asInstanceOf[js.Any], m.asInstanceOf[js.Any], extrapolate.asInstanceOf[js.Any])).asInstanceOf[Coordinate]
  
  inline def lineStringsCoordinateAtM(
    flatCoordinates: js.Array[Double],
    offset: Double,
    ends: js.Array[Double],
    stride: Double,
    m: Double,
    extrapolate: Boolean,
    interpolate: Boolean
  ): Coordinate = (^.asInstanceOf[js.Dynamic].applyDynamic("lineStringsCoordinateAtM")(flatCoordinates.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], ends.asInstanceOf[js.Any], stride.asInstanceOf[js.Any], m.asInstanceOf[js.Any], extrapolate.asInstanceOf[js.Any], interpolate.asInstanceOf[js.Any])).asInstanceOf[Coordinate]
}
