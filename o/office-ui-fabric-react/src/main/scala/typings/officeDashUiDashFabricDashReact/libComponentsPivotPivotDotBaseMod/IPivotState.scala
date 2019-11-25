package typings.officeDashUiDashFabricDashReact.libComponentsPivotPivotDotBaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPivotState extends js.Object {
  var selectedKey: js.UndefOr[String] = js.undefined
}

object IPivotState {
  @scala.inline
  def apply(selectedKey: String = null): IPivotState = {
    val __obj = js.Dynamic.literal()
    if (selectedKey != null) __obj.updateDynamic("selectedKey")(selectedKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPivotState]
  }
}

