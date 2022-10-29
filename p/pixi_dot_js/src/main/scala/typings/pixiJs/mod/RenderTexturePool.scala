package typings.pixiJs.mod

import typings.pixiCore.libTexturesBaseTextureMod.IBaseTextureOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("pixi.js", "RenderTexturePool")
@js.native
/**
  * @param textureOptions - options that will be passed to BaseRenderTexture constructor
  * @param {PIXI.SCALE_MODES} [textureOptions.scaleMode] - See {@link PIXI.SCALE_MODES} for possible values.
  */
open class RenderTexturePool ()
  extends typings.pixiCore.mod.RenderTexturePool {
  def this(textureOptions: IBaseTextureOptions[Any]) = this()
}
/* static members */
object RenderTexturePool {
  
  @JSImport("pixi.js", "RenderTexturePool")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Key that is used to store fullscreen renderTextures in a pool
    * @constant
    */
  @JSImport("pixi.js", "RenderTexturePool.SCREEN_KEY")
  @js.native
  def SCREEN_KEY: Double = js.native
  inline def SCREEN_KEY_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SCREEN_KEY")(x.asInstanceOf[js.Any])
}
