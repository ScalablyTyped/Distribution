package typings
package pemLib.pemMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CertificateSubjectReadResult extends js.Object {
  var commonName: java.lang.String
  var country: java.lang.String
  var emailAddress: java.lang.String
  var locality: java.lang.String
  var organization: java.lang.String
  var organizationUnit: java.lang.String
  var state: java.lang.String
}

object CertificateSubjectReadResult {
  @scala.inline
  def apply(
    commonName: java.lang.String,
    country: java.lang.String,
    emailAddress: java.lang.String,
    locality: java.lang.String,
    organization: java.lang.String,
    organizationUnit: java.lang.String,
    state: java.lang.String
  ): CertificateSubjectReadResult = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("commonName")(commonName)
    __obj.updateDynamic("country")(country)
    __obj.updateDynamic("emailAddress")(emailAddress)
    __obj.updateDynamic("locality")(locality)
    __obj.updateDynamic("organization")(organization)
    __obj.updateDynamic("organizationUnit")(organizationUnit)
    __obj.updateDynamic("state")(state)
    __obj.asInstanceOf[CertificateSubjectReadResult]
  }
}

