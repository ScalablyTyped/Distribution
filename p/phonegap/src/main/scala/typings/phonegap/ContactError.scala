package typings.phonegap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContactError extends js.Object {
  var code: Double
}

object ContactError {
  @scala.inline
  def apply(code: Double): ContactError = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContactError]
  }
}

