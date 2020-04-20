package typings.microsoftLiveConnect.Microsoft.Live

import typings.microsoftLiveConnect.AnonCode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The Error object contains info about an error that is returned by the
  * Live Connect APIs.
  */
trait IError extends js.Object {
  /**
    * Info about the error.
    */
  var error: AnonCode
}

object IError {
  @scala.inline
  def apply(error: AnonCode): IError = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any])
    __obj.asInstanceOf[IError]
  }
}

