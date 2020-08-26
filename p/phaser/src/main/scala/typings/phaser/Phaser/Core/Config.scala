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
@js.native
trait Config extends js.Object {
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
    * Optional XHR withCredentials value.
    */
  val loaderWithCredentials: Boolean = js.native
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
    zoom: ZoomType | integer
  ): Config = {
    val __obj = js.Dynamic.literal(antialias = antialias.asInstanceOf[js.Any], antialiasGL = antialiasGL.asInstanceOf[js.Any], audio = audio.asInstanceOf[js.Any], autoCenter = autoCenter.asInstanceOf[js.Any], autoFocus = autoFocus.asInstanceOf[js.Any], autoRound = autoRound.asInstanceOf[js.Any], backgroundColor = backgroundColor.asInstanceOf[js.Any], bannerBackgroundColor = bannerBackgroundColor.asInstanceOf[js.Any], bannerTextColor = bannerTextColor.asInstanceOf[js.Any], batchSize = batchSize.asInstanceOf[js.Any], canvas = canvas.asInstanceOf[js.Any], canvasStyle = canvasStyle.asInstanceOf[js.Any], clearBeforeRender = clearBeforeRender.asInstanceOf[js.Any], context = context.asInstanceOf[js.Any], customEnvironment = customEnvironment.asInstanceOf[js.Any], defaultImage = defaultImage.asInstanceOf[js.Any], defaultPhysicsSystem = defaultPhysicsSystem.asInstanceOf[js.Any], defaultPlugins = defaultPlugins.asInstanceOf[js.Any], desynchronized = desynchronized.asInstanceOf[js.Any], disableContextMenu = disableContextMenu.asInstanceOf[js.Any], domBehindCanvas = domBehindCanvas.asInstanceOf[js.Any], domCreateContainer = domCreateContainer.asInstanceOf[js.Any], expandParent = expandParent.asInstanceOf[js.Any], failIfMajorPerformanceCaveat = failIfMajorPerformanceCaveat.asInstanceOf[js.Any], fps = fps.asInstanceOf[js.Any], fullscreenTarget = fullscreenTarget.asInstanceOf[js.Any], gameTitle = gameTitle.asInstanceOf[js.Any], gameURL = gameURL.asInstanceOf[js.Any], gameVersion = gameVersion.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], hideBanner = hideBanner.asInstanceOf[js.Any], hidePhaser = hidePhaser.asInstanceOf[js.Any], inputActivePointers = inputActivePointers.asInstanceOf[js.Any], inputGamepad = inputGamepad.asInstanceOf[js.Any], inputGamepadEventTarget = inputGamepadEventTarget.asInstanceOf[js.Any], inputKeyboard = inputKeyboard.asInstanceOf[js.Any], inputKeyboardCapture = inputKeyboardCapture.asInstanceOf[js.Any], inputKeyboardEventTarget = inputKeyboardEventTarget.asInstanceOf[js.Any], inputMouse = inputMouse.asInstanceOf[js.Any], inputMouseCapture = inputMouseCapture.asInstanceOf[js.Any], inputMouseEventTarget = inputMouseEventTarget.asInstanceOf[js.Any], inputSmoothFactor = inputSmoothFactor.asInstanceOf[js.Any], inputTouch = inputTouch.asInstanceOf[js.Any], inputTouchCapture = inputTouchCapture.asInstanceOf[js.Any], inputTouchEventTarget = inputTouchEventTarget.asInstanceOf[js.Any], inputWindowEvents = inputWindowEvents.asInstanceOf[js.Any], installGlobalPlugins = installGlobalPlugins.asInstanceOf[js.Any], installScenePlugins = installScenePlugins.asInstanceOf[js.Any], loaderAsync = loaderAsync.asInstanceOf[js.Any], loaderBaseURL = loaderBaseURL.asInstanceOf[js.Any], loaderMaxParallelDownloads = loaderMaxParallelDownloads.asInstanceOf[js.Any], loaderPassword = loaderPassword.asInstanceOf[js.Any], loaderPath = loaderPath.asInstanceOf[js.Any], loaderResponseType = loaderResponseType.asInstanceOf[js.Any], loaderTimeout = loaderTimeout.asInstanceOf[js.Any], loaderUser = loaderUser.asInstanceOf[js.Any], loaderWithCredentials = loaderWithCredentials.asInstanceOf[js.Any], maxHeight = maxHeight.asInstanceOf[js.Any], maxLights = maxLights.asInstanceOf[js.Any], maxWidth = maxWidth.asInstanceOf[js.Any], minHeight = minHeight.asInstanceOf[js.Any], minWidth = minWidth.asInstanceOf[js.Any], mipmapFilter = mipmapFilter.asInstanceOf[js.Any], missingImage = missingImage.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], physics = physics.asInstanceOf[js.Any], pixelArt = pixelArt.asInstanceOf[js.Any], postBoot = js.Any.fromFunction1(postBoot), powerPreference = powerPreference.asInstanceOf[js.Any], preBoot = js.Any.fromFunction1(preBoot), premultipliedAlpha = premultipliedAlpha.asInstanceOf[js.Any], renderType = renderType.asInstanceOf[js.Any], resizeInterval = resizeInterval.asInstanceOf[js.Any], resolution = resolution.asInstanceOf[js.Any], roundPixels = roundPixels.asInstanceOf[js.Any], scaleMode = scaleMode.asInstanceOf[js.Any], sceneConfig = sceneConfig.asInstanceOf[js.Any], seed = seed.asInstanceOf[js.Any], transparent = transparent.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], zoom = zoom.asInstanceOf[js.Any])
    __obj.asInstanceOf[Config]
  }
  @scala.inline
  implicit class ConfigOps[Self <: Config] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAntialias(value: Boolean): Self = this.set("antialias", value.asInstanceOf[js.Any])
    @scala.inline
    def setAntialiasGL(value: Boolean): Self = this.set("antialiasGL", value.asInstanceOf[js.Any])
    @scala.inline
    def setAudio(value: AudioConfig): Self = this.set("audio", value.asInstanceOf[js.Any])
    @scala.inline
    def setAutoCenter(value: CenterType): Self = this.set("autoCenter", value.asInstanceOf[js.Any])
    @scala.inline
    def setAutoFocus(value: Boolean): Self = this.set("autoFocus", value.asInstanceOf[js.Any])
    @scala.inline
    def setAutoRound(value: integer): Self = this.set("autoRound", value.asInstanceOf[js.Any])
    @scala.inline
    def setBackgroundColor(value: Color): Self = this.set("backgroundColor", value.asInstanceOf[js.Any])
    @scala.inline
    def setBannerBackgroundColorVarargs(value: String*): Self = this.set("bannerBackgroundColor", js.Array(value :_*))
    @scala.inline
    def setBannerBackgroundColor(value: js.Array[String]): Self = this.set("bannerBackgroundColor", value.asInstanceOf[js.Any])
    @scala.inline
    def setBannerTextColor(value: String): Self = this.set("bannerTextColor", value.asInstanceOf[js.Any])
    @scala.inline
    def setBatchSize(value: integer): Self = this.set("batchSize", value.asInstanceOf[js.Any])
    @scala.inline
    def setCanvas(value: HTMLCanvasElement): Self = this.set("canvas", value.asInstanceOf[js.Any])
    @scala.inline
    def setCanvasStyle(value: String): Self = this.set("canvasStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def setClearBeforeRender(value: Boolean): Self = this.set("clearBeforeRender", value.asInstanceOf[js.Any])
    @scala.inline
    def setContext(value: CanvasRenderingContext2D | WebGLRenderingContext): Self = this.set("context", value.asInstanceOf[js.Any])
    @scala.inline
    def setCustomEnvironment(value: Boolean): Self = this.set("customEnvironment", value.asInstanceOf[js.Any])
    @scala.inline
    def setDefaultImage(value: String): Self = this.set("defaultImage", value.asInstanceOf[js.Any])
    @scala.inline
    def setDefaultPhysicsSystem(value: Boolean | String): Self = this.set("defaultPhysicsSystem", value.asInstanceOf[js.Any])
    @scala.inline
    def setDefaultPlugins(value: js.Any): Self = this.set("defaultPlugins", value.asInstanceOf[js.Any])
    @scala.inline
    def setDesynchronized(value: Boolean): Self = this.set("desynchronized", value.asInstanceOf[js.Any])
    @scala.inline
    def setDisableContextMenu(value: Boolean): Self = this.set("disableContextMenu", value.asInstanceOf[js.Any])
    @scala.inline
    def setDomBehindCanvas(value: Boolean): Self = this.set("domBehindCanvas", value.asInstanceOf[js.Any])
    @scala.inline
    def setDomCreateContainer(value: Boolean): Self = this.set("domCreateContainer", value.asInstanceOf[js.Any])
    @scala.inline
    def setExpandParent(value: Boolean): Self = this.set("expandParent", value.asInstanceOf[js.Any])
    @scala.inline
    def setFailIfMajorPerformanceCaveat(value: Boolean): Self = this.set("failIfMajorPerformanceCaveat", value.asInstanceOf[js.Any])
    @scala.inline
    def setFps(value: FPSConfig): Self = this.set("fps", value.asInstanceOf[js.Any])
    @scala.inline
    def setFullscreenTarget(value: HTMLElement | String): Self = this.set("fullscreenTarget", value.asInstanceOf[js.Any])
    @scala.inline
    def setGameTitle(value: String): Self = this.set("gameTitle", value.asInstanceOf[js.Any])
    @scala.inline
    def setGameURL(value: String): Self = this.set("gameURL", value.asInstanceOf[js.Any])
    @scala.inline
    def setGameVersion(value: String): Self = this.set("gameVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def setHeight(value: integer | String): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def setHideBanner(value: Boolean): Self = this.set("hideBanner", value.asInstanceOf[js.Any])
    @scala.inline
    def setHidePhaser(value: Boolean): Self = this.set("hidePhaser", value.asInstanceOf[js.Any])
    @scala.inline
    def setInputActivePointers(value: integer): Self = this.set("inputActivePointers", value.asInstanceOf[js.Any])
    @scala.inline
    def setInputGamepad(value: Boolean): Self = this.set("inputGamepad", value.asInstanceOf[js.Any])
    @scala.inline
    def setInputGamepadEventTarget(value: js.Any): Self = this.set("inputGamepadEventTarget", value.asInstanceOf[js.Any])
    @scala.inline
    def setInputKeyboard(value: Boolean): Self = this.set("inputKeyboard", value.asInstanceOf[js.Any])
    @scala.inline
    def setInputKeyboardCaptureVarargs(value: integer*): Self = this.set("inputKeyboardCapture", js.Array(value :_*))
    @scala.inline
    def setInputKeyboardCapture(value: js.Array[integer]): Self = this.set("inputKeyboardCapture", value.asInstanceOf[js.Any])
    @scala.inline
    def setInputKeyboardEventTarget(value: js.Any): Self = this.set("inputKeyboardEventTarget", value.asInstanceOf[js.Any])
    @scala.inline
    def setInputMouse(value: Boolean | js.Object): Self = this.set("inputMouse", value.asInstanceOf[js.Any])
    @scala.inline
    def setInputMouseCapture(value: Boolean): Self = this.set("inputMouseCapture", value.asInstanceOf[js.Any])
    @scala.inline
    def setInputMouseEventTarget(value: js.Any): Self = this.set("inputMouseEventTarget", value.asInstanceOf[js.Any])
    @scala.inline
    def setInputSmoothFactor(value: integer): Self = this.set("inputSmoothFactor", value.asInstanceOf[js.Any])
    @scala.inline
    def setInputTouch(value: Boolean): Self = this.set("inputTouch", value.asInstanceOf[js.Any])
    @scala.inline
    def setInputTouchCapture(value: Boolean): Self = this.set("inputTouchCapture", value.asInstanceOf[js.Any])
    @scala.inline
    def setInputTouchEventTarget(value: js.Any): Self = this.set("inputTouchEventTarget", value.asInstanceOf[js.Any])
    @scala.inline
    def setInputWindowEvents(value: Boolean): Self = this.set("inputWindowEvents", value.asInstanceOf[js.Any])
    @scala.inline
    def setInstallGlobalPlugins(value: js.Any): Self = this.set("installGlobalPlugins", value.asInstanceOf[js.Any])
    @scala.inline
    def setInstallScenePlugins(value: js.Any): Self = this.set("installScenePlugins", value.asInstanceOf[js.Any])
    @scala.inline
    def setLoaderAsync(value: Boolean): Self = this.set("loaderAsync", value.asInstanceOf[js.Any])
    @scala.inline
    def setLoaderBaseURL(value: String): Self = this.set("loaderBaseURL", value.asInstanceOf[js.Any])
    @scala.inline
    def setLoaderMaxParallelDownloads(value: integer): Self = this.set("loaderMaxParallelDownloads", value.asInstanceOf[js.Any])
    @scala.inline
    def setLoaderPassword(value: String): Self = this.set("loaderPassword", value.asInstanceOf[js.Any])
    @scala.inline
    def setLoaderPath(value: String): Self = this.set("loaderPath", value.asInstanceOf[js.Any])
    @scala.inline
    def setLoaderResponseType(value: String): Self = this.set("loaderResponseType", value.asInstanceOf[js.Any])
    @scala.inline
    def setLoaderTimeout(value: integer): Self = this.set("loaderTimeout", value.asInstanceOf[js.Any])
    @scala.inline
    def setLoaderUser(value: String): Self = this.set("loaderUser", value.asInstanceOf[js.Any])
    @scala.inline
    def setLoaderWithCredentials(value: Boolean): Self = this.set("loaderWithCredentials", value.asInstanceOf[js.Any])
    @scala.inline
    def setMaxHeight(value: integer): Self = this.set("maxHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def setMaxLights(value: integer): Self = this.set("maxLights", value.asInstanceOf[js.Any])
    @scala.inline
    def setMaxWidth(value: integer): Self = this.set("maxWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def setMinHeight(value: integer): Self = this.set("minHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def setMinWidth(value: integer): Self = this.set("minWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def setMipmapFilter(value: String): Self = this.set("mipmapFilter", value.asInstanceOf[js.Any])
    @scala.inline
    def setMissingImage(value: String): Self = this.set("missingImage", value.asInstanceOf[js.Any])
    @scala.inline
    def setParent(value: js.Any): Self = this.set("parent", value.asInstanceOf[js.Any])
    @scala.inline
    def setPhysics(value: PhysicsConfig): Self = this.set("physics", value.asInstanceOf[js.Any])
    @scala.inline
    def setPixelArt(value: Boolean): Self = this.set("pixelArt", value.asInstanceOf[js.Any])
    @scala.inline
    def setPostBoot(value: Game => Unit): Self = this.set("postBoot", js.Any.fromFunction1(value))
    @scala.inline
    def setPowerPreference(value: String): Self = this.set("powerPreference", value.asInstanceOf[js.Any])
    @scala.inline
    def setPreBoot(value: Game => Unit): Self = this.set("preBoot", js.Any.fromFunction1(value))
    @scala.inline
    def setPremultipliedAlpha(value: Boolean): Self = this.set("premultipliedAlpha", value.asInstanceOf[js.Any])
    @scala.inline
    def setRenderType(value: Double): Self = this.set("renderType", value.asInstanceOf[js.Any])
    @scala.inline
    def setResizeInterval(value: integer): Self = this.set("resizeInterval", value.asInstanceOf[js.Any])
    @scala.inline
    def setResolution(value: Double): Self = this.set("resolution", value.asInstanceOf[js.Any])
    @scala.inline
    def setRoundPixels(value: Boolean): Self = this.set("roundPixels", value.asInstanceOf[js.Any])
    @scala.inline
    def setScaleMode(value: ScaleModeType): Self = this.set("scaleMode", value.asInstanceOf[js.Any])
    @scala.inline
    def setSceneConfig(value: js.Object): Self = this.set("sceneConfig", value.asInstanceOf[js.Any])
    @scala.inline
    def setSeedVarargs(value: String*): Self = this.set("seed", js.Array(value :_*))
    @scala.inline
    def setSeed(value: js.Array[String]): Self = this.set("seed", value.asInstanceOf[js.Any])
    @scala.inline
    def setTransparent(value: Boolean): Self = this.set("transparent", value.asInstanceOf[js.Any])
    @scala.inline
    def setWidth(value: integer | String): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def setZoom(value: ZoomType | integer): Self = this.set("zoom", value.asInstanceOf[js.Any])
    @scala.inline
    def setLoaderCrossOrigin(value: String): Self = this.set("loaderCrossOrigin", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLoaderCrossOrigin: Self = this.set("loaderCrossOrigin", js.undefined)
  }
  
}

