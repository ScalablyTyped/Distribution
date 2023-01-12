package typings.pixiCore

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
       with ISystem[BackgroundOptions, Null] {
    
    /* private */ var _backgroundColor: Any = js.native
    
    /* private */ var _backgroundColorRgba: Any = js.native
    
    /* private */ var _backgroundColorString: Any = js.native
    
    /**
      * The background color alpha. Setting this to 0 will make the canvas transparent.
      * @member {number}
      */
    def alpha: Double = js.native
    def alpha_=(value: Double): Unit = js.native
    
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
      * The background color to fill if not transparent
      * @member {number}
      */
    def color: Double = js.native
    
    /**
      * The background color as an [R, G, B, A] array.
      * @member {number[]}
      * @protected
      */
    def colorRgba: js.Array[Double] = js.native
    
    /**
      * The background color as a string.
      * @member {string}
      * @protected
      */
    def colorString: String = js.native
    
    def color_=(value: Double): Unit = js.native
    
    @JSName("destroy")
    def destroy_MBackgroundSystem(): Unit = js.native
    
    /**
      * initiates the background system
      * @param {BackgroundOptions} options - the options for the background colors
      */
    @JSName("init")
    def init_MBackgroundSystem(options: BackgroundOptions): Unit = js.native
  }
  /* static members */
  object BackgroundSystem {
    
    /** @ignore */
    @JSImport("@pixi/core/lib/background/BackgroundSystem", "BackgroundSystem.extension")
    @js.native
    val `extension`: ExtensionMetadata = js.native
  }
  
  trait BackgroundOptions extends StObject {
    
    /** the main canvas background alpha. From 0 (fully transparent) to 1 (fully opaque). */
    var alpha: Double
    
    /** sets if the renderer will clear the canvas or not before the new render pass. */
    var clearBeforeRender: Boolean
    
    /** the main canvas background color. */
    var color: Double | String
  }
  object BackgroundOptions {
    
    inline def apply(alpha: Double, clearBeforeRender: Boolean, color: Double | String): BackgroundOptions = {
      val __obj = js.Dynamic.literal(alpha = alpha.asInstanceOf[js.Any], clearBeforeRender = clearBeforeRender.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any])
      __obj.asInstanceOf[BackgroundOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BackgroundOptions] (val x: Self) extends AnyVal {
      
      inline def setAlpha(value: Double): Self = StObject.set(x, "alpha", value.asInstanceOf[js.Any])
      
      inline def setClearBeforeRender(value: Boolean): Self = StObject.set(x, "clearBeforeRender", value.asInstanceOf[js.Any])
      
      inline def setColor(value: Double | String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    }
  }
}
