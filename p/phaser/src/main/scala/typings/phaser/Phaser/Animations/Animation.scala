package typings.phaser.Phaser.Animations

import typings.phaser.Phaser.Events.EventEmitter
import typings.phaser.Phaser.Textures.TextureManager
import typings.phaser.Phaser.Types.Animations.JSONAnimation
import typings.phaser.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A Frame based Animation.
  * 
  * This consists of a key, some default values (like the frame rate) and a bunch of Frame objects.
  * 
  * The Animation Manager creates these. Game Objects don't own an instance of these directly.
  * Game Objects have the Animation Component, which are like playheads to global Animations (these objects)
  * So multiple Game Objects can have playheads all pointing to this one Animation instance.
  */
@js.native
trait Animation extends EventEmitter {
  /**
    * The delay in ms before the playback will begin.
    */
  var delay: integer = js.native
  /**
    * How long the animation should play for, in milliseconds.
    * If the `frameRate` property has been set then it overrides this value,
    * otherwise the `frameRate` is derived from `duration`.
    */
  var duration: integer = js.native
  /**
    * The frame rate of playback in frames per second (default 24 if duration is null)
    */
  var frameRate: integer = js.native
  /**
    * Extract all the frame data into the frames array.
    */
  var frames: js.Array[AnimationFrame] = js.native
  /**
    * Should the GameObject's `visible` property be set to `false` when the animation finishes?
    */
  var hideOnComplete: Boolean = js.native
  /**
    * The unique identifying string for this animation.
    */
  var key: String = js.native
  /**
    * A reference to the global Animation Manager.
    */
  var manager: AnimationManager = js.native
  /**
    * How many ms per frame, not including frame specific modifiers.
    */
  var msPerFrame: integer = js.native
  /**
    * Global pause. All Game Objects using this Animation instance are impacted by this property.
    */
  var paused: Boolean = js.native
  /**
    * Number of times to repeat the animation. Set to -1 to repeat forever.
    */
  var repeat: integer = js.native
  /**
    * The delay in ms before the a repeat play starts.
    */
  var repeatDelay: integer = js.native
  /**
    * Should the GameObject's `visible` property be set to `true` when the animation starts to play?
    */
  var showOnStart: Boolean = js.native
  /**
    * Skip frames if the time lags, or always advanced anyway?
    */
  var skipMissedFrames: Boolean = js.native
  /**
    * A frame based animation (as opposed to a bone based animation)
    */
  var `type`: String = js.native
  /**
    * Should the animation yoyo (reverse back down to the start) before repeating?
    */
  var yoyo: Boolean = js.native
  /**
    * Add frames to the end of the animation.
    * @param config Either a string, in which case it will use all frames from a texture with the matching key, or an array of Animation Frame configuration objects.
    */
  def addFrame(config: String): this.type = js.native
  def addFrame(config: js.Array[typings.phaser.Phaser.Types.Animations.AnimationFrame]): this.type = js.native
  /**
    * Add frame/s into the animation.
    * @param index The index to insert the frame at within the animation.
    * @param config Either a string, in which case it will use all frames from a texture with the matching key, or an array of Animation Frame configuration objects.
    */
  def addFrameAt(index: integer, config: String): this.type = js.native
  def addFrameAt(index: integer, config: js.Array[typings.phaser.Phaser.Types.Animations.AnimationFrame]): this.type = js.native
  /**
    * Check if the given frame index is valid.
    * @param index The index to be checked.
    */
  def checkFrame(index: integer): Boolean = js.native
  /**
    * Called internally when this Animation completes playback.
    * Optionally, hides the parent Game Object, then stops playback.
    * @param component The Animation Component belonging to the Game Object invoking this call.
    */
  /* protected */ def completeAnimation(component: typings.phaser.Phaser.GameObjects.Components.Animation): Unit = js.native
  /**
    * Called internally when this Animation first starts to play.
    * Sets the accumulator and nextTick properties.
    * @param component The Animation Component belonging to the Game Object invoking this call.
    * @param includeDelay If `true` the Animation Components delay value will be added to the `nextTick` total. Default true.
    */
  /* protected */ def getFirstTick(component: typings.phaser.Phaser.GameObjects.Components.Animation): Unit = js.native
  /* protected */ def getFirstTick(component: typings.phaser.Phaser.GameObjects.Components.Animation, includeDelay: Boolean): Unit = js.native
  /**
    * Returns the AnimationFrame at the provided index
    * @param index The index in the AnimationFrame array
    */
  /* protected */ def getFrameAt(index: integer): AnimationFrame = js.native
  /**
    * Returns the frame closest to the given progress value between 0 and 1.
    * @param value A value between 0 and 1.
    */
  def getFrameByProgress(value: Double): AnimationFrame = js.native
  /**
    * Creates AnimationFrame instances based on the given frame data.
    * @param textureManager A reference to the global Texture Manager.
    * @param frames Either a string, in which case it will use all frames from a texture with the matching key, or an array of Animation Frame configuration objects.
    * @param defaultTextureKey The key to use if no key is set in the frame configuration object.
    */
  def getFrames(textureManager: TextureManager, frames: String): js.Array[AnimationFrame] = js.native
  def getFrames(textureManager: TextureManager, frames: String, defaultTextureKey: String): js.Array[AnimationFrame] = js.native
  def getFrames(
    textureManager: TextureManager,
    frames: js.Array[typings.phaser.Phaser.Types.Animations.AnimationFrame]
  ): js.Array[AnimationFrame] = js.native
  def getFrames(
    textureManager: TextureManager,
    frames: js.Array[typings.phaser.Phaser.Types.Animations.AnimationFrame],
    defaultTextureKey: String
  ): js.Array[AnimationFrame] = js.native
  /**
    * Returns the animation last frame.
    */
  def getLastFrame(): AnimationFrame = js.native
  /**
    * Called internally. Sets the accumulator and nextTick values of the current Animation.
    * @param component The Animation Component belonging to the Game Object invoking this call.
    */
  def getNextTick(component: typings.phaser.Phaser.GameObjects.Components.Animation): Unit = js.native
  /**
    * Advance the animation frame.
    * @param component The Animation Component to advance.
    */
  def nextFrame(component: typings.phaser.Phaser.GameObjects.Components.Animation): Unit = js.native
  /**
    * Pauses playback of this Animation. The paused state is set immediately.
    */
  def pause(): this.type = js.native
  /**
    * Called internally when the Animation is playing backwards.
    * Sets the previous frame, causing a yoyo, repeat, complete or update, accordingly.
    * @param component The Animation Component belonging to the Game Object invoking this call.
    */
  def previousFrame(component: typings.phaser.Phaser.GameObjects.Components.Animation): Unit = js.native
  /**
    * Removes the given AnimationFrame from this Animation instance.
    * This is a global action. Any Game Object using this Animation will be impacted by this change.
    * @param frame The AnimationFrame to be removed.
    */
  def removeFrame(frame: AnimationFrame): this.type = js.native
  /**
    * Removes a frame from the AnimationFrame array at the provided index
    * and updates the animation accordingly.
    * @param index The index in the AnimationFrame array
    */
  def removeFrameAt(index: integer): this.type = js.native
  /**
    * Called internally during playback. Forces the animation to repeat, providing there are enough counts left
    * in the repeat counter.
    * @param component The Animation Component belonging to the Game Object invoking this call.
    */
  def repeatAnimation(component: typings.phaser.Phaser.GameObjects.Components.Animation): Unit = js.native
  /**
    * Resumes playback of this Animation. The paused state is reset immediately.
    */
  def resume(): this.type = js.native
  /**
    * Sets the texture frame the animation uses for rendering.
    * @param component The Animation Component belonging to the Game Object invoking this call.
    */
  def setFrame(component: typings.phaser.Phaser.GameObjects.Components.Animation): Unit = js.native
  /**
    * Converts the animation data to JSON.
    */
  def toJSON(): JSONAnimation = js.native
  /**
    * Called internally whenever frames are added to, or removed from, this Animation.
    */
  def updateFrameSequence(): this.type = js.native
}

