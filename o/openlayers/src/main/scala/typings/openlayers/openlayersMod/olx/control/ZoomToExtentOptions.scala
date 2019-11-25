package typings.openlayers.openlayersMod.olx.control

import typings.openlayers.openlayersMod.Extent
import typings.std.Element
import typings.std.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ZoomToExtentOptions extends js.Object {
  var className: js.UndefOr[String] = js.undefined
  var extent: js.UndefOr[Extent] = js.undefined
  var label: js.UndefOr[String | Node] = js.undefined
  var target: js.UndefOr[Element] = js.undefined
  var tipLabel: js.UndefOr[String] = js.undefined
}

object ZoomToExtentOptions {
  @scala.inline
  def apply(
    className: String = null,
    extent: Extent = null,
    label: String | Node = null,
    target: Element = null,
    tipLabel: String = null
  ): ZoomToExtentOptions = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (extent != null) __obj.updateDynamic("extent")(extent.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    if (tipLabel != null) __obj.updateDynamic("tipLabel")(tipLabel.asInstanceOf[js.Any])
    __obj.asInstanceOf[ZoomToExtentOptions]
  }
}

