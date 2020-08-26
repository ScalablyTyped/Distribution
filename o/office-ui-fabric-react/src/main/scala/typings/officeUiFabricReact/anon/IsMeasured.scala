package typings.officeUiFabricReact.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IsMeasured extends js.Object {
  var isMeasured: Boolean = js.native
}

object IsMeasured {
  @scala.inline
  def apply(isMeasured: Boolean): IsMeasured = {
    val __obj = js.Dynamic.literal(isMeasured = isMeasured.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsMeasured]
  }
  @scala.inline
  implicit class IsMeasuredOps[Self <: IsMeasured] (val x: Self) extends AnyVal {
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
    def setIsMeasured(value: Boolean): Self = this.set("isMeasured", value.asInstanceOf[js.Any])
  }
  
}

