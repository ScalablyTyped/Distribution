package typings.playcanvas.pc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Handles playing of sprite animations and loading of relevant sprite assets.
  * @property spriteAsset - The id of the sprite asset used to play the animation.
  * @property sprite - The current sprite used to play the animation.
  * @property frame - The index of the frame of the {@link pc.Sprite} currently being rendered.
  * @property time - The current time of the animation in seconds.
  * @property duration - The total duration of the animation in seconds.
  * @property isPlaying - Whether the animation is currently playing.
  * @property isPaused - Whether the animation is currently paused.
  * @param component - The sprite component managing this clip.
  * @param data - Data for the new animation clip.
  * @param [data.fps] - Frames per second for the animation clip.
  * @param [data.loop] - Whether to loop the animation clip.
  * @param [data.name] - The name of the new animation clip.
  * @param [data.spriteAsset] - The id of the sprite asset that this clip will play.
  */
@js.native
trait SpriteAnimationClip extends EventHandler {
  
  /**
    * The total duration of the animation in seconds.
    */
  var duration: Double = js.native
  
  /**
    * The index of the frame of the {@link pc.Sprite} currently being rendered.
    */
  var frame: Double = js.native
  
  /**
    * Whether the animation is currently paused.
    */
  var isPaused: Boolean = js.native
  
  /**
    * Whether the animation is currently playing.
    */
  var isPlaying: Boolean = js.native
  
  /**
    * Pauses the animation.
    */
  def pause(): Unit = js.native
  
  /**
    * Plays the animation. If it's already playing then this does nothing.
    */
  def play(): Unit = js.native
  
  /**
    * Resumes the paused animation.
    */
  def resume(): Unit = js.native
  
  /**
    * The current sprite used to play the animation.
    */
  var sprite: Sprite = js.native
  
  /**
    * The id of the sprite asset used to play the animation.
    */
  var spriteAsset: Double = js.native
  
  /**
    * Stops the animation and resets the animation to the first frame.
    */
  def stop(): Unit = js.native
  
  /**
    * The current time of the animation in seconds.
    */
  var time: Double = js.native
}
