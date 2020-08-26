package typings.nodeAppleReceiptVerify.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ValidateOptions extends js.Object {
  var device: js.UndefOr[String] = js.native
  var receipt: String = js.native
}

object ValidateOptions {
  @scala.inline
  def apply(receipt: String): ValidateOptions = {
    val __obj = js.Dynamic.literal(receipt = receipt.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValidateOptions]
  }
  @scala.inline
  implicit class ValidateOptionsOps[Self <: ValidateOptions] (val x: Self) extends AnyVal {
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
    def setReceipt(value: String): Self = this.set("receipt", value.asInstanceOf[js.Any])
    @scala.inline
    def setDevice(value: String): Self = this.set("device", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDevice: Self = this.set("device", js.undefined)
  }
  
}

