package typings.openlayers.mod.olx.control

import typings.std.Element
import typings.std.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ZoomOptions extends js.Object {
  var className: js.UndefOr[String] = js.undefined
  var delta: js.UndefOr[Double] = js.undefined
  var duration: js.UndefOr[Double] = js.undefined
  var target: js.UndefOr[Element] = js.undefined
  var zoomInLabel: js.UndefOr[String | Node] = js.undefined
  var zoomInTipLabel: js.UndefOr[String] = js.undefined
  var zoomOutLabel: js.UndefOr[String | Node] = js.undefined
  var zoomOutTipLabel: js.UndefOr[String] = js.undefined
}

object ZoomOptions {
  @scala.inline
  def apply(
    className: String = null,
    delta: Int | Double = null,
    duration: Int | Double = null,
    target: Element = null,
    zoomInLabel: String | Node = null,
    zoomInTipLabel: String = null,
    zoomOutLabel: String | Node = null,
    zoomOutTipLabel: String = null
  ): ZoomOptions = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (delta != null) __obj.updateDynamic("delta")(delta.asInstanceOf[js.Any])
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    if (zoomInLabel != null) __obj.updateDynamic("zoomInLabel")(zoomInLabel.asInstanceOf[js.Any])
    if (zoomInTipLabel != null) __obj.updateDynamic("zoomInTipLabel")(zoomInTipLabel.asInstanceOf[js.Any])
    if (zoomOutLabel != null) __obj.updateDynamic("zoomOutLabel")(zoomOutLabel.asInstanceOf[js.Any])
    if (zoomOutTipLabel != null) __obj.updateDynamic("zoomOutTipLabel")(zoomOutTipLabel.asInstanceOf[js.Any])
    __obj.asInstanceOf[ZoomOptions]
  }
}

