package typings.novncCore.displayMod

import typings.std.CanvasRenderingContext2D
import typings.std.HTMLCanvasElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NvDisplayDefaults extends js.Object {
  var context: js.UndefOr[CanvasRenderingContext2D] = js.native
  var cursor_uri: js.UndefOr[js.Any] = js.native
  var height: js.UndefOr[Double] = js.native
  var logo: js.UndefOr[NvLogo] = js.native
  var onFlush: js.UndefOr[js.Function0[Unit]] = js.native
  var prefer_js: js.UndefOr[String] = js.native
  var render_mode: js.UndefOr[String] = js.native
  var scale: js.UndefOr[Double] = js.native
  var target: js.UndefOr[HTMLCanvasElement] = js.native
  var viewport: js.UndefOr[Boolean] = js.native
  var width: js.UndefOr[Double] = js.native
}

object NvDisplayDefaults {
  @scala.inline
  def apply(): NvDisplayDefaults = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NvDisplayDefaults]
  }
  @scala.inline
  implicit class NvDisplayDefaultsOps[Self <: NvDisplayDefaults] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setContext(value: CanvasRenderingContext2D): Self = this.set("context", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContext: Self = this.set("context", js.undefined)
    @scala.inline
    def setCursor_uri(value: js.Any): Self = this.set("cursor_uri", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCursor_uri: Self = this.set("cursor_uri", js.undefined)
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    @scala.inline
    def setLogo(value: NvLogo): Self = this.set("logo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLogo: Self = this.set("logo", js.undefined)
    @scala.inline
    def setOnFlush(value: () => Unit): Self = this.set("onFlush", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnFlush: Self = this.set("onFlush", js.undefined)
    @scala.inline
    def setPrefer_js(value: String): Self = this.set("prefer_js", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrefer_js: Self = this.set("prefer_js", js.undefined)
    @scala.inline
    def setRender_mode(value: String): Self = this.set("render_mode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRender_mode: Self = this.set("render_mode", js.undefined)
    @scala.inline
    def setScale(value: Double): Self = this.set("scale", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScale: Self = this.set("scale", js.undefined)
    @scala.inline
    def setTarget(value: HTMLCanvasElement): Self = this.set("target", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTarget: Self = this.set("target", js.undefined)
    @scala.inline
    def setViewport(value: Boolean): Self = this.set("viewport", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteViewport: Self = this.set("viewport", js.undefined)
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
  
}

