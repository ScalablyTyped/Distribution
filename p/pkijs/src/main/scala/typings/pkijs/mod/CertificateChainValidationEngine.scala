package typings.pkijs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a chain-building engine for {@link Certificate} certificates.
  *
  * @example
  * ```js The following example demonstrates how to verify certificate chain
  * const rootCa = pkijs.Certificate.fromBER(certRaw1);
  * const intermediateCa = pkijs.Certificate.fromBER(certRaw2);
  * const leafCert = pkijs.Certificate.fromBER(certRaw3);
  * const crl1 = pkijs.CertificateRevocationList.fromBER(crlRaw1);
  * const ocsp1 = pkijs.BasicOCSPResponse.fromBER(ocspRaw1);
  *
  * const chainEngine = new pkijs.CertificateChainValidationEngine({
  *   certs: [rootCa, intermediateCa, leafCert],
  *   crls: [crl1],
  *   ocsps: [ocsp1],
  *   checkDate: new Date("2015-07-13"), // optional
  *   trustedCerts: [rootCa],
  * });
  *
  * const chain = await chainEngine.verify();
  * ```
  */
@js.native
trait CertificateChainValidationEngine extends StObject {
  
  /**
    * Array with certificate chain. Could be only one end-user certificate in there!
    */
  var certs: js.Array[Certificate] = js.native
  
  /**
    * The date at which the check would be
    */
  var checkDate: js.Date = js.native
  
  /**
    * Array of all CRLs for all certificates from certificate chain
    */
  var crls: js.Array[CertificateRevocationList] = js.native
  
  def defaultFindIssuer(certificate: Certificate, validationEngine: CertificateChainValidationEngine): js.Promise[js.Array[Certificate]] = js.native
  def defaultFindIssuer(
    certificate: Certificate,
    validationEngine: CertificateChainValidationEngine,
    crypto: ICryptoEngine
  ): js.Promise[js.Array[Certificate]] = js.native
  
  def defaultValues(memberName: /* "findIssuer" */ String): FindIssuerCallback = js.native
  /**
    * Returns default values for all class members
    * @param memberName String name for a class member
    * @returns Default value
    */
  @JSName("defaultValues")
  def defaultValues_Array(memberName: /* "trustedCerts" */ /* "crls" */ /* "ocsps" */ String): js.Array[Certificate] = js.native
  @JSName("defaultValues")
  def defaultValues_Date(memberName: /* "checkDate" */ String): js.Date = js.native
  @JSName("defaultValues")
  def defaultValues_FindOriginCallback(memberName: /* "findOrigin" */ String): FindOriginCallback = js.native
  
  /**
    * The date at which the check would be
    */
  def findIssuer(certificate: Certificate, validationEngine: CertificateChainValidationEngine): js.Promise[js.Array[Certificate]] = js.native
  def findIssuer(
    certificate: Certificate,
    validationEngine: CertificateChainValidationEngine,
    crypto: ICryptoEngine
  ): js.Promise[js.Array[Certificate]] = js.native
  /**
    * The date at which the check would be
    */
  @JSName("findIssuer")
  var findIssuer_Original: FindIssuerCallback = js.native
  
  /**
    * The date at which the check would be
    */
  def findOrigin(certificate: Certificate, validationEngine: CertificateChainValidationEngine): String = js.native
  /**
    * The date at which the check would be
    */
  @JSName("findOrigin")
  var findOrigin_Original: FindOriginCallback = js.native
  
  /**
    * Array of all OCSP responses
    */
  var ocsps: js.Array[BasicOCSPResponse] = js.native
  
  def sort(): js.Promise[js.Array[Certificate]] = js.native
  def sort(passedWhenNotRevValues: Boolean): js.Promise[js.Array[Certificate]] = js.native
  def sort(passedWhenNotRevValues: Boolean, crypto: ICryptoEngine): js.Promise[js.Array[Certificate]] = js.native
  def sort(passedWhenNotRevValues: Unit, crypto: ICryptoEngine): js.Promise[js.Array[Certificate]] = js.native
  
  /**
    * Array of pre-defined trusted (by user) certificates
    */
  var trustedCerts: js.Array[Certificate] = js.native
  
  /**
    * Major verification function for certificate chain.
    * @param parameters
    * @param crypto Crypto engine
    * @returns
    */
  def verify(): js.Promise[CertificateChainValidationEngineVerifyResult] = js.native
  def verify(parameters: Unit, crypto: ICryptoEngine): js.Promise[CertificateChainValidationEngineVerifyResult] = js.native
  def verify(parameters: CertificateChainValidationEngineVerifyParams): js.Promise[CertificateChainValidationEngineVerifyResult] = js.native
  def verify(parameters: CertificateChainValidationEngineVerifyParams, crypto: ICryptoEngine): js.Promise[CertificateChainValidationEngineVerifyResult] = js.native
}
