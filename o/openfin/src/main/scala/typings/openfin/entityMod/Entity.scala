package typings.openfin.entityMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Entity extends js.Object {
  var `type`: String
  var uuid: String
}

object Entity {
  @scala.inline
  def apply(`type`: String, uuid: String): Entity = {
    val __obj = js.Dynamic.literal(uuid = uuid.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Entity]
  }
}

