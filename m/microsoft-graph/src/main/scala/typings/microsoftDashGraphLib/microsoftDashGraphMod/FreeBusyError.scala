package typings
package microsoftDashGraphLib.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FreeBusyError extends js.Object {
  // Describes the error.
  var message: js.UndefOr[java.lang.String] = js.undefined
  // The response code from querying for the availability of the user, distribution list, or resource.
  var responseCode: js.UndefOr[java.lang.String] = js.undefined
}

object FreeBusyError {
  @scala.inline
  def apply(message: java.lang.String = null, responseCode: java.lang.String = null): FreeBusyError = {
    val __obj = js.Dynamic.literal()
    if (message != null) __obj.updateDynamic("message")(message)
    if (responseCode != null) __obj.updateDynamic("responseCode")(responseCode)
    __obj.asInstanceOf[FreeBusyError]
  }
}

