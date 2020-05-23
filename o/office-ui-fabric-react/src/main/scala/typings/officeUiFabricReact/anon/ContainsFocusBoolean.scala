package typings.officeUiFabricReact.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContainsFocusBoolean extends js.Object {
  var containsFocus: js.UndefOr[Boolean] = js.undefined
}

object ContainsFocusBoolean {
  @scala.inline
  def apply(containsFocus: js.UndefOr[Boolean] = js.undefined): ContainsFocusBoolean = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(containsFocus)) __obj.updateDynamic("containsFocus")(containsFocus.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContainsFocusBoolean]
  }
}

