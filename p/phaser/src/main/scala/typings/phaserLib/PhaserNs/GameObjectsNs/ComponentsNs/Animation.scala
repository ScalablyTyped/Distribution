package typings
package phaserLib.PhaserNs.GameObjectsNs.ComponentsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Animation extends js.Object {
  /**
    * Internal time overflow accumulator.
    */
  var accumulator: scala.Double = js.native
  /**
    * A reference to the global Animation Manager.
    */
  var animationManager: phaserLib.PhaserNs.AnimationsNs.AnimationManager = js.native
  /**
    * The current Animation loaded into this Animation Controller.
    */
  var currentAnim: phaserLib.PhaserNs.AnimationsNs.Animation = js.native
  /**
    * The current AnimationFrame being displayed by this Animation Controller.
    */
  var currentFrame: phaserLib.PhaserNs.AnimationsNs.AnimationFrame = js.native
  /**
    * How long the animation should play for, in milliseconds.
    * If the `frameRate` property has been set then it overrides this value,
    * otherwise the `frameRate` is derived from `duration`.
    */
  var duration: scala.Double = js.native
  /**
    * Will the playhead move forwards (`true`) or in reverse (`false`).
    */
  var forward: scala.Boolean = js.native
  /**
    * The frame rate of playback in frames per second.
    * The default is 24 if the `duration` property is `null`.
    */
  var frameRate: scala.Double = js.native
  /**
    * `true` if the current animation is paused, otherwise `false`.
    */
  val isPaused: scala.Boolean = js.native
  /**
    * Is an animation currently playing or not?
    */
  var isPlaying: scala.Boolean = js.native
  /**
    * ms per frame, not including frame specific modifiers that may be present in the Animation data.
    */
  var msPerFrame: scala.Double = js.native
  /**
    * The key of the next Animation to be loaded into this Animation Controller when the current animation completes.
    */
  var nextAnim: java.lang.String = js.native
  /**
    * The time point at which the next animation frame will change.
    */
  var nextTick: scala.Double = js.native
  /**
    * The Game Object to which this animation controller belongs.
    */
  var parent: phaserLib.PhaserNs.GameObjectsNs.GameObject = js.native
  /**
    * An internal flag keeping track of pending repeats.
    */
  var pendingRepeat: scala.Boolean = js.native
  /**
    * An internal counter keeping track of how many repeats are left to play.
    */
  var repeatCounter: scala.Double = js.native
  /**
    * Skip frames if the time lags, or always advanced anyway?
    */
  var skipMissedFrames: scala.Boolean = js.native
  /**
    * Load an Animation and fires 'onStartEvent' event, extracted from 'play' method.
    * @param key The string-based key of the animation to play, as defined previously in the Animation Manager.
    * @param startFrame Optionally start the animation playing from this frame index. Default 0.
    */
  def _startAnimation(key: java.lang.String): phaserLib.PhaserNs.GameObjectsNs.GameObject = js.native
  def _startAnimation(key: java.lang.String, startFrame: phaserLib.integer): phaserLib.PhaserNs.GameObjectsNs.GameObject = js.native
  /**
    * Sets an animation to be played immediately after the current one completes.
    * 
    * The current animation must enter a 'completed' state for this to happen, i.e. finish all of its repeats, delays, etc, or have the `stop` method called directly on it.
    * 
    * An animation set to repeat forever will never enter a completed state.
    * 
    * You can chain a new animation at any point, including before the current one starts playing, during it, or when it ends (via its `animationcomplete` callback).
    * Chained animations are specific to a Game Object, meaning different Game Objects can have different chained animations without impacting the global animation they're playing.
    * 
    * Call this method with no arguments to reset the chained animation.
    * @param key The string-based key of the animation to play next, as defined previously in the Animation Manager. Or an Animation instance.
    */
  def chain(): phaserLib.PhaserNs.GameObjectsNs.GameObject = js.native
  def chain(key: java.lang.String): phaserLib.PhaserNs.GameObjectsNs.GameObject = js.native
  def chain(key: phaserLib.PhaserNs.AnimationsNs.Animation): phaserLib.PhaserNs.GameObjectsNs.GameObject = js.native
  /**
    * Waits for the specified delay, in milliseconds, then starts playback of the requested animation.
    * @param delay The delay, in milliseconds, to wait before starting the animation playing.
    * @param key The key of the animation to play.
    * @param startFrame The frame of the animation to start from. Default 0.
    */
  def delayedPlay(delay: phaserLib.integer, key: java.lang.String): phaserLib.PhaserNs.GameObjectsNs.GameObject = js.native
  def delayedPlay(delay: phaserLib.integer, key: java.lang.String, startFrame: phaserLib.integer): phaserLib.PhaserNs.GameObjectsNs.GameObject = js.native
  /**
    * Destroy this Animation component.
    * 
    * Unregisters event listeners and cleans up its references.
    */
  def destroy(): scala.Unit = js.native
  /**
    * Returns the key of the animation currently loaded into this component.
    */
  def getCurrentKey(): java.lang.String = js.native
  /**
    * Gets the amount of time, in milliseconds that the animation will be delayed before starting playback.
    */
  def getDelay(): phaserLib.integer = js.native
  /**
    * Returns a value between 0 and 1 indicating how far this animation is through, ignoring repeats and yoyos.
    * If the animation has a non-zero repeat defined, `getProgress` and `getTotalProgress` will be different
    * because `getProgress` doesn't include any repeats or repeat delays, whereas `getTotalProgress` does.
    */
  def getProgress(): scala.Double = js.native
  /**
    * Gets the number of times that the animation will repeat
    * after its first iteration. For example, if returns 1, the animation will
    * play a total of twice (the initial play plus 1 repeat).
    * A value of -1 means the animation will repeat indefinitely.
    */
  def getRepeat(): phaserLib.integer = js.native
  /**
    * Gets the amount of delay between repeats, if any.
    */
  def getRepeatDelay(): scala.Double = js.native
  /**
    * Gets the Time Scale factor.
    */
  def getTimeScale(): scala.Double = js.native
  /**
    * Returns the total number of frames in this animation.
    */
  def getTotalFrames(): phaserLib.integer = js.native
  /**
    * Gets if the current Animation will yoyo when it reaches the end.
    * A yoyo'ing animation will play through consecutively, and then reverse-play back to the start again.
    */
  def getYoyo(): scala.Boolean = js.native
  /**
    * Internal method used to load an animation into this component.
    * @param key The key of the animation to load.
    * @param startFrame The start frame of the animation to load. Default 0.
    */
  def load(key: java.lang.String): phaserLib.PhaserNs.GameObjectsNs.GameObject = js.native
  def load(key: java.lang.String, startFrame: phaserLib.integer): phaserLib.PhaserNs.GameObjectsNs.GameObject = js.native
  /**
    * Advances the animation to the next frame, regardless of the time or animation state.
    * If the animation is set to repeat, or yoyo, this will still take effect.
    * 
    * Calling this does not change the direction of the animation. I.e. if it was currently
    * playing in reverse, calling this method doesn't then change the direction to forwards.
    */
  def nextFrame(): phaserLib.PhaserNs.GameObjectsNs.GameObject = js.native
  /**
    * Pause the current animation and set the `isPlaying` property to `false`.
    * You can optionally pause it at a specific frame.
    * @param atFrame An optional frame to set after pausing the animation.
    */
  def pause(): phaserLib.PhaserNs.GameObjectsNs.GameObject = js.native
  def pause(atFrame: phaserLib.PhaserNs.AnimationsNs.AnimationFrame): phaserLib.PhaserNs.GameObjectsNs.GameObject = js.native
  /**
    * Plays an Animation on a Game Object that has the Animation component, such as a Sprite.
    * 
    * Animations are stored in the global Animation Manager and are referenced by a unique string-based key.
    * @param key The string-based key of the animation to play, as defined previously in the Animation Manager. Or an Animation instance.
    * @param ignoreIfPlaying If this animation is already playing then ignore this call. Default false.
    * @param startFrame Optionally start the animation playing from this frame index. Default 0.
    */
  def play(key: java.lang.String): phaserLib.PhaserNs.GameObjectsNs.GameObject = js.native
  def play(key: java.lang.String, ignoreIfPlaying: scala.Boolean): phaserLib.PhaserNs.GameObjectsNs.GameObject = js.native
  def play(key: java.lang.String, ignoreIfPlaying: scala.Boolean, startFrame: phaserLib.integer): phaserLib.PhaserNs.GameObjectsNs.GameObject = js.native
  def play(key: phaserLib.PhaserNs.AnimationsNs.Animation): phaserLib.PhaserNs.GameObjectsNs.GameObject = js.native
  def play(key: phaserLib.PhaserNs.AnimationsNs.Animation, ignoreIfPlaying: scala.Boolean): phaserLib.PhaserNs.GameObjectsNs.GameObject = js.native
  def play(
    key: phaserLib.PhaserNs.AnimationsNs.Animation,
    ignoreIfPlaying: scala.Boolean,
    startFrame: phaserLib.integer
  ): phaserLib.PhaserNs.GameObjectsNs.GameObject = js.native
  /**
    * Plays an Animation (in reverse mode) on the Game Object that owns this Animation Component.
    * @param key The string-based key of the animation to play, as defined previously in the Animation Manager. Or an Animation instance.
    * @param ignoreIfPlaying If an animation is already playing then ignore this call. Default false.
    * @param startFrame Optionally start the animation playing from this frame index. Default 0.
    */
  def playReverse(key: java.lang.String): phaserLib.PhaserNs.GameObjectsNs.GameObject = js.native
  def playReverse(key: java.lang.String, ignoreIfPlaying: scala.Boolean): phaserLib.PhaserNs.GameObjectsNs.GameObject = js.native
  def playReverse(key: java.lang.String, ignoreIfPlaying: scala.Boolean, startFrame: phaserLib.integer): phaserLib.PhaserNs.GameObjectsNs.GameObject = js.native
  def playReverse(key: phaserLib.PhaserNs.AnimationsNs.Animation): phaserLib.PhaserNs.GameObjectsNs.GameObject = js.native
  def playReverse(key: phaserLib.PhaserNs.AnimationsNs.Animation, ignoreIfPlaying: scala.Boolean): phaserLib.PhaserNs.GameObjectsNs.GameObject = js.native
  def playReverse(
    key: phaserLib.PhaserNs.AnimationsNs.Animation,
    ignoreIfPlaying: scala.Boolean,
    startFrame: phaserLib.integer
  ): phaserLib.PhaserNs.GameObjectsNs.GameObject = js.native
  /**
    * Advances the animation to the previous frame, regardless of the time or animation state.
    * If the animation is set to repeat, or yoyo, this will still take effect.
    * 
    * Calling this does not change the direction of the animation. I.e. if it was currently
    * playing in forwards, calling this method doesn't then change the direction to backwards.
    */
  def previousFrame(): phaserLib.PhaserNs.GameObjectsNs.GameObject = js.native
  /**
    * Handle the removal of an animation from the Animation Manager.
    * @param key The key of the removed Animation.
    * @param animation The removed Animation.
    */
  def remove(): scala.Unit = js.native
  def remove(key: java.lang.String): scala.Unit = js.native
  def remove(key: java.lang.String, animation: phaserLib.PhaserNs.AnimationsNs.Animation): scala.Unit = js.native
  /**
    * Restarts the current animation from its beginning, optionally including its delay value.
    * @param includeDelay Whether to include the delay value of the animation when restarting. Default false.
    */
  def restart(): phaserLib.PhaserNs.GameObjectsNs.GameObject = js.native
  def restart(includeDelay: scala.Boolean): phaserLib.PhaserNs.GameObjectsNs.GameObject = js.native
  /**
    * Resumes playback of a paused animation and sets the `isPlaying` property to `true`.
    * You can optionally tell it to start playback from a specific frame.
    * @param fromFrame An optional frame to set before restarting playback.
    */
  def resume(): phaserLib.PhaserNs.GameObjectsNs.GameObject = js.native
  def resume(fromFrame: phaserLib.PhaserNs.AnimationsNs.AnimationFrame): phaserLib.PhaserNs.GameObjectsNs.GameObject = js.native
  /**
    * Reverse the Animation that is already playing on the Game Object.
    */
  def reverse(): phaserLib.PhaserNs.GameObjectsNs.GameObject = js.native
  /**
    * Sets the given Animation Frame as being the current frame
    * and applies it to the parent Game Object, adjusting its size and origin as needed.
    * @param animationFrame The Animation Frame to set as being current.
    */
  def setCurrentFrame(animationFrame: phaserLib.PhaserNs.AnimationsNs.AnimationFrame): phaserLib.PhaserNs.GameObjectsNs.GameObject = js.native
  /**
    * Sets the amount of time, in milliseconds, that the animation will be delayed before starting playback.
    * @param value The amount of time, in milliseconds, to wait before starting playback. Default 0.
    */
  def setDelay(): phaserLib.PhaserNs.GameObjectsNs.GameObject = js.native
  def setDelay(value: phaserLib.integer): phaserLib.PhaserNs.GameObjectsNs.GameObject = js.native
  /**
    * Takes a value between 0 and 1 and uses it to set how far this animation is through playback.
    * Does not factor in repeats or yoyos, but does handle playing forwards or backwards.
    * @param value The progress value, between 0 and 1. Default 0.
    */
  def setProgress(): phaserLib.PhaserNs.GameObjectsNs.GameObject = js.native
  def setProgress(value: scala.Double): phaserLib.PhaserNs.GameObjectsNs.GameObject = js.native
  /**
    * Sets the number of times that the animation should repeat
    * after its first iteration. For example, if repeat is 1, the animation will
    * play a total of twice (the initial play plus 1 repeat).
    * To repeat indefinitely, use -1. repeat should always be an integer.
    * @param value The number of times that the animation should repeat.
    */
  def setRepeat(value: phaserLib.integer): phaserLib.PhaserNs.GameObjectsNs.GameObject = js.native
  /**
    * Sets the amount of time in seconds between repeats.
    * For example, if `repeat` is 2 and `repeatDelay` is 10, the animation will play initially,
    * then wait for 10 seconds before repeating, then play again, then wait another 10 seconds
    * before doing its final repeat.
    * @param value The delay to wait between repeats, in seconds.
    */
  def setRepeatDelay(value: scala.Double): phaserLib.PhaserNs.GameObjectsNs.GameObject = js.native
  /**
    * Sets the Time Scale factor, allowing you to make the animation go go faster or slower than default.
    * Where 1 = normal speed (the default), 0.5 = half speed, 2 = double speed, etc.
    * @param value The time scale factor, where 1 is no change, 0.5 is half speed, etc. Default 1.
    */
  def setTimeScale(): phaserLib.PhaserNs.GameObjectsNs.GameObject = js.native
  def setTimeScale(value: scala.Double): phaserLib.PhaserNs.GameObjectsNs.GameObject = js.native
  /**
    * Sets if the current Animation will yoyo when it reaches the end.
    * A yoyo'ing animation will play through consecutively, and then reverse-play back to the start again.
    * @param value `true` if the animation should yoyo, `false` to not. Default false.
    */
  def setYoyo(): phaserLib.PhaserNs.GameObjectsNs.GameObject = js.native
  def setYoyo(value: scala.Boolean): phaserLib.PhaserNs.GameObjectsNs.GameObject = js.native
  /**
    * Immediately stops the current animation from playing and dispatches the `animationcomplete` event.
    * 
    * If no animation is set, no event will be dispatched.
    * 
    * If there is another animation queued (via the `chain` method) then it will start playing immediately.
    */
  def stop(): phaserLib.PhaserNs.GameObjectsNs.GameObject = js.native
  /**
    * Stops the current animation from playing after the specified time delay, given in milliseconds.
    * @param delay The number of milliseconds to wait before stopping this animation.
    */
  def stopAfterDelay(delay: phaserLib.integer): phaserLib.PhaserNs.GameObjectsNs.GameObject = js.native
  /**
    * Stops the current animation from playing when it next sets the given frame.
    * If this frame doesn't exist within the animation it will not stop it from playing.
    * @param frame The frame to check before stopping this animation.
    */
  def stopOnFrame(frame: phaserLib.PhaserNs.AnimationsNs.AnimationFrame): phaserLib.PhaserNs.GameObjectsNs.GameObject = js.native
  /**
    * Stops the current animation from playing when it next repeats.
    */
  def stopOnRepeat(): phaserLib.PhaserNs.GameObjectsNs.GameObject = js.native
  /**
    * The internal update loop for the Animation Component.
    * @param time The current timestamp.
    * @param delta The delta time, in ms, elapsed since the last frame.
    */
  def update(time: scala.Double, delta: scala.Double): scala.Unit = js.native
}

