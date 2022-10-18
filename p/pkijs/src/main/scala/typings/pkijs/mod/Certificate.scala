package typings.pkijs.mod

import typings.asn1js.mod.Sequence
import typings.std.CryptoKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents an X.509 certificate described in [RFC5280 Section 4](https://datatracker.ietf.org/doc/html/rfc5280#section-4).
  *
  * @example The following example demonstrates how to parse X.509 Certificate
  * ```js
  * const asn1 = asn1js.fromBER(raw);
  * if (asn1.offset === -1) {
  *   throw new Error("Incorrect encoded ASN.1 data");
  * }
  *
  * const cert = new pkijs.Certificate({ schema: asn1.result });
  * ```
  *
  * @example The following example demonstrates how to create self-signed certificate
  * ```js
  * const crypto = pkijs.getCrypto(true);
  *
  * // Create certificate
  * const certificate = new pkijs.Certificate();
  * certificate.version = 2;
  * certificate.serialNumber = new asn1js.Integer({ value: 1 });
  * certificate.issuer.typesAndValues.push(new pkijs.AttributeTypeAndValue({
  *   type: "2.5.4.3", // Common name
  *   value: new asn1js.BmpString({ value: "Test" })
  * }));
  * certificate.subject.typesAndValues.push(new pkijs.AttributeTypeAndValue({
  *   type: "2.5.4.3", // Common name
  *   value: new asn1js.BmpString({ value: "Test" })
  * }));
  *
  * certificate.notBefore.value = new Date();
  * const notAfter = new Date();
  * notAfter.setUTCFullYear(notAfter.getUTCFullYear() + 1);
  * certificate.notAfter.value = notAfter;
  *
  * certificate.extensions = []; // Extensions are not a part of certificate by default, it's an optional array
  *
  * // "BasicConstraints" extension
  * const basicConstr = new pkijs.BasicConstraints({
  *   cA: true,
  *   pathLenConstraint: 3
  * });
  * certificate.extensions.push(new pkijs.Extension({
  *   extnID: "2.5.29.19",
  *   critical: false,
  *   extnValue: basicConstr.toSchema().toBER(false),
  *   parsedValue: basicConstr // Parsed value for well-known extensions
  * }));
  *
  * // "KeyUsage" extension
  * const bitArray = new ArrayBuffer(1);
  * const bitView = new Uint8Array(bitArray);
  * bitView[0] |= 0x02; // Key usage "cRLSign" flag
  * bitView[0] |= 0x04; // Key usage "keyCertSign" flag
  * const keyUsage = new asn1js.BitString({ valueHex: bitArray });
  * certificate.extensions.push(new pkijs.Extension({
  *   extnID: "2.5.29.15",
  *   critical: false,
  *   extnValue: keyUsage.toBER(false),
  *   parsedValue: keyUsage // Parsed value for well-known extensions
  * }));
  *
  * const algorithm = pkijs.getAlgorithmParameters("RSASSA-PKCS1-v1_5", "generateKey");
  * if ("hash" in algorithm.algorithm) {
  *   algorithm.algorithm.hash.name = "SHA-256";
  * }
  *
  * const keys = await crypto.generateKey(algorithm.algorithm, true, algorithm.usages);
  *
  * // Exporting public key into "subjectPublicKeyInfo" value of certificate
  * await certificate.subjectPublicKeyInfo.importKey(keys.publicKey);
  *
  * // Signing final certificate
  * await certificate.sign(keys.privateKey, "SHA-256");
  *
  * const raw = certificate.toSchema().toBER();
  * ```
  */
@js.native
trait Certificate
  extends StObject
     with PkiObject
     with ICertificate
     with CertificateSetItem {
  
  /**
    * Creates ASN.1 schema for existing values of TBS part for the certificate
    * @returns ASN.1 SEQUENCE
    */
  def encodeTBS(): Sequence = js.native
  
  /**
    * Get hash value for subject public key (default SHA-1)
    * @param hashAlgorithm Hashing algorithm name
    * @param crypto Crypto engine
    * @returns Computed hash value from `Certificate.tbsCertificate.subjectPublicKeyInfo.subjectPublicKey`
    */
  def getKeyHash(): js.Promise[js.typedarray.ArrayBuffer] = js.native
  def getKeyHash(hashAlgorithm: String): js.Promise[js.typedarray.ArrayBuffer] = js.native
  def getKeyHash(hashAlgorithm: String, crypto: ICryptoEngine): js.Promise[js.typedarray.ArrayBuffer] = js.native
  def getKeyHash(hashAlgorithm: Unit, crypto: ICryptoEngine): js.Promise[js.typedarray.ArrayBuffer] = js.native
  
  /**
    * Importing public key for current certificate
    * @param parameters Public key export parameters
    * @param crypto Crypto engine
    * @returns WebCrypto public key
    */
  def getPublicKey(): js.Promise[CryptoKey] = js.native
  def getPublicKey(parameters: Unit, crypto: ICryptoEngine): js.Promise[CryptoKey] = js.native
  def getPublicKey(parameters: CryptoEnginePublicKeyParams): js.Promise[CryptoKey] = js.native
  def getPublicKey(parameters: CryptoEnginePublicKeyParams, crypto: ICryptoEngine): js.Promise[CryptoKey] = js.native
  
  /**
    * Make a signature for current value from TBS section
    * @param privateKey Private key for SUBJECT_PUBLIC_KEY_INFO structure
    * @param hashAlgorithm Hashing algorithm
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
  def tbs_MCertificate: js.typedarray.ArrayBuffer = js.native
  
  /**
    * Verifies the certificate signature
    * @param issuerCertificate
    * @param crypto Crypto engine
    */
  def verify(): js.Promise[Boolean] = js.native
  def verify(issuerCertificate: Unit, crypto: ICryptoEngine): js.Promise[Boolean] = js.native
  def verify(issuerCertificate: Certificate): js.Promise[Boolean] = js.native
  def verify(issuerCertificate: Certificate, crypto: ICryptoEngine): js.Promise[Boolean] = js.native
}
