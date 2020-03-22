package typings.openfin.windowWindowMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CloseEventShape extends js.Object {
  var name: String
  var topic: String
  var `type`: String
  var uuid: String
}

object CloseEventShape {
  @scala.inline
  def apply(name: String, topic: String, `type`: String, uuid: String): CloseEventShape = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], topic = topic.asInstanceOf[js.Any], uuid = uuid.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CloseEventShape]
  }
}

