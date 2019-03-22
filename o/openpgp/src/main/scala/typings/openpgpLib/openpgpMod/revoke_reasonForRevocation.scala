package typings
package openpgpLib.openpgpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait revoke_reasonForRevocation extends js.Object {
  /**
    * optional, flag indicating the reason for revocation
    */
  var flag: openpgpLib.openpgpMod.enumsNs.reasonForRevocation
  /**
    * optional, string explaining the reason for revocation
    */
  var string: java.lang.String
}

object revoke_reasonForRevocation {
  @scala.inline
  def apply(flag: openpgpLib.openpgpMod.enumsNs.reasonForRevocation, string: java.lang.String): revoke_reasonForRevocation = {
    val __obj = js.Dynamic.literal(flag = flag, string = string)
  
    __obj.asInstanceOf[revoke_reasonForRevocation]
  }
}

