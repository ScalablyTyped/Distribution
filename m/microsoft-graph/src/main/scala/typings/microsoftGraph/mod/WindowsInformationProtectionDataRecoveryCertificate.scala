package typings.microsoftGraph.mod

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
    certificate: js.UndefOr[Double] = js.undefined,
    description: String = null,
    expirationDateTime: String = null,
    subjectName: String = null
  ): WindowsInformationProtectionDataRecoveryCertificate = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(certificate)) __obj.updateDynamic("certificate")(certificate.get.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (expirationDateTime != null) __obj.updateDynamic("expirationDateTime")(expirationDateTime.asInstanceOf[js.Any])
    if (subjectName != null) __obj.updateDynamic("subjectName")(subjectName.asInstanceOf[js.Any])
    __obj.asInstanceOf[WindowsInformationProtectionDataRecoveryCertificate]
  }
}

