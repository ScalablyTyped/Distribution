package typings.pixiDotJs.PIXINs

import typings.std.WebGLRenderingContext
import typings.std.WebGLTexture
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PIXI.TextureManager")
@js.native
class TextureManager protected () extends js.Object {
  def this(renderer: WebGLRenderer) = this()
  var _managedTextures: js.Array[Texture] = js.native
  var gl: WebGLRenderingContext = js.native
  var renderer: WebGLRenderer = js.native
  def bindTexture(): Unit = js.native
  def destroy(): Unit = js.native
  def destroyTexture(texture: BaseTexture): Unit = js.native
  def destroyTexture(texture: BaseTexture, _skipRemove: Boolean): Unit = js.native
  def getTexture(): WebGLTexture = js.native
  def removeAll(): Unit = js.native
  def updateTexture(texture: BaseTexture): WebGLTexture = js.native
  def updateTexture(texture: Texture): WebGLTexture = js.native
}

