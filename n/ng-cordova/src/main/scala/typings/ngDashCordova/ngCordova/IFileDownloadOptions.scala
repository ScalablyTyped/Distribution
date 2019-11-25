package typings.ngDashCordova.ngCordova

import typings.cordovaDashPluginDashFileDashTransfer.FileDownloadOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IFileDownloadOptions extends FileDownloadOptions {
  var encodeURI: js.UndefOr[Boolean] = js.undefined
  var timeout: js.UndefOr[Double] = js.undefined
}

object IFileDownloadOptions {
  @scala.inline
  def apply(
    encodeURI: js.UndefOr[Boolean] = js.undefined,
    headers: js.Object = null,
    timeout: Int | Double = null
  ): IFileDownloadOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(encodeURI)) __obj.updateDynamic("encodeURI")(encodeURI.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[IFileDownloadOptions]
  }
}

