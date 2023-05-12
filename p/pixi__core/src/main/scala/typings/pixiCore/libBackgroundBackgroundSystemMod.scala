package typings.pixiCore

import typings.pixiColor.libColorMod.ColorSource
import typings.pixiColor.mod.Color
import typings.pixiCore.libSystemIsystemMod.ISystem
import typings.pixiExtensions.mod.ExtensionMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libBackgroundBackgroundSystemMod {
  
  @JSImport("@pixi/core/lib/background/BackgroundSystem", "BackgroundSystem")
  @js.native
  open class BackgroundSystem ()
    extends StObject
       with ISystem[BackgroundSystemOptions, Null] {
    
    /** Reference to the internal color */
    /* private */ var _backgroundColor: Any = js.native
    
    /**
      * The background color alpha. Setting this to 0 will make the canvas transparent.
      * @member {number}
      */
    def alpha: Double = js.native
    def alpha_=(value: Double): Unit = js.native
    
    /** The background color object. */
    def backgroundColor: Color = js.native
    
    /**
      * This sets if the CanvasRenderer will clear the canvas or not before the new render pass.
      * If the scene is NOT transparent PixiJS will use a canvas sized fillRect operation every
      * frame to set the canvas background color. If the scene is transparent PixiJS will use clearRect
      * to clear the canvas every frame. Disable this by setting this to false. For example, if
      * your game has a canvas filling background image you often don't need this set.
      * @member {boolean}
      * @default
      */
    var clearBeforeRender: Boolean = js.native
    
    /**
      * The background color to fill if not transparent.
      * @member {PIXI.ColorSource}
      */
    def color: ColorSource = js.native
    def color_=(value: ColorSource): Unit = js.native
    
    @JSName("destroy")
    def destroy_MBackgroundSystem(): Unit = js.native
    
    /**
      * initiates the background system
      * @param {PIXI.IRendererOptions} options - the options for the background colors
      */
    @JSName("init")
    def init_MBackgroundSystem(options: BackgroundSystemOptions): Unit = js.native
  }
  /* static members */
  object BackgroundSystem {
    
    @JSImport("@pixi/core/lib/background/BackgroundSystem", "BackgroundSystem")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@pixi/core/lib/background/BackgroundSystem", "BackgroundSystem.defaultOptions")
    @js.native
    def defaultOptions: BackgroundSystemOptions = js.native
    inline def defaultOptions_=(x: BackgroundSystemOptions): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultOptions")(x.asInstanceOf[js.Any])
    
    /** @ignore */
    @JSImport("@pixi/core/lib/background/BackgroundSystem", "BackgroundSystem.extension")
    @js.native
    val `extension`: ExtensionMetadata = js.native
  }
  
  trait BackgroundSystemOptions extends StObject {
    
    /**
      * Alias for {@link PIXI.IRendererOptions.backgroundColor}
      * @memberof PIXI.IRendererOptions
      */
    var background: js.UndefOr[ColorSource] = js.undefined
    
    /**
      * Transparency of the background color, value from `0` (fully transparent) to `1` (fully opaque).
      * @memberof PIXI.IRendererOptions
      */
    var backgroundAlpha: Double
    
    /**
      * The background color used to clear the canvas. See {@link PIXI.ColorSource} for accepted color values.
      * @memberof PIXI.IRendererOptions
      */
    var backgroundColor: ColorSource
    
    /**
      * Whether to clear the canvas before new render passes.
      * @memberof PIXI.IRendererOptions
      */
    var clearBeforeRender: Boolean
  }
  object BackgroundSystemOptions {
    
    inline def apply(backgroundAlpha: Double, backgroundColor: ColorSource, clearBeforeRender: Boolean): BackgroundSystemOptions = {
      val __obj = js.Dynamic.literal(backgroundAlpha = backgroundAlpha.asInstanceOf[js.Any], backgroundColor = backgroundColor.asInstanceOf[js.Any], clearBeforeRender = clearBeforeRender.asInstanceOf[js.Any])
      __obj.asInstanceOf[BackgroundSystemOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BackgroundSystemOptions] (val x: Self) extends AnyVal {
      
      inline def setBackground(value: ColorSource): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
      
      inline def setBackgroundAlpha(value: Double): Self = StObject.set(x, "backgroundAlpha", value.asInstanceOf[js.Any])
      
      inline def setBackgroundColor(value: ColorSource): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
      
      inline def setBackgroundColorVarargs(value: Double*): Self = StObject.set(x, "backgroundColor", js.Array(value*))
      
      inline def setBackgroundUndefined: Self = StObject.set(x, "background", js.undefined)
      
      inline def setBackgroundVarargs(value: Double*): Self = StObject.set(x, "background", js.Array(value*))
      
      inline def setClearBeforeRender(value: Boolean): Self = StObject.set(x, "clearBeforeRender", value.asInstanceOf[js.Any])
    }
  }
  
  type BackgroundSytemOptions = BackgroundSystemOptions
}
