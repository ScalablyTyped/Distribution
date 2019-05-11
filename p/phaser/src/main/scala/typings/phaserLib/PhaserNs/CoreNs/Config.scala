package typings
package phaserLib.PhaserNs.CoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The active game configuration settings, parsed from a {@link Phaser.Types.Core.GameConfig} object.
  */
@JSGlobal("Phaser.Core.Config")
@js.native
/**
  * 
  * @param GameConfig The configuration object for your Phaser Game instance.
  */
class Config () extends js.Object {
  def this(GameConfig: phaserLib.PhaserNs.TypesNs.CoreNs.GameConfig) = this()
  /**
    * When set to `true`, WebGL uses linear interpolation to draw scaled or rotated textures, giving a smooth appearance. When set to `false`, WebGL uses nearest-neighbor interpolation, giving a crisper appearance. `false` also disables antialiasing of the game canvas itself, if the browser supports it, when the game canvas is scaled.
    */
  val antialias: scala.Boolean = js.native
  /**
    * The Audio Configuration object.
    */
  val audio: phaserLib.PhaserNs.TypesNs.CoreNs.AudioConfig = js.native
  /**
    * Automatically center the canvas within the parent?
    */
  val autoCenter: phaserLib.PhaserNs.ScaleNs.CenterType = js.native
  /**
    * If `true` the window will automatically be given focus immediately and on any future mousedown event.
    */
  val autoFocus: scala.Boolean = js.native
  /**
    * Automatically round the display and style sizes of the canvas. This can help with performance in lower-powered devices.
    */
  val autoRound: phaserLib.integer = js.native
  /**
    * The background color of the game canvas. The default is black. This value is ignored if `transparent` is set to `true`.
    */
  val backgroundColor: phaserLib.PhaserNs.DisplayNs.Color = js.native
  /**
    * The background colors of the banner.
    */
  val bannerBackgroundColor: js.Array[java.lang.String] = js.native
  /**
    * The color of the banner text.
    */
  val bannerTextColor: java.lang.String = js.native
  /**
    * The default WebGL Batch size.
    */
  val batchSize: phaserLib.integer = js.native
  /**
    * Force Phaser to use your own Canvas element instead of creating one.
    */
  val canvas: stdLib.HTMLCanvasElement = js.native
  /**
    * Optional CSS attributes to be set on the canvas object created by the renderer.
    */
  val canvasStyle: java.lang.String = js.native
  /**
    * Whether the game canvas will be cleared between each rendering frame. You can disable this if you have a full-screen background image or game object.
    */
  val clearBeforeRender: scala.Boolean = js.native
  /**
    * Force Phaser to use your own Canvas context instead of creating one.
    */
  val context: stdLib.CanvasRenderingContext2D | stdLib.WebGLRenderingContext = js.native
  /**
    * Is Phaser running under a custom (non-native web) environment? If so, set this to `true` to skip internal Feature detection. If `true` the `renderType` cannot be left as `AUTO`.
    */
  val customEnvironment: scala.Boolean = js.native
  /**
    * A base64 encoded PNG that will be used as the default blank texture.
    */
  val defaultImage: java.lang.String = js.native
  /**
    * The default physics system. It will be started for each scene. Either 'arcade', 'impact' or 'matter'.
    */
  val defaultPhysicsSystem: scala.Boolean | java.lang.String = js.native
  /**
    * The plugins installed into every Scene (in addition to CoreScene and Global).
    */
  val defaultPlugins: js.Any = js.native
  /**
    * Set to `true` to disable the right-click context menu.
    */
  val disableContextMenu: scala.Boolean = js.native
  /**
    * Should the DOM Container that is created (if `dom.createContainer` is true) be positioned behind (true) or over the top (false, the default) of the game canvas?
    */
  val domBehindCanvas: scala.Boolean = js.native
  /**
    * Should the game create a div element to act as a DOM Container? Only enable if you're using DOM Element objects. You must provide a parent object if you use this feature.
    */
  val domCreateContainer: scala.Boolean = js.native
  /**
    * Is the Scale Manager allowed to adjust the CSS height property of the parent to be 100%?
    */
  val expandParent: scala.Boolean = js.native
  /**
    * Let the browser abort creating a WebGL context if it judges performance would be unacceptable.
    */
  val failIfMajorPerformanceCaveat: scala.Boolean = js.native
  /**
    * The Frame Rate Configuration object, as parsed by the Timestep class.
    */
  val fps: phaserLib.PhaserNs.TypesNs.CoreNs.FPSConfig = js.native
  /**
    * The DOM element that will be sent into full screen mode, or its `id`. If undefined Phaser will create its own div and insert the canvas into it when entering fullscreen mode.
    */
  val fullscreenTarget: stdLib.HTMLElement | java.lang.String = js.native
  /**
    * The title of the game.
    */
  val gameTitle: java.lang.String = js.native
  /**
    * The URL of the game.
    */
  val gameURL: java.lang.String = js.native
  /**
    * The version of the game.
    */
  val gameVersion: java.lang.String = js.native
  /**
    * The height of the underlying canvas, in pixels.
    */
  val height: phaserLib.integer | java.lang.String = js.native
  /**
    * Don't write the banner line to the console.log.
    */
  val hideBanner: scala.Boolean = js.native
  /**
    * Omit Phaser's name and version from the banner.
    */
  val hidePhaser: scala.Boolean = js.native
  /**
    * The number of Pointer objects created by default. In a mouse-only, or non-multi touch game, you can leave this as 1.
    */
  val inputActivePointers: phaserLib.integer = js.native
  /**
    * Enable the Gamepad Plugin. This can be disabled in games that don't need gamepad input.
    */
  val inputGamepad: scala.Boolean = js.native
  /**
    * The DOM Target to listen for gamepad events on. Defaults to `window` if not specified.
    */
  val inputGamepadEventTarget: js.Any = js.native
  /**
    * Enable the Keyboard Plugin. This can be disabled in games that don't need keyboard input.
    */
  val inputKeyboard: scala.Boolean = js.native
  /**
    * `preventDefault` will be called on every non-modified key which has a key code in this array. By default, it is empty.
    */
  val inputKeyboardCapture: js.Array[phaserLib.integer] = js.native
  /**
    * The DOM Target to listen for keyboard events on. Defaults to `window` if not specified.
    */
  val inputKeyboardEventTarget: js.Any = js.native
  /**
    * Enable the Mouse Plugin. This can be disabled in games that don't need mouse input.
    */
  val inputMouse: scala.Boolean | js.Object = js.native
  /**
    * Should mouse events be captured? I.e. have prevent default called on them.
    */
  val inputMouseCapture: scala.Boolean = js.native
  /**
    * The DOM Target to listen for mouse events on. Defaults to the game canvas if not specified.
    */
  val inputMouseEventTarget: js.Any = js.native
  /**
    * Should Phaser use a queued input system for native DOM Events or not?
    */
  val inputQueue: scala.Boolean = js.native
  /**
    * The smoothing factor to apply during Pointer movement. See {@link Phaser.Input.Pointer#smoothFactor}.
    */
  val inputSmoothFactor: phaserLib.integer = js.native
  /**
    * Enable the Touch Plugin. This can be disabled in games that don't need touch input.
    */
  val inputTouch: scala.Boolean = js.native
  /**
    * Should touch events be captured? I.e. have prevent default called on them.
    */
  val inputTouchCapture: scala.Boolean = js.native
  /**
    * The DOM Target to listen for touch events on. Defaults to the game canvas if not specified.
    */
  val inputTouchEventTarget: js.Any = js.native
  /**
    * Should Phaser listen for input events on the Window? If you disable this, events like 'POINTER_UP_OUTSIDE' will no longer fire.
    */
  val inputWindowEvents: scala.Boolean = js.native
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
  val loaderAsync: scala.Boolean = js.native
  /**
    * A URL used to resolve paths given to the loader. Example: 'http://labs.phaser.io/assets/'.
    */
  val loaderBaseURL: java.lang.String = js.native
  /**
    * 'anonymous', 'use-credentials', or `undefined`. If you're not making cross-origin requests, leave this as `undefined`. See {@link https://developer.mozilla.org/en-US/docs/Web/HTML/CORS_settings_attributes}.
    */
  val loaderCrossOrigin: js.UndefOr[java.lang.String] = js.native
  /**
    * Maximum parallel downloads allowed for resources (Default to 32).
    */
  val loaderMaxParallelDownloads: phaserLib.integer = js.native
  /**
    * Optional password for all XHR requests.
    */
  val loaderPassword: java.lang.String = js.native
  /**
    * A URL path used to resolve relative paths given to the loader. Example: 'images/sprites/'.
    */
  val loaderPath: java.lang.String = js.native
  /**
    * The response type of the XHR request, e.g. `blob`, `text`, etc.
    */
  val loaderResponseType: java.lang.String = js.native
  /**
    * Optional XHR timeout value, in ms.
    */
  val loaderTimeout: phaserLib.integer = js.native
  /**
    * Optional username for all XHR requests.
    */
  val loaderUser: java.lang.String = js.native
  /**
    * The maximum height, in pixels, the canvas will scale up to. A value of zero means no maximum.
    */
  val maxHeight: phaserLib.integer = js.native
  /**
    * The maximum number of lights allowed to be visible within range of a single Camera in the LightManager.
    */
  val maxLights: phaserLib.integer = js.native
  /**
    * The maximum width, in pixels, the canvas will scale up to. A value of zero means no maximum.
    */
  val maxWidth: phaserLib.integer = js.native
  /**
    * The minimum height, in pixels, the canvas will scale down to. A value of zero means no minimum.
    */
  val minHeight: phaserLib.integer = js.native
  /**
    * The minimum width, in pixels, the canvas will scale down to. A value of zero means no minimum.
    */
  val minWidth: phaserLib.integer = js.native
  /**
    * A base64 encoded PNG that will be used as the default texture when a texture is assigned that is missing or not loaded.
    */
  val missingImage: java.lang.String = js.native
  /**
    * A parent DOM element into which the canvas created by the renderer will be injected.
    */
  val parent: js.Any = js.native
  /**
    * The Physics Configuration object.
    */
  val physics: phaserLib.PhaserNs.TypesNs.CoreNs.PhysicsConfig = js.native
  /**
    * Prevent pixel art from becoming blurred when scaled. It will remain crisp (tells the WebGL renderer to automatically create textures using a linear filter mode).
    */
  val pixelArt: scala.Boolean = js.native
  /**
    * "high-performance", "low-power" or "default". A hint to the browser on how much device power the game might use.
    */
  val powerPreference: java.lang.String = js.native
  /**
    * In WebGL mode, sets the drawing buffer to contain colors with pre-multiplied alpha.
    */
  val premultipliedAlpha: scala.Boolean = js.native
  /**
    * Force Phaser to use a specific renderer. Can be `CONST.CANVAS`, `CONST.WEBGL`, `CONST.HEADLESS` or `CONST.AUTO` (default)
    */
  val renderType: scala.Double = js.native
  /**
    * How many ms should elapse before checking if the browser size has changed?
    */
  val resizeInterval: phaserLib.integer = js.native
  /**
    * The canvas device pixel resolution. Currently un-used.
    */
  val resolution: scala.Double = js.native
  /**
    * Draw texture-based Game Objects at only whole-integer positions. Game Objects without textures, like Graphics, ignore this property.
    */
  val roundPixels: scala.Boolean = js.native
  /**
    * The scale mode as used by the Scale Manager. The default is zero, which is no scaling.
    */
  val scaleMode: phaserLib.PhaserNs.ScaleNs.ScaleModeType = js.native
  /**
    * The default Scene configuration object.
    */
  val sceneConfig: js.Object = js.native
  /**
    * A seed which the Random Data Generator will use. If not given, a dynamic seed based on the time is used.
    */
  val seed: js.Array[java.lang.String] = js.native
  /**
    * Whether the game canvas will have a transparent background.
    */
  val transparent: scala.Boolean = js.native
  /**
    * The width of the underlying canvas, in pixels.
    */
  val width: phaserLib.integer | java.lang.String = js.native
  /**
    * The zoom factor, as used by the Scale Manager.
    */
  val zoom: phaserLib.PhaserNs.ScaleNs.ZoomType | phaserLib.integer = js.native
  /**
    * A function to run at the end of the boot sequence. At this point, all the game systems have started and plugins have been loaded.
    */
  def postBoot(game: phaserLib.PhaserNs.Game): scala.Unit = js.native
  /**
    * Called before Phaser boots. Useful for initializing anything not related to Phaser that Phaser may require while booting.
    */
  def preBoot(game: phaserLib.PhaserNs.Game): scala.Unit = js.native
}

