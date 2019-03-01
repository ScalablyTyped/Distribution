package typings
package openjscadLib.threeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/*
  function OrbitControls(object: any, domElement: any): void;
  function SpriteCanvasMaterial(parameters?: any): void;
  */
trait ICanvasRendererOptions extends js.Object {
  var alpha: js.UndefOr[scala.Boolean] = js.undefined
  var canvas: js.UndefOr[stdLib.HTMLCanvasElement] = js.undefined
}

object ICanvasRendererOptions {
  @scala.inline
  def apply(alpha: js.UndefOr[scala.Boolean] = js.undefined, canvas: stdLib.HTMLCanvasElement = null): ICanvasRendererOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(alpha)) __obj.updateDynamic("alpha")(alpha)
    if (canvas != null) __obj.updateDynamic("canvas")(canvas)
    __obj.asInstanceOf[ICanvasRendererOptions]
  }
}

