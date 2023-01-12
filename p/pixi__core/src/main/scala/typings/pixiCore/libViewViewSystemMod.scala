package typings.pixiCore

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
       with ISystem[ViewOptions, Boolean] {
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
    def init_MViewSystem(options: ViewOptions): Unit = js.native
    
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
    
    /** @ignore */
    @JSImport("@pixi/core/lib/view/ViewSystem", "ViewSystem.extension")
    @js.native
    val `extension`: ExtensionMetadata = js.native
  }
  
  trait ViewOptions extends StObject {
    
    /** Resizes renderer view in CSS pixels to allow for resolutions other than 1. */
    var autoDensity: js.UndefOr[Boolean] = js.undefined
    
    /** The height of the screen. */
    var height: Double
    
    /** The resolution / device pixel ratio of the renderer. */
    var resolution: js.UndefOr[Double] = js.undefined
    
    /** The canvas to use as a view, optional. */
    var view: js.UndefOr[ICanvas] = js.undefined
    
    /** The width of the screen. */
    var width: Double
  }
  object ViewOptions {
    
    inline def apply(height: Double, width: Double): ViewOptions = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[ViewOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ViewOptions] (val x: Self) extends AnyVal {
      
      inline def setAutoDensity(value: Boolean): Self = StObject.set(x, "autoDensity", value.asInstanceOf[js.Any])
      
      inline def setAutoDensityUndefined: Self = StObject.set(x, "autoDensity", js.undefined)
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setResolution(value: Double): Self = StObject.set(x, "resolution", value.asInstanceOf[js.Any])
      
      inline def setResolutionUndefined: Self = StObject.set(x, "resolution", js.undefined)
      
      inline def setView(value: ICanvas): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
      
      inline def setViewUndefined: Self = StObject.set(x, "view", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
}
