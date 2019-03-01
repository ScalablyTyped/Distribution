package typings
package mongodbLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DropTarget extends js.Object {
  var dropTarget: js.UndefOr[scala.Boolean] = js.undefined
}

object Anon_DropTarget {
  @scala.inline
  def apply(dropTarget: js.UndefOr[scala.Boolean] = js.undefined): Anon_DropTarget = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(dropTarget)) __obj.updateDynamic("dropTarget")(dropTarget)
    __obj.asInstanceOf[Anon_DropTarget]
  }
}

