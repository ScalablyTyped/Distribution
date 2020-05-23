package typings.mongodb.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DropTarget extends js.Object {
  var dropTarget: js.UndefOr[Boolean] = js.undefined
}

object DropTarget {
  @scala.inline
  def apply(dropTarget: js.UndefOr[Boolean] = js.undefined): DropTarget = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(dropTarget)) __obj.updateDynamic("dropTarget")(dropTarget.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[DropTarget]
  }
}

