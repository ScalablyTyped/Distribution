package typings.nightmare

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonMode extends js.Object {
  /**
    * Opens the devtools with specified dock state, can be right, bottom, undocked, detach.
    * https://github.com/electron/electron/blob/master/docs/api/web-contents.md#contentsopendevtoolsoptions
    */
  var mode: js.UndefOr[String] = js.undefined
}

object AnonMode {
  @scala.inline
  def apply(mode: String = null): AnonMode = {
    val __obj = js.Dynamic.literal()
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonMode]
  }
}

