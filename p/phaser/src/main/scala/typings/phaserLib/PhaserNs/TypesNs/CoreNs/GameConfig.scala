package typings
package phaserLib.PhaserNs.TypesNs.CoreNs

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
  var autoFocus: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The background color of the game canvas. The default is black.
    */
  var backgroundColor: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  /**
    * Configuration for the banner printed in the browser console when the game starts.
    */
  var banner: js.UndefOr[scala.Boolean | BannerConfig] = js.undefined
  /**
    * Optional callbacks to run before or after game boot.
    */
  var callbacks: js.UndefOr[CallbacksConfig] = js.undefined
  /**
    * Provide your own Canvas element for Phaser to use instead of creating one.
    */
  var canvas: js.UndefOr[stdLib.HTMLCanvasElement] = js.undefined
  /**
    * CSS styles to apply to the game canvas instead of Phasers default styles.
    */
  var canvasStyle: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Provide your own Canvas Context for Phaser to use, instead of creating one.
    */
  var context: js.UndefOr[stdLib.CanvasRenderingContext2D] = js.undefined
  /**
    * Disable the browser's default 'contextmenu' event (usually triggered by a right-button mouse click).
    */
  var disableContextMenu: js.UndefOr[scala.Boolean] = js.undefined
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
  var height: js.UndefOr[phaserLib.integer | java.lang.String] = js.undefined
  /**
    * Images configuration.
    */
  var images: js.UndefOr[ImagesConfig] = js.undefined
  /**
    * Input configuration, or `false` to disable all game input.
    */
  var input: js.UndefOr[scala.Boolean | InputConfig] = js.undefined
  /**
    * Loader configuration.
    */
  var loader: js.UndefOr[LoaderConfig] = js.undefined
  /**
    * The DOM element that will contain the game canvas, or its `id`. If undefined or if the named element doesn't exist, the game canvas is inserted directly into the document body. If `null` no parent will be used and you are responsible for adding the canvas to your environment.
    */
  var parent: js.UndefOr[stdLib.HTMLElement | java.lang.String] = js.undefined
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
  var resolution: js.UndefOr[scala.Double] = js.undefined
  /**
    * The Scale Manager configuration.
    */
  var scale: js.UndefOr[ScaleConfig] = js.undefined
  /**
    * A scene or scenes to add to the game. If several are given, the first is started; the remainder are started only if they have `{ active: true }`. See the `sceneConfig` argument in `Phaser.Scenes.SceneManager#add`.
    */
  var scene: js.UndefOr[
    phaserLib.PhaserNs.Scene | js.Array[phaserLib.PhaserNs.Scene] | phaserLib.PhaserNs.TypesNs.ScenesNs.SettingsConfig | js.Array[phaserLib.PhaserNs.TypesNs.ScenesNs.SettingsConfig] | phaserLib.PhaserNs.TypesNs.ScenesNs.CreateSceneFromObjectConfig | js.Array[phaserLib.PhaserNs.TypesNs.ScenesNs.CreateSceneFromObjectConfig] | js.Function
  ] = js.undefined
  /**
    * Seed for the random number generator.
    */
  var seed: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    * The title of the game. Shown in the browser console.
    */
  var title: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Whether the game canvas will have a transparent background.
    */
  var transparent: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Which renderer to use. Phaser.AUTO, Phaser.CANVAS, Phaser.HEADLESS, or Phaser.WEBGL. AUTO picks WEBGL if available, otherwise CANVAS.
    */
  var `type`: js.UndefOr[scala.Double] = js.undefined
  /**
    * The URL of the game. Shown in the browser console.
    */
  var url: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The version of the game. Shown in the browser console.
    */
  var version: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The width of the game, in game pixels.
    */
  var width: js.UndefOr[phaserLib.integer | java.lang.String] = js.undefined
  /**
    * Simple scale applied to the game canvas. 2 is double size, 0.5 is half size, etc.
    */
  var zoom: js.UndefOr[scala.Double] = js.undefined
}

