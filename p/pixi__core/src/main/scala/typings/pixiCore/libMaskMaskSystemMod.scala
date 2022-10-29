package typings.pixiCore

import typings.pixiCore.libFiltersSpriteMaskSpriteMaskFilterMod.SpriteMaskFilter
import typings.pixiCore.libMaskMaskDataMod.IMaskTarget
import typings.pixiCore.libMaskMaskDataMod.MaskData
import typings.pixiCore.libRendererMod.Renderer
import typings.pixiCore.libSystemIsystemMod.ISystem
import typings.pixiExtensions.mod.ExtensionMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libMaskMaskSystemMod {
  
  @JSImport("@pixi/core/lib/mask/MaskSystem", "MaskSystem")
  @js.native
  open class MaskSystem protected ()
    extends StObject
       with ISystem[Null, Null] {
    /**
      * @param renderer - The renderer this System works for.
      */
    def this(renderer: Renderer) = this()
    
    /**
      * Current index of alpha mask pool.
      * @default 0
      * @readonly
      */
    /* protected */ var alphaMaskIndex: Double = js.native
    
    /** Pool of used sprite mask filters. */
    /* protected */ val alphaMaskPool: js.Array[js.Array[SpriteMaskFilter]] = js.native
    
    @JSName("destroy")
    def destroy_MMaskSystem(): Unit = js.native
    
    /**
      * Sets type of MaskData based on its maskObject.
      * @param maskData
      */
    def detect(maskData: MaskData): Unit = js.native
    
    /**
      * Flag to enable scissor masking.
      * @default true
      */
    var enableScissor: Boolean = js.native
    
    /** Pool of mask data. */
    /* private */ val maskDataPool: Any = js.native
    
    /* private */ var maskStack: Any = js.native
    
    /**
      * Removes the last mask from the mask stack and doesn't return it.
      *
      * NOTE: The batch renderer should be flushed beforehand to render the masked contents before the mask is removed.
      * @param {PIXI.IMaskTarget} target - Display Object to pop the mask from
      */
    def pop(target: IMaskTarget): Unit = js.native
    
    /**
      * Pops the color mask.
      * @param maskData - The mask data
      */
    def popColorMask(maskData: MaskData): Unit = js.native
    
    /**
      * Removes the last filter from the filter stack and doesn't return it.
      * @param maskData - Sprite to be used as the mask.
      */
    def popSpriteMask(maskData: MaskData): Unit = js.native
    
    def push(target: IMaskTarget, maskDataOrTarget: IMaskTarget): Unit = js.native
    /**
      * Enables the mask and appends it to the current mask stack.
      *
      * NOTE: The batch renderer should be flushed beforehand to prevent pending renders from being masked.
      * @param {PIXI.DisplayObject} target - Display Object to push the mask to
      * @param {PIXI.MaskData|PIXI.Sprite|PIXI.Graphics|PIXI.DisplayObject} maskDataOrTarget - The masking data.
      */
    def push(target: IMaskTarget, maskDataOrTarget: MaskData): Unit = js.native
    
    /**
      * Pushes the color mask.
      * @param maskData - The mask data
      */
    def pushColorMask(maskData: MaskData): Unit = js.native
    
    /**
      * Applies the Mask and adds it to the current filter stack.
      * @param maskData - Sprite to be used as the mask.
      */
    def pushSpriteMask(maskData: MaskData): Unit = js.native
    
    /* private */ var renderer: Any = js.native
    
    /**
      * Changes the mask stack that is used by this System.
      * @param maskStack - The mask stack
      */
    def setMaskStack(maskStack: js.Array[MaskData]): Unit = js.native
  }
  /* static members */
  object MaskSystem {
    
    /** @ignore */
    @JSImport("@pixi/core/lib/mask/MaskSystem", "MaskSystem.extension")
    @js.native
    val `extension`: ExtensionMetadata = js.native
  }
}
