package typings.nextReactDevOverlay.busMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FastRefresh extends BusEvent {
  var `type`: /* "fast-refresh" */ String
}

object FastRefresh {
  @scala.inline
  def apply(`type`: /* "fast-refresh" */ String): FastRefresh = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FastRefresh]
  }
}

