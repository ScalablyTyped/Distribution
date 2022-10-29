package typings.pixiCore

import typings.pixiConstants.mod.MSAA_QUALITY
import typings.pixiCore.libFramebufferFramebufferMod.Framebuffer
import typings.pixiCore.libRenderTextureBaseRenderTextureMod.BaseRenderTexture
import typings.pixiCore.libTexturesBaseTextureMod.IBaseTextureOptions
import typings.pixiCore.libTexturesResourcesResourceMod.Resource
import typings.pixiCore.libTexturesTextureMod.Texture
import typings.pixiMath.mod.Rectangle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libRenderTextureRenderTextureMod {
  
  @JSImport("@pixi/core/lib/renderTexture/RenderTexture", "RenderTexture")
  @js.native
  open class RenderTexture protected () extends Texture[Resource] {
    /**
      * @param baseRenderTexture - The base texture object that this texture uses.
      * @param frame - The rectangle frame of the texture to show.
      */
    def this(baseRenderTexture: BaseRenderTexture) = this()
    def this(baseRenderTexture: BaseRenderTexture, frame: Rectangle) = this()
    
    @JSName("baseTexture")
    var baseTexture_RenderTexture: BaseRenderTexture = js.native
    
    /**
      * Stores `sourceFrame` when this texture is inside current filter stack.
      *
      * You can read it inside filters.
      * @readonly
      */
    var filterFrame: Rectangle | Null = js.native
    
    /**
      * The key for pooled texture of FilterSystem.
      * @see PIXI.RenderTexturePool
      */
    var filterPoolKey: String | Double | Null = js.native
    
    /**
      * Shortcut to `this.baseTexture.framebuffer`, saves baseTexture cast.
      * @readonly
      */
    def framebuffer: Framebuffer = js.native
    
    /**
      * Shortcut to `this.framebuffer.multisample`.
      * @default PIXI.MSAA_QUALITY.NONE
      */
    def multisample: MSAA_QUALITY = js.native
    def multisample_=(value: MSAA_QUALITY): Unit = js.native
    
    /**
      * Resizes the RenderTexture.
      * @param desiredWidth - The desired width to resize to.
      * @param desiredHeight - The desired height to resize to.
      * @param resizeBaseTexture - Should the baseTexture.width and height values be resized as well?
      */
    def resize(desiredWidth: Double, desiredHeight: Double): Unit = js.native
    def resize(desiredWidth: Double, desiredHeight: Double, resizeBaseTexture: Boolean): Unit = js.native
    
    /**
      * Changes the resolution of baseTexture, but does not change framebuffer size.
      * @param resolution - The new resolution to apply to RenderTexture
      */
    def setResolution(resolution: Double): Unit = js.native
  }
  /* static members */
  object RenderTexture {
    
    @JSImport("@pixi/core/lib/renderTexture/RenderTexture", "RenderTexture")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * A short hand way of creating a render texture.
      * @param options - Options
      * @param {number} [options.width=100] - The width of the render texture
      * @param {number} [options.height=100] - The height of the render texture
      * @param {PIXI.SCALE_MODES} [options.scaleMode=PIXI.settings.SCALE_MODE] - See {@link PIXI.SCALE_MODES}
      *    for possible values
      * @param {number} [options.resolution=PIXI.settings.RESOLUTION] - The resolution / device pixel ratio of the texture
      *    being generated
      * @param {PIXI.MSAA_QUALITY} [options.multisample=PIXI.MSAA_QUALITY.NONE] - The number of samples of the frame buffer
      * @returns The new render texture
      */
    inline def create(): RenderTexture = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[RenderTexture]
    inline def create(options: IBaseTextureOptions[Any]): RenderTexture = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(options.asInstanceOf[js.Any]).asInstanceOf[RenderTexture]
  }
}
