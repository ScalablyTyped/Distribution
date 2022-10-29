package typings.pixiCore

import typings.pixiCore.libMaskMaskDataMod.MaskData
import typings.pixiCore.libRendererMod.Renderer
import typings.pixiCore.libSystemIsystemMod.ISystem
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libMaskAbstractMaskSystemMod {
  
  @JSImport("@pixi/core/lib/mask/AbstractMaskSystem", "AbstractMaskSystem")
  @js.native
  open class AbstractMaskSystem protected ()
    extends StObject
       with ISystem[Null, Null] {
    /**
      * @param renderer - The renderer this System works for.
      */
    def this(renderer: Renderer) = this()
    
    /**
      * Setup renderer to use the current mask data.
      * @private
      */
    /* protected */ def _useCurrent(): Unit = js.native
    
    /** Destroys the mask stack. */
    @JSName("destroy")
    def destroy_MAbstractMaskSystem(): Unit = js.native
    
    /** Gets count of masks of certain type. */
    def getStackLength(): Double = js.native
    
    /**
      * Constant for gl.enable
      * @private
      */
    /* protected */ var glConst: Double = js.native
    
    /**
      * The mask stack
      * @member {PIXI.MaskData[]}
      */
    /* protected */ var maskStack: js.Array[MaskData] = js.native
    
    /* protected */ var renderer: Renderer = js.native
    
    /**
      * Changes the mask stack that is used by this System.
      * @param {PIXI.MaskData[]} maskStack - The mask stack
      */
    def setMaskStack(maskStack: js.Array[MaskData]): Unit = js.native
  }
}
