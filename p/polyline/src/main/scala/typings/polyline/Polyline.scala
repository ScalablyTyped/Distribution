package typings.polyline

import typings.geojson.mod.Feature
import typings.geojson.mod.GeoJsonProperties
import typings.geojson.mod.LineString
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Polyline extends StObject {
  
  def decode(string: String): js.Array[js.Array[Double]] = js.native
  def decode(string: String, precision: Double): js.Array[js.Array[Double]] = js.native
  
  def encode(coordinate: js.Array[js.Array[Double]]): String = js.native
  def encode(coordinate: js.Array[js.Array[Double]], precision: Double): String = js.native
  
  def fromGeoJSON(geojson: Feature[LineString, GeoJsonProperties]): String = js.native
  def fromGeoJSON(geojson: Feature[LineString, GeoJsonProperties], precision: Double): String = js.native
  def fromGeoJSON(geojson: LineString): String = js.native
  def fromGeoJSON(geojson: LineString, precision: Double): String = js.native
}
