package typings.pkijs.srcCertificateChainValidationEngineMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CertificateChainValidationEngine extends js.Object {
  var certs: js.Array[typings.pkijs.srcCertificateMod.default] = js.native
  var checkDate: Date = js.native
  var crls: js.Array[typings.pkijs.srcCertificateRevocationListMod.default] = js.native
  var ocsp: typings.pkijs.srcOCSPResponseMod.default = js.native
  var trustedCerts: js.Array[typings.pkijs.srcCertificateMod.default] = js.native
  def sort(): js.Any = js.native
  /**
    * Major verification function for certificate chain.
    * @param {{initialPolicySet, initialExplicitPolicy, initialPolicyMappingInhibit, initialInhibitPolicy, initialPermittedSubtreesSet, initialExcludedSubtreesSet, initialRequiredNameForms}} [parameters]
    * @returns {PromiseLike<any>}
    */
  def verify(): js.Thenable[_] = js.native
  def verify(parameters: js.Any): js.Thenable[_] = js.native
}

