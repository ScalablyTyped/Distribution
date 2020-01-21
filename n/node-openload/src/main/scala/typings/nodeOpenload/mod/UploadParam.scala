package typings.nodeOpenload.mod

import typings.std.ArrayBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UploadParam extends js.Object {
  var contentType: js.UndefOr[String] = js.undefined
  var file: String | ArrayBuffer
  var filename: js.UndefOr[String] = js.undefined
  var folder: js.UndefOr[String] = js.undefined
}

object UploadParam {
  @scala.inline
  def apply(
    file: String | ArrayBuffer,
    contentType: String = null,
    filename: String = null,
    folder: String = null
  ): UploadParam = {
    val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any])
    if (contentType != null) __obj.updateDynamic("contentType")(contentType.asInstanceOf[js.Any])
    if (filename != null) __obj.updateDynamic("filename")(filename.asInstanceOf[js.Any])
    if (folder != null) __obj.updateDynamic("folder")(folder.asInstanceOf[js.Any])
    __obj.asInstanceOf[UploadParam]
  }
}

