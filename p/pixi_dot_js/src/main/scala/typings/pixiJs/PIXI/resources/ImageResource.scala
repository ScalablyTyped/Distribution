package typings.pixiJs.PIXI.resources

import typings.pixiJs.PIXI.ALPHA_MODES
import typings.std.ImageBitmap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Resource type for HTMLImageElement.
  * @class
  * @extends PIXI.resources.BaseImageResource
  * @memberof PIXI.resources
  */
@js.native
trait ImageResource extends BaseImageResource {
  /**
    * Controls texture alphaMode field
    * Copies from options
    * Default is `null`, copies option from baseTexture
    *
    * @member {PIXI.ALPHA_MODES|null} PIXI.resources.ImageResource#alphaMode
    * @readonly
    */
  val alphaMode: ALPHA_MODES | Null = js.native
  /**
    * The ImageBitmap element created for HTMLImageElement
    * @member {ImageBitmap} PIXI.resources.ImageResource#bitmap
    * @default null
    */
  var bitmap: ImageBitmap = js.native
  /**
    * If capable, convert the image using createImageBitmap API
    * @member {boolean} PIXI.resources.ImageResource#createBitmap
    * @default PIXI.settings.CREATE_IMAGE_BITMAP
    */
  var createBitmap: Boolean = js.native
  /**
    * If the image should be disposed after upload
    * @member {boolean} PIXI.resources.ImageResource#preserveBitmap
    * @default false
    */
  var preserveBitmap: Boolean = js.native
  /**
    * URL of the image source
    * @member {string} PIXI.resources.ImageResource#url
    */
  var url: String = js.native
  def load(createBitmap: Boolean): js.Promise[Unit] = js.native
  /**
    * Called when we need to convert image into BitmapImage.
    * Can be called multiple times, real promise is cached inside.
    *
    * @returns {Promise<void>} cached promise to fill that bitmap
    */
  def process(): js.Promise[Unit] = js.native
}

