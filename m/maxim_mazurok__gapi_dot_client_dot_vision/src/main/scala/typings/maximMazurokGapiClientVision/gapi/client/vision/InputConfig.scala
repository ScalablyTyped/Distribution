package typings.maximMazurokGapiClientVision.gapi.client.vision

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InputConfig extends StObject {
  
  /**
    * File content, represented as a stream of bytes. Note: As with all `bytes` fields, protobuffers use a pure binary representation, whereas JSON representations use base64. Currently,
    * this field only works for BatchAnnotateFiles requests. It does not work for AsyncBatchAnnotateFiles requests.
    */
  var content: js.UndefOr[String] = js.native
  
  /** The Google Cloud Storage location to read the input from. */
  var gcsSource: js.UndefOr[GcsSource] = js.native
  
  /** The type of the file. Currently only "application/pdf", "image/tiff" and "image/gif" are supported. Wildcards are not supported. */
  var mimeType: js.UndefOr[String] = js.native
}
object InputConfig {
  
  @scala.inline
  def apply(): InputConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InputConfig]
  }
  
  @scala.inline
  implicit class InputConfigMutableBuilder[Self <: InputConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
    
    @scala.inline
    def setGcsSource(value: GcsSource): Self = StObject.set(x, "gcsSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGcsSourceUndefined: Self = StObject.set(x, "gcsSource", js.undefined)
    
    @scala.inline
    def setMimeType(value: String): Self = StObject.set(x, "mimeType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMimeTypeUndefined: Self = StObject.set(x, "mimeType", js.undefined)
  }
}
