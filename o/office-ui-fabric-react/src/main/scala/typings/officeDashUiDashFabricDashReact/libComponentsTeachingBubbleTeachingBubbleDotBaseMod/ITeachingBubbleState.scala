package typings.officeDashUiDashFabricDashReact.libComponentsTeachingBubbleTeachingBubbleDotBaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITeachingBubbleState extends js.Object {
  var isTeachingBubbleVisible: js.UndefOr[Boolean] = js.undefined
}

object ITeachingBubbleState {
  @scala.inline
  def apply(isTeachingBubbleVisible: js.UndefOr[Boolean] = js.undefined): ITeachingBubbleState = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(isTeachingBubbleVisible)) __obj.updateDynamic("isTeachingBubbleVisible")(isTeachingBubbleVisible.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITeachingBubbleState]
  }
}

