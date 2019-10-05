package typings.navermaps.naver

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object maps {
  import typings.std.Event

  type ArrayOfBounds = js.Array[LatLngBounds | PointBounds]
  type ArrayOfBoundsLiteral = js.Array[LatLngBoundsLiteral | PointBoundsLiteral]
  type ArrayOfCoords = js.Array[LatLng | Point]
  type ArrayOfCoordsLiteral = js.Array[LatLngLiteral | PointLiteral]
  type BoundsLiteral = PointBoundsLiteral | LatLngBoundsLiteral
  type CoordLiteral = PointLiteral | LatLngLiteral
  type DOMEvent = Event
  type GPX = js.Any
  type GeoJSON = js.Any
  type KML = js.Any
  type KVOArrayOfCoords = js.Any
  type LatLngBoundsLiteral = PointBoundsLiteral | LatLngBoundsObjectLiteral
  type LatLngLiteral = PointLiteral | LatLngObjectLiteral
  type MapTypeId = String
  /**
    * Types
    */
  type PointArrayLiteral = js.Tuple2[Double, Double]
  type PointBoundsArrayLiteral = js.Tuple4[Double, Double, Double, Double]
  type PointBoundsLiteral = PointBoundsArrayLiteral | PointBoundsObjectLiteral
  type PointLiteral = PointArrayLiteral | PointObjectLiteral
  type SizeArrayLiteral = js.Tuple2[Double, Double]
  type SizeLiteral = SizeArrayLiteral | SizeObjectLiteral
  type StylingFunction = js.Function1[/* feature */ Feature, StyleOptions]
  type SymbolStyle = String
  type forEachOverlayCallback = js.Function2[/* overlay */ Marker | Polyline | Polygon, /* index */ Double, Unit]
}
