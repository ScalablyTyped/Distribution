package typings.nextReactDevOverlay.busMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BuildOk extends BusEvent {
  var `type`: /* "build-ok" */ String
}

object BuildOk {
  @scala.inline
  def apply(`type`: /* "build-ok" */ String): BuildOk = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BuildOk]
  }
}

