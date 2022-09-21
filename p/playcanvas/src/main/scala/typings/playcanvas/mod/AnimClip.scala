package typings.playcanvas.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** @typedef {import('./anim-track.js').AnimTrack} AnimTrack */
/** @typedef {import('../../core/event-handler.js').EventHandler} EventHandler */
/**
  * AnimClip wraps the running state of an animation track. It contains and update the animation
  * 'cursor' and performs looping logic.
  *
  * @ignore
  */
@JSImport("playcanvas", "AnimClip")
@js.native
open class AnimClip protected () extends StObject {
  /**
    * Create a new animation clip.
    *
    * @param {AnimTrack} track - The animation data.
    * @param {number} time - The initial time of the clip.
    * @param {number} speed - Speed of the animation playback.
    * @param {boolean} playing - true if the clip is playing and false otherwise.
    * @param {boolean} loop - Whether the clip should loop.
    * @param {EventHandler} [eventHandler] - The handler to call when an event is fired by the clip.
    */
  def this(track: AnimTrack, time: Double, speed: Double, playing: Boolean, loop: Boolean) = this()
  def this(
    track: AnimTrack,
    time: Double,
    speed: Double,
    playing: Boolean,
    loop: Boolean,
    eventHandler: EventHandler
  ) = this()
  
  var _blendOrder: Double = js.native
  
  var _blendWeight: Double = js.native
  
  var _eventCursor: Double = js.native
  
  var _eventHandler: EventHandler = js.native
  
  var _loop: Boolean = js.native
  
  var _name: String = js.native
  
  var _playing: Boolean = js.native
  
  var _snapshot: AnimSnapshot = js.native
  
  var _speed: Double = js.native
  
  var _time: Double = js.native
  
  var _track: AnimTrack = js.native
  
  def _update(deltaTime: Any): Unit = js.native
  
  def activeEventsForFrame(frameStartTime: Any, frameEndTime: Any): Unit = js.native
  
  def blendOrder: Double = js.native
  def blendOrder_=(arg: Double): Unit = js.native
  
  def blendWeight: Double = js.native
  def blendWeight_=(arg: Double): Unit = js.native
  
  def eventCursor: Double = js.native
  def eventCursor_=(arg: Double): Unit = js.native
  
  def loop: Boolean = js.native
  def loop_=(arg: Boolean): Unit = js.native
  
  def name: String = js.native
  def name_=(arg: String): Unit = js.native
  
  def pause(): Unit = js.native
  
  def play(): Unit = js.native
  
  def reset(): Unit = js.native
  
  def resume(): Unit = js.native
  
  def snapshot: AnimSnapshot = js.native
  
  def speed: Double = js.native
  def speed_=(arg: Double): Unit = js.native
  
  def stop(): Unit = js.native
  
  def time: Double = js.native
  def time_=(arg: Double): Unit = js.native
  
  def track: AnimTrack = js.native
}
