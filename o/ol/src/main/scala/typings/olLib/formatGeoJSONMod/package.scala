package typings
package olLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object formatGeoJSONMod {
  type GeoJSON = olLib.formatJSONFeatureMod.default
  type GeoJSONFeature = geojsonLib.geojsonMod.Feature[geojsonLib.geojsonMod.Geometry, geojsonLib.geojsonMod.GeoJsonProperties]
  type GeoJSONFeatureCollection = geojsonLib.geojsonMod.FeatureCollection[geojsonLib.geojsonMod.Geometry, geojsonLib.geojsonMod.GeoJsonProperties]
  type GeoJSONGeometry = geojsonLib.geojsonMod.Geometry
  type GeoJSONGeometryCollection = geojsonLib.geojsonMod.GeometryCollection
  type GeoJSONLineString = geojsonLib.geojsonMod.LineString
  type GeoJSONMultiLineString = geojsonLib.geojsonMod.MultiLineString
  type GeoJSONMultiPoint = geojsonLib.geojsonMod.MultiPoint
  type GeoJSONMultiPolygon = geojsonLib.geojsonMod.MultiPolygon
  type GeoJSONObject = geojsonLib.geojsonMod.GeoJSON
  type GeoJSONPoint = geojsonLib.geojsonMod.Point
  type GeoJSONPolygon = geojsonLib.geojsonMod.Polygon
}
