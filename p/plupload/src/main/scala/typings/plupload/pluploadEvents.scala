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
  
  inline def apply(): pluploadEvents = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[pluploadEvents]
  }
  
  extension [Self <: pluploadEvents](x: Self) {
    
    inline def setBeforeUpload(value: (/* uploader */ Uploader, /* file */ Any) => Any): Self = StObject.set(x, "BeforeUpload", js.Any.fromFunction2(value))
    
    inline def setBeforeUploadUndefined: Self = StObject.set(x, "BeforeUpload", js.undefined)
    
    inline def setChunkUploaded(value: (/* uploader */ Uploader, /* file */ Any, /* response */ pluploadChunkResponse) => Any): Self = StObject.set(x, "ChunkUploaded", js.Any.fromFunction3(value))
    
    inline def setChunkUploadedUndefined: Self = StObject.set(x, "ChunkUploaded", js.undefined)
    
    inline def setDestroy(value: /* uploader */ Uploader => Any): Self = StObject.set(x, "Destroy", js.Any.fromFunction1(value))
    
    inline def setDestroyUndefined: Self = StObject.set(x, "Destroy", js.undefined)
    
    inline def setError(value: (/* uploader */ Uploader, /* error */ pluploadError) => Any): Self = StObject.set(x, "Error", js.Any.fromFunction2(value))
    
    inline def setErrorUndefined: Self = StObject.set(x, "Error", js.undefined)
    
    inline def setFileFiltered(value: (/* uploader */ Uploader, /* file */ Any) => Any): Self = StObject.set(x, "FileFiltered", js.Any.fromFunction2(value))
    
    inline def setFileFilteredUndefined: Self = StObject.set(x, "FileFiltered", js.undefined)
    
    inline def setFileUploaded(value: (/* uploader */ Uploader, /* file */ Any, /* response */ pluploadResponse) => Any): Self = StObject.set(x, "FileUploaded", js.Any.fromFunction3(value))
    
    inline def setFileUploadedUndefined: Self = StObject.set(x, "FileUploaded", js.undefined)
    
    inline def setFilesAdded(value: (/* uploader */ Uploader, /* files */ js.Array[Any]) => Any): Self = StObject.set(x, "FilesAdded", js.Any.fromFunction2(value))
    
    inline def setFilesAddedUndefined: Self = StObject.set(x, "FilesAdded", js.undefined)
    
    inline def setFilesRemoved(value: (/* uploader */ Uploader, /* files */ js.Array[Any]) => Any): Self = StObject.set(x, "FilesRemoved", js.Any.fromFunction2(value))
    
    inline def setFilesRemovedUndefined: Self = StObject.set(x, "FilesRemoved", js.undefined)
    
    inline def setInit(value: /* uploader */ Uploader => Any): Self = StObject.set(x, "Init", js.Any.fromFunction1(value))
    
    inline def setInitUndefined: Self = StObject.set(x, "Init", js.undefined)
    
    inline def setOptionChanged(value: (/* uploader */ Uploader, /* name */ String, /* value */ Any, /* oldValue */ Any) => Any): Self = StObject.set(x, "OptionChanged", js.Any.fromFunction4(value))
    
    inline def setOptionChangedUndefined: Self = StObject.set(x, "OptionChanged", js.undefined)
    
    inline def setPostInit(value: /* uploader */ Uploader => Any): Self = StObject.set(x, "PostInit", js.Any.fromFunction1(value))
    
    inline def setPostInitUndefined: Self = StObject.set(x, "PostInit", js.undefined)
    
    inline def setQueueChanged(value: /* uploader */ Uploader => Any): Self = StObject.set(x, "QueueChanged", js.Any.fromFunction1(value))
    
    inline def setQueueChangedUndefined: Self = StObject.set(x, "QueueChanged", js.undefined)
    
    inline def setRefresh(value: /* uploader */ Uploader => Any): Self = StObject.set(x, "Refresh", js.Any.fromFunction1(value))
    
    inline def setRefreshUndefined: Self = StObject.set(x, "Refresh", js.undefined)
    
    inline def setStateChanged(value: /* uploader */ Uploader => Any): Self = StObject.set(x, "StateChanged", js.Any.fromFunction1(value))
    
    inline def setStateChangedUndefined: Self = StObject.set(x, "StateChanged", js.undefined)
    
    inline def setUploadComplete(value: (/* uploader */ Uploader, /* files */ js.Array[Any]) => Any): Self = StObject.set(x, "UploadComplete", js.Any.fromFunction2(value))
    
    inline def setUploadCompleteUndefined: Self = StObject.set(x, "UploadComplete", js.undefined)
    
    inline def setUploadFile(value: (/* uploader */ Uploader, /* file */ Any) => Any): Self = StObject.set(x, "UploadFile", js.Any.fromFunction2(value))
    
    inline def setUploadFileUndefined: Self = StObject.set(x, "UploadFile", js.undefined)
    
    inline def setUploadProgress(value: (/* uploader */ Uploader, /* file */ Any) => Any): Self = StObject.set(x, "UploadProgress", js.Any.fromFunction2(value))
    
    inline def setUploadProgressUndefined: Self = StObject.set(x, "UploadProgress", js.undefined)
  }
}
