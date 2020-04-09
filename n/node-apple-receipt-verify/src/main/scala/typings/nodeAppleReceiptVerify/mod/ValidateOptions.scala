package typings.nodeAppleReceiptVerify.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ValidateOptions extends js.Object {
  var device: js.UndefOr[String] = js.undefined
  var receipt: String
}

object ValidateOptions {
  @scala.inline
  def apply(receipt: String, device: String = null): ValidateOptions = {
    val __obj = js.Dynamic.literal(receipt = receipt.asInstanceOf[js.Any])
    if (device != null) __obj.updateDynamic("device")(device.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValidateOptions]
  }
}

