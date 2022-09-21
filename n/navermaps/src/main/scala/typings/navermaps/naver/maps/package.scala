package typings.navermaps.naver.maps

import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type AroundControl = CustomControl

type ArrayOfBounds = js.Array[LatLngBounds | PointBounds]

type ArrayOfBoundsLiteral = js.Array[LatLngBoundsLiteral | PointBoundsLiteral]

type ArrayOfCoords = js.Array[LatLng | Point]

type ArrayOfCoordsLiteral = js.Array[LatLngLiteral | PointLiteral]

type BoundsLiteral = PointBoundsLiteral | LatLngBoundsLiteral

type CanvasTile = Tile

type CoordLiteral = PointLiteral | LatLngLiteral

type DOMEvent = Event

type GPX = Any

type GeoJSON = Any

type KML = Any

type KVOArrayOfCoords = Any

// Naver Layers
type LabelLayer = Layer

type LatLngBoundsLiteral = PointBoundsLiteral | LatLngBoundsObjectLiteral

type LatLngLiteral = PointLiteral | LatLngObjectLiteral

// Naver Controls
type LogoControl = CustomControl

type MapDataControl = CustomControl

type MapTypeControl = CustomControl

type MapTypeId = String

/**
  * Types
  */
type PointArrayLiteral = js.Tuple2[Double, Double]

type PointBoundsArrayLiteral = js.Tuple4[Double, Double, Double, Double]

type PointBoundsLiteral = PointBoundsArrayLiteral | PointBoundsObjectLiteral

type PointLiteral = PointArrayLiteral | PointObjectLiteral

type ScaleControl = CustomControl

type SizeArrayLiteral = js.Tuple2[Double, Double]

type SizeLiteral = SizeArrayLiteral | SizeObjectLiteral

type StylingFunction = js.Function1[/* feature */ Feature, StyleOptions]

type SymbolStyle = String

type ZoomControl = CustomControl

type forEachOverlayCallback = js.Function2[/* overlay */ Marker | Polyline | Polygon, /* index */ Double, Unit]
