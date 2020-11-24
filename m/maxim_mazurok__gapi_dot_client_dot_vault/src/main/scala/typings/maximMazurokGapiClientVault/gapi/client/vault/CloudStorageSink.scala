package typings.maximMazurokGapiClientVault.gapi.client.vault

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CloudStorageSink extends js.Object {
  
  /** Output only. The exported files on cloud storage. */
  var files: js.UndefOr[js.Array[CloudStorageFile]] = js.native
}
object CloudStorageSink {
  
  @scala.inline
  def apply(): CloudStorageSink = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CloudStorageSink]
  }
  
  @scala.inline
  implicit class CloudStorageSinkOps[Self <: CloudStorageSink] (val x: Self) extends AnyVal {
    
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
    def setFilesVarargs(value: CloudStorageFile*): Self = this.set("files", js.Array(value :_*))
    
    @scala.inline
    def setFiles(value: js.Array[CloudStorageFile]): Self = this.set("files", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFiles: Self = this.set("files", js.undefined)
  }
}
