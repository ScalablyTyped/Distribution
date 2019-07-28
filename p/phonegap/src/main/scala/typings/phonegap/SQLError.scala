package typings.phonegap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SQLError extends js.Object {
  var code: Double
  var message: String
}

object SQLError {
  @scala.inline
  def apply(code: Double, message: String): SQLError = {
    val __obj = js.Dynamic.literal(code = code, message = message)
  
    __obj.asInstanceOf[SQLError]
  }
}

