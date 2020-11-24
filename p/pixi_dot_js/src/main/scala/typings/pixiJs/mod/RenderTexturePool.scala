package typings.pixiJs.mod

import typings.pixiJs.anon.ScaleMode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Experimental!
  *
  * Texture pool, used by FilterSystem and plugins
  * Stores collection of temporary pow2 or screen-sized renderTextures
  *
  * If you use custom RenderTexturePool for your filters, you can use methods
  * `getFilterTexture` and `returnFilterTexture` same as in
  *
  * @class
  * @memberof PIXI
  */
@JSImport("pixi.js", "RenderTexturePool")
@js.native
class RenderTexturePool ()
  extends typings.pixiJs.PIXI.RenderTexturePool {
  def this(textureOptions: ScaleMode) = this()
}
/* static members */
@JSImport("pixi.js", "RenderTexturePool")
@js.native
object RenderTexturePool extends js.Object {
  
  /**
    * Key that is used to store fullscreen renderTextures in a pool
    *
    * @static
    * @const {string}
    */
  val SCREEN_KEY: String = js.native
}
