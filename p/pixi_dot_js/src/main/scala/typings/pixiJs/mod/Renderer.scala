package typings.pixiJs.mod

import typings.pixiCore.mod.IRendererOptions
import typings.pixiCore.mod.IRendererPluginConstructor
import typings.pixiCore.mod.IRendererPlugins
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("pixi.js", "Renderer")
@js.native
/**
  * @param [options] - The optional renderer parameters.
  * @param {number} [options.width=800] - The width of the screen.
  * @param {number} [options.height=600] - The height of the screen.
  * @param {HTMLCanvasElement} [options.view] - The canvas to use as a view, optional.
  * @param {boolean} [options.useContextAlpha=true] - Pass-through value for canvas' context `alpha` property.
  *   If you want to set transparency, please use `backgroundAlpha`. This option is for cases where the
  *   canvas needs to be opaque, possibly for performance reasons on some older devices.
  * @param {boolean} [options.autoDensity=false] - Resizes renderer view in CSS pixels to allow for
  *   resolutions other than 1.
  * @param {boolean} [options.antialias=false] - Sets antialias. If not available natively then FXAA
  *  antialiasing is used.
  * @param {number} [options.resolution=PIXI.settings.RESOLUTION] - The resolution / device pixel ratio of the renderer.
  * @param {boolean} [options.clearBeforeRender=true] - This sets if the renderer will clear
  *  the canvas or not before the new render pass. If you wish to set this to false, you *must* set
  *  preserveDrawingBuffer to `true`.
  * @param {boolean} [options.preserveDrawingBuffer=false] - Enables drawing buffer preservation,
  *  enable this if you need to call toDataUrl on the WebGL context.
  * @param {number} [options.backgroundColor=0x000000] - The background color of the rendered area
  *  (shown if not transparent).
  * @param {number} [options.backgroundAlpha=1] - Value from 0 (fully transparent) to 1 (fully opaque).
  * @param {string} [options.powerPreference] - Parameter passed to WebGL context, set to "high-performance"
  *  for devices with dual graphics card.
  * @param {object} [options.context] - If WebGL context already exists, all parameters must be taken from it.
  */
open class Renderer ()
  extends typings.pixiCore.mod.Renderer {
  def this(options: IRendererOptions) = this()
}
/* static members */
object Renderer {
  
  @JSImport("pixi.js", "Renderer")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Collection of installed plugins. These are included by default in PIXI, but can be excluded
    * by creating a custom build. Consult the README for more information about creating custom
    * builds and excluding plugins.
    * @readonly
    * @property {PIXI.AccessibilityManager} accessibility Support tabbing interactive elements.
    * @property {PIXI.Extract} extract Extract image data from renderer.
    * @property {PIXI.InteractionManager} interaction Handles mouse, touch and pointer events.
    * @property {PIXI.ParticleRenderer} particle Renderer for ParticleContainer objects.
    * @property {PIXI.Prepare} prepare Pre-render display objects.
    * @property {PIXI.BatchRenderer} batch Batching of Sprite, Graphics and Mesh objects.
    * @property {PIXI.TilingSpriteRenderer} tilingSprite Renderer for TilingSprite objects.
    */
  @JSImport("pixi.js", "Renderer.__plugins")
  @js.native
  def __plugins: IRendererPlugins = js.native
  inline def __plugins_=(x: IRendererPlugins): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("__plugins")(x.asInstanceOf[js.Any])
  
  /**
    * Create renderer if WebGL is available. Overrideable
    * by the **@pixi/canvas-renderer** package to allow fallback.
    * throws error if WebGL is not available.
    * @param options
    * @private
    */
  inline def create(): typings.pixiCore.mod.AbstractRenderer = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[typings.pixiCore.mod.AbstractRenderer]
  inline def create(options: IRendererOptions): typings.pixiCore.mod.AbstractRenderer = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(options.asInstanceOf[js.Any]).asInstanceOf[typings.pixiCore.mod.AbstractRenderer]
  
  /**
    * Use the {@link PIXI.extensions.add} API to register plugins.
    * @deprecated since 6.5.0
    * @param pluginName - The name of the plugin.
    * @param ctor - The constructor function or class for the plugin.
    */
  inline def registerPlugin(pluginName: String, ctor: IRendererPluginConstructor): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerPlugin")(pluginName.asInstanceOf[js.Any], ctor.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
