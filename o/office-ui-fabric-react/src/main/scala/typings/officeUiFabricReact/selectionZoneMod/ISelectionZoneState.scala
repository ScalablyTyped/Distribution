package typings.officeUiFabricReact.selectionZoneMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISelectionZoneState extends js.Object {
  var isModal: js.UndefOr[Boolean] = js.undefined
}

object ISelectionZoneState {
  @scala.inline
  def apply(isModal: js.UndefOr[Boolean] = js.undefined): ISelectionZoneState = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(isModal)) __obj.updateDynamic("isModal")(isModal.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISelectionZoneState]
  }
}

