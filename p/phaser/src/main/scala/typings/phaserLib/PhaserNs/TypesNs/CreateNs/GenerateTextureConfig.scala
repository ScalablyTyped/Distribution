package typings
package phaserLib.PhaserNs.TypesNs.CreateNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GenerateTextureConfig extends js.Object {
  /**
    * [description]
    */
  var canvas: js.UndefOr[stdLib.HTMLCanvasElement] = js.undefined
  /**
    * [description]
    */
  var clearCanvas: js.UndefOr[scala.Boolean] = js.undefined
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
  var pixelHeight: js.UndefOr[scala.Double] = js.undefined
  /**
    * The width of each 'pixel' in the generated texture.
    */
  var pixelWidth: js.UndefOr[scala.Double] = js.undefined
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
  var resizeCanvas: js.UndefOr[scala.Boolean] = js.undefined
}

object GenerateTextureConfig {
  @scala.inline
  def apply(
    canvas: stdLib.HTMLCanvasElement = null,
    clearCanvas: js.UndefOr[scala.Boolean] = js.undefined,
    data: js.Array[_] = null,
    palette: Palette = null,
    pixelHeight: scala.Int | scala.Double = null,
    pixelWidth: scala.Int | scala.Double = null,
    postRender: GenerateTextureCallback = null,
    preRender: GenerateTextureCallback = null,
    resizeCanvas: js.UndefOr[scala.Boolean] = js.undefined
  ): GenerateTextureConfig = {
    val __obj = js.Dynamic.literal()
    if (canvas != null) __obj.updateDynamic("canvas")(canvas)
    if (!js.isUndefined(clearCanvas)) __obj.updateDynamic("clearCanvas")(clearCanvas)
    if (data != null) __obj.updateDynamic("data")(data)
    if (palette != null) __obj.updateDynamic("palette")(palette)
    if (pixelHeight != null) __obj.updateDynamic("pixelHeight")(pixelHeight.asInstanceOf[js.Any])
    if (pixelWidth != null) __obj.updateDynamic("pixelWidth")(pixelWidth.asInstanceOf[js.Any])
    if (postRender != null) __obj.updateDynamic("postRender")(postRender)
    if (preRender != null) __obj.updateDynamic("preRender")(preRender)
    if (!js.isUndefined(resizeCanvas)) __obj.updateDynamic("resizeCanvas")(resizeCanvas)
    __obj.asInstanceOf[GenerateTextureConfig]
  }
}

