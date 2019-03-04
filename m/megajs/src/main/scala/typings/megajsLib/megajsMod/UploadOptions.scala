package typings
package megajsLib.megajsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UploadOptions extends js.Object {
  var attributes: js.UndefOr[js.Object] = js.undefined
  var name: java.lang.String
  var previewImage: js.UndefOr[nodeLib.Buffer | nodeLib.streamMod.Readable] = js.undefined
  var size: js.UndefOr[js.Any] = js.undefined
  var thumbnailImage: js.UndefOr[nodeLib.Buffer | nodeLib.streamMod.Readable] = js.undefined
}

object UploadOptions {
  @scala.inline
  def apply(
    name: java.lang.String,
    attributes: js.Object = null,
    previewImage: nodeLib.Buffer | nodeLib.streamMod.Readable = null,
    size: js.Any = null,
    thumbnailImage: nodeLib.Buffer | nodeLib.streamMod.Readable = null
  ): UploadOptions = {
    val __obj = js.Dynamic.literal(name = name)
    if (attributes != null) __obj.updateDynamic("attributes")(attributes)
    if (previewImage != null) __obj.updateDynamic("previewImage")(previewImage.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size)
    if (thumbnailImage != null) __obj.updateDynamic("thumbnailImage")(thumbnailImage.asInstanceOf[js.Any])
    __obj.asInstanceOf[UploadOptions]
  }
}

