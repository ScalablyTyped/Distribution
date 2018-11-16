package typings
package pixiDotJsLib.PIXINs.extractNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PIXI.extract.WebGLExtract")
@js.native
class WebGLExtract protected () extends js.Object {
  def this(renderer: pixiDotJsLib.PIXINs.WebGLRenderer) = this()
  var renderer: pixiDotJsLib.PIXINs.WebGLRenderer = js.native
  def base64(): java.lang.String = js.native
  def base64(target: pixiDotJsLib.PIXINs.DisplayObject): java.lang.String = js.native
  def base64(target: pixiDotJsLib.PIXINs.RenderTexture): java.lang.String = js.native
  def canvas(): stdLib.HTMLCanvasElement = js.native
  def canvas(target: pixiDotJsLib.PIXINs.DisplayObject): stdLib.HTMLCanvasElement = js.native
  def canvas(target: pixiDotJsLib.PIXINs.RenderTexture): stdLib.HTMLCanvasElement = js.native
  def destroy(): scala.Unit = js.native
  def image(): stdLib.HTMLImageElement = js.native
  def image(target: pixiDotJsLib.PIXINs.DisplayObject): stdLib.HTMLImageElement = js.native
  def image(target: pixiDotJsLib.PIXINs.RenderTexture): stdLib.HTMLImageElement = js.native
  def pixels(): stdLib.Uint8Array = js.native
  def pixels(renderTexture: pixiDotJsLib.PIXINs.DisplayObject): stdLib.Uint8Array = js.native
  def pixels(renderTexture: pixiDotJsLib.PIXINs.RenderTexture): stdLib.Uint8Array = js.native
}

