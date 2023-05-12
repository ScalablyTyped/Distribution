package typings.pixiApp

import typings.pixiApp.libApplicationMod.IApplicationOptions
import typings.pixiApp.libApplicationMod.IApplicationPlugin
import typings.pixiApp.libResizePluginMod.ResizePluginOptions
import typings.pixiApp.libResizePluginMod.ResizeableRenderer
import typings.pixiExtensions.mod.ExtensionMetadata
import typings.pixiSettings.libIcanvasMod.ICanvas
import typings.std.HTMLElement
import typings.std.Partial
import typings.std.Window
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@pixi/app", "Application")
  @js.native
  /**
    * @param options - The optional application and renderer parameters.
    */
  open class Application[VIEW /* <: ICanvas */] ()
    extends typings.pixiApp.libApplicationMod.Application[VIEW] {
    def this(options: Partial[IApplicationOptions]) = this()
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
    inline def init(options: ResizePluginOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("init")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
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
