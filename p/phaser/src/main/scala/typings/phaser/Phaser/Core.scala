package typings.phaser.Phaser

import typings.phaser.Phaser.DOM.RequestAnimationFrame
import typings.phaser.Phaser.Display.Color
import typings.phaser.Phaser.Scale.CenterType
import typings.phaser.Phaser.Scale.ScaleModeType
import typings.phaser.Phaser.Scale.ZoomType
import typings.phaser.Phaser.Types.Core.AudioConfig
import typings.phaser.Phaser.Types.Core.FPSConfig
import typings.phaser.Phaser.Types.Core.GameConfig
import typings.phaser.Phaser.Types.Core.PhysicsConfig
import typings.phaser.Phaser.Types.Core.TimeStepCallback
import typings.phaser.integer
import typings.std.CanvasRenderingContext2D
import typings.std.HTMLCanvasElement
import typings.std.HTMLElement
import typings.std.WebGLRenderingContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Phaser.Core")
@js.native
object Core extends js.Object {
  /**
    * The active game configuration settings, parsed from a {@link Phaser.Types.Core.GameConfig} object.
    */
  @js.native
  /**
    * 
    * @param GameConfig The configuration object for your Phaser Game instance.
    */
  class Config () extends js.Object {
    def this(GameConfig: GameConfig) = this()
    /**
      * When set to `true`, WebGL uses linear interpolation to draw scaled or rotated textures, giving a smooth appearance. When set to `false`, WebGL uses nearest-neighbor interpolation, giving a crisper appearance. `false` also disables antialiasing of the game canvas itself, if the browser supports it, when the game canvas is scaled.
      */
    val antialias: Boolean = js.native
    /**
      * Sets the `antialias` property when the WebGL context is created. Setting this value does not impact any subsequent textures that are created, or the canvas style attributes.
      */
    val antialiasGL: Boolean = js.native
    /**
      * The Audio Configuration object.
      */
    val audio: AudioConfig = js.native
    /**
      * Automatically center the canvas within the parent?
      */
    val autoCenter: CenterType = js.native
    /**
      * If `true` the window will automatically be given focus immediately and on any future mousedown event.
      */
    val autoFocus: Boolean = js.native
    /**
      * Automatically round the display and style sizes of the canvas. This can help with performance in lower-powered devices.
      */
    val autoRound: integer = js.native
    /**
      * The background color of the game canvas. The default is black. This value is ignored if `transparent` is set to `true`.
      */
    val backgroundColor: Color = js.native
    /**
      * The background colors of the banner.
      */
    val bannerBackgroundColor: js.Array[String] = js.native
    /**
      * The color of the banner text.
      */
    val bannerTextColor: String = js.native
    /**
      * The default WebGL Batch size.
      */
    val batchSize: integer = js.native
    /**
      * Force Phaser to use your own Canvas element instead of creating one.
      */
    val canvas: HTMLCanvasElement = js.native
    /**
      * Optional CSS attributes to be set on the canvas object created by the renderer.
      */
    val canvasStyle: String = js.native
    /**
      * Whether the game canvas will be cleared between each rendering frame. You can disable this if you have a full-screen background image or game object.
      */
    val clearBeforeRender: Boolean = js.native
    /**
      * Force Phaser to use your own Canvas context instead of creating one.
      */
    val context: CanvasRenderingContext2D | WebGLRenderingContext = js.native
    /**
      * Is Phaser running under a custom (non-native web) environment? If so, set this to `true` to skip internal Feature detection. If `true` the `renderType` cannot be left as `AUTO`.
      */
    val customEnvironment: Boolean = js.native
    /**
      * A base64 encoded PNG that will be used as the default blank texture.
      */
    val defaultImage: String = js.native
    /**
      * The default physics system. It will be started for each scene. Either 'arcade', 'impact' or 'matter'.
      */
    val defaultPhysicsSystem: Boolean | String = js.native
    /**
      * The plugins installed into every Scene (in addition to CoreScene and Global).
      */
    val defaultPlugins: js.Any = js.native
    /**
      * When set to `true` it will create a desynchronized context for both 2D and WebGL. See https://developers.google.com/web/updates/2019/05/desynchronized for details.
      */
    val desynchronized: Boolean = js.native
    /**
      * Set to `true` to disable the right-click context menu.
      */
    val disableContextMenu: Boolean = js.native
    /**
      * Should the DOM Container that is created (if `dom.createContainer` is true) be positioned behind (true) or over the top (false, the default) of the game canvas?
      */
    val domBehindCanvas: Boolean = js.native
    /**
      * Should the game create a div element to act as a DOM Container? Only enable if you're using DOM Element objects. You must provide a parent object if you use this feature.
      */
    val domCreateContainer: Boolean = js.native
    /**
      * Is the Scale Manager allowed to adjust the CSS height property of the parent to be 100%?
      */
    val expandParent: Boolean = js.native
    /**
      * Let the browser abort creating a WebGL context if it judges performance would be unacceptable.
      */
    val failIfMajorPerformanceCaveat: Boolean = js.native
    /**
      * The Frame Rate Configuration object, as parsed by the Timestep class.
      */
    val fps: FPSConfig = js.native
    /**
      * The DOM element that will be sent into full screen mode, or its `id`. If undefined Phaser will create its own div and insert the canvas into it when entering fullscreen mode.
      */
    val fullscreenTarget: HTMLElement | String = js.native
    /**
      * The title of the game.
      */
    val gameTitle: String = js.native
    /**
      * The URL of the game.
      */
    val gameURL: String = js.native
    /**
      * The version of the game.
      */
    val gameVersion: String = js.native
    /**
      * The height of the underlying canvas, in pixels.
      */
    val height: integer | String = js.native
    /**
      * Don't write the banner line to the console.log.
      */
    val hideBanner: Boolean = js.native
    /**
      * Omit Phaser's name and version from the banner.
      */
    val hidePhaser: Boolean = js.native
    /**
      * The number of Pointer objects created by default. In a mouse-only, or non-multi touch game, you can leave this as 1.
      */
    val inputActivePointers: integer = js.native
    /**
      * Enable the Gamepad Plugin. This can be disabled in games that don't need gamepad input.
      */
    val inputGamepad: Boolean = js.native
    /**
      * The DOM Target to listen for gamepad events on. Defaults to `window` if not specified.
      */
    val inputGamepadEventTarget: js.Any = js.native
    /**
      * Enable the Keyboard Plugin. This can be disabled in games that don't need keyboard input.
      */
    val inputKeyboard: Boolean = js.native
    /**
      * `preventDefault` will be called on every non-modified key which has a key code in this array. By default, it is empty.
      */
    val inputKeyboardCapture: js.Array[integer] = js.native
    /**
      * The DOM Target to listen for keyboard events on. Defaults to `window` if not specified.
      */
    val inputKeyboardEventTarget: js.Any = js.native
    /**
      * Enable the Mouse Plugin. This can be disabled in games that don't need mouse input.
      */
    val inputMouse: Boolean | js.Object = js.native
    /**
      * Should mouse events be captured? I.e. have prevent default called on them.
      */
    val inputMouseCapture: Boolean = js.native
    /**
      * The DOM Target to listen for mouse events on. Defaults to the game canvas if not specified.
      */
    val inputMouseEventTarget: js.Any = js.native
    /**
      * The smoothing factor to apply during Pointer movement. See {@link Phaser.Input.Pointer#smoothFactor}.
      */
    val inputSmoothFactor: integer = js.native
    /**
      * Enable the Touch Plugin. This can be disabled in games that don't need touch input.
      */
    val inputTouch: Boolean = js.native
    /**
      * Should touch events be captured? I.e. have prevent default called on them.
      */
    val inputTouchCapture: Boolean = js.native
    /**
      * The DOM Target to listen for touch events on. Defaults to the game canvas if not specified.
      */
    val inputTouchEventTarget: js.Any = js.native
    /**
      * Should Phaser listen for input events on the Window? If you disable this, events like 'POINTER_UP_OUTSIDE' will no longer fire.
      */
    val inputWindowEvents: Boolean = js.native
    /**
      * An array of global plugins to be installed.
      */
    val installGlobalPlugins: js.Any = js.native
    /**
      * An array of Scene level plugins to be installed.
      */
    val installScenePlugins: js.Any = js.native
    /**
      * Should the XHR request use async or not?
      */
    val loaderAsync: Boolean = js.native
    /**
      * A URL used to resolve paths given to the loader. Example: 'http://labs.phaser.io/assets/'.
      */
    val loaderBaseURL: String = js.native
    /**
      * 'anonymous', 'use-credentials', or `undefined`. If you're not making cross-origin requests, leave this as `undefined`. See {@link https://developer.mozilla.org/en-US/docs/Web/HTML/CORS_settings_attributes}.
      */
    val loaderCrossOrigin: js.UndefOr[String] = js.native
    /**
      * Maximum parallel downloads allowed for resources (Default to 32).
      */
    val loaderMaxParallelDownloads: integer = js.native
    /**
      * Optional password for all XHR requests.
      */
    val loaderPassword: String = js.native
    /**
      * A URL path used to resolve relative paths given to the loader. Example: 'images/sprites/'.
      */
    val loaderPath: String = js.native
    /**
      * The response type of the XHR request, e.g. `blob`, `text`, etc.
      */
    val loaderResponseType: String = js.native
    /**
      * Optional XHR timeout value, in ms.
      */
    val loaderTimeout: integer = js.native
    /**
      * Optional username for all XHR requests.
      */
    val loaderUser: String = js.native
    /**
      * The maximum height, in pixels, the canvas will scale up to. A value of zero means no maximum.
      */
    val maxHeight: integer = js.native
    /**
      * The maximum number of lights allowed to be visible within range of a single Camera in the LightManager.
      */
    val maxLights: integer = js.native
    /**
      * The maximum width, in pixels, the canvas will scale up to. A value of zero means no maximum.
      */
    val maxWidth: integer = js.native
    /**
      * The minimum height, in pixels, the canvas will scale down to. A value of zero means no minimum.
      */
    val minHeight: integer = js.native
    /**
      * The minimum width, in pixels, the canvas will scale down to. A value of zero means no minimum.
      */
    val minWidth: integer = js.native
    /**
      * Sets the `mipmapFilter` property when the WebGL renderer is created.
      */
    val mipmapFilter: String = js.native
    /**
      * A base64 encoded PNG that will be used as the default texture when a texture is assigned that is missing or not loaded.
      */
    val missingImage: String = js.native
    /**
      * A parent DOM element into which the canvas created by the renderer will be injected.
      */
    val parent: js.Any = js.native
    /**
      * The Physics Configuration object.
      */
    val physics: PhysicsConfig = js.native
    /**
      * Prevent pixel art from becoming blurred when scaled. It will remain crisp (tells the WebGL renderer to automatically create textures using a linear filter mode).
      */
    val pixelArt: Boolean = js.native
    /**
      * "high-performance", "low-power" or "default". A hint to the browser on how much device power the game might use.
      */
    val powerPreference: String = js.native
    /**
      * In WebGL mode, sets the drawing buffer to contain colors with pre-multiplied alpha.
      */
    val premultipliedAlpha: Boolean = js.native
    /**
      * Force Phaser to use a specific renderer. Can be `CONST.CANVAS`, `CONST.WEBGL`, `CONST.HEADLESS` or `CONST.AUTO` (default)
      */
    val renderType: Double = js.native
    /**
      * How many ms should elapse before checking if the browser size has changed?
      */
    val resizeInterval: integer = js.native
    /**
      * The canvas device pixel resolution. Currently un-used.
      */
    val resolution: Double = js.native
    /**
      * Draw texture-based Game Objects at only whole-integer positions. Game Objects without textures, like Graphics, ignore this property.
      */
    val roundPixels: Boolean = js.native
    /**
      * The scale mode as used by the Scale Manager. The default is zero, which is no scaling.
      */
    val scaleMode: ScaleModeType = js.native
    /**
      * The default Scene configuration object.
      */
    val sceneConfig: js.Object = js.native
    /**
      * A seed which the Random Data Generator will use. If not given, a dynamic seed based on the time is used.
      */
    val seed: js.Array[String] = js.native
    /**
      * Whether the game canvas will have a transparent background.
      */
    val transparent: Boolean = js.native
    /**
      * The width of the underlying canvas, in pixels.
      */
    val width: integer | String = js.native
    /**
      * The zoom factor, as used by the Scale Manager.
      */
    val zoom: ZoomType | integer = js.native
    /**
      * A function to run at the end of the boot sequence. At this point, all the game systems have started and plugins have been loaded.
      */
    def postBoot(game: Game): Unit = js.native
    /**
      * Called before Phaser boots. Useful for initializing anything not related to Phaser that Phaser may require while booting.
      */
    def preBoot(game: Game): Unit = js.native
  }
  
