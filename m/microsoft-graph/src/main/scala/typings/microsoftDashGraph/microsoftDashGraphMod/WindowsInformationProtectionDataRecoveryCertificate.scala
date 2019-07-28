package typings.microsoftDashGraph.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WindowsInformationProtectionDataRecoveryCertificate extends js.Object {
  // Data recovery Certificate
  var certificate: js.UndefOr[Double] = js.undefined
  // Data recovery Certificate description
  var description: js.UndefOr[String] = js.undefined
  // Data recovery Certificate expiration datetime
  var expirationDateTime: js.UndefOr[String] = js.undefined
  // Data recovery Certificate subject name
  var subjectName: js.UndefOr[String] = js.undefined
}

object WindowsInformationProtectionDataRecoveryCertificate {
  @scala.inline
  def apply(
    certificate: Int | Double = null,
    description: String = null,
    expirationDateTime: String = null,
    subjectName: String = null
  ): WindowsInformationProtectionDataRecoveryCertificate = {
    val __obj = js.Dynamic.literal()
    if (certificate != null) __obj.updateDynamic("certificate")(certificate.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description)
    if (expirationDateTime != null) __obj.updateDynamic("expirationDateTime")(expirationDateTime)
    if (subjectName != null) __obj.updateDynamic("subjectName")(subjectName)
    __obj.asInstanceOf[WindowsInformationProtectionDataRecoveryCertificate]
  }
}

