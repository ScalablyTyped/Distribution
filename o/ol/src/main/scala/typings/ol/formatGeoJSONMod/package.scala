package typings.ol

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object formatGeoJSONMod {
  import typings.geojson.geojsonMod.Feature
  import typings.geojson.geojsonMod.FeatureCollection
  import typings.geojson.geojsonMod.GeoJsonProperties
  import typings.geojson.geojsonMod.Geometry
  import typings.geojson.geojsonMod.GeometryCollection
  import typings.geojson.geojsonMod.LineString
  import typings.geojson.geojsonMod.MultiLineString
  import typings.geojson.geojsonMod.MultiPoint
  import typings.geojson.geojsonMod.MultiPolygon
  import typings.geojson.geojsonMod.Point
  import typings.geojson.geojsonMod.Polygon

  type GeoJSON = typings.ol.formatJSONFeatureMod.default
  type GeoJSONFeature = Feature[Geometry, GeoJsonProperties]
  type GeoJSONFeatureCollection = FeatureCollection[Geometry, GeoJsonProperties]
  type GeoJSONGeometry = Geometry
  type GeoJSONGeometryCollection = GeometryCollection
  type GeoJSONLineString = LineString
  type GeoJSONMultiLineString = MultiLineString
  type GeoJSONMultiPoint = MultiPoint
  type GeoJSONMultiPolygon = MultiPolygon
  type GeoJSONObject = typings.geojson.geojsonMod.GeoJSON
  type GeoJSONPoint = Point
  type GeoJSONPolygon = Polygon
}
