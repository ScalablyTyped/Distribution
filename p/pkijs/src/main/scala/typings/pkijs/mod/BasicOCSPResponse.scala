package typings.pkijs.mod

import typings.std.CryptoKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the BasicOCSPResponse structure described in [RFC6960](https://datatracker.ietf.org/doc/html/rfc6960)
  */
@js.native
trait BasicOCSPResponse
  extends StObject
     with PkiObject
     with IBasicOCSPResponse {
  
  /**
    * Get OCSP response status for specific certificate
    * @param certificate Certificate to be checked
    * @param issuerCertificate Certificate of issuer for certificate to be checked
    * @param crypto Crypto engine
    */
  def getCertificateStatus(certificate: Certificate, issuerCertificate: Certificate): js.Promise[CertificateStatus] = js.native
  def getCertificateStatus(certificate: Certificate, issuerCertificate: Certificate, crypto: ICryptoEngine): js.Promise[CertificateStatus] = js.native
  
  /**
    * Make signature for current OCSP Basic Response
    * @param privateKey Private key for "subjectPublicKeyInfo" structure
    * @param hashAlgorithm Hashing algorithm. Default SHA-1
    * @param crypto Crypto engine
    */
  def sign(privateKey: CryptoKey): js.Promise[Unit] = js.native
  def sign(privateKey: CryptoKey, hashAlgorithm: String): js.Promise[Unit] = js.native
  def sign(privateKey: CryptoKey, hashAlgorithm: String, crypto: ICryptoEngine): js.Promise[Unit] = js.native
  def sign(privateKey: CryptoKey, hashAlgorithm: Unit, crypto: ICryptoEngine): js.Promise[Unit] = js.native
  
  /**
    * Verify existing OCSP Basic Response
    * @param params Additional parameters
    * @param crypto Crypto engine
    */
  def verify(): js.Promise[Boolean] = js.native
  def verify(params: Unit, crypto: ICryptoEngine): js.Promise[Boolean] = js.native
  def verify(params: BasicOCSPResponseVerifyParams): js.Promise[Boolean] = js.native
  def verify(params: BasicOCSPResponseVerifyParams, crypto: ICryptoEngine): js.Promise[Boolean] = js.native
}
