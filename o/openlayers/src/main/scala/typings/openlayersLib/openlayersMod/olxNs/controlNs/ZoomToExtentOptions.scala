package typings
package openlayersLib.openlayersMod.olxNs.controlNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ZoomToExtentOptions extends js.Object {
  var className: js.UndefOr[java.lang.String] = js.undefined
  var extent: js.UndefOr[openlayersLib.openlayersMod.Extent] = js.undefined
  var label: js.UndefOr[java.lang.String | stdLib.Node] = js.undefined
  var target: js.UndefOr[stdLib.Element] = js.undefined
  var tipLabel: js.UndefOr[java.lang.String] = js.undefined
}

object ZoomToExtentOptions {
  @scala.inline
  def apply(
    className: java.lang.String = null,
    extent: openlayersLib.openlayersMod.Extent = null,
    label: java.lang.String | stdLib.Node = null,
    target: stdLib.Element = null,
    tipLabel: java.lang.String = null
  ): ZoomToExtentOptions = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className)
    if (extent != null) __obj.updateDynamic("extent")(extent)
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (target != null) __obj.updateDynamic("target")(target)
    if (tipLabel != null) __obj.updateDynamic("tipLabel")(tipLabel)
    __obj.asInstanceOf[ZoomToExtentOptions]
  }
}

