package typings.pixiCore.mod

import typings.pixiCore.libTexturesBaseTextureMod.IBaseTextureOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pixi/core", "RenderTexture")
@js.native
open class RenderTexture protected ()
  extends typings.pixiCore.libRenderTextureRenderTextureMod.RenderTexture {
  /**
    * @param baseRenderTexture - The base texture object that this texture uses.
    * @param frame - The rectangle frame of the texture to show.
    */
  def this(baseRenderTexture: typings.pixiCore.libRenderTextureBaseRenderTextureMod.BaseRenderTexture) = this()
  def this(
    baseRenderTexture: typings.pixiCore.libRenderTextureBaseRenderTextureMod.BaseRenderTexture,
    frame: typings.pixiMath.mod.Rectangle
  ) = this()
}
/* static members */
object RenderTexture {
  
  @JSImport("@pixi/core", "RenderTexture")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * A short hand way of creating a render texture.
    * @param options - Options
    * @param {number} [options.width=100] - The width of the render texture
    * @param {number} [options.height=100] - The height of the render texture
    * @param {PIXI.SCALE_MODES} [options.scaleMode=PIXI.BaseTexture.defaultOptions.scaleMode] - See {@link PIXI.SCALE_MODES}
    *    for possible values
    * @param {number} [options.resolution=PIXI.settings.RESOLUTION] - The resolution / device pixel ratio of the texture
    *    being generated
    * @param {PIXI.MSAA_QUALITY} [options.multisample=PIXI.MSAA_QUALITY.NONE] - The number of samples of the frame buffer
    * @returns The new render texture
    */
  inline def create(): typings.pixiCore.libRenderTextureRenderTextureMod.RenderTexture = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[typings.pixiCore.libRenderTextureRenderTextureMod.RenderTexture]
  inline def create(options: IBaseTextureOptions[Any]): typings.pixiCore.libRenderTextureRenderTextureMod.RenderTexture = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(options.asInstanceOf[js.Any]).asInstanceOf[typings.pixiCore.libRenderTextureRenderTextureMod.RenderTexture]
}
