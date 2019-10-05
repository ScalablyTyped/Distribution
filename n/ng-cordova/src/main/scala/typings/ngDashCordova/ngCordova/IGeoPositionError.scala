package typings.ngDashCordova.ngCordova

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
    val __obj = js.Dynamic.literal(code = code, message = message)
  
    __obj.asInstanceOf[IGeoPositionError]
  }
}

