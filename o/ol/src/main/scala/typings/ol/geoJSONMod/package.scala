package typings.ol

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object geoJSONMod {
  type GeoJSONFeature = typings.geojson.mod.Feature[typings.geojson.mod.Geometry, typings.geojson.mod.GeoJsonProperties]
  type GeoJSONFeatureCollection = typings.geojson.mod.FeatureCollection[typings.geojson.mod.Geometry, typings.geojson.mod.GeoJsonProperties]
  type GeoJSONGeometry = typings.geojson.mod.Geometry
  type GeoJSONGeometryCollection = typings.geojson.mod.GeometryCollection
  type GeoJSONLineString = typings.geojson.mod.LineString
  type GeoJSONMultiLineString = typings.geojson.mod.MultiLineString
  type GeoJSONMultiPoint = typings.geojson.mod.MultiPoint
  type GeoJSONMultiPolygon = typings.geojson.mod.MultiPolygon
  type GeoJSONObject = typings.geojson.mod.GeoJSON
  type GeoJSONPoint = typings.geojson.mod.Point
  type GeoJSONPolygon = typings.geojson.mod.Polygon
}
