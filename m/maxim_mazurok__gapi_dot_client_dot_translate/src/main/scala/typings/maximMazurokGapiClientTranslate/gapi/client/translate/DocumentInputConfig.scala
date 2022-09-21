package typings.maximMazurokGapiClientTranslate.gapi.client.translate

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DocumentInputConfig extends StObject {
  
  /** Document's content represented as a stream of bytes. */
  var content: js.UndefOr[String] = js.undefined
  
  /** Google Cloud Storage location. This must be a single file. For example: gs://example_bucket/example_file.pdf */
  var gcsSource: js.UndefOr[GcsSource] = js.undefined
  
  /**
    * Specifies the input document's mime_type. If not specified it will be determined using the file extension for gcs_source provided files. For a file provided through bytes content
    * the mime_type must be provided. Currently supported mime types are: - application/pdf - application/vnd.openxmlformats-officedocument.wordprocessingml.document -
    * application/vnd.openxmlformats-officedocument.presentationml.presentation - application/vnd.openxmlformats-officedocument.spreadsheetml.sheet
    */
  var mimeType: js.UndefOr[String] = js.undefined
}
object DocumentInputConfig {
  
  inline def apply(): DocumentInputConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DocumentInputConfig]
  }
  
  extension [Self <: DocumentInputConfig](x: Self) {
    
    inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
    
    inline def setGcsSource(value: GcsSource): Self = StObject.set(x, "gcsSource", value.asInstanceOf[js.Any])
    
    inline def setGcsSourceUndefined: Self = StObject.set(x, "gcsSource", js.undefined)
    
    inline def setMimeType(value: String): Self = StObject.set(x, "mimeType", value.asInstanceOf[js.Any])
    
    inline def setMimeTypeUndefined: Self = StObject.set(x, "mimeType", js.undefined)
  }
}
