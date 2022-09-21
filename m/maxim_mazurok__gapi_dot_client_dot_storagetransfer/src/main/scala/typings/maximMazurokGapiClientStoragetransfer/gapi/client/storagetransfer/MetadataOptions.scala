package typings.maximMazurokGapiClientStoragetransfer.gapi.client.storagetransfer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MetadataOptions extends StObject {
  
  /**
    * Specifies how each object's ACLs should be preserved for transfers between Google Cloud Storage buckets. If unspecified, the default behavior is the same as
    * ACL_DESTINATION_BUCKET_DEFAULT.
    */
  var acl: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies how each file's POSIX group ID (GID) attribute should be handled by the transfer. By default, GID is not preserved. Only applicable to transfers involving POSIX file
    * systems, and ignored for other transfers.
    */
  var gid: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies how each object's Cloud KMS customer-managed encryption key (CMEK) is preserved for transfers between Google Cloud Storage buckets. If unspecified, the default behavior is
    * the same as KMS_KEY_DESTINATION_BUCKET_DEFAULT.
    */
  var kmsKey: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies how each file's mode attribute should be handled by the transfer. By default, mode is not preserved. Only applicable to transfers involving POSIX file systems, and ignored
    * for other transfers.
    */
  var mode: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies the storage class to set on objects being transferred to Google Cloud Storage buckets. If unspecified, the default behavior is the same as
    * STORAGE_CLASS_DESTINATION_BUCKET_DEFAULT.
    */
  var storageClass: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies how symlinks should be handled by the transfer. By default, symlinks are not preserved. Only applicable to transfers involving POSIX file systems, and ignored for other
    * transfers.
    */
  var symlink: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies how each object's temporary hold status should be preserved for transfers between Google Cloud Storage buckets. If unspecified, the default behavior is the same as
    * TEMPORARY_HOLD_PRESERVE.
    */
  var temporaryHold: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies how each object's `timeCreated` metadata is preserved for transfers between Google Cloud Storage buckets. If unspecified, the default behavior is the same as
    * TIME_CREATED_SKIP.
    */
  var timeCreated: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies how each file's POSIX user ID (UID) attribute should be handled by the transfer. By default, UID is not preserved. Only applicable to transfers involving POSIX file
    * systems, and ignored for other transfers.
    */
  var uid: js.UndefOr[String] = js.undefined
}
object MetadataOptions {
  
  inline def apply(): MetadataOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MetadataOptions]
  }
  
  extension [Self <: MetadataOptions](x: Self) {
    
    inline def setAcl(value: String): Self = StObject.set(x, "acl", value.asInstanceOf[js.Any])
    
    inline def setAclUndefined: Self = StObject.set(x, "acl", js.undefined)
    
    inline def setGid(value: String): Self = StObject.set(x, "gid", value.asInstanceOf[js.Any])
    
    inline def setGidUndefined: Self = StObject.set(x, "gid", js.undefined)
    
    inline def setKmsKey(value: String): Self = StObject.set(x, "kmsKey", value.asInstanceOf[js.Any])
    
    inline def setKmsKeyUndefined: Self = StObject.set(x, "kmsKey", js.undefined)
    
    inline def setMode(value: String): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    
    inline def setStorageClass(value: String): Self = StObject.set(x, "storageClass", value.asInstanceOf[js.Any])
    
    inline def setStorageClassUndefined: Self = StObject.set(x, "storageClass", js.undefined)
    
    inline def setSymlink(value: String): Self = StObject.set(x, "symlink", value.asInstanceOf[js.Any])
    
    inline def setSymlinkUndefined: Self = StObject.set(x, "symlink", js.undefined)
    
    inline def setTemporaryHold(value: String): Self = StObject.set(x, "temporaryHold", value.asInstanceOf[js.Any])
    
    inline def setTemporaryHoldUndefined: Self = StObject.set(x, "temporaryHold", js.undefined)
    
    inline def setTimeCreated(value: String): Self = StObject.set(x, "timeCreated", value.asInstanceOf[js.Any])
    
    inline def setTimeCreatedUndefined: Self = StObject.set(x, "timeCreated", js.undefined)
    
    inline def setUid(value: String): Self = StObject.set(x, "uid", value.asInstanceOf[js.Any])
    
    inline def setUidUndefined: Self = StObject.set(x, "uid", js.undefined)
  }
}
