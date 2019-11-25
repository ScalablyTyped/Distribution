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
import scala.scalajs.js.annotation._

trait GameConfig extends js.Object {
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
    * The DOM element that will contain the game canvas, or its `id`. If undefined or if the named element doesn't exist, the game canvas is inserted directly into the document body. If `null` no parent will be used and you are responsible for adding the canvas to your environment.
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
  def apply(
    audio: AudioConfig = null,
    autoFocus: js.UndefOr[Boolean] = js.undefined,
    backgroundColor: String | Double = null,
    banner: Boolean | BannerConfig = null,
    callbacks: CallbacksConfig = null,
    canvas: HTMLCanvasElement = null,
    canvasStyle: String = null,
    context: CanvasRenderingContext2D = null,
    customEnvironment: js.UndefOr[Boolean] = js.undefined,
    disableContextMenu: js.UndefOr[Boolean] = js.undefined,
    dom: DOMContainerConfig = null,
    fps: FPSConfig = null,
    height: integer | String = null,
    images: ImagesConfig = null,
    input: Boolean | InputConfig = null,
    loader: LoaderConfig = null,
    parent: HTMLElement | String = null,
    physics: PhysicsConfig = null,
    plugins: PluginObject | js.Array[PluginObjectItem] = null,
    render: RenderConfig = null,
    resolution: Int | Double = null,
    scale: ScaleConfig = null,
    scene: Scene | (js.Array[CreateSceneFromObjectConfig | js.Function | Scene | SettingsConfig]) | SettingsConfig | CreateSceneFromObjectConfig | js.Function = null,
    seed: js.Array[String] = null,
    title: String = null,
    transparent: js.UndefOr[Boolean] = js.undefined,
    `type`: Int | Double = null,
    url: String = null,
    version: String = null,
    width: integer | String = null,
    zoom: Int | Double = null
  ): GameConfig = {
    val __obj = js.Dynamic.literal()
    if (audio != null) __obj.updateDynamic("audio")(audio.asInstanceOf[js.Any])
    if (!js.isUndefined(autoFocus)) __obj.updateDynamic("autoFocus")(autoFocus.asInstanceOf[js.Any])
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor.asInstanceOf[js.Any])
    if (banner != null) __obj.updateDynamic("banner")(banner.asInstanceOf[js.Any])
    if (callbacks != null) __obj.updateDynamic("callbacks")(callbacks.asInstanceOf[js.Any])
    if (canvas != null) __obj.updateDynamic("canvas")(canvas.asInstanceOf[js.Any])
    if (canvasStyle != null) __obj.updateDynamic("canvasStyle")(canvasStyle.asInstanceOf[js.Any])
    if (context != null) __obj.updateDynamic("context")(context.asInstanceOf[js.Any])
    if (!js.isUndefined(customEnvironment)) __obj.updateDynamic("customEnvironment")(customEnvironment.asInstanceOf[js.Any])
    if (!js.isUndefined(disableContextMenu)) __obj.updateDynamic("disableContextMenu")(disableContextMenu.asInstanceOf[js.Any])
    if (dom != null) __obj.updateDynamic("dom")(dom.asInstanceOf[js.Any])
    if (fps != null) __obj.updateDynamic("fps")(fps.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (images != null) __obj.updateDynamic("images")(images.asInstanceOf[js.Any])
    if (input != null) __obj.updateDynamic("input")(input.asInstanceOf[js.Any])
    if (loader != null) __obj.updateDynamic("loader")(loader.asInstanceOf[js.Any])
    if (parent != null) __obj.updateDynamic("parent")(parent.asInstanceOf[js.Any])
    if (physics != null) __obj.updateDynamic("physics")(physics.asInstanceOf[js.Any])
    if (plugins != null) __obj.updateDynamic("plugins")(plugins.asInstanceOf[js.Any])
    if (render != null) __obj.updateDynamic("render")(render.asInstanceOf[js.Any])
    if (resolution != null) __obj.updateDynamic("resolution")(resolution.asInstanceOf[js.Any])
    if (scale != null) __obj.updateDynamic("scale")(scale.asInstanceOf[js.Any])
    if (scene != null) __obj.updateDynamic("scene")(scene.asInstanceOf[js.Any])
    if (seed != null) __obj.updateDynamic("seed")(seed.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (!js.isUndefined(transparent)) __obj.updateDynamic("transparent")(transparent.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (zoom != null) __obj.updateDynamic("zoom")(zoom.asInstanceOf[js.Any])
    __obj.asInstanceOf[GameConfig]
  }
}

