package typings.node.childUnderscoreProcessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MessageOptions extends js.Object {
  var keepOpen: js.UndefOr[Boolean] = js.undefined
}

object MessageOptions {
  @scala.inline
  def apply(keepOpen: js.UndefOr[Boolean] = js.undefined): MessageOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(keepOpen)) __obj.updateDynamic("keepOpen")(keepOpen.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageOptions]
  }
}

