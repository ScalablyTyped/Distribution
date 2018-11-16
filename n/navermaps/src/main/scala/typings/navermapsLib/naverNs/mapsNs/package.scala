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
  type Bounds = PointBounds | LatLngBounds
  type BoundsLiteral = PointBoundsLiteral | LatLngBoundsLiteral
  type Coord = Point | LatLng
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
  type strokeLineCapType = navermapsLib.navermapsLibStrings.butt | navermapsLib.navermapsLibStrings.round | navermapsLib.navermapsLibStrings.square
  type strokeLineJoinType = navermapsLib.navermapsLibStrings.miter | (navermapsLib.navermapsLibStrings.`round `) | navermapsLib.navermapsLibStrings.bevel
  type strokeStyleType = navermapsLib.navermapsLibStrings.solid | navermapsLib.navermapsLibStrings.shortdash | navermapsLib.navermapsLibStrings.shortdot | navermapsLib.navermapsLibStrings.shortdashdot | navermapsLib.navermapsLibStrings.shortdashdotdot | navermapsLib.navermapsLibStrings.dot | navermapsLib.navermapsLibStrings.dash | navermapsLib.navermapsLibStrings.longdash | navermapsLib.navermapsLibStrings.dashdot | navermapsLib.navermapsLibStrings.longdashdot | navermapsLib.navermapsLibStrings.longdashdotdot
}
