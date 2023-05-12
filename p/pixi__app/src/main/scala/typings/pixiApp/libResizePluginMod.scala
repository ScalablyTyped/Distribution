package typings.pixiApp

import typings.pixiExtensions.mod.ExtensionMetadata
import typings.std.HTMLElement
import typings.std.Window
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libResizePluginMod {
  
  @JSImport("@pixi/app/lib/ResizePlugin", "ResizePlugin")
  @js.native
  open class ResizePlugin () extends StObject
  /* static members */
  object ResizePlugin {
    
    @JSImport("@pixi/app/lib/ResizePlugin", "ResizePlugin")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@pixi/app/lib/ResizePlugin", "ResizePlugin._resizeId")
    @js.native
    def _resizeId: Any = js.native
    inline def _resizeId_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_resizeId")(x.asInstanceOf[js.Any])
    
    @JSImport("@pixi/app/lib/ResizePlugin", "ResizePlugin._resizeTo")
    @js.native
    def _resizeTo: Any = js.native
    inline def _resizeTo_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_resizeTo")(x.asInstanceOf[js.Any])
    
    @JSImport("@pixi/app/lib/ResizePlugin", "ResizePlugin.cancelResize")
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
    @JSImport("@pixi/app/lib/ResizePlugin", "ResizePlugin.extension")
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
    
    @JSImport("@pixi/app/lib/ResizePlugin", "ResizePlugin.renderer")
    @js.native
    def renderer: ResizeableRenderer = js.native
    inline def renderer_=(x: ResizeableRenderer): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("renderer")(x.asInstanceOf[js.Any])
    
    inline def resize(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("resize")().asInstanceOf[Unit]
    
    @JSImport("@pixi/app/lib/ResizePlugin", "ResizePlugin.resizeTo")
    @js.native
    def resizeTo: Window | HTMLElement = js.native
    inline def resizeTo_=(x: Window | HTMLElement): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("resizeTo")(x.asInstanceOf[js.Any])
  }
  
  trait ResizePluginOptions extends StObject {
    
    /**
      * Element to automatically resize stage to.
      * @memberof PIXI.IApplicationOptions
      */
    var resizeTo: js.UndefOr[Window | HTMLElement] = js.undefined
  }
  object ResizePluginOptions {
    
    inline def apply(): ResizePluginOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ResizePluginOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ResizePluginOptions] (val x: Self) extends AnyVal {
      
      inline def setResizeTo(value: Window | HTMLElement): Self = StObject.set(x, "resizeTo", value.asInstanceOf[js.Any])
      
      inline def setResizeToUndefined: Self = StObject.set(x, "resizeTo", js.undefined)
    }
  }
  
  /* Inlined std.Pick<@pixi/core.@pixi/core.Renderer, 'resize'> */
  trait ResizeableRenderer extends StObject {
    
    def resize(desiredScreenWidth: Double, desiredScreenHeight: Double): Unit
    @JSName("resize")
    var resize_Original: js.Function2[/* desiredScreenWidth */ Double, /* desiredScreenHeight */ Double, Unit]
  }
  object ResizeableRenderer {
    
    inline def apply(resize: (/* desiredScreenWidth */ Double, /* desiredScreenHeight */ Double) => Unit): ResizeableRenderer = {
      val __obj = js.Dynamic.literal(resize = js.Any.fromFunction2(resize))
      __obj.asInstanceOf[ResizeableRenderer]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ResizeableRenderer] (val x: Self) extends AnyVal {
      
      inline def setResize(value: (/* desiredScreenWidth */ Double, /* desiredScreenHeight */ Double) => Unit): Self = StObject.set(x, "resize", js.Any.fromFunction2(value))
    }
  }
}
