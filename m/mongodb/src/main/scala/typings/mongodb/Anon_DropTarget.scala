package typings.mongodb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DropTarget extends js.Object {
  var dropTarget: js.UndefOr[Boolean] = js.undefined
}

object Anon_DropTarget {
  @scala.inline
  def apply(dropTarget: js.UndefOr[Boolean] = js.undefined): Anon_DropTarget = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(dropTarget)) __obj.updateDynamic("dropTarget")(dropTarget.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_DropTarget]
  }
}

