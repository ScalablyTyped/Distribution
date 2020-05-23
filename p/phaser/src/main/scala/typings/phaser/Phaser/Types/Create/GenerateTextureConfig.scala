package typings.phaser.Phaser.Types.Create

import typings.std.CanvasRenderingContext2D
import typings.std.HTMLCanvasElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GenerateTextureConfig extends js.Object {
  /**
    * The HTML Canvas to draw the texture to.
    */
  var canvas: js.UndefOr[HTMLCanvasElement] = js.undefined
  /**
    * Should the canvas be cleared before the texture is drawn?
    */
  var clearCanvas: js.UndefOr[Boolean] = js.undefined
  /**
    * An array of data, where each row is a string of single values 0-9A-F, or the period character.
    */
  var data: js.UndefOr[js.Array[_]] = js.undefined
  /**
    * The indexed palette that the data cell values map to.
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
    * A callback to send the canvas to after the texture has been drawn.
    */
  var postRender: js.UndefOr[GenerateTextureCallback] = js.undefined
  /**
    * A callback to send the canvas to prior to the texture being drawn.
    */
  var preRender: js.UndefOr[GenerateTextureCallback] = js.undefined
  /**
    * Should the canvas be resized before the texture is drawn?
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
    pixelHeight: js.UndefOr[Double] = js.undefined,
    pixelWidth: js.UndefOr[Double] = js.undefined,
    postRender: (/* canvas */ HTMLCanvasElement, /* context */ CanvasRenderingContext2D) => Unit = null,
    preRender: (/* canvas */ HTMLCanvasElement, /* context */ CanvasRenderingContext2D) => Unit = null,
    resizeCanvas: js.UndefOr[Boolean] = js.undefined
  ): GenerateTextureConfig = {
    val __obj = js.Dynamic.literal()
    if (canvas != null) __obj.updateDynamic("canvas")(canvas.asInstanceOf[js.Any])
    if (!js.isUndefined(clearCanvas)) __obj.updateDynamic("clearCanvas")(clearCanvas.get.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (palette != null) __obj.updateDynamic("palette")(palette.asInstanceOf[js.Any])
    if (!js.isUndefined(pixelHeight)) __obj.updateDynamic("pixelHeight")(pixelHeight.get.asInstanceOf[js.Any])
    if (!js.isUndefined(pixelWidth)) __obj.updateDynamic("pixelWidth")(pixelWidth.get.asInstanceOf[js.Any])
    if (postRender != null) __obj.updateDynamic("postRender")(js.Any.fromFunction2(postRender))
    if (preRender != null) __obj.updateDynamic("preRender")(js.Any.fromFunction2(preRender))
    if (!js.isUndefined(resizeCanvas)) __obj.updateDynamic("resizeCanvas")(resizeCanvas.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GenerateTextureConfig]
  }
}

