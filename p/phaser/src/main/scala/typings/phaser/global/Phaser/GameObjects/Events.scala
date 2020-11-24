package typings.phaser.global.Phaser.GameObjects

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Phaser.GameObjects.Events")
@js.native
object Events extends js.Object {
  
  /**
    * The Game Object Destroy Event.
    * 
    * This event is dispatched when a Game Object instance is being destroyed.
    * 
    * Listen for it on a Game Object instance using `GameObject.on('destroy', listener)`.
    */
  val DESTROY: js.Any = js.native
  
  /**
    * The Video Game Object Complete Event.
    * 
    * This event is dispatched when a Video finishes playback by reaching the end of its duration. It
    * is also dispatched if a video marker sequence is being played and reaches the end.
    * 
    * Note that not all videos can fire this event. Live streams, for example, have no fixed duration,
    * so never technically 'complete'.
    * 
    * If a video is stopped from playback, via the `Video.stop` method, it will emit the
    * `VIDEO_STOP` event instead of this one.
    * 
    * Listen for it from a Video Game Object instance using `Video.on('complete', listener)`.
    */
  val VIDEO_COMPLETE: js.Any = js.native
  
  /**
    * The Video Game Object Created Event.
    * 
    * This event is dispatched when the texture for a Video has been created. This happens
    * when enough of the video source has been loaded that the browser is able to render a
    * frame from it.
    * 
    * Listen for it from a Video Game Object instance using `Video.on('created', listener)`.
    */
  val VIDEO_CREATED: js.Any = js.native
  
  /**
    * The Video Game Object Error Event.
    * 
    * This event is dispatched when a Video tries to play a source that does not exist, or is the wrong file type.
    * 
    * Listen for it from a Video Game Object instance using `Video.on('error', listener)`.
    */
  val VIDEO_ERROR: js.Any = js.native
  
  /**
    * The Video Game Object Loop Event.
    * 
    * This event is dispatched when a Video that is currently playing has looped. This only
    * happens if the `loop` parameter was specified, or the `setLoop` method was called,
    * and if the video has a fixed duration. Video streams, for example, cannot loop, as
    * they have no duration.
    * 
    * Looping is based on the result of the Video `timeupdate` event. This event is not
    * frame-accurate, due to the way browsers work, so please do not rely on this loop
    * event to be time or frame precise.
    * 
    * Listen for it from a Video Game Object instance using `Video.on('loop', listener)`.
    */
  val VIDEO_LOOP: js.Any = js.native
  
  /**
    * The Video Game Object Play Event.
    * 
    * This event is dispatched when a Video begins playback. For videos that do not require
    * interaction unlocking, this is usually as soon as the `Video.play` method is called.
    * However, for videos that require unlocking, it is fired once playback begins after
    * they've been unlocked.
    * 
    * Listen for it from a Video Game Object instance using `Video.on('play', listener)`.
    */
  val VIDEO_PLAY: js.Any = js.native
  
  /**
    * The Video Game Object Seeked Event.
    * 
    * This event is dispatched when a Video completes seeking to a new point in its timeline.
    * 
    * Listen for it from a Video Game Object instance using `Video.on('seeked', listener)`.
    */
  val VIDEO_SEEKED: js.Any = js.native
  
  /**
    * The Video Game Object Seeking Event.
    * 
    * This event is dispatched when a Video _begins_ seeking to a new point in its timeline.
    * When the seek is complete, it will dispatch the `VIDEO_SEEKED` event to conclude.
    * 
    * Listen for it from a Video Game Object instance using `Video.on('seeking', listener)`.
    */
  val VIDEO_SEEKING: js.Any = js.native
  
  /**
    * The Video Game Object Stopped Event.
    * 
    * This event is dispatched when a Video is stopped from playback via a call to the `Video.stop` method,
    * either directly via game code, or indirectly as the result of changing a video source or destroying it.
    * 
    * Listen for it from a Video Game Object instance using `Video.on('stop', listener)`.
    */
  val VIDEO_STOP: js.Any = js.native
  
  /**
    * The Video Game Object Timeout Event.
    * 
    * This event is dispatched when a Video has exhausted its allocated time while trying to connect to a video
    * source to start playback.
    * 
    * Listen for it from a Video Game Object instance using `Video.on('timeout', listener)`.
    */
  val VIDEO_TIMEOUT: js.Any = js.native
  
  /**
    * The Video Game Object Unlocked Event.
    * 
    * This event is dispatched when a Video that was prevented from playback due to the browsers
    * Media Engagement Interaction policy, is unlocked by a user gesture.
    * 
    * Listen for it from a Video Game Object instance using `Video.on('unlocked', listener)`.
    */
  val VIDEO_UNLOCKED: js.Any = js.native
}
