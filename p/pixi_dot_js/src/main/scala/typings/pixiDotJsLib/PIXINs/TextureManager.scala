package typings
package pixiDotJsLib.PIXINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PIXI.TextureManager")
@js.native
class TextureManager protected () extends js.Object {
  def this(renderer: WebGLRenderer) = this()
  var _managedTextures: js.Array[Texture] = js.native
  var gl: stdLib.WebGLRenderingContext = js.native
  var renderer: WebGLRenderer = js.native
  def bindTexture(): scala.Unit = js.native
  def destroy(): scala.Unit = js.native
  def destroyTexture(texture: BaseTexture): scala.Unit = js.native
  def destroyTexture(texture: BaseTexture, _skipRemove: scala.Boolean): scala.Unit = js.native
  def getTexture(): stdLib.WebGLTexture = js.native
  def removeAll(): scala.Unit = js.native
  def updateTexture(texture: BaseTexture): stdLib.WebGLTexture = js.native
  def updateTexture(texture: Texture): stdLib.WebGLTexture = js.native
}

