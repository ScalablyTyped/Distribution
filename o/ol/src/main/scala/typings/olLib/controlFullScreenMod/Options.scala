package typings
package olLib.controlFullScreenMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var className: js.UndefOr[java.lang.String] = js.undefined
  var keys: js.UndefOr[scala.Boolean] = js.undefined
  var label: js.UndefOr[java.lang.String | stdLib.Text | stdLib.HTMLElement] = js.undefined
  var labelActive: js.UndefOr[java.lang.String | stdLib.Text | stdLib.HTMLElement] = js.undefined
  var source: js.UndefOr[stdLib.HTMLElement | java.lang.String] = js.undefined
  var target: js.UndefOr[stdLib.HTMLElement | java.lang.String] = js.undefined
  var tipLabel: js.UndefOr[java.lang.String] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    className: java.lang.String = null,
    keys: js.UndefOr[scala.Boolean] = js.undefined,
    label: java.lang.String | stdLib.Text | stdLib.HTMLElement = null,
    labelActive: java.lang.String | stdLib.Text | stdLib.HTMLElement = null,
    source: stdLib.HTMLElement | java.lang.String = null,
    target: stdLib.HTMLElement | java.lang.String = null,
    tipLabel: java.lang.String = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className)
    if (!js.isUndefined(keys)) __obj.updateDynamic("keys")(keys)
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (labelActive != null) __obj.updateDynamic("labelActive")(labelActive.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    if (tipLabel != null) __obj.updateDynamic("tipLabel")(tipLabel)
    __obj.asInstanceOf[Options]
  }
}

