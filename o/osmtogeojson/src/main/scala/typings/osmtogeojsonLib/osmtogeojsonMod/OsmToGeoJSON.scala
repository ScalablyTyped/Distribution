package typings
package osmtogeojsonLib.osmtogeojsonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OsmToGeoJSON extends js.Object {
  def apply(data: osmtogeojsonLib.osmtogeojsonMod.OsmJSONNs.OsmJSONObject): osmtogeojsonLib.osmtogeojsonMod.GeoJSONNs.GeoJSONObject = js.native
  def apply(data: osmtogeojsonLib.osmtogeojsonMod.OsmJSONNs.OsmJSONObject, options: Options): osmtogeojsonLib.osmtogeojsonMod.GeoJSONNs.GeoJSONObject = js.native
  def apply(data: stdLib.Document): osmtogeojsonLib.osmtogeojsonMod.GeoJSONNs.GeoJSONObject = js.native
  def apply(data: stdLib.Document, options: Options): osmtogeojsonLib.osmtogeojsonMod.GeoJSONNs.GeoJSONObject = js.native
  def toGeojson(data: osmtogeojsonLib.osmtogeojsonMod.OsmJSONNs.OsmJSONObject): osmtogeojsonLib.osmtogeojsonMod.GeoJSONNs.GeoJSONObject = js.native
  def toGeojson(data: osmtogeojsonLib.osmtogeojsonMod.OsmJSONNs.OsmJSONObject, options: Options): osmtogeojsonLib.osmtogeojsonMod.GeoJSONNs.GeoJSONObject = js.native
  def toGeojson(data: stdLib.Document): osmtogeojsonLib.osmtogeojsonMod.GeoJSONNs.GeoJSONObject = js.native
  def toGeojson(data: stdLib.Document, options: Options): osmtogeojsonLib.osmtogeojsonMod.GeoJSONNs.GeoJSONObject = js.native
}

