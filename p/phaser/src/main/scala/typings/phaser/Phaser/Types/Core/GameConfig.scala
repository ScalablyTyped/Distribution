package typings.phaser.Phaser.Types.Core

import typings.phaser.Phaser.Scene
import typings.phaser.Phaser.Types.Scenes.CreateSceneFromObjectConfig
import typings.phaser.Phaser.Types.Scenes.SettingsConfig
import typings.phaser.integer
import typings.std.CanvasRenderingContext2D
import typings.std.HTMLCanvasElement
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GameConfig extends js.Object {
  
  /**
    * The Audio Configuration object.
    */
  var audio: js.UndefOr[AudioConfig] = js.native
  
  /**
    * Automatically call window.focus() when the game boots. Usually necessary to capture input events if the game is in a separate frame.
    */
  var autoFocus: js.UndefOr[Boolean] = js.native
  
  /**
    * The background color of the game canvas. The default is black.
    */
  var backgroundColor: js.UndefOr[String | Double] = js.native
  
  /**
    * Configuration for the banner printed in the browser console when the game starts.
    */
  var banner: js.UndefOr[Boolean | BannerConfig] = js.native
  
  /**
    * Optional callbacks to run before or after game boot.
    */
  var callbacks: js.UndefOr[CallbacksConfig] = js.native
  
  /**
    * Provide your own Canvas element for Phaser to use instead of creating one.
    */
  var canvas: js.UndefOr[HTMLCanvasElement] = js.native
  
  /**
    * CSS styles to apply to the game canvas instead of Phasers default styles.
    */
  var canvasStyle: js.UndefOr[String] = js.native
  
  /**
    * Provide your own Canvas Context for Phaser to use, instead of creating one.
    */
  var context: js.UndefOr[CanvasRenderingContext2D] = js.native
  
  /**
    * Is Phaser running under a custom (non-native web) environment? If so, set this to `true` to skip internal Feature detection. If `true` the `renderType` cannot be left as `AUTO`.
    */
  var customEnvironment: js.UndefOr[Boolean] = js.native
  
  /**
    * Disable the browser's default 'contextmenu' event (usually triggered by a right-button mouse click).
    */
  var disableContextMenu: js.UndefOr[Boolean] = js.native
  
  /**
    * The DOM Container configuration object.
    */
  var dom: js.UndefOr[DOMContainerConfig] = js.native
  
  /**
    * Game loop configuration.
    */
  var fps: js.UndefOr[FPSConfig] = js.native
  
  /**
    * The height of the game, in game pixels.
    */
  var height: js.UndefOr[integer | String] = js.native
  
  /**
    * Images configuration.
    */
  var images: js.UndefOr[ImagesConfig] = js.native
  
  /**
    * Input configuration, or `false` to disable all game input.
    */
  var input: js.UndefOr[Boolean | InputConfig] = js.native
  
  /**
    * Loader configuration.
    */
  var loader: js.UndefOr[LoaderConfig] = js.native
  
  /**
    * The DOM element that will contain the game canvas, or its `id`. If undefined, or if the named element doesn't exist, the game canvas is appended to the document body. If `null` no parent will be used and you are responsible for adding the canvas to the dom.
    */
  var parent: js.UndefOr[HTMLElement | String] = js.native
  
  /**
    * Physics configuration.
    */
  var physics: js.UndefOr[PhysicsConfig] = js.native
  
  /**
    * Plugins to install.
    */
  var plugins: js.UndefOr[PluginObject | js.Array[PluginObjectItem]] = js.native
  
  /**
    * Game renderer configuration.
    */
  var render: js.UndefOr[RenderConfig] = js.native
  
  /**
    * The size of each game pixel, in canvas pixels. Values larger than 1 are "high" resolution.
    */
  var resolution: js.UndefOr[Double] = js.native
  
  /**
    * The Scale Manager configuration.
    */
  var scale: js.UndefOr[ScaleConfig] = js.native
  
  /**
    * A scene or scenes to add to the game. If several are given, the first is started; the remainder are started only if they have `{ active: true }`. See the `sceneConfig` argument in `Phaser.Scenes.SceneManager#add`.
    */
  var scene: js.UndefOr[
    Scene | (js.Array[CreateSceneFromObjectConfig | js.Function | Scene | SettingsConfig]) | SettingsConfig | CreateSceneFromObjectConfig | js.Function
  ] = js.native
  
  /**
    * Seed for the random number generator.
    */
  var seed: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * The title of the game. Shown in the browser console.
    */
  var title: js.UndefOr[String] = js.native
  
  /**
    * Whether the game canvas will have a transparent background.
    */
  var transparent: js.UndefOr[Boolean] = js.native
  
  /**
    * Which renderer to use. Phaser.AUTO, Phaser.CANVAS, Phaser.HEADLESS, or Phaser.WEBGL. AUTO picks WEBGL if available, otherwise CANVAS.
    */
  var `type`: js.UndefOr[Double] = js.native
  
  /**
    * The URL of the game. Shown in the browser console.
    */
  var url: js.UndefOr[String] = js.native
  
  /**
    * The version of the game. Shown in the browser console.
    */
  var version: js.UndefOr[String] = js.native
  
  /**
    * The width of the game, in game pixels.
    */
  var width: js.UndefOr[integer | String] = js.native
  
  /**
    * Simple scale applied to the game canvas. 2 is double size, 0.5 is half size, etc.
    */
  var zoom: js.UndefOr[Double] = js.native
}
object GameConfig {
  
