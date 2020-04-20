package typings.phonegapFacebookPlugin.PhonegapFacebookPlugin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The base result type for all showDialog() success callbacks.
  */
trait BaseDialogResult extends js.Object {
  var error_code: String
  var error_message: String
}

object BaseDialogResult {
  @scala.inline
  def apply(error_code: String, error_message: String): BaseDialogResult = {
    val __obj = js.Dynamic.literal(error_code = error_code.asInstanceOf[js.Any], error_message = error_message.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseDialogResult]
  }
}

