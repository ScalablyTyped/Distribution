package typings.officeUiFabricReact.teachingBubbleWideExampleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITeachingBubbleWideExampleState extends js.Object {
  var isTeachingBubbleVisible: js.UndefOr[Boolean] = js.undefined
}

object ITeachingBubbleWideExampleState {
  @scala.inline
  def apply(isTeachingBubbleVisible: js.UndefOr[Boolean] = js.undefined): ITeachingBubbleWideExampleState = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(isTeachingBubbleVisible)) __obj.updateDynamic("isTeachingBubbleVisible")(isTeachingBubbleVisible.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITeachingBubbleWideExampleState]
  }
}

