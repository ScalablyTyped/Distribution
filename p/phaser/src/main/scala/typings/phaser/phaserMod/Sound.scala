package typings.phaser.phaserMod

import typings.phaser.Phaser.Types.Sound.SoundConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Sound {
  
  @JSImport("phaser", "Sound")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Class containing all the shared state and behavior of a sound object, independent of the implementation.
    */
  @JSImport("phaser", "Sound.BaseSound")
  @js.native
  class BaseSound protected ()
    extends StObject
       with typings.phaser.Phaser.Sound.BaseSound {
    /**
      * 
      * @param manager Reference to the current sound manager instance.
      * @param key Asset key for the sound.
      * @param config An optional config object containing default sound settings.
      */
    def this(manager: typings.phaser.Phaser.Sound.BaseSoundManager, key: String) = this()
    def this(manager: typings.phaser.Phaser.Sound.BaseSoundManager, key: String, config: SoundConfig) = this()
  }
  
  /**
    * Base class for other Sound Manager classes.
    */
  @JSImport("phaser", "Sound.BaseSoundManager")
  @js.native
  class BaseSoundManager protected ()
    extends StObject
       with typings.phaser.Phaser.Sound.BaseSoundManager {
    /**
      * 
      * @param game Reference to the current game instance.
      */
    def this(game: typings.phaser.Phaser.Game) = this()
  }
  
  object Events {
    
    /**
      * The Sound Complete Event.
      * 
      * This event is dispatched by both Web Audio and HTML5 Audio Sound objects when they complete playback.
      * 
      * Listen to it from a Sound instance using `Sound.on('complete', listener)`, i.e.:
      * 
      * ```javascript
      * var music = this.sound.add('key');
      * music.on('complete', listener);
      * music.play();
      * ```
      */
    @JSImport("phaser", "Sound.Events.COMPLETE")
    @js.native
    val COMPLETE: js.Any = js.native
    
    /**
      * The Audio Data Decoded Event.
      * 
      * This event is dispatched by the Web Audio Sound Manager as a result of calling the `decodeAudio` method.
      * 
      * Listen to it from the Sound Manager in a Scene using `this.sound.on('decoded', listener)`, i.e.:
      * 
      * ```javascript
      * this.sound.on('decoded', handler);
      * this.sound.decodeAudio(key, audioData);
      * ```
      */
    @JSImport("phaser", "Sound.Events.DECODED")
    @js.native
    val DECODED: js.Any = js.native
    
    /**
      * The Audio Data Decoded All Event.
      * 
      * This event is dispatched by the Web Audio Sound Manager as a result of calling the `decodeAudio` method,
      * once all files passed to the method have been decoded (or errored).
      * 
      * Use `Phaser.Sound.Events#DECODED` to listen for single sounds being decoded, and `DECODED_ALL` to
      * listen for them all completing.
      * 
      * Listen to it from the Sound Manager in a Scene using `this.sound.on('decodedall', listener)`, i.e.:
      * 
      * ```javascript
      * this.sound.once('decodedall', handler);
      * this.sound.decodeAudio([ audioFiles ]);
      * ```
      */
    @JSImport("phaser", "Sound.Events.DECODED_ALL")
    @js.native
    val DECODED_ALL: js.Any = js.native
    
    /**
      * The Sound Destroy Event.
      * 
      * This event is dispatched by both Web Audio and HTML5 Audio Sound objects when they are destroyed, either
      * directly or via a Sound Manager.
      * 
      * Listen to it from a Sound instance using `Sound.on('destroy', listener)`, i.e.:
      * 
      * ```javascript
      * var music = this.sound.add('key');
      * music.on('destroy', listener);
      * music.destroy();
      * ```
      */
    @JSImport("phaser", "Sound.Events.DESTROY")
    @js.native
    val DESTROY: js.Any = js.native
    
    /**
      * The Sound Detune Event.
      * 
      * This event is dispatched by both Web Audio and HTML5 Audio Sound objects when their detune value changes.
      * 
      * Listen to it from a Sound instance using `Sound.on('detune', listener)`, i.e.:
      * 
      * ```javascript
      * var music = this.sound.add('key');
      * music.on('detune', listener);
      * music.play();
      * music.setDetune(200);
      * ```
      */
    @JSImport("phaser", "Sound.Events.DETUNE")
    @js.native
    val DETUNE: js.Any = js.native
    
    /**
      * The Sound Manager Global Detune Event.
      * 
      * This event is dispatched by the Base Sound Manager, or more typically, an instance of the Web Audio Sound Manager,
      * or the HTML5 Audio Manager. It is dispatched when the `detune` property of the Sound Manager is changed, which globally
      * adjusts the detuning of all active sounds.
      * 
      * Listen to it from a Scene using: `this.sound.on('rate', listener)`.
      */
    @JSImport("phaser", "Sound.Events.GLOBAL_DETUNE")
    @js.native
    val GLOBAL_DETUNE: js.Any = js.native
    
    /**
      * The Sound Manager Global Mute Event.
      * 
      * This event is dispatched by the Sound Manager when its `mute` property is changed, either directly
      * or via the `setMute` method. This changes the mute state of all active sounds.
      * 
      * Listen to it from a Scene using: `this.sound.on('mute', listener)`.
      */
    @JSImport("phaser", "Sound.Events.GLOBAL_MUTE")
    @js.native
    val GLOBAL_MUTE: js.Any = js.native
    
    /**
      * The Sound Manager Global Rate Event.
      * 
      * This event is dispatched by the Base Sound Manager, or more typically, an instance of the Web Audio Sound Manager,
      * or the HTML5 Audio Manager. It is dispatched when the `rate` property of the Sound Manager is changed, which globally
      * adjusts the playback rate of all active sounds.
      * 
      * Listen to it from a Scene using: `this.sound.on('rate', listener)`.
      */
    @JSImport("phaser", "Sound.Events.GLOBAL_RATE")
    @js.native
    val GLOBAL_RATE: js.Any = js.native
    
    /**
      * The Sound Manager Global Volume Event.
      * 
      * This event is dispatched by the Sound Manager when its `volume` property is changed, either directly
      * or via the `setVolume` method. This changes the volume of all active sounds.
      * 
      * Listen to it from a Scene using: `this.sound.on('volume', listener)`.
      */
    @JSImport("phaser", "Sound.Events.GLOBAL_VOLUME")
    @js.native
    val GLOBAL_VOLUME: js.Any = js.native
    
    /**
      * The Sound Loop Event.
      * 
      * This event is dispatched by both Web Audio and HTML5 Audio Sound objects when their loop state is changed.
      * 
      * Listen to it from a Sound instance using `Sound.on('loop', listener)`, i.e.:
      * 
      * ```javascript
      * var music = this.sound.add('key');
      * music.on('loop', listener);
      * music.setLoop(true);
      * ```
      * 
      * This is not to be confused with the [LOOPED]{@linkcode Phaser.Sound.Events#event:LOOPED} event, which emits each time a Sound loops during playback.
      */
    @JSImport("phaser", "Sound.Events.LOOP")
    @js.native
    val LOOP: js.Any = js.native
    
    /**
      * The Sound Looped Event.
      * 
      * This event is dispatched by both Web Audio and HTML5 Audio Sound objects when they loop during playback.
      * 
      * Listen to it from a Sound instance using `Sound.on('looped', listener)`, i.e.:
      * 
      * ```javascript
      * var music = this.sound.add('key');
      * music.on('looped', listener);
      * music.setLoop(true);
      * music.play();
      * ```
      * 
      * This is not to be confused with the [LOOP]{@linkcode Phaser.Sound.Events#event:LOOP} event, which only emits when the loop state of a Sound is changed.
      */
    @JSImport("phaser", "Sound.Events.LOOPED")
    @js.native
    val LOOPED: js.Any = js.native
    
    /**
      * The Sound Mute Event.
      * 
      * This event is dispatched by both Web Audio and HTML5 Audio Sound objects when their mute state changes.
      * 
      * Listen to it from a Sound instance using `Sound.on('mute', listener)`, i.e.:
      * 
      * ```javascript
      * var music = this.sound.add('key');
      * music.on('mute', listener);
      * music.play();
      * music.setMute(true);
      * ```
      */
    @JSImport("phaser", "Sound.Events.MUTE")
    @js.native
    val MUTE: js.Any = js.native
    
    /**
      * The Sound Pause Event.
      * 
      * This event is dispatched by both Web Audio and HTML5 Audio Sound objects when they are paused.
      * 
      * Listen to it from a Sound instance using `Sound.on('pause', listener)`, i.e.:
      * 
      * ```javascript
      * var music = this.sound.add('key');
      * music.on('pause', listener);
      * music.play();
      * music.pause();
      * ```
      */
    @JSImport("phaser", "Sound.Events.PAUSE")
    @js.native
    val PAUSE: js.Any = js.native
    
    /**
      * The Pause All Sounds Event.
      * 
      * This event is dispatched by the Base Sound Manager, or more typically, an instance of the Web Audio Sound Manager,
      * or the HTML5 Audio Manager. It is dispatched when the `pauseAll` method is invoked and after all current Sounds
      * have been paused.
      * 
      * Listen to it from a Scene using: `this.sound.on('pauseall', listener)`.
      */
    @JSImport("phaser", "Sound.Events.PAUSE_ALL")
    @js.native
    val PAUSE_ALL: js.Any = js.native
    
    /**
      * The Sound Play Event.
      * 
      * This event is dispatched by both Web Audio and HTML5 Audio Sound objects when they are played.
      * 
      * Listen to it from a Sound instance using `Sound.on('play', listener)`, i.e.:
      * 
      * ```javascript
      * var music = this.sound.add('key');
      * music.on('play', listener);
      * music.play();
      * ```
      */
    @JSImport("phaser", "Sound.Events.PLAY")
    @js.native
    val PLAY: js.Any = js.native
    
    /**
      * The Sound Rate Change Event.
      * 
      * This event is dispatched by both Web Audio and HTML5 Audio Sound objects when their rate changes.
      * 
      * Listen to it from a Sound instance using `Sound.on('rate', listener)`, i.e.:
      * 
      * ```javascript
      * var music = this.sound.add('key');
      * music.on('rate', listener);
      * music.play();
      * music.setRate(0.5);
      * ```
      */
    @JSImport("phaser", "Sound.Events.RATE")
    @js.native
    val RATE: js.Any = js.native
    
    /**
      * The Sound Resume Event.
      * 
      * This event is dispatched by both Web Audio and HTML5 Audio Sound objects when they are resumed from a paused state.
      * 
      * Listen to it from a Sound instance using `Sound.on('resume', listener)`, i.e.:
      * 
      * ```javascript
      * var music = this.sound.add('key');
      * music.on('resume', listener);
      * music.play();
      * music.pause();
      * music.resume();
      * ```
      */
    @JSImport("phaser", "Sound.Events.RESUME")
    @js.native
    val RESUME: js.Any = js.native
    
    /**
      * The Resume All Sounds Event.
      * 
      * This event is dispatched by the Base Sound Manager, or more typically, an instance of the Web Audio Sound Manager,
      * or the HTML5 Audio Manager. It is dispatched when the `resumeAll` method is invoked and after all current Sounds
      * have been resumed.
      * 
      * Listen to it from a Scene using: `this.sound.on('resumeall', listener)`.
      */
    @JSImport("phaser", "Sound.Events.RESUME_ALL")
    @js.native
    val RESUME_ALL: js.Any = js.native
    
    /**
      * The Sound Seek Event.
      * 
      * This event is dispatched by both Web Audio and HTML5 Audio Sound objects when they are seeked to a new position.
      * 
      * Listen to it from a Sound instance using `Sound.on('seek', listener)`, i.e.:
      * 
      * ```javascript
      * var music = this.sound.add('key');
      * music.on('seek', listener);
      * music.play();
      * music.setSeek(5000);
      * ```
      */
    @JSImport("phaser", "Sound.Events.SEEK")
    @js.native
    val SEEK: js.Any = js.native
    
    /**
      * The Sound Stop Event.
      * 
      * This event is dispatched by both Web Audio and HTML5 Audio Sound objects when they are stopped.
      * 
      * Listen to it from a Sound instance using `Sound.on('stop', listener)`, i.e.:
      * 
      * ```javascript
      * var music = this.sound.add('key');
      * music.on('stop', listener);
      * music.play();
      * music.stop();
      * ```
      */
    @JSImport("phaser", "Sound.Events.STOP")
    @js.native
    val STOP: js.Any = js.native
    
    /**
      * The Stop All Sounds Event.
      * 
      * This event is dispatched by the Base Sound Manager, or more typically, an instance of the Web Audio Sound Manager,
      * or the HTML5 Audio Manager. It is dispatched when the `stopAll` method is invoked and after all current Sounds
      * have been stopped.
      * 
      * Listen to it from a Scene using: `this.sound.on('stopall', listener)`.
      */
    @JSImport("phaser", "Sound.Events.STOP_ALL")
    @js.native
    val STOP_ALL: js.Any = js.native
    
    /**
      * The Sound Manager Unlocked Event.
      * 
      * This event is dispatched by the Base Sound Manager, or more typically, an instance of the Web Audio Sound Manager,
      * or the HTML5 Audio Manager. It is dispatched during the update loop when the Sound Manager becomes unlocked. For
      * Web Audio this is on the first user gesture on the page.
      * 
      * Listen to it from a Scene using: `this.sound.on('unlocked', listener)`.
      */
    @JSImport("phaser", "Sound.Events.UNLOCKED")
    @js.native
    val UNLOCKED: js.Any = js.native
    
    /**
      * The Sound Volume Event.
      * 
      * This event is dispatched by both Web Audio and HTML5 Audio Sound objects when their volume changes.
      * 
      * Listen to it from a Sound instance using `Sound.on('volume', listener)`, i.e.:
      * 
      * ```javascript
      * var music = this.sound.add('key');
      * music.on('volume', listener);
      * music.play();
      * music.setVolume(0.5);
      * ```
      */
    @JSImport("phaser", "Sound.Events.VOLUME")
    @js.native
    val VOLUME: js.Any = js.native
  }
  
  /**
    * HTML5 Audio implementation of the sound.
    */
  @JSImport("phaser", "Sound.HTML5AudioSound")
  @js.native
  class HTML5AudioSound protected ()
    extends StObject
       with typings.phaser.Phaser.Sound.HTML5AudioSound {
    /**
      * 
      * @param manager Reference to the current sound manager instance.
      * @param key Asset key for the sound.
      * @param config An optional config object containing default sound settings. Default {}.
      */
    def this(manager: typings.phaser.Phaser.Sound.HTML5AudioSoundManager, key: String) = this()
    def this(manager: typings.phaser.Phaser.Sound.HTML5AudioSoundManager, key: String, config: SoundConfig) = this()
  }
  
  /**
    * HTML5AudioSoundManager
    */
  @JSImport("phaser", "Sound.HTML5AudioSoundManager")
  @js.native
  class HTML5AudioSoundManager protected ()
    extends StObject
       with typings.phaser.Phaser.Sound.HTML5AudioSoundManager {
    /**
      * 
      * @param game Reference to the current game instance.
      */
    def this(game: typings.phaser.Phaser.Game) = this()
  }
  
  /**
    * No audio implementation of the sound. It is used if audio has been
    * disabled in the game config or the device doesn't support any audio.
    * 
    * It represents a graceful degradation of sound logic that provides
    * minimal functionality and prevents Phaser projects that use audio from
    * breaking on devices that don't support any audio playback technologies.
    */
  @JSImport("phaser", "Sound.NoAudioSound")
  @js.native
  class NoAudioSound protected ()
    extends StObject
       with typings.phaser.Phaser.Sound.NoAudioSound {
    /**
      * 
      * @param manager Reference to the current sound manager instance.
      * @param key Asset key for the sound.
      * @param config An optional config object containing default sound settings. Default {}.
      */
    def this(manager: typings.phaser.Phaser.Sound.NoAudioSoundManager, key: String) = this()
    def this(manager: typings.phaser.Phaser.Sound.NoAudioSoundManager, key: String, config: SoundConfig) = this()
  }
  
  /**
    * No-audio implementation of the Sound Manager. It is used if audio has been
    * disabled in the game config or the device doesn't support any audio.
    * 
    * It represents a graceful degradation of Sound Manager logic that provides
    * minimal functionality and prevents Phaser projects that use audio from
    * breaking on devices that don't support any audio playback technologies.
    */
  @JSImport("phaser", "Sound.NoAudioSoundManager")
  @js.native
  class NoAudioSoundManager protected ()
    extends StObject
       with typings.phaser.Phaser.Sound.BaseSoundManager {
    /**
      * 
      * @param game Reference to the current game instance.
      */
    def this(game: typings.phaser.Phaser.Game) = this()
  }
  
  /**
    * Creates a Web Audio, HTML5 Audio or No Audio Sound Manager based on config and device settings.
    * 
    * Be aware of https://developers.google.com/web/updates/2017/09/autoplay-policy-changes
    * @param game Reference to the current game instance.
    */
  inline def SoundManagerCreator(game: typings.phaser.Phaser.Game): typings.phaser.Phaser.Sound.HTML5AudioSoundManager | typings.phaser.Phaser.Sound.WebAudioSoundManager | typings.phaser.Phaser.Sound.NoAudioSoundManager = ^.asInstanceOf[js.Dynamic].applyDynamic("SoundManagerCreator")(game.asInstanceOf[js.Any]).asInstanceOf[typings.phaser.Phaser.Sound.HTML5AudioSoundManager | typings.phaser.Phaser.Sound.WebAudioSoundManager | typings.phaser.Phaser.Sound.NoAudioSoundManager]
  
  /**
    * Web Audio API implementation of the sound.
    */
  @JSImport("phaser", "Sound.WebAudioSound")
  @js.native
  class WebAudioSound protected ()
    extends StObject
       with typings.phaser.Phaser.Sound.WebAudioSound {
    /**
      * 
      * @param manager Reference to the current sound manager instance.
      * @param key Asset key for the sound.
      * @param config An optional config object containing default sound settings. Default {}.
      */
    def this(manager: typings.phaser.Phaser.Sound.WebAudioSoundManager, key: String) = this()
    def this(manager: typings.phaser.Phaser.Sound.WebAudioSoundManager, key: String, config: SoundConfig) = this()
  }
  
  /**
    * Web Audio API implementation of the Sound Manager.
    * 
    * Not all browsers can play all audio formats.
    * 
    * There is a good guide to what's supported: [Cross-browser audio basics: Audio codec support](https://developer.mozilla.org/en-US/Apps/Fundamentals/Audio_and_video_delivery/Cross-browser_audio_basics#Audio_Codec_Support).
    */
  @JSImport("phaser", "Sound.WebAudioSoundManager")
  @js.native
  class WebAudioSoundManager protected ()
    extends StObject
       with typings.phaser.Phaser.Sound.WebAudioSoundManager {
    /**
      * 
      * @param game Reference to the current game instance.
      */
    def this(game: typings.phaser.Phaser.Game) = this()
  }
}
