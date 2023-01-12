package typings.maximMazurokGapiClientTranslate.gapi.client.translate

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchDocumentInputConfig extends StObject {
  
  /**
    * Google Cloud Storage location for the source input. This can be a single file (for example, `gs://translation-test/input.docx`) or a wildcard (for example,
    * `gs://translation-test/ *`). File mime type is determined based on extension. Supported mime type includes: - `pdf`, application/pdf - `docx`,
    * application/vnd.openxmlformats-officedocument.wordprocessingml.document - `pptx`, application/vnd.openxmlformats-officedocument.presentationml.presentation - `xlsx`,
    * application/vnd.openxmlformats-officedocument.spreadsheetml.sheet The max file size to support for `.docx`, `.pptx` and `.xlsx` is 100MB. The max file size to support for `.pdf` is
    * 1GB and the max page limit is 1000 pages. The max file size to support for all input documents is 1GB.
    */
  var gcsSource: js.UndefOr[GcsSource] = js.undefined
}
object BatchDocumentInputConfig {
  
  inline def apply(): BatchDocumentInputConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchDocumentInputConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BatchDocumentInputConfig] (val x: Self) extends AnyVal {
    
    inline def setGcsSource(value: GcsSource): Self = StObject.set(x, "gcsSource", value.asInstanceOf[js.Any])
    
    inline def setGcsSourceUndefined: Self = StObject.set(x, "gcsSource", js.undefined)
  }
}
