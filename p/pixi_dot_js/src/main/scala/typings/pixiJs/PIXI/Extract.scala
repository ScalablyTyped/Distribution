package typings.pixiJs.PIXI

import typings.std.HTMLCanvasElement
import typings.std.HTMLImageElement
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This class provides renderer-specific plugins for exporting content from a renderer.
  * For instance, these plugins can be used for saving an Image, Canvas element or for exporting the raw image data (pixels).
  *
  * Do not instantiate these plugins directly. It is available from the `renderer.plugins` property.
  * See {@link PIXI.CanvasRenderer#plugins} or {@link PIXI.Renderer#plugins}.
  * @example
  * // Create a new app (will auto-add extract plugin to renderer)
  * const app = new PIXI.Application();
  *
  * // Draw a red circle
  * const graphics = new PIXI.Graphics()
  *     .beginFill(0xFF0000)
  *     .drawCircle(0, 0, 50);
  *
  * // Render the graphics as an HTMLImageElement
  * const image = app.renderer.plugins.extract.image(graphics);
  * document.body.appendChild(image);
  * @class
  * @memberof PIXI
  */
@js.native
trait Extract extends js.Object {
  
  /**
    * Will return a a base64 encoded string of this target. It works by calling
    *  `Extract.getCanvas` and then running toDataURL on that.
    *
    * @param {PIXI.DisplayObject|PIXI.RenderTexture} target - A displayObject or renderTexture
    *  to convert. If left empty will use the main renderer
    * @param {string} [format] - Image format, e.g. "image/jpeg" or "image/webp".
    * @param {number} [quality] - JPEG or Webp compression from 0 to 1. Default is 0.92.
    * @return {string} A base64 encoded string of the texture.
    */
  def base64(target: DisplayObject): String = js.native
  def base64(target: DisplayObject, format: js.UndefOr[scala.Nothing], quality: Double): String = js.native
  def base64(target: DisplayObject, format: String): String = js.native
  def base64(target: DisplayObject, format: String, quality: Double): String = js.native
  def base64(target: RenderTexture): String = js.native
  def base64(target: RenderTexture, format: js.UndefOr[scala.Nothing], quality: Double): String = js.native
  def base64(target: RenderTexture, format: String): String = js.native
  def base64(target: RenderTexture, format: String, quality: Double): String = js.native
  
  /**
    * Creates a Canvas element, renders this target to it and then returns it.
    *
    * @param {PIXI.DisplayObject|PIXI.RenderTexture} target - A displayObject or renderTexture
    *  to convert. If left empty will use the main renderer
    * @return {HTMLCanvasElement} A Canvas element with the texture rendered on.
    */
  def canvas(target: DisplayObject): HTMLCanvasElement = js.native
  def canvas(target: RenderTexture): HTMLCanvasElement = js.native
  
  /**
    * Destroys the extract
    *
    */
  def destroy(): Unit = js.native
  
  /**
    * Will return a HTML Image of the target
    *
    * @param {PIXI.DisplayObject|PIXI.RenderTexture} target - A displayObject or renderTexture
    *  to convert. If left empty will use the main renderer
    * @param {string} [format] - Image format, e.g. "image/jpeg" or "image/webp".
    * @param {number} [quality] - JPEG or Webp compression from 0 to 1. Default is 0.92.
    * @return {HTMLImageElement} HTML Image of the target
    */
  def image(target: DisplayObject): HTMLImageElement = js.native
  def image(target: DisplayObject, format: js.UndefOr[scala.Nothing], quality: Double): HTMLImageElement = js.native
  def image(target: DisplayObject, format: String): HTMLImageElement = js.native
  def image(target: DisplayObject, format: String, quality: Double): HTMLImageElement = js.native
  def image(target: RenderTexture): HTMLImageElement = js.native
  def image(target: RenderTexture, format: js.UndefOr[scala.Nothing], quality: Double): HTMLImageElement = js.native
  def image(target: RenderTexture, format: String): HTMLImageElement = js.native
  def image(target: RenderTexture, format: String, quality: Double): HTMLImageElement = js.native
  
  /**
    * Will return a one-dimensional array containing the pixel data of the entire texture in RGBA
    * order, with integer values between 0 and 255 (included).
    *
    * @param {PIXI.DisplayObject|PIXI.RenderTexture} target - A displayObject or renderTexture
    *  to convert. If left empty will use the main renderer
    * @return {Uint8Array} One-dimensional array containing the pixel data of the entire texture
    */
  def pixels(target: DisplayObject): Uint8Array = js.native
  def pixels(target: RenderTexture): Uint8Array = js.native
}
