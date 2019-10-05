package typings.pixiDashSpine.PIXI.spine.core

import typings.std.HTMLImageElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PIXI.spine.core.Texture")
@js.native
abstract class Texture protected () extends js.Object {
  def this(image: HTMLImageElement) = this()
  var _image: HTMLImageElement = js.native
  def dispose(): Unit = js.native
  def getImage(): HTMLImageElement = js.native
  def setFilters(minFilter: TextureFilter, magFilter: TextureFilter): Unit = js.native
  def setWraps(uWrap: TextureWrap, vWrap: TextureWrap): Unit = js.native
}

/* static members */
@JSGlobal("PIXI.spine.core.Texture")
@js.native
object Texture extends js.Object {
  def filterFromString(text: String): TextureFilter = js.native
  def wrapFromString(text: String): TextureWrap = js.native
}

