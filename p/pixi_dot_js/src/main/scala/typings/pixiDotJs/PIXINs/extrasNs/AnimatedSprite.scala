package typings.pixiDotJs.PIXINs.extrasNs

import typings.pixiDotJs.PIXINs.Sprite
import typings.pixiDotJs.PIXINs.Texture
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PIXI.extras.AnimatedSprite")
@js.native
class AnimatedSprite protected () extends Sprite {
  def this(textures: js.Array[AnimatedSpriteTextureTimeObject | Texture]) = this()
  def this(textures: js.Array[AnimatedSpriteTextureTimeObject | Texture], autoUpdate: Boolean) = this()
  var _autoUpdate: Boolean = js.native
  var _currentTime: Double = js.native
  var _durations: js.Array[Double] = js.native
  var _textures: js.Array[Texture] = js.native
  var animationSpeed: Double = js.native
  var currentFrame: Double = js.native
  var loop: Boolean = js.native
  var playing: Boolean = js.native
  var textures: js.Array[AnimatedSpriteTextureTimeObject | Texture] = js.native
  var totalFrames: Double = js.native
  var updateAnchor: Boolean = js.native
  def gotoAndPlay(frameNumber: Double): Unit = js.native
  def gotoAndStop(frameNumber: Double): Unit = js.native
  def onComplete(): Unit = js.native
  def onFrameChange(currentFrame: Double): Unit = js.native
  def onLoop(): Unit = js.native
  def play(): Unit = js.native
  def stop(): Unit = js.native
  /* protected */ def update(deltaTime: Double): Unit = js.native
}

/* static members */
@JSGlobal("PIXI.extras.AnimatedSprite")
@js.native
object AnimatedSprite extends js.Object {
  def fromFrames(frame: js.Array[String]): AnimatedSprite = js.native
  def fromImages(images: js.Array[String]): AnimatedSprite = js.native
}

