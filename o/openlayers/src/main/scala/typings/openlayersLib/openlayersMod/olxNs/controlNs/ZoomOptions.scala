package typings
package openlayersLib.openlayersMod.olxNs.controlNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ZoomOptions extends js.Object {
  var className: js.UndefOr[java.lang.String] = js.undefined
  var delta: js.UndefOr[scala.Double] = js.undefined
  var duration: js.UndefOr[scala.Double] = js.undefined
  var target: js.UndefOr[stdLib.Element] = js.undefined
  var zoomInLabel: js.UndefOr[java.lang.String | stdLib.Node] = js.undefined
  var zoomInTipLabel: js.UndefOr[java.lang.String] = js.undefined
  var zoomOutLabel: js.UndefOr[java.lang.String | stdLib.Node] = js.undefined
  var zoomOutTipLabel: js.UndefOr[java.lang.String] = js.undefined
}

object ZoomOptions {
  @scala.inline
  def apply(
    className: java.lang.String = null,
    delta: scala.Int | scala.Double = null,
    duration: scala.Int | scala.Double = null,
    target: stdLib.Element = null,
    zoomInLabel: java.lang.String | stdLib.Node = null,
    zoomInTipLabel: java.lang.String = null,
    zoomOutLabel: java.lang.String | stdLib.Node = null,
    zoomOutTipLabel: java.lang.String = null
  ): ZoomOptions = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className)
    if (delta != null) __obj.updateDynamic("delta")(delta.asInstanceOf[js.Any])
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (target != null) __obj.updateDynamic("target")(target)
    if (zoomInLabel != null) __obj.updateDynamic("zoomInLabel")(zoomInLabel.asInstanceOf[js.Any])
    if (zoomInTipLabel != null) __obj.updateDynamic("zoomInTipLabel")(zoomInTipLabel)
    if (zoomOutLabel != null) __obj.updateDynamic("zoomOutLabel")(zoomOutLabel.asInstanceOf[js.Any])
    if (zoomOutTipLabel != null) __obj.updateDynamic("zoomOutTipLabel")(zoomOutTipLabel)
    __obj.asInstanceOf[ZoomOptions]
  }
}

