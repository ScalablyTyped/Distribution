package typings.pixiDotJs.PIXINs.extractNs

import typings.pixiDotJs.PIXINs.CanvasRenderer
import typings.pixiDotJs.PIXINs.DisplayObject
import typings.pixiDotJs.PIXINs.RenderTexture
import typings.std.HTMLCanvasElement
import typings.std.HTMLImageElement
import typings.std.Uint8ClampedArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PIXI.extract.CanvasExtract")
@js.native
class CanvasExtract protected () extends js.Object {
  def this(renderer: CanvasRenderer) = this()
  var renderer: CanvasRenderer = js.native
  def base64(): String = js.native
  def base64(target: DisplayObject): String = js.native
  def base64(target: RenderTexture): String = js.native
  def canvas(): HTMLCanvasElement = js.native
  def canvas(target: DisplayObject): HTMLCanvasElement = js.native
  def canvas(target: RenderTexture): HTMLCanvasElement = js.native
  def destroy(): Unit = js.native
  def image(): HTMLImageElement = js.native
  def image(target: DisplayObject): HTMLImageElement = js.native
  def image(target: RenderTexture): HTMLImageElement = js.native
  def pixels(): Uint8ClampedArray = js.native
  def pixels(renderTexture: DisplayObject): Uint8ClampedArray = js.native
  def pixels(renderTexture: RenderTexture): Uint8ClampedArray = js.native
}

