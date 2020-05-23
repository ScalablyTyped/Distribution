package typings.phonegap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FileTransferError extends js.Object {
  var code: Double
  var http_status: Double
  var source: String
  var target: String
}

object FileTransferError {
  @scala.inline
  def apply(code: Double, http_status: Double, source: String, target: String): FileTransferError = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], http_status = http_status.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileTransferError]
  }
}

