package typings.phaser.Phaser.Core

import typings.phaser.Phaser.Display.Color
import typings.phaser.Phaser.Game
import typings.phaser.Phaser.Scale.CenterType
import typings.phaser.Phaser.Scale.ScaleModeType
import typings.phaser.Phaser.Scale.ZoomType
import typings.phaser.Phaser.Types.Core.AudioConfig
import typings.phaser.Phaser.Types.Core.FPSConfig
import typings.phaser.Phaser.Types.Core.PhysicsConfig
import typings.phaser.integer
import typings.std.CanvasRenderingContext2D
import typings.std.HTMLCanvasElement
import typings.std.HTMLElement
import typings.std.WebGLRenderingContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The active game configuration settings, parsed from a {@link Phaser.Types.Core.GameConfig} object.
  */
trait Config extends js.Object {
  /**
    * When set to `true`, WebGL uses linear interpolation to draw scaled or rotated textures, giving a smooth appearance. When set to `false`, WebGL uses nearest-neighbor interpolation, giving a crisper appearance. `false` also disables antialiasing of the game canvas itself, if the browser supports it, when the game canvas is scaled.
    */
  val antialias: Boolean
  /**
    * Sets the `antialias` property when the WebGL context is created. Setting this value does not impact any subsequent textures that are created, or the canvas style attributes.
    */
  val antialiasGL: Boolean
  /**
    * The Audio Configuration object.
    */
  val audio: AudioConfig
  /**
    * Automatically center the canvas within the parent?
    */
  val autoCenter: CenterType
  /**
    * If `true` the window will automatically be given focus immediately and on any future mousedown event.
    */
  val autoFocus: Boolean
  /**
    * Automatically round the display and style sizes of the canvas. This can help with performance in lower-powered devices.
    */
  val autoRound: integer
  /**
    * The background color of the game canvas. The default is black. This value is ignored if `transparent` is set to `true`.
    */
  val backgroundColor: Color
  /**
    * The background colors of the banner.
    */
  val bannerBackgroundColor: js.Array[String]
  /**
    * The color of the banner text.
    */
  val bannerTextColor: String
  /**
    * The default WebGL Batch size.
    */
  val batchSize: integer
  /**
    * Force Phaser to use your own Canvas element instead of creating one.
    */
  val canvas: HTMLCanvasElement
  /**
    * Optional CSS attributes to be set on the canvas object created by the renderer.
    */
  val canvasStyle: String
  /**
    * Whether the game canvas will be cleared between each rendering frame. You can disable this if you have a full-screen background image or game object.
    */
  val clearBeforeRender: Boolean
  /**
    * Force Phaser to use your own Canvas context instead of creating one.
    */
  val context: CanvasRenderingContext2D | WebGLRenderingContext
  /**
    * Is Phaser running under a custom (non-native web) environment? If so, set this to `true` to skip internal Feature detection. If `true` the `renderType` cannot be left as `AUTO`.
    */
  val customEnvironment: Boolean
  /**
    * A base64 encoded PNG that will be used as the default blank texture.
    */
  val defaultImage: String
  /**
    * The default physics system. It will be started for each scene. Either 'arcade', 'impact' or 'matter'.
    */
  val defaultPhysicsSystem: Boolean | String
  /**
    * The plugins installed into every Scene (in addition to CoreScene and Global).
    */
  val defaultPlugins: js.Any
  /**
    * When set to `true` it will create a desynchronized context for both 2D and WebGL. See https://developers.google.com/web/updates/2019/05/desynchronized for details.
    */
  val desynchronized: Boolean
  /**
    * Set to `true` to disable the right-click context menu.
    */
  val disableContextMenu: Boolean
  /**
    * Should the DOM Container that is created (if `dom.createContainer` is true) be positioned behind (true) or over the top (false, the default) of the game canvas?
    */
  val domBehindCanvas: Boolean
  /**
    * Should the game create a div element to act as a DOM Container? Only enable if you're using DOM Element objects. You must provide a parent object if you use this feature.
    */
  val domCreateContainer: Boolean
  /**
    * Is the Scale Manager allowed to adjust the CSS height property of the parent to be 100%?
    */
  val expandParent: Boolean
  /**
    * Let the browser abort creating a WebGL context if it judges performance would be unacceptable.
    */
  val failIfMajorPerformanceCaveat: Boolean
  /**
    * The Frame Rate Configuration object, as parsed by the Timestep class.
    */
  val fps: FPSConfig
  /**
    * The DOM element that will be sent into full screen mode, or its `id`. If undefined Phaser will create its own div and insert the canvas into it when entering fullscreen mode.
    */
  val fullscreenTarget: HTMLElement | String
  /**
    * The title of the game.
    */
  val gameTitle: String
  /**
    * The URL of the game.
    */
  val gameURL: String
  /**
    * The version of the game.
    */
  val gameVersion: String
  /**
    * The height of the underlying canvas, in pixels.
    */
  val height: integer | String
  /**
    * Don't write the banner line to the console.log.
    */
  val hideBanner: Boolean
  /**
    * Omit Phaser's name and version from the banner.
    */
  val hidePhaser: Boolean
  /**
    * The number of Pointer objects created by default. In a mouse-only, or non-multi touch game, you can leave this as 1.
    */
  val inputActivePointers: integer
  /**
    * Enable the Gamepad Plugin. This can be disabled in games that don't need gamepad input.
    */
  val inputGamepad: Boolean
  /**
    * The DOM Target to listen for gamepad events on. Defaults to `window` if not specified.
    */
  val inputGamepadEventTarget: js.Any
  /**
    * Enable the Keyboard Plugin. This can be disabled in games that don't need keyboard input.
    */
  val inputKeyboard: Boolean
  /**
    * `preventDefault` will be called on every non-modified key which has a key code in this array. By default, it is empty.
    */
  val inputKeyboardCapture: js.Array[integer]
  /**
    * The DOM Target to listen for keyboard events on. Defaults to `window` if not specified.
    */
  val inputKeyboardEventTarget: js.Any
  /**
    * Enable the Mouse Plugin. This can be disabled in games that don't need mouse input.
    */
  val inputMouse: Boolean | js.Object
  /**
    * Should mouse events be captured? I.e. have prevent default called on them.
    */
  val inputMouseCapture: Boolean
  /**
    * The DOM Target to listen for mouse events on. Defaults to the game canvas if not specified.
    */
  val inputMouseEventTarget: js.Any
  /**
    * The smoothing factor to apply during Pointer movement. See {@link Phaser.Input.Pointer#smoothFactor}.
    */
  val inputSmoothFactor: integer
  /**
    * Enable the Touch Plugin. This can be disabled in games that don't need touch input.
    */
  val inputTouch: Boolean
  /**
    * Should touch events be captured? I.e. have prevent default called on them.
    */
  val inputTouchCapture: Boolean
  /**
    * The DOM Target to listen for touch events on. Defaults to the game canvas if not specified.
    */
  val inputTouchEventTarget: js.Any
  /**
    * Should Phaser listen for input events on the Window? If you disable this, events like 'POINTER_UP_OUTSIDE' will no longer fire.
    */
  val inputWindowEvents: Boolean
  /**
    * An array of global plugins to be installed.
    */
  val installGlobalPlugins: js.Any
  /**
    * An array of Scene level plugins to be installed.
    */
  val installScenePlugins: js.Any
  /**
    * Should the XHR request use async or not?
    */
  val loaderAsync: Boolean
  /**
    * A URL used to resolve paths given to the loader. Example: 'http://labs.phaser.io/assets/'.
    */
  val loaderBaseURL: String
  /**
    * 'anonymous', 'use-credentials', or `undefined`. If you're not making cross-origin requests, leave this as `undefined`. See {@link https://developer.mozilla.org/en-US/docs/Web/HTML/CORS_settings_attributes}.
    */
  val loaderCrossOrigin: js.UndefOr[String] = js.undefined
  /**
    * Maximum parallel downloads allowed for resources (Default to 32).
    */
  val loaderMaxParallelDownloads: integer
  /**
    * Optional password for all XHR requests.
    */
  val loaderPassword: String
  /**
    * A URL path used to resolve relative paths given to the loader. Example: 'images/sprites/'.
    */
  val loaderPath: String
  /**
    * The response type of the XHR request, e.g. `blob`, `text`, etc.
    */
  val loaderResponseType: String
  /**
    * Optional XHR timeout value, in ms.
    */
  val loaderTimeout: integer
  /**
    * Optional username for all XHR requests.
    */
  val loaderUser: String
  /**
    * Optional XHR withCredentials value.
    */
  val loaderWithCredentials: Boolean
  /**
    * The maximum height, in pixels, the canvas will scale up to. A value of zero means no maximum.
    */
  val maxHeight: integer
  /**
    * The maximum number of lights allowed to be visible within range of a single Camera in the LightManager.
    */
  val maxLights: integer
  /**
    * The maximum width, in pixels, the canvas will scale up to. A value of zero means no maximum.
    */
  val maxWidth: integer
  /**
    * The minimum height, in pixels, the canvas will scale down to. A value of zero means no minimum.
    */
  val minHeight: integer
  /**
    * The minimum width, in pixels, the canvas will scale down to. A value of zero means no minimum.
    */
  val minWidth: integer
  /**
    * Sets the `mipmapFilter` property when the WebGL renderer is created.
    */
  val mipmapFilter: String
  /**
    * A base64 encoded PNG that will be used as the default texture when a texture is assigned that is missing or not loaded.
    */
  val missingImage: String
  /**
    * A parent DOM element into which the canvas created by the renderer will be injected.
    */
  val parent: js.Any
  /**
    * The Physics Configuration object.
    */
  val physics: PhysicsConfig
  /**
    * Prevent pixel art from becoming blurred when scaled. It will remain crisp (tells the WebGL renderer to automatically create textures using a linear filter mode).
    */
  val pixelArt: Boolean
  /**
    * "high-performance", "low-power" or "default". A hint to the browser on how much device power the game might use.
    */
  val powerPreference: String
  /**
    * In WebGL mode, sets the drawing buffer to contain colors with pre-multiplied alpha.
    */
  val premultipliedAlpha: Boolean
  /**
    * Force Phaser to use a specific renderer. Can be `CONST.CANVAS`, `CONST.WEBGL`, `CONST.HEADLESS` or `CONST.AUTO` (default)
    */
  val renderType: Double
  /**
    * How many ms should elapse before checking if the browser size has changed?
    */
  val resizeInterval: integer
  /**
    * The canvas device pixel resolution. Currently un-used.
    */
  val resolution: Double
  /**
    * Draw texture-based Game Objects at only whole-integer positions. Game Objects without textures, like Graphics, ignore this property.
    */
  val roundPixels: Boolean
  /**
    * The scale mode as used by the Scale Manager. The default is zero, which is no scaling.
    */
  val scaleMode: ScaleModeType
  /**
    * The default Scene configuration object.
    */
  val sceneConfig: js.Object
  /**
    * A seed which the Random Data Generator will use. If not given, a dynamic seed based on the time is used.
    */
  val seed: js.Array[String]
  /**
    * Whether the game canvas will have a transparent background.
    */
  val transparent: Boolean
  /**
    * The width of the underlying canvas, in pixels.
    */
  val width: integer | String
  /**
    * The zoom factor, as used by the Scale Manager.
    */
  val zoom: ZoomType | integer
  /**
    * A function to run at the end of the boot sequence. At this point, all the game systems have started and plugins have been loaded.
    */
  def postBoot(game: Game): Unit
  /**
    * Called before Phaser boots. Useful for initializing anything not related to Phaser that Phaser may require while booting.
    */
  def preBoot(game: Game): Unit
}

