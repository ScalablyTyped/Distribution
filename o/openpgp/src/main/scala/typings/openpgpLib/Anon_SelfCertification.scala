package typings
package openpgpLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_SelfCertification extends js.Object {
  var selfCertification: openpgpLib.openpgpMod.packetNs.Signature
  var user: openpgpLib.openpgpMod.keyNs.User
}

object Anon_SelfCertification {
  @scala.inline
  def apply(
    selfCertification: openpgpLib.openpgpMod.packetNs.Signature,
    user: openpgpLib.openpgpMod.keyNs.User
  ): Anon_SelfCertification = {
    val __obj = js.Dynamic.literal(selfCertification = selfCertification, user = user)
  
    __obj.asInstanceOf[Anon_SelfCertification]
  }
}

