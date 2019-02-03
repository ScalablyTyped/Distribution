package typings
package pixiDotJsLib.pixiDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// sprites
@JSImport("pixi.js", "Sprite")
@js.native
class Sprite ()
  extends pixiDotJsLib.PIXINs.Sprite {
  def this(texture: pixiDotJsLib.PIXINs.Texture) = this()
}

/* static members */
@JSImport("pixi.js", "Sprite")
@js.native
object Sprite extends js.Object {
  def from(source: java.lang.String): pixiDotJsLib.PIXINs.Sprite = js.native
  def from(source: pixiDotJsLib.PIXINs.BaseTexture): pixiDotJsLib.PIXINs.Sprite = js.native
  def from(source: scala.Double): pixiDotJsLib.PIXINs.Sprite = js.native
  def from(source: stdLib.HTMLCanvasElement): pixiDotJsLib.PIXINs.Sprite = js.native
  def from(source: stdLib.HTMLImageElement): pixiDotJsLib.PIXINs.Sprite = js.native
  def from(source: stdLib.HTMLVideoElement): pixiDotJsLib.PIXINs.Sprite = js.native
  def fromFrame(frameId: java.lang.String): pixiDotJsLib.PIXINs.Sprite = js.native
  def fromImage(imageId: java.lang.String): pixiDotJsLib.PIXINs.Sprite = js.native
  def fromImage(imageId: java.lang.String, crossorigin: scala.Boolean): pixiDotJsLib.PIXINs.Sprite = js.native
  def fromImage(imageId: java.lang.String, crossorigin: scala.Boolean, scaleMode: scala.Double): pixiDotJsLib.PIXINs.Sprite = js.native
}

