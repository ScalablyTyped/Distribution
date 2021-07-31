package typings.maximMazurokGapiClientVault.gapi.client.vault

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CloudStorageFile extends StObject {
  
  /**
    * The cloud storage bucket name of this export file. Can be used in cloud storage JSON/XML API, but not to list the bucket contents. Instead, you can get individual export files by
    * object name.
    */
  var bucketName: js.UndefOr[String] = js.undefined
  
  /** The md5 hash of the file. */
  var md5Hash: js.UndefOr[String] = js.undefined
  
  /** The cloud storage object name of this export file. Can be used in cloud storage JSON/XML API. */
  var objectName: js.UndefOr[String] = js.undefined
  
  /** The size of the export file. */
  var size: js.UndefOr[String] = js.undefined
}
object CloudStorageFile {
  
  @scala.inline
  def apply(): CloudStorageFile = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CloudStorageFile]
  }
  
  @scala.inline
  implicit class CloudStorageFileMutableBuilder[Self <: CloudStorageFile] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBucketName(value: String): Self = StObject.set(x, "bucketName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBucketNameUndefined: Self = StObject.set(x, "bucketName", js.undefined)
    
    @scala.inline
    def setMd5Hash(value: String): Self = StObject.set(x, "md5Hash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMd5HashUndefined: Self = StObject.set(x, "md5Hash", js.undefined)
    
    @scala.inline
    def setObjectName(value: String): Self = StObject.set(x, "objectName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjectNameUndefined: Self = StObject.set(x, "objectName", js.undefined)
    
    @scala.inline
    def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
  }
}
