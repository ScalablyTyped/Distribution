package typings.phaser.PhaserNs.AnimationsNs

import typings.phaser.PhaserNs.EventsNs.EventEmitter
import typings.phaser.PhaserNs.TexturesNs.TextureManager
import typings.phaser.PhaserNs.TypesNs.AnimationsNs.JSONAnimation
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
@JSGlobal("Phaser.Animations.Animation")
@js.native
class Animation protected () extends EventEmitter {
  /**
    * 
    * @param manager A reference to the global Animation Manager
    * @param key The unique identifying string for this animation.
    * @param config The Animation configuration.
    */
  def this(
    manager: AnimationManager,
    key: String,
    config: typings.phaser.PhaserNs.TypesNs.AnimationsNs.Animation
  ) = this()
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
    * @param config [description]
    */
  def addFrame(config: String): Animation = js.native
  def addFrame(config: js.Array[typings.phaser.PhaserNs.TypesNs.AnimationsNs.AnimationFrame]): Animation = js.native
  /**
    * Add frame/s into the animation.
    * @param index The index to insert the frame at within the animation.
    * @param config [description]
    */
  def addFrameAt(index: integer, config: String): Animation = js.native
  def addFrameAt(index: integer, config: js.Array[typings.phaser.PhaserNs.TypesNs.AnimationsNs.AnimationFrame]): Animation = js.native
  /**
    * Check if the given frame index is valid.
    * @param index The index to be checked.
    */
  def checkFrame(index: integer): Boolean = js.native
  /**
    * [description]
    * @param component [description]
    */
  /* protected */ def completeAnimation(component: typings.phaser.PhaserNs.GameObjectsNs.ComponentsNs.Animation): Unit = js.native
  /**
    * [description]
    * @param component [description]
    * @param includeDelay [description] Default true.
    */
  /* protected */ def getFirstTick(component: typings.phaser.PhaserNs.GameObjectsNs.ComponentsNs.Animation): Unit = js.native
  /* protected */ def getFirstTick(component: typings.phaser.PhaserNs.GameObjectsNs.ComponentsNs.Animation, includeDelay: Boolean): Unit = js.native
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
    * [description]
    * @param textureManager [description]
    * @param frames [description]
    * @param defaultTextureKey [description]
    */
  def getFrames(textureManager: TextureManager, frames: String): js.Array[AnimationFrame] = js.native
  def getFrames(textureManager: TextureManager, frames: String, defaultTextureKey: String): js.Array[AnimationFrame] = js.native
  def getFrames(
    textureManager: TextureManager,
    frames: js.Array[typings.phaser.PhaserNs.TypesNs.AnimationsNs.AnimationFrame]
  ): js.Array[AnimationFrame] = js.native
  def getFrames(
    textureManager: TextureManager,
    frames: js.Array[typings.phaser.PhaserNs.TypesNs.AnimationsNs.AnimationFrame],
    defaultTextureKey: String
  ): js.Array[AnimationFrame] = js.native
  /**
    * Returns the animation last frame.
    */
  def getLastFrame(): AnimationFrame = js.native
  /**
    * [description]
    * @param component [description]
    */
  def getNextTick(component: typings.phaser.PhaserNs.GameObjectsNs.ComponentsNs.Animation): Unit = js.native
  /**
    * Advance the animation frame.
    * @param component The Animation Component to advance.
    */
  def nextFrame(component: typings.phaser.PhaserNs.GameObjectsNs.ComponentsNs.Animation): Unit = js.native
  /**
    * [description]
    */
  def pause(): Animation = js.native
  /**
    * [description]
    * @param component [description]
    */
  def previousFrame(component: typings.phaser.PhaserNs.GameObjectsNs.ComponentsNs.Animation): Unit = js.native
  /**
    * [description]
    * @param frame [description]
    */
  def removeFrame(frame: AnimationFrame): Animation = js.native
  /**
    * Removes a frame from the AnimationFrame array at the provided index
    * and updates the animation accordingly.
    * @param index The index in the AnimationFrame array
    */
  def removeFrameAt(index: integer): Animation = js.native
  /**
    * [description]
    * @param component [description]
    */
  def repeatAnimation(component: typings.phaser.PhaserNs.GameObjectsNs.ComponentsNs.Animation): Unit = js.native
  /**
    * [description]
    */
  def resume(): Animation = js.native
  /**
    * Sets the texture frame the animation uses for rendering.
    * @param component [description]
    */
  def setFrame(component: typings.phaser.PhaserNs.GameObjectsNs.ComponentsNs.Animation): Unit = js.native
  /**
    * Converts the animation data to JSON.
    */
  def toJSON(): JSONAnimation = js.native
  /**
    * [description]
    */
  def updateFrameSequence(): Animation = js.native
}

