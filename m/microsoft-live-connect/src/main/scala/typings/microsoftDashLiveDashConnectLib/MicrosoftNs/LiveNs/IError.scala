package typings
package microsoftDashLiveDashConnectLib.MicrosoftNs.LiveNs

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
  var error: microsoftDashLiveDashConnectLib.Anon_Code
}

object IError {
  @scala.inline
  def apply(error: microsoftDashLiveDashConnectLib.Anon_Code): IError = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("error")(error)
    __obj.asInstanceOf[IError]
  }
}

