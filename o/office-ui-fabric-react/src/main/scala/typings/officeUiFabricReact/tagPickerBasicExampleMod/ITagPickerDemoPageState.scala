package typings.officeUiFabricReact.tagPickerBasicExampleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITagPickerDemoPageState extends js.Object {
  var isPickerDisabled: js.UndefOr[Boolean] = js.undefined
}

object ITagPickerDemoPageState {
  @scala.inline
  def apply(isPickerDisabled: js.UndefOr[Boolean] = js.undefined): ITagPickerDemoPageState = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(isPickerDisabled)) __obj.updateDynamic("isPickerDisabled")(isPickerDisabled.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITagPickerDemoPageState]
  }
}

