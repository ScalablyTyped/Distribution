package typings.pixiJs.mod

import typings.pixiCore.libTexturesResourcesImageResourceMod.IImageResourceOptions
import typings.std.HTMLImageElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("pixi.js", "ImageResource")
@js.native
open class ImageResource protected ()
  extends typings.pixiCore.mod.ImageResource {
  def this(source: String) = this()
  /**
    * @param source - image source or URL
    * @param options
    * @param {boolean} [options.autoLoad=true] - start loading process
    * @param {boolean} [options.createBitmap=PIXI.settings.CREATE_IMAGE_BITMAP] - whether its required to create
    *        a bitmap before upload
    * @param {boolean} [options.crossorigin=true] - Load image using cross origin
    * @param {PIXI.ALPHA_MODES} [options.alphaMode=PIXI.ALPHA_MODES.UNPACK] - Premultiply image alpha in bitmap
    */
  def this(source: HTMLImageElement) = this()
  def this(source: String, options: IImageResourceOptions) = this()
  def this(source: HTMLImageElement, options: IImageResourceOptions) = this()
}
/* static members */
object ImageResource {
  
  @JSImport("pixi.js", "ImageResource")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Used to auto-detect the type of resource.
    * @param {*} source - The source object
    * @returns {boolean} `true` if current environment support HTMLImageElement, and source is string or HTMLImageElement
    */
  inline def test(source: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("test")(source.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