  /**
    * The core runner class that Phaser uses to handle the game loop. It can use either Request Animation Frame,
    * or SetTimeout, based on browser support and config settings, to create a continuous loop within the browser.
    * 
    * Each time the loop fires, `TimeStep.step` is called and this is then passed onto the core Game update loop,
    * it is the core heartbeat of your game. It will fire as often as Request Animation Frame is capable of handling
    * on the target device.
    * 
    * Note that there are lots of situations where a browser will stop updating your game. Such as if the player
    * switches tabs, or covers up the browser window with another application. In these cases, the 'heartbeat'
    * of your game will pause, and only resume when focus is returned to it by the player. There is no way to avoid
    * this situation, all you can do is use the visibility events the browser, and Phaser, provide to detect when
    * it has happened and then gracefully recover.
    */
  @js.native
  class TimeStep protected () extends js.Object {
    /**
      * 
      * @param game A reference to the Phaser.Game instance that owns this Time Step.
      */
    def this(game: Game, config: FPSConfig) = this()
    /**
      * An exponential moving average of the frames per second.
      */
    val actualFps: integer = js.native
    /**
      * A callback to be invoked each time the Time Step steps.
      */
    @JSName("callback")
    var callback_Original: TimeStepCallback = js.native
    /**
      * The delta time, in ms, since the last game step. This is a clamped and smoothed average value.
      */
    var delta: integer = js.native
    /**
      * Internal array holding the previous delta values, used for delta smoothing.
      */
    var deltaHistory: js.Array[integer] = js.native
    /**
      * Internal index of the delta history position.
      */
    var deltaIndex: integer = js.native
    /**
      * The maximum number of delta values that are retained in order to calculate a smoothed moving average.
      * 
      * This can be changed in the Game Config via the `fps.deltaHistory` property. The default is 10.
      */
    var deltaSmoothingMax: integer = js.native
    /**
      * You can force the Time Step to use Set Timeout instead of Request Animation Frame by setting
      * the `forceSetTimeOut` property to `true` in the Game Configuration object. It cannot be changed at run-time.
      */
    val forceSetTimeOut: Boolean = js.native
    /**
      * The current frame the game is on. This counter is incremented once every game step, regardless of how much
      * time has passed and is unaffected by delta smoothing.
      */
    val frame: integer = js.native
    /**
      * The number of frames processed this second.
      */
    val framesThisSecond: integer = js.native
    /**
      * A reference to the Phaser.Game instance.
      */
    val game: Game = js.native
    /**
      * Is the browser currently considered in focus by the Page Visibility API?
      * This value is set in the `blur` method, which is called automatically by the Game instance.
      */
    val inFocus: Boolean = js.native
    /**
      * The time, as returned by `performance.now` of the previous step.
      */
    var lastTime: Double = js.native
    /**
      * The minimum fps rate you want the Time Step to run at.
      */
    var minFps: integer = js.native
    /**
      * The time at which the next fps rate update will take place.
      * When an fps update happens, the `framesThisSecond` value is reset.
      */
    val nextFpsUpdate: integer = js.native
    /**
      * The time, as returned by `performance.now` at the very start of the current step.
      * This can differ from the `time` value in that it isn't calculated based on the delta value.
      */
    var now: Double = js.native
    /**
      * The number of frames that the cooldown is set to after the browser panics over the FPS rate, usually
      * as a result of switching tabs and regaining focus.
      * 
      * This can be changed in the Game Config via the `fps.panicMax` property. The default is 120.
      */
    var panicMax: integer = js.native
    /**
      * The Request Animation Frame DOM Event handler.
      */
    val raf: RequestAnimationFrame = js.native
    /**
      * The actual elapsed time in ms between one update and the next.
      * 
      * Unlike with `delta`, no smoothing, capping, or averaging is applied to this value.
      * So please be careful when using this value in math calculations.
      */
    var rawDelta: Double = js.native
    /**
      * A flag that is set once the TimeStep has started running and toggled when it stops.
      * The difference between this value and `started` is that `running` is toggled when
      * the TimeStep is sent to sleep, where-as `started` remains `true`, only changing if
      * the TimeStep is actually stopped, not just paused.
      */
    val running: Boolean = js.native
    /**
      * Apply smoothing to the delta value used within Phasers internal calculations?
      * 
      * This can be changed in the Game Config via the `fps.smoothStep` property. The default is `true`.
      * 
      * Smoothing helps settle down the delta values after browser tab switches, or other situations
      * which could cause significant delta spikes or dips. By default it has been enabled in Phaser 3
      * since the first version, but is now exposed under this property (and the corresponding game config
      * `smoothStep` value), to allow you to easily disable it, should you require.
      */
    var smoothStep: Boolean = js.native
    /**
      * The time at which the game started running. This value is adjusted if the game is then
      * paused and resumes.
      */
    var startTime: Double = js.native
    /**
      * A flag that is set once the TimeStep has started running and toggled when it stops.
      */
    val started: Boolean = js.native
    /**
      * The target fps rate for the Time Step to run at.
      * 
      * Setting this value will not actually change the speed at which the browser runs, that is beyond
      * the control of Phaser. Instead, it allows you to determine performance issues and if the Time Step
      * is spiraling out of control.
      */
    var targetFps: integer = js.native
    /**
      * The time, calculated at the start of the current step, as smoothed by the delta value.
      */
    var time: Double = js.native
    /**
      * Called by the Game instance when the DOM window.onBlur event triggers.
      */
    def blur(): Unit = js.native
    /**
      * A callback to be invoked each time the Time Step steps.
      */
    def callback(time: Double, average: Double, interpolation: Double): Unit = js.native
    /**
      * Destroys the TimeStep. This will stop Request Animation Frame, stop the step, clear the callbacks and null
      * any objects.
      */
    def destroy(): Unit = js.native
    /**
      * Called by the Game instance when the DOM window.onFocus event triggers.
      */
    def focus(): Unit = js.native
    /**
      * Gets the duration which the game has been running, in seconds.
      */
    def getDuration(): Double = js.native
    /**
      * Gets the duration which the game has been running, in ms.
      */
    def getDurationMS(): Double = js.native
    /**
      * Called when the visibility API says the game is 'hidden' (tab switch out of view, etc)
      */
    def pause(): Unit = js.native
    /**
      * Resets the time, lastTime, fps averages and delta history.
      * Called automatically when a browser sleeps them resumes.
      */
    def resetDelta(): Unit = js.native
    /**
      * Called when the visibility API says the game is 'visible' again (tab switch back into view, etc)
      */
    def resume(): Unit = js.native
    /**
      * Sends the TimeStep to sleep, stopping Request Animation Frame (or SetTimeout) and toggling the `running` flag to false.
      */
    def sleep(): Unit = js.native
    /**
      * Starts the Time Step running, if it is not already doing so.
      * Called automatically by the Game Boot process.
      * @param callback The callback to be invoked each time the Time Step steps.
      */
    def start(callback: TimeStepCallback): Unit = js.native
    /**
      * The main step method. This is called each time the browser updates, either by Request Animation Frame,
      * or by Set Timeout. It is responsible for calculating the delta values, frame totals, cool down history and more.
      * You generally should never call this method directly.
      */
    def step(): Unit = js.native
    /**
      * Stops the TimeStep running.
      */
    def stop(): this.type = js.native
    /**
      * Manually calls `TimeStep.step`.
      */
    def tick(): Unit = js.native
    /**
      * Wakes-up the TimeStep, restarting Request Animation Frame (or SetTimeout) and toggling the `running` flag to true.
      * The `seamless` argument controls if the wake-up should adjust the start time or not.
      * @param seamless Adjust the startTime based on the lastTime values. Default false.
      */
    def wake(): Unit = js.native
    def wake(seamless: Boolean): Unit = js.native
  }
  
