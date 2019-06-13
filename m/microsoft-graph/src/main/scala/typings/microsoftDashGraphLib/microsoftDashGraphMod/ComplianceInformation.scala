package typings
package microsoftDashGraphLib.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ComplianceInformation extends js.Object {
  /** Collection of the certification controls associated with certification */
  var certificationControls: js.UndefOr[js.Array[CertificationControl]] = js.undefined
  /** Compliance certification name (for example, ISO 27018:2014, GDPR, FedRAMP, NIST 800-171) */
  var certificationName: js.UndefOr[java.lang.String] = js.undefined
}

object ComplianceInformation {
  @scala.inline
  def apply(
    certificationControls: js.Array[CertificationControl] = null,
    certificationName: java.lang.String = null
  ): ComplianceInformation = {
    val __obj = js.Dynamic.literal()
    if (certificationControls != null) __obj.updateDynamic("certificationControls")(certificationControls)
    if (certificationName != null) __obj.updateDynamic("certificationName")(certificationName)
    __obj.asInstanceOf[ComplianceInformation]
  }
}

