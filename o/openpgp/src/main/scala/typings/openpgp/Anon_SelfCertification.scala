package typings.openpgp

import typings.openpgp.openpgpMod.keyNs.User
import typings.openpgp.openpgpMod.packetNs.Signature
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_SelfCertification extends js.Object {
  var selfCertification: Signature
  var user: User
}

object Anon_SelfCertification {
  @scala.inline
  def apply(selfCertification: Signature, user: User): Anon_SelfCertification = {
    val __obj = js.Dynamic.literal(selfCertification = selfCertification, user = user)
  
    __obj.asInstanceOf[Anon_SelfCertification]
  }
}

