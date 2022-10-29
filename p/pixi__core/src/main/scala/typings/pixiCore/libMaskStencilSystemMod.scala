package typings.pixiCore

import typings.pixiCore.libMaskAbstractMaskSystemMod.AbstractMaskSystem
import typings.pixiCore.libMaskMaskDataMod.IMaskTarget
import typings.pixiCore.libMaskMaskDataMod.MaskData
import typings.pixiCore.libRendererMod.Renderer
import typings.pixiExtensions.mod.ExtensionMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libMaskStencilSystemMod {
  
  @JSImport("@pixi/core/lib/mask/StencilSystem", "StencilSystem")
  @js.native
  open class StencilSystem protected () extends AbstractMaskSystem {
    /**
      * @param renderer - The renderer this System works for.
      */
    def this(renderer: Renderer) = this()
    
    /**
      * Pops stencil mask. MaskData is already removed from stack
      * @param {PIXI.DisplayObject} maskObject - object of popped mask data
      */
    def pop(maskObject: IMaskTarget): Unit = js.native
    
    /**
      * Applies the Mask and adds it to the current stencil stack.
      * @param maskData - The mask data
      */
    def push(maskData: MaskData): Unit = js.native
  }
  /* static members */
  object StencilSystem {
    
    /** @ignore */
    @JSImport("@pixi/core/lib/mask/StencilSystem", "StencilSystem.extension")
    @js.native
    val `extension`: ExtensionMetadata = js.native
  }
}
