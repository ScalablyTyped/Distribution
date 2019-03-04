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
    val __obj = js.Dynamic.literal(commonName = commonName, country = country, emailAddress = emailAddress, locality = locality, organization = organization, organizationUnit = organizationUnit, state = state)
  
    __obj.asInstanceOf[CertificateSubjectReadResult]
  }
}

