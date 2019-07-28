package typings.openlayers.openlayersMod.olxNs.controlNs

import typings.std.Element
import typings.std.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FullScreenOptions extends js.Object {
  var className: js.UndefOr[String] = js.undefined
  var keys: js.UndefOr[Boolean] = js.undefined
  var label: js.UndefOr[String | Node] = js.undefined
  var labelActive: js.UndefOr[String | Node] = js.undefined
  var source: js.UndefOr[Element | String] = js.undefined
  var target: js.UndefOr[Element] = js.undefined
  var tipLabel: js.UndefOr[String] = js.undefined
}

object FullScreenOptions {
  @scala.inline
  def apply(
    className: String = null,
    keys: js.UndefOr[Boolean] = js.undefined,
    label: String | Node = null,
    labelActive: String | Node = null,
    source: Element | String = null,
    target: Element = null,
    tipLabel: String = null
  ): FullScreenOptions = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className)
    if (!js.isUndefined(keys)) __obj.updateDynamic("keys")(keys)
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (labelActive != null) __obj.updateDynamic("labelActive")(labelActive.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    if (target != null) __obj.updateDynamic("target")(target)
    if (tipLabel != null) __obj.updateDynamic("tipLabel")(tipLabel)
    __obj.asInstanceOf[FullScreenOptions]
  }
}

