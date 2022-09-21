package typings.pixiApp

import typings.pixiCore.mod.AbstractRenderer
import typings.pixiCore.mod.IRendererOptionsAuto
import typings.pixiCore.mod.Renderer
import typings.pixiDisplay.anon.DisplayObject
import typings.pixiDisplay.mod.Container
import typings.pixiDisplay.mod.IDestroyOptions
import typings.pixiExtensions.mod.ExtensionMetadata
import typings.pixiMath.mod.Rectangle
import typings.std.HTMLCanvasElement
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
    extends StObject
       with typings.pixiApp.GlobalMixins.Application {
    def this(options: IApplicationOptions) = this()
    
    /* CompleteClass */
    override def cancelResize(): Unit = js.native
    
    /**
      * Destroy and don't use after this.
      * @param {boolean} [removeView=false] - Automatically remove canvas from DOM.
      * @param {object|boolean} [stageOptions] - Options parameter. A boolean will act as if all options
      *  have been set to that value
      * @param {boolean} [stageOptions.children=false] - if set to true, all the children will have their destroy
      *  method called as well. 'stageOptions' will be passed on to those calls.
      * @param {boolean} [stageOptions.texture=false] - Only used for child Sprites if stageOptions.children is set
      *  to true. Should it destroy the texture of the child sprite
      * @param {boolean} [stageOptions.baseTexture=false] - Only used for child Sprites if stageOptions.children is set
      *  to true. Should it destroy the base texture of the child sprite
      */
    def destroy(): Unit = js.native
    def destroy(removeView: Boolean): Unit = js.native
    def destroy(removeView: Boolean, stageOptions: Boolean): Unit = js.native
    def destroy(removeView: Boolean, stageOptions: IDestroyOptions): Unit = js.native
    def destroy(removeView: Unit, stageOptions: Boolean): Unit = js.native
    def destroy(removeView: Unit, stageOptions: IDestroyOptions): Unit = js.native
    
    /* CompleteClass */
    override def queueResize(): Unit = js.native
    
    /** Render the current stage. */
    def render(): Unit = js.native
    
    /**
      * WebGL renderer if available, otherwise CanvasRenderer.
      * @member {PIXI.Renderer|PIXI.CanvasRenderer}
      */
    var renderer: Renderer | AbstractRenderer = js.native
    
    /* CompleteClass */
    override def resize(): Unit = js.native
    
    /* CompleteClass */
    var resizeTo: Window | HTMLElement = js.native
    
    /**
      * Reference to the renderer's screen rectangle. Its safe to use as `filterArea` or `hitArea` for the whole screen.
      * @member {PIXI.Rectangle}
      * @readonly
      */
    def screen: Rectangle = js.native
    
    /**
      * The root display container that's rendered.
      * @member {PIXI.Container}
      */
    var stage: Container[DisplayObject] = js.native
    
    /**
      * Reference to the renderer's canvas element.
      * @member {HTMLCanvasElement}
      * @readonly
      */
    def view: HTMLCanvasElement = js.native
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
    
    /**
      * Use the {@link PIXI.extensions.add} API to register plugins.
      * @deprecated since 6.5.0
      * @static
      * @param {PIXI.IApplicationPlugin} plugin - Plugin being installed
      */
    inline def registerPlugin(plugin: IApplicationPlugin): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("registerPlugin")(plugin.asInstanceOf[js.Any]).asInstanceOf[Unit]
  }
  
  @JSImport("@pixi/app", "ResizePlugin")
  @js.native
  open class ResizePlugin () extends StObject
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
  
  trait IApplicationOptions
    extends StObject
       with IRendererOptionsAuto
       with typings.pixiApp.GlobalMixins.IApplicationOptions
  object IApplicationOptions {
    
    inline def apply(): IApplicationOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IApplicationOptions]
    }
  }
  
  trait IApplicationPlugin extends StObject {
    
    /** Called when destroying Application, scoped to Application instance. */
    def destroy(): Unit
    
    /**
      * Called when Application is constructed, scoped to Application instance.
      * Passes in `options` as the only argument, which are Application constructor options.
      * @param {object} options - Application options.
      */
    def init(options: IApplicationOptions): Unit
  }
  object IApplicationPlugin {
    
    inline def apply(destroy: () => Unit, init: IApplicationOptions => Unit): IApplicationPlugin = {
      val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), init = js.Any.fromFunction1(init))
      __obj.asInstanceOf[IApplicationPlugin]
    }
    
    extension [Self <: IApplicationPlugin](x: Self) {
      
      inline def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
      
      inline def setInit(value: IApplicationOptions => Unit): Self = StObject.set(x, "init", js.Any.fromFunction1(value))
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
    
    extension [Self <: ResizeableRenderer](x: Self) {
      
      inline def setResize(value: (/* desiredScreenWidth */ Double, /* desiredScreenHeight */ Double) => Unit): Self = StObject.set(x, "resize", js.Any.fromFunction2(value))
    }
  }
}
