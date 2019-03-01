package typings
package ngtoasterLib.ngtoasterMod.ngtoasterNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPopReturn extends js.Object {
  var toastId: java.lang.String | scala.Double
  var toasterId: scala.Double
}

object IPopReturn {
  @scala.inline
  def apply(toastId: java.lang.String | scala.Double, toasterId: scala.Double): IPopReturn = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("toastId")(toastId.asInstanceOf[js.Any])
    __obj.updateDynamic("toasterId")(toasterId)
    __obj.asInstanceOf[IPopReturn]
  }
}

