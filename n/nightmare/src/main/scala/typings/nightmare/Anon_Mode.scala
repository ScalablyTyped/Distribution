package typings.nightmare

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Mode extends js.Object {
  /**
    * Opens the devtools with specified dock state, can be right, bottom, undocked, detach.
    * https://github.com/electron/electron/blob/master/docs/api/web-contents.md#contentsopendevtoolsoptions
    */
  var mode: js.UndefOr[String] = js.undefined
}

object Anon_Mode {
  @scala.inline
  def apply(mode: String = null): Anon_Mode = {
    val __obj = js.Dynamic.literal()
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Mode]
  }
}

