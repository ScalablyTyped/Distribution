package typings.maximMazurokGapiClientTranslate.gapi.client.translate

import org.scalablytyped.runtime.TopLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DetectLanguageRequest extends StObject {
  
  /** The content of the input stored as a string. */
  var content: js.UndefOr[String] = js.native
  
  /**
    * Optional. The labels with user-defined metadata for the request. Label keys and values can be no longer than 63 characters (Unicode codepoints), can only contain lowercase letters,
    * numeric characters, underscores and dashes. International characters are allowed. Label values are optional. Label keys must start with a letter. See
    * https://cloud.google.com/translate/docs/advanced/labels for more information.
    */
  var labels: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: string}
    */ typings.maximMazurokGapiClientTranslate.maximMazurokGapiClientTranslateStrings.DetectLanguageRequest with TopLevel[js.Any]
  ] = js.native
  
  /** Optional. The format of the source text, for example, "text/html", "text/plain". If left blank, the MIME type defaults to "text/html". */
  var mimeType: js.UndefOr[String] = js.native
  
  /**
    * Optional. The language detection model to be used. Format: `projects/{project-number-or-id}/locations/{location-id}/models/language-detection/{model-id}` Only one language detection
    * model is currently supported: `projects/{project-number-or-id}/locations/{location-id}/models/language-detection/default`. If not specified, the default model is used.
    */
  var model: js.UndefOr[String] = js.native
}
object DetectLanguageRequest {
  
  @scala.inline
  def apply(): DetectLanguageRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DetectLanguageRequest]
  }
  
  @scala.inline
  implicit class DetectLanguageRequestMutableBuilder[Self <: DetectLanguageRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
    
    @scala.inline
    def setLabels(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: string}
      */ typings.maximMazurokGapiClientTranslate.maximMazurokGapiClientTranslateStrings.DetectLanguageRequest with TopLevel[js.Any]
    ): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    @scala.inline
    def setMimeType(value: String): Self = StObject.set(x, "mimeType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMimeTypeUndefined: Self = StObject.set(x, "mimeType", js.undefined)
    
    @scala.inline
    def setModel(value: String): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
  }
}
