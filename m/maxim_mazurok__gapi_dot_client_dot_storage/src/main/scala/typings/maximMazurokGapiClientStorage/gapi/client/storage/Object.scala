package typings.maximMazurokGapiClientStorage.gapi.client.storage

import org.scalablytyped.runtime.TopLevel
import typings.maximMazurokGapiClientStorage.anon.EncryptionAlgorithm
import typings.maximMazurokGapiClientStorage.anon.Entity
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Object extends js.Object {
  
  /** Access controls on the object. */
  var acl: js.UndefOr[js.Array[ObjectAccessControl]] = js.native
  
  /** The name of the bucket containing this object. */
  var bucket: js.UndefOr[String] = js.native
  
  /** Cache-Control directive for the object data. If omitted, and the object is accessible to all anonymous users, the default will be public, max-age=3600. */
  var cacheControl: js.UndefOr[String] = js.native
  
  /** Number of underlying components that make up this object. Components are accumulated by compose operations. */
  var componentCount: js.UndefOr[Double] = js.native
  
  /** Content-Disposition of the object data. */
  var contentDisposition: js.UndefOr[String] = js.native
  
  /** Content-Encoding of the object data. */
  var contentEncoding: js.UndefOr[String] = js.native
  
  /** Content-Language of the object data. */
  var contentLanguage: js.UndefOr[String] = js.native
  
  /** Content-Type of the object data. If an object is stored without a Content-Type, it is served as application/octet-stream. */
  var contentType: js.UndefOr[String] = js.native
  
  /**
    * CRC32c checksum, as described in RFC 4960, Appendix B; encoded using base64 in big-endian byte order. For more information about using the CRC32c checksum, see Hashes and ETags:
    * Best Practices.
    */
  var crc32c: js.UndefOr[String] = js.native
  
  /** A timestamp in RFC 3339 format specified by the user for an object. */
  var customTime: js.UndefOr[String] = js.native
  
  /** Metadata of customer-supplied encryption key, if the object is encrypted by such a key. */
  var customerEncryption: js.UndefOr[EncryptionAlgorithm] = js.native
  
  /** HTTP 1.1 Entity tag for the object. */
  var etag: js.UndefOr[String] = js.native
  
  /**
    * Whether an object is under event-based hold. Event-based hold is a way to retain objects until an event occurs, which is signified by the hold's release (i.e. this value is set to
    * false). After being released (set to false), such objects will be subject to bucket-level retention (if any). One sample use case of this flag is for banks to hold loan documents
    * for at least 3 years after loan is paid in full. Here, bucket-level retention is 3 years and the event is the loan being paid in full. In this example, these objects will be held
    * intact for any number of years until the event has occurred (event-based hold on the object is released) and then 3 more years after that. That means retention duration of the
    * objects begins from the moment event-based hold transitioned from true to false.
    */
  var eventBasedHold: js.UndefOr[Boolean] = js.native
  
  /** The content generation of this object. Used for object versioning. */
  var generation: js.UndefOr[String] = js.native
  
  /** The ID of the object, including the bucket name, object name, and generation number. */
  var id: js.UndefOr[String] = js.native
  
  /** The kind of item this is. For objects, this is always storage#object. */
  var kind: js.UndefOr[String] = js.native
  
  /** Not currently supported. Specifying the parameter causes the request to fail with status code 400 - Bad Request. */
  var kmsKeyName: js.UndefOr[String] = js.native
  
  /** MD5 hash of the data; encoded using base64. For more information about using the MD5 hash, see Hashes and ETags: Best Practices. */
  var md5Hash: js.UndefOr[String] = js.native
  
  /** Media download link. */
  var mediaLink: js.UndefOr[String] = js.native
  
  /** User-provided metadata, in key/value pairs. */
  var metadata: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: string}
    */ typings.maximMazurokGapiClientStorage.maximMazurokGapiClientStorageStrings.Object with TopLevel[js.Any]
  ] = js.native
  
  /**
    * The version of the metadata for this object at this generation. Used for preconditions and for detecting changes in metadata. A metageneration number is only meaningful in the
    * context of a particular generation of a particular object.
    */
  var metageneration: js.UndefOr[String] = js.native
  
  /** The name of the object. Required if not specified by URL parameter. */
  var name: js.UndefOr[String] = js.native
  
  /** The owner of the object. This will always be the uploader of the object. */
  var owner: js.UndefOr[Entity] = js.native
  
  /**
    * A server-determined value that specifies the earliest time that the object's retention period expires. This value is in RFC 3339 format. Note 1: This field is not provided for
    * objects with an active event-based hold, since retention expiration is unknown until the hold is removed. Note 2: This value can be provided even when temporary hold is set (so that
    * the user can reason about policy without having to first unset the temporary hold).
    */
  var retentionExpirationTime: js.UndefOr[String] = js.native
  
  /** The link to this object. */
  var selfLink: js.UndefOr[String] = js.native
  
  /** Content-Length of the data in bytes. */
  var size: js.UndefOr[String] = js.native
  
  /** Storage class of the object. */
  var storageClass: js.UndefOr[String] = js.native
  
  /**
    * Whether an object is under temporary hold. While this flag is set to true, the object is protected against deletion and overwrites. A common use case of this flag is regulatory
    * investigations where objects need to be retained while the investigation is ongoing. Note that unlike event-based hold, temporary hold does not impact retention expiration time of
    * an object.
    */
  var temporaryHold: js.UndefOr[Boolean] = js.native
  
  /** The creation time of the object in RFC 3339 format. */
  var timeCreated: js.UndefOr[String] = js.native
  
  /** The deletion time of the object in RFC 3339 format. Will be returned if and only if this version of the object has been deleted. */
  var timeDeleted: js.UndefOr[String] = js.native
  
  /** The time at which the object's storage class was last changed. When the object is initially created, it will be set to timeCreated. */
  var timeStorageClassUpdated: js.UndefOr[String] = js.native
  
  /** The modification time of the object metadata in RFC 3339 format. */
  var updated: js.UndefOr[String] = js.native
}
object Object {
  
