package typings.navermaps.naver

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object maps {
  type ArrayOfBounds = js.Array[
    typings.navermaps.naver.maps.LatLngBounds | typings.navermaps.naver.maps.PointBounds
  ]
  type ArrayOfBoundsLiteral = js.Array[
    typings.navermaps.naver.maps.LatLngBoundsLiteral | typings.navermaps.naver.maps.PointBoundsLiteral
  ]
  type ArrayOfCoords = js.Array[typings.navermaps.naver.maps.LatLng | typings.navermaps.naver.maps.Point]
  type ArrayOfCoordsLiteral = js.Array[
    typings.navermaps.naver.maps.LatLngLiteral | typings.navermaps.naver.maps.PointLiteral
  ]
  type BoundsLiteral = typings.navermaps.naver.maps.PointBoundsLiteral | typings.navermaps.naver.maps.LatLngBoundsLiteral
  type CoordLiteral = typings.navermaps.naver.maps.PointLiteral | typings.navermaps.naver.maps.LatLngLiteral
  type DOMEvent = typings.std.Event_
  type GPX = js.Any
  type GeoJSON = js.Any
  type KML = js.Any
  type KVOArrayOfCoords = js.Any
  type LatLngBoundsLiteral = typings.navermaps.naver.maps.PointBoundsLiteral | typings.navermaps.naver.maps.LatLngBoundsObjectLiteral
  type LatLngLiteral = typings.navermaps.naver.maps.PointLiteral | typings.navermaps.naver.maps.LatLngObjectLiteral
  type MapTypeId = java.lang.String
  /**
    * Types
    */
  type PointArrayLiteral = js.Tuple2[scala.Double, scala.Double]
  type PointBoundsArrayLiteral = js.Tuple4[scala.Double, scala.Double, scala.Double, scala.Double]
  type PointBoundsLiteral = typings.navermaps.naver.maps.PointBoundsArrayLiteral | typings.navermaps.naver.maps.PointBoundsObjectLiteral
  type PointLiteral = typings.navermaps.naver.maps.PointArrayLiteral | typings.navermaps.naver.maps.PointObjectLiteral
  type SizeArrayLiteral = js.Tuple2[scala.Double, scala.Double]
  type SizeLiteral = typings.navermaps.naver.maps.SizeArrayLiteral | typings.navermaps.naver.maps.SizeObjectLiteral
  type StylingFunction = js.Function1[
    /* feature */ typings.navermaps.naver.maps.Feature, 
    typings.navermaps.naver.maps.StyleOptions
  ]
  type SymbolStyle = java.lang.String
  type forEachOverlayCallback = js.Function2[
    /* overlay */ typings.navermaps.naver.maps.Marker | typings.navermaps.naver.maps.Polyline | typings.navermaps.naver.maps.Polygon, 
    /* index */ scala.Double, 
    scala.Unit
  ]
}
