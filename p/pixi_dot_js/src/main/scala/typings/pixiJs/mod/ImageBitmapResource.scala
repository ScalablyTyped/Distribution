package typings.pixiJs.mod

import typings.pixiCore.libTexturesResourcesImageBitmapResourceMod.IImageBitmapResourceOptions
import typings.std.ImageBitmap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("pixi.js", "ImageBitmapResource")
@js.native
open class ImageBitmapResource protected ()
  extends typings.pixiCore.mod.ImageBitmapResource {
  def this(source: String) = this()
  /**
    * @param source - ImageBitmap or URL to use
    * @param options
    * @param {boolean} [options.autoLoad=true] - Start loading process automatically when constructed.
    * @param {boolean} [options.crossOrigin=true] - Load image using cross origin.
    * @param {PIXI.ALPHA_MODES} [options.alphaMode=null] - Alpha mode used when creating the ImageBitmap.
    */
  def this(source: ImageBitmap) = this()
  def this(source: String, options: IImageBitmapResourceOptions) = this()
  def this(source: ImageBitmap, options: IImageBitmapResourceOptions) = this()
}
/* static members */
object ImageBitmapResource {
  
  @JSImport("pixi.js", "ImageBitmapResource")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Cached empty placeholder canvas.
    * @see EMPTY
    */
  @JSImport("pixi.js", "ImageBitmapResource._EMPTY")
  @js.native
  def _EMPTY: Any = js.native
  inline def _EMPTY_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_EMPTY")(x.asInstanceOf[js.Any])
  
  /**
    * Used to auto-detect the type of resource.
    * @param {*} source - The source object
    * @returns {boolean} `true` if current environment support ImageBitmap, and source is string or ImageBitmap
    */
  inline def test(source: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("test")(source.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
