package typings.postmark.postmarkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PostmarkError extends js.Object {
  var code: Double
  var message: String
  var status: Double
}

object PostmarkError {
  @scala.inline
  def apply(code: Double, message: String, status: Double): PostmarkError = {
    val __obj = js.Dynamic.literal(code = code, message = message, status = status)
  
    __obj.asInstanceOf[PostmarkError]
  }
}

