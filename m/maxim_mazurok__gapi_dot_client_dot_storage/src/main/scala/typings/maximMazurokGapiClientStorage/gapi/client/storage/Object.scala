package typings.maximMazurokGapiClientStorage.gapi.client.storage

import org.scalablytyped.runtime.TopLevel
import typings.maximMazurokGapiClientStorage.anon.EncryptionAlgorithm
import typings.maximMazurokGapiClientStorage.anon.Entity
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Object extends StObject {
  
  /** Access controls on the object. */
  var acl: js.UndefOr[js.Array[ObjectAccessControl]] = js.undefined
  
  /** The name of the bucket containing this object. */
  var bucket: js.UndefOr[String] = js.undefined
  
  /** Cache-Control directive for the object data. If omitted, and the object is accessible to all anonymous users, the default will be public, max-age=3600. */
  var cacheControl: js.UndefOr[String] = js.undefined
  
  /** Number of underlying components that make up this object. Components are accumulated by compose operations. */
  var componentCount: js.UndefOr[Double] = js.undefined
  
  /** Content-Disposition of the object data. */
  var contentDisposition: js.UndefOr[String] = js.undefined
  
  /** Content-Encoding of the object data. */
  var contentEncoding: js.UndefOr[String] = js.undefined
  
  /** Content-Language of the object data. */
  var contentLanguage: js.UndefOr[String] = js.undefined
  
  /** Content-Type of the object data. If an object is stored without a Content-Type, it is served as application/octet-stream. */
  var contentType: js.UndefOr[String] = js.undefined
  
  /**
    * CRC32c checksum, as described in RFC 4960, Appendix B; encoded using base64 in big-endian byte order. For more information about using the CRC32c checksum, see Hashes and ETags:
    * Best Practices.
    */
  var crc32c: js.UndefOr[String] = js.undefined
  
  /** A timestamp in RFC 3339 format specified by the user for an object. */
  var customTime: js.UndefOr[String] = js.undefined
  
  /** Metadata of customer-supplied encryption key, if the object is encrypted by such a key. */
  var customerEncryption: js.UndefOr[EncryptionAlgorithm] = js.undefined
  
  /** HTTP 1.1 Entity tag for the object. */
  var etag: js.UndefOr[String] = js.undefined
  
  /**
    * Whether an object is under event-based hold. Event-based hold is a way to retain objects until an event occurs, which is signified by the hold's release (i.e. this value is set to
    * false). After being released (set to false), such objects will be subject to bucket-level retention (if any). One sample use case of this flag is for banks to hold loan documents
    * for at least 3 years after loan is paid in full. Here, bucket-level retention is 3 years and the event is the loan being paid in full. In this example, these objects will be held
    * intact for any number of years until the event has occurred (event-based hold on the object is released) and then 3 more years after that. That means retention duration of the
    * objects begins from the moment event-based hold transitioned from true to false.
    */
  var eventBasedHold: js.UndefOr[Boolean] = js.undefined
  
  /** The content generation of this object. Used for object versioning. */
  var generation: js.UndefOr[String] = js.undefined
  
  /** The ID of the object, including the bucket name, object name, and generation number. */
  var id: js.UndefOr[String] = js.undefined
  
  /** The kind of item this is. For objects, this is always storage#object. */
  var kind: js.UndefOr[String] = js.undefined
  
  /** Not currently supported. Specifying the parameter causes the request to fail with status code 400 - Bad Request. */
  var kmsKeyName: js.UndefOr[String] = js.undefined
  
  /** MD5 hash of the data; encoded using base64. For more information about using the MD5 hash, see Hashes and ETags: Best Practices. */
  var md5Hash: js.UndefOr[String] = js.undefined
  
  /** Media download link. */
  var mediaLink: js.UndefOr[String] = js.undefined
  
  /** User-provided metadata, in key/value pairs. */
  var metadata: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: string}
    */ typings.maximMazurokGapiClientStorage.maximMazurokGapiClientStorageStrings.Object & TopLevel[Any]
  ] = js.undefined
  
  /**
    * The version of the metadata for this object at this generation. Used for preconditions and for detecting changes in metadata. A metageneration number is only meaningful in the
    * context of a particular generation of a particular object.
    */
  var metageneration: js.UndefOr[String] = js.undefined
  
  /** The name of the object. Required if not specified by URL parameter. */
  var name: js.UndefOr[String] = js.undefined
  
  /** The owner of the object. This will always be the uploader of the object. */
  var owner: js.UndefOr[Entity] = js.undefined
  
  /**
    * A server-determined value that specifies the earliest time that the object's retention period expires. This value is in RFC 3339 format. Note 1: This field is not provided for
    * objects with an active event-based hold, since retention expiration is unknown until the hold is removed. Note 2: This value can be provided even when temporary hold is set (so that
    * the user can reason about policy without having to first unset the temporary hold).
    */
  var retentionExpirationTime: js.UndefOr[String] = js.undefined
  
  /** The link to this object. */
  var selfLink: js.UndefOr[String] = js.undefined
  
  /** Content-Length of the data in bytes. */
  var size: js.UndefOr[String] = js.undefined
  
  /** Storage class of the object. */
  var storageClass: js.UndefOr[String] = js.undefined
  
  /**
    * Whether an object is under temporary hold. While this flag is set to true, the object is protected against deletion and overwrites. A common use case of this flag is regulatory
    * investigations where objects need to be retained while the investigation is ongoing. Note that unlike event-based hold, temporary hold does not impact retention expiration time of
    * an object.
    */
  var temporaryHold: js.UndefOr[Boolean] = js.undefined
  
  /** The creation time of the object in RFC 3339 format. */
  var timeCreated: js.UndefOr[String] = js.undefined
  
  /** The deletion time of the object in RFC 3339 format. Will be returned if and only if this version of the object has been deleted. */
  var timeDeleted: js.UndefOr[String] = js.undefined
  
  /** The time at which the object's storage class was last changed. When the object is initially created, it will be set to timeCreated. */
  var timeStorageClassUpdated: js.UndefOr[String] = js.undefined
  
  /**
    * The modification time of the object metadata in RFC 3339 format. Set initially to object creation time and then updated whenever any metadata of the object changes. This includes
    * changes made by a requester, such as modifying custom metadata, as well as changes made by Cloud Storage on behalf of a requester, such as changing the storage class based on an
    * Object Lifecycle Configuration.
    */
  var updated: js.UndefOr[String] = js.undefined
}
object Object {
  
