package typings.osmtogeojson.osmtogeojsonMod.OsmJSON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Member extends js.Object {
  var ref: Double
  var role: String
  var `type`: String
}

object Member {
  @scala.inline
  def apply(ref: Double, role: String, `type`: String): Member = {
    val __obj = js.Dynamic.literal(ref = ref.asInstanceOf[js.Any], role = role.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Member]
  }
}

