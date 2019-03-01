package typings
package openpgpLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Key extends js.Object {
  var key: js.UndefOr[openpgpLib.openpgpMod.keyNs.Key] = js.undefined
  var reasonForRevocation: js.UndefOr[Anon_Flag] = js.undefined
  var revocationCertificate: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_Key {
  @scala.inline
  def apply(
    key: openpgpLib.openpgpMod.keyNs.Key = null,
    reasonForRevocation: Anon_Flag = null,
    revocationCertificate: java.lang.String = null
  ): Anon_Key = {
    val __obj = js.Dynamic.literal()
    if (key != null) __obj.updateDynamic("key")(key)
    if (reasonForRevocation != null) __obj.updateDynamic("reasonForRevocation")(reasonForRevocation)
    if (revocationCertificate != null) __obj.updateDynamic("revocationCertificate")(revocationCertificate)
    __obj.asInstanceOf[Anon_Key]
  }
}

