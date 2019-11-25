package typings.phonegap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GeolocationError extends js.Object {
  var code: Double
  var message: String
}

object GeolocationError {
  @scala.inline
  def apply(code: Double, message: String): GeolocationError = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GeolocationError]
  }
}

