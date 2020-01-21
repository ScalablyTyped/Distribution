package typings.officeUiFabricReact.groupedListBasicExampleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IGroupedListExampleState extends js.Object {
  var isCompactMode: js.UndefOr[Boolean] = js.undefined
}

object IGroupedListExampleState {
  @scala.inline
  def apply(isCompactMode: js.UndefOr[Boolean] = js.undefined): IGroupedListExampleState = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(isCompactMode)) __obj.updateDynamic("isCompactMode")(isCompactMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[IGroupedListExampleState]
  }
}

