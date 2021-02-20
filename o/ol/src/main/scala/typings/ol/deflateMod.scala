package typings.ol

import typings.ol.coordinateMod.Coordinate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object deflateMod {
  
  @JSImport("ol/geom/flat/deflate", "deflateCoordinate")
  @js.native
  def deflateCoordinate(flatCoordinates: js.Array[Double], offset: Double, coordinate: Coordinate, stride: Double): Double = js.native
  
  @JSImport("ol/geom/flat/deflate", "deflateCoordinates")
  @js.native
  def deflateCoordinates(
    flatCoordinates: js.Array[Double],
    offset: Double,
    coordinates: js.Array[Coordinate],
    stride: Double
  ): Double = js.native
  
  @JSImport("ol/geom/flat/deflate", "deflateCoordinatesArray")
  @js.native
  def deflateCoordinatesArray(
    flatCoordinates: js.Array[Double],
    offset: Double,
    coordinatess: js.Array[js.Array[Coordinate]],
    stride: Double
  ): js.Array[Double] = js.native
  @JSImport("ol/geom/flat/deflate", "deflateCoordinatesArray")
  @js.native
  def deflateCoordinatesArray(
    flatCoordinates: js.Array[Double],
    offset: Double,
    coordinatess: js.Array[js.Array[Coordinate]],
    stride: Double,
    opt_ends: js.Array[Double]
  ): js.Array[Double] = js.native
  
  @JSImport("ol/geom/flat/deflate", "deflateMultiCoordinatesArray")
  @js.native
  def deflateMultiCoordinatesArray(
    flatCoordinates: js.Array[Double],
    offset: Double,
    coordinatesss: js.Array[js.Array[js.Array[Coordinate]]],
    stride: Double
  ): js.Array[js.Array[Double]] = js.native
  @JSImport("ol/geom/flat/deflate", "deflateMultiCoordinatesArray")
  @js.native
  def deflateMultiCoordinatesArray(
    flatCoordinates: js.Array[Double],
    offset: Double,
    coordinatesss: js.Array[js.Array[js.Array[Coordinate]]],
    stride: Double,
    opt_endss: js.Array[js.Array[Double]]
  ): js.Array[js.Array[Double]] = js.native
}
