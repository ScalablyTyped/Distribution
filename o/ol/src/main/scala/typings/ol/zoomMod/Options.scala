package typings.ol.zoomMod

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var className: js.UndefOr[String] = js.undefined
  var delta: js.UndefOr[Double] = js.undefined
  var duration: js.UndefOr[Double] = js.undefined
  var target: js.UndefOr[HTMLElement | String] = js.undefined
  var zoomInLabel: js.UndefOr[String | HTMLElement] = js.undefined
  var zoomInTipLabel: js.UndefOr[String] = js.undefined
  var zoomOutLabel: js.UndefOr[String | HTMLElement] = js.undefined
  var zoomOutTipLabel: js.UndefOr[String] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    className: String = null,
    delta: Int | Double = null,
    duration: Int | Double = null,
    target: HTMLElement | String = null,
    zoomInLabel: String | HTMLElement = null,
    zoomInTipLabel: String = null,
    zoomOutLabel: String | HTMLElement = null,
    zoomOutTipLabel: String = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (delta != null) __obj.updateDynamic("delta")(delta.asInstanceOf[js.Any])
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    if (zoomInLabel != null) __obj.updateDynamic("zoomInLabel")(zoomInLabel.asInstanceOf[js.Any])
    if (zoomInTipLabel != null) __obj.updateDynamic("zoomInTipLabel")(zoomInTipLabel.asInstanceOf[js.Any])
    if (zoomOutLabel != null) __obj.updateDynamic("zoomOutLabel")(zoomOutLabel.asInstanceOf[js.Any])
    if (zoomOutTipLabel != null) __obj.updateDynamic("zoomOutTipLabel")(zoomOutTipLabel.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

