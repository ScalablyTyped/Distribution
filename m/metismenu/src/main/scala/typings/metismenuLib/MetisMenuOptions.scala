package typings
package metismenuLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MetisMenuOptions extends js.Object {
  var parentTrigger: js.UndefOr[java.lang.String] = js.undefined
  var preventDefault: js.UndefOr[scala.Boolean] = js.undefined
  var subMenu: js.UndefOr[java.lang.String] = js.undefined
  var toggle: js.UndefOr[scala.Boolean] = js.undefined
  var triggerElement: js.UndefOr[java.lang.String] = js.undefined
}

object MetisMenuOptions {
  @scala.inline
  def apply(
    parentTrigger: java.lang.String = null,
    preventDefault: js.UndefOr[scala.Boolean] = js.undefined,
    subMenu: java.lang.String = null,
    toggle: js.UndefOr[scala.Boolean] = js.undefined,
    triggerElement: java.lang.String = null
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

