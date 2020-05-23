package typings.phaser.Phaser.Animations

import typings.phaser.Phaser.Textures.Frame
import typings.phaser.Phaser.Types.Animations.JSONAnimationFrame
import typings.phaser.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A single frame in an Animation sequence.
  * 
  * An AnimationFrame consists of a reference to the Texture it uses for rendering, references to other
  * frames in the animation, and index data. It also has the ability to modify the animation timing.
  * 
  * AnimationFrames are generated automatically by the Animation class.
  */
trait AnimationFrame extends js.Object {
  /**
    * Additional time (in ms) that this frame should appear for during playback.
    * The value is added onto the msPerFrame set by the animation.
    */
  var duration: Double
  /**
    * A reference to the Texture Frame this AnimationFrame uses for rendering.
    */
  var frame: Frame
  /**
    * The index of this AnimationFrame within the Animation sequence.
    */
  var index: integer
  /**
    * Is this the first frame in an animation sequence?
    */
  val isFirst: Boolean
  /**
    * Is this the last frame in an animation sequence?
    */
  val isLast: Boolean
  /**
    * A reference to the AnimationFrame that comes after this one in the animation, if any.
    */
  val nextFrame: AnimationFrame
  /**
    * A reference to the AnimationFrame that comes before this one in the animation, if any.
    */
  val prevFrame: AnimationFrame
  /**
    * What % through the animation does this frame come?
    * This value is generated when the animation is created and cached here.
    */
  val progress: Double
  /**
    * The key of the Frame within the Texture that this AnimationFrame uses.
    */
  var textureFrame: String | integer
  /**
    * The key of the Texture this AnimationFrame uses.
    */
  var textureKey: String
  /**
    * Destroys this object by removing references to external resources and callbacks.
    */
  def destroy(): Unit
  /**
    * Generates a JavaScript object suitable for converting to JSON.
    */
  def toJSON(): JSONAnimationFrame
}

object AnimationFrame {
  @scala.inline
  def apply(
    destroy: () => Unit,
    duration: Double,
    frame: Frame,
    index: integer,
    isFirst: Boolean,
    isLast: Boolean,
    nextFrame: AnimationFrame,
    prevFrame: AnimationFrame,
    progress: Double,
    textureFrame: String | integer,
    textureKey: String,
    toJSON: () => JSONAnimationFrame
  ): AnimationFrame = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), duration = duration.asInstanceOf[js.Any], frame = frame.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], isFirst = isFirst.asInstanceOf[js.Any], isLast = isLast.asInstanceOf[js.Any], nextFrame = nextFrame.asInstanceOf[js.Any], prevFrame = prevFrame.asInstanceOf[js.Any], progress = progress.asInstanceOf[js.Any], textureFrame = textureFrame.asInstanceOf[js.Any], textureKey = textureKey.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON))
    __obj.asInstanceOf[AnimationFrame]
  }
}

