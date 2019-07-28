package typings.openpgp.openpgpMod

import typings.openpgp.openpgpMod.enumsNs.reasonForRevocation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait revoke_reasonForRevocation extends js.Object {
  /**
    * optional, flag indicating the reason for revocation
    */
  var flag: reasonForRevocation
  /**
    * optional, string explaining the reason for revocation
    */
  var string: String
}

object revoke_reasonForRevocation {
  @scala.inline
  def apply(flag: reasonForRevocation, string: String): revoke_reasonForRevocation = {
    val __obj = js.Dynamic.literal(flag = flag, string = string)
  
    __obj.asInstanceOf[revoke_reasonForRevocation]
  }
}

