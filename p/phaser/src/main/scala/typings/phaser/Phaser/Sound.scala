package typings.phaser.Phaser

import org.scalablytyped.runtime.StringDictionary
import typings.phaser.Phaser.Cache.BaseCache
import typings.phaser.Phaser.Events.EventEmitter
import typings.phaser.Phaser.Math.Vector2
import typings.phaser.Phaser.Types.Math.Vector2Like
import typings.phaser.Phaser.Types.Sound.DecodeAudioConfig
import typings.phaser.Phaser.Types.Sound.SoundConfig
import typings.phaser.Phaser.Types.Sound.SoundMarker
import typings.std.AudioBuffer
import typings.std.AudioBufferSourceNode
import typings.std.AudioContext
import typings.std.AudioNode
import typings.std.GainNode
import typings.std.HTMLAudioElement
import typings.std.PannerNode
import typings.std.StereoPannerNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Sound {
  
  /**
    * Class containing all the shared state and behavior of a sound object, independent of the implementation.
    */
  @js.native
  trait BaseSound
    extends StObject
       with EventEmitter {
    
    /**
      * Adds a marker into the current sound. A marker is represented by name, start time, duration, and optionally config object.
      * This allows you to bundle multiple sounds together into a single audio file and use markers to jump between them for playback.
      * @param marker Marker object.
      */
    def addMarker(marker: SoundMarker): Boolean = js.native
    
    /**
      * Method used internally for applying config values to some of the sound properties.
      */
    def applyConfig(): Unit = js.native
    
    /**
      * Method used internally to calculate total playback rate of the sound.
      */
    def calculateRate(): Unit = js.native
    
    /**
      * Currently playing marker.
      * 'null' if whole sound is playing.
      */
    val currentMarker: SoundMarker = js.native
    
    /**
      * A value representing the duration, in seconds.
      * It could be total sound duration or a marker duration.
      */
    val duration: Double = js.native
    
    /**
      * Flag indicating if sound is currently paused.
      */
    val isPaused: Boolean = js.native
    
    /**
      * Flag indicating if sound is currently playing.
      */
    val isPlaying: Boolean = js.native
    
    /**
      * Asset key for the sound.
      */
    val key: String = js.native
    
    /**
      * Local reference to the sound manager.
      */
    var manager: BaseSoundManager = js.native
    
    /**
      * Object containing markers definitions.
      */
    val markers: StringDictionary[SoundMarker] = js.native
    
    /**
      * Pauses the sound. This only works if the sound is currently playing.
      * 
      * You can inspect the `isPlaying` and `isPaused` properties to check the state.
      */
    def pause(): Boolean = js.native
    
    /**
      * Flag indicating if destroy method was called on this sound.
      */
    var pendingRemove: Boolean = js.native
    
    /**
      * Play this sound, or a marked section of it.
      * 
      * It always plays the sound from the start. If you want to start playback from a specific time
      * you can set 'seek' setting of the config object, provided to this call, to that value.
      * @param markerName If you want to play a marker then provide the marker name here. Alternatively, this parameter can be a SoundConfig object. Default ''.
      * @param config Optional sound config object to be applied to this marker or entire sound if no marker name is provided. It gets memorized for future plays of current section of the sound.
      */
    def play(): Boolean = js.native
    def play(markerName: String): Boolean = js.native
    def play(markerName: String, config: SoundConfig): Boolean = js.native
    def play(markerName: Unit, config: SoundConfig): Boolean = js.native
    def play(markerName: SoundConfig): Boolean = js.native
    def play(markerName: SoundConfig, config: SoundConfig): Boolean = js.native
    
    /**
      * Removes a marker from the sound.
      * @param markerName The name of the marker to remove.
      */
    def removeMarker(markerName: String): SoundMarker | Null = js.native
    
    /**
      * Method used internally for resetting values of some of the config properties.
      */
    def resetConfig(): Unit = js.native
    
    /**
      * Resumes the sound. This only works if the sound is paused and not already playing.
      * 
      * You can inspect the `isPlaying` and `isPaused` properties to check the state.
      */
    def resume(): Boolean = js.native
    
    /**
      * Stop playing this sound.
      */
    def stop(): Boolean = js.native
    
    /**
      * The total duration of the sound in seconds.
      */
    val totalDuration: Double = js.native
    
    /**
      * A property that holds the value of sound's actual playback rate,
      * after its rate and detune values has been combined with global
      * rate and detune values.
      */
    val totalRate: Double = js.native
    
    /**
      * Update method called automatically by sound manager on every game step.
      * @param time The current timestamp as generated by the Request Animation Frame or SetTimeout.
      * @param delta The delta time elapsed since the last frame.
      */
    def update(time: Double, delta: Double): Unit = js.native
    
    /**
      * Updates previously added marker.
      * @param marker Marker object with updated values.
      */
    def updateMarker(marker: SoundMarker): Boolean = js.native
  }
  
  /**
    * Base class for other Sound Manager classes.
    */
  @js.native
  trait BaseSoundManager
    extends StObject
       with EventEmitter {
    
    /**
      * Adds a new sound into the sound manager.
      * @param key Asset key for the sound.
      * @param config An optional config object containing default sound settings.
      */
    def add(key: String): BaseSound = js.native
    def add(key: String, config: SoundConfig): BaseSound = js.native
    
    /**
      * Adds a new audio sprite sound into the sound manager.
      * Audio Sprites are a combination of audio files and a JSON configuration.
      * The JSON follows the format of that created by https://github.com/tonistiigi/audiosprite
      * @param key Asset key for the sound.
      * @param config An optional config object containing default sound settings.
      */
    def addAudioSprite(key: String): NoAudioSound | HTML5AudioSound | WebAudioSound = js.native
    def addAudioSprite(key: String, config: SoundConfig): NoAudioSound | HTML5AudioSound | WebAudioSound = js.native
    
    /**
      * Global detuning of all sounds in [cents](https://en.wikipedia.org/wiki/Cent_%28music%29).
      * The range of the value is -1200 to 1200, but we recommend setting it to [50](https://en.wikipedia.org/wiki/50_Cent).
      */
    var detune: Double = js.native
    
    /**
      * Local reference to game.
      */
    val game: Game = js.native
    
    /**
      * Flag used to track if the game has lost focus.
      */
    var gameLostFocus: Boolean = js.native
    
    /**
      * Gets the first sound in this Sound Manager that matches the given key.
      * If none can be found it returns `null`.
      * @param key Sound asset key.
      */
    def get[T /* <: BaseSound */](key: String): T = js.native
    
    /**
      * Gets all sounds in this Sound Manager.
      * 
      * You can optionally specify a key, in which case only Sound instances that match the given key
      * will be returned.
      * @param key Optional asset key. If given, only Sound instances with this key will be returned.
      */
    def getAll[T /* <: BaseSound */](): js.Array[T] = js.native
    def getAll[T /* <: BaseSound */](key: String): js.Array[T] = js.native
    
    /**
      * Returns all sounds from this Sound Manager that are currently
      * playing. That is, Sound instances that have their `isPlaying`
      * property set to `true`.
      */
    def getAllPlaying[T /* <: BaseSound */](): js.Array[T] = js.native
    
    /**
      * Local reference to the JSON Cache, as used by Audio Sprites.
      */
    val jsonCache: BaseCache = js.native
    
    /**
      * The Spatial Audio listener position.
      * 
      * Only available with WebAudio.
      * 
      * You can modify the x/y properties of this Vec2 directly to
      * adjust the listener position within the game world.
      */
    var listenerPosition: Vector2 = js.native
    
    /**
      * Mobile devices require sounds to be triggered from an explicit user action,
      * such as a tap, before any sound can be loaded/played on a web page.
      * Set to true if the audio system is currently locked awaiting user interaction.
      */
    val locked: Boolean = js.native
    
    /**
      * Global mute setting.
      */
    var mute: Boolean = js.native
    
    /**
      * Method used internally for pausing sound manager if
      * Phaser.Sound.BaseSoundManager#pauseOnBlur is set to true.
      */
    /* protected */ def onBlur(): Unit = js.native
    
    /**
      * Method used internally for resuming sound manager if
      * Phaser.Sound.BaseSoundManager#pauseOnBlur is set to true.
      */
    /* protected */ def onFocus(): Unit = js.native
    
    /**
      * Pauses all the sounds in the game.
      */
    def pauseAll(): Unit = js.native
    
    /**
      * Flag indicating if sounds should be paused when game looses focus,
      * for instance when user switches to another tab/program/app.
      */
    var pauseOnBlur: Boolean = js.native
    
    /**
      * Adds a new sound to the sound manager and plays it.
      * 
      * The sound will be automatically removed (destroyed) once playback ends.
      * 
      * This lets you play a new sound on the fly without the need to keep a reference to it.
      * @param key Asset key for the sound.
      * @param extra An optional additional object containing settings to be applied to the sound. It could be either config or marker object.
      */
    def play(key: String): Boolean = js.native
    def play(key: String, extra: SoundConfig): Boolean = js.native
    def play(key: String, extra: SoundMarker): Boolean = js.native
    
    /**
      * Adds a new audio sprite sound to the sound manager and plays it.
      * The sprite will be automatically removed (destroyed) once playback ends.
      * This lets you play a new sound on the fly without the need to keep a reference to it.
      * @param key Asset key for the sound.
      * @param spriteName The name of the sound sprite to play.
      * @param config An optional config object containing default sound settings.
      */
    def playAudioSprite(key: String, spriteName: String): Boolean = js.native
    def playAudioSprite(key: String, spriteName: String, config: SoundConfig): Boolean = js.native
    
    /**
      * Global playback rate at which all the sounds will be played.
      * Value of 1.0 plays the audio at full speed, 0.5 plays the audio at half speed
      * and 2.0 doubles the audio's playback speed.
      */
    var rate: Double = js.native
    
    /**
      * Removes a sound from the sound manager.
      * The removed sound is destroyed before removal.
      * @param sound The sound object to remove.
      */
    def remove(sound: BaseSound): Boolean = js.native
    
    /**
      * Removes all sounds from the manager, destroying the sounds.
      */
    def removeAll(): Unit = js.native
    
    /**
      * Removes all sounds from the sound manager that have an asset key matching the given value.
      * The removed sounds are destroyed before removal.
      * @param key The key to match when removing sound objects.
      */
    def removeByKey(key: String): Double = js.native
    
    /**
      * Resumes all the sounds in the game.
      */
    def resumeAll(): Unit = js.native
    
    /**
      * Sets the global detuning of all sounds in [cents](https://en.wikipedia.org/wiki/Cent_%28music%29).
      * The range of the value is -1200 to 1200, but we recommend setting it to [50](https://en.wikipedia.org/wiki/50_Cent).
      * @param value The range of the value is -1200 to 1200, but we recommend setting it to [50](https://en.wikipedia.org/wiki/50_Cent).
      */
    def setDetune(value: Double): this.type = js.native
    
    /**
      * Sets the X and Y position of the Spatial Audio listener on this Web Audios context.
      * 
      * If you call this method with no parameters it will default to the center-point of
      * the game canvas. Depending on the type of game you're making, you may need to call
      * this method constantly to reset the listener position as the camera scrolls.
      * 
      * Calling this method does nothing on HTML5Audio.
      * @param x The x position of the Spatial Audio listener.
      * @param y The y position of the Spatial Audio listener.
      */
    def setListenerPosition(): Unit = js.native
    def setListenerPosition(x: Double): Unit = js.native
    def setListenerPosition(x: Double, y: Double): Unit = js.native
    def setListenerPosition(x: Unit, y: Double): Unit = js.native
    
    /**
      * Sets the global playback rate at which all the sounds will be played.
      * 
      * For example, a value of 1.0 plays the audio at full speed, 0.5 plays the audio at half speed
      * and 2.0 doubles the audios playback speed.
      * @param value Global playback rate at which all the sounds will be played.
      */
    def setRate(value: Double): this.type = js.native
    
    /**
      * Stops all the sounds in the game.
      */
    def stopAll(): Unit = js.native
    
    /**
      * Stops any sounds matching the given key.
      * @param key Sound asset key.
      */
    def stopByKey(key: String): Double = js.native
    
    /**
      * Method used internally for unlocking audio playback on devices that
      * require user interaction before any sound can be played on a web page.
      * 
      * Read more about how this issue is handled here in [this article](https://medium.com/@pgoloskokovic/unlocking-web-audio-the-smarter-way-8858218c0e09).
      */
    /* protected */ def unlock(): Unit = js.native
    
    /**
      * Update method called on every game step.
      * Removes destroyed sounds and updates every active sound in the game.
      * @param time The current timestamp as generated by the Request Animation Frame or SetTimeout.
      * @param delta The delta time elapsed since the last frame.
      */
    /* protected */ def update(time: Double, delta: Double): Unit = js.native
    
    /**
      * Global volume setting.
      */
    var volume: Double = js.native
  }
  
  /**
    * HTML5 Audio implementation of the sound.
    */
  @js.native
  trait HTML5AudioSound
    extends StObject
       with BaseSound {
    
    /**
      * Reference to an HTML5 Audio tag used for playing sound.
      */
    var audio: HTMLAudioElement = js.native
    
    /**
      * The detune value of this Sound, given in [cents](https://en.wikipedia.org/wiki/Cent_%28music%29).
      * The range of the value is -1200 to 1200, but we recommend setting it to [50](https://en.wikipedia.org/wiki/50_Cent).
      */
    var detune: Double = js.native
    
    /**
      * Flag indicating whether or not the sound or current sound marker will loop.
      */
    var loop: Boolean = js.native
    
    /**
      * Boolean indicating whether the sound is muted or not.
      * Gets or sets the muted state of this sound.
      */
    var mute: Boolean = js.native
    
    /**
      * Method used internally by sound manager for pausing sound if
      * Phaser.Sound.HTML5AudioSoundManager#pauseOnBlur is set to true.
      */
    def onBlur(): Unit = js.native
    
    /**
      * Method used internally by sound manager for resuming sound if
      * Phaser.Sound.HTML5AudioSoundManager#pauseOnBlur is set to true.
      */
    def onFocus(): Unit = js.native
    
    /**
      * Gets or sets the pan of this sound, a value between -1 (full left pan) and 1 (full right pan).
      * 
      * Has no audible effect on HTML5 Audio Sound, but still generates the PAN Event.
      */
    var pan: Double = js.native
    
    /**
      * This method is used internally to pick and play the next available audio tag.
      */
    def pickAndPlayAudioTag(): Boolean = js.native
    
    /**
      * This method performs the audio tag pooling logic. It first looks for
      * unused audio tag to assign to this sound object. If there are no unused
      * audio tags, based on HTML5AudioSoundManager#override property value, it
      * looks for sound with most advanced playback and hijacks its audio tag or
      * does nothing.
      */
    def pickAudioTag(): Boolean = js.native
    
    /**
      * Method used for playing audio tag and catching possible exceptions
      * thrown from rejected Promise returned from play method call.
      */
    def playCatchPromise(): Unit = js.native
    
    /**
      * Audio tag's playback position recorded on previous
      * update method call. Set to 0 if sound is not playing.
      */
    var previousTime: Double = js.native
    
    /**
      * Rate at which this Sound will be played.
      * Value of 1.0 plays the audio at full speed, 0.5 plays the audio at half speed
      * and 2.0 doubles the audios playback speed.
      */
    var rate: Double = js.native
    
    /**
      * Method used internally to reset sound state, usually when stopping sound
      * or when hijacking audio tag from another sound.
      */
    def reset(): Unit = js.native
    
    /**
      * Property representing the position of playback for this sound, in seconds.
      * Setting it to a specific value moves current playback to that position.
      * The value given is clamped to the range 0 to current marker duration.
      * Setting seek of a stopped sound has no effect.
      */
    var seek: Double = js.native
    
    /**
      * Sets the detune value of this Sound, given in [cents](https://en.wikipedia.org/wiki/Cent_%28music%29).
      * The range of the value is -1200 to 1200, but we recommend setting it to [50](https://en.wikipedia.org/wiki/50_Cent).
      * @param value The range of the value is -1200 to 1200, but we recommend setting it to [50](https://en.wikipedia.org/wiki/50_Cent).
      */
    def setDetune(value: Double): this.type = js.native
    
    /**
      * Sets the loop state of this Sound.
      * @param value `true` to loop this sound, `false` to not loop it.
      */
    def setLoop(value: Boolean): HTML5AudioSound = js.native
    
    /**
      * Sets the muted state of this Sound.
      * @param value `true` to mute this sound, `false` to unmute it.
      */
    def setMute(value: Boolean): this.type = js.native
    
    /**
      * Sets the pan of this sound, a value between -1 (full left pan) and 1 (full right pan).
      * 
      * Has no audible effect on HTML5 Audio Sound, but still generates the PAN Event.
      * @param value The pan of the sound. A value between -1 (full left pan) and 1 (full right pan).
      */
    def setPan(value: Double): this.type = js.native
    
    /**
      * Sets the playback rate of this Sound.
      * 
      * For example, a value of 1.0 plays the audio at full speed, 0.5 plays the audio at half speed
      * and 2.0 doubles the audios playback speed.
      * @param value The playback rate at of this Sound.
      */
    def setRate(value: Double): this.type = js.native
    
    /**
      * Seeks to a specific point in this sound.
      * @param value The point in the sound to seek to.
      */
    def setSeek(value: Double): this.type = js.native
    
    /**
      * Sets the volume of this Sound.
      * @param value The volume of the sound.
      */
    def setVolume(value: Double): this.type = js.native
    
    /**
      * Timestamp as generated by the Request Animation Frame or SetTimeout
      * representing the time at which the delayed sound playback should start.
      * Set to 0 if sound playback is not delayed.
      */
    var startTime: Double = js.native
    
    /**
      * This method is used internally to stop and release the current audio tag.
      */
    def stopAndReleaseAudioTag(): Unit = js.native
    
    /**
      * An array containing all HTML5 Audio tags that could be used for individual
      * sound playback. Number of instances depends on the config value passed
      * to the `Loader#audio` method call, default is 1.
      */
    var tags: js.Array[HTMLAudioElement] = js.native
    
    /**
      * Update method called automatically by sound manager on every game step.
      * @param time The current timestamp as generated by the Request Animation Frame or SetTimeout.
      */
    def update(time: Double): Unit = js.native
    
    /**
      * This method is used internally to update the mute setting of this sound.
      */
    def updateMute(): Unit = js.native
    
    /**
      * This method is used internally to update the volume of this sound.
      */
    def updateVolume(): Unit = js.native
    
    /**
      * Gets or sets the volume of this sound, a value between 0 (silence) and 1 (full volume).
      */
    var volume: Double = js.native
  }
  
  /**
    * HTML5AudioSoundManager
    */
  @js.native
  trait HTML5AudioSoundManager
    extends StObject
       with BaseSoundManager {
    
    /**
      * Value representing time difference, in seconds, between calling
      * play method on an audio tag and when it actually starts playing.
      * It is used to achieve more accurate delayed sound playback.
      * 
      * You might need to tweak this value to get the desired results
      * since audio play delay varies depending on the browser/platform.
      */
    var audioPlayDelay: Double = js.native
    
    /**
      * Method used internally by Phaser.Sound.HTML5AudioSound class methods and property setters
      * to check if sound manager is locked and then either perform action immediately or queue it
      * to be performed once the sound manager gets unlocked.
      * @param sound Sound object on which to perform queued action.
      * @param prop Name of the method to be called or property to be assigned a value to.
      * @param value An optional parameter that either holds an array of arguments to be passed to the method call or value to be set to the property.
      */
    /* protected */ def isLocked(sound: HTML5AudioSound, prop: String): Boolean = js.native
    /* protected */ def isLocked(sound: HTML5AudioSound, prop: String, value: Any): Boolean = js.native
    
    /**
      * A value by which we should offset the loop end marker of the
      * looping sound to compensate for lag, caused by changing audio
      * tag playback position, in order to achieve gapless looping.
      * 
      * You might need to tweak this value to get the desired results
      * since loop lag varies depending on the browser/platform.
      */
    var loopEndOffset: Double = js.native
    
    /**
      * Flag indicating whether if there are no idle instances of HTML5 Audio tag,
      * for any particular sound, if one of the used tags should be hijacked and used
      * for succeeding playback or if succeeding Phaser.Sound.HTML5AudioSound#play
      * call should be ignored.
      */
    var `override`: Boolean = js.native
    
    /**
      * Sets the muted state of all this Sound Manager.
      * @param value `true` to mute all sounds, `false` to unmute them.
      */
    def setMute(value: Boolean): HTML5AudioSoundManager = js.native
    
    /**
      * Sets the volume of this Sound Manager.
      * @param value The global volume of this Sound Manager.
      */
    def setVolume(value: Double): HTML5AudioSoundManager = js.native
  }
  
  /**
    * No audio implementation of the sound. It is used if audio has been
    * disabled in the game config or the device doesn't support any audio.
    * 
    * It represents a graceful degradation of sound logic that provides
    * minimal functionality and prevents Phaser projects that use audio from
    * breaking on devices that don't support any audio playback technologies.
    */
  @js.native
  trait NoAudioSound
    extends StObject
       with EventEmitter {
    
    /**
      * 
      * @param marker Marker object.
      */
    def addMarker(marker: SoundMarker): Boolean = js.native
    
    /**
      * Method used internally for applying config values to some of the sound properties.
      */
    def applyConfig(): Unit = js.native
    
    /**
      * Method used internally to calculate total playback rate of the sound.
      */
    def calculateRate(): Unit = js.native
    
    /**
      * A config object used to store default sound settings' values.
      * Default values will be set by properties' setters.
      */
    var config: SoundConfig = js.native
    
    /**
      * Reference to the currently used config.
      * It could be default config or marker config.
      */
    var currentConfig: SoundConfig = js.native
    
    /**
      * Currently playing marker.
      * 'null' if whole sound is playing.
      */
    val currentMarker: SoundMarker = js.native
    
    /**
      * The detune value of this Sound, given in [cents](https://en.wikipedia.org/wiki/Cent_%28music%29).
      * The range of the value is -1200 to 1200, but we recommend setting it to [50](https://en.wikipedia.org/wiki/50_Cent).
      */
    var detune: Double = js.native
    
    /**
      * A value representing the duration, in seconds.
      * It could be total sound duration or a marker duration.
      */
    val duration: Double = js.native
    
    /**
      * Flag indicating if sound is currently paused.
      */
    val isPaused: Boolean = js.native
    
    /**
      * Flag indicating if sound is currently playing.
      */
    val isPlaying: Boolean = js.native
    
    /**
      * Asset key for the sound.
      */
    val key: String = js.native
    
    /**
      * Flag indicating whether or not the sound or current sound marker will loop.
      */
    var loop: Boolean = js.native
    
    /**
      * Local reference to the sound manager.
      */
    var manager: BaseSoundManager = js.native
    
    /**
      * Object containing markers definitions.
      */
    val markers: StringDictionary[SoundMarker] = js.native
    
    /**
      * Boolean indicating whether the sound is muted or not.
      * Gets or sets the muted state of this sound.
      */
    var mute: Boolean = js.native
    
    /**
      * Gets or sets the pan of this sound, a value between -1 (full left pan) and 1 (full right pan).
      * 
      * Always returns zero on iOS / Safari as it doesn't support the stereo panner node.
      */
    var pan: Double = js.native
    
    def pause(): Boolean = js.native
    
    /**
      * Flag indicating if destroy method was called on this sound.
      */
    var pendingRemove: Boolean = js.native
    
    /**
      * 
      * @param markerName If you want to play a marker then provide the marker name here. Alternatively, this parameter can be a SoundConfig object. Default ''.
      * @param config Optional sound config object to be applied to this marker or entire sound if no marker name is provided. It gets memorized for future plays of current section of the sound.
      */
    def play(): Boolean = js.native
    def play(markerName: String): Boolean = js.native
    def play(markerName: String, config: SoundConfig): Boolean = js.native
    def play(markerName: Unit, config: SoundConfig): Boolean = js.native
    def play(markerName: SoundConfig): Boolean = js.native
    def play(markerName: SoundConfig, config: SoundConfig): Boolean = js.native
    
    /**
      * Rate at which this Sound will be played.
      * Value of 1.0 plays the audio at full speed, 0.5 plays the audio at half speed
      * and 2.0 doubles the audios playback speed.
      */
    var rate: Double = js.native
    
    /**
      * 
      * @param markerName The name of the marker to remove.
      */
    def removeMarker(markerName: String): Null = js.native
    
    /**
      * Method used internally for resetting values of some of the config properties.
      */
    def resetConfig(): Unit = js.native
    
    /**
      * Resumes the sound.
      */
    def resume(): Boolean = js.native
    
    /**
      * Property representing the position of playback for this sound, in seconds.
      * Setting it to a specific value moves current playback to that position.
      * The value given is clamped to the range 0 to current marker duration.
      * Setting seek of a stopped sound has no effect.
      */
    var seek: Double = js.native
    
    /**
      * Sets the detune value of this Sound, given in [cents](https://en.wikipedia.org/wiki/Cent_%28music%29).
      * The range of the value is -1200 to 1200, but we recommend setting it to [50](https://en.wikipedia.org/wiki/50_Cent).
      * @param value The range of the value is -1200 to 1200, but we recommend setting it to [50](https://en.wikipedia.org/wiki/50_Cent).
      */
    def setDetune(value: Double): this.type = js.native
    
    /**
      * Sets the loop state of this Sound.
      * @param value `true` to loop this sound, `false` to not loop it.
      */
    def setLoop(value: Boolean): this.type = js.native
    
    /**
      * Sets the muted state of this Sound.
      * @param value `true` to mute this sound, `false` to unmute it.
      */
    def setMute(value: Boolean): this.type = js.native
    
    /**
      * Sets the pan of this sound, a value between -1 (full left pan) and 1 (full right pan).
      * 
      * Note: iOS / Safari doesn't support the stereo panner node.
      * @param value The pan of the sound. A value between -1 (full left pan) and 1 (full right pan).
      */
    def setPan(value: Double): this.type = js.native
    
    /**
      * Sets the playback rate of this Sound.
      * 
      * For example, a value of 1.0 plays the audio at full speed, 0.5 plays the audio at half speed
      * and 2.0 doubles the audios playback speed.
      * @param value The playback rate at of this Sound.
      */
    def setRate(value: Double): this.type = js.native
    
    /**
      * Seeks to a specific point in this sound.
      * @param value The point in the sound to seek to.
      */
    def setSeek(value: Double): this.type = js.native
    
    /**
      * Sets the volume of this Sound.
      * @param value The volume of the sound.
      */
    def setVolume(value: Double): this.type = js.native
    
    /**
      * Stop playing this sound.
      */
    def stop(): Boolean = js.native
    
    /**
      * The total duration of the sound in seconds.
      */
    val totalDuration: Double = js.native
    
    /**
      * A property that holds the value of sound's actual playback rate,
      * after its rate and detune values has been combined with global
      * rate and detune values.
      */
    val totalRate: Double = js.native
    
    /**
      * Update method called automatically by sound manager on every game step.
      * @param time The current timestamp as generated by the Request Animation Frame or SetTimeout.
      * @param delta The delta time elapsed since the last frame.
      */
    def update(time: Double, delta: Double): Unit = js.native
    
    /**
      * 
      * @param marker Marker object with updated values.
      */
    def updateMarker(marker: SoundMarker): Boolean = js.native
    
    /**
      * Gets or sets the volume of this sound, a value between 0 (silence) and 1 (full volume).
      */
    var volume: Double = js.native
  }
  
  /**
    * No-audio implementation of the Sound Manager. It is used if audio has been
    * disabled in the game config or the device doesn't support any audio.
    * 
    * It represents a graceful degradation of Sound Manager logic that provides
    * minimal functionality and prevents Phaser projects that use audio from
    * breaking on devices that don't support any audio playback technologies.
    */
  @js.native
  trait NoAudioSoundManager
    extends StObject
       with BaseSoundManager {
    
    /**
      * Empty function for the No Audio Sound Manager.
      */
    def onGameBlur(): Unit = js.native
    
    /**
      * Empty function for the No Audio Sound Manager.
      */
    def onGameFocus(): Unit = js.native
    
    /**
      * Empty function for the No Audio Sound Manager.
      */
    def setDetune(): this.type = js.native
    
    /**
      * Empty function for the No Audio Sound Manager.
      */
    def setMute(): Unit = js.native
    
    /**
      * Empty function for the No Audio Sound Manager.
      */
    def setRate(): this.type = js.native
    
    /**
      * Empty function for the No Audio Sound Manager.
      */
    def setVolume(): Unit = js.native
    
    /**
      * Empty function for the No Audio Sound Manager.
      */
    def update(): Unit = js.native
  }
  
  /**
    * Web Audio API implementation of the sound.
    */
  @js.native
  trait WebAudioSound
    extends StObject
       with BaseSound {
    
    /**
      * Audio buffer containing decoded data of the audio asset to be played.
      */
    var audioBuffer: AudioBuffer = js.native
    
    /**
      * This method is only used internally and it creates a looping buffer source.
      */
    def createAndStartLoopBufferSource(): Unit = js.native
    
    /**
      * This method is only used internally and it creates a buffer source.
      */
    def createBufferSource(): AudioBufferSourceNode = js.native
    
    /**
      * The detune value of this Sound, given in [cents](https://en.wikipedia.org/wiki/Cent_%28music%29).
      * The range of the value is -1200 to 1200, but we recommend setting it to [50](https://en.wikipedia.org/wiki/50_Cent).
      */
    var detune: Double = js.native
    
    /**
      * Method used internally for calculating current playback time of a playing sound.
      */
    def getCurrentTime(): Unit = js.native
    
    /**
      * Method used internally for calculating the time
      * at witch the loop source should start playing.
      */
    def getLoopTime(): Unit = js.native
    
    /**
      * Used for keeping track when sound source playback has ended
      * so its state can be updated accordingly.
      */
    val hasEnded: Boolean = js.native
    
    /**
      * Used for keeping track when sound source has looped
      * so its state can be updated accordingly.
      */
    val hasLooped: Boolean = js.native
    
    /**
      * Flag indicating whether or not the sound or current sound marker will loop.
      */
    var loop: Boolean = js.native
    
    /**
      * A reference to a second audio source used for gapless looped playback.
      */
    var loopSource: AudioBufferSourceNode = js.native
    
    /**
      * The time at which the sound loop source should actually start playback.
      * 
      * Based on `BaseAudioContext.currentTime` value.
      */
    var loopTime: Double = js.native
    
    /**
      * Boolean indicating whether the sound is muted or not.
      * Gets or sets the muted state of this sound.
      */
    var mute: Boolean = js.native
    
    /**
      * Gain node responsible for controlling this sound's muting.
      */
    var muteNode: GainNode = js.native
    
    /**
      * Gets or sets the pan of this sound, a value between -1 (full left pan) and 1 (full right pan).
      * 
      * Always returns zero on iOS / Safari as it doesn't support the stereo panner node.
      */
    var pan: Double = js.native
    
    /**
      * Panner node responsible for controlling this sound's pan.
      * 
      * Doesn't work on iOS / Safari.
      */
    var pannerNode: StereoPannerNode = js.native
    
    /**
      * The time at which the sound should have started playback from the beginning.
      * 
      * Treat this property as read-only.
      * 
      * Based on `BaseAudioContext.currentTime` value.
      */
    var playTime: Double = js.native
    
    /**
      * Rate at which this Sound will be played.
      * Value of 1.0 plays the audio at full speed, 0.5 plays the audio at half speed
      * and 2.0 doubles the audios playback speed.
      */
    var rate: Double = js.native
    
    /**
      * An array where we keep track of all rate updates during playback.
      * 
      * Treat this property as read-only.
      * 
      * Array of object types: `{ time: number, rate: number }`
      */
    var rateUpdates: js.Array[Any] = js.native
    
    /**
      * Property representing the position of playback for this sound, in seconds.
      * Setting it to a specific value moves current playback to that position.
      * The value given is clamped to the range 0 to current marker duration.
      * Setting seek of a stopped sound has no effect.
      */
    var seek: Double = js.native
    
    /**
      * Sets the detune value of this Sound, given in [cents](https://en.wikipedia.org/wiki/Cent_%28music%29).
      * The range of the value is -1200 to 1200, but we recommend setting it to [50](https://en.wikipedia.org/wiki/50_Cent).
      * @param value The range of the value is -1200 to 1200, but we recommend setting it to [50](https://en.wikipedia.org/wiki/50_Cent).
      */
    def setDetune(value: Double): this.type = js.native
    
    /**
      * Sets the loop state of this Sound.
      * @param value `true` to loop this sound, `false` to not loop it.
      */
    def setLoop(value: Boolean): this.type = js.native
    
    /**
      * Sets the muted state of this Sound.
      * @param value `true` to mute this sound, `false` to unmute it.
      */
    def setMute(value: Boolean): this.type = js.native
    
    /**
      * Sets the pan of this sound, a value between -1 (full left pan) and 1 (full right pan).
      * 
      * Note: iOS / Safari doesn't support the stereo panner node.
      * @param value The pan of the sound. A value between -1 (full left pan) and 1 (full right pan).
      */
    def setPan(value: Double): this.type = js.native
    
    /**
      * Sets the playback rate of this Sound.
      * 
      * For example, a value of 1.0 plays the audio at full speed, 0.5 plays the audio at half speed
      * and 2.0 doubles the audios playback speed.
      * @param value The playback rate at of this Sound.
      */
    def setRate(value: Double): this.type = js.native
    
    /**
      * Seeks to a specific point in this sound.
      * @param value The point in the sound to seek to.
      */
    def setSeek(value: Double): this.type = js.native
    
    /**
      * Sets the volume of this Sound.
      * @param value The volume of the sound.
      */
    def setVolume(value: Double): this.type = js.native
    
    /**
      * A reference to an audio source node used for playing back audio from
      * audio data stored in Phaser.Sound.WebAudioSound#audioBuffer.
      */
    var source: AudioBufferSourceNode = js.native
    
    /**
      * The Stereo Spatial Panner node.
      */
    var spatialNode: PannerNode = js.native
    
    /**
      * If the Spatial Panner node has been set to track a vector or
      * Game Object, this retains a reference to it.
      */
    var spatialSource: Vector2Like = js.native
    
    /**
      * The time at which the sound source should have actually started playback.
      * 
      * Treat this property as read-only.
      * 
      * Based on `BaseAudioContext.currentTime` value.
      */
    var startTime: Double = js.native
    
    /**
      * This method is only used internally and it stops and removes a buffer source.
      */
    def stopAndRemoveBufferSource(): Unit = js.native
    
    /**
      * This method is only used internally and it stops and removes a looping buffer source.
      */
    def stopAndRemoveLoopBufferSource(): Unit = js.native
    
    /**
      * Update method called automatically by sound manager on every game step.
      */
    def update(): Unit = js.native
    
    /**
      * Gets or sets the volume of this sound, a value between 0 (silence) and 1 (full volume).
      */
    var volume: Double = js.native
    
    /**
      * Gain node responsible for controlling this sound's volume.
      */
    var volumeNode: GainNode = js.native
    
    /**
      * Sets the x position of this Sound in Spatial Audio space.
      * 
      * This only has any effect if the sound was created with a SpatialSoundConfig object.
      * 
      * Also see the `WebAudioSoundManager.setListenerPosition` method.
      * 
      * If you find that the sound becomes too quiet, too quickly, as it moves away from
      * the listener, then try different `refDistance` property values when configuring
      * the spatial sound.
      */
    var x: Double = js.native
    
    /**
      * Sets the y position of this Sound in Spatial Audio space.
      * 
      * This only has any effect if the sound was created with a SpatialSoundConfig object.
      * 
      * Also see the `WebAudioSoundManager.setListenerPosition` method.
      * 
      * If you find that the sound becomes too quiet, too quickly, as it moves away from
      * the listener, then try different `refDistance` property values when configuring
      * the spatial sound.
      */
    var y: Double = js.native
  }
  
  /**
    * Web Audio API implementation of the Sound Manager.
    * 
    * Not all browsers can play all audio formats.
    * 
    * There is a good guide to what's supported: [Cross-browser audio basics: Audio codec support](https://developer.mozilla.org/en-US/Apps/Fundamentals/Audio_and_video_delivery/Cross-browser_audio_basics#Audio_Codec_Support).
    */
  @js.native
  trait WebAudioSoundManager
    extends StObject
       with BaseSoundManager {
    
    /**
      * The AudioContext being used for playback.
      */
    var context: AudioContext = js.native
    
    /**
      * Method responsible for instantiating and returning AudioContext instance.
      * If an instance of an AudioContext class was provided through the game config,
      * that instance will be returned instead. This can come in handy if you are reloading
      * a Phaser game on a page that never properly refreshes (such as in an SPA project)
      * and you want to reuse already instantiated AudioContext.
      * @param game Reference to the current game instance.
      */
    def createAudioContext(game: Game): AudioContext = js.native
    
    /**
      * Decode audio data into a format ready for playback via Web Audio.
      * 
      * The audio data can be a base64 encoded string, an audio media-type data uri, or an ArrayBuffer instance.
      * 
      * The `audioKey` is the key that will be used to save the decoded audio to the audio cache.
      * 
      * Instead of passing a single entry you can instead pass an array of `Phaser.Types.Sound.DecodeAudioConfig`
      * objects as the first and only argument.
      * 
      * Decoding is an async process, so be sure to listen for the events to know when decoding has completed.
      * 
      * Once the audio has decoded it can be added to the Sound Manager or played via its key.
      * @param audioKey The string-based key to be used to reference the decoded audio in the audio cache, or an array of audio config objects.
      * @param audioData The audio data, either a base64 encoded string, an audio media-type data uri, or an ArrayBuffer instance.
      */
    def decodeAudio(): Unit = js.native
    def decodeAudio(audioKey: String): Unit = js.native
    def decodeAudio(audioKey: String, audioData: String): Unit = js.native
    def decodeAudio(audioKey: String, audioData: js.typedarray.ArrayBuffer): Unit = js.native
    def decodeAudio(audioKey: js.Array[DecodeAudioConfig]): Unit = js.native
    def decodeAudio(audioKey: js.Array[DecodeAudioConfig], audioData: String): Unit = js.native
    def decodeAudio(audioKey: js.Array[DecodeAudioConfig], audioData: js.typedarray.ArrayBuffer): Unit = js.native
    def decodeAudio(audioKey: Unit, audioData: String): Unit = js.native
    def decodeAudio(audioKey: Unit, audioData: js.typedarray.ArrayBuffer): Unit = js.native
    
    /**
      * Destination node for connecting individual sounds to.
      */
    var destination: AudioNode = js.native
    
    /**
      * Gain node responsible for controlling global muting.
      */
    var masterMuteNode: GainNode = js.native
    
    /**
      * Gain node responsible for controlling global volume.
      */
    var masterVolumeNode: GainNode = js.native
    
    /**
      * This method takes a new AudioContext reference and then sets
      * this Sound Manager to use that context for all playback.
      * 
      * As part of this call it also disconnects the master mute and volume
      * nodes and then re-creates them on the new given context.
      * @param context Reference to an already created AudioContext instance.
      */
    def setAudioContext(context: AudioContext): this.type = js.native
    
    /**
      * Sets the muted state of all this Sound Manager.
      * @param value `true` to mute all sounds, `false` to unmute them.
      */
    def setMute(value: Boolean): WebAudioSoundManager = js.native
    
    /**
      * Sets the volume of this Sound Manager.
      * @param value The global volume of this Sound Manager.
      */
    def setVolume(value: Double): WebAudioSoundManager = js.native
  }
}
