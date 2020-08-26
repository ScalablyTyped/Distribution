package typings.monk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Inputs
@js.native
trait SingleMulti extends js.Object {
  var multi: js.UndefOr[Boolean] = js.native
  var single: js.UndefOr[Boolean] = js.native
}

object SingleMulti {
  @scala.inline
  def apply(): SingleMulti = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SingleMulti]
  }
  @scala.inline
  implicit class SingleMultiOps[Self <: SingleMulti] (val x: Self) extends AnyVal {
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
    def setMulti(value: Boolean): Self = this.set("multi", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMulti: Self = this.set("multi", js.undefined)
    @scala.inline
    def setSingle(value: Boolean): Self = this.set("single", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSingle: Self = this.set("single", js.undefined)
  }
  
}

