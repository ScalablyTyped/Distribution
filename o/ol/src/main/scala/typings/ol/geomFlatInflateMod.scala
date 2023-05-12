package typings.ol

import typings.ol.coordinateMod.Coordinate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object geomFlatInflateMod {
  
  @JSImport("ol/geom/flat/inflate", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def inflateCoordinates(flatCoordinates: js.Array[Double], offset: Double, end: Double, stride: Double): js.Array[Coordinate] = (^.asInstanceOf[js.Dynamic].applyDynamic("inflateCoordinates")(flatCoordinates.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], end.asInstanceOf[js.Any], stride.asInstanceOf[js.Any])).asInstanceOf[js.Array[Coordinate]]
  inline def inflateCoordinates(
    flatCoordinates: js.Array[Double],
    offset: Double,
    end: Double,
    stride: Double,
    coordinates: js.Array[Coordinate]
  ): js.Array[Coordinate] = (^.asInstanceOf[js.Dynamic].applyDynamic("inflateCoordinates")(flatCoordinates.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], end.asInstanceOf[js.Any], stride.asInstanceOf[js.Any], coordinates.asInstanceOf[js.Any])).asInstanceOf[js.Array[Coordinate]]
  
  inline def inflateCoordinatesArray(flatCoordinates: js.Array[Double], offset: Double, ends: js.Array[Double], stride: Double): js.Array[js.Array[Coordinate]] = (^.asInstanceOf[js.Dynamic].applyDynamic("inflateCoordinatesArray")(flatCoordinates.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], ends.asInstanceOf[js.Any], stride.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Array[Coordinate]]]
  inline def inflateCoordinatesArray(
    flatCoordinates: js.Array[Double],
    offset: Double,
    ends: js.Array[Double],
    stride: Double,
    coordinatess: js.Array[js.Array[Coordinate]]
  ): js.Array[js.Array[Coordinate]] = (^.asInstanceOf[js.Dynamic].applyDynamic("inflateCoordinatesArray")(flatCoordinates.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], ends.asInstanceOf[js.Any], stride.asInstanceOf[js.Any], coordinatess.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Array[Coordinate]]]
  
  inline def inflateMultiCoordinatesArray(
    flatCoordinates: js.Array[Double],
    offset: Double,
    endss: js.Array[js.Array[Double]],
    stride: Double
  ): js.Array[js.Array[js.Array[Coordinate]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("inflateMultiCoordinatesArray")(flatCoordinates.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], endss.asInstanceOf[js.Any], stride.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Array[js.Array[Coordinate]]]]
  inline def inflateMultiCoordinatesArray(
    flatCoordinates: js.Array[Double],
    offset: Double,
    endss: js.Array[js.Array[Double]],
    stride: Double,
    coordinatesss: js.Array[js.Array[js.Array[Coordinate]]]
  ): js.Array[js.Array[js.Array[Coordinate]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("inflateMultiCoordinatesArray")(flatCoordinates.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], endss.asInstanceOf[js.Any], stride.asInstanceOf[js.Any], coordinatesss.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Array[js.Array[Coordinate]]]]
}
