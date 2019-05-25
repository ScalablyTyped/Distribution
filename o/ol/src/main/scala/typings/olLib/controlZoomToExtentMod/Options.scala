package typings
package olLib.controlZoomToExtentMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var className: js.UndefOr[java.lang.String] = js.undefined
  var extent: js.UndefOr[olLib.extentMod.Extent] = js.undefined
  var label: js.UndefOr[java.lang.String | stdLib.HTMLElement] = js.undefined
  var target: js.UndefOr[stdLib.HTMLElement | java.lang.String] = js.undefined
  var tipLabel: js.UndefOr[java.lang.String] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    className: java.lang.String = null,
    extent: olLib.extentMod.Extent = null,
    label: java.lang.String | stdLib.HTMLElement = null,
    target: stdLib.HTMLElement | java.lang.String = null,
    tipLabel: java.lang.String = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className)
    if (extent != null) __obj.updateDynamic("extent")(extent)
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    if (tipLabel != null) __obj.updateDynamic("tipLabel")(tipLabel)
    __obj.asInstanceOf[Options]
  }
}

