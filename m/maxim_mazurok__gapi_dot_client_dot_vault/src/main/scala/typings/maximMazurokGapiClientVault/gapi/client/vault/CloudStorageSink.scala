package typings.maximMazurokGapiClientVault.gapi.client.vault

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CloudStorageSink extends StObject {
  
  /** Output only. The exported files on cloud storage. */
  var files: js.UndefOr[js.Array[CloudStorageFile]] = js.undefined
}
object CloudStorageSink {
  
  @scala.inline
  def apply(): CloudStorageSink = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CloudStorageSink]
  }
  
  @scala.inline
  implicit class CloudStorageSinkMutableBuilder[Self <: CloudStorageSink] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFiles(value: js.Array[CloudStorageFile]): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilesUndefined: Self = StObject.set(x, "files", js.undefined)
    
    @scala.inline
    def setFilesVarargs(value: CloudStorageFile*): Self = StObject.set(x, "files", js.Array(value :_*))
  }
}
