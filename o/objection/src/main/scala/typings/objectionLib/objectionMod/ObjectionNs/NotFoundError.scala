package typings
package objectionLib.objectionMod.ObjectionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NotFoundError
  extends nodeLib.Error {
  var data: js.UndefOr[js.Any] = js.undefined
  var statusCode: scala.Double
}

object NotFoundError {
  @scala.inline
  def apply(statusCode: scala.Double, data: js.Any = null, stack: java.lang.String = null): NotFoundError = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("statusCode")(statusCode)
    if (data != null) __obj.updateDynamic("data")(data)
    if (stack != null) __obj.updateDynamic("stack")(stack)
    __obj.asInstanceOf[NotFoundError]
  }
}

