package typings.phaser.Phaser.Types.Core

import typings.phaser.Phaser.Scale.CenterType
import typings.phaser.Phaser.Scale.ScaleModeType
import typings.phaser.Phaser.Types.Scenes.SceneType
import typings.std.CanvasRenderingContext2D
import typings.std.HTMLCanvasElement
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GameConfig extends StObject {
  
  /**
    * When set to `true`, WebGL uses linear interpolation to draw scaled or rotated textures, giving a smooth appearance. When set to `false`, WebGL uses nearest-neighbor interpolation, giving a crisper appearance. `false` also disables antialiasing of the game canvas itself, if the browser supports it, when the game canvas is scaled.
    */
  var antialias: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Sets the `antialias` property when the WebGL context is created. Setting this value does not impact any subsequent textures that are created, or the canvas style attributes.
    */
  var antialiasGL: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The Audio Configuration object.
    */
  var audio: js.UndefOr[AudioConfig] = js.undefined
  
  /**
    * Automatically center the canvas within the parent?
    */
  var autoCenter: js.UndefOr[CenterType] = js.undefined
  
  /**
    * Automatically call window.focus() when the game boots. Usually necessary to capture input events if the game is in a separate frame.
    */
  var autoFocus: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Automatically enable the Mobile Pipeline if iOS or Android detected?
    */
  var autoMobilePipeline: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Automatically round the display and style sizes of the canvas. This can help with performance in lower-powered devices.
    */
  var autoRound: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The background color of the game canvas. The default is black.
    */
  var backgroundColor: js.UndefOr[String | Double] = js.undefined
  
  /**
    * Configuration for the banner printed in the browser console when the game starts.
    */
  var banner: js.UndefOr[Boolean | BannerConfig] = js.undefined
  
  /**
    * The default WebGL batch size. Represents the number of _quads_ that can be added to a single batch.
    */
  var batchSize: js.UndefOr[Double] = js.undefined
  
  /**
    * Optional callbacks to run before or after game boot.
    */
  var callbacks: js.UndefOr[CallbacksConfig] = js.undefined
  
  /**
    * Provide your own Canvas element for Phaser to use instead of creating one.
    */
  var canvas: js.UndefOr[HTMLCanvasElement] = js.undefined
  
  /**
    * CSS styles to apply to the game canvas instead of Phasers default styles.
    */
  var canvasStyle: js.UndefOr[String] = js.undefined
  
  /**
    * Whether the game canvas will be cleared between each rendering frame.
    */
  var clearBeforeRender: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Provide your own Canvas Context for Phaser to use, instead of creating one.
    */
  var context: js.UndefOr[CanvasRenderingContext2D] = js.undefined
  
  /**
    * Is Phaser running under a custom (non-native web) environment? If so, set this to `true` to skip internal Feature detection. If `true` the `renderType` cannot be left as `AUTO`.
    */
  var customEnvironment: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The WebGL Pipeline that Game Objects will use by default. Set to 'MultiPipeline' as standard.
    */
  var defaultPipeline: js.UndefOr[String] = js.undefined
  
  /**
    * When set to `true` it will create a desynchronized context for both 2D and WebGL. See https://developers.google.com/web/updates/2019/05/desynchronized for details.
    */
  var desynchronized: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Disable the browser's default 'contextmenu' event (usually triggered by a right-button mouse click).
    */
  var disableContextMenu: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The DOM Container configuration object.
    */
  var dom: js.UndefOr[DOMContainerConfig] = js.undefined
  
  /**
    * Is the Scale Manager allowed to adjust the CSS height property of the parent and/or document body to be 100%?
    */
  var expandParent: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Let the browser abort creating a WebGL context if it judges performance would be unacceptable.
    */
  var failIfMajorPerformanceCaveat: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Game loop configuration.
    */
  var fps: js.UndefOr[FPSConfig] = js.undefined
  
  /**
    * The DOM element that will be sent into full screen mode, or its `id`. If undefined Phaser will create its own div and insert the canvas into it when entering fullscreen mode.
    */
  var fullscreenTarget: js.UndefOr[HTMLElement | String | Null] = js.undefined
  
  /**
    * The height of the game, in game pixels.
    */
  var height: js.UndefOr[Double | String] = js.undefined
  
  /**
    * Images configuration.
    */
  var images: js.UndefOr[ImagesConfig] = js.undefined
  
  /**
    * Input configuration, or `false` to disable all game input.
    */
  var input: js.UndefOr[Boolean | InputConfig] = js.undefined
  
  /**
    * Loader configuration.
    */
  var loader: js.UndefOr[LoaderConfig] = js.undefined
  
  /**
    * The maximum width the canvas can be scaled up to.
    */
  var max: js.UndefOr[WidthHeight] = js.undefined
  
  /**
    * The maximum number of lights allowed to be visible within range of a single Camera in the LightManager.
    */
  var maxLights: js.UndefOr[Double] = js.undefined
  
  /**
    * When in WebGL mode, this sets the maximum number of GPU Textures to use. The default, -1, will use all available units. The WebGL1 spec says all browsers should provide a minimum of 8.
    */
  var maxTextures: js.UndefOr[Double] = js.undefined
  
  /**
    * The minimum width and height the canvas can be scaled down to.
    */
  var min: js.UndefOr[WidthHeight] = js.undefined
  
  /**
    * The mipmap magFilter to be used when creating WebGL textures.
    */
  var mipmapFilter: js.UndefOr[String] = js.undefined
  
  /**
    * The scale mode.
    */
  var mode: js.UndefOr[ScaleModeType] = js.undefined
  
  /**
    * The DOM element that will contain the game canvas, or its `id`. If undefined, or if the named element doesn't exist, the game canvas is appended to the document body. If `null` no parent will be used and you are responsible for adding the canvas to the dom.
    */
  var parent: js.UndefOr[HTMLElement | String] = js.undefined
  
  /**
    * Physics configuration.
    */
  var physics: js.UndefOr[PhysicsConfig] = js.undefined
  
  /**
    * A WebGL Pipeline configuration object. Can also be part of the `RenderConfig`.
    */
  var pipeline: js.UndefOr[PipelineConfig] = js.undefined
  
  /**
    * Sets `antialias` to false and `roundPixels` to true. This is the best setting for pixel-art games.
    */
  var pixelArt: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Plugins to install.
    */
  var plugins: js.UndefOr[PluginObject | js.Array[PluginObjectItem]] = js.undefined
  
  /**
    * "high-performance", "low-power" or "default". A hint to the browser on how much device power the game might use.
    */
  var powerPreference: js.UndefOr[String] = js.undefined
  
  /**
    * In WebGL mode, the drawing buffer contains colors with pre-multiplied alpha.
    */
  var premultipliedAlpha: js.UndefOr[Boolean] = js.undefined
  
  /**
    * If the value is true the WebGL buffers will not be cleared and will preserve their values until cleared or overwritten by the author.
    */
  var preserveDrawingBuffer: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Game renderer configuration.
    */
  var render: js.UndefOr[RenderConfig] = js.undefined
  
  /**
    * How many ms should elapse before checking if the browser size has changed?
    */
  var resizeInterval: js.UndefOr[Double] = js.undefined
  
  /**
    * Draw texture-based Game Objects at only whole-integer positions. Game Objects without textures, like Graphics, ignore this property.
    */
  var roundPixels: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The Scale Manager configuration.
    */
  var scale: js.UndefOr[ScaleConfig] = js.undefined
  
  /**
    * A scene or scenes to add to the game. If several are given, the first is started; the remainder are started only if they have `{ active: true }`. See the `sceneConfig` argument in `Phaser.Scenes.SceneManager#add`.
    */
  var scene: js.UndefOr[SceneType | js.Array[SceneType]] = js.undefined
  
  /**
    * Seed for the random number generator.
    */
  var seed: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * `true` or `1` = Use the built-in StableSort (needed for older browsers), `false` or `0` = Rely on ES2019 Array.sort being stable (modern browsers only), or `-1` = Try and determine this automatically based on browser inspection (not guaranteed to work, errs on side of caution).
    */
  var stableSort: js.UndefOr[Double | Boolean] = js.undefined
  
  /**
    * The title of the game. Shown in the browser console.
    */
  var title: js.UndefOr[String] = js.undefined
  
  /**
    * Whether the game canvas will be transparent. Boolean that indicates if the canvas contains an alpha channel. If set to false, the browser now knows that the backdrop is always opaque, which can speed up drawing of transparent content and images.
    */
  var transparent: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Which renderer to use. Phaser.AUTO, Phaser.CANVAS, Phaser.HEADLESS, or Phaser.WEBGL. AUTO picks WEBGL if available, otherwise CANVAS.
    */
  var `type`: js.UndefOr[Double] = js.undefined
  
  /**
    * The URL of the game. Shown in the browser console.
    */
  var url: js.UndefOr[String] = js.undefined
  
  /**
    * The version of the game. Shown in the browser console.
    */
  var version: js.UndefOr[String] = js.undefined
  
  /**
    * The width of the game, in game pixels.
    */
  var width: js.UndefOr[Double | String] = js.undefined
  
  /**
    * Simple scale applied to the game canvas. 2 is double size, 0.5 is half size, etc.
    */
  var zoom: js.UndefOr[Double] = js.undefined
}
object GameConfig {
  
