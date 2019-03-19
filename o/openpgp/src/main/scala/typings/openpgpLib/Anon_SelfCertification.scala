package typings
package openpgpLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_SelfCertification extends js.Object {
  var selfCertification: openpgpLib.openpgpMod.openpgpNs.packetNs.Signature
  var user: openpgpLib.openpgpMod.openpgpNs.keyNs.User
}

object Anon_SelfCertification {
  @scala.inline
  def apply(
    selfCertification: openpgpLib.openpgpMod.openpgpNs.packetNs.Signature,
    user: openpgpLib.openpgpMod.openpgpNs.keyNs.User
  ): Anon_SelfCertification = {
    val __obj = js.Dynamic.literal(selfCertification = selfCertification, user = user)
  
    __obj.asInstanceOf[Anon_SelfCertification]
  }
}

