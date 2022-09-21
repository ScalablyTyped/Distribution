package typings.maximMazurokGapiClientTranslate.gapi.client.translate

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DocumentTranslation extends StObject {
  
  /** The array of translated documents. It is expected to be size 1 for now. We may produce multiple translated documents in the future for other type of file formats. */
  var byteStreamOutputs: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * The detected language for the input document. If the user did not provide the source language for the input document, this field will have the language code automatically detected.
    * If the source language was passed, auto-detection of the language does not occur and this field is empty.
    */
  var detectedLanguageCode: js.UndefOr[String] = js.undefined
  
  /** The translated document's mime type. */
  var mimeType: js.UndefOr[String] = js.undefined
}
object DocumentTranslation {
  
  inline def apply(): DocumentTranslation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DocumentTranslation]
  }
  
  extension [Self <: DocumentTranslation](x: Self) {
    
    inline def setByteStreamOutputs(value: js.Array[String]): Self = StObject.set(x, "byteStreamOutputs", value.asInstanceOf[js.Any])
    
    inline def setByteStreamOutputsUndefined: Self = StObject.set(x, "byteStreamOutputs", js.undefined)
    
    inline def setByteStreamOutputsVarargs(value: String*): Self = StObject.set(x, "byteStreamOutputs", js.Array(value*))
    
    inline def setDetectedLanguageCode(value: String): Self = StObject.set(x, "detectedLanguageCode", value.asInstanceOf[js.Any])
    
    inline def setDetectedLanguageCodeUndefined: Self = StObject.set(x, "detectedLanguageCode", js.undefined)
    
    inline def setMimeType(value: String): Self = StObject.set(x, "mimeType", value.asInstanceOf[js.Any])
    
    inline def setMimeTypeUndefined: Self = StObject.set(x, "mimeType", js.undefined)
  }
}
