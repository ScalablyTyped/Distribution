package typings.osmtogeojson.osmtogeojsonMod.GeoJSON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GeoJSONObject extends js.Object {
  var `type`: String
}

object GeoJSONObject {
  @scala.inline
  def apply(`type`: String): GeoJSONObject = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeoJSONObject]
  }
}

