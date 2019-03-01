package typings
package ngDashCordovaLib.ngCordovaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IFileUploadOptions
  extends cordovaDashPluginDashFileDashTransferLib.FileUploadOptions {
  var encodeURI: js.UndefOr[scala.Boolean] = js.undefined
  var timeout: js.UndefOr[scala.Double] = js.undefined
}

object IFileUploadOptions {
  @scala.inline
  def apply(
    chunkedMode: js.UndefOr[scala.Boolean] = js.undefined,
    encodeURI: js.UndefOr[scala.Boolean] = js.undefined,
    fileKey: java.lang.String = null,
    fileName: java.lang.String = null,
    headers: js.Object = null,
    httpMethod: java.lang.String = null,
    mimeType: java.lang.String = null,
    params: js.Object = null,
    timeout: scala.Int | scala.Double = null
  ): IFileUploadOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(chunkedMode)) __obj.updateDynamic("chunkedMode")(chunkedMode)
    if (!js.isUndefined(encodeURI)) __obj.updateDynamic("encodeURI")(encodeURI)
    if (fileKey != null) __obj.updateDynamic("fileKey")(fileKey)
    if (fileName != null) __obj.updateDynamic("fileName")(fileName)
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (httpMethod != null) __obj.updateDynamic("httpMethod")(httpMethod)
    if (mimeType != null) __obj.updateDynamic("mimeType")(mimeType)
    if (params != null) __obj.updateDynamic("params")(params)
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[IFileUploadOptions]
  }
}

