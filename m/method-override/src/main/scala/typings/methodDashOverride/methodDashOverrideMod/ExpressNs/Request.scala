package typings.methodDashOverride.methodDashOverrideMod.ExpressNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Request extends js.Object {
  var originalMethod: js.UndefOr[String] = js.undefined
}

object Request {
  @scala.inline
  def apply(originalMethod: String = null): Request = {
    val __obj = js.Dynamic.literal()
    if (originalMethod != null) __obj.updateDynamic("originalMethod")(originalMethod)
    __obj.asInstanceOf[Request]
  }
}

