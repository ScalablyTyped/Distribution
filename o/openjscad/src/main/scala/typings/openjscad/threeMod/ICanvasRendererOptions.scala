package typings.openjscad.threeMod

import typings.std.HTMLCanvasElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/*
  function OrbitControls(object: any, domElement: any): void;
  function SpriteCanvasMaterial(parameters?: any): void;
  */
trait ICanvasRendererOptions extends js.Object {
  var alpha: js.UndefOr[Boolean] = js.undefined
  var canvas: js.UndefOr[HTMLCanvasElement] = js.undefined
}

object ICanvasRendererOptions {
  @scala.inline
  def apply(alpha: js.UndefOr[Boolean] = js.undefined, canvas: HTMLCanvasElement = null): ICanvasRendererOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(alpha)) __obj.updateDynamic("alpha")(alpha.asInstanceOf[js.Any])
    if (canvas != null) __obj.updateDynamic("canvas")(canvas.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICanvasRendererOptions]
  }
}

