package typings
package pkijsLib.srcCertificateChainValidationEngineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CertificateChainValidationEngine extends js.Object {
  var certs: js.Array[pkijsLib.srcCertificateMod.default] = js.native
  var checkDate: stdLib.Date = js.native
  var crls: js.Array[pkijsLib.srcCertificateRevocationListMod.default] = js.native
  var ocsp: pkijsLib.srcOCSPResponseMod.default = js.native
  var trustedCerts: js.Array[pkijsLib.srcCertificateMod.default] = js.native
  def sort(): js.Any = js.native
  /**
           * Major verification function for certificate chain.
           * @param {{initialPolicySet, initialExplicitPolicy, initialPolicyMappingInhibit, initialInhibitPolicy, initialPermittedSubtreesSet, initialExcludedSubtreesSet, initialRequiredNameForms}} [parameters]
           * @returns {PromiseLike<any>}
           */
  def verify(): stdLib.PromiseLike[_] = js.native
  /**
           * Major verification function for certificate chain.
           * @param {{initialPolicySet, initialExplicitPolicy, initialPolicyMappingInhibit, initialInhibitPolicy, initialPermittedSubtreesSet, initialExcludedSubtreesSet, initialRequiredNameForms}} [parameters]
           * @returns {PromiseLike<any>}
           */
  def verify(parameters: js.Any): stdLib.PromiseLike[_] = js.native
}

