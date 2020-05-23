package typings.phonegap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FileUploadOptions extends js.Object {
  var chunkedMode: js.UndefOr[Boolean] = js.undefined
  var fileKey: js.UndefOr[String] = js.undefined
  var fileName: js.UndefOr[String] = js.undefined
  var headers: js.UndefOr[js.Any] = js.undefined
  var mimeType: js.UndefOr[String] = js.undefined
  var params: js.UndefOr[js.Any] = js.undefined
}

object FileUploadOptions {
  @scala.inline
  def apply(
    chunkedMode: js.UndefOr[Boolean] = js.undefined,
    fileKey: String = null,
    fileName: String = null,
    headers: js.Any = null,
    mimeType: String = null,
    params: js.Any = null
  ): FileUploadOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(chunkedMode)) __obj.updateDynamic("chunkedMode")(chunkedMode.get.asInstanceOf[js.Any])
    if (fileKey != null) __obj.updateDynamic("fileKey")(fileKey.asInstanceOf[js.Any])
    if (fileName != null) __obj.updateDynamic("fileName")(fileName.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (mimeType != null) __obj.updateDynamic("mimeType")(mimeType.asInstanceOf[js.Any])
    if (params != null) __obj.updateDynamic("params")(params.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileUploadOptions]
  }
}

