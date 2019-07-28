package typings.metismenu

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MetisMenuOptions extends js.Object {
  var parentTrigger: js.UndefOr[String] = js.undefined
  var preventDefault: js.UndefOr[Boolean] = js.undefined
  var subMenu: js.UndefOr[String] = js.undefined
  var toggle: js.UndefOr[Boolean] = js.undefined
  var triggerElement: js.UndefOr[String] = js.undefined
}

object MetisMenuOptions {
  @scala.inline
  def apply(
    parentTrigger: String = null,
    preventDefault: js.UndefOr[Boolean] = js.undefined,
    subMenu: String = null,
    toggle: js.UndefOr[Boolean] = js.undefined,
    triggerElement: String = null
  ): MetisMenuOptions = {
    val __obj = js.Dynamic.literal()
    if (parentTrigger != null) __obj.updateDynamic("parentTrigger")(parentTrigger)
    if (!js.isUndefined(preventDefault)) __obj.updateDynamic("preventDefault")(preventDefault)
    if (subMenu != null) __obj.updateDynamic("subMenu")(subMenu)
    if (!js.isUndefined(toggle)) __obj.updateDynamic("toggle")(toggle)
    if (triggerElement != null) __obj.updateDynamic("triggerElement")(triggerElement)
    __obj.asInstanceOf[MetisMenuOptions]
  }
}

