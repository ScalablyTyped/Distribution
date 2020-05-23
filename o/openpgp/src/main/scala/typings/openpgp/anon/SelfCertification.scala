package typings.openpgp.anon

import typings.openpgp.mod.key.User
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SelfCertification extends js.Object {
  var selfCertification: typings.openpgp.mod.packet.Signature
  var user: User
}

object SelfCertification {
  @scala.inline
  def apply(selfCertification: typings.openpgp.mod.packet.Signature, user: User): SelfCertification = {
    val __obj = js.Dynamic.literal(selfCertification = selfCertification.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelfCertification]
  }
}

