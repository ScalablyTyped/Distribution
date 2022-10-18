package typings.phaser.mod

import typings.phaser.Phaser.Display.Color
import typings.phaser.Phaser.Scale.CenterType
import typings.phaser.Phaser.Scale.ScaleModeType
import typings.phaser.Phaser.Scale.ZoomType
import typings.phaser.Phaser.Types.Core.AudioConfig
import typings.phaser.Phaser.Types.Core.FPSConfig
import typings.phaser.Phaser.Types.Core.PhysicsConfig
import typings.phaser.Phaser.Types.Core.PipelineConfig
import typings.std.CanvasRenderingContext2D
import typings.std.HTMLCanvasElement
import typings.std.HTMLElement
import typings.std.WebGLRenderingContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Core {
  
  @JSImport("phaser", "Core")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * The active game configuration settings, parsed from a {@link Phaser.Types.Core.GameConfig} object.
    */
  @JSImport("phaser", "Core.Config")
  @js.native
  /**
    * 
    * @param GameConfig The configuration object for your Phaser Game instance.
    */
  open class Config ()
    extends StObject
       with typings.phaser.Phaser.Core.Config {
    def this(GameConfig: typings.phaser.Phaser.Types.Core.GameConfig) = this()
    
    /**
      * When set to `true`, WebGL uses linear interpolation to draw scaled or rotated textures, giving a smooth appearance. When set to `false`, WebGL uses nearest-neighbor interpolation, giving a crisper appearance. `false` also disables antialiasing of the game canvas itself, if the browser supports it, when the game canvas is scaled.
      */
    /* CompleteClass */
    override val antialias: Boolean = js.native
    
    /**
      * Sets the `antialias` property when the WebGL context is created. Setting this value does not impact any subsequent textures that are created, or the canvas style attributes.
      */
    /* CompleteClass */
    override val antialiasGL: Boolean = js.native
    
    /**
      * The Audio Configuration object.
      */
    /* CompleteClass */
    override val audio: AudioConfig = js.native
    
    /**
      * Automatically center the canvas within the parent?
      */
    /* CompleteClass */
    override val autoCenter: CenterType = js.native
    
    /**
      * If `true` the window will automatically be given focus immediately and on any future mousedown event.
      */
    /* CompleteClass */
    override val autoFocus: Boolean = js.native
    
    /**
      * Automatically round the display and style sizes of the canvas. This can help with performance in lower-powered devices.
      */
    /* CompleteClass */
    override val autoRound: Boolean = js.native
    
    /**
      * The background color of the game canvas. The default is black. This value is ignored if `transparent` is set to `true`.
      */
    /* CompleteClass */
    override val backgroundColor: Color = js.native
    
    /**
      * The background colors of the banner.
      */
    /* CompleteClass */
    override val bannerBackgroundColor: js.Array[String] = js.native
    
    /**
      * The color of the banner text.
      */
    /* CompleteClass */
    override val bannerTextColor: String = js.native
    
    /**
      * The default WebGL Batch size. Represents the number of _quads_ that can be added to a single batch.
      */
    /* CompleteClass */
    override val batchSize: Double = js.native
    
    /**
      * Force Phaser to use your own Canvas element instead of creating one.
      */
    /* CompleteClass */
    override val canvas: HTMLCanvasElement = js.native
    
    /**
      * Optional CSS attributes to be set on the canvas object created by the renderer.
      */
    /* CompleteClass */
    override val canvasStyle: String = js.native
    
    /**
      * Whether the game canvas will be cleared between each rendering frame. You can disable this if you have a full-screen background image or game object.
      */
    /* CompleteClass */
    override val clearBeforeRender: Boolean = js.native
    
    /**
      * Force Phaser to use your own Canvas context instead of creating one.
      */
    /* CompleteClass */
    override val context: CanvasRenderingContext2D | WebGLRenderingContext = js.native
    
    /**
      * Is Phaser running under a custom (non-native web) environment? If so, set this to `true` to skip internal Feature detection. If `true` the `renderType` cannot be left as `AUTO`.
      */
    /* CompleteClass */
    override val customEnvironment: Boolean = js.native
    
    /**
      * A base64 encoded PNG that will be used as the default blank texture.
      */
    /* CompleteClass */
    override val defaultImage: String = js.native
    
    /**
      * The default physics system. It will be started for each scene. Either 'arcade', 'impact' or 'matter'.
      */
    /* CompleteClass */
    override val defaultPhysicsSystem: Boolean | String = js.native
    
    /**
      * The plugins installed into every Scene (in addition to CoreScene and Global).
      */
    /* CompleteClass */
    override val defaultPlugins: Any = js.native
    
    /**
      * When set to `true` it will create a desynchronized context for both 2D and WebGL. See https://developers.google.com/web/updates/2019/05/desynchronized for details.
      */
    /* CompleteClass */
    override val desynchronized: Boolean = js.native
    
    /**
      * Set to `true` to disable the right-click context menu.
      */
    /* CompleteClass */
    override val disableContextMenu: Boolean = js.native
    
    /**
      * Should the DOM Container that is created (if `dom.createContainer` is true) be positioned behind (true) or over the top (false, the default) of the game canvas?
      */
    /* CompleteClass */
    override val domBehindCanvas: Boolean = js.native
    
    /**
      * Should the game create a div element to act as a DOM Container? Only enable if you're using DOM Element objects. You must provide a parent object if you use this feature.
      */
    /* CompleteClass */
    override val domCreateContainer: Boolean = js.native
    
    /**
      * The default `pointerEvents` attribute set on the DOM Container.
      */
    /* CompleteClass */
    override val domPointerEvents: String = js.native
    
    /**
      * Is the Scale Manager allowed to adjust the CSS height property of the parent to be 100%?
      */
    /* CompleteClass */
    override val expandParent: Boolean = js.native
    
    /**
      * Let the browser abort creating a WebGL context if it judges performance would be unacceptable.
      */
    /* CompleteClass */
    override val failIfMajorPerformanceCaveat: Boolean = js.native
    
    /**
      * The Frame Rate Configuration object, as parsed by the Timestep class.
      */
    /* CompleteClass */
    override val fps: FPSConfig = js.native
    
    /**
      * The DOM element that will be sent into full screen mode, or its `id`. If undefined Phaser will create its own div and insert the canvas into it when entering fullscreen mode.
      */
    /* CompleteClass */
    override val fullscreenTarget: HTMLElement | String = js.native
    
    /**
      * The title of the game.
      */
    /* CompleteClass */
    override val gameTitle: String = js.native
    
    /**
      * The URL of the game.
      */
    /* CompleteClass */
    override val gameURL: String = js.native
    
    /**
      * The version of the game.
      */
    /* CompleteClass */
    override val gameVersion: String = js.native
    
    /**
      * The height of the underlying canvas, in pixels.
      */
    /* CompleteClass */
    override val height: Double | String = js.native
    
    /**
      * Don't write the banner line to the console.log.
      */
    /* CompleteClass */
    override val hideBanner: Boolean = js.native
    
    /**
      * Omit Phaser's name and version from the banner.
      */
    /* CompleteClass */
    override val hidePhaser: Boolean = js.native
    
    /**
      * The number of Pointer objects created by default. In a mouse-only, or non-multi touch game, you can leave this as 1.
      */
    /* CompleteClass */
    override val inputActivePointers: Double = js.native
    
    /**
      * Enable the Gamepad Plugin. This can be disabled in games that don't need gamepad input.
      */
    /* CompleteClass */
    override val inputGamepad: Boolean = js.native
    
    /**
      * The DOM Target to listen for gamepad events on. Defaults to `window` if not specified.
      */
    /* CompleteClass */
    override val inputGamepadEventTarget: Any = js.native
    
    /**
      * Enable the Keyboard Plugin. This can be disabled in games that don't need keyboard input.
      */
    /* CompleteClass */
    override val inputKeyboard: Boolean = js.native
    
    /**
      * `preventDefault` will be called on every non-modified key which has a key code in this array. By default, it is empty.
      */
    /* CompleteClass */
    override val inputKeyboardCapture: js.Array[Double] = js.native
    
    /**
      * The DOM Target to listen for keyboard events on. Defaults to `window` if not specified.
      */
    /* CompleteClass */
    override val inputKeyboardEventTarget: Any = js.native
    
    /**
      * Enable the Mouse Plugin. This can be disabled in games that don't need mouse input.
      */
    /* CompleteClass */
    override val inputMouse: Boolean | js.Object = js.native
    
    /**
      * The DOM Target to listen for mouse events on. Defaults to the game canvas if not specified.
      */
    /* CompleteClass */
    override val inputMouseEventTarget: Any = js.native
    
    /**
      * Should `mousedown` DOM events have `preventDefault` called on them?
      */
    /* CompleteClass */
    override val inputMousePreventDefaultDown: Boolean = js.native
    
    /**
      * Should `mousemove` DOM events have `preventDefault` called on them?
      */
    /* CompleteClass */
    override val inputMousePreventDefaultMove: Boolean = js.native
    
    /**
      * Should `mouseup` DOM events have `preventDefault` called on them?
      */
    /* CompleteClass */
    override val inputMousePreventDefaultUp: Boolean = js.native
    
    /**
      * Should `wheel` DOM events have `preventDefault` called on them?
      */
    /* CompleteClass */
    override val inputMousePreventDefaultWheel: Boolean = js.native
    
    /**
      * The smoothing factor to apply during Pointer movement. See {@link Phaser.Input.Pointer#smoothFactor}.
      */
    /* CompleteClass */
    override val inputSmoothFactor: Double = js.native
    
    /**
      * Enable the Touch Plugin. This can be disabled in games that don't need touch input.
      */
    /* CompleteClass */
    override val inputTouch: Boolean = js.native
    
    /**
      * Should touch events be captured? I.e. have prevent default called on them.
      */
    /* CompleteClass */
    override val inputTouchCapture: Boolean = js.native
    
    /**
      * The DOM Target to listen for touch events on. Defaults to the game canvas if not specified.
      */
    /* CompleteClass */
    override val inputTouchEventTarget: Any = js.native
    
    /**
      * Should Phaser listen for input events on the Window? If you disable this, events like 'POINTER_UP_OUTSIDE' will no longer fire.
      */
    /* CompleteClass */
    override val inputWindowEvents: Boolean = js.native
    
    /**
      * An array of global plugins to be installed.
      */
    /* CompleteClass */
    override val installGlobalPlugins: Any = js.native
    
    /**
      * An array of Scene level plugins to be installed.
      */
    /* CompleteClass */
    override val installScenePlugins: Any = js.native
    
    /**
      * Should the XHR request use async or not?
      */
    /* CompleteClass */
    override val loaderAsync: Boolean = js.native
    
    /**
      * A URL used to resolve paths given to the loader. Example: 'http://labs.phaser.io/assets/'.
      */
    /* CompleteClass */
    override val loaderBaseURL: String = js.native
    
    /**
      * Maximum parallel downloads allowed for resources (Default to 32).
      */
    /* CompleteClass */
    override val loaderMaxParallelDownloads: Double = js.native
    
    /**
      * Optional password for all XHR requests.
      */
    /* CompleteClass */
    override val loaderPassword: String = js.native
    
    /**
      * A URL path used to resolve relative paths given to the loader. Example: 'images/sprites/'.
      */
    /* CompleteClass */
    override val loaderPath: String = js.native
    
    /**
      * The response type of the XHR request, e.g. `blob`, `text`, etc.
      */
    /* CompleteClass */
    override val loaderResponseType: String = js.native
    
    /**
      * Optional XHR timeout value, in ms.
      */
    /* CompleteClass */
    override val loaderTimeout: Double = js.native
    
    /**
      * Optional username for all XHR requests.
      */
    /* CompleteClass */
    override val loaderUser: String = js.native
    
    /**
      * Optional XHR withCredentials value.
      */
    /* CompleteClass */
    override val loaderWithCredentials: Boolean = js.native
    
    /**
      * The maximum height, in pixels, the canvas will scale up to. A value of zero means no maximum.
      */
    /* CompleteClass */
    override val maxHeight: Double = js.native
    
    /**
      * The maximum number of lights allowed to be visible within range of a single Camera in the LightManager.
      */
    /* CompleteClass */
    override val maxLights: Double = js.native
    
    /**
      * When in WebGL mode, this sets the maximum number of GPU Textures to use. The default, -1, will use all available units. The WebGL1 spec says all browsers should provide a minimum of 8.
      */
    /* CompleteClass */
    override val maxTextures: Double = js.native
    
    /**
      * The maximum width, in pixels, the canvas will scale up to. A value of zero means no maximum.
      */
    /* CompleteClass */
    override val maxWidth: Double = js.native
    
    /**
      * The minimum height, in pixels, the canvas will scale down to. A value of zero means no minimum.
      */
    /* CompleteClass */
    override val minHeight: Double = js.native
    
    /**
      * The minimum width, in pixels, the canvas will scale down to. A value of zero means no minimum.
      */
    /* CompleteClass */
    override val minWidth: Double = js.native
    
    /**
      * Sets the `mipmapFilter` property when the WebGL renderer is created.
      */
    /* CompleteClass */
    override val mipmapFilter: String = js.native
    
    /**
      * A base64 encoded PNG that will be used as the default texture when a texture is assigned that is missing or not loaded.
      */
    /* CompleteClass */
    override val missingImage: String = js.native
    
    /**
      * A parent DOM element into which the canvas created by the renderer will be injected.
      */
    /* CompleteClass */
    override val parent: Any = js.native
    
    /**
      * The Physics Configuration object.
      */
    /* CompleteClass */
    override val physics: PhysicsConfig = js.native
    
    /**
      * An object mapping WebGL names to WebGLPipeline classes. These should be class constructors, not instances.
      */
    /* CompleteClass */
    override val pipeline: PipelineConfig = js.native
    
    /**
      * Prevent pixel art from becoming blurred when scaled. It will remain crisp (tells the WebGL renderer to automatically create textures using a linear filter mode).
      */
    /* CompleteClass */
    override val pixelArt: Boolean = js.native
    
    /**
      * A function to run at the end of the boot sequence. At this point, all the game systems have started and plugins have been loaded.
      */
    /* CompleteClass */
    override def postBoot(game: typings.phaser.Phaser.Game): Unit = js.native
    
    /**
      * "high-performance", "low-power" or "default". A hint to the browser on how much device power the game might use.
      */
    /* CompleteClass */
    override val powerPreference: String = js.native
    
    /**
      * Called before Phaser boots. Useful for initializing anything not related to Phaser that Phaser may require while booting.
      */
    /* CompleteClass */
    override def preBoot(game: typings.phaser.Phaser.Game): Unit = js.native
    
    /**
      * In WebGL mode, sets the drawing buffer to contain colors with pre-multiplied alpha.
      */
    /* CompleteClass */
    override val premultipliedAlpha: Boolean = js.native
    
    /**
      * If the value is true the WebGL buffers will not be cleared and will preserve their values until cleared or overwritten by the author.
      */
    /* CompleteClass */
    override val preserveDrawingBuffer: Boolean = js.native
    
    /**
      * Force Phaser to use a specific renderer. Can be `CONST.CANVAS`, `CONST.WEBGL`, `CONST.HEADLESS` or `CONST.AUTO` (default)
      */
    /* CompleteClass */
    override val renderType: Double = js.native
    
    /**
      * How many ms should elapse before checking if the browser size has changed?
      */
    /* CompleteClass */
    override val resizeInterval: Double = js.native
    
    /**
      * Draw texture-based Game Objects at only whole-integer positions. Game Objects without textures, like Graphics, ignore this property.
      */
    /* CompleteClass */
    override val roundPixels: Boolean = js.native
    
    /**
      * The scale mode as used by the Scale Manager. The default is zero, which is no scaling.
      */
    /* CompleteClass */
    override val scaleMode: ScaleModeType = js.native
    
    /**
      * The default Scene configuration object.
      */
    /* CompleteClass */
    override val sceneConfig: js.Object = js.native
    
    /**
      * A seed which the Random Data Generator will use. If not given, a dynamic seed based on the time is used.
      */
    /* CompleteClass */
    override val seed: js.Array[String] = js.native
    
    /**
      * Whether the game canvas will have a transparent background.
      */
    /* CompleteClass */
    override val transparent: Boolean = js.native
    
    /**
      * A base64 encoded PNG that will be used as the default texture when a texture is assigned that is white or not loaded.
      */
    /* CompleteClass */
    override val whiteImage: String = js.native
    
    /**
      * The width of the underlying canvas, in pixels.
      */
    /* CompleteClass */
    override val width: Double | String = js.native
    
    /**
      * The zoom factor, as used by the Scale Manager.
      */
    /* CompleteClass */
    override val zoom: ZoomType | Double = js.native
  }
  
  /**
    * Called automatically by Phaser.Game and responsible for creating the renderer it will use.
    * 
    * Relies upon two webpack global flags to be defined: `WEBGL_RENDERER` and `CANVAS_RENDERER` during build time, but not at run-time.
    * @param game The Phaser.Game instance on which the renderer will be set.
    */
  inline def CreateRenderer(game: typings.phaser.Phaser.Game): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("CreateRenderer")(game.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /**
    * Called automatically by Phaser.Game and responsible for creating the console.log debug header.
    * 
    * You can customize or disable the header via the Game Config object.
    * @param game The Phaser.Game instance which will output this debug header.
    */
  inline def DebugHeader(game: typings.phaser.Phaser.Game): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("DebugHeader")(game.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  object Events {
    
    /**
      * The Game Blur Event.
      * 
      * This event is dispatched by the Game Visibility Handler when the window in which the Game instance is embedded
      * enters a blurred state. The blur event is raised when the window loses focus. This can happen if a user swaps
      * tab, or if they simply remove focus from the browser to another app.
      */
    @JSImport("phaser", "Core.Events.BLUR")
    @js.native
    val BLUR: Any = js.native
    
    /**
      * The Game Boot Event.
      * 
      * This event is dispatched when the Phaser Game instance has finished booting, but before it is ready to start running.
      * The global systems use this event to know when to set themselves up, dispatching their own `ready` events as required.
      */
    @JSImport("phaser", "Core.Events.BOOT")
    @js.native
    val BOOT: Any = js.native
    
    /**
      * The Game Context Lost Event.
      * 
      * This event is dispatched by the Game if the WebGL Renderer it is using encounters a WebGL Context Lost event from the browser.
      * 
      * The partner event is `CONTEXT_RESTORED`.
      */
    @JSImport("phaser", "Core.Events.CONTEXT_LOST")
    @js.native
    val CONTEXT_LOST: Any = js.native
    
    /**
      * The Game Context Restored Event.
      * 
      * This event is dispatched by the Game if the WebGL Renderer it is using encounters a WebGL Context Restored event from the browser.
      * 
      * The partner event is `CONTEXT_LOST`.
      */
    @JSImport("phaser", "Core.Events.CONTEXT_RESTORED")
    @js.native
    val CONTEXT_RESTORED: Any = js.native
    
    /**
      * The Game Destroy Event.
      * 
      * This event is dispatched when the game instance has been told to destroy itself.
      * Lots of internal systems listen to this event in order to clear themselves out.
      * Custom plugins and game code should also do the same.
      */
    @JSImport("phaser", "Core.Events.DESTROY")
    @js.native
    val DESTROY: Any = js.native
    
    /**
      * The Game Focus Event.
      * 
      * This event is dispatched by the Game Visibility Handler when the window in which the Game instance is embedded
      * enters a focused state. The focus event is raised when the window re-gains focus, having previously lost it.
      */
    @JSImport("phaser", "Core.Events.FOCUS")
    @js.native
    val FOCUS: Any = js.native
    
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
    @JSImport("phaser", "Core.Events.HIDDEN")
    @js.native
    val HIDDEN: Any = js.native
    
    /**
      * The Game Pause Event.
      * 
      * This event is dispatched when the Game loop enters a paused state, usually as a result of the Visibility Handler.
      */
    @JSImport("phaser", "Core.Events.PAUSE")
    @js.native
    val PAUSE: Any = js.native
    
    /**
      * The Game Post-Render Event.
      * 
      * This event is dispatched right at the end of the render process.
      * 
      * Every Scene will have rendered and been drawn to the canvas by the time this event is fired.
      * Use it for any last minute post-processing before the next game step begins.
      */
    @JSImport("phaser", "Core.Events.POST_RENDER")
    @js.native
    val POST_RENDER: Any = js.native
    
    /**
      * The Game Post-Step Event.
      * 
      * This event is dispatched after the Scene Manager has updated.
      * Hook into it from plugins or systems that need to do things before the render starts.
      */
    @JSImport("phaser", "Core.Events.POST_STEP")
    @js.native
    val POST_STEP: Any = js.native
    
    /**
      * The Game Pre-Render Event.
      * 
      * This event is dispatched immediately before any of the Scenes have started to render.
      * 
      * The renderer will already have been initialized this frame, clearing itself and preparing to receive the Scenes for rendering, but it won't have actually drawn anything yet.
      */
    @JSImport("phaser", "Core.Events.PRE_RENDER")
    @js.native
    val PRE_RENDER: Any = js.native
    
    /**
      * The Game Pre-Step Event.
      * 
      * This event is dispatched before the main Game Step starts. By this point in the game cycle none of the Scene updates have yet happened.
      * Hook into it from plugins or systems that need to update before the Scene Manager does.
      */
    @JSImport("phaser", "Core.Events.PRE_STEP")
    @js.native
    val PRE_STEP: Any = js.native
    
    /**
      * The Game Ready Event.
      * 
      * This event is dispatched when the Phaser Game instance has finished booting, the Texture Manager is fully ready,
      * and all local systems are now able to start.
      */
    @JSImport("phaser", "Core.Events.READY")
    @js.native
    val READY: Any = js.native
    
    /**
      * The Game Resume Event.
      * 
      * This event is dispatched when the game loop leaves a paused state and resumes running.
      */
    @JSImport("phaser", "Core.Events.RESUME")
    @js.native
    val RESUME: Any = js.native
    
    /**
      * The Game Step Event.
      * 
      * This event is dispatched after the Game Pre-Step and before the Scene Manager steps.
      * Hook into it from plugins or systems that need to update before the Scene Manager does, but after the core Systems have.
      */
    @JSImport("phaser", "Core.Events.STEP")
    @js.native
    val STEP: Any = js.native
    
    /**
      * The Game Visible Event.
      * 
      * This event is dispatched by the Game Visibility Handler when the document in which the Game instance is embedded
      * enters a visible state, previously having been hidden.
      * 
      * Only browsers that support the Visibility API will cause this event to be emitted.
      */
    @JSImport("phaser", "Core.Events.VISIBLE")
    @js.native
    val VISIBLE: Any = js.native
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
  @JSImport("phaser", "Core.TimeStep")
  @js.native
  open class TimeStep protected ()
    extends StObject
       with typings.phaser.Phaser.Core.TimeStep {
    /**
      * 
      * @param game A reference to the Phaser.Game instance that owns this Time Step.
      */
    def this(game: typings.phaser.Phaser.Game, config: FPSConfig) = this()
  }
  
  /**
    * The Visibility Handler is responsible for listening out for document level visibility change events.
    * This includes `visibilitychange` if the browser supports it, and blur and focus events. It then uses
    * the provided Event Emitter and fires the related events.
    * @param game The Game instance this Visibility Handler is working on.
    */
  inline def VisibilityHandler(game: typings.phaser.Phaser.Game): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("VisibilityHandler")(game.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
