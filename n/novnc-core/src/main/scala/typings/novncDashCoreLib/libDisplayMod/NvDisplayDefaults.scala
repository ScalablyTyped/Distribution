package typings
package novncDashCoreLib.libDisplayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NvDisplayDefaults extends js.Object {
  var context: js.UndefOr[stdLib.CanvasRenderingContext2D] = js.undefined
  var cursor_uri: js.UndefOr[js.Any] = js.undefined
  var height: js.UndefOr[scala.Double] = js.undefined
  var logo: js.UndefOr[NvLogo] = js.undefined
  var onFlush: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var prefer_js: js.UndefOr[java.lang.String] = js.undefined
  var render_mode: js.UndefOr[java.lang.String] = js.undefined
  var scale: js.UndefOr[scala.Double] = js.undefined
  var target: js.UndefOr[stdLib.HTMLCanvasElement] = js.undefined
  var viewport: js.UndefOr[scala.Boolean] = js.undefined
  var width: js.UndefOr[scala.Double] = js.undefined
}

object NvDisplayDefaults {
  @scala.inline
  def apply(
    context: stdLib.CanvasRenderingContext2D = null,
    cursor_uri: js.Any = null,
    height: scala.Int | scala.Double = null,
    logo: NvLogo = null,
    onFlush: js.Function0[scala.Unit] = null,
    prefer_js: java.lang.String = null,
    render_mode: java.lang.String = null,
    scale: scala.Int | scala.Double = null,
    target: stdLib.HTMLCanvasElement = null,
    viewport: js.UndefOr[scala.Boolean] = js.undefined,
    width: scala.Int | scala.Double = null
  ): NvDisplayDefaults = {
    val __obj = js.Dynamic.literal()
    if (context != null) __obj.updateDynamic("context")(context)
    if (cursor_uri != null) __obj.updateDynamic("cursor_uri")(cursor_uri)
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (logo != null) __obj.updateDynamic("logo")(logo)
    if (onFlush != null) __obj.updateDynamic("onFlush")(onFlush)
    if (prefer_js != null) __obj.updateDynamic("prefer_js")(prefer_js)
    if (render_mode != null) __obj.updateDynamic("render_mode")(render_mode)
    if (scale != null) __obj.updateDynamic("scale")(scale.asInstanceOf[js.Any])
    if (target != null) __obj.updateDynamic("target")(target)
    if (!js.isUndefined(viewport)) __obj.updateDynamic("viewport")(viewport)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[NvDisplayDefaults]
  }
}

