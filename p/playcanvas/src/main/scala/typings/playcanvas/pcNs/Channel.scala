package typings.playcanvas.pcNs

import typings.playcanvas.Anon_Loop
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @private
  * @name pc.Channel
  * @class A channel is created when the pc.AudioManager begins playback of a pc.Sound. Usually created internally by
  * pc.AudioManager#playSound or pc.AudioManager#playSound3d. Developers usually won't have to create Channels manually.
  * @param {pc.AudioManager} manager The AudioManager instance
  * @param {pc.Sound} sound The sound to playback
  * @param {Object} options
  * @param {Number} [options.volume=1] The playback volume, between 0 and 1.
  * @param {Number} [options.pitch=1] The relative pitch, default of 1, plays at normal pitch.
  * @param {Boolean} [options.loop=false] Whether the sound should loop when it reaches the end or not.
  */
@JSGlobal("pc.Channel")
@js.native
class Channel protected () extends js.Object {
  def this(manager: SoundManager, sound: Sound) = this()
  def this(manager: SoundManager, sound: Sound, options: Anon_Loop) = this()
  /**
    * @private
    * @function
    * @name pc.Channel#getLoop
    * @description Get the current looping state of the Channel
    */
  /* private */ def getLoop(): Boolean = js.native
  /**
    * @private
    * @function
    * @name pc.Channel#getPitch
    * @description Get the current pitch of the Channel
    */
  /* private */ def getPitch(): Double = js.native
  /**
    * @private
    * @function
    * @name pc.Channel#getVolume
    * @description Get the current value for the volume. Between 0 and 1.
    */
  /* private */ def getVolume(): Double = js.native
  /**
    * @private
    * @function
    * @name pc.Channel#onManagerResume
    * @description Handle the manager's 'resume' event.
    */
  /* private */ def onManagerResume(): Unit = js.native
  /**
    * @private
    * @function
    * @name pc.Channel#onManagerSuspend
    * @description Handle the manager's 'suspend' event.
    */
  /* private */ def onManagerSuspend(): Unit = js.native
  /**
    * @private
    * @function
    * @name pc.Channel#onManagerVolumeChange
    * @description Handle the manager's 'volumechange' event.
    */
  /* private */ def onManagerVolumeChange(): Unit = js.native
  /**
    * @private
    * @function
    * @name pc.Channel#pause
    * @description Pause playback of sound. Call unpause() to resume playback from the same position
    */
  /* private */ def pause(): Unit = js.native
  /**
    * @private
    * @function
    * @name pc.Channel#play
    * @description Begin playback of sound
    */
  /* private */ def play(): Unit = js.native
  /**
    * @private
    * @function
    * @name pc.Channel#setLoop
    * @description Enable/disable the loop property to make the sound restart from the beginning when it reaches the end.
    */
  /* private */ def setLoop(loop: Boolean): Unit = js.native
  /**
    * @private
    * @function
    * @name pc.Channel#setVolume
    * @description Set the volume of playback between 0 and 1.
    */
  /* private */ def setVolume(volume: Double): Unit = js.native
  /**
    * @private
    * @function
    * @name pc.Channel#stop
    * @description Stop playback of sound. Calling play() again will restart playback from the beginning of the sound.
    */
  /* private */ def stop(): Unit = js.native
  /**
    * @private
    * @function
    * @name pc.Channel#unpause
    * @description Resume playback of the sound. Playback resumes at the point that the audio was paused
    */
  def unpause(): Unit = js.native
}

