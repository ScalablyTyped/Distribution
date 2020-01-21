package typings.officeUiFabricReact.teachingBubbleMultiStepExampleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITeachingBubbleMultiStepExampleState extends js.Object {
  var isTeachingBubbleVisible: js.UndefOr[Boolean] = js.undefined
}

object ITeachingBubbleMultiStepExampleState {
  @scala.inline
  def apply(isTeachingBubbleVisible: js.UndefOr[Boolean] = js.undefined): ITeachingBubbleMultiStepExampleState = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(isTeachingBubbleVisible)) __obj.updateDynamic("isTeachingBubbleVisible")(isTeachingBubbleVisible.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITeachingBubbleMultiStepExampleState]
  }
}

