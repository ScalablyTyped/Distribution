package typings
package microsoftDashGraphLib.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OperationError extends js.Object {
  /** Operation error code. */
  var code: js.UndefOr[java.lang.String] = js.undefined
  /** Operation error message. */
  var message: js.UndefOr[java.lang.String] = js.undefined
}

object OperationError {
  @scala.inline
  def apply(code: java.lang.String = null, message: java.lang.String = null): OperationError = {
    val __obj = js.Dynamic.literal()
    if (code != null) __obj.updateDynamic("code")(code)
    if (message != null) __obj.updateDynamic("message")(message)
    __obj.asInstanceOf[OperationError]
  }
}

