package typings.phaser.Phaser.Types.Create

import typings.std.CanvasRenderingContext2D
import typings.std.HTMLCanvasElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GenerateTextureConfig extends js.Object {
  /**
    * [description]
    */
  var canvas: js.UndefOr[HTMLCanvasElement] = js.undefined
  /**
    * [description]
    */
  var clearCanvas: js.UndefOr[Boolean] = js.undefined
  /**
    * [description]
    */
  var data: js.UndefOr[js.Array[_]] = js.undefined
  /**
    * [description]
    */
  var palette: js.UndefOr[Palette] = js.undefined
  /**
    * The height of each 'pixel' in the generated texture.
    */
  var pixelHeight: js.UndefOr[Double] = js.undefined
  /**
    * The width of each 'pixel' in the generated texture.
    */
  var pixelWidth: js.UndefOr[Double] = js.undefined
  /**
    * [description]
    */
  var postRender: js.UndefOr[GenerateTextureCallback] = js.undefined
  /**
    * [description]
    */
  var preRender: js.UndefOr[GenerateTextureCallback] = js.undefined
  /**
    * [description]
    */
  var resizeCanvas: js.UndefOr[Boolean] = js.undefined
}

object GenerateTextureConfig {
  @scala.inline
  def apply(
    canvas: HTMLCanvasElement = null,
    clearCanvas: js.UndefOr[Boolean] = js.undefined,
    data: js.Array[_] = null,
    palette: Palette = null,
    pixelHeight: Int | Double = null,
    pixelWidth: Int | Double = null,
    postRender: (/* canvas */ HTMLCanvasElement, /* context */ CanvasRenderingContext2D) => Unit = null,
    preRender: (/* canvas */ HTMLCanvasElement, /* context */ CanvasRenderingContext2D) => Unit = null,
    resizeCanvas: js.UndefOr[Boolean] = js.undefined
  ): GenerateTextureConfig = {
    val __obj = js.Dynamic.literal()
    if (canvas != null) __obj.updateDynamic("canvas")(canvas)
    if (!js.isUndefined(clearCanvas)) __obj.updateDynamic("clearCanvas")(clearCanvas)
    if (data != null) __obj.updateDynamic("data")(data)
    if (palette != null) __obj.updateDynamic("palette")(palette)
    if (pixelHeight != null) __obj.updateDynamic("pixelHeight")(pixelHeight.asInstanceOf[js.Any])
    if (pixelWidth != null) __obj.updateDynamic("pixelWidth")(pixelWidth.asInstanceOf[js.Any])
    if (postRender != null) __obj.updateDynamic("postRender")(js.Any.fromFunction2(postRender))
    if (preRender != null) __obj.updateDynamic("preRender")(js.Any.fromFunction2(preRender))
    if (!js.isUndefined(resizeCanvas)) __obj.updateDynamic("resizeCanvas")(resizeCanvas)
    __obj.asInstanceOf[GenerateTextureConfig]
  }
}

