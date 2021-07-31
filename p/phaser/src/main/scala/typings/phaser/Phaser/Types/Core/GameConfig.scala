package typings.phaser.Phaser.Types.Core

import typings.phaser.Phaser.Scene
import typings.phaser.Phaser.Types.Scenes.CreateSceneFromObjectConfig
import typings.phaser.Phaser.Types.Scenes.SettingsConfig
import typings.phaser.integer
import typings.std.CanvasRenderingContext2D
import typings.std.HTMLCanvasElement
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GameConfig extends StObject {
  
  /**
    * The Audio Configuration object.
    */
  var audio: js.UndefOr[AudioConfig] = js.undefined
  
  /**
    * Automatically call window.focus() when the game boots. Usually necessary to capture input events if the game is in a separate frame.
    */
  var autoFocus: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The background color of the game canvas. The default is black.
    */
  var backgroundColor: js.UndefOr[String | Double] = js.undefined
  
  /**
    * Configuration for the banner printed in the browser console when the game starts.
    */
  var banner: js.UndefOr[Boolean | BannerConfig] = js.undefined
  
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
    * Provide your own Canvas Context for Phaser to use, instead of creating one.
    */
  var context: js.UndefOr[CanvasRenderingContext2D] = js.undefined
  
  /**
    * Is Phaser running under a custom (non-native web) environment? If so, set this to `true` to skip internal Feature detection. If `true` the `renderType` cannot be left as `AUTO`.
    */
  var customEnvironment: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Disable the browser's default 'contextmenu' event (usually triggered by a right-button mouse click).
    */
  var disableContextMenu: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The DOM Container configuration object.
    */
  var dom: js.UndefOr[DOMContainerConfig] = js.undefined
  
  /**
    * Game loop configuration.
    */
  var fps: js.UndefOr[FPSConfig] = js.undefined
  
  /**
    * The height of the game, in game pixels.
    */
  var height: js.UndefOr[integer | String] = js.undefined
  
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
    * The DOM element that will contain the game canvas, or its `id`. If undefined, or if the named element doesn't exist, the game canvas is appended to the document body. If `null` no parent will be used and you are responsible for adding the canvas to the dom.
    */
  var parent: js.UndefOr[HTMLElement | String] = js.undefined
  
  /**
    * Physics configuration.
    */
  var physics: js.UndefOr[PhysicsConfig] = js.undefined
  
  /**
    * Plugins to install.
    */
  var plugins: js.UndefOr[PluginObject | js.Array[PluginObjectItem]] = js.undefined
  
  /**
    * Game renderer configuration.
    */
  var render: js.UndefOr[RenderConfig] = js.undefined
  
  /**
    * The size of each game pixel, in canvas pixels. Values larger than 1 are "high" resolution.
    */
  var resolution: js.UndefOr[Double] = js.undefined
  
  /**
    * The Scale Manager configuration.
    */
  var scale: js.UndefOr[ScaleConfig] = js.undefined
  
  /**
    * A scene or scenes to add to the game. If several are given, the first is started; the remainder are started only if they have `{ active: true }`. See the `sceneConfig` argument in `Phaser.Scenes.SceneManager#add`.
    */
  var scene: js.UndefOr[
    Scene | (js.Array[CreateSceneFromObjectConfig | js.Function | Scene | SettingsConfig]) | SettingsConfig | CreateSceneFromObjectConfig | js.Function
  ] = js.undefined
  
  /**
    * Seed for the random number generator.
    */
  var seed: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * The title of the game. Shown in the browser console.
    */
  var title: js.UndefOr[String] = js.undefined
  
  /**
    * Whether the game canvas will have a transparent background.
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
  var width: js.UndefOr[integer | String] = js.undefined
  
  /**
    * Simple scale applied to the game canvas. 2 is double size, 0.5 is half size, etc.
    */
  var zoom: js.UndefOr[Double] = js.undefined
}
object GameConfig {
  
