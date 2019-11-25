package typings.phonegap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CaptureError extends js.Object {
  var code: Double
  var message: String
}

object CaptureError {
  @scala.inline
  def apply(code: Double, message: String): CaptureError = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CaptureError]
  }
}

