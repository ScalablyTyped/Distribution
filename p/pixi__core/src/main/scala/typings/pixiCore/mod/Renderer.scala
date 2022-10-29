package typings.pixiCore.mod

import typings.pixiCore.libIrendererMod.IRendererOptions
import typings.pixiCore.libPluginPluginSystemMod.IRendererPlugins
import typings.pixiExtensions.mod.ExtensionMetadata
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pixi/core", "Renderer")
@js.native
/**
  * @param [options] - The optional renderer parameters.
  * @param {number} [options.width=800] - The width of the screen.
  * @param {number} [options.height=600] - The height of the screen.
  * @param {PIXI.ICanvas} [options.view] - The canvas to use as a view, optional.
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
  *  enable this if you need to call toDataURL on the WebGL context.
  * @param {number|string} [options.backgroundColor=0x000000] - The background color of the rendered area
  *  (shown if not transparent). Also, accepts hex strings or color names (e.g., 'white').
  * @param {number|string} [options.background] - Alias for `options.backgroundColor`.
  * @param {number} [options.backgroundAlpha=1] - Value from 0 (fully transparent) to 1 (fully opaque).
  * @param {string} [options.powerPreference] - Parameter passed to WebGL context, set to "high-performance"
  *  for devices with dual graphics card.
  * @param {object} [options.context] - If WebGL context already exists, all parameters must be taken from it.
  * @param {object} [options.blit] - if rendering to a renderTexture, set to true if you want to run blit after
  * the render. defaults to false.
  * @param {boolean} [options.hello=false] - Logs renderer type and version.
  */
open class Renderer ()
  extends typings.pixiCore.libRendererMod.Renderer {
  def this(options: IRendererOptions) = this()
}
/* static members */
object Renderer {
  
  @JSImport("@pixi/core", "Renderer")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Collection of installed plugins. These are included by default in PIXI, but can be excluded
    * by creating a custom build. Consult the README for more information about creating custom
    * builds and excluding plugins.
    * @private
    */
  @JSImport("@pixi/core", "Renderer.__plugins")
  @js.native
  val __plugins: IRendererPlugins = js.native
  
  /**
    * The collection of installed systems.
    * @private
    */
  @JSImport("@pixi/core", "Renderer.__systems")
  @js.native
  val __systems: Record[String, Any] = js.native
  
  /** @ignore */
  @JSImport("@pixi/core", "Renderer.extension")
  @js.native
  val `extension`: ExtensionMetadata = js.native
  
  /**
    * Create renderer if WebGL is available. Overrideable
    * by the **@pixi/canvas-renderer** package to allow fallback.
    * throws error if WebGL is not available.
    * @param options
    * @private
    */
  inline def test(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("test")().asInstanceOf[Boolean]
  inline def test(options: IRendererOptions): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("test")(options.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
