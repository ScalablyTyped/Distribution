package typings.pixiApp

import typings.pixiCore.libAutoDetectRendererMod.IRendererOptionsAuto
import typings.pixiCore.libIrendererMod.IRenderer
import typings.pixiCore.mod.Rectangle
import typings.pixiDisplay.libDisplayObjectMod.DisplayObject
import typings.pixiDisplay.libDisplayObjectMod.IDestroyOptions
import typings.pixiDisplay.mod.Container
import typings.pixiSettings.libIcanvasMod.ICanvas
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libApplicationMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify GlobalMixins.Application * / any */ @JSImport("@pixi/app/lib/Application", "Application")
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
  open class Application[VIEW /* <: ICanvas */] () extends StObject {
    def this(options: IApplicationOptions) = this()
    
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
    
    /** Render the current stage. */
    def render(): Unit = js.native
    
    /**
      * WebGL renderer if available, otherwise CanvasRenderer.
      * @member {PIXI.Renderer|PIXI.CanvasRenderer}
      */
    var renderer: IRenderer[VIEW] = js.native
    
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
      * @member {PIXI.ICanvas}
      * @readonly
      */
    def view: VIEW = js.native
  }
  /* static members */
  object Application {
    
    @JSImport("@pixi/app/lib/Application", "Application")
    @js.native
    val ^ : js.Any = js.native
    
    /** Collection of installed plugins. */
    @JSImport("@pixi/app/lib/Application", "Application._plugins")
    @js.native
    def _plugins: js.Array[IApplicationPlugin] = js.native
    inline def _plugins_=(x: js.Array[IApplicationPlugin]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_plugins")(x.asInstanceOf[js.Any])
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify GlobalMixins.IApplicationOptions * / any */ trait IApplicationOptions
    extends StObject
       with IRendererOptionsAuto
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
}
