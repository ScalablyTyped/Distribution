package typings.officeUiFabricReact.teachingBubbleCondensedExampleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITeachingBubbleCondensedExampleState extends js.Object {
  var isTeachingBubbleVisible: js.UndefOr[Boolean] = js.undefined
}

object ITeachingBubbleCondensedExampleState {
  @scala.inline
  def apply(isTeachingBubbleVisible: js.UndefOr[Boolean] = js.undefined): ITeachingBubbleCondensedExampleState = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(isTeachingBubbleVisible)) __obj.updateDynamic("isTeachingBubbleVisible")(isTeachingBubbleVisible.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITeachingBubbleCondensedExampleState]
  }
}

