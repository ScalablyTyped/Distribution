package typings.novncCore.displayMod

import typings.std.CanvasRenderingContext2D
import typings.std.HTMLCanvasElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NvDisplayDefaults extends js.Object {
  var context: js.UndefOr[CanvasRenderingContext2D] = js.undefined
  var cursor_uri: js.UndefOr[js.Any] = js.undefined
  var height: js.UndefOr[Double] = js.undefined
  var logo: js.UndefOr[NvLogo] = js.undefined
  var onFlush: js.UndefOr[js.Function0[Unit]] = js.undefined
  var prefer_js: js.UndefOr[String] = js.undefined
  var render_mode: js.UndefOr[String] = js.undefined
  var scale: js.UndefOr[Double] = js.undefined
  var target: js.UndefOr[HTMLCanvasElement] = js.undefined
  var viewport: js.UndefOr[Boolean] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
}

object NvDisplayDefaults {
  @scala.inline
  def apply(
    context: CanvasRenderingContext2D = null,
    cursor_uri: js.Any = null,
    height: Int | Double = null,
    logo: NvLogo = null,
    onFlush: () => Unit = null,
    prefer_js: String = null,
    render_mode: String = null,
    scale: Int | Double = null,
    target: HTMLCanvasElement = null,
    viewport: js.UndefOr[Boolean] = js.undefined,
    width: Int | Double = null
  ): NvDisplayDefaults = {
    val __obj = js.Dynamic.literal()
    if (context != null) __obj.updateDynamic("context")(context.asInstanceOf[js.Any])
    if (cursor_uri != null) __obj.updateDynamic("cursor_uri")(cursor_uri.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (logo != null) __obj.updateDynamic("logo")(logo.asInstanceOf[js.Any])
    if (onFlush != null) __obj.updateDynamic("onFlush")(js.Any.fromFunction0(onFlush))
    if (prefer_js != null) __obj.updateDynamic("prefer_js")(prefer_js.asInstanceOf[js.Any])
    if (render_mode != null) __obj.updateDynamic("render_mode")(render_mode.asInstanceOf[js.Any])
    if (scale != null) __obj.updateDynamic("scale")(scale.asInstanceOf[js.Any])
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    if (!js.isUndefined(viewport)) __obj.updateDynamic("viewport")(viewport.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[NvDisplayDefaults]
  }
}

