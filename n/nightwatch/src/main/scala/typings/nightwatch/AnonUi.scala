package typings.nightwatch

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonUi extends js.Object {
  var ui: js.UndefOr[String] = js.undefined
}

object AnonUi {
  @scala.inline
  def apply(ui: String = null): AnonUi = {
    val __obj = js.Dynamic.literal()
    if (ui != null) __obj.updateDynamic("ui")(ui.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonUi]
  }
}

