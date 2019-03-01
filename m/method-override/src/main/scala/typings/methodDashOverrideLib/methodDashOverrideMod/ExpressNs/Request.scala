package typings
package methodDashOverrideLib.methodDashOverrideMod.ExpressNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Request extends js.Object {
  var originalMethod: js.UndefOr[java.lang.String] = js.undefined
}

object Request {
  @scala.inline
  def apply(originalMethod: java.lang.String = null): Request = {
    val __obj = js.Dynamic.literal()
    if (originalMethod != null) __obj.updateDynamic("originalMethod")(originalMethod)
    __obj.asInstanceOf[Request]
  }
}

