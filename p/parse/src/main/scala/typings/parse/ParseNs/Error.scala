package typings.parse.ParseNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Parse.Error")
@js.native
class Error protected () extends js.Object {
  def this(code: ErrorCode, message: String) = this()
  var code: ErrorCode = js.native
  var message: String = js.native
}

