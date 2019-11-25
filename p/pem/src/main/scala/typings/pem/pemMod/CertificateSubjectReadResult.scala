package typings.pem.pemMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CertificateSubjectReadResult extends js.Object {
  var commonName: String
  var country: String
  var emailAddress: String
  var locality: String
  var organization: String
  var organizationUnit: String
  var state: String
}

object CertificateSubjectReadResult {
  @scala.inline
  def apply(
    commonName: String,
    country: String,
    emailAddress: String,
    locality: String,
    organization: String,
    organizationUnit: String,
    state: String
  ): CertificateSubjectReadResult = {
    val __obj = js.Dynamic.literal(commonName = commonName.asInstanceOf[js.Any], country = country.asInstanceOf[js.Any], emailAddress = emailAddress.asInstanceOf[js.Any], locality = locality.asInstanceOf[js.Any], organization = organization.asInstanceOf[js.Any], organizationUnit = organizationUnit.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CertificateSubjectReadResult]
  }
}