  inline def apply(): GameConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GameConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GameConfig] (val x: Self) extends AnyVal {
    
    inline def setAntialias(value: Boolean): Self = StObject.set(x, "antialias", value.asInstanceOf[js.Any])
    
    inline def setAntialiasGL(value: Boolean): Self = StObject.set(x, "antialiasGL", value.asInstanceOf[js.Any])
    
    inline def setAntialiasGLUndefined: Self = StObject.set(x, "antialiasGL", js.undefined)
    
    inline def setAntialiasUndefined: Self = StObject.set(x, "antialias", js.undefined)
    
    inline def setAudio(value: AudioConfig): Self = StObject.set(x, "audio", value.asInstanceOf[js.Any])
    
    inline def setAudioUndefined: Self = StObject.set(x, "audio", js.undefined)
    
    inline def setAutoCenter(value: CenterType): Self = StObject.set(x, "autoCenter", value.asInstanceOf[js.Any])
    
    inline def setAutoCenterUndefined: Self = StObject.set(x, "autoCenter", js.undefined)
    
    inline def setAutoFocus(value: Boolean): Self = StObject.set(x, "autoFocus", value.asInstanceOf[js.Any])
    
    inline def setAutoFocusUndefined: Self = StObject.set(x, "autoFocus", js.undefined)
    
    inline def setAutoMobilePipeline(value: Boolean): Self = StObject.set(x, "autoMobilePipeline", value.asInstanceOf[js.Any])
    
    inline def setAutoMobilePipelineUndefined: Self = StObject.set(x, "autoMobilePipeline", js.undefined)
    
    inline def setAutoRound(value: Boolean): Self = StObject.set(x, "autoRound", value.asInstanceOf[js.Any])
    
    inline def setAutoRoundUndefined: Self = StObject.set(x, "autoRound", js.undefined)
    
    inline def setBackgroundColor(value: String | Double): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
    
    inline def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
    
    inline def setBanner(value: Boolean | BannerConfig): Self = StObject.set(x, "banner", value.asInstanceOf[js.Any])
    
    inline def setBannerUndefined: Self = StObject.set(x, "banner", js.undefined)
    
    inline def setBatchSize(value: Double): Self = StObject.set(x, "batchSize", value.asInstanceOf[js.Any])
    
    inline def setBatchSizeUndefined: Self = StObject.set(x, "batchSize", js.undefined)
    
    inline def setCallbacks(value: CallbacksConfig): Self = StObject.set(x, "callbacks", value.asInstanceOf[js.Any])
    
    inline def setCallbacksUndefined: Self = StObject.set(x, "callbacks", js.undefined)
    
    inline def setCanvas(value: HTMLCanvasElement): Self = StObject.set(x, "canvas", value.asInstanceOf[js.Any])
    
    inline def setCanvasStyle(value: String): Self = StObject.set(x, "canvasStyle", value.asInstanceOf[js.Any])
    
    inline def setCanvasStyleUndefined: Self = StObject.set(x, "canvasStyle", js.undefined)
    
    inline def setCanvasUndefined: Self = StObject.set(x, "canvas", js.undefined)
    
    inline def setClearBeforeRender(value: Boolean): Self = StObject.set(x, "clearBeforeRender", value.asInstanceOf[js.Any])
    
    inline def setClearBeforeRenderUndefined: Self = StObject.set(x, "clearBeforeRender", js.undefined)
    
    inline def setContext(value: CanvasRenderingContext2D): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    inline def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
    
    inline def setCustomEnvironment(value: Boolean): Self = StObject.set(x, "customEnvironment", value.asInstanceOf[js.Any])
    
    inline def setCustomEnvironmentUndefined: Self = StObject.set(x, "customEnvironment", js.undefined)
    
    inline def setDefaultPipeline(value: String): Self = StObject.set(x, "defaultPipeline", value.asInstanceOf[js.Any])
    
    inline def setDefaultPipelineUndefined: Self = StObject.set(x, "defaultPipeline", js.undefined)
    
    inline def setDesynchronized(value: Boolean): Self = StObject.set(x, "desynchronized", value.asInstanceOf[js.Any])
    
    inline def setDesynchronizedUndefined: Self = StObject.set(x, "desynchronized", js.undefined)
    
    inline def setDisableContextMenu(value: Boolean): Self = StObject.set(x, "disableContextMenu", value.asInstanceOf[js.Any])
    
    inline def setDisableContextMenuUndefined: Self = StObject.set(x, "disableContextMenu", js.undefined)
    
    inline def setDom(value: DOMContainerConfig): Self = StObject.set(x, "dom", value.asInstanceOf[js.Any])
    
    inline def setDomUndefined: Self = StObject.set(x, "dom", js.undefined)
    
    inline def setExpandParent(value: Boolean): Self = StObject.set(x, "expandParent", value.asInstanceOf[js.Any])
    
    inline def setExpandParentUndefined: Self = StObject.set(x, "expandParent", js.undefined)
    
    inline def setFailIfMajorPerformanceCaveat(value: Boolean): Self = StObject.set(x, "failIfMajorPerformanceCaveat", value.asInstanceOf[js.Any])
    
    inline def setFailIfMajorPerformanceCaveatUndefined: Self = StObject.set(x, "failIfMajorPerformanceCaveat", js.undefined)
    
    inline def setFps(value: FPSConfig): Self = StObject.set(x, "fps", value.asInstanceOf[js.Any])
    
    inline def setFpsUndefined: Self = StObject.set(x, "fps", js.undefined)
    
    inline def setFullscreenTarget(value: HTMLElement | String): Self = StObject.set(x, "fullscreenTarget", value.asInstanceOf[js.Any])
    
    inline def setFullscreenTargetNull: Self = StObject.set(x, "fullscreenTarget", null)
    
    inline def setFullscreenTargetUndefined: Self = StObject.set(x, "fullscreenTarget", js.undefined)
    
    inline def setHeight(value: Double | String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setImages(value: ImagesConfig): Self = StObject.set(x, "images", value.asInstanceOf[js.Any])
    
    inline def setImagesUndefined: Self = StObject.set(x, "images", js.undefined)
    
    inline def setInput(value: Boolean | InputConfig): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
    
    inline def setInputUndefined: Self = StObject.set(x, "input", js.undefined)
    
    inline def setLoader(value: LoaderConfig): Self = StObject.set(x, "loader", value.asInstanceOf[js.Any])
    
    inline def setLoaderUndefined: Self = StObject.set(x, "loader", js.undefined)
    
    inline def setMax(value: WidthHeight): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    inline def setMaxLights(value: Double): Self = StObject.set(x, "maxLights", value.asInstanceOf[js.Any])
    
    inline def setMaxLightsUndefined: Self = StObject.set(x, "maxLights", js.undefined)
    
    inline def setMaxTextures(value: Double): Self = StObject.set(x, "maxTextures", value.asInstanceOf[js.Any])
    
    inline def setMaxTexturesUndefined: Self = StObject.set(x, "maxTextures", js.undefined)
    
    inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
    
    inline def setMin(value: WidthHeight): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    inline def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
    
    inline def setMipmapFilter(value: String): Self = StObject.set(x, "mipmapFilter", value.asInstanceOf[js.Any])
    
    inline def setMipmapFilterUndefined: Self = StObject.set(x, "mipmapFilter", js.undefined)
    
    inline def setMode(value: ScaleModeType): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    
    inline def setParent(value: HTMLElement | String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    inline def setPhysics(value: PhysicsConfig): Self = StObject.set(x, "physics", value.asInstanceOf[js.Any])
    
    inline def setPhysicsUndefined: Self = StObject.set(x, "physics", js.undefined)
    
    inline def setPipeline(value: PipelineConfig): Self = StObject.set(x, "pipeline", value.asInstanceOf[js.Any])
    
    inline def setPipelineUndefined: Self = StObject.set(x, "pipeline", js.undefined)
    
    inline def setPixelArt(value: Boolean): Self = StObject.set(x, "pixelArt", value.asInstanceOf[js.Any])
    
    inline def setPixelArtUndefined: Self = StObject.set(x, "pixelArt", js.undefined)
    
    inline def setPlugins(value: PluginObject | js.Array[PluginObjectItem]): Self = StObject.set(x, "plugins", value.asInstanceOf[js.Any])
    
    inline def setPluginsUndefined: Self = StObject.set(x, "plugins", js.undefined)
    
    inline def setPluginsVarargs(value: PluginObjectItem*): Self = StObject.set(x, "plugins", js.Array(value*))
    
    inline def setPowerPreference(value: String): Self = StObject.set(x, "powerPreference", value.asInstanceOf[js.Any])
    
    inline def setPowerPreferenceUndefined: Self = StObject.set(x, "powerPreference", js.undefined)
    
    inline def setPremultipliedAlpha(value: Boolean): Self = StObject.set(x, "premultipliedAlpha", value.asInstanceOf[js.Any])
    
    inline def setPremultipliedAlphaUndefined: Self = StObject.set(x, "premultipliedAlpha", js.undefined)
    
    inline def setPreserveDrawingBuffer(value: Boolean): Self = StObject.set(x, "preserveDrawingBuffer", value.asInstanceOf[js.Any])
    
    inline def setPreserveDrawingBufferUndefined: Self = StObject.set(x, "preserveDrawingBuffer", js.undefined)
    
    inline def setRender(value: RenderConfig): Self = StObject.set(x, "render", value.asInstanceOf[js.Any])
    
    inline def setRenderUndefined: Self = StObject.set(x, "render", js.undefined)
    
    inline def setResizeInterval(value: Double): Self = StObject.set(x, "resizeInterval", value.asInstanceOf[js.Any])
    
    inline def setResizeIntervalUndefined: Self = StObject.set(x, "resizeInterval", js.undefined)
    
    inline def setRoundPixels(value: Boolean): Self = StObject.set(x, "roundPixels", value.asInstanceOf[js.Any])
    
    inline def setRoundPixelsUndefined: Self = StObject.set(x, "roundPixels", js.undefined)
    
    inline def setScale(value: ScaleConfig): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
    
    inline def setScaleUndefined: Self = StObject.set(x, "scale", js.undefined)
    
    inline def setScene(value: SceneType | js.Array[SceneType]): Self = StObject.set(x, "scene", value.asInstanceOf[js.Any])
    
    inline def setSceneUndefined: Self = StObject.set(x, "scene", js.undefined)
    
    inline def setSceneVarargs(value: SceneType*): Self = StObject.set(x, "scene", js.Array(value*))
    
    inline def setSeed(value: js.Array[String]): Self = StObject.set(x, "seed", value.asInstanceOf[js.Any])
    
    inline def setSeedUndefined: Self = StObject.set(x, "seed", js.undefined)
    
    inline def setSeedVarargs(value: String*): Self = StObject.set(x, "seed", js.Array(value*))
    
    inline def setStableSort(value: Double | Boolean): Self = StObject.set(x, "stableSort", value.asInstanceOf[js.Any])
    
    inline def setStableSortUndefined: Self = StObject.set(x, "stableSort", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setTransparent(value: Boolean): Self = StObject.set(x, "transparent", value.asInstanceOf[js.Any])
    
    inline def setTransparentUndefined: Self = StObject.set(x, "transparent", js.undefined)
    
    inline def setType(value: Double): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    
    inline def setWidth(value: Double | String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    
    inline def setZoom(value: Double): Self = StObject.set(x, "zoom", value.asInstanceOf[js.Any])
    
    inline def setZoomUndefined: Self = StObject.set(x, "zoom", js.undefined)
  }
}
