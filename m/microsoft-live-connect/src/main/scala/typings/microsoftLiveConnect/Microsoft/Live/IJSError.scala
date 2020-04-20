package typings.microsoftLiveConnect.Microsoft.Live

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
  var error: String
  /**
    * A description of the error.
    */
  var error_description: String
}

object IJSError {
  @scala.inline
  def apply(error: String, error_description: String): IJSError = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], error_description = error_description.asInstanceOf[js.Any])
    __obj.asInstanceOf[IJSError]
  }
}

