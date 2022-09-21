package typings.pixiCore.mod

import org.scalablytyped.runtime.TopLevel
import typings.pixiConstants.mod.MSAA_QUALITY
import typings.pixiMath.mod.ISize
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pixi/core", "RenderTexturePool")
@js.native
/**
  * @param textureOptions - options that will be passed to BaseRenderTexture constructor
  * @param {PIXI.SCALE_MODES} [textureOptions.scaleMode] - See {@link PIXI.SCALE_MODES} for possible values.
  */
open class RenderTexturePool () extends StObject {
  def this(textureOptions: IBaseTextureOptions[Any]) = this()
  
  /* private */ var _pixelsHeight: Any = js.native
  
  /* private */ var _pixelsWidth: Any = js.native
  
  /**
    * Clears the pool.
    * @param destroyTextures - Destroy all stored textures.
    */
  def clear(): Unit = js.native
  def clear(destroyTextures: Boolean): Unit = js.native
  
  /**
    * Creates texture with params that were specified in pool constructor.
    * @param realWidth - Width of texture in pixels.
    * @param realHeight - Height of texture in pixels.
    * @param multisample - Number of samples of the framebuffer.
    */
  def createTexture(realWidth: Double, realHeight: Double): RenderTexture = js.native
  def createTexture(realWidth: Double, realHeight: Double, multisample: MSAA_QUALITY): RenderTexture = js.native
  
  /**
    * Allow renderTextures of the same size as screen, not just pow2
    *
    * Automatically sets to true after `setScreenSize`
    * @default false
    */
  var enableFullScreen: Boolean = js.native
  
  /**
    * Gets extra texture of the same size as input renderTexture
    *
    * `getFilterTexture(input, 0.5)` or `getFilterTexture(0.5, input)`
    * @param input - renderTexture from which size and resolution will be copied
    * @param resolution - override resolution of the renderTexture
    *  It overrides, it does not multiply
    * @param multisample - number of samples of the renderTexture
    */
  def getFilterTexture(input: RenderTexture): RenderTexture = js.native
  def getFilterTexture(input: RenderTexture, resolution: Double): RenderTexture = js.native
  def getFilterTexture(input: RenderTexture, resolution: Double, multisample: MSAA_QUALITY): RenderTexture = js.native
  def getFilterTexture(input: RenderTexture, resolution: Unit, multisample: MSAA_QUALITY): RenderTexture = js.native
  
  /**
    * Gets a Power-of-Two render texture or fullScreen texture
    * @param minWidth - The minimum width of the render texture.
    * @param minHeight - The minimum height of the render texture.
    * @param resolution - The resolution of the render texture.
    * @param multisample - Number of samples of the render texture.
    * @returns The new render texture.
    */
  def getOptimalTexture(minWidth: Double, minHeight: Double): RenderTexture = js.native
  def getOptimalTexture(minWidth: Double, minHeight: Double, resolution: Double): RenderTexture = js.native
  def getOptimalTexture(minWidth: Double, minHeight: Double, resolution: Double, multisample: MSAA_QUALITY): RenderTexture = js.native
  def getOptimalTexture(minWidth: Double, minHeight: Double, resolution: Unit, multisample: MSAA_QUALITY): RenderTexture = js.native
  
  /**
    * Alias for returnTexture, to be compliant with FilterSystem interface.
    * @param renderTexture - The renderTexture to free
    */
  def returnFilterTexture(renderTexture: RenderTexture): Unit = js.native
  
  /**
    * Place a render texture back into the pool.
    * @param renderTexture - The renderTexture to free
    */
  def returnTexture(renderTexture: RenderTexture): Unit = js.native
  
  /**
    * If screen size was changed, drops all screen-sized textures,
    * sets new screen size, sets `enableFullScreen` to true
    *
    * Size is measured in pixels, `renderer.view` can be passed here, not `renderer.screen`
    * @param size - Initial size of screen.
    */
  def setScreenSize(size: ISize): Unit = js.native
  
  var textureOptions: IBaseTextureOptions[Any] = js.native
  
  var texturePool: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ x in string | number ]: std.Array<@pixi/core.@pixi/core.RenderTexture>}
    */ typings.pixiCore.pixiCoreStrings.RenderTexturePool & TopLevel[Any] = js.native
}
/* static members */
object RenderTexturePool {
  
  @JSImport("@pixi/core", "RenderTexturePool")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Key that is used to store fullscreen renderTextures in a pool
    * @constant
    */
  @JSImport("@pixi/core", "RenderTexturePool.SCREEN_KEY")
  @js.native
  def SCREEN_KEY: Double = js.native
  inline def SCREEN_KEY_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SCREEN_KEY")(x.asInstanceOf[js.Any])
}