object GameConfig {
  @scala.inline
  def apply(
    audio: AudioConfig = null,
    autoFocus: js.UndefOr[scala.Boolean] = js.undefined,
    backgroundColor: java.lang.String | scala.Double = null,
    banner: scala.Boolean | BannerConfig = null,
    callbacks: CallbacksConfig = null,
    canvas: stdLib.HTMLCanvasElement = null,
    canvasStyle: java.lang.String = null,
    context: stdLib.CanvasRenderingContext2D = null,
    disableContextMenu: js.UndefOr[scala.Boolean] = js.undefined,
    dom: DOMContainerConfig = null,
    fps: FPSConfig = null,
    height: phaserLib.integer | java.lang.String = null,
    images: ImagesConfig = null,
    input: scala.Boolean | InputConfig = null,
    loader: LoaderConfig = null,
    parent: stdLib.HTMLElement | java.lang.String = null,
    physics: PhysicsConfig = null,
    plugins: PluginObject | js.Array[PluginObjectItem] = null,
    render: RenderConfig = null,
    resolution: scala.Int | scala.Double = null,
    scale: ScaleConfig = null,
    scene: phaserLib.PhaserNs.Scene | js.Array[phaserLib.PhaserNs.Scene] | phaserLib.PhaserNs.TypesNs.ScenesNs.SettingsConfig | js.Array[phaserLib.PhaserNs.TypesNs.ScenesNs.SettingsConfig] | phaserLib.PhaserNs.TypesNs.ScenesNs.CreateSceneFromObjectConfig | js.Array[phaserLib.PhaserNs.TypesNs.ScenesNs.CreateSceneFromObjectConfig] | js.Function = null,
    seed: js.Array[java.lang.String] = null,
    title: java.lang.String = null,
    transparent: js.UndefOr[scala.Boolean] = js.undefined,
    `type`: scala.Int | scala.Double = null,
    url: java.lang.String = null,
    version: java.lang.String = null,
    width: phaserLib.integer | java.lang.String = null,
    zoom: scala.Int | scala.Double = null
  ): GameConfig = {
    val __obj = js.Dynamic.literal()
    if (audio != null) __obj.updateDynamic("audio")(audio)
    if (!js.isUndefined(autoFocus)) __obj.updateDynamic("autoFocus")(autoFocus)
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor.asInstanceOf[js.Any])
    if (banner != null) __obj.updateDynamic("banner")(banner.asInstanceOf[js.Any])
    if (callbacks != null) __obj.updateDynamic("callbacks")(callbacks)
    if (canvas != null) __obj.updateDynamic("canvas")(canvas)
    if (canvasStyle != null) __obj.updateDynamic("canvasStyle")(canvasStyle)
    if (context != null) __obj.updateDynamic("context")(context)
    if (!js.isUndefined(disableContextMenu)) __obj.updateDynamic("disableContextMenu")(disableContextMenu)
    if (dom != null) __obj.updateDynamic("dom")(dom)
    if (fps != null) __obj.updateDynamic("fps")(fps)
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (images != null) __obj.updateDynamic("images")(images)
    if (input != null) __obj.updateDynamic("input")(input.asInstanceOf[js.Any])
    if (loader != null) __obj.updateDynamic("loader")(loader)
    if (parent != null) __obj.updateDynamic("parent")(parent.asInstanceOf[js.Any])
    if (physics != null) __obj.updateDynamic("physics")(physics)
    if (plugins != null) __obj.updateDynamic("plugins")(plugins.asInstanceOf[js.Any])
    if (render != null) __obj.updateDynamic("render")(render)
    if (resolution != null) __obj.updateDynamic("resolution")(resolution.asInstanceOf[js.Any])
    if (scale != null) __obj.updateDynamic("scale")(scale)
    if (scene != null) __obj.updateDynamic("scene")(scene.asInstanceOf[js.Any])
    if (seed != null) __obj.updateDynamic("seed")(seed)
    if (title != null) __obj.updateDynamic("title")(title)
    if (!js.isUndefined(transparent)) __obj.updateDynamic("transparent")(transparent)
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url)
    if (version != null) __obj.updateDynamic("version")(version)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (zoom != null) __obj.updateDynamic("zoom")(zoom.asInstanceOf[js.Any])
    __obj.asInstanceOf[GameConfig]
  }
}

