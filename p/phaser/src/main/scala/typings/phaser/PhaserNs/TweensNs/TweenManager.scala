package typings.phaser.PhaserNs.TweensNs

import typings.phaser.PhaserNs.Scene
import typings.phaser.PhaserNs.ScenesNs.Systems
import typings.phaser.PhaserNs.TypesNs.TweensNs.NumberTweenBuilderConfig
import typings.phaser.PhaserNs.TypesNs.TweensNs.TimelineBuilderConfig
import typings.phaser.PhaserNs.TypesNs.TweensNs.TweenBuilderConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The Tween Manager is a default Scene Plugin which controls and updates Tweens and Timelines.
  */
@JSGlobal("Phaser.Tweens.TweenManager")
@js.native
class TweenManager protected () extends js.Object {
  /**
    * 
    * @param scene The Scene which owns this Tween Manager.
    */
  def this(scene: Scene) = this()
  /**
    * The Scene which owns this Tween Manager.
    */
  var scene: Scene = js.native
  /**
    * The Systems object of the Scene which owns this Tween Manager.
    */
  var systems: Systems = js.native
  /**
    * The time scale of the Tween Manager.
    * 
    * This value scales the time delta between two frames, thus influencing the speed of time for all Tweens owned by this Tween Manager.
    */
  var timeScale: Double = js.native
  def add(config: js.Object): Tween = js.native
  /**
    * Create a Tween and add it to the active Tween list.
    * @param config The configuration object for the Tween.
    */
  def add(config: TweenBuilderConfig): Tween = js.native
  /**
    * Create a Number Tween and add it to the active Tween list.
    * @param config The configuration object for the Number Tween.
    */
  def addCounter(config: NumberTweenBuilderConfig): Tween = js.native
  def create(config: js.Object): Tween = js.native
  /**
    * Create a Tween and return it, but do NOT add it to the active or pending Tween lists.
    * @param config The configuration object for the Tween.
    */
  def create(config: TweenBuilderConfig): Tween = js.native
  /**
    * Create a Tween Timeline and return it, but do NOT add it to the active or pending Tween lists.
    * @param config The configuration object for the Timeline and its Tweens.
    */
  def createTimeline(config: TimelineBuilderConfig): Timeline = js.native
  /**
    * The Scene that owns this plugin is being destroyed.
    * We need to shutdown and then kill off all external references.
    */
  def destroy(): Unit = js.native
  /**
    * Passes all Tweens to the given callback.
    * @param callback The function to call.
    * @param scope The scope (`this` object) to call the function with.
    * @param args The arguments to pass into the function. Its first argument will always be the Tween currently being iterated.
    */
  def each(callback: js.Function): Unit = js.native
  def each(callback: js.Function, scope: js.Object, args: js.Any*): Unit = js.native
  /**
    * Add an existing tween into the active Tween list.
    * @param tween The Tween to add.
    */
  def existing(tween: Tween): TweenManager = js.native
  /**
    * Returns an array of all active Tweens and Timelines in the Tween Manager.
    */
  def getAllTweens(): js.Array[Tween] = js.native
  /**
    * Returns the scale of the time delta for all Tweens and Timelines owned by this Tween Manager.
    */
  def getGlobalTimeScale(): Double = js.native
  def getTweensOf(target: js.Array[_]): js.Array[Tween] = js.native
  /**
    * Returns an array of all Tweens or Timelines in the Tween Manager which affect the given target or array of targets.
    * @param target The target to look for. Provide an array to look for multiple targets.
    */
  def getTweensOf(target: js.Object): js.Array[Tween] = js.native
  /**
    * Checks if the given object is being affected by a playing Tween.
    * @param target target Phaser.Tweens.Tween object
    */
  def isTweening(target: js.Object): Boolean = js.native
  /**
    * Stops all Tweens in this Tween Manager. They will be removed at the start of the frame.
    */
  def killAll(): TweenManager = js.native
  def killTweensOf(target: js.Array[_]): TweenManager = js.native
  /**
    * Stops all Tweens which affect the given target or array of targets. The Tweens will be removed from the Tween Manager at the start of the frame.
    * @param target The target to look for. Provide an array to look for multiple targets.
    */
  def killTweensOf(target: js.Object): TweenManager = js.native
  /**
    * Checks if a Tween or Timeline is active and adds it to the Tween Manager at the start of the frame if it isn't.
    * @param tween The Tween to check.
    */
  def makeActive(tween: Tween): TweenManager = js.native
  /**
    * Pauses all Tweens in this Tween Manager.
    */
  def pauseAll(): TweenManager = js.native
  /**
    * Updates the Tween Manager's internal lists at the start of the frame.
    * 
    * This method will return immediately if no changes have been indicated.
    */
  def preUpdate(): Unit = js.native
  /**
    * Removes the given tween from the Tween Manager, regardless of its state (pending or active).
    * @param tween The Tween to be removed.
    */
  def remove(tween: Tween): TweenManager = js.native
  /**
    * Resumes all Tweens in this Tween Manager.
    */
  def resumeAll(): TweenManager = js.native
  /**
    * Sets a new scale of the time delta for this Tween Manager.
    * 
    * The time delta is the time elapsed between two consecutive frames and influences the speed of time for this Tween Manager and all Tweens it owns. Values higher than 1 increase the speed of time, while values smaller than 1 decrease it. A value of 0 freezes time and is effectively equivalent to pausing all Tweens.
    * @param value The new scale of the time delta, where 1 is the normal speed.
    */
  def setGlobalTimeScale(value: Double): TweenManager = js.native
  /**
    * The Scene that owns this plugin is shutting down.
    * We need to kill and reset all internal properties as well as stop listening to Scene events.
    */
  def shutdown(): Unit = js.native
  /**
    * Create a Tween Timeline and add it to the active Tween list/
    * @param config The configuration object for the Timeline and its Tweens.
    */
  def timeline(config: TimelineBuilderConfig): Timeline = js.native
  /**
    * Updates all Tweens and Timelines of the Tween Manager.
    * @param timestamp The current time in milliseconds.
    * @param delta The delta time in ms since the last frame. This is a smoothed and capped value based on the FPS rate.
    */
  def update(timestamp: Double, delta: Double): Unit = js.native
}

