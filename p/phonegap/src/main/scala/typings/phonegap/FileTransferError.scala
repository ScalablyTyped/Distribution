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

@JSGlobal("FileTransferError")
@js.native
object FileTransferError extends js.Object {
  var ABORT_ERR: Double = js.native
  var CONNECTION_ERR: Double = js.native
  var FILE_NOT_FOUND_ERR: Double = js.native
  var INVALID_URL_ERR: Double = js.native
}

