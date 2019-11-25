package typings.microsoftDashGraph.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FreeBusyError extends js.Object {
  // Describes the error.
  var message: js.UndefOr[String] = js.undefined
  // The response code from querying for the availability of the user, distribution list, or resource.
  var responseCode: js.UndefOr[String] = js.undefined
}

object FreeBusyError {
  @scala.inline
  def apply(message: String = null, responseCode: String = null): FreeBusyError = {
    val __obj = js.Dynamic.literal()
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    if (responseCode != null) __obj.updateDynamic("responseCode")(responseCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[FreeBusyError]
  }
}

