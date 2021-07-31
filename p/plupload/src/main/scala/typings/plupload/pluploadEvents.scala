package typings.plupload

import typings.plupload.plupload.Uploader
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait pluploadEvents extends StObject {
  
  var BeforeUpload: js.UndefOr[pluploadEventFile] = js.undefined
  
  var ChunkUploaded: js.UndefOr[pluploadEventChunkUploaded] = js.undefined
  
  var Destroy: js.UndefOr[pluploadEvent] = js.undefined
  
  var Error: js.UndefOr[pluploadEventError] = js.undefined
  
  var FileFiltered: js.UndefOr[pluploadEventFile] = js.undefined
  
  var FileUploaded: js.UndefOr[pluploadEventFileUploaded] = js.undefined
  
  var FilesAdded: js.UndefOr[pluploadEventFiles] = js.undefined
  
  var FilesRemoved: js.UndefOr[pluploadEventFiles] = js.undefined
  
  var Init: js.UndefOr[pluploadEvent] = js.undefined
  
  var OptionChanged: js.UndefOr[pluploadEventOptionChanged] = js.undefined
  
  var PostInit: js.UndefOr[pluploadEvent] = js.undefined
  
  var QueueChanged: js.UndefOr[pluploadEvent] = js.undefined
  
  var Refresh: js.UndefOr[pluploadEvent] = js.undefined
  
  var StateChanged: js.UndefOr[pluploadEvent] = js.undefined
  
  var UploadComplete: js.UndefOr[pluploadEventFiles] = js.undefined
  
  var UploadFile: js.UndefOr[pluploadEventFile] = js.undefined
  
  var UploadProgress: js.UndefOr[pluploadEventFile] = js.undefined
}
object pluploadEvents {
  
  @scala.inline
  def apply(): pluploadEvents = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[pluploadEvents]
  }
  
  @scala.inline
  implicit class pluploadEventsMutableBuilder[Self <: pluploadEvents] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBeforeUpload(value: (/* uploader */ Uploader, /* file */ js.Any) => js.Any): Self = StObject.set(x, "BeforeUpload", js.Any.fromFunction2(value))
    
    @scala.inline
    def setBeforeUploadUndefined: Self = StObject.set(x, "BeforeUpload", js.undefined)
    
    @scala.inline
    def setChunkUploaded(
      value: (/* uploader */ Uploader, /* file */ js.Any, /* response */ pluploadChunkResponse) => js.Any
    ): Self = StObject.set(x, "ChunkUploaded", js.Any.fromFunction3(value))
    
    @scala.inline
    def setChunkUploadedUndefined: Self = StObject.set(x, "ChunkUploaded", js.undefined)
    
    @scala.inline
    def setDestroy(value: /* uploader */ Uploader => js.Any): Self = StObject.set(x, "Destroy", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDestroyUndefined: Self = StObject.set(x, "Destroy", js.undefined)
    
    @scala.inline
    def setError(value: (/* uploader */ Uploader, /* error */ pluploadError) => js.Any): Self = StObject.set(x, "Error", js.Any.fromFunction2(value))
    
    @scala.inline
    def setErrorUndefined: Self = StObject.set(x, "Error", js.undefined)
    
    @scala.inline
    def setFileFiltered(value: (/* uploader */ Uploader, /* file */ js.Any) => js.Any): Self = StObject.set(x, "FileFiltered", js.Any.fromFunction2(value))
    
    @scala.inline
    def setFileFilteredUndefined: Self = StObject.set(x, "FileFiltered", js.undefined)
    
    @scala.inline
    def setFileUploaded(value: (/* uploader */ Uploader, /* file */ js.Any, /* response */ pluploadResponse) => js.Any): Self = StObject.set(x, "FileUploaded", js.Any.fromFunction3(value))
    
    @scala.inline
    def setFileUploadedUndefined: Self = StObject.set(x, "FileUploaded", js.undefined)
    
    @scala.inline
    def setFilesAdded(value: (/* uploader */ Uploader, /* files */ js.Array[js.Any]) => js.Any): Self = StObject.set(x, "FilesAdded", js.Any.fromFunction2(value))
    
    @scala.inline
    def setFilesAddedUndefined: Self = StObject.set(x, "FilesAdded", js.undefined)
    
    @scala.inline
    def setFilesRemoved(value: (/* uploader */ Uploader, /* files */ js.Array[js.Any]) => js.Any): Self = StObject.set(x, "FilesRemoved", js.Any.fromFunction2(value))
    
    @scala.inline
    def setFilesRemovedUndefined: Self = StObject.set(x, "FilesRemoved", js.undefined)
    
    @scala.inline
    def setInit(value: /* uploader */ Uploader => js.Any): Self = StObject.set(x, "Init", js.Any.fromFunction1(value))
    
    @scala.inline
    def setInitUndefined: Self = StObject.set(x, "Init", js.undefined)
    
    @scala.inline
    def setOptionChanged(
      value: (/* uploader */ Uploader, /* name */ String, /* value */ js.Any, /* oldValue */ js.Any) => js.Any
    ): Self = StObject.set(x, "OptionChanged", js.Any.fromFunction4(value))
    
    @scala.inline
    def setOptionChangedUndefined: Self = StObject.set(x, "OptionChanged", js.undefined)
    
    @scala.inline
    def setPostInit(value: /* uploader */ Uploader => js.Any): Self = StObject.set(x, "PostInit", js.Any.fromFunction1(value))
    
    @scala.inline
    def setPostInitUndefined: Self = StObject.set(x, "PostInit", js.undefined)
    
    @scala.inline
    def setQueueChanged(value: /* uploader */ Uploader => js.Any): Self = StObject.set(x, "QueueChanged", js.Any.fromFunction1(value))
    
    @scala.inline
    def setQueueChangedUndefined: Self = StObject.set(x, "QueueChanged", js.undefined)
    
    @scala.inline
    def setRefresh(value: /* uploader */ Uploader => js.Any): Self = StObject.set(x, "Refresh", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRefreshUndefined: Self = StObject.set(x, "Refresh", js.undefined)
    
    @scala.inline
    def setStateChanged(value: /* uploader */ Uploader => js.Any): Self = StObject.set(x, "StateChanged", js.Any.fromFunction1(value))
    
    @scala.inline
    def setStateChangedUndefined: Self = StObject.set(x, "StateChanged", js.undefined)
    
    @scala.inline
    def setUploadComplete(value: (/* uploader */ Uploader, /* files */ js.Array[js.Any]) => js.Any): Self = StObject.set(x, "UploadComplete", js.Any.fromFunction2(value))
    
    @scala.inline
    def setUploadCompleteUndefined: Self = StObject.set(x, "UploadComplete", js.undefined)
    
    @scala.inline
    def setUploadFile(value: (/* uploader */ Uploader, /* file */ js.Any) => js.Any): Self = StObject.set(x, "UploadFile", js.Any.fromFunction2(value))
    
    @scala.inline
    def setUploadFileUndefined: Self = StObject.set(x, "UploadFile", js.undefined)
    
    @scala.inline
    def setUploadProgress(value: (/* uploader */ Uploader, /* file */ js.Any) => js.Any): Self = StObject.set(x, "UploadProgress", js.Any.fromFunction2(value))
    
    @scala.inline
    def setUploadProgressUndefined: Self = StObject.set(x, "UploadProgress", js.undefined)
  }
}
