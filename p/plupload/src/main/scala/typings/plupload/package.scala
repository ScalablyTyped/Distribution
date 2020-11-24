package typings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object plupload {
  
  type pluploadEvent = js.Function1[/* uploader */ typings.plupload.plupload.Uploader, js.Any]
  
  type pluploadEventChunkUploaded = js.Function3[
    /* uploader */ typings.plupload.plupload.Uploader, 
    /* file */ js.Any, 
    /* response */ typings.plupload.pluploadChunkResponse, 
    js.Any
  ]
  
  type pluploadEventError = js.Function2[
    /* uploader */ typings.plupload.plupload.Uploader, 
    /* error */ typings.plupload.pluploadError, 
    js.Any
  ]
  
  type pluploadEventFile = js.Function2[/* uploader */ typings.plupload.plupload.Uploader, /* file */ js.Any, js.Any]
  
  type pluploadEventFileUploaded = js.Function3[
    /* uploader */ typings.plupload.plupload.Uploader, 
    /* file */ js.Any, 
    /* response */ typings.plupload.pluploadResponse, 
    js.Any
  ]
  
  type pluploadEventFiles = js.Function2[
    /* uploader */ typings.plupload.plupload.Uploader, 
    /* files */ js.Array[js.Any], 
    js.Any
  ]
  
  type pluploadEventOptionChanged = js.Function4[
    /* uploader */ typings.plupload.plupload.Uploader, 
    /* name */ java.lang.String, 
    /* value */ js.Any, 
    /* oldValue */ js.Any, 
    js.Any
  ]
}
