package typings.pixiCore

import typings.pixiCore.anon.AutoDensity
import typings.pixiCore.libIrendererMod.IRenderer
import typings.pixiCore.libSystemIsystemMod.ISystem
import typings.pixiExtensions.mod.ExtensionMetadata
import typings.pixiMath.mod.Rectangle
import typings.pixiSettings.libIcanvasMod.ICanvas
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libViewViewSystemMod {
  
  @JSImport("@pixi/core/lib/view/ViewSystem", "ViewSystem")
  @js.native
  open class ViewSystem protected ()
    extends StObject
       with ISystem[ViewSystemOptions, Boolean] {
    def this(renderer: IRenderer[ICanvas]) = this()
    
    /**
      * Whether CSS dimensions of canvas view should be resized to screen dimensions automatically.
      * @member {boolean}
      */
    var autoDensity: Boolean = js.native
    
    /**
      * Destroys this System and optionally removes the canvas from the dom.
      * @param {boolean} [removeView=false] - Whether to remove the canvas from the DOM.
      */
    @JSName("destroy")
    def destroy_MViewSystem(removeView: Boolean): Unit = js.native
    
    /**
      * The canvas element that everything is drawn to.
      * @member {PIXI.ICanvas}
      */
    var element: ICanvas = js.native
    
    /**
      * initiates the view system
      * @param {PIXI.ViewOptions} options - the options for the view
      */
    @JSName("init")
    def init_MViewSystem(options: ViewSystemOptions): Unit = js.native
    
    /* private */ var renderer: Any = js.native
    
    /**
      * Resizes the screen and canvas to the specified dimensions.
      * @param desiredScreenWidth - The new width of the screen.
      * @param desiredScreenHeight - The new height of the screen.
      */
    def resizeView(desiredScreenWidth: Double, desiredScreenHeight: Double): Unit = js.native
    
    /**
      * The resolution / device pixel ratio of the renderer.
      * @member {number}
      * @default PIXI.settings.RESOLUTION
      */
    var resolution: Double = js.native
    
    /**
      * Measurements of the screen. (0, 0, screenWidth, screenHeight).
      *
      * Its safe to use as filterArea or hitArea for the whole stage.
      * @member {PIXI.Rectangle}
      */
    var screen: Rectangle = js.native
  }
  /* static members */
  object ViewSystem {
    
    @JSImport("@pixi/core/lib/view/ViewSystem", "ViewSystem")
    @js.native
    val ^ : js.Any = js.native
    
    /** @ignore */
    @JSImport("@pixi/core/lib/view/ViewSystem", "ViewSystem.defaultOptions")
    @js.native
    def defaultOptions: AutoDensity = js.native
    inline def defaultOptions_=(x: AutoDensity): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultOptions")(x.asInstanceOf[js.Any])
    
    /** @ignore */
    @JSImport("@pixi/core/lib/view/ViewSystem", "ViewSystem.extension")
    @js.native
    val `extension`: ExtensionMetadata = js.native
  }
  
  trait ViewSystemOptions extends StObject {
    
    /**
      * Whether the CSS dimensions of the renderer's view should be resized automatically.
      * @memberof PIXI.IRendererOptions
      */
    var autoDensity: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The height of the renderer's view.
      * @memberof PIXI.IRendererOptions
      */
    var height: js.UndefOr[Double] = js.undefined
    
    /**
      * The resolution / device pixel ratio of the renderer.
      * @memberof PIXI.IRendererOptions
      */
    var resolution: js.UndefOr[Double] = js.undefined
    
    /**
      * The canvas to use as the view. If omitted, a new canvas will be created.
      * @memberof PIXI.IRendererOptions
      */
    var view: js.UndefOr[ICanvas] = js.undefined
    
    /**
      * The width of the renderer's view.
      * @memberof PIXI.IRendererOptions
      */
    var width: js.UndefOr[Double] = js.undefined
  }
  object ViewSystemOptions {
    
    inline def apply(): ViewSystemOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ViewSystemOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ViewSystemOptions] (val x: Self) extends AnyVal {
      
      inline def setAutoDensity(value: Boolean): Self = StObject.set(x, "autoDensity", value.asInstanceOf[js.Any])
      
      inline def setAutoDensityUndefined: Self = StObject.set(x, "autoDensity", js.undefined)
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setResolution(value: Double): Self = StObject.set(x, "resolution", value.asInstanceOf[js.Any])
      
      inline def setResolutionUndefined: Self = StObject.set(x, "resolution", js.undefined)
      
      inline def setView(value: ICanvas): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
      
      inline def setViewUndefined: Self = StObject.set(x, "view", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
}
