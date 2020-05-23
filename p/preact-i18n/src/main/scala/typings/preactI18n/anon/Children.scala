package typings.preactI18n.anon

import typings.preact.mod.ComponentChildren
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Children extends js.Object {
  var children: ComponentChildren
}

object Children {
  @scala.inline
  def apply(children: js.UndefOr[Null | ComponentChildren] = js.undefined): Children = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(children)) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    __obj.asInstanceOf[Children]
  }
}

