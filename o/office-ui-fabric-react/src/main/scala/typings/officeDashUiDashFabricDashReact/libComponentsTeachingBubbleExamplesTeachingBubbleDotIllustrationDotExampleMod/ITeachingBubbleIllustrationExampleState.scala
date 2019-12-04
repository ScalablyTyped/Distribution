package typings.officeDashUiDashFabricDashReact.libComponentsTeachingBubbleExamplesTeachingBubbleDotIllustrationDotExampleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITeachingBubbleIllustrationExampleState extends js.Object {
  var isTeachingBubbleVisible: js.UndefOr[Boolean] = js.undefined
}

object ITeachingBubbleIllustrationExampleState {
  @scala.inline
  def apply(isTeachingBubbleVisible: js.UndefOr[Boolean] = js.undefined): ITeachingBubbleIllustrationExampleState = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(isTeachingBubbleVisible)) __obj.updateDynamic("isTeachingBubbleVisible")(isTeachingBubbleVisible.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITeachingBubbleIllustrationExampleState]
  }
}

