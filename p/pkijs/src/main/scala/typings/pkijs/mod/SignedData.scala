package typings.pkijs.mod

import typings.pkijs.anon.SignedDataVerifyParamsext
import typings.pkijs.anon.SignedDataVerifyParamsextCheckChain
import typings.std.BufferSource
import typings.std.CryptoKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the SignedData structure described in [RFC5652](https://datatracker.ietf.org/doc/html/rfc5652)
  *
  * @example The following example demonstrates how to create and sign CMS Signed Data
  * ```js
  * // Create a new CMS Signed Data
  * const cmsSigned = new pkijs.SignedData({
  *   encapContentInfo: new pkijs.EncapsulatedContentInfo({
  *     eContentType: pkijs.ContentInfo.DATA,, // "data" content type
  *     eContent: new asn1js.OctetString({ valueHex: buffer })
  *   }),
  *   signerInfos: [
  *     new pkijs.SignerInfo({
  *       sid: new pkijs.IssuerAndSerialNumber({
  *         issuer: cert.issuer,
  *         serialNumber: cert.serialNumber
  *       })
  *     })
  *   ],
  *   // Signer certificate for chain validation
  *   certificates: [cert]
  * });
  *
  * await cmsSigned.sign(keys.privateKey, 0, "SHA-256");
  *
  * // Add Signed Data to Content Info
  * const cms = new pkijs.ContentInfo({
  *   contentType: pkijs.ContentInfo.SIGNED_DATA,,
  *   content: cmsSigned.toSchema(true),
  * });
  *
  * // Encode CMS to ASN.1
  * const cmsRaw = cms.toSchema().toBER();
  * ```
  *
  * @example The following example demonstrates how to verify CMS Signed Data
  * ```js
  * // Parse CMS and detect it's Signed Data
  * const cms = pkijs.ContentInfo.fromBER(cmsRaw);
  * if (cms.contentType !== pkijs.ContentInfo.SIGNED_DATA) {
  *   throw new Error("CMS is not Signed Data");
  * }
  *
  * // Read Signed Data
  * const signedData = new pkijs.SignedData({ schema: cms.content });
  *
  * // Verify Signed Data signature
  * const ok = await signedData.verify({
  *   signer: 0,
  *   checkChain: true,
  *   trustedCerts: [trustedCert],
  * });
  *
  * if (!ok) {
  *   throw new Error("CMS signature is invalid")
  * }
  * ```
  */
@js.native
trait SignedData
  extends StObject
     with PkiObject
     with ISignedData {
  
  /**
    * Signing current SignedData
    * @param privateKey Private key for "subjectPublicKeyInfo" structure
    * @param signerIndex Index number (starting from 0) of signer index to make signature for
    * @param hashAlgorithm Hashing algorithm. Default SHA-1
    * @param data Detached data
    * @param crypto Crypto engine
    */
  def sign(privateKey: CryptoKey, signerIndex: Double): js.Promise[Unit] = js.native
  def sign(privateKey: CryptoKey, signerIndex: Double, hashAlgorithm: String): js.Promise[Unit] = js.native
  def sign(
    privateKey: CryptoKey,
    signerIndex: Double,
    hashAlgorithm: String,
    data: Unit,
    crypto: ICryptoEngine
  ): js.Promise[Unit] = js.native
  def sign(privateKey: CryptoKey, signerIndex: Double, hashAlgorithm: String, data: BufferSource): js.Promise[Unit] = js.native
  def sign(
    privateKey: CryptoKey,
    signerIndex: Double,
    hashAlgorithm: String,
    data: BufferSource,
    crypto: ICryptoEngine
  ): js.Promise[Unit] = js.native
  def sign(privateKey: CryptoKey, signerIndex: Double, hashAlgorithm: Unit, data: Unit, crypto: ICryptoEngine): js.Promise[Unit] = js.native
  def sign(privateKey: CryptoKey, signerIndex: Double, hashAlgorithm: Unit, data: BufferSource): js.Promise[Unit] = js.native
  def sign(
    privateKey: CryptoKey,
    signerIndex: Double,
    hashAlgorithm: Unit,
    data: BufferSource,
    crypto: ICryptoEngine
  ): js.Promise[Unit] = js.native
  
  def verify(): js.Promise[Boolean] = js.native
  def verify(params: Unit, crypto: ICryptoEngine): js.Promise[Boolean] = js.native
  def verify(params: SignedDataVerifyParamsext): js.Promise[Boolean] = js.native
  def verify(params: SignedDataVerifyParamsextCheckChain): js.Promise[SignedDataVerifyResult] = js.native
  def verify(params: SignedDataVerifyParamsextCheckChain, crypto: ICryptoEngine): js.Promise[SignedDataVerifyResult] = js.native
  def verify(params: SignedDataVerifyParamsext, crypto: ICryptoEngine): js.Promise[Boolean] = js.native
}
