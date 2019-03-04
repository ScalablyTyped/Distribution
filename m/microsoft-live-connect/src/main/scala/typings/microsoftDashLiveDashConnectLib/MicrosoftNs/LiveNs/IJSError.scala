package typings
package microsoftDashLiveDashConnectLib.MicrosoftNs.LiveNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An error returned by the JavaScript library, as opposed to an error
  * object from the REST API (which we represent with IError).
  */
trait IJSError extends js.Object {
  /**
    * The error code.
    */
  var error: java.lang.String
  /**
    * A description of the error.
    */
  var error_description: java.lang.String
}

object IJSError {
  @scala.inline
  def apply(error: java.lang.String, error_description: java.lang.String): IJSError = {
    val __obj = js.Dynamic.literal(error = error, error_description = error_description)
  
    __obj.asInstanceOf[IJSError]
  }
}

