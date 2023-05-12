package typings.mongodbClientEncryption.mod

import typings.mongodbClientEncryption.anon.Collection
import typings.mongodbClientEncryption.anon.CreateCollectionOptions
import typings.node.bufferMod.global.Buffer
import typings.std.Document
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mongodb-client-encryption", "ClientEncryption")
@js.native
open class ClientEncryption protected () extends StObject {
  /**
    * Create a new encryption instance.
    * @param client The client used for encryption
    * @param options Additional settings
    */
  def this(
    client: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify MongoClient */ Any,
    options: ClientEncryptionOptions
  ) = this()
  
  /**
    * Adds a keyAltName to a key identified by the provided `id`.
    *
    * This method resolves to/returns the *old* key value (prior to adding the new altKeyName).
    *
    * @param id - The id of the document to update.
    * @param keyAltName - a keyAltName to search for a key
    */
  def addKeyAltName(
    id: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Binary */ Any,
    keyAltName: String
  ): js.Promise[DataKey | Null] = js.native
  
  /**
    * Creates a data key used for explicit encryption and inserts it into the key vault namespace
    * @param provider The KMS provider used for this data key. Must be `'aws'`, `'azure'`, `'gcp'`, or `'local'`
    */
  def createDataKey(provider: ClientEncryptionDataKeyProvider): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Binary */ Any
  ] = js.native
  /**
    * Creates a data key used for explicit encryption and inserts it into the key vault namespace
    * @param provider The KMS provider used for this data key. Must be `'aws'`, `'azure'`, `'gcp'`, or `'local'`
    * @param callback Callback to invoke when key is created
    */
  def createDataKey(provider: ClientEncryptionDataKeyProvider, callback: ClientEncryptionCreateDataKeyCallback): Unit = js.native
  /**
    * Creates a data key used for explicit encryption and inserts it into the key vault namespace
    * @param provider The KMS provider used for this data key. Must be `'aws'`, `'azure'`, `'gcp'`, or `'local'`
    * @param options Options for creating the data key
    */
  def createDataKey(provider: ClientEncryptionDataKeyProvider, options: ClientEncryptionCreateDataKeyProviderOptions): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Binary */ Any
  ] = js.native
  /**
    * Creates a data key used for explicit encryption and inserts it into the key vault namespace
    * @param provider The KMS provider used for this data key. Must be `'aws'`, `'azure'`, `'gcp'`, or `'local'`
    * @param options Options for creating the data key
    * @param callback Callback to invoke when key is created
    */
  def createDataKey(
    provider: ClientEncryptionDataKeyProvider,
    options: ClientEncryptionCreateDataKeyProviderOptions,
    callback: ClientEncryptionCreateDataKeyCallback
  ): Unit = js.native
  
  /**
    * A convenience method for creating an encrypted collection.
    * This method will create data keys for any encryptedFields that do not have a `keyId` defined
    * and then create a new collection with the full set of encryptedFields.
    *
    * @param db - A Node.js driver Db object with which to create the collection
    * @param name - The name of the new collection
    * @param options - Options for createDataKey and for createCollection. A provider and partially created encryptedFields **must** be provided.
    * @throws {MongoCryptCreateDataKeyForEncryptedCollectionError} - If part way through the process a createDataKey invocation fails, an error will be rejected that has the partial `encryptedFields` that were created.
    * @throws {MongoCryptCreateEncryptedCollectionError} - If creating the collection fails, an error will be rejected that has the entire `encryptedFields` that were created.
    */
  def createEncryptedCollection[TSchema /* <: Document */](
    db: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Db */ Any,
    name: String,
    options: CreateCollectionOptions
  ): js.Promise[Collection] = js.native
  
  def decrypt(
    value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Binary */ Any
  ): js.Promise[Any] = js.native
  def decrypt(
    value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Binary */ Any,
    callback: ClientEncryptionDecryptCallback
  ): Unit = js.native
  /**
    * Explicitly decrypt a provided encrypted value
    * @param value An encrypted value
    */
  def decrypt(value: Buffer): js.Promise[Any] = js.native
  /**
    * Explicitly decrypt a provided encrypted value
    * @param value An encrypted value
    * @param callback Callback to invoke when value is decrypted
    */
  def decrypt(value: Buffer, callback: ClientEncryptionDecryptCallback): Unit = js.native
  
  /**
    * Deletes the key with the provided id from the keyvault, if it exists.
    *
    * @param id - the id of the document to delete.
    */
  def deleteKey(
    id: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Binary */ Any
  ): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DeleteResult */ Any
  ] = js.native
  
  /**
    * Explicitly encrypt a provided value.
    * Note that either options.keyId or options.keyAltName must be specified.
    * Specifying both options.keyId and options.keyAltName is considered an error.
    * @param value The value that you wish to serialize. Must be of a type that can be serialized into BSON
    * @param options
    */
  def encrypt(value: Any, options: ClientEncryptionEncryptOptions): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Binary */ Any
  ] = js.native
  /**
    * Explicitly encrypt a provided value.
    * Note that either options.keyId or options.keyAltName must be specified.
    * Specifying both options.keyId and options.keyAltName is considered an error.
    * @param value The value that you wish to serialize. Must be of a type that can be serialized into BSON
    * @param options
    * @param callback Callback to invoke when value is encrypted
    */
  def encrypt(value: Any, options: ClientEncryptionEncryptOptions, callback: ClientEncryptionEncryptCallback): Unit = js.native
  
  /**
    * Encrypts a Match Expression or Aggregate Expression to query a range index.
    *
    * Only supported when queryType is "rangePreview" and algorithm is "RangePreview".
    *
    * @experimental The Range algorithm is experimental only. It is not intended for production use. It is subject to breaking changes.The aggregation or match expression you wish to encrypt.  The value must be in the form
    *
    * The expression to encrypt must be one of the following:
    *  1. A Match Expression of this form:
    *      `{$and: [{<field>: {$gt: <value1>}}, {<field>: {$lt: <value2> }}]}`
    *  2. An Aggregate Expression of this form:
    *      `{$and: [{$gt: [<fieldpath>, <value1>]}, {$lt: [<fieldpath>, <value2>]}]}`
    *
    *    `$gt` may also be `$gte`. `$lt` may also be `$lte`.
    */
  def encryptExpression(value: Document, options: ClientEncryptionEncryptOptions): js.Promise[Document] = js.native
  
  /**
    * Finds a key in the keyvault with the specified key.
    *
    * @param id - the id of the document to delete.
    */
  def getKey(
    id: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Binary */ Any
  ): js.Promise[DataKey | Null] = js.native
  
  /**
    * Finds a key in the keyvault which has the specified keyAltNames as a keyAltName.
    *
    * @param keyAltName - a potential keyAltName to search for in the keyAltNames array
    */
  def getKeyByAltName(keyAltName: String): js.Promise[DataKey | Null] = js.native
  
  /**
    * Finds all the keys currently stored in the keyvault.
    *
    * This method will not throw.
    */
  def getKeys(): Any = js.native
  
  /**
    * Adds a keyAltName to a key identified by the provided `id`.
    *
    * This method resolves to/returns the *old* key value (prior to removing the new altKeyName).
    *
    * If the removed keyAltName is the last keyAltName for that key, the `altKeyNames` property is unset from the document.
    *
    * @param id - the id of the document to update.
    * @param keyAltName - a keyAltName to search for a key
    */
  def removeKeyAltName(
    id: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Binary */ Any,
    keyAltName: String
  ): js.Promise[DataKey | Null] = js.native
  
  /**
    * Searches the keyvault for any data keys matching the provided filter.  If there are matches, rewrapManyDataKey then attempts to re-wrap the data keys using the provided options.
    *
    * If no matches are found, then no bulk write is performed.
    */
  def rewrapManyDataKey(filter: Document): js.Promise[ClientEncryptionRewrapManyDataKeyResult] = js.native
  def rewrapManyDataKey(filter: Document, options: ClientEncryptionRewrapManyDataKeyProviderOptions): js.Promise[ClientEncryptionRewrapManyDataKeyResult] = js.native
}
/* static members */
object ClientEncryption {
  
  @JSImport("mongodb-client-encryption", "ClientEncryption.libmongocryptVersion")
  @js.native
  val libmongocryptVersion: String = js.native
}
