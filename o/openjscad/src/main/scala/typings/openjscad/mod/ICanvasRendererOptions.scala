package typings.openjscad.mod

import typings.std.HTMLCanvasElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/*
  function OrbitControls(object: any, domElement: any): void;
  function SpriteCanvasMaterial(parameters?: any): void;
  */
@js.native
trait ICanvasRendererOptions extends js.Object {
  var alpha: js.UndefOr[Boolean] = js.native
  var canvas: js.UndefOr[HTMLCanvasElement] = js.native
}

object ICanvasRendererOptions {
  @scala.inline
  def apply(): ICanvasRendererOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ICanvasRendererOptions]
  }
  @scala.inline
  implicit class ICanvasRendererOptionsOps[Self <: ICanvasRendererOptions] (val x: Self) extends AnyVal {
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
    def setAlpha(value: Boolean): Self = this.set("alpha", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlpha: Self = this.set("alpha", js.undefined)
    @scala.inline
    def setCanvas(value: HTMLCanvasElement): Self = this.set("canvas", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCanvas: Self = this.set("canvas", js.undefined)
  }
  
}

