package typings.pixiJs.mod

import typings.pixiApp.mod.IApplicationOptions
import typings.pixiApp.mod.IApplicationPlugin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("pixi.js", "Application")
@js.native
/**
  * @param {object} [options] - The optional renderer parameters.
  * @param {boolean} [options.autoStart=true] - Automatically starts the rendering after the construction.
  *     **Note**: Setting this parameter to false does NOT stop the shared ticker even if you set
  *     options.sharedTicker to true in case that it is already started. Stop it by your own.
  * @param {number} [options.width=800] - The width of the renderers view.
  * @param {number} [options.height=600] - The height of the renderers view.
  * @param {HTMLCanvasElement} [options.view] - The canvas to use as a view, optional.
  * @param {boolean} [options.useContextAlpha=true] - Pass-through value for canvas' context `alpha` property.
  *   If you want to set transparency, please use `backgroundAlpha`. This option is for cases where the
  *   canvas needs to be opaque, possibly for performance reasons on some older devices.
  * @param {boolean} [options.autoDensity=false] - Resizes renderer view in CSS pixels to allow for
  *   resolutions other than 1.
  * @param {boolean} [options.antialias=false] - Sets antialias
  * @param {boolean} [options.preserveDrawingBuffer=false] - Enables drawing buffer preservation, enable this if you
  *  need to call toDataUrl on the WebGL context.
  * @param {number} [options.resolution=PIXI.settings.RESOLUTION] - The resolution / device pixel ratio of the renderer.
  * @param {boolean} [options.forceCanvas=false] - prevents selection of WebGL renderer, even if such is present, this
  *   option only is available when using **pixi.js-legacy** or **@pixi/canvas-renderer** modules, otherwise
  *   it is ignored.
  * @param {number} [options.backgroundColor=0x000000] - The background color of the rendered area
  *  (shown if not transparent).
  * @param {number} [options.backgroundAlpha=1] - Value from 0 (fully transparent) to 1 (fully opaque).
  * @param {boolean} [options.clearBeforeRender=true] - This sets if the renderer will clear the canvas or
  *   not before the new render pass.
  * @param {string} [options.powerPreference] - Parameter passed to webgl context, set to "high-performance"
  *  for devices with dual graphics card. **(WebGL only)**.
  * @param {boolean} [options.sharedTicker=false] - `true` to use PIXI.Ticker.shared, `false` to create new ticker.
  *  If set to false, you cannot register a handler to occur before anything that runs on the shared ticker.
  *  The system ticker will always run before both the shared ticker and the app ticker.
  * @param {boolean} [options.sharedLoader=false] - `true` to use PIXI.Loader.shared, `false` to create new Loader.
  * @param {Window|HTMLElement} [options.resizeTo] - Element to automatically resize stage to.
  */
open class Application ()
  extends typings.pixiApp.mod.Application {
  def this(options: IApplicationOptions) = this()
}
/* static members */
object Application {
  
  @JSImport("pixi.js", "Application")
  @js.native
  val ^ : js.Any = js.native
  
  /** Collection of installed plugins. */
  @JSImport("pixi.js", "Application._plugins")
  @js.native
  def _plugins: js.Array[IApplicationPlugin] = js.native
  inline def _plugins_=(x: js.Array[IApplicationPlugin]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_plugins")(x.asInstanceOf[js.Any])
  
  /**
    * Use the {@link PIXI.extensions.add} API to register plugins.
    * @deprecated since 6.5.0
    * @static
    * @param {PIXI.IApplicationPlugin} plugin - Plugin being installed
    */
  inline def registerPlugin(plugin: IApplicationPlugin): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("registerPlugin")(plugin.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