  inline def apply(): Object = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Object]
  }
  
  extension [Self <: Object](x: Self) {
    
    inline def setAcl(value: js.Array[ObjectAccessControl]): Self = StObject.set(x, "acl", value.asInstanceOf[js.Any])
    
    inline def setAclUndefined: Self = StObject.set(x, "acl", js.undefined)
    
    inline def setAclVarargs(value: ObjectAccessControl*): Self = StObject.set(x, "acl", js.Array(value*))
    
    inline def setBucket(value: String): Self = StObject.set(x, "bucket", value.asInstanceOf[js.Any])
    
    inline def setBucketUndefined: Self = StObject.set(x, "bucket", js.undefined)
    
    inline def setCacheControl(value: String): Self = StObject.set(x, "cacheControl", value.asInstanceOf[js.Any])
    
    inline def setCacheControlUndefined: Self = StObject.set(x, "cacheControl", js.undefined)
    
    inline def setComponentCount(value: Double): Self = StObject.set(x, "componentCount", value.asInstanceOf[js.Any])
    
    inline def setComponentCountUndefined: Self = StObject.set(x, "componentCount", js.undefined)
    
    inline def setContentDisposition(value: String): Self = StObject.set(x, "contentDisposition", value.asInstanceOf[js.Any])
    
    inline def setContentDispositionUndefined: Self = StObject.set(x, "contentDisposition", js.undefined)
    
    inline def setContentEncoding(value: String): Self = StObject.set(x, "contentEncoding", value.asInstanceOf[js.Any])
    
    inline def setContentEncodingUndefined: Self = StObject.set(x, "contentEncoding", js.undefined)
    
    inline def setContentLanguage(value: String): Self = StObject.set(x, "contentLanguage", value.asInstanceOf[js.Any])
    
    inline def setContentLanguageUndefined: Self = StObject.set(x, "contentLanguage", js.undefined)
    
    inline def setContentType(value: String): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
    
    inline def setContentTypeUndefined: Self = StObject.set(x, "contentType", js.undefined)
    
    inline def setCrc32c(value: String): Self = StObject.set(x, "crc32c", value.asInstanceOf[js.Any])
    
    inline def setCrc32cUndefined: Self = StObject.set(x, "crc32c", js.undefined)
    
    inline def setCustomTime(value: String): Self = StObject.set(x, "customTime", value.asInstanceOf[js.Any])
    
    inline def setCustomTimeUndefined: Self = StObject.set(x, "customTime", js.undefined)
    
    inline def setCustomerEncryption(value: EncryptionAlgorithm): Self = StObject.set(x, "customerEncryption", value.asInstanceOf[js.Any])
    
    inline def setCustomerEncryptionUndefined: Self = StObject.set(x, "customerEncryption", js.undefined)
    
    inline def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    inline def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
    
    inline def setEventBasedHold(value: Boolean): Self = StObject.set(x, "eventBasedHold", value.asInstanceOf[js.Any])
    
    inline def setEventBasedHoldUndefined: Self = StObject.set(x, "eventBasedHold", js.undefined)
    
    inline def setGeneration(value: String): Self = StObject.set(x, "generation", value.asInstanceOf[js.Any])
    
    inline def setGenerationUndefined: Self = StObject.set(x, "generation", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setKmsKeyName(value: String): Self = StObject.set(x, "kmsKeyName", value.asInstanceOf[js.Any])
    
    inline def setKmsKeyNameUndefined: Self = StObject.set(x, "kmsKeyName", js.undefined)
    
    inline def setMd5Hash(value: String): Self = StObject.set(x, "md5Hash", value.asInstanceOf[js.Any])
    
    inline def setMd5HashUndefined: Self = StObject.set(x, "md5Hash", js.undefined)
    
    inline def setMediaLink(value: String): Self = StObject.set(x, "mediaLink", value.asInstanceOf[js.Any])
    
    inline def setMediaLinkUndefined: Self = StObject.set(x, "mediaLink", js.undefined)
    
    inline def setMetadata(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: string}
      */ typings.maximMazurokGapiClientStorage.maximMazurokGapiClientStorageStrings.Object & TopLevel[Any]
    ): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    inline def setMetageneration(value: String): Self = StObject.set(x, "metageneration", value.asInstanceOf[js.Any])
    
    inline def setMetagenerationUndefined: Self = StObject.set(x, "metageneration", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setOwner(value: Entity): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    inline def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
    
    inline def setRetentionExpirationTime(value: String): Self = StObject.set(x, "retentionExpirationTime", value.asInstanceOf[js.Any])
    
    inline def setRetentionExpirationTimeUndefined: Self = StObject.set(x, "retentionExpirationTime", js.undefined)
    
    inline def setSelfLink(value: String): Self = StObject.set(x, "selfLink", value.asInstanceOf[js.Any])
    
    inline def setSelfLinkUndefined: Self = StObject.set(x, "selfLink", js.undefined)
    
    inline def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    inline def setStorageClass(value: String): Self = StObject.set(x, "storageClass", value.asInstanceOf[js.Any])
    
    inline def setStorageClassUndefined: Self = StObject.set(x, "storageClass", js.undefined)
    
    inline def setTemporaryHold(value: Boolean): Self = StObject.set(x, "temporaryHold", value.asInstanceOf[js.Any])
    
    inline def setTemporaryHoldUndefined: Self = StObject.set(x, "temporaryHold", js.undefined)
    
    inline def setTimeCreated(value: String): Self = StObject.set(x, "timeCreated", value.asInstanceOf[js.Any])
    
    inline def setTimeCreatedUndefined: Self = StObject.set(x, "timeCreated", js.undefined)
    
    inline def setTimeDeleted(value: String): Self = StObject.set(x, "timeDeleted", value.asInstanceOf[js.Any])
    
    inline def setTimeDeletedUndefined: Self = StObject.set(x, "timeDeleted", js.undefined)
    
    inline def setTimeStorageClassUpdated(value: String): Self = StObject.set(x, "timeStorageClassUpdated", value.asInstanceOf[js.Any])
    
    inline def setTimeStorageClassUpdatedUndefined: Self = StObject.set(x, "timeStorageClassUpdated", js.undefined)
    
    inline def setUpdated(value: String): Self = StObject.set(x, "updated", value.asInstanceOf[js.Any])
    
    inline def setUpdatedUndefined: Self = StObject.set(x, "updated", js.undefined)
  }
}
