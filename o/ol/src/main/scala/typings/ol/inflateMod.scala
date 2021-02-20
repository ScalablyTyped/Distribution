package typings.ol

import typings.ol.coordinateMod.Coordinate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object inflateMod {
  
  @JSImport("ol/geom/flat/inflate", "inflateCoordinates")
  @js.native
  def inflateCoordinates(flatCoordinates: js.Array[Double], offset: Double, end: Double, stride: Double): js.Array[Coordinate] = js.native
  @JSImport("ol/geom/flat/inflate", "inflateCoordinates")
  @js.native
  def inflateCoordinates(
    flatCoordinates: js.Array[Double],
    offset: Double,
    end: Double,
    stride: Double,
    opt_coordinates: js.Array[Coordinate]
  ): js.Array[Coordinate] = js.native
  
  @JSImport("ol/geom/flat/inflate", "inflateCoordinatesArray")
  @js.native
  def inflateCoordinatesArray(flatCoordinates: js.Array[Double], offset: Double, ends: js.Array[Double], stride: Double): js.Array[js.Array[Coordinate]] = js.native
  @JSImport("ol/geom/flat/inflate", "inflateCoordinatesArray")
  @js.native
  def inflateCoordinatesArray(
    flatCoordinates: js.Array[Double],
    offset: Double,
    ends: js.Array[Double],
    stride: Double,
    opt_coordinatess: js.Array[js.Array[Coordinate]]
  ): js.Array[js.Array[Coordinate]] = js.native
  
  @JSImport("ol/geom/flat/inflate", "inflateMultiCoordinatesArray")
  @js.native
  def inflateMultiCoordinatesArray(
    flatCoordinates: js.Array[Double],
    offset: Double,
    endss: js.Array[js.Array[Double]],
    stride: Double
  ): js.Array[js.Array[js.Array[Coordinate]]] = js.native
  @JSImport("ol/geom/flat/inflate", "inflateMultiCoordinatesArray")
  @js.native
  def inflateMultiCoordinatesArray(
    flatCoordinates: js.Array[Double],
    offset: Double,
    endss: js.Array[js.Array[Double]],
    stride: Double,
    opt_coordinatesss: js.Array[js.Array[js.Array[Coordinate]]]
  ): js.Array[js.Array[js.Array[Coordinate]]] = js.native
}
