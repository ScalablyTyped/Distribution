package typings.node.dgramMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BindOptions extends js.Object {
  var address: js.UndefOr[String] = js.native
  var exclusive: js.UndefOr[Boolean] = js.native
  var fd: js.UndefOr[Double] = js.native
  var port: js.UndefOr[Double] = js.native
}

object BindOptions {
  @scala.inline
  def apply(): BindOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BindOptions]
  }
  @scala.inline
  implicit class BindOptionsOps[Self <: BindOptions] (val x: Self) extends AnyVal {
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
    def setAddress(value: String): Self = this.set("address", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAddress: Self = this.set("address", js.undefined)
    @scala.inline
    def setExclusive(value: Boolean): Self = this.set("exclusive", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExclusive: Self = this.set("exclusive", js.undefined)
    @scala.inline
    def setFd(value: Double): Self = this.set("fd", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFd: Self = this.set("fd", js.undefined)
    @scala.inline
    def setPort(value: Double): Self = this.set("port", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePort: Self = this.set("port", js.undefined)
  }
  
}

