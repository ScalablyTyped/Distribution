package typings
package phaserLib.PhaserNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The Phaser.Game instance is the main controller for the entire Phaser game. It is responsible
  * for handling the boot process, parsing the configuration values, creating the renderer,
  * and setting-up all of the global Phaser systems, such as sound and input.
  * Once that is complete it will start the Scene Manager and then begin the main game loop.
  * 
  * You should generally avoid accessing any of the systems created by Game, and instead use those
  * made available to you via the Phaser.Scene Systems class instead.
  */
@JSGlobal("Phaser.Game")
@js.native
/**
  * 
  * @param GameConfig The configuration object for your Phaser Game instance.
  */
class Game () extends js.Object {
  def this(GameConfig: phaserLib.PhaserNs.TypesNs.CoreNs.GameConfig) = this()
  /**
    * An instance of the Animation Manager.
    * 
    * The Animation Manager is a global system responsible for managing all animations used within your game.
    */
  var anims: phaserLib.PhaserNs.AnimationsNs.AnimationManager = js.native
  /**
    * An instance of the Cache Manager.
    * 
    * The Cache Manager is a global system responsible for caching, accessing and releasing external game assets.
    */
  var cache: phaserLib.PhaserNs.CacheNs.CacheManager = js.native
  /**
    * A reference to the HTML Canvas Element that Phaser uses to render the game.
    * This is created automatically by Phaser unless you provide a `canvas` property
    * in your Game Config.
    */
  var canvas: stdLib.HTMLCanvasElement = js.native
  /**
    * The parsed Game Configuration object.
    * 
    * The values stored within this object are read-only and should not be changed at run-time.
    */
  val config: phaserLib.PhaserNs.CoreNs.Config = js.native
  /**
    * A reference to the Rendering Context belonging to the Canvas Element this game is rendering to.
    * If the game is running under Canvas it will be a 2d Canvas Rendering Context.
    * If the game is running under WebGL it will be a WebGL Rendering Context.
    * This context is created automatically by Phaser unless you provide a `context` property
    * in your Game Config.
    */
  var context: stdLib.CanvasRenderingContext2D | stdLib.WebGLRenderingContext = js.native
  /**
    * A reference to the Device inspector.
    * 
    * Contains information about the device running this game, such as OS, browser vendor and feature support.
    * Used by various systems to determine capabilities and code paths.
    */
  var device: DeviceConf = js.native
  /**
    * A reference to an HTML Div Element used as the DOM Element Container.
    * 
    * Only set if `createDOMContainer` is `true` in the game config (by default it is `false`) and
    * if you provide a parent element to insert the Phaser Game inside.
    * 
    * See the DOM Element Game Object for more details.
    */
  var domContainer: stdLib.HTMLDivElement = js.native
  /**
    * An Event Emitter which is used to broadcast game-level events from the global systems.
    */
  var events: phaserLib.PhaserNs.EventsNs.EventEmitter = js.native
  /**
    * An instance of the Facebook Instant Games Plugin.
    * 
    * This will only be available if the plugin has been built into Phaser,
    * or you're using the special Facebook Instant Games custom build.
    */
  var facebook: FacebookInstantGamesPlugin = js.native
  /**
    * Does the window the game is running in currently have focus or not?
    * This is modified by the VisibilityHandler.
    */
  val hasFocus: scala.Boolean = js.native
  /**
    * An instance of the Input Manager.
    * 
    * The Input Manager is a global system responsible for the capture of browser-level input events.
    */
  var input: phaserLib.PhaserNs.InputNs.InputManager = js.native
  /**
    * A flag indicating when this Game instance has finished its boot process.
    */
  val isBooted: scala.Boolean = js.native
  /**
    * A flag indicating if this Game is currently running its game step or not.
    */
  val isRunning: scala.Boolean = js.native
  /**
    * An instance of the Time Step.
    * 
    * The Time Step is a global system responsible for setting-up and responding to the browser frame events, processing
    * them and calculating delta values. It then automatically calls the game step.
    */
  var loop: phaserLib.PhaserNs.CoreNs.TimeStep = js.native
  /**
    * An instance of the Plugin Manager.
    * 
    * The Plugin Manager is a global system that allows plugins to register themselves with it, and can then install
    * those plugins into Scenes as required.
    */
  var plugins: phaserLib.PhaserNs.PluginsNs.PluginManager = js.native
  /**
    * An instance of the Data Manager
    */
  var registry: phaserLib.PhaserNs.DataNs.DataManager = js.native
  /**
    * A reference to either the Canvas or WebGL Renderer that this Game is using.
    */
  var renderer: phaserLib.PhaserNs.RendererNs.CanvasNs.CanvasRenderer | phaserLib.PhaserNs.RendererNs.WebGLNs.WebGLRenderer = js.native
  /**
    * An instance of the Scale Manager.
    * 
    * The Scale Manager is a global system responsible for handling scaling of the game canvas.
    */
  var scale: phaserLib.PhaserNs.ScaleNs.ScaleManager = js.native
  /**
    * An instance of the Scene Manager.
    * 
    * The Scene Manager is a global system responsible for creating, modifying and updating the Scenes in your game.
    */
  var scene: phaserLib.PhaserNs.ScenesNs.SceneManager = js.native
  /**
    * An instance of the base Sound Manager.
    * 
    * The Sound Manager is a global system responsible for the playback and updating of all audio in your game.
    * 
    * You can disable the inclusion of the Sound Manager in your build by toggling the webpack `FEATURE_SOUND` flag.
    */
  var sound: phaserLib.PhaserNs.SoundNs.BaseSoundManager = js.native
  /**
    * An instance of the Texture Manager.
    * 
    * The Texture Manager is a global system responsible for managing all textures being used by your game.
    */
  var textures: phaserLib.PhaserNs.TexturesNs.TextureManager = js.native
  /**
    * This method is called automatically when the DOM is ready. It is responsible for creating the renderer,
    * displaying the Debug Header, adding the game canvas to the DOM and emitting the 'boot' event.
    * It listens for a 'ready' event from the base systems and once received it will call `Game.start`.
    */
  /* protected */ def boot(): scala.Unit = js.native
  /**
    * Flags this Game instance as needing to be destroyed on the _next frame_, making this an asynchronous operation.
    * 
    * It will wait until the current frame has completed and then call `runDestroy` internally.
    * 
    * If you need to react to the games eventual destruction, listen for the `DESTROY` event.
    * 
    * If you **do not** need to run Phaser again on the same web page you can set the `noReturn` argument to `true` and it will free-up
    * memory being held by the core Phaser plugins. If you do need to create another game instance on the same page, leave this as `false`.
    * @param removeCanvas Set to `true` if you would like the parent canvas element removed from the DOM, or `false` to leave it in place.
    * @param noReturn If `true` all the core Phaser plugins are destroyed. You cannot create another instance of Phaser on the same web page if you do this. Default false.
    */
  def destroy(removeCanvas: scala.Boolean): scala.Unit = js.native
  def destroy(removeCanvas: scala.Boolean, noReturn: scala.Boolean): scala.Unit = js.native
  /**
    * Returns the current game frame.
    * 
    * When the game starts running, the frame is incremented every time Request Animation Frame, or Set Timeout, fires.
    */
  def getFrame(): scala.Double = js.native
  /**
    * Returns the time that the current game step started at, as based on `performance.now`.
    */
  def getTime(): scala.Double = js.native
  /**
    * A special version of the Game Step for the HEADLESS renderer only.
    * 
    * The main Game Step. Called automatically by the Time Step, once per browser frame (typically as a result of
    * Request Animation Frame, or Set Timeout on very old browsers.)
    * 
    * The step will update the global managers first, then proceed to update each Scene in turn, via the Scene Manager.
    * 
    * This process emits `prerender` and `postrender` events, even though nothing actually displays.
    * @param time The current time. Either a High Resolution Timer value if it comes from Request Animation Frame, or Date.now if using SetTimeout.
    * @param delta The delta time in ms since the last frame. This is a smoothed and capped value based on the FPS rate.
    */
  def headlessStep(time: scala.Double, delta: scala.Double): scala.Unit = js.native
  /**
    * Called automatically by the Visibility Handler.
    * This will set the main loop into a 'blurred' state, which pauses it.
    */
  /* protected */ def onBlur(): scala.Unit = js.native
  /**
    * Called automatically by the Visibility Handler.
    * This will set the main loop into a 'focused' state, which resumes it.
    */
  /* protected */ def onFocus(): scala.Unit = js.native
  /**
    * Called automatically by the Visibility Handler.
    * This will pause the main loop and then emit a pause event.
    */
  /* protected */ def onHidden(): scala.Unit = js.native
  /**
    * Called automatically by the Visibility Handler.
    * This will resume the main loop and then emit a resume event.
    */
  /* protected */ def onVisible(): scala.Unit = js.native
  /**
    * Called automatically by Game.boot once all of the global systems have finished setting themselves up.
    * By this point the Game is now ready to start the main loop running.
    * It will also enable the Visibility Handler.
    */
  /* protected */ def start(): scala.Unit = js.native
  /**
    * The main Game Step. Called automatically by the Time Step, once per browser frame (typically as a result of
    * Request Animation Frame, or Set Timeout on very old browsers.)
    * 
    * The step will update the global managers first, then proceed to update each Scene in turn, via the Scene Manager.
    * 
    * It will then render each Scene in turn, via the Renderer. This process emits `prerender` and `postrender` events.
    * @param time The current time. Either a High Resolution Timer value if it comes from Request Animation Frame, or Date.now if using SetTimeout.
    * @param delta The delta time in ms since the last frame. This is a smoothed and capped value based on the FPS rate.
    */
  def step(time: scala.Double, delta: scala.Double): scala.Unit = js.native
}

