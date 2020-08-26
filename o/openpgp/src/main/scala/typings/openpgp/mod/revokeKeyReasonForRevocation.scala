package typings.openpgp.mod

import typings.openpgp.mod.enums.reasonForRevocation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait revokeKeyReasonForRevocation extends js.Object {
  /**
    * (optional) flag indicating the reason for revocation
    */
  var flag: reasonForRevocation = js.native
  /**
    * (optional) string explaining the reason for revocation
    */
  var string: String = js.native
}

object revokeKeyReasonForRevocation {
  @scala.inline
  def apply(flag: reasonForRevocation, string: String): revokeKeyReasonForRevocation = {
    val __obj = js.Dynamic.literal(flag = flag.asInstanceOf[js.Any], string = string.asInstanceOf[js.Any])
    __obj.asInstanceOf[revokeKeyReasonForRevocation]
  }
  @scala.inline
  implicit class revokeKeyReasonForRevocationOps[Self <: revokeKeyReasonForRevocation] (val x: Self) extends AnyVal {
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
    def setFlag(value: reasonForRevocation): Self = this.set("flag", value.asInstanceOf[js.Any])
    @scala.inline
    def setString(value: String): Self = this.set("string", value.asInstanceOf[js.Any])
  }
  
}

