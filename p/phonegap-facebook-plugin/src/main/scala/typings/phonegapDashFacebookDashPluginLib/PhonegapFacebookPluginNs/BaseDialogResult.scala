package typings
package phonegapDashFacebookDashPluginLib.PhonegapFacebookPluginNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The base result type for all showDialog() success callbacks.
  */
trait BaseDialogResult extends js.Object {
  var error_code: java.lang.String
  var error_message: java.lang.String
}

object BaseDialogResult {
  @scala.inline
  def apply(error_code: java.lang.String, error_message: java.lang.String): BaseDialogResult = {
    val __obj = js.Dynamic.literal(error_code = error_code, error_message = error_message)
  
    __obj.asInstanceOf[BaseDialogResult]
  }
}

