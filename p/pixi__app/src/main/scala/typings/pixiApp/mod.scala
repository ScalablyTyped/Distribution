package typings.pixiApp

import typings.pixiApp.libApplicationMod.IApplicationOptions
import typings.pixiApp.libApplicationMod.IApplicationPlugin
import typings.pixiApp.libResizePluginMod.ResizeableRenderer
import typings.pixiExtensions.mod.ExtensionMetadata
import typings.std.HTMLElement
import typings.std.Window
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@pixi/app", "Application")
  @js.native
  /**
    * @param {object} [options] - The optional renderer parameters.
    * @param {boolean} [options.autoStart=true] - Automatically starts the rendering after the construction.
    *     **Note**: Setting this parameter to false does NOT stop the shared ticker even if you set
    *     options.sharedTicker to true in case that it is already started. Stop it by your own.
    * @param {number} [options.width=800] - The width of the renderers view.
    * @param {number} [options.height=600] - The height of the renderers view.
    * @param {PIXI.ICanvas} [options.view] - The canvas to use as a view, optional.
    * @param {boolean} [options.useContextAlpha=true] - Pass-through value for canvas' context `alpha` property.
    *   If you want to set transparency, please use `backgroundAlpha`. This option is for cases where the
    *   canvas needs to be opaque, possibly for performance reasons on some older devices.
    * @param {boolean} [options.autoDensity=false] - Resizes renderer view in CSS pixels to allow for
    *   resolutions other than 1.
    * @param {boolean} [options.antialias=false] - Sets antialias
    * @param {boolean} [options.preserveDrawingBuffer=false] - Enables drawing buffer preservation, enable this if you
    *  need to call toDataURL on the WebGL context.
    * @param {number} [options.resolution=PIXI.settings.RESOLUTION] - The resolution / device pixel ratio of the renderer.
    * @param {boolean} [options.forceCanvas=false] - prevents selection of WebGL renderer, even if such is present, this
    *   option only is available when using **pixi.js-legacy** or **@pixi/canvas-renderer** modules, otherwise
    *   it is ignored.
    * @param {number|string} [options.backgroundColor=0x000000] - The background color of the rendered area
    *  (shown if not transparent). Also, accepts hex strings or color names (e.g., 'white').
    * @param {number|string} [options.background] - Alias for `options.backgroundColor`.
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
    * @param {boolean} [options.hello=false] - Logs renderer type and version.
    */
  open class Application ()
    extends typings.pixiApp.libApplicationMod.Application {
    def this(options: IApplicationOptions) = this()
  }
  /* static members */
  object Application {
    
    @JSImport("@pixi/app", "Application")
    @js.native
    val ^ : js.Any = js.native
    
    /** Collection of installed plugins. */
    @JSImport("@pixi/app", "Application._plugins")
    @js.native
    def _plugins: js.Array[IApplicationPlugin] = js.native
    inline def _plugins_=(x: js.Array[IApplicationPlugin]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_plugins")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@pixi/app", "ResizePlugin")
  @js.native
  open class ResizePlugin ()
    extends typings.pixiApp.libResizePluginMod.ResizePlugin
  /* static members */
  object ResizePlugin {
    
    @JSImport("@pixi/app", "ResizePlugin")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@pixi/app", "ResizePlugin._resizeId")
    @js.native
    def _resizeId: Any = js.native
    inline def _resizeId_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_resizeId")(x.asInstanceOf[js.Any])
    
    @JSImport("@pixi/app", "ResizePlugin._resizeTo")
    @js.native
    def _resizeTo: Any = js.native
    inline def _resizeTo_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_resizeTo")(x.asInstanceOf[js.Any])
    
    @JSImport("@pixi/app", "ResizePlugin.cancelResize")
    @js.native
    def cancelResize: Any = js.native
    inline def cancelResize_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("cancelResize")(x.asInstanceOf[js.Any])
    
    /**
      * Clean up the ticker, scoped to application
      * @static
      * @private
      */
    inline def destroy(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("destroy")().asInstanceOf[Unit]
    
    /** @ignore */
    @JSImport("@pixi/app", "ResizePlugin.extension")
    @js.native
    val `extension`: ExtensionMetadata = js.native
    
    /**
      * Initialize the plugin with scope of application instance
      * @static
      * @private
      * @param {object} [options] - See application options
      */
    inline def init(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("init")().asInstanceOf[Unit]
    inline def init(options: IApplicationOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("init")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def queueResize(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("queueResize")().asInstanceOf[Unit]
    
    inline def render(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("render")().asInstanceOf[Unit]
    
    @JSImport("@pixi/app", "ResizePlugin.renderer")
    @js.native
    def renderer: ResizeableRenderer = js.native
    inline def renderer_=(x: ResizeableRenderer): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("renderer")(x.asInstanceOf[js.Any])
    
    inline def resize(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("resize")().asInstanceOf[Unit]
    
    @JSImport("@pixi/app", "ResizePlugin.resizeTo")
    @js.native
    def resizeTo: Window | HTMLElement = js.native
    inline def resizeTo_=(x: Window | HTMLElement): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("resizeTo")(x.asInstanceOf[js.Any])
  }
}
