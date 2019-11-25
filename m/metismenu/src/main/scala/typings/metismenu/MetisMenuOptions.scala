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
    if (parentTrigger != null) __obj.updateDynamic("parentTrigger")(parentTrigger.asInstanceOf[js.Any])
    if (!js.isUndefined(preventDefault)) __obj.updateDynamic("preventDefault")(preventDefault.asInstanceOf[js.Any])
    if (subMenu != null) __obj.updateDynamic("subMenu")(subMenu.asInstanceOf[js.Any])
    if (!js.isUndefined(toggle)) __obj.updateDynamic("toggle")(toggle.asInstanceOf[js.Any])
    if (triggerElement != null) __obj.updateDynamic("triggerElement")(triggerElement.asInstanceOf[js.Any])
    __obj.asInstanceOf[MetisMenuOptions]
  }
}

