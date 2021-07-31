package typings.maximMazurokGapiClientVideointelligence.gapi.client.videointelligence

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudVideointelligenceV1TextDetectionConfig extends StObject {
  
  /**
    * Language hint can be specified if the language to be detected is known a priori. It can increase the accuracy of the detection. Language hint must be language code in BCP-47 format.
    * Automatic language detection is performed if no hint is provided.
    */
  var languageHints: js.UndefOr[js.Array[String]] = js.undefined
  
  /** Model to use for text detection. Supported values: "builtin/stable" (the default if unset) and "builtin/latest". */
  var model: js.UndefOr[String] = js.undefined
}
object GoogleCloudVideointelligenceV1TextDetectionConfig {
  
  @scala.inline
  def apply(): GoogleCloudVideointelligenceV1TextDetectionConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudVideointelligenceV1TextDetectionConfig]
  }
  
  @scala.inline
  implicit class GoogleCloudVideointelligenceV1TextDetectionConfigMutableBuilder[Self <: GoogleCloudVideointelligenceV1TextDetectionConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLanguageHints(value: js.Array[String]): Self = StObject.set(x, "languageHints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLanguageHintsUndefined: Self = StObject.set(x, "languageHints", js.undefined)
    
    @scala.inline
    def setLanguageHintsVarargs(value: String*): Self = StObject.set(x, "languageHints", js.Array(value :_*))
    
    @scala.inline
    def setModel(value: String): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
  }
}
