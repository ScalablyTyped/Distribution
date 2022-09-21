package typings.pixiCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pixi/core", "BaseRenderTexture")
@js.native
/**
  * @param options
  * @param {number} [options.width=100] - The width of the base render texture.
  * @param {number} [options.height=100] - The height of the base render texture.
  * @param {PIXI.SCALE_MODES} [options.scaleMode=PIXI.settings.SCALE_MODE] - See {@link PIXI.SCALE_MODES}
  *   for possible values.
  * @param {number} [options.resolution=PIXI.settings.RESOLUTION] - The resolution / device pixel ratio
  *   of the texture being generated.
  * @param {PIXI.MSAA_QUALITY} [options.multisample=PIXI.MSAA_QUALITY.NONE] - The number of samples of the frame buffer.
  */
open class BaseRenderTexture ()
  extends BaseTexture[Resource, IAutoDetectOptions]
     with typings.pixiCore.GlobalMixins.BaseRenderTexture {
  def this(options: IBaseTextureOptions[Any]) = this()
  
  var clearColor: js.Array[Double] = js.native
  
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
