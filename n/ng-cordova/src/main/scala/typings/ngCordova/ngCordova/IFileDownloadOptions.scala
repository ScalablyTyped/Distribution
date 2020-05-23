package typings.ngCordova.ngCordova

import typings.cordovaPluginFileTransfer.FileDownloadOptions
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
    timeout: js.UndefOr[Double] = js.undefined
  ): IFileDownloadOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(encodeURI)) __obj.updateDynamic("encodeURI")(encodeURI.get.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (!js.isUndefined(timeout)) __obj.updateDynamic("timeout")(timeout.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[IFileDownloadOptions]
  }
}

