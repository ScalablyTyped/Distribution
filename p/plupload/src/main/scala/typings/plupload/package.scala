package typings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object plupload {
  import typings.plupload.pluploadNs.Uploader

  type plupload_event = js.Function1[/* uploader */ Uploader, js.Any]
  type plupload_event_ChunkUploaded = js.Function3[
    /* uploader */ Uploader, 
    /* file */ js.Any, 
    /* response */ plupload_chunk_response, 
    js.Any
  ]
  type plupload_event_Error = js.Function2[/* uploader */ Uploader, /* error */ plupload_error, js.Any]
  type plupload_event_FileUploaded = js.Function3[/* uploader */ Uploader, /* file */ js.Any, /* response */ plupload_response, js.Any]
  type plupload_event_OptionChanged = js.Function4[
    /* uploader */ Uploader, 
    /* name */ String, 
    /* value */ js.Any, 
    /* oldValue */ js.Any, 
    js.Any
  ]
  type plupload_event_file = js.Function2[/* uploader */ Uploader, /* file */ js.Any, js.Any]
  type plupload_event_files = js.Function2[/* uploader */ Uploader, /* files */ js.Array[js.Any], js.Any]
}
