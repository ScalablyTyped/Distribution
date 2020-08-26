package typings.ngtoaster.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPopReturn extends js.Object {
  var toastId: String | Double = js.native
  var toasterId: Double = js.native
}

object IPopReturn {
  @scala.inline
  def apply(toastId: String | Double, toasterId: Double): IPopReturn = {
    val __obj = js.Dynamic.literal(toastId = toastId.asInstanceOf[js.Any], toasterId = toasterId.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPopReturn]
  }
  @scala.inline
  implicit class IPopReturnOps[Self <: IPopReturn] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setToastId(value: String | Double): Self = this.set("toastId", value.asInstanceOf[js.Any])
    @scala.inline
    def setToasterId(value: Double): Self = this.set("toasterId", value.asInstanceOf[js.Any])
  }
  
}

