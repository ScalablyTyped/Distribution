package typings.pixiCore

import typings.pixiCore.libMaskAbstractMaskSystemMod.AbstractMaskSystem
import typings.pixiCore.libMaskMaskDataMod.MaskData
import typings.pixiCore.libRendererMod.Renderer
import typings.pixiExtensions.mod.ExtensionMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libMaskScissorSystemMod {
  
  @JSImport("@pixi/core/lib/mask/ScissorSystem", "ScissorSystem")
  @js.native
  open class ScissorSystem protected () extends AbstractMaskSystem {
    /**
      * @param {PIXI.Renderer} renderer - The renderer this System works for.
      */
    def this(renderer: Renderer) = this()
    
    /**
      * evaluates _boundsTransformed, _scissorRect for MaskData
      * @param maskData
      */
    def calcScissorRect(maskData: MaskData): Unit = js.native
    
    /**
      * This should be called after a mask is popped off the mask stack. It will rebind the scissor box to be latest with the
      * last mask in the stack.
      *
      * This can also be called when you directly modify the scissor box and want to restore PixiJS state.
      * @param maskData - The mask data.
      */
    def pop(): Unit = js.native
    def pop(maskData: MaskData): Unit = js.native
    
    /**
      * Applies the Mask and adds it to the current stencil stack.
      * @author alvin
      * @param maskData - The mask data.
      */
    def push(maskData: MaskData): Unit = js.native
    
    /* private */ var roundFrameToPixels: Any = js.native
    
    /**
      * Test, whether the object can be scissor mask with current renderer projection.
      * Calls "calcScissorRect()" if its true.
      * @param maskData - mask data
      * @returns whether Whether the object can be scissor mask
      */
    def testScissor(maskData: MaskData): Boolean = js.native
  }
  /* static members */
  object ScissorSystem {
    
    @JSImport("@pixi/core/lib/mask/ScissorSystem", "ScissorSystem")
    @js.native
    val ^ : js.Any = js.native
    
    /** @ignore */
    @JSImport("@pixi/core/lib/mask/ScissorSystem", "ScissorSystem.extension")
    @js.native
    val `extension`: ExtensionMetadata = js.native
    
    @JSImport("@pixi/core/lib/mask/ScissorSystem", "ScissorSystem.isMatrixRotated")
    @js.native
    def isMatrixRotated: Any = js.native
    inline def isMatrixRotated_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isMatrixRotated")(x.asInstanceOf[js.Any])
  }
}
