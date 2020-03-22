package typings.pixiJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonChildren extends js.Object {
  var children: js.UndefOr[Boolean] = js.undefined
}

object AnonChildren {
  @scala.inline
  def apply(children: js.UndefOr[Boolean] = js.undefined): AnonChildren = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(children)) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonChildren]
  }
}

