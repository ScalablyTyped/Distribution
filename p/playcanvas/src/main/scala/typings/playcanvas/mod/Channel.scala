package typings.playcanvas.mod

import typings.std.GainNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** @typedef {import('../sound/sound.js').Sound} Sound */
/** @typedef {import('../sound/manager.js').SoundManager} SoundManager */
/**
  * A channel is created when the {@link SoundManager} begins playback of a {@link Sound}. Usually
  * created internally by {@link SoundManager#playSound} or {@link SoundManager#playSound3d}.
  * Developers usually won't have to create Channels manually.
  *
  * @ignore
  */
trait Channel extends StObject {
  
  def _createSource(): Unit
  
  var gain: GainNode
  
  def getDuration(): Any
  
  /**
    * Get the current looping state of the Channel.
    *
    * @returns {boolean} The loop property for the channel.
    */
  def getLoop(): Boolean
  
  /**
    * Get the current pitch of the Channel.
    *
    * @returns {number} The pitch of the channel.
    */
  def getPitch(): Double
  
  /**
    * Get the current value for the volume. Between 0 and 1.
    *
    * @returns {number} The volume of the channel.
    */
  def getVolume(): Double
  
  def isPlaying(): Boolean
  
  var loop: Boolean
  
  var manager: SoundManager
  
  /**
    * Handle the manager's 'resume' event.
    */
  def onManagerResume(): Unit
  
  /**
    * Handle the manager's 'suspend' event.
    */
  def onManagerSuspend(): Unit
  
  /**
    * Handle the manager's 'volumechange' event.
    */
  def onManagerVolumeChange(): Unit
  
  /**
    * Pause playback of sound. Call unpause() to resume playback from the same position.
    */
  def pause(): Unit
  
  var paused: Boolean
  
  var pitch: Double
  
  /**
    * Begin playback of sound.
    */
  def play(): Unit
  
  /**
    * Enable/disable the loop property to make the sound restart from the beginning when it
    * reaches the end.
    *
    * @param {boolean} loop - True to loop the sound, false otherwise.
    */
  def setLoop(loop: Boolean): Unit
  
  def setPitch(pitch: Any): Unit
  
  /**
    * Set the volume of playback between 0 and 1.
    *
    * @param {number} volume - The volume of the sound. Will be clamped between 0 and 1.
    */
  def setVolume(volume: Double): Unit
  
  var sound: Sound
  
  var source: typings.std.Node
  
  var startOffset: Double
  
  var startTime: Double
  
  /**
    * Stop playback of sound. Calling play() again will restart playback from the beginning of the
    * sound.
    */
  def stop(): Unit
  
  var suspended: Boolean
  
  /**
    * Resume playback of the sound. Playback resumes at the point that the audio was paused.
    */
  def unpause(): Unit
  
  var volume: Double
}
object Channel {
  