  @scala.inline
  def apply(): Object = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Object]
  }
  
  @scala.inline
  implicit class ObjectOps[Self <: Object] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAclVarargs(value: ObjectAccessControl*): Self = this.set("acl", js.Array(value :_*))
    
    @scala.inline
    def setAcl(value: js.Array[ObjectAccessControl]): Self = this.set("acl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAcl: Self = this.set("acl", js.undefined)
    
    @scala.inline
    def setBucket(value: String): Self = this.set("bucket", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBucket: Self = this.set("bucket", js.undefined)
    
    @scala.inline
    def setCacheControl(value: String): Self = this.set("cacheControl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCacheControl: Self = this.set("cacheControl", js.undefined)
    
    @scala.inline
    def setComponentCount(value: Double): Self = this.set("componentCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteComponentCount: Self = this.set("componentCount", js.undefined)
    
    @scala.inline
    def setContentDisposition(value: String): Self = this.set("contentDisposition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContentDisposition: Self = this.set("contentDisposition", js.undefined)
    
    @scala.inline
    def setContentEncoding(value: String): Self = this.set("contentEncoding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContentEncoding: Self = this.set("contentEncoding", js.undefined)
    
    @scala.inline
    def setContentLanguage(value: String): Self = this.set("contentLanguage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContentLanguage: Self = this.set("contentLanguage", js.undefined)
    
    @scala.inline
    def setContentType(value: String): Self = this.set("contentType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContentType: Self = this.set("contentType", js.undefined)
    
    @scala.inline
    def setCrc32c(value: String): Self = this.set("crc32c", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCrc32c: Self = this.set("crc32c", js.undefined)
    
    @scala.inline
    def setCustomTime(value: String): Self = this.set("customTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomTime: Self = this.set("customTime", js.undefined)
    
    @scala.inline
    def setCustomerEncryption(value: EncryptionAlgorithm): Self = this.set("customerEncryption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomerEncryption: Self = this.set("customerEncryption", js.undefined)
    
    @scala.inline
    def setEtag(value: String): Self = this.set("etag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEtag: Self = this.set("etag", js.undefined)
    
    @scala.inline
    def setEventBasedHold(value: Boolean): Self = this.set("eventBasedHold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEventBasedHold: Self = this.set("eventBasedHold", js.undefined)
    
    @scala.inline
    def setGeneration(value: String): Self = this.set("generation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGeneration: Self = this.set("generation", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    
    @scala.inline
    def setKmsKeyName(value: String): Self = this.set("kmsKeyName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKmsKeyName: Self = this.set("kmsKeyName", js.undefined)
    
    @scala.inline
    def setMd5Hash(value: String): Self = this.set("md5Hash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMd5Hash: Self = this.set("md5Hash", js.undefined)
    
    @scala.inline
    def setMediaLink(value: String): Self = this.set("mediaLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMediaLink: Self = this.set("mediaLink", js.undefined)
    
    @scala.inline
    def setMetadata(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: string}
      */ typings.maximMazurokGapiClientStorage.maximMazurokGapiClientStorageStrings.Object with TopLevel[js.Any]
    ): Self = this.set("metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMetadata: Self = this.set("metadata", js.undefined)
    
    @scala.inline
    def setMetageneration(value: String): Self = this.set("metageneration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMetageneration: Self = this.set("metageneration", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setOwner(value: Entity): Self = this.set("owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOwner: Self = this.set("owner", js.undefined)
    
    @scala.inline
    def setRetentionExpirationTime(value: String): Self = this.set("retentionExpirationTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRetentionExpirationTime: Self = this.set("retentionExpirationTime", js.undefined)
    
    @scala.inline
    def setSelfLink(value: String): Self = this.set("selfLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelfLink: Self = this.set("selfLink", js.undefined)
    
    @scala.inline
    def setSize(value: String): Self = this.set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
    
    @scala.inline
    def setStorageClass(value: String): Self = this.set("storageClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStorageClass: Self = this.set("storageClass", js.undefined)
    
    @scala.inline
    def setTemporaryHold(value: Boolean): Self = this.set("temporaryHold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTemporaryHold: Self = this.set("temporaryHold", js.undefined)
    
    @scala.inline
    def setTimeCreated(value: String): Self = this.set("timeCreated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeCreated: Self = this.set("timeCreated", js.undefined)
    
    @scala.inline
    def setTimeDeleted(value: String): Self = this.set("timeDeleted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeDeleted: Self = this.set("timeDeleted", js.undefined)
    
    @scala.inline
    def setTimeStorageClassUpdated(value: String): Self = this.set("timeStorageClassUpdated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeStorageClassUpdated: Self = this.set("timeStorageClassUpdated", js.undefined)
    
    @scala.inline
    def setUpdated(value: String): Self = this.set("updated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpdated: Self = this.set("updated", js.undefined)
  }
}
