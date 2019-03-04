package typings
package osmtogeojsonLib.osmtogeojsonMod.GeoJSONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GeoJSONObject extends js.Object {
  var `type`: java.lang.String
}

object GeoJSONObject {
  @scala.inline
  def apply(`type`: java.lang.String): GeoJSONObject = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[GeoJSONObject]
  }
}

