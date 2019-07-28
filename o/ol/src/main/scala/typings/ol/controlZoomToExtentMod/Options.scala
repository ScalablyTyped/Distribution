package typings.ol.controlZoomToExtentMod

import typings.ol.extentMod.Extent
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var className: js.UndefOr[String] = js.undefined
  var extent: js.UndefOr[Extent] = js.undefined
  var label: js.UndefOr[String | HTMLElement] = js.undefined
  var target: js.UndefOr[HTMLElement | String] = js.undefined
  var tipLabel: js.UndefOr[String] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    className: String = null,
    extent: Extent = null,
    label: String | HTMLElement = null,
    target: HTMLElement | String = null,
    tipLabel: String = null
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