  @scala.inline
  def apply(): GameConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GameConfig]
  }
  
  @scala.inline
  implicit class GameConfigMutableBuilder[Self <: GameConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAudio(value: AudioConfig): Self = StObject.set(x, "audio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAudioUndefined: Self = StObject.set(x, "audio", js.undefined)
    
    @scala.inline
    def setAutoFocus(value: Boolean): Self = StObject.set(x, "autoFocus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoFocusUndefined: Self = StObject.set(x, "autoFocus", js.undefined)
    
    @scala.inline
    def setBackgroundColor(value: String | Double): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
    
    @scala.inline
    def setBanner(value: Boolean | BannerConfig): Self = StObject.set(x, "banner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBannerUndefined: Self = StObject.set(x, "banner", js.undefined)
    
    @scala.inline
    def setCallbacks(value: CallbacksConfig): Self = StObject.set(x, "callbacks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCallbacksUndefined: Self = StObject.set(x, "callbacks", js.undefined)
    
    @scala.inline
    def setCanvas(value: HTMLCanvasElement): Self = StObject.set(x, "canvas", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCanvasStyle(value: String): Self = StObject.set(x, "canvasStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCanvasStyleUndefined: Self = StObject.set(x, "canvasStyle", js.undefined)
    
    @scala.inline
    def setCanvasUndefined: Self = StObject.set(x, "canvas", js.undefined)
    
    @scala.inline
    def setContext(value: CanvasRenderingContext2D): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
    
    @scala.inline
    def setCustomEnvironment(value: Boolean): Self = StObject.set(x, "customEnvironment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomEnvironmentUndefined: Self = StObject.set(x, "customEnvironment", js.undefined)
    
    @scala.inline
    def setDisableContextMenu(value: Boolean): Self = StObject.set(x, "disableContextMenu", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisableContextMenuUndefined: Self = StObject.set(x, "disableContextMenu", js.undefined)
    
    @scala.inline
    def setDom(value: DOMContainerConfig): Self = StObject.set(x, "dom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomUndefined: Self = StObject.set(x, "dom", js.undefined)
    
    @scala.inline
    def setFps(value: FPSConfig): Self = StObject.set(x, "fps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFpsUndefined: Self = StObject.set(x, "fps", js.undefined)
    
    @scala.inline
    def setHeight(value: integer | String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    @scala.inline
    def setImages(value: ImagesConfig): Self = StObject.set(x, "images", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImagesUndefined: Self = StObject.set(x, "images", js.undefined)
    
    @scala.inline
    def setInput(value: Boolean | InputConfig): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputUndefined: Self = StObject.set(x, "input", js.undefined)
    
    @scala.inline
    def setLoader(value: LoaderConfig): Self = StObject.set(x, "loader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoaderUndefined: Self = StObject.set(x, "loader", js.undefined)
    
    @scala.inline
    def setParent(value: HTMLElement | String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    @scala.inline
    def setPhysics(value: PhysicsConfig): Self = StObject.set(x, "physics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPhysicsUndefined: Self = StObject.set(x, "physics", js.undefined)
    
    @scala.inline
    def setPlugins(value: PluginObject | js.Array[PluginObjectItem]): Self = StObject.set(x, "plugins", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPluginsUndefined: Self = StObject.set(x, "plugins", js.undefined)
    
    @scala.inline
    def setPluginsVarargs(value: PluginObjectItem*): Self = StObject.set(x, "plugins", js.Array(value :_*))
    
    @scala.inline
    def setRender(value: RenderConfig): Self = StObject.set(x, "render", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRenderUndefined: Self = StObject.set(x, "render", js.undefined)
    
    @scala.inline
    def setResolution(value: Double): Self = StObject.set(x, "resolution", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResolutionUndefined: Self = StObject.set(x, "resolution", js.undefined)
    
    @scala.inline
    def setScale(value: ScaleConfig): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScaleUndefined: Self = StObject.set(x, "scale", js.undefined)
    
    @scala.inline
    def setScene(
      value: Scene | (js.Array[CreateSceneFromObjectConfig | js.Function | Scene | SettingsConfig]) | SettingsConfig | CreateSceneFromObjectConfig | js.Function
    ): Self = StObject.set(x, "scene", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSceneUndefined: Self = StObject.set(x, "scene", js.undefined)
    
    @scala.inline
    def setSceneVarargs(value: (CreateSceneFromObjectConfig | js.Function | Scene | SettingsConfig)*): Self = StObject.set(x, "scene", js.Array(value :_*))
    
    @scala.inline
    def setSeed(value: js.Array[String]): Self = StObject.set(x, "seed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSeedUndefined: Self = StObject.set(x, "seed", js.undefined)
    
    @scala.inline
    def setSeedVarargs(value: String*): Self = StObject.set(x, "seed", js.Array(value :_*))
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    @scala.inline
    def setTransparent(value: Boolean): Self = StObject.set(x, "transparent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransparentUndefined: Self = StObject.set(x, "transparent", js.undefined)
    
    @scala.inline
    def setType(value: Double): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    
    @scala.inline
    def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    
    @scala.inline
    def setWidth(value: integer | String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    
    @scala.inline
    def setZoom(value: Double): Self = StObject.set(x, "zoom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZoomUndefined: Self = StObject.set(x, "zoom", js.undefined)
  }
}
