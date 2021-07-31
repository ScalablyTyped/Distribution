package typings.ol

import typings.ol.coordinateMod.Coordinate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object deflateMod {
  
  @JSImport("ol/geom/flat/deflate", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def deflateCoordinate(flatCoordinates: js.Array[Double], offset: Double, coordinate: Coordinate, stride: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("deflateCoordinate")(flatCoordinates.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], coordinate.asInstanceOf[js.Any], stride.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @scala.inline
  def deflateCoordinates(
    flatCoordinates: js.Array[Double],
    offset: Double,
    coordinates: js.Array[Coordinate],
    stride: Double
  ): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("deflateCoordinates")(flatCoordinates.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], coordinates.asInstanceOf[js.Any], stride.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @scala.inline
  def deflateCoordinatesArray(
    flatCoordinates: js.Array[Double],
    offset: Double,
    coordinatess: js.Array[js.Array[Coordinate]],
    stride: Double
  ): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("deflateCoordinatesArray")(flatCoordinates.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], coordinatess.asInstanceOf[js.Any], stride.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  @scala.inline
  def deflateCoordinatesArray(
    flatCoordinates: js.Array[Double],
    offset: Double,
    coordinatess: js.Array[js.Array[Coordinate]],
    stride: Double,
    opt_ends: js.Array[Double]
  ): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("deflateCoordinatesArray")(flatCoordinates.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], coordinatess.asInstanceOf[js.Any], stride.asInstanceOf[js.Any], opt_ends.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  
  @scala.inline
  def deflateMultiCoordinatesArray(
    flatCoordinates: js.Array[Double],
    offset: Double,
    coordinatesss: js.Array[js.Array[js.Array[Coordinate]]],
    stride: Double
  ): js.Array[js.Array[Double]] = (^.asInstanceOf[js.Dynamic].applyDynamic("deflateMultiCoordinatesArray")(flatCoordinates.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], coordinatesss.asInstanceOf[js.Any], stride.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Array[Double]]]
  @scala.inline
  def deflateMultiCoordinatesArray(
    flatCoordinates: js.Array[Double],
    offset: Double,
    coordinatesss: js.Array[js.Array[js.Array[Coordinate]]],
    stride: Double,
    opt_endss: js.Array[js.Array[Double]]
  ): js.Array[js.Array[Double]] = (^.asInstanceOf[js.Dynamic].applyDynamic("deflateMultiCoordinatesArray")(flatCoordinates.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], coordinatesss.asInstanceOf[js.Any], stride.asInstanceOf[js.Any], opt_endss.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Array[Double]]]
}
