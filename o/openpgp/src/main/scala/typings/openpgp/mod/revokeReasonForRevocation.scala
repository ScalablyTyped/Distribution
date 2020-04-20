package typings.openpgp.mod

import typings.openpgp.mod.enums.reasonForRevocation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait revokeReasonForRevocation extends js.Object {
  /**
    * optional, flag indicating the reason for revocation
    */
  var flag: reasonForRevocation
  /**
    * optional, string explaining the reason for revocation
    */
  var string: String
}

object revokeReasonForRevocation {
  @scala.inline
  def apply(flag: reasonForRevocation, string: String): revokeReasonForRevocation = {
    val __obj = js.Dynamic.literal(flag = flag.asInstanceOf[js.Any], string = string.asInstanceOf[js.Any])
    __obj.asInstanceOf[revokeReasonForRevocation]
  }
}

