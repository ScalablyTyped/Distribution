package typings.microsoftLiveConnect.Microsoft.Live

import typings.microsoftLiveConnect.anon.Code
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
  var error: Code
}

object IError {
  @scala.inline
  def apply(error: Code): IError = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any])
    __obj.asInstanceOf[IError]
  }
}

