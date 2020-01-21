package typings.pkijs

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("pkijs/src/CertificateChainValidationEngine", JSImport.Namespace)
@js.native
object certificateChainValidationEngineMod extends js.Object {
  @js.native
  trait CertificateChainValidationEngine extends js.Object {
    var certs: js.Array[typings.pkijs.certificateMod.default] = js.native
    var checkDate: Date = js.native
    var crls: js.Array[typings.pkijs.certificateRevocationListMod.default] = js.native
    var ocsp: typings.pkijs.ocspresponseMod.default = js.native
    var trustedCerts: js.Array[typings.pkijs.certificateMod.default] = js.native
    def sort(): js.Any = js.native
    /**
      * Major verification function for certificate chain.
      * @param {{initialPolicySet, initialExplicitPolicy, initialPolicyMappingInhibit, initialInhibitPolicy, initialPermittedSubtreesSet, initialExcludedSubtreesSet, initialRequiredNameForms}} [parameters]
      * @returns {PromiseLike<any>}
      */
    def verify(): js.Thenable[_] = js.native
    def verify(parameters: js.Any): js.Thenable[_] = js.native
  }
  
  @js.native
  /**
    * Constructor for CertificateChainValidationEngine class
    * @param {*} [parameters={}]
    * @property {any} [schema] asn1js parsed value
    */
  class default () extends CertificateChainValidationEngine {
    def this(parameters: js.Any) = this()
  }
  
}

