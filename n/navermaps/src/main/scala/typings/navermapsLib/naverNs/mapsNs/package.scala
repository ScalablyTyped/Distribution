package typings
package navermapsLib.naverNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mapsNs {
  type ArrayOfBounds = js.Array[PointBounds] | js.Array[LatLngBounds]
  type ArrayOfBoundsLiteral = js.Array[PointBoundsLiteral] | js.Array[LatLngBoundsLiteral]
  type ArrayOfCoords = js.Array[Point] | js.Array[LatLng]
  type ArrayOfCoordsLiteral = js.Array[PointLiteral] | js.Array[LatLngLiteral]
  type BoundsLiteral = PointBoundsLiteral | LatLngBoundsLiteral
  type CoordLiteral = PointLiteral | LatLngLiteral
  type DOMEvent = stdLib.Event
  type GPX = js.Any
  type GeoJSON = js.Any
  type KML = js.Any
  type KVOArrayOfCoords = js.Any
  type LatLngBoundsLiteral = PointBoundsLiteral | LatLngBoundsObjectLiteral
  type LatLngLiteral = PointLiteral | LatLngObjectLiteral
  type MapTypeId = java.lang.String
  /**
    * Types
    */
  type PointArrayLiteral = js.Tuple2[scala.Double, scala.Double]
  type PointBoundsArrayLiteral = js.Tuple4[scala.Double, scala.Double, scala.Double, scala.Double]
  type PointBoundsLiteral = PointBoundsArrayLiteral | PointBoundsObjectLiteral
  type PointLiteral = PointArrayLiteral | PointObjectLiteral
  type SizeArrayLiteral = js.Tuple2[scala.Double, scala.Double]
  type SizeLiteral = SizeArrayLiteral | SizeObjectLiteral
  type StylingFunction = js.Function1[/* feature */ Feature, StyleOptions]
  type SymbolStyle = java.lang.String
  type forEachOverlayCallback = js.Function2[/* overlay */ Marker | Polyline | Polygon, /* index */ scala.Double, scala.Unit]
}
