package typings
package polylineLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Polyline extends js.Object {
  def decode(string: java.lang.String): js.Array[js.Array[scala.Double]] = js.native
  def decode(string: java.lang.String, precision: scala.Double): js.Array[js.Array[scala.Double]] = js.native
  def encode(coordinate: js.Array[js.Array[scala.Double]]): java.lang.String = js.native
  def encode(coordinate: js.Array[js.Array[scala.Double]], precision: scala.Double): java.lang.String = js.native
  def fromGeoJSON(
    geojson: geojsonLib.geojsonMod.Feature[geojsonLib.geojsonMod.LineString, geojsonLib.geojsonMod.GeoJsonProperties]
  ): java.lang.String = js.native
  def fromGeoJSON(
    geojson: geojsonLib.geojsonMod.Feature[geojsonLib.geojsonMod.LineString, geojsonLib.geojsonMod.GeoJsonProperties],
    precision: scala.Double
  ): java.lang.String = js.native
  def fromGeoJSON(geojson: geojsonLib.geojsonMod.LineString): java.lang.String = js.native
  def fromGeoJSON(geojson: geojsonLib.geojsonMod.LineString, precision: scala.Double): java.lang.String = js.native
}

