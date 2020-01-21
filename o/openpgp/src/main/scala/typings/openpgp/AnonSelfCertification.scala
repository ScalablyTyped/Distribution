package typings.openpgp

import typings.openpgp.mod.key.User
import typings.openpgp.mod.packet.Signature
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonSelfCertification extends js.Object {
  var selfCertification: Signature
  var user: User
}

object AnonSelfCertification {
  @scala.inline
  def apply(selfCertification: Signature, user: User): AnonSelfCertification = {
    val __obj = js.Dynamic.literal(selfCertification = selfCertification.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonSelfCertification]
  }
}

