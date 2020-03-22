package typings.openfin.externalProcessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CertificationInfo extends js.Object {
  var publickey: js.UndefOr[String] = js.undefined
  var serial: js.UndefOr[String] = js.undefined
  var subject: js.UndefOr[String] = js.undefined
  var thumbprint: js.UndefOr[String] = js.undefined
  var trusted: js.UndefOr[Boolean] = js.undefined
}

object CertificationInfo {
  @scala.inline
  def apply(
    publickey: String = null,
    serial: String = null,
    subject: String = null,
    thumbprint: String = null,
    trusted: js.UndefOr[Boolean] = js.undefined
  ): CertificationInfo = {
    val __obj = js.Dynamic.literal()
    if (publickey != null) __obj.updateDynamic("publickey")(publickey.asInstanceOf[js.Any])
    if (serial != null) __obj.updateDynamic("serial")(serial.asInstanceOf[js.Any])
    if (subject != null) __obj.updateDynamic("subject")(subject.asInstanceOf[js.Any])
    if (thumbprint != null) __obj.updateDynamic("thumbprint")(thumbprint.asInstanceOf[js.Any])
    if (!js.isUndefined(trusted)) __obj.updateDynamic("trusted")(trusted.asInstanceOf[js.Any])
    __obj.asInstanceOf[CertificationInfo]
  }
}

