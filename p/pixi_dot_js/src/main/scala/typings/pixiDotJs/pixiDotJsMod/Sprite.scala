package typings.pixiDotJs.pixiDotJsMod

import typings.std.HTMLCanvasElement
import typings.std.HTMLImageElement
import typings.std.HTMLVideoElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// sprites
@JSImport("pixi.js", "Sprite")
@js.native
class Sprite ()
  extends typings.pixiDotJs.PIXINs.Sprite {
  def this(texture: typings.pixiDotJs.PIXINs.Texture) = this()
}

/* static members */
@JSImport("pixi.js", "Sprite")
@js.native
object Sprite extends js.Object {
  def from(source: String): typings.pixiDotJs.PIXINs.Sprite = js.native
  def from(source: Double): typings.pixiDotJs.PIXINs.Sprite = js.native
  def from(source: typings.pixiDotJs.PIXINs.BaseTexture): typings.pixiDotJs.PIXINs.Sprite = js.native
  def from(source: HTMLCanvasElement): typings.pixiDotJs.PIXINs.Sprite = js.native
  def from(source: HTMLImageElement): typings.pixiDotJs.PIXINs.Sprite = js.native
  def from(source: HTMLVideoElement): typings.pixiDotJs.PIXINs.Sprite = js.native
  def fromFrame(frameId: String): typings.pixiDotJs.PIXINs.Sprite = js.native
  def fromImage(imageId: String): typings.pixiDotJs.PIXINs.Sprite = js.native
  def fromImage(imageId: String, crossorigin: Boolean): typings.pixiDotJs.PIXINs.Sprite = js.native
  def fromImage(imageId: String, crossorigin: Boolean, scaleMode: Double): typings.pixiDotJs.PIXINs.Sprite = js.native
}

