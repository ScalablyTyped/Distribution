package typings.ngtoaster.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPopParams extends IToast {
  var toasterId: js.UndefOr[Double] = js.native
}

object IPopParams {
  @scala.inline
  def apply(): IPopParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IPopParams]
  }
  @scala.inline
  implicit class IPopParamsOps[Self <: IPopParams] (val x: Self) extends AnyVal {
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
    def setToasterId(value: Double): Self = this.set("toasterId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteToasterId: Self = this.set("toasterId", js.undefined)
  }
  
}

