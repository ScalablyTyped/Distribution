package typings.mongodb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDropTarget extends js.Object {
  var dropTarget: js.UndefOr[Boolean] = js.undefined
}

object AnonDropTarget {
  @scala.inline
  def apply(dropTarget: js.UndefOr[Boolean] = js.undefined): AnonDropTarget = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(dropTarget)) __obj.updateDynamic("dropTarget")(dropTarget.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDropTarget]
  }
}