  @scala.inline
  def apply(): GameConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GameConfig]
  }
  
  @scala.inline
  implicit class GameConfigOps[Self <: GameConfig] (val x: Self) extends AnyVal {
    
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
    def setAudio(value: AudioConfig): Self = this.set("audio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAudio: Self = this.set("audio", js.undefined)
    
    @scala.inline
    def setAutoFocus(value: Boolean): Self = this.set("autoFocus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoFocus: Self = this.set("autoFocus", js.undefined)
    
    @scala.inline
    def setBackgroundColor(value: String | Double): Self = this.set("backgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackgroundColor: Self = this.set("backgroundColor", js.undefined)
    
    @scala.inline
    def setBanner(value: Boolean | BannerConfig): Self = this.set("banner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBanner: Self = this.set("banner", js.undefined)
    
    @scala.inline
    def setCallbacks(value: CallbacksConfig): Self = this.set("callbacks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCallbacks: Self = this.set("callbacks", js.undefined)
    
    @scala.inline
    def setCanvas(value: HTMLCanvasElement): Self = this.set("canvas", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCanvas: Self = this.set("canvas", js.undefined)
    
    @scala.inline
    def setCanvasStyle(value: String): Self = this.set("canvasStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCanvasStyle: Self = this.set("canvasStyle", js.undefined)
    
    @scala.inline
    def setContext(value: CanvasRenderingContext2D): Self = this.set("context", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContext: Self = this.set("context", js.undefined)
    
    @scala.inline
    def setCustomEnvironment(value: Boolean): Self = this.set("customEnvironment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomEnvironment: Self = this.set("customEnvironment", js.undefined)
    
    @scala.inline
    def setDisableContextMenu(value: Boolean): Self = this.set("disableContextMenu", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisableContextMenu: Self = this.set("disableContextMenu", js.undefined)
    
    @scala.inline
    def setDom(value: DOMContainerConfig): Self = this.set("dom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDom: Self = this.set("dom", js.undefined)
    
    @scala.inline
    def setFps(value: FPSConfig): Self = this.set("fps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFps: Self = this.set("fps", js.undefined)
    
    @scala.inline
    def setHeight(value: integer | String): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    
    @scala.inline
    def setImages(value: ImagesConfig): Self = this.set("images", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImages: Self = this.set("images", js.undefined)
    
    @scala.inline
    def setInput(value: Boolean | InputConfig): Self = this.set("input", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInput: Self = this.set("input", js.undefined)
    
    @scala.inline
    def setLoader(value: LoaderConfig): Self = this.set("loader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLoader: Self = this.set("loader", js.undefined)
    
    @scala.inline
    def setParent(value: HTMLElement | String): Self = this.set("parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParent: Self = this.set("parent", js.undefined)
    
    @scala.inline
    def setPhysics(value: PhysicsConfig): Self = this.set("physics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePhysics: Self = this.set("physics", js.undefined)
    
    @scala.inline
    def setPluginsVarargs(value: PluginObjectItem*): Self = this.set("plugins", js.Array(value :_*))
    
    @scala.inline
    def setPlugins(value: PluginObject | js.Array[PluginObjectItem]): Self = this.set("plugins", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlugins: Self = this.set("plugins", js.undefined)
    
    @scala.inline
    def setRender(value: RenderConfig): Self = this.set("render", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRender: Self = this.set("render", js.undefined)
    
    @scala.inline
    def setResolution(value: Double): Self = this.set("resolution", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResolution: Self = this.set("resolution", js.undefined)
    
    @scala.inline
    def setScale(value: ScaleConfig): Self = this.set("scale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScale: Self = this.set("scale", js.undefined)
    
    @scala.inline
    def setSceneVarargs(value: (CreateSceneFromObjectConfig | js.Function | Scene | SettingsConfig)*): Self = this.set("scene", js.Array(value :_*))
    
    @scala.inline
    def setScene(
      value: Scene | (js.Array[CreateSceneFromObjectConfig | js.Function | Scene | SettingsConfig]) | SettingsConfig | CreateSceneFromObjectConfig | js.Function
    ): Self = this.set("scene", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScene: Self = this.set("scene", js.undefined)
    
    @scala.inline
    def setSeedVarargs(value: String*): Self = this.set("seed", js.Array(value :_*))
    
    @scala.inline
    def setSeed(value: js.Array[String]): Self = this.set("seed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSeed: Self = this.set("seed", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    
    @scala.inline
    def setTransparent(value: Boolean): Self = this.set("transparent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransparent: Self = this.set("transparent", js.undefined)
    
    @scala.inline
    def setType(value: Double): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
    
    @scala.inline
    def setVersion(value: String): Self = this.set("version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVersion: Self = this.set("version", js.undefined)
    
    @scala.inline
    def setWidth(value: integer | String): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
    
    @scala.inline
    def setZoom(value: Double): Self = this.set("zoom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteZoom: Self = this.set("zoom", js.undefined)
  }
}
