package typings
package meteorLib.MeteorNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Error extends js.Object {
  var details: js.UndefOr[java.lang.String] = js.undefined
  var error: java.lang.String | scala.Double
  var reason: js.UndefOr[java.lang.String] = js.undefined
}

object Error {
  @scala.inline
  def apply(
    error: java.lang.String | scala.Double,
    details: java.lang.String = null,
    reason: java.lang.String = null
  ): Error = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any])
    if (details != null) __obj.updateDynamic("details")(details)
    if (reason != null) __obj.updateDynamic("reason")(reason)
    __obj.asInstanceOf[Error]
  }
}

