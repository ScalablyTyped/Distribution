package typings.pixiCore

import typings.pixiColor.libColorMod.ColorSource
import typings.pixiColor.mod.Color
import typings.pixiCore.libFramebufferFramebufferMod.Framebuffer
import typings.pixiCore.libMaskMaskDataMod.MaskData
import typings.pixiCore.libTexturesBaseTextureMod.BaseTexture
import typings.pixiCore.libTexturesBaseTextureMod.IBaseTextureOptions
import typings.pixiCore.libTexturesResourcesAutoDetectResourceMod.IAutoDetectOptions
import typings.pixiCore.libTexturesResourcesResourceMod.Resource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libRenderTextureBaseRenderTextureMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify GlobalMixins.BaseRenderTexture * / any */ @JSImport("@pixi/core/lib/renderTexture/BaseRenderTexture", "BaseRenderTexture")
  @js.native
  /**
    * @param options
    * @param {number} [options.width=100] - The width of the base render texture.
    * @param {number} [options.height=100] - The height of the base render texture.
    * @param {PIXI.SCALE_MODES} [options.scaleMode=PIXI.BaseTexture.defaultOptions.scaleMode] - See {@link PIXI.SCALE_MODES}
    *   for possible values.
    * @param {number} [options.resolution=PIXI.settings.RESOLUTION] - The resolution / device pixel ratio
    *   of the texture being generated.
    * @param {PIXI.MSAA_QUALITY} [options.multisample=PIXI.MSAA_QUALITY.NONE] - The number of samples of the frame buffer.
    */
  open class BaseRenderTexture () extends BaseTexture[Resource, IAutoDetectOptions] {
    def this(options: IBaseTextureOptions[Any]) = this()
    
    var _clear: Color = js.native
    
    /**
      * Color object when clearning the texture.
      * @readonly
      * @since 7.2.0
      */
    def clear: Color = js.native
    
    def clearColor: ColorSource = js.native
    /** Color when clearning the texture. */
    def clearColor_=(value: ColorSource): Unit = js.native
    
    /** The data structure for the filters. */
    var filterStack: js.Array[Any] = js.native
    
    var framebuffer: Framebuffer = js.native
    
    /** The data structure for the stencil masks. */
    var maskStack: js.Array[MaskData] = js.native
    
    /**
      * Resizes the BaseRenderTexture.
      * @param desiredWidth - The desired width to resize to.
      * @param desiredHeight - The desired height to resize to.
      */
    def resize(desiredWidth: Double, desiredHeight: Double): Unit = js.native
  }
}
