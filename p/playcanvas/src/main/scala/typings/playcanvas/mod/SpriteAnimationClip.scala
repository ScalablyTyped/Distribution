package typings.playcanvas.mod

import typings.playcanvas.anon.Fps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** @typedef {import('../../../scene/sprite.js').Sprite} Sprite */
/** @typedef {import('./component.js').SpriteComponent} SpriteComponent */
/**
  * Handles playing of sprite animations and loading of relevant sprite assets.
  *
  * @augments EventHandler
  */
@JSImport("playcanvas", "SpriteAnimationClip")
@js.native
open class SpriteAnimationClip protected () extends EventHandler {
  /**
    * Create a new SpriteAnimationClip instance.
    *
    * @param {SpriteComponent} component - The sprite component managing this clip.
    * @param {object} data - Data for the new animation clip.
    * @param {number} [data.fps] - Frames per second for the animation clip.
    * @param {boolean} [data.loop] - Whether to loop the animation clip.
    * @param {string} [data.name] - The name of the new animation clip.
    * @param {number} [data.spriteAsset] - The id of the sprite asset that this clip will play.
    */
  def this(component: SpriteComponent, data: Fps) = this()
  
  def _bindSpriteAsset(asset: Any): Unit = js.native
  
  var _component: SpriteComponent = js.native
  
  def _destroy(): Unit = js.native
  
  var _frame: Double = js.native
  
  def _onSpriteAssetAdded(asset: Any): Unit = js.native
  
  def _onSpriteAssetLoad(asset: Any): Unit = js.native
  
  def _onSpriteAssetRemove(asset: Any): Unit = js.native
  
  def _onSpriteMeshesChange(): Unit = js.native
  
  def _onSpritePpuChanged(): Unit = js.native
  
  def _onTextureAtlasLoad(atlasAsset: Any): Unit = js.native
  
  var _paused: Boolean = js.native
  
  var _playing: Boolean = js.native
  
  def _setFrame(value: Any): Unit = js.native
  
  def _setTime(value: Any): Unit = js.native
  
  var _sprite: Any = js.native
  
  var _spriteAsset: Any = js.native
  
  var _time: Double = js.native
  
  def _unbindSpriteAsset(asset: Any): Unit = js.native
  
  /**
    * Advances the animation, looping if necessary.
    *
    * @param {number} dt - The delta time.
    * @private
    */
  /* private */ var _update: Any = js.native
  
  /**
    * Fired when the clip starts playing.
    *
    * @event SpriteAnimationClip#play
    */
  /**
    * Fired when the clip is paused.
    *
    * @event SpriteAnimationClip#pause
    */
  /**
    * Fired when the clip is resumed.
    *
    * @event SpriteAnimationClip#resume
    */
  /**
    * Fired when the clip is stopped.
    *
    * @event SpriteAnimationClip#stop
    */
  /**
    * Fired when the clip stops playing because it reached its ending.
    *
    * @event SpriteAnimationClip#end
    */
  /**
    * Fired when the clip reached the end of its current loop.
    *
    * @event SpriteAnimationClip#loop
    */
  /**
    * The total duration of the animation in seconds.
    *
    * @type {number}
    */
  def duration: Double = js.native
  
  var fps: Double = js.native
  
  def frame: Double = js.native
  /**
    * The index of the frame of the {@link Sprite} currently being rendered.
    *
    * @type {number}
    */
  def frame_=(arg: Double): Unit = js.native
  
  /**
    * Whether the animation is currently paused.
    *
    * @type {boolean}
    */
  def isPaused: Boolean = js.native
  
  /**
    * Whether the animation is currently playing.
    *
    * @type {boolean}
    */
  def isPlaying: Boolean = js.native
  
  var loop: Boolean = js.native
  
  var name: String = js.native
  
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
  
  def sprite: Any = js.native
  
  def spriteAsset: Any = js.native
  /**
    * The id of the sprite asset used to play the animation.
    *
    * @type {number}
    */
  def spriteAsset_=(arg: Any): Unit = js.native
  
  /**
    * The current sprite used to play the animation.
    *
    * @type {Sprite}
    */
  def sprite_=(arg: Any): Unit = js.native
  
  /**
    * Stops the animation and resets the animation to the first frame.
    */
  def stop(): Unit = js.native
  
  def time: Double = js.native
  /**
    * The current time of the animation in seconds.
    *
    * @type {number}
    */
  def time_=(arg: Double): Unit = js.native
}
