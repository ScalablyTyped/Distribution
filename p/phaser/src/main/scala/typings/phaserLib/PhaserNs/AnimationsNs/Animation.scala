package typings
package phaserLib.PhaserNs.AnimationsNs

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
class Animation protected ()
  extends phaserLib.PhaserNs.EventsNs.EventEmitter {
  /**
    * 
    * @param manager A reference to the global Animation Manager
    * @param key The unique identifying string for this animation.
    * @param config The Animation configuration.
    */
  def this(manager: AnimationManager, key: java.lang.String, config: phaserLib.PhaserNs.TypesNs.AnimationsNs.Animation) = this()
  /**
    * The delay in ms before the playback will begin.
    */
  var delay: phaserLib.integer = js.native
  /**
    * How long the animation should play for, in milliseconds.
    * If the `frameRate` property has been set then it overrides this value,
    * otherwise the `frameRate` is derived from `duration`.
    */
  var duration: phaserLib.integer = js.native
  /**
    * The frame rate of playback in frames per second (default 24 if duration is null)
    */
  var frameRate: phaserLib.integer = js.native
  /**
    * Extract all the frame data into the frames array.
    */
  var frames: js.Array[AnimationFrame] = js.native
  /**
    * Should the GameObject's `visible` property be set to `false` when the animation finishes?
    */
  var hideOnComplete: scala.Boolean = js.native
  /**
    * The unique identifying string for this animation.
    */
  var key: java.lang.String = js.native
  /**
    * A reference to the global Animation Manager.
    */
  var manager: AnimationManager = js.native
  /**
    * How many ms per frame, not including frame specific modifiers.
    */
  var msPerFrame: phaserLib.integer = js.native
  /**
    * Global pause. All Game Objects using this Animation instance are impacted by this property.
    */
  var paused: scala.Boolean = js.native
  /**
    * Number of times to repeat the animation. Set to -1 to repeat forever.
    */
  var repeat: phaserLib.integer = js.native
  /**
    * The delay in ms before the a repeat play starts.
    */
  var repeatDelay: phaserLib.integer = js.native
  /**
    * Should the GameObject's `visible` property be set to `true` when the animation starts to play?
    */
  var showOnStart: scala.Boolean = js.native
  /**
    * Skip frames if the time lags, or always advanced anyway?
    */
  var skipMissedFrames: scala.Boolean = js.native
  /**
    * A frame based animation (as opposed to a bone based animation)
    */
  var `type`: java.lang.String = js.native
  /**
    * Should the animation yoyo (reverse back down to the start) before repeating?
    */
  var yoyo: scala.Boolean = js.native
  /**
    * Add frames to the end of the animation.
    * @param config [description]
    */
  def addFrame(config: java.lang.String): Animation = js.native
  def addFrame(config: js.Array[phaserLib.PhaserNs.TypesNs.AnimationsNs.AnimationFrame]): Animation = js.native
  /**
    * Add frame/s into the animation.
    * @param index The index to insert the frame at within the animation.
    * @param config [description]
    */
  def addFrameAt(index: phaserLib.integer, config: java.lang.String): Animation = js.native
  def addFrameAt(index: phaserLib.integer, config: js.Array[phaserLib.PhaserNs.TypesNs.AnimationsNs.AnimationFrame]): Animation = js.native
  /**
    * Check if the given frame index is valid.
    * @param index The index to be checked.
    */
  def checkFrame(index: phaserLib.integer): scala.Boolean = js.native
  /**
    * [description]
    * @param component [description]
    */
  /* protected */ def completeAnimation(component: phaserLib.PhaserNs.GameObjectsNs.ComponentsNs.Animation): scala.Unit = js.native
  /**
    * [description]
    * @param component [description]
    * @param includeDelay [description] Default true.
    */
  /* protected */ def getFirstTick(component: phaserLib.PhaserNs.GameObjectsNs.ComponentsNs.Animation): scala.Unit = js.native
  /* protected */ def getFirstTick(component: phaserLib.PhaserNs.GameObjectsNs.ComponentsNs.Animation, includeDelay: scala.Boolean): scala.Unit = js.native
  /**
    * Returns the AnimationFrame at the provided index
    * @param index The index in the AnimationFrame array
    */
  /* protected */ def getFrameAt(index: phaserLib.integer): AnimationFrame = js.native
  /**
    * Returns the frame closest to the given progress value between 0 and 1.
    * @param value A value between 0 and 1.
    */
  def getFrameByProgress(value: scala.Double): AnimationFrame = js.native
  /**
    * [description]
    * @param textureManager [description]
    * @param frames [description]
    * @param defaultTextureKey [description]
    */
  def getFrames(textureManager: phaserLib.PhaserNs.TexturesNs.TextureManager, frames: java.lang.String): js.Array[AnimationFrame] = js.native
  def getFrames(
    textureManager: phaserLib.PhaserNs.TexturesNs.TextureManager,
    frames: java.lang.String,
    defaultTextureKey: java.lang.String
  ): js.Array[AnimationFrame] = js.native
  def getFrames(
    textureManager: phaserLib.PhaserNs.TexturesNs.TextureManager,
    frames: js.Array[phaserLib.PhaserNs.TypesNs.AnimationsNs.AnimationFrame]
  ): js.Array[AnimationFrame] = js.native
  def getFrames(
    textureManager: phaserLib.PhaserNs.TexturesNs.TextureManager,
    frames: js.Array[phaserLib.PhaserNs.TypesNs.AnimationsNs.AnimationFrame],
    defaultTextureKey: java.lang.String
  ): js.Array[AnimationFrame] = js.native
  /**
    * Returns the animation last frame.
    */
  def getLastFrame(): AnimationFrame = js.native
  /**
    * [description]
    * @param component [description]
    */
  def getNextTick(component: phaserLib.PhaserNs.GameObjectsNs.ComponentsNs.Animation): scala.Unit = js.native
  /**
    * Advance the animation frame.
    * @param component The Animation Component to advance.
    */
  def nextFrame(component: phaserLib.PhaserNs.GameObjectsNs.ComponentsNs.Animation): scala.Unit = js.native
  /**
    * [description]
    */
  def pause(): Animation = js.native
  /**
    * [description]
    * @param component [description]
    */
  def previousFrame(component: phaserLib.PhaserNs.GameObjectsNs.ComponentsNs.Animation): scala.Unit = js.native
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
  def removeFrameAt(index: phaserLib.integer): Animation = js.native
  /**
    * [description]
    * @param component [description]
    */
  def repeatAnimation(component: phaserLib.PhaserNs.GameObjectsNs.ComponentsNs.Animation): scala.Unit = js.native
  /**
    * [description]
    */
  def resume(): Animation = js.native
  /**
    * Sets the texture frame the animation uses for rendering.
    * @param component [description]
    */
  def setFrame(component: phaserLib.PhaserNs.GameObjectsNs.ComponentsNs.Animation): scala.Unit = js.native
  /**
    * Converts the animation data to JSON.
    */
  def toJSON(): phaserLib.PhaserNs.TypesNs.AnimationsNs.JSONAnimation = js.native
  /**
    * [description]
    */
  def updateFrameSequence(): Animation = js.native
}

