package typings.pkijs.mod

import typings.pkijs.anon.EcdhPrivateKey
import typings.pkijs.anon.HmacHashAlgorithm
import typings.pkijs.anon.PreDefinedData
import typings.std.Algorithm
import typings.std.CryptoKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the EnvelopedData structure described in [RFC5652](https://datatracker.ietf.org/doc/html/rfc5652)
  *
  * @example The following example demonstrates how to create and encrypt CMS Enveloped Data
  * ```js
  * const cmsEnveloped = new pkijs.EnvelopedData();
  *
  * // Add recipient
  * cmsEnveloped.addRecipientByCertificate(cert, { oaepHashAlgorithm: "SHA-256" });
  *
  * // Secret key algorithm
  * const alg = {
  *   name: "AES-GCM",
  *   length: 256,
  * }
  * await cmsEnveloped.encrypt(alg, dataToEncrypt);
  *
  * // Add Enveloped Data into CMS Content Info
  * const cmsContent = new pkijs.ContentInfo();
  * cmsContent.contentType = pkijs.ContentInfo.ENVELOPED_DATA;
  * cmsContent.content = cmsEnveloped.toSchema();
  *
  * const cmsContentRaw = cmsContent.toSchema().toBER();
  * ```
  *
  * @example The following example demonstrates how to decrypt CMS Enveloped Data
  * ```js
  * // Get a "crypto" extension
  * const crypto = pkijs.getCrypto();
  *
  * // Parse CMS Content Info
  * const cmsContent = pkijs.ContentInfo.fromBER(cmsContentRaw);
  * if (cmsContent.contentType !== pkijs.ContentInfo.ENVELOPED_DATA) {
  *   throw new Error("CMS is not Enveloped Data");
  * }
  * // Parse CMS Enveloped Data
  * const cmsEnveloped = new pkijs.EnvelopedData({ schema: cmsContent.content });
  *
  * // Export private key to PKCS#8
  * const pkcs8 = await crypto.exportKey("pkcs8", keys.privateKey);
  *
  * // Decrypt data
  * const decryptedData = await cmsEnveloped.decrypt(0, {
  *   recipientCertificate: cert,
  *   recipientPrivateKey: pkcs8,
  * });
  * ```
  */
@JSImport("pkijs", "EnvelopedData")
@js.native
/**
  * Initializes a new instance of the {@link EnvelopedData} class
  * @param parameters Initialization parameters
  */
open class EnvelopedData ()
  extends PkiObject
     with IEnvelopedData
     with _SafeContent {
  def this(parameters: EnvelopedDataParameters) = this()
  
  /**
    * Add a "RecipientInfo" using a KeyAgreeRecipientInfo of type RecipientKeyIdentifier.
    * @param recipientIdentifier Recipient identifier
    * @param encryptionParameters Additional parameters for "fine tuning" the encryption process
    * @param extraRecipientInfoParams Additional params for KeyAgreeRecipientInfo
    * @param crypto Crypto engine
    */
  /* private */ var _addKeyAgreeRecipientInfo: Any = js.native
  
  /**
    * Helpers function for filling "RecipientInfo" based on recipient's certificate.
    * Problem with WebCrypto is that for RSA certificates we have only one option - "key transport" and
    * for ECC certificates we also have one option - "key agreement". As soon as Google will implement
    * DH algorithm it would be possible to use "key agreement" also for RSA certificates.
    * @param certificate Recipient's certificate
    * @param parameters Additional parameters necessary for "fine tunning" of encryption process
    * @param variant Variant = 1 is for "key transport", variant = 2 is for "key agreement". In fact the "variant" is unnecessary now because Google has no DH algorithm implementation. Thus key encryption scheme would be choosen by certificate type only: "key transport" for RSA and "key agreement" for ECC certificates.
    * @param crypto Crypto engine
    */
  def addRecipientByCertificate(certificate: Certificate): Boolean = js.native
  def addRecipientByCertificate(certificate: Certificate, parameters: js.Object): Boolean = js.native
  def addRecipientByCertificate(certificate: Certificate, parameters: js.Object, variant: Double): Boolean = js.native
  def addRecipientByCertificate(certificate: Certificate, parameters: js.Object, variant: Double, crypto: ICryptoEngine): Boolean = js.native
  def addRecipientByCertificate(certificate: Certificate, parameters: js.Object, variant: Unit, crypto: ICryptoEngine): Boolean = js.native
  def addRecipientByCertificate(certificate: Certificate, parameters: Unit, variant: Double): Boolean = js.native
  def addRecipientByCertificate(certificate: Certificate, parameters: Unit, variant: Double, crypto: ICryptoEngine): Boolean = js.native
  def addRecipientByCertificate(certificate: Certificate, parameters: Unit, variant: Unit, crypto: ICryptoEngine): Boolean = js.native
  
  /**
    * Add a "RecipientInfo" using a KeyAgreeRecipientInfo of type RecipientKeyIdentifier.
    * @param key Recipient's public key
    * @param keyId The id for the recipient's public key
    * @param parameters Additional parameters for "fine tuning" the encryption process
    * @param crypto Crypto engine
    */
  def addRecipientByKeyIdentifier(): Unit = js.native
  def addRecipientByKeyIdentifier(key: Unit, keyId: js.typedarray.ArrayBuffer): Unit = js.native
  def addRecipientByKeyIdentifier(key: Unit, keyId: js.typedarray.ArrayBuffer, parameters: Any): Unit = js.native
  def addRecipientByKeyIdentifier(key: Unit, keyId: js.typedarray.ArrayBuffer, parameters: Any, crypto: ICryptoEngine): Unit = js.native
  def addRecipientByKeyIdentifier(key: Unit, keyId: js.typedarray.ArrayBuffer, parameters: Unit, crypto: ICryptoEngine): Unit = js.native
  def addRecipientByKeyIdentifier(key: Unit, keyId: Unit, parameters: Any): Unit = js.native
  def addRecipientByKeyIdentifier(key: Unit, keyId: Unit, parameters: Any, crypto: ICryptoEngine): Unit = js.native
  def addRecipientByKeyIdentifier(key: Unit, keyId: Unit, parameters: Unit, crypto: ICryptoEngine): Unit = js.native
  def addRecipientByKeyIdentifier(key: CryptoKey): Unit = js.native
  def addRecipientByKeyIdentifier(key: CryptoKey, keyId: js.typedarray.ArrayBuffer): Unit = js.native
  def addRecipientByKeyIdentifier(key: CryptoKey, keyId: js.typedarray.ArrayBuffer, parameters: Any): Unit = js.native
  def addRecipientByKeyIdentifier(key: CryptoKey, keyId: js.typedarray.ArrayBuffer, parameters: Any, crypto: ICryptoEngine): Unit = js.native
  def addRecipientByKeyIdentifier(key: CryptoKey, keyId: js.typedarray.ArrayBuffer, parameters: Unit, crypto: ICryptoEngine): Unit = js.native
  def addRecipientByKeyIdentifier(key: CryptoKey, keyId: Unit, parameters: Any): Unit = js.native
  def addRecipientByKeyIdentifier(key: CryptoKey, keyId: Unit, parameters: Any, crypto: ICryptoEngine): Unit = js.native
  def addRecipientByKeyIdentifier(key: CryptoKey, keyId: Unit, parameters: Unit, crypto: ICryptoEngine): Unit = js.native
  
  def addRecipientByPreDefinedData(preDefinedData: js.typedarray.ArrayBuffer, parameters: Unit, variant: Double): Unit = js.native
  def addRecipientByPreDefinedData(
    preDefinedData: js.typedarray.ArrayBuffer,
    parameters: Unit,
    variant: Double,
    crypto: ICryptoEngine
  ): Unit = js.native
  /**
    * Add recipient based on pre-defined data like password or KEK
    * @param preDefinedData ArrayBuffer with pre-defined data
    * @param parameters Additional parameters necessary for "fine tunning" of encryption process
    * @param variant Variant = 1 for pre-defined "key encryption key" (KEK). Variant = 2 for password-based encryption.
    * @param crypto Crypto engine
    */
  def addRecipientByPreDefinedData(preDefinedData: js.typedarray.ArrayBuffer, parameters: HmacHashAlgorithm, variant: Double): Unit = js.native
  def addRecipientByPreDefinedData(
    preDefinedData: js.typedarray.ArrayBuffer,
    parameters: HmacHashAlgorithm,
    variant: Double,
    crypto: ICryptoEngine
  ): Unit = js.native
  
  /**
    * Decrypts existing CMS Enveloped Data content
    * @param recipientIndex Index of recipient
    * @param parameters Additional parameters
    * @param crypto Crypto engine
    */
  def decrypt(recipientIndex: Double, parameters: PreDefinedData): js.Promise[Any] = js.native
  def decrypt(recipientIndex: Double, parameters: PreDefinedData, crypto: ICryptoEngine): js.Promise[Any] = js.native
  
  /**
    * Creates a new CMS Enveloped Data content with encrypted data
    * @param contentEncryptionAlgorithm WebCrypto algorithm. For the moment here could be only "AES-CBC" or "AES-GCM" algorithms.
    * @param contentToEncrypt Content to encrypt
    * @param crypto Crypto engine
    */
  def encrypt(contentEncryptionAlgorithm: Algorithm, contentToEncrypt: js.typedarray.ArrayBuffer): js.Promise[js.Array[Unit | EcdhPrivateKey]] = js.native
  def encrypt(
    contentEncryptionAlgorithm: Algorithm,
    contentToEncrypt: js.typedarray.ArrayBuffer,
    crypto: ICryptoEngine
  ): js.Promise[js.Array[Unit | EcdhPrivateKey]] = js.native
  
  /**
    * Encrypted content information
    */
  /* CompleteClass */
  var encryptedContentInfo: EncryptedContentInfo = js.native
  
  /**
    * Collection of per-recipient information. There MUST be at least one element in the collection.
    */
  /* CompleteClass */
  var recipientInfos: js.Array[RecipientInfo] = js.native
  
  /**
    * Version number.
    *
    * The appropriate value depends on `originatorInfo`, `RecipientInfo`, and `unprotectedAttrs`.
    *
    * The version MUST be assigned as follows:
    * ```
    * IF (originatorInfo is present) AND
    *    ((any certificates with a type of other are present) OR
    *    (any crls with a type of other are present))
    * THEN version is 4
    * ELSE
    *    IF ((originatorInfo is present) AND
    *       (any version 2 attribute certificates are present)) OR
    *       (any RecipientInfo structures include pwri) OR
    *       (any RecipientInfo structures include ori)
    *    THEN version is 3
    *    ELSE
    *       IF (originatorInfo is absent) AND
    *          (unprotectedAttrs is absent) AND
    *          (all RecipientInfo structures are version 0)
    *       THEN version is 0
    *       ELSE version is 2
    * ```
    */
  /* CompleteClass */
  var version: Double = js.native
}
object EnvelopedData {
  
  @JSImport("pkijs", "EnvelopedData")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("pkijs", "EnvelopedData.CLASS_NAME")
  @js.native
  def CLASS_NAME: String = js.native
  inline def CLASS_NAME_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CLASS_NAME")(x.asInstanceOf[js.Any])
  
  /**
    * Compare values with default values for all class members
    * @param memberName String name for a class member
    * @param memberValue Value to compare with default value
    */
  /* static member */
  inline def compareWithDefault(memberName: String, memberValue: Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("compareWithDefault")(memberName.asInstanceOf[js.Any], memberValue.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  /* static member */
  inline def defaultValues(memberName: /* "encryptedContentInfo" */ String): EncryptedContentInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultValues")(memberName.asInstanceOf[js.Any]).asInstanceOf[EncryptedContentInfo]
  
  /* static member */
  inline def defaultValues_Array(memberName: /* "recipientInfos" */ /* "unprotectedAttrs" */ String): js.Array[RecipientInfo] = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultValues")(memberName.asInstanceOf[js.Any]).asInstanceOf[js.Array[RecipientInfo]]
  
  /**
    * Returns default values for all class members
    * @param memberName String name for a class member
    * @returns Default value
    */
  /* static member */
  inline def defaultValues_Double(memberName: /* "version" */ String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultValues")(memberName.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  /* static member */
  inline def defaultValues_OriginatorInfo(memberName: /* "originatorInfo" */ String): OriginatorInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultValues")(memberName.asInstanceOf[js.Any]).asInstanceOf[OriginatorInfo]
  
  /**
    * @inheritdoc
    * @asn ASN.1 schema
    * ```asn
    * EnvelopedData ::= SEQUENCE {
    *    version CMSVersion,
    *    originatorInfo [0] IMPLICIT OriginatorInfo OPTIONAL,
    *    recipientInfos RecipientInfos,
    *    encryptedContentInfo EncryptedContentInfo,
    *    unprotectedAttrs [1] IMPLICIT UnprotectedAttributes OPTIONAL }
    *```
    */
  /* static member */
  inline def schema(): SchemaType = ^.asInstanceOf[js.Dynamic].applyDynamic("schema")().asInstanceOf[SchemaType]
  inline def schema(parameters: SchemaParameters[typings.pkijs.anon.OriginatorInfo]): SchemaType = ^.asInstanceOf[js.Dynamic].applyDynamic("schema")(parameters.asInstanceOf[js.Any]).asInstanceOf[SchemaType]
}
