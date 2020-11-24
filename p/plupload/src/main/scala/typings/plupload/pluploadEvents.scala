package typings.plupload

import typings.plupload.plupload.Uploader
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait pluploadEvents extends js.Object {
  
  var BeforeUpload: js.UndefOr[pluploadEventFile] = js.native
  
  var ChunkUploaded: js.UndefOr[pluploadEventChunkUploaded] = js.native
  
  var Destroy: js.UndefOr[pluploadEvent] = js.native
  
  var Error: js.UndefOr[pluploadEventError] = js.native
  
  var FileFiltered: js.UndefOr[pluploadEventFile] = js.native
  
  var FileUploaded: js.UndefOr[pluploadEventFileUploaded] = js.native
  
  var FilesAdded: js.UndefOr[pluploadEventFiles] = js.native
  
  var FilesRemoved: js.UndefOr[pluploadEventFiles] = js.native
  
  var Init: js.UndefOr[pluploadEvent] = js.native
  
  var OptionChanged: js.UndefOr[pluploadEventOptionChanged] = js.native
  
  var PostInit: js.UndefOr[pluploadEvent] = js.native
  
  var QueueChanged: js.UndefOr[pluploadEvent] = js.native
  
  var Refresh: js.UndefOr[pluploadEvent] = js.native
  
  var StateChanged: js.UndefOr[pluploadEvent] = js.native
  
  var UploadComplete: js.UndefOr[pluploadEventFiles] = js.native
  
  var UploadFile: js.UndefOr[pluploadEventFile] = js.native
  
  var UploadProgress: js.UndefOr[pluploadEventFile] = js.native
}
object pluploadEvents {
  
  @scala.inline
  def apply(): pluploadEvents = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[pluploadEvents]
  }
  
  @scala.inline
  implicit class pluploadEventsOps[Self <: pluploadEvents] (val x: Self) extends AnyVal {
    
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
    def setBeforeUpload(value: (/* uploader */ Uploader, /* file */ js.Any) => js.Any): Self = this.set("BeforeUpload", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteBeforeUpload: Self = this.set("BeforeUpload", js.undefined)
    
    @scala.inline
    def setChunkUploaded(
      value: (/* uploader */ Uploader, /* file */ js.Any, /* response */ pluploadChunkResponse) => js.Any
    ): Self = this.set("ChunkUploaded", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteChunkUploaded: Self = this.set("ChunkUploaded", js.undefined)
    
    @scala.inline
    def setDestroy(value: /* uploader */ Uploader => js.Any): Self = this.set("Destroy", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteDestroy: Self = this.set("Destroy", js.undefined)
    
    @scala.inline
    def setError(value: (/* uploader */ Uploader, /* error */ pluploadError) => js.Any): Self = this.set("Error", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteError: Self = this.set("Error", js.undefined)
    
    @scala.inline
    def setFileFiltered(value: (/* uploader */ Uploader, /* file */ js.Any) => js.Any): Self = this.set("FileFiltered", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteFileFiltered: Self = this.set("FileFiltered", js.undefined)
    
    @scala.inline
    def setFileUploaded(value: (/* uploader */ Uploader, /* file */ js.Any, /* response */ pluploadResponse) => js.Any): Self = this.set("FileUploaded", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteFileUploaded: Self = this.set("FileUploaded", js.undefined)
    
    @scala.inline
    def setFilesAdded(value: (/* uploader */ Uploader, /* files */ js.Array[js.Any]) => js.Any): Self = this.set("FilesAdded", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteFilesAdded: Self = this.set("FilesAdded", js.undefined)
    
    @scala.inline
    def setFilesRemoved(value: (/* uploader */ Uploader, /* files */ js.Array[js.Any]) => js.Any): Self = this.set("FilesRemoved", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteFilesRemoved: Self = this.set("FilesRemoved", js.undefined)
    
    @scala.inline
    def setInit(value: /* uploader */ Uploader => js.Any): Self = this.set("Init", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteInit: Self = this.set("Init", js.undefined)
    
    @scala.inline
    def setOptionChanged(
      value: (/* uploader */ Uploader, /* name */ String, /* value */ js.Any, /* oldValue */ js.Any) => js.Any
    ): Self = this.set("OptionChanged", js.Any.fromFunction4(value))
    
    @scala.inline
    def deleteOptionChanged: Self = this.set("OptionChanged", js.undefined)
    
    @scala.inline
    def setPostInit(value: /* uploader */ Uploader => js.Any): Self = this.set("PostInit", js.Any.fromFunction1(value))
    
    @scala.inline
    def deletePostInit: Self = this.set("PostInit", js.undefined)
    
    @scala.inline
    def setQueueChanged(value: /* uploader */ Uploader => js.Any): Self = this.set("QueueChanged", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteQueueChanged: Self = this.set("QueueChanged", js.undefined)
    
    @scala.inline
    def setRefresh(value: /* uploader */ Uploader => js.Any): Self = this.set("Refresh", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteRefresh: Self = this.set("Refresh", js.undefined)
    
    @scala.inline
    def setStateChanged(value: /* uploader */ Uploader => js.Any): Self = this.set("StateChanged", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteStateChanged: Self = this.set("StateChanged", js.undefined)
    
    @scala.inline
    def setUploadComplete(value: (/* uploader */ Uploader, /* files */ js.Array[js.Any]) => js.Any): Self = this.set("UploadComplete", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteUploadComplete: Self = this.set("UploadComplete", js.undefined)
    
    @scala.inline
    def setUploadFile(value: (/* uploader */ Uploader, /* file */ js.Any) => js.Any): Self = this.set("UploadFile", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteUploadFile: Self = this.set("UploadFile", js.undefined)
    
    @scala.inline
    def setUploadProgress(value: (/* uploader */ Uploader, /* file */ js.Any) => js.Any): Self = this.set("UploadProgress", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteUploadProgress: Self = this.set("UploadProgress", js.undefined)
  }
}
