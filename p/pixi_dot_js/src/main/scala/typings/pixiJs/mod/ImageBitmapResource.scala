package typings.pixiJs.mod

import typings.std.ImageBitmap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("pixi.js", "ImageBitmapResource")
@js.native
open class ImageBitmapResource protected ()
  extends typings.pixiCore.mod.ImageBitmapResource {
  /**
    * @param source - Image element to use
    */
  def this(source: ImageBitmap) = this()
}
/* static members */
object ImageBitmapResource {
  
  @JSImport("pixi.js", "ImageBitmapResource")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Used to auto-detect the type of resource.
    * @param {*} source - The source object
    * @returns {boolean} `true` if source is an ImageBitmap
    */
  inline def test(source: Any): /* is std.ImageBitmap */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("test")(source.asInstanceOf[js.Any]).asInstanceOf[/* is std.ImageBitmap */ Boolean]
}
