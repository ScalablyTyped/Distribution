package typings
package pixiDotJsLib.PIXINs.extrasNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PIXI.extras.AnimatedSprite")
@js.native
class AnimatedSprite protected ()
  extends pixiDotJsLib.PIXINs.Sprite {
  def this(textures: js.Array[AnimatedSpriteTextureTimeObject | pixiDotJsLib.PIXINs.Texture]) = this()
  def this(textures: js.Array[AnimatedSpriteTextureTimeObject | pixiDotJsLib.PIXINs.Texture], autoUpdate: scala.Boolean) = this()
  var _autoUpdate: scala.Boolean = js.native
  var _currentTime: scala.Double = js.native
  var _durations: js.Array[scala.Double] = js.native
  var _textures: js.Array[pixiDotJsLib.PIXINs.Texture] = js.native
  var animationSpeed: scala.Double = js.native
  var currentFrame: scala.Double = js.native
  var loop: scala.Boolean = js.native
  var playing: scala.Boolean = js.native
  var textures: js.Array[pixiDotJsLib.PIXINs.Texture] | js.Array[AnimatedSpriteTextureTimeObject] = js.native
  var totalFrames: scala.Double = js.native
  var updateAnchor: scala.Boolean = js.native
  def gotoAndPlay(frameNumber: scala.Double): scala.Unit = js.native
  def gotoAndStop(frameNumber: scala.Double): scala.Unit = js.native
  def onComplete(): scala.Unit = js.native
  def onFrameChange(currentFrame: scala.Double): scala.Unit = js.native
  def onLoop(): scala.Unit = js.native
  def play(): scala.Unit = js.native
  def stop(): scala.Unit = js.native
  /* protected */ def update(deltaTime: scala.Double): scala.Unit = js.native
}

/* static members */
@JSGlobal("PIXI.extras.AnimatedSprite")
@js.native
object AnimatedSprite extends js.Object {
  def fromFrames(frame: js.Array[java.lang.String]): pixiDotJsLib.PIXINs.extrasNs.AnimatedSprite = js.native
  def fromImages(images: js.Array[java.lang.String]): pixiDotJsLib.PIXINs.extrasNs.AnimatedSprite = js.native
}