object Config {
  @scala.inline
  def apply(
    antialias: Boolean,
    antialiasGL: Boolean,
    audio: AudioConfig,
    autoCenter: CenterType,
    autoFocus: Boolean,
    autoRound: integer,
    backgroundColor: Color,
    bannerBackgroundColor: js.Array[String],
    bannerTextColor: String,
    batchSize: integer,
    canvas: HTMLCanvasElement,
    canvasStyle: String,
    clearBeforeRender: Boolean,
    context: CanvasRenderingContext2D | WebGLRenderingContext,
    customEnvironment: Boolean,
    defaultImage: String,
    defaultPhysicsSystem: Boolean | String,
    defaultPlugins: js.Any,
    desynchronized: Boolean,
    disableContextMenu: Boolean,
    domBehindCanvas: Boolean,
    domCreateContainer: Boolean,
    expandParent: Boolean,
    failIfMajorPerformanceCaveat: Boolean,
    fps: FPSConfig,
    fullscreenTarget: HTMLElement | String,
    gameTitle: String,
    gameURL: String,
    gameVersion: String,
    height: integer | String,
    hideBanner: Boolean,
    hidePhaser: Boolean,
    inputActivePointers: integer,
    inputGamepad: Boolean,
    inputGamepadEventTarget: js.Any,
    inputKeyboard: Boolean,
    inputKeyboardCapture: js.Array[integer],
    inputKeyboardEventTarget: js.Any,
    inputMouse: Boolean | js.Object,
    inputMouseCapture: Boolean,
    inputMouseEventTarget: js.Any,
    inputSmoothFactor: integer,
    inputTouch: Boolean,
    inputTouchCapture: Boolean,
    inputTouchEventTarget: js.Any,
    inputWindowEvents: Boolean,
    installGlobalPlugins: js.Any,
    installScenePlugins: js.Any,
    loaderAsync: Boolean,
    loaderBaseURL: String,
    loaderMaxParallelDownloads: integer,
    loaderPassword: String,
    loaderPath: String,
    loaderResponseType: String,
    loaderTimeout: integer,
    loaderUser: String,
    loaderWithCredentials: Boolean,
    maxHeight: integer,
    maxLights: integer,
    maxWidth: integer,
    minHeight: integer,
    minWidth: integer,
    mipmapFilter: String,
    missingImage: String,
    parent: js.Any,
    physics: PhysicsConfig,
    pixelArt: Boolean,
    postBoot: Game => Unit,
    powerPreference: String,
    preBoot: Game => Unit,
    premultipliedAlpha: Boolean,
    renderType: Double,
    resizeInterval: integer,
    resolution: Double,
    roundPixels: Boolean,
    scaleMode: ScaleModeType,
    sceneConfig: js.Object,
    seed: js.Array[String],
    transparent: Boolean,
    width: integer | String,
    zoom: ZoomType | integer,
    loaderCrossOrigin: String = null
  ): Config = {
    val __obj = js.Dynamic.literal(antialias = antialias.asInstanceOf[js.Any], antialiasGL = antialiasGL.asInstanceOf[js.Any], audio = audio.asInstanceOf[js.Any], autoCenter = autoCenter.asInstanceOf[js.Any], autoFocus = autoFocus.asInstanceOf[js.Any], autoRound = autoRound.asInstanceOf[js.Any], backgroundColor = backgroundColor.asInstanceOf[js.Any], bannerBackgroundColor = bannerBackgroundColor.asInstanceOf[js.Any], bannerTextColor = bannerTextColor.asInstanceOf[js.Any], batchSize = batchSize.asInstanceOf[js.Any], canvas = canvas.asInstanceOf[js.Any], canvasStyle = canvasStyle.asInstanceOf[js.Any], clearBeforeRender = clearBeforeRender.asInstanceOf[js.Any], context = context.asInstanceOf[js.Any], customEnvironment = customEnvironment.asInstanceOf[js.Any], defaultImage = defaultImage.asInstanceOf[js.Any], defaultPhysicsSystem = defaultPhysicsSystem.asInstanceOf[js.Any], defaultPlugins = defaultPlugins.asInstanceOf[js.Any], desynchronized = desynchronized.asInstanceOf[js.Any], disableContextMenu = disableContextMenu.asInstanceOf[js.Any], domBehindCanvas = domBehindCanvas.asInstanceOf[js.Any], domCreateContainer = domCreateContainer.asInstanceOf[js.Any], expandParent = expandParent.asInstanceOf[js.Any], failIfMajorPerformanceCaveat = failIfMajorPerformanceCaveat.asInstanceOf[js.Any], fps = fps.asInstanceOf[js.Any], fullscreenTarget = fullscreenTarget.asInstanceOf[js.Any], gameTitle = gameTitle.asInstanceOf[js.Any], gameURL = gameURL.asInstanceOf[js.Any], gameVersion = gameVersion.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], hideBanner = hideBanner.asInstanceOf[js.Any], hidePhaser = hidePhaser.asInstanceOf[js.Any], inputActivePointers = inputActivePointers.asInstanceOf[js.Any], inputGamepad = inputGamepad.asInstanceOf[js.Any], inputGamepadEventTarget = inputGamepadEventTarget.asInstanceOf[js.Any], inputKeyboard = inputKeyboard.asInstanceOf[js.Any], inputKeyboardCapture = inputKeyboardCapture.asInstanceOf[js.Any], inputKeyboardEventTarget = inputKeyboardEventTarget.asInstanceOf[js.Any], inputMouse = inputMouse.asInstanceOf[js.Any], inputMouseCapture = inputMouseCapture.asInstanceOf[js.Any], inputMouseEventTarget = inputMouseEventTarget.asInstanceOf[js.Any], inputSmoothFactor = inputSmoothFactor.asInstanceOf[js.Any], inputTouch = inputTouch.asInstanceOf[js.Any], inputTouchCapture = inputTouchCapture.asInstanceOf[js.Any], inputTouchEventTarget = inputTouchEventTarget.asInstanceOf[js.Any], inputWindowEvents = inputWindowEvents.asInstanceOf[js.Any], installGlobalPlugins = installGlobalPlugins.asInstanceOf[js.Any], installScenePlugins = installScenePlugins.asInstanceOf[js.Any], loaderAsync = loaderAsync.asInstanceOf[js.Any], loaderBaseURL = loaderBaseURL.asInstanceOf[js.Any], loaderMaxParallelDownloads = loaderMaxParallelDownloads.asInstanceOf[js.Any], loaderPassword = loaderPassword.asInstanceOf[js.Any], loaderPath = loaderPath.asInstanceOf[js.Any], loaderResponseType = loaderResponseType.asInstanceOf[js.Any], loaderTimeout = loaderTimeout.asInstanceOf[js.Any], loaderUser = loaderUser.asInstanceOf[js.Any], loaderWithCredentials = loaderWithCredentials.asInstanceOf[js.Any], maxHeight = maxHeight.asInstanceOf[js.Any], maxLights = maxLights.asInstanceOf[js.Any], maxWidth = maxWidth.asInstanceOf[js.Any], minHeight = minHeight.asInstanceOf[js.Any], minWidth = minWidth.asInstanceOf[js.Any], mipmapFilter = mipmapFilter.asInstanceOf[js.Any], missingImage = missingImage.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], physics = physics.asInstanceOf[js.Any], pixelArt = pixelArt.asInstanceOf[js.Any], postBoot = js.Any.fromFunction1(postBoot), powerPreference = powerPreference.asInstanceOf[js.Any], preBoot = js.Any.fromFunction1(preBoot), premultipliedAlpha = premultipliedAlpha.asInstanceOf[js.Any], renderType = renderType.asInstanceOf[js.Any], resizeInterval = resizeInterval.asInstanceOf[js.Any], resolution = resolution.asInstanceOf[js.Any], roundPixels = roundPixels.asInstanceOf[js.Any], scaleMode = scaleMode.asInstanceOf[js.Any], sceneConfig = sceneConfig.asInstanceOf[js.Any], seed = seed.asInstanceOf[js.Any], transparent = transparent.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], zoom = zoom.asInstanceOf[js.Any])
    if (loaderCrossOrigin != null) __obj.updateDynamic("loaderCrossOrigin")(loaderCrossOrigin.asInstanceOf[js.Any])
    __obj.asInstanceOf[Config]
  }
}

