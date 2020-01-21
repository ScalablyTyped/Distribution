package typings.ngCordova.ngCordova

import typings.cordovaPluginFileTransfer.FileUploadOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IFileUploadOptions extends FileUploadOptions {
  var encodeURI: js.UndefOr[Boolean] = js.undefined
  var timeout: js.UndefOr[Double] = js.undefined
}

object IFileUploadOptions {
  @scala.inline
  def apply(
    chunkedMode: js.UndefOr[Boolean] = js.undefined,
    encodeURI: js.UndefOr[Boolean] = js.undefined,
    fileKey: String = null,
    fileName: String = null,
    headers: js.Object = null,
    httpMethod: String = null,
    mimeType: String = null,
    params: js.Object = null,
    timeout: Int | Double = null
  ): IFileUploadOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(chunkedMode)) __obj.updateDynamic("chunkedMode")(chunkedMode.asInstanceOf[js.Any])
    if (!js.isUndefined(encodeURI)) __obj.updateDynamic("encodeURI")(encodeURI.asInstanceOf[js.Any])
    if (fileKey != null) __obj.updateDynamic("fileKey")(fileKey.asInstanceOf[js.Any])
    if (fileName != null) __obj.updateDynamic("fileName")(fileName.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (httpMethod != null) __obj.updateDynamic("httpMethod")(httpMethod.asInstanceOf[js.Any])
    if (mimeType != null) __obj.updateDynamic("mimeType")(mimeType.asInstanceOf[js.Any])
    if (params != null) __obj.updateDynamic("params")(params.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[IFileUploadOptions]
  }
}

