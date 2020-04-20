package typings.mongodb.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WriteError extends js.Object {
  //Write concern error code.
  var code: scala.Double
  //Write concern error message.
  var errmsg: String
  //Write concern error original bulk operation index.
  var index: scala.Double
}

object WriteError {
  @scala.inline
  def apply(code: scala.Double, errmsg: String, index: scala.Double): WriteError = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], errmsg = errmsg.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any])
    __obj.asInstanceOf[WriteError]
  }
}

