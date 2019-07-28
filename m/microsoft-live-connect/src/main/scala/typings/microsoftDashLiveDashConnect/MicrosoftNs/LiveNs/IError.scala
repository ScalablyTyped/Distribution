package typings.microsoftDashLiveDashConnect.MicrosoftNs.LiveNs

import typings.microsoftDashLiveDashConnect.Anon_Code
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
  var error: Anon_Code
}

object IError {
  @scala.inline
  def apply(error: Anon_Code): IError = {
    val __obj = js.Dynamic.literal(error = error)
  
    __obj.asInstanceOf[IError]
  }
}

