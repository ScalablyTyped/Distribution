package typings
package phaserLib.PhaserNs.AnimationsNs

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
@JSGlobal("Phaser.Animations.AnimationFrame")
@js.native
class AnimationFrame protected () extends js.Object {
  /**
    * 
    * @param textureKey The key of the Texture this AnimationFrame uses.
    * @param textureFrame The key of the Frame within the Texture that this AnimationFrame uses.
    * @param index The index of this AnimationFrame within the Animation sequence.
    * @param frame A reference to the Texture Frame this AnimationFrame uses for rendering.
    */
  def this(textureKey: java.lang.String, textureFrame: java.lang.String, index: phaserLib.integer, frame: phaserLib.PhaserNs.TexturesNs.Frame) = this()
  def this(textureKey: java.lang.String, textureFrame: phaserLib.integer, index: phaserLib.integer, frame: phaserLib.PhaserNs.TexturesNs.Frame) = this()
  /**
    * Additional time (in ms) that this frame should appear for during playback.
    * The value is added onto the msPerFrame set by the animation.
    */
  var duration: scala.Double = js.native
  /**
    * A reference to the Texture Frame this AnimationFrame uses for rendering.
    */
  var frame: phaserLib.PhaserNs.TexturesNs.Frame = js.native
  /**
    * The index of this AnimationFrame within the Animation sequence.
    */
  var index: phaserLib.integer = js.native
  /**
    * Is this the first frame in an animation sequence?
    */
  val isFirst: scala.Boolean = js.native
  /**
    * Is this the last frame in an animation sequence?
    */
  val isLast: scala.Boolean = js.native
  /**
    * A reference to the AnimationFrame that comes after this one in the animation, if any.
    */
  val nextFrame: AnimationFrame = js.native
  /**
    * A reference to the AnimationFrame that comes before this one in the animation, if any.
    */
  val prevFrame: AnimationFrame = js.native
  /**
    * What % through the animation does this frame come?
    * This value is generated when the animation is created and cached here.
    */
  val progress: scala.Double = js.native
  /**
    * The key of the Frame within the Texture that this AnimationFrame uses.
    */
  var textureFrame: java.lang.String | phaserLib.integer = js.native
  /**
    * The key of the Texture this AnimationFrame uses.
    */
  var textureKey: java.lang.String = js.native
  /**
    * Destroys this object by removing references to external resources and callbacks.
    */
  def destroy(): scala.Unit = js.native
  /**
    * Generates a JavaScript object suitable for converting to JSON.
    */
  def toJSON(): phaserLib.PhaserNs.TypesNs.AnimationsNs.JSONAnimationFrame = js.native
}