  inline def apply(
    _createSource: () => Unit,
    gain: GainNode,
    getDuration: () => Any,
    getLoop: () => Boolean,
    getPitch: () => Double,
    getVolume: () => Double,
    isPlaying: () => Boolean,
    loop: Boolean,
    manager: SoundManager,
    onManagerResume: () => Unit,
    onManagerSuspend: () => Unit,
    onManagerVolumeChange: () => Unit,
    pause: () => Unit,
    paused: Boolean,
    pitch: Double,
    play: () => Unit,
    setLoop: Boolean => Unit,
    setPitch: Any => Unit,
    setVolume: Double => Unit,
    sound: Sound,
    source: typings.std.Node,
    startOffset: Double,
    startTime: Double,
    stop: () => Unit,
    suspended: Boolean,
    unpause: () => Unit,
    volume: Double
  ): Channel = {
    val __obj = js.Dynamic.literal(_createSource = js.Any.fromFunction0(_createSource), gain = gain.asInstanceOf[js.Any], getDuration = js.Any.fromFunction0(getDuration), getLoop = js.Any.fromFunction0(getLoop), getPitch = js.Any.fromFunction0(getPitch), getVolume = js.Any.fromFunction0(getVolume), isPlaying = js.Any.fromFunction0(isPlaying), loop = loop.asInstanceOf[js.Any], manager = manager.asInstanceOf[js.Any], onManagerResume = js.Any.fromFunction0(onManagerResume), onManagerSuspend = js.Any.fromFunction0(onManagerSuspend), onManagerVolumeChange = js.Any.fromFunction0(onManagerVolumeChange), pause = js.Any.fromFunction0(pause), paused = paused.asInstanceOf[js.Any], pitch = pitch.asInstanceOf[js.Any], play = js.Any.fromFunction0(play), setLoop = js.Any.fromFunction1(setLoop), setPitch = js.Any.fromFunction1(setPitch), setVolume = js.Any.fromFunction1(setVolume), sound = sound.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], startOffset = startOffset.asInstanceOf[js.Any], startTime = startTime.asInstanceOf[js.Any], stop = js.Any.fromFunction0(stop), suspended = suspended.asInstanceOf[js.Any], unpause = js.Any.fromFunction0(unpause), volume = volume.asInstanceOf[js.Any])
    __obj.asInstanceOf[Channel]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Channel] (val x: Self) extends AnyVal {
    
    inline def setGain(value: GainNode): Self = StObject.set(x, "gain", value.asInstanceOf[js.Any])
    
    inline def setGetDuration(value: () => Any): Self = StObject.set(x, "getDuration", js.Any.fromFunction0(value))
    
    inline def setGetLoop(value: () => Boolean): Self = StObject.set(x, "getLoop", js.Any.fromFunction0(value))
    
    inline def setGetPitch(value: () => Double): Self = StObject.set(x, "getPitch", js.Any.fromFunction0(value))
    
    inline def setGetVolume(value: () => Double): Self = StObject.set(x, "getVolume", js.Any.fromFunction0(value))
    
    inline def setIsPlaying(value: () => Boolean): Self = StObject.set(x, "isPlaying", js.Any.fromFunction0(value))
    
    inline def setLoop(value: Boolean): Self = StObject.set(x, "loop", value.asInstanceOf[js.Any])
    
    inline def setManager(value: SoundManager): Self = StObject.set(x, "manager", value.asInstanceOf[js.Any])
    
    inline def setOnManagerResume(value: () => Unit): Self = StObject.set(x, "onManagerResume", js.Any.fromFunction0(value))
    
    inline def setOnManagerSuspend(value: () => Unit): Self = StObject.set(x, "onManagerSuspend", js.Any.fromFunction0(value))
    
    inline def setOnManagerVolumeChange(value: () => Unit): Self = StObject.set(x, "onManagerVolumeChange", js.Any.fromFunction0(value))
    
    inline def setPause(value: () => Unit): Self = StObject.set(x, "pause", js.Any.fromFunction0(value))
    
    inline def setPaused(value: Boolean): Self = StObject.set(x, "paused", value.asInstanceOf[js.Any])
    
    inline def setPitch(value: Double): Self = StObject.set(x, "pitch", value.asInstanceOf[js.Any])
    
    inline def setPlay(value: () => Unit): Self = StObject.set(x, "play", js.Any.fromFunction0(value))
    
    inline def setSetLoop(value: Boolean => Unit): Self = StObject.set(x, "setLoop", js.Any.fromFunction1(value))
    
    inline def setSetPitch(value: Any => Unit): Self = StObject.set(x, "setPitch", js.Any.fromFunction1(value))
    
    inline def setSetVolume(value: Double => Unit): Self = StObject.set(x, "setVolume", js.Any.fromFunction1(value))
    
    inline def setSound(value: Sound): Self = StObject.set(x, "sound", value.asInstanceOf[js.Any])
    
    inline def setSource(value: typings.std.Node): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setStartOffset(value: Double): Self = StObject.set(x, "startOffset", value.asInstanceOf[js.Any])
    
    inline def setStartTime(value: Double): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    inline def setStop(value: () => Unit): Self = StObject.set(x, "stop", js.Any.fromFunction0(value))
    
    inline def setSuspended(value: Boolean): Self = StObject.set(x, "suspended", value.asInstanceOf[js.Any])
    
    inline def setUnpause(value: () => Unit): Self = StObject.set(x, "unpause", js.Any.fromFunction0(value))
    
    inline def setVolume(value: Double): Self = StObject.set(x, "volume", value.asInstanceOf[js.Any])
    
    inline def set_createSource(value: () => Unit): Self = StObject.set(x, "_createSource", js.Any.fromFunction0(value))
  }
}
