package typings.officeUiFabricReact.messageBarBaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IMessageBarState extends js.Object {
  var expandSingleLine: js.UndefOr[Boolean] = js.undefined
  var labelId: js.UndefOr[String] = js.undefined
  var showContent: js.UndefOr[Boolean] = js.undefined
}

object IMessageBarState {
  @scala.inline
  def apply(
    expandSingleLine: js.UndefOr[Boolean] = js.undefined,
    labelId: String = null,
    showContent: js.UndefOr[Boolean] = js.undefined
  ): IMessageBarState = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(expandSingleLine)) __obj.updateDynamic("expandSingleLine")(expandSingleLine.get.asInstanceOf[js.Any])
    if (labelId != null) __obj.updateDynamic("labelId")(labelId.asInstanceOf[js.Any])
    if (!js.isUndefined(showContent)) __obj.updateDynamic("showContent")(showContent.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMessageBarState]
  }
}

