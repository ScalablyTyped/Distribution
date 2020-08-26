package typings.openfin.mod.fin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SuccessObj extends js.Object {
  var httpResponseCode: Double = js.native
}

object SuccessObj {
  @scala.inline
  def apply(httpResponseCode: Double): SuccessObj = {
    val __obj = js.Dynamic.literal(httpResponseCode = httpResponseCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[SuccessObj]
  }
  @scala.inline
  implicit class SuccessObjOps[Self <: SuccessObj] (val x: Self) extends AnyVal {
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
    def setHttpResponseCode(value: Double): Self = this.set("httpResponseCode", value.asInstanceOf[js.Any])
  }
  
}

