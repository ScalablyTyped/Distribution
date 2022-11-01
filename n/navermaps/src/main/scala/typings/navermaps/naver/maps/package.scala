package typings.navermaps.naver.maps

import typings.geojson.mod.FeatureCollection
import typings.geojson.mod.GeoJsonProperties
import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type AroundControl = CustomControl

// --------------------------------------------------------------------------
//  submodules
//  https://navermaps.github.io/maps.js.ncp/docs/tutorial-4-Submodules.html
// --------------------------------------------------------------------------
/**
  * Submodule - Panorama
  * See https://navermaps.github.io/maps.js.ncp/docs/tutorial-Panorama.html
  */
type AroundControlOptions = ControlOptions

type ArrayOfBounds = js.Array[LatLngBounds | PointBounds]

type ArrayOfBoundsLiteral = js.Array[LatLngBoundsLiteral | PointBoundsLiteral]

type ArrayOfCoords = js.Array[LatLng | Point]

type ArrayOfCoordsLiteral = js.Array[LatLngLiteral | PointLiteral]

type BoundsLiteral = PointBoundsLiteral | LatLngBoundsLiteral

/**
  * CadastralLayer
  */
type CadastralLayer = LabelLayer

type CoordLiteral = PointLiteral | LatLngLiteral

type DOMEvent = Event

// See https://www.topografix.com/gpx.asp
type GPX = Any

type GeoJSON = (typings.geojson.mod.Feature[typings.geojson.mod.Geometry, GeoJsonProperties]) | (FeatureCollection[typings.geojson.mod.Geometry, GeoJsonProperties])

// See https://developers.google.com/kml/documentation/kml_tut?hl=ko
type KML = Any

type KVOArrayOfCoords = KVOArray[LatLng | Point]

/**
  * LabelLayer
  */
type LabelLayer = Layer

type LatLngBoundsLiteral = PointBoundsLiteral | LatLngBoundsObjectLiteral

type LatLngLiteral = PointLiteral | LatLngObjectLiteral

/**
  * LogoControl
  */
type LogoControl = CustomControl

type LogoControlOptions = ControlOptions

/**
  * MapDataControl
  */
type MapDataControl = CustomControl

type MapDataControlOptions = ControlOptions

/**
  * MapTypeControl
  */
type MapTypeControl = CustomControl

// --------------------------------------------------------------------------
//  Types
// --------------------------------------------------------------------------
type PointArrayLiteral = js.Tuple2[Double, Double]

type PointBoundsArrayLiteral = js.Tuple4[Double, Double, Double, Double]

type PointBoundsLiteral = PointBoundsArrayLiteral | PointBoundsObjectLiteral

type PointLiteral = PointArrayLiteral | PointObjectLiteral

/**
  * ScaleControl
  */
type ScaleControl = CustomControl

type ScaleControlOptions = ControlOptions

type SizeArrayLiteral = js.Tuple2[Double, Double]

type SizeLiteral = SizeArrayLiteral | SizeObjectLiteral

/**
  * StreetLayer
  */
type StreetLayer = LabelLayer

type StylingFunction = js.Function1[/* feature */ Feature, StyleOptions]

/**
  * ZoomControl
  */
type ZoomControl = CustomControl

type forEachOverlayCallback = js.Function2[/* overlay */ Marker | Polyline | Polygon, /* index */ Double, Unit]

type padding = Margin