  /**
    * Called automatically by Phaser.Game and responsible for creating the renderer it will use.
    * 
    * Relies upon two webpack global flags to be defined: `WEBGL_RENDERER` and `CANVAS_RENDERER` during build time, but not at run-time.
    * @param game The Phaser.Game instance on which the renderer will be set.
    */
  def CreateRenderer(game: Game): Unit = js.native
  /**
    * Called automatically by Phaser.Game and responsible for creating the console.log debug header.
    * 
    * You can customize or disable the header via the Game Config object.
    * @param game The Phaser.Game instance which will output this debug header.
    */
  def DebugHeader(game: Game): Unit = js.native
  /**
    * The Visibility Handler is responsible for listening out for document level visibility change events.
    * This includes `visibilitychange` if the browser supports it, and blur and focus events. It then uses
    * the provided Event Emitter and fires the related events.
    * @param game The Game instance this Visibility Handler is working on.
    */
  def VisibilityHandler(game: Game): Unit = js.native
  @js.native
  object Events extends js.Object {
    /**
      * The Game Blur Event.
      * 
      * This event is dispatched by the Game Visibility Handler when the window in which the Game instance is embedded
      * enters a blurred state. The blur event is raised when the window loses focus. This can happen if a user swaps
      * tab, or if they simply remove focus from the browser to another app.
      */
    val BLUR: js.Any = js.native
    /**
      * The Game Boot Event.
      * 
      * This event is dispatched when the Phaser Game instance has finished booting, but before it is ready to start running.
      * The global systems use this event to know when to set themselves up, dispatching their own `ready` events as required.
      */
    val BOOT: js.Any = js.native
    /**
      * The Game Context Lost Event.
      * 
      * This event is dispatched by the Game if the WebGL Renderer it is using encounters a WebGL Context Lost event from the browser.
      * 
      * The partner event is `CONTEXT_RESTORED`.
      */
    val CONTEXT_LOST: js.Any = js.native
    /**
      * The Game Context Restored Event.
      * 
      * This event is dispatched by the Game if the WebGL Renderer it is using encounters a WebGL Context Restored event from the browser.
      * 
      * The partner event is `CONTEXT_LOST`.
      */
    val CONTEXT_RESTORED: js.Any = js.native
    /**
      * The Game Destroy Event.
      * 
      * This event is dispatched when the game instance has been told to destroy itself.
      * Lots of internal systems listen to this event in order to clear themselves out.
      * Custom plugins and game code should also do the same.
      */
    val DESTROY: js.Any = js.native
    /**
      * The Game Focus Event.
      * 
      * This event is dispatched by the Game Visibility Handler when the window in which the Game instance is embedded
      * enters a focused state. The focus event is raised when the window re-gains focus, having previously lost it.
      */
    val FOCUS: js.Any = js.native
    /**
      * The Game Hidden Event.
      * 
      * This event is dispatched by the Game Visibility Handler when the document in which the Game instance is embedded
      * enters a hidden state. Only browsers that support the Visibility API will cause this event to be emitted.
      * 
      * In most modern browsers, when the document enters a hidden state, the Request Animation Frame and setTimeout, which
      * control the main game loop, will automatically pause. There is no way to stop this from happening. It is something
      * your game should account for in its own code, should the pause be an issue (i.e. for multiplayer games)
      */
    val HIDDEN: js.Any = js.native
    /**
      * The Game Pause Event.
      * 
      * This event is dispatched when the Game loop enters a paused state, usually as a result of the Visibility Handler.
      */
    val PAUSE: js.Any = js.native
    /**
      * The Game Post-Render Event.
      * 
      * This event is dispatched right at the end of the render process.
      * 
      * Every Scene will have rendered and been drawn to the canvas by the time this event is fired.
      * Use it for any last minute post-processing before the next game step begins.
      */
    val POST_RENDER: js.Any = js.native
    /**
      * The Game Post-Step Event.
      * 
      * This event is dispatched after the Scene Manager has updated.
      * Hook into it from plugins or systems that need to do things before the render starts.
      */
    val POST_STEP: js.Any = js.native
    /**
      * The Game Pre-Render Event.
      * 
      * This event is dispatched immediately before any of the Scenes have started to render.
      * 
      * The renderer will already have been initialized this frame, clearing itself and preparing to receive the Scenes for rendering, but it won't have actually drawn anything yet.
      */
    val PRE_RENDER: js.Any = js.native
    /**
      * The Game Pre-Step Event.
      * 
      * This event is dispatched before the main Game Step starts. By this point in the game cycle none of the Scene updates have yet happened.
      * Hook into it from plugins or systems that need to update before the Scene Manager does.
      */
    val PRE_STEP: js.Any = js.native
    /**
      * The Game Ready Event.
      * 
      * This event is dispatched when the Phaser Game instance has finished booting, the Texture Manager is fully ready,
      * and all local systems are now able to start.
      */
    val READY: js.Any = js.native
    /**
      * The Game Resume Event.
      * 
      * This event is dispatched when the game loop leaves a paused state and resumes running.
      */
    val RESUME: js.Any = js.native
    /**
      * The Game Step Event.
      * 
      * This event is dispatched after the Game Pre-Step and before the Scene Manager steps.
      * Hook into it from plugins or systems that need to update before the Scene Manager does, but after the core Systems have.
      */
    val STEP: js.Any = js.native
    /**
      * The Game Visible Event.
      * 
      * This event is dispatched by the Game Visibility Handler when the document in which the Game instance is embedded
      * enters a visible state, previously having been hidden.
      * 
      * Only browsers that support the Visibility API will cause this event to be emitted.
      */
    val VISIBLE: js.Any = js.native
  }
  
}

