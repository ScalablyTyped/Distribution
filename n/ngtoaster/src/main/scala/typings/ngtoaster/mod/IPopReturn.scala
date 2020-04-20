package typings.ngtoaster.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPopReturn extends js.Object {
  var toastId: String | Double
  var toasterId: Double
}

object IPopReturn {
  @scala.inline
  def apply(toastId: String | Double, toasterId: Double): IPopReturn = {
    val __obj = js.Dynamic.literal(toastId = toastId.asInstanceOf[js.Any], toasterId = toasterId.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPopReturn]
  }
}

