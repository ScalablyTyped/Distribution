package typings.nodeDownloaderHelper.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DownloaderError extends js.Object {
   // Http status response if available
  var body: js.UndefOr[String] = js.undefined
  var message: String
   // Error message
  var status: js.UndefOr[Double] = js.undefined
}

object DownloaderError {
  @scala.inline
  def apply(message: String, body: String = null, status: js.UndefOr[Double] = js.undefined): DownloaderError = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
    if (body != null) __obj.updateDynamic("body")(body.asInstanceOf[js.Any])
    if (!js.isUndefined(status)) __obj.updateDynamic("status")(status.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[DownloaderError]
  }
}

