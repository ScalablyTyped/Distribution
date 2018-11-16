package typings
package phonegapLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait FileTransferError extends js.Object {
  var code: scala.Double
  var http_status: scala.Double
  var source: java.lang.String
  var target: java.lang.String
}

@JSGlobal("FileTransferError")
@js.native
object FileTransferError extends js.Object {
  var ABORT_ERR: scala.Double = js.native
  var CONNECTION_ERR: scala.Double = js.native
  var FILE_NOT_FOUND_ERR: scala.Double = js.native
  var INVALID_URL_ERR: scala.Double = js.native
}

