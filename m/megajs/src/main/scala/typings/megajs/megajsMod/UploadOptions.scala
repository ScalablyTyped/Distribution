package typings.megajs.megajsMod

import typings.node.Buffer
import typings.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UploadOptions extends js.Object {
  var attributes: js.UndefOr[js.Object] = js.undefined
  var name: String
  var previewImage: js.UndefOr[Buffer | Readable] = js.undefined
  var size: js.UndefOr[js.Any] = js.undefined
  var thumbnailImage: js.UndefOr[Buffer | Readable] = js.undefined
}

object UploadOptions {
  @scala.inline
  def apply(
    name: String,
    attributes: js.Object = null,
    previewImage: Buffer | Readable = null,
    size: js.Any = null,
    thumbnailImage: Buffer | Readable = null
  ): UploadOptions = {
    val __obj = js.Dynamic.literal(name = name)
    if (attributes != null) __obj.updateDynamic("attributes")(attributes)
    if (previewImage != null) __obj.updateDynamic("previewImage")(previewImage.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size)
    if (thumbnailImage != null) __obj.updateDynamic("thumbnailImage")(thumbnailImage.asInstanceOf[js.Any])
    __obj.asInstanceOf[UploadOptions]
  }
}

