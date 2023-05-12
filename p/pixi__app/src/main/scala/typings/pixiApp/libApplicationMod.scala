package typings.pixiApp

import typings.pixiColor.libColorMod.ColorSource
import typings.pixiCore.libAutoDetectRendererMod.IRendererOptionsAuto
import typings.pixiCore.libIrendererMod.IRenderer
import typings.pixiCore.mod.Rectangle
import typings.pixiDisplay.libDisplayObjectMod.DisplayObject
import typings.pixiDisplay.libDisplayObjectMod.IDestroyOptions
import typings.pixiDisplay.mod.Container
import typings.pixiSettings.libIcanvasMod.ICanvas
import typings.std.Partial
import typings.std.WebGLPowerPreference
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libApplicationMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify GlobalMixins.Application * / any */ @JSImport("@pixi/app/lib/Application", "Application")
  @js.native
  /**
    * @param options - The optional application and renderer parameters.
    */
  open class Application[VIEW /* <: ICanvas */] () extends StObject {
    def this(options: Partial[IApplicationOptions]) = this()
    
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
    
    inline def apply(
      antialias: Boolean,
      backgroundAlpha: Double,
      backgroundColor: ColorSource,
      clearBeforeRender: Boolean,
      hello: Boolean,
      powerPreference: WebGLPowerPreference,
      premultipliedAlpha: Boolean,
      preserveDrawingBuffer: Boolean
    ): IApplicationOptions = {
      val __obj = js.Dynamic.literal(antialias = antialias.asInstanceOf[js.Any], backgroundAlpha = backgroundAlpha.asInstanceOf[js.Any], backgroundColor = backgroundColor.asInstanceOf[js.Any], clearBeforeRender = clearBeforeRender.asInstanceOf[js.Any], hello = hello.asInstanceOf[js.Any], powerPreference = powerPreference.asInstanceOf[js.Any], premultipliedAlpha = premultipliedAlpha.asInstanceOf[js.Any], preserveDrawingBuffer = preserveDrawingBuffer.asInstanceOf[js.Any], context = null)
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
    def init(options: Partial[IApplicationOptions]): Unit
  }
  object IApplicationPlugin {
    
    inline def apply(destroy: () => Unit, init: Partial[IApplicationOptions] => Unit): IApplicationPlugin = {
      val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), init = js.Any.fromFunction1(init))
      __obj.asInstanceOf[IApplicationPlugin]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IApplicationPlugin] (val x: Self) extends AnyVal {
      
      inline def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
      
      inline def setInit(value: Partial[IApplicationOptions] => Unit): Self = StObject.set(x, "init", js.Any.fromFunction1(value))
    }
  }
}
