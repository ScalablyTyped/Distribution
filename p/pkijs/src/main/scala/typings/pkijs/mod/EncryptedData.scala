package typings.pkijs.mod

import typings.pkijs.anon.Password
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the EncryptedData structure described in [RFC5652](https://datatracker.ietf.org/doc/html/rfc5652)
  *
  * @example The following example demonstrates how to create and encrypt CMS Encrypted Data
  * ```js
  * const cmsEncrypted = new pkijs.EncryptedData();
  *
  * await cmsEncrypted.encrypt({
  *   contentEncryptionAlgorithm: {
  *     name: "AES-GCM",
  *     length: 256,
  *   },
  *   hmacHashAlgorithm: "SHA-256",
  *   iterationCount: 1000,
  *   password: password,
  *   contentToEncrypt: dataToEncrypt,
  * });
  *
  * // Add Encrypted Data into CMS Content Info
  * const cmsContent = new pkijs.ContentInfo();
  * cmsContent.contentType = pkijs.ContentInfo.ENCRYPTED_DATA;
  * cmsContent.content = cmsEncrypted.toSchema();
  *
  * const cmsContentRaw = cmsContent.toSchema().toBER();
  * ```
  *
  * @example The following example demonstrates how to decrypt CMS Encrypted Data
  * ```js
  * // Parse CMS Content Info
  * const cmsContent = pkijs.ContentInfo.fromBER(cmsContentRaw);
  * if (cmsContent.contentType !== pkijs.ContentInfo.ENCRYPTED_DATA) {
  *   throw new Error("CMS is not Encrypted Data");
  * }
  * // Parse CMS Encrypted Data
  * const cmsEncrypted = new pkijs.EncryptedData({ schema: cmsContent.content });
  *
  * // Decrypt data
  * const decryptedData = await cmsEncrypted.decrypt({
  *   password: password,
  * });
  * ```
  */
@JSImport("pkijs", "EncryptedData")
@js.native
/**
  * Initializes a new instance of the {@link EncryptedData} class
  * @param parameters Initialization parameters
  */
open class EncryptedData ()
  extends PkiObject
     with IEncryptedData
     with _SafeContent {
  def this(parameters: EncryptedDataParameters) = this()
  
  /**
    * Creates a new CMS Encrypted Data content
    * @param parameters Parameters necessary for encryption
    * @param crypto Crypto engine
    * @returns Returns decrypted raw data
    */
  def decrypt(parameters: Password): js.Promise[js.typedarray.ArrayBuffer] = js.native
  def decrypt(parameters: Password, crypto: ICryptoEngine): js.Promise[js.typedarray.ArrayBuffer] = js.native
  
  /**
    * Creates a new CMS Encrypted Data content
    * @param parameters Parameters necessary for encryption
    */
  def encrypt(parameters: EncryptedDataEncryptParams): js.Promise[Unit] = js.native
  
  /**
    * Encrypted content information
    */
  /* CompleteClass */
  var encryptedContentInfo: EncryptedContentInfo = js.native
  
  /**
    * Version number.
    *
    * If `unprotectedAttrs` is present, then the version MUST be 2. If `unprotectedAttrs` is absent, then version MUST be 0.
    */
  /* CompleteClass */
  var version: Double = js.native
}
object EncryptedData {
  
  @JSImport("pkijs", "EncryptedData")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("pkijs", "EncryptedData.CLASS_NAME")
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
  inline def defaultValues_Array(memberName: /* "unprotectedAttrs" */ String): js.Array[Attribute] = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultValues")(memberName.asInstanceOf[js.Any]).asInstanceOf[js.Array[Attribute]]
  
  /**
    * Returns default values for all class members
    * @param memberName String name for a class member
    * @returns Default value
    */
  /* static member */
  inline def defaultValues_Double(memberName: /* "version" */ String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultValues")(memberName.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  /**
    * @inheritdoc
    * @asn ASN.1 schema
    * ```asn
    * EncryptedData ::= SEQUENCE {
    *    version CMSVersion,
    *    encryptedContentInfo EncryptedContentInfo,
    *    unprotectedAttrs [1] IMPLICIT UnprotectedAttributes OPTIONAL }
    *```
    */
  /* static member */
  inline def schema(): SchemaType = ^.asInstanceOf[js.Dynamic].applyDynamic("schema")().asInstanceOf[SchemaType]
  inline def schema(parameters: SchemaParameters[typings.pkijs.anon.EncryptedContentInfo]): SchemaType = ^.asInstanceOf[js.Dynamic].applyDynamic("schema")(parameters.asInstanceOf[js.Any]).asInstanceOf[SchemaType]
}
