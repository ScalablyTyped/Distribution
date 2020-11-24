package typings.pixiJs.global.PIXI.resources

import typings.std.ImageBitmap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Resource type for ImageBitmap.
  * @class
  * @extends PIXI.resources.BaseImageResource
  * @memberof PIXI.resources
  * @param {ImageBitmap} source - Image element to use
  */
@JSGlobal("PIXI.resources.ImageBitmapResource")
@js.native
class ImageBitmapResource protected ()
  extends typings.pixiJs.PIXI.resources.ImageBitmapResource {
  def this(source: ImageBitmap) = this()
}
/* static members */
@JSGlobal("PIXI.resources.ImageBitmapResource")
@js.native
object ImageBitmapResource extends js.Object {
  
  /**
    * Used to auto-detect the type of resource.
    *
    * @static
    * @param {ImageBitmap} source - The source object
    * @return {boolean} `true` if source is an ImageBitmap
    */
  def test(source: ImageBitmap): Boolean = js.native
}
