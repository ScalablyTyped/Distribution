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
    val __obj = js.Dynamic.literal(ref = ref, role = role)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Member]
  }
}

