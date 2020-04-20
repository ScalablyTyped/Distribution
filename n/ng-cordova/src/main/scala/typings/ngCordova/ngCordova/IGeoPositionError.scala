package typings.ngCordova.ngCordova

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IGeoPositionError extends js.Object {
  var code: Double
  var message: String
}

object IGeoPositionError {
  @scala.inline
  def apply(code: Double, message: String): IGeoPositionError = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[IGeoPositionError]
  }
}

