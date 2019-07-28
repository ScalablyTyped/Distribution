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
    val __obj = js.Dynamic.literal(code = code, message = message)
  
    __obj.asInstanceOf[CaptureError]
  }
}

