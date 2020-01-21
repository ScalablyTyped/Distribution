package typings.playcanvas.mod

import typings.playcanvas.AnonDuration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @constructor
  * @name pc.SoundInstance
  * @extends pc.EventHandler
  * @classdesc A pc.SoundInstance plays a {@link pc.Sound}
  * @param {pc.SoundManager} manager The sound manager
  * @param {pc.Sound} sound The sound to play
  * @param {Object} options Options for the instance
  * @param {Number} [options.volume=1] The playback volume, between 0 and 1.
  * @param {Number} [options.pitch=1] The relative pitch, default of 1, plays at normal pitch.
  * @param {Boolean} [options.loop=false] Whether the sound should loop when it reaches the end or not.
  * @param {Number} [options.startTime=0] The time from which the playback will start in seconds. Default is 0 to start at the beginning.
  * @param {Number} [options.duration=null] The total time after the startTime in seconds when playback will stop or restart if loop is true.
  * @param {Function} [options.onPlay=null] Function called when the instance starts playing.
  * @param {Function} [options.onPause=null] Function called when the instance is paused.
  * @param {Function} [options.onResume=null] Function called when the instance is resumed.
  * @param {Function} [options.onStop=null] Function called when the instance is stopped.
  * @param {Function} [options.onEnd=null] Function called when the instance ends.
  * @property {Number} volume The volume modifier to play the sound with. In range 0-1.
  * @property {Number} pitch The pitch modifier to play the sound with. Must be larger than 0.01
  * @property {Number} startTime The start time from which the sound will start playing.
  * @property {Number} currentTime Gets or sets the current time of the sound that is playing. If the value provided is bigger than the duration of the instance it will wrap from the beginning.
  * @property {Number} duration The duration of the sound that the instance will play starting from startTime.
  * @property {Boolean} loop If true the instance will restart when it finishes playing
  * @property {Boolean} isPlaying Returns true if the instance is currently playing.
  * @property {Boolean} isPaused Returns true if the instance is currently paused.
  * @property {Boolean} isStopped Returns true if the instance is currently stopped.
  * @property {Boolean} isSuspended Returns true if the instance is currently suspended because the window is not focused.
  * @property {AudioBufferSourceNode} source Gets the source that plays the sound resource. If the Web Audio API is not supported the type of source is <a href="https://developer.mozilla.org/en-US/docs/Web/HTML/Element/audio" target="_blank">Audio</a>. Source is only available after calling play.
  * @property {pc.Sound} sound The sound resource that the instance will play.
  */
@JSImport("playcanvas", "SoundInstance")
@js.native
class SoundInstance protected ()
  extends typings.playcanvas.pc.SoundInstance {
  def this(
    manager: typings.playcanvas.pc.SoundManager,
    sound: typings.playcanvas.pc.Sound,
    options: AnonDuration
  ) = this()
}

