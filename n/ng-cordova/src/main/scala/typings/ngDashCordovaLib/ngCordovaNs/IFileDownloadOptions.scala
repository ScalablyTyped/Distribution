package typings
package ngDashCordovaLib.ngCordovaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IFileDownloadOptions
  extends cordovaDashPluginDashFileDashTransferLib.FileDownloadOptions {
  var encodeURI: js.UndefOr[scala.Boolean] = js.undefined
  var timeout: js.UndefOr[scala.Double] = js.undefined
}

object IFileDownloadOptions {
  @scala.inline
  def apply(
    encodeURI: js.UndefOr[scala.Boolean] = js.undefined,
    headers: js.Object = null,
    timeout: scala.Int | scala.Double = null
  ): IFileDownloadOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(encodeURI)) __obj.updateDynamic("encodeURI")(encodeURI)
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[IFileDownloadOptions]
  }
}

