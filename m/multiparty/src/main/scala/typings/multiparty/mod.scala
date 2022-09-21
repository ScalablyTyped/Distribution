package typings.multiparty

import typings.multiparty.multipartyStrings.close
import typings.multiparty.multipartyStrings.error
import typings.multiparty.multipartyStrings.field
import typings.multiparty.multipartyStrings.part
import typings.multiparty.multipartyStrings.progress
import typings.node.eventsMod.EventEmitter
import typings.node.httpMod.IncomingMessage
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("multiparty", "Form")
  @js.native
  open class Form () extends EventEmitter {
    def this(options: FormOptions) = this()
    
    @JSName("on")
    def on_close(event: close, listener: js.Function0[Unit]): this.type = js.native
    @JSName("on")
    def on_error(event: error, listener: js.Function1[/* err */ js.Error, Unit]): this.type = js.native
    @JSName("on")
    def on_field(event: field, listener: js.Function2[/* name */ String, /* value */ String, Unit]): this.type = js.native
    @JSName("on")
    def on_part(event: part, listener: js.Function1[/* part */ Part, Unit]): this.type = js.native
    @JSName("on")
    def on_progress(
      event: progress,
      listener: js.Function2[/* bytesReceived */ Double, /* bytesExpected */ Double, Unit]
    ): this.type = js.native
    
    /**
      * Parses an incoming node.js request containing form data.
      * This will cause form to emit events based off the incoming request
      * @param request
      * @param callback
      */
    def parse(request: IncomingMessage): Unit = js.native
    def parse(
      request: IncomingMessage,
      callback: js.Function3[/* error */ js.Error, /* fields */ Any, /* files */ Any, Any]
    ): Unit = js.native
  }
  
  trait File extends StObject {
    
    /**
      * same as name - the field name for this file
      */
    var fieldName: String
    
    /**
      * the HTTP headers that were sent along with this file
      */
    var headers: Any
    
    /**
      * the filename that the user reports for the file
      */
    var originalFilename: String
    
    /**
      * the absolute path of the uploaded file on disk
      */
    var path: String
    
    /**
      * size of the file in bytes
      */
    var size: Double
  }
  object File {
    
    inline def apply(fieldName: String, headers: Any, originalFilename: String, path: String, size: Double): File = {
      val __obj = js.Dynamic.literal(fieldName = fieldName.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], originalFilename = originalFilename.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
      __obj.asInstanceOf[File]
    }
    
    extension [Self <: File](x: Self) {
      
      inline def setFieldName(value: String): Self = StObject.set(x, "fieldName", value.asInstanceOf[js.Any])
      
      inline def setHeaders(value: Any): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setOriginalFilename(value: String): Self = StObject.set(x, "originalFilename", value.asInstanceOf[js.Any])
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    }
  }
  
  trait FormOptions extends StObject {
    
    /**
      * Enables field events and disables part events for fields.
      * This is automatically set to true if you add a field listener.
      */
    var autoFields: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Enables file events and disables part events for files.
      * This is automatically set to true if you add a file listener.
      */
    var autoFiles: js.UndefOr[Boolean] = js.undefined
    
    /**
      * sets encoding for the incoming form fields. Defaults to utf8.
      */
    var encoding: js.UndefOr[String] = js.undefined
    
    /**
      * Limits the number of fields that will be parsed before emitting an error event.
      * A file counts as a field in this case. Defaults to 1000.
      */
    var maxFields: js.UndefOr[Double] = js.undefined
    
    /**
      * Limits the amount of memory all fields (not files) can allocate in bytes.
      * If this value is exceeded, an error event is emitted. The default size is 2MB.
      */
    var maxFieldsSize: js.UndefOr[Double] = js.undefined
    
    /**
      * Only relevant when autoFiles is true.
      * Limits the total bytes accepted for all files combined.
      * If this value is exceeded, an error event is emitted.
      * The default is Infinity.
      */
    var maxFilesSize: js.UndefOr[Double] = js.undefined
    
    /**
      * Only relevant when autoFiles is true.
      * The directory for placing file uploads in.
      * You can move them later using fs.rename(). Defaults to os.tmpDir().
      */
    var uploadDir: js.UndefOr[String] = js.undefined
  }
  object FormOptions {
    
    inline def apply(): FormOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FormOptions]
    }
    
    extension [Self <: FormOptions](x: Self) {
      
      inline def setAutoFields(value: Boolean): Self = StObject.set(x, "autoFields", value.asInstanceOf[js.Any])
      
      inline def setAutoFieldsUndefined: Self = StObject.set(x, "autoFields", js.undefined)
      
      inline def setAutoFiles(value: Boolean): Self = StObject.set(x, "autoFiles", value.asInstanceOf[js.Any])
      
      inline def setAutoFilesUndefined: Self = StObject.set(x, "autoFiles", js.undefined)
      
      inline def setEncoding(value: String): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
      
      inline def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
      
      inline def setMaxFields(value: Double): Self = StObject.set(x, "maxFields", value.asInstanceOf[js.Any])
      
      inline def setMaxFieldsSize(value: Double): Self = StObject.set(x, "maxFieldsSize", value.asInstanceOf[js.Any])
      
      inline def setMaxFieldsSizeUndefined: Self = StObject.set(x, "maxFieldsSize", js.undefined)
      
      inline def setMaxFieldsUndefined: Self = StObject.set(x, "maxFields", js.undefined)
      
      inline def setMaxFilesSize(value: Double): Self = StObject.set(x, "maxFilesSize", value.asInstanceOf[js.Any])
      
      inline def setMaxFilesSizeUndefined: Self = StObject.set(x, "maxFilesSize", js.undefined)
      
      inline def setUploadDir(value: String): Self = StObject.set(x, "uploadDir", value.asInstanceOf[js.Any])
      
      inline def setUploadDirUndefined: Self = StObject.set(x, "uploadDir", js.undefined)
    }
  }
  
  @js.native
  trait Part extends Readable {
    
    /**
      * assuming that this is the last part in the request, this is the size of this part in bytes.
      * You could use this, for example, to set the Content-Length header if uploading to S3.
      * If the part had a Content-Length header then that value is used here instead.
      */
    var byteCount: Double = js.native
    
    /**
      * the byte offset of this part in the request body
      */
    var byteOffset: Double = js.native
    
    /**
      * only if the part is an incoming file
      */
    var filename: String = js.native
    
    /**
      * the headers for this part. For example, you may be interested in content-type
      */
    var headers: Any = js.native
    
    /**
      * the field name for this part
      */
    var name: String = js.native
  }
}
