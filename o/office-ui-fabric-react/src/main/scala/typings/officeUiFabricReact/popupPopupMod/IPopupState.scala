package typings.officeUiFabricReact.popupPopupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPopupState extends js.Object {
  var needsVerticalScrollBar: js.UndefOr[Boolean] = js.undefined
}

object IPopupState {
  @scala.inline
  def apply(needsVerticalScrollBar: js.UndefOr[Boolean] = js.undefined): IPopupState = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(needsVerticalScrollBar)) __obj.updateDynamic("needsVerticalScrollBar")(needsVerticalScrollBar.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPopupState]
  }
}

