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
@js.native
trait EncryptedData
  extends StObject
     with PkiObject
     with IEncryptedData
     with _SafeContent {
  
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
}
