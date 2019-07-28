package typings.phaser.PhaserNs.SoundNs

import typings.phaser.PhaserNs.CacheNs.BaseCache
import typings.phaser.PhaserNs.EventsNs.EventEmitter
import typings.phaser.PhaserNs.Game
import typings.phaser.PhaserNs.TypesNs.SoundNs.AudioSpriteSound
import typings.phaser.PhaserNs.TypesNs.SoundNs.SoundConfig
import typings.phaser.PhaserNs.TypesNs.SoundNs.SoundMarker
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The sound manager is responsible for playing back audio via Web Audio API or HTML Audio tag as fallback.
  * The audio file type and the encoding of those files are extremely important.
  * 
  * Not all browsers can play all audio formats.
  * 
  * There is a good guide to what's supported [here](https://developer.mozilla.org/en-US/Apps/Fundamentals/Audio_and_video_delivery/Cross-browser_audio_basics#Audio_Codec_Support).
  */
@JSGlobal("Phaser.Sound.BaseSoundManager")
@js.native
class BaseSoundManager protected () extends EventEmitter {
  /**
    * 
    * @param game Reference to the current game instance.
    */
  def this(game: Game) = this()
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
    * Local reference to the JSON Cache, as used by Audio Sprites.
    */
  val jsonCache: BaseCache = js.native
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
    * Flag indicating if sounds should be paused when game looses focus,
    * for instance when user switches to another tab/program/app.
    */
  var pauseOnBlur: Boolean = js.native
  /**
    * Global playback rate at which all the sounds will be played.
    * Value of 1.0 plays the audio at full speed, 0.5 plays the audio at half speed
    * and 2.0 doubles the audio's playback speed.
    */
  var rate: Double = js.native
  /**
    * Global volume setting.
    */
  var volume: Double = js.native
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
  def addAudioSprite(key: String): AudioSpriteSound = js.native
  def addAudioSprite(key: String, config: SoundConfig): AudioSpriteSound = js.native
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
    * Enables playing sound on the fly without the need to keep a reference to it.
    * Sound will auto destroy once its playback ends.
    * @param key Asset key for the sound.
    * @param extra An optional additional object containing settings to be applied to the sound. It could be either config or marker object.
    */
  def play(key: String): Boolean = js.native
  def play(key: String, extra: SoundConfig): Boolean = js.native
  def play(key: String, extra: SoundMarker): Boolean = js.native
  /**
    * Enables playing audio sprite sound on the fly without the need to keep a reference to it.
    * Sound will auto destroy once its playback ends.
    * @param key Asset key for the sound.
    * @param spriteName The name of the sound sprite to play.
    * @param config An optional config object containing default sound settings.
    */
  def playAudioSprite(key: String, spriteName: String): Boolean = js.native
  def playAudioSprite(key: String, spriteName: String, config: SoundConfig): Boolean = js.native
  /**
    * Removes a sound from the sound manager.
    * The removed sound is destroyed before removal.
    * @param sound The sound object to remove.
    */
  def remove(sound: BaseSound): Boolean = js.native
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
  def setDetune(value: Double): BaseSoundManager = js.native
  /**
    * Sets the global playback rate at which all the sounds will be played.
    * 
    * For example, a value of 1.0 plays the audio at full speed, 0.5 plays the audio at half speed
    * and 2.0 doubles the audios playback speed.
    * @param value Global playback rate at which all the sounds will be played.
    */
  def setRate(value: Double): BaseSoundManager = js.native
  /**
    * Stops all the sounds in the game.
    */
  def stopAll(): Unit = js.native
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
}

