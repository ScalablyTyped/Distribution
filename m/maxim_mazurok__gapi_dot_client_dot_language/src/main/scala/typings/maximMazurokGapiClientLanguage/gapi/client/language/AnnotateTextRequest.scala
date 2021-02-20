package typings.maximMazurokGapiClientLanguage.gapi.client.language

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AnnotateTextRequest extends StObject {
  
  /** Required. Input document. */
  var document: js.UndefOr[Document] = js.native
  
  /** The encoding type used by the API to calculate offsets. */
  var encodingType: js.UndefOr[String] = js.native
  
  /** Required. The enabled features. */
  var features: js.UndefOr[Features] = js.native
}
object AnnotateTextRequest {
  
  @scala.inline
  def apply(): AnnotateTextRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnnotateTextRequest]
  }
  
  @scala.inline
  implicit class AnnotateTextRequestMutableBuilder[Self <: AnnotateTextRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDocument(value: Document): Self = StObject.set(x, "document", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDocumentUndefined: Self = StObject.set(x, "document", js.undefined)
    
    @scala.inline
    def setEncodingType(value: String): Self = StObject.set(x, "encodingType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEncodingTypeUndefined: Self = StObject.set(x, "encodingType", js.undefined)
    
    @scala.inline
    def setFeatures(value: Features): Self = StObject.set(x, "features", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFeaturesUndefined: Self = StObject.set(x, "features", js.undefined)
  }
}
