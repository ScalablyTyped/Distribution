package typings.pixiJs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Children extends js.Object {
  var children: js.UndefOr[Boolean] = js.undefined
}

object Children {
  @scala.inline
  def apply(children: js.UndefOr[Boolean] = js.undefined): Children = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(children)) __obj.updateDynamic("children")(children.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Children]
  }
}

