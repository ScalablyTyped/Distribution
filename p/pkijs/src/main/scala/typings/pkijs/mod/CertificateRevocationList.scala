package typings.pkijs.mod

import typings.asn1js.mod.Sequence
import typings.std.CryptoKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the CertificateRevocationList structure described in [RFC5280](https://datatracker.ietf.org/doc/html/rfc5280)
  */
@js.native
trait CertificateRevocationList
  extends StObject
     with PkiObject
     with ICertificateRevocationList
     with SignedDataCRL {
  
  /* protected */ def encodeTBS(): Sequence = js.native
  
  /**
    * Returns `true` if supplied certificate is revoked, otherwise `false`
    * @param certificate
    */
  def isCertificateRevoked(certificate: Certificate): Boolean = js.native
  
  /**
    * Make a signature for existing CRL data
    * @param privateKey Private key for "subjectPublicKeyInfo" structure
    * @param hashAlgorithm Hashing algorithm. Default SHA-1
    * @param crypto Crypto engine
    */
  def sign(privateKey: CryptoKey): js.Promise[Unit] = js.native
  def sign(privateKey: CryptoKey, hashAlgorithm: String): js.Promise[Unit] = js.native
  def sign(privateKey: CryptoKey, hashAlgorithm: String, crypto: ICryptoEngine): js.Promise[Unit] = js.native
  def sign(privateKey: CryptoKey, hashAlgorithm: Unit, crypto: ICryptoEngine): js.Promise[Unit] = js.native
  
  var tbsView: js.typedarray.Uint8Array = js.native
  
  /**
    * @deprecated Since version 3.0.0
    */
  @JSName("tbs")
  def tbs_MCertificateRevocationList: js.typedarray.ArrayBuffer = js.native
  
  /**
    * Verify existing signature
    * @param parameters
    * @param crypto Crypto engine
    */
  def verify(): js.Promise[Boolean] = js.native
  def verify(parameters: Unit, crypto: ICryptoEngine): js.Promise[Boolean] = js.native
  def verify(parameters: CertificateRevocationListVerifyParams): js.Promise[Boolean] = js.native
  def verify(parameters: CertificateRevocationListVerifyParams, crypto: ICryptoEngine): js.Promise[Boolean] = js.native
}
