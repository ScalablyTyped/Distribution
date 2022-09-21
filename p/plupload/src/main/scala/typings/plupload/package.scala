package typings.plupload

import typings.plupload.plupload.Uploader
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type pluploadEvent = js.Function1[/* uploader */ Uploader, Any]

type pluploadEventChunkUploaded = js.Function3[/* uploader */ Uploader, /* file */ Any, /* response */ pluploadChunkResponse, Any]

type pluploadEventError = js.Function2[/* uploader */ Uploader, /* error */ pluploadError, Any]

type pluploadEventFile = js.Function2[/* uploader */ Uploader, /* file */ Any, Any]

type pluploadEventFileUploaded = js.Function3[/* uploader */ Uploader, /* file */ Any, /* response */ pluploadResponse, Any]

type pluploadEventFiles = js.Function2[/* uploader */ Uploader, /* files */ js.Array[Any], Any]

type pluploadEventOptionChanged = js.Function4[/* uploader */ Uploader, /* name */ String, /* value */ Any, /* oldValue */ Any, Any]
