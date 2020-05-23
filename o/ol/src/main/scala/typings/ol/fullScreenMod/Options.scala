package typings.ol.fullScreenMod

import typings.std.HTMLElement
import typings.std.Text
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var className: js.UndefOr[String] = js.undefined
  var keys: js.UndefOr[Boolean] = js.undefined
  var label: js.UndefOr[String | Text | HTMLElement] = js.undefined
  var labelActive: js.UndefOr[String | Text | HTMLElement] = js.undefined
  var source: js.UndefOr[HTMLElement | String] = js.undefined
  var target: js.UndefOr[HTMLElement | String] = js.undefined
  var tipLabel: js.UndefOr[String] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    className: String = null,
    keys: js.UndefOr[Boolean] = js.undefined,
    label: String | Text | HTMLElement = null,
    labelActive: String | Text | HTMLElement = null,
    source: HTMLElement | String = null,
    target: HTMLElement | String = null,
    tipLabel: String = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(keys)) __obj.updateDynamic("keys")(keys.get.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (labelActive != null) __obj.updateDynamic("labelActive")(labelActive.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    if (tipLabel != null) __obj.updateDynamic("tipLabel")(tipLabel.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

