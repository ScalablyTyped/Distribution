package typings.maximMazurokGapiClientDlp.gapi.client.dlp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GooglePrivacyDlpV2Location extends StObject {
  
  /**
    * Zero-based byte offsets delimiting the finding. These are relative to the finding's containing element. Note that when the content is not textual, this references the UTF-8 encoded
    * textual representation of the content. Omitted if content is an image.
    */
  var byteRange: js.UndefOr[GooglePrivacyDlpV2Range] = js.native
  
  /** Unicode character offsets delimiting the finding. These are relative to the finding's containing element. Provided when the content is text. */
  var codepointRange: js.UndefOr[GooglePrivacyDlpV2Range] = js.native
  
  /** Information about the container where this finding occurred, if available. */
  var container: js.UndefOr[GooglePrivacyDlpV2Container] = js.native
  
  /** List of nested objects pointing to the precise location of the finding within the file or record. */
  var contentLocations: js.UndefOr[js.Array[GooglePrivacyDlpV2ContentLocation]] = js.native
}
object GooglePrivacyDlpV2Location {
  
  @scala.inline
  def apply(): GooglePrivacyDlpV2Location = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GooglePrivacyDlpV2Location]
  }
  
  @scala.inline
  implicit class GooglePrivacyDlpV2LocationMutableBuilder[Self <: GooglePrivacyDlpV2Location] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setByteRange(value: GooglePrivacyDlpV2Range): Self = StObject.set(x, "byteRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setByteRangeUndefined: Self = StObject.set(x, "byteRange", js.undefined)
    
    @scala.inline
    def setCodepointRange(value: GooglePrivacyDlpV2Range): Self = StObject.set(x, "codepointRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCodepointRangeUndefined: Self = StObject.set(x, "codepointRange", js.undefined)
    
    @scala.inline
    def setContainer(value: GooglePrivacyDlpV2Container): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
    
    @scala.inline
    def setContentLocations(value: js.Array[GooglePrivacyDlpV2ContentLocation]): Self = StObject.set(x, "contentLocations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentLocationsUndefined: Self = StObject.set(x, "contentLocations", js.undefined)
    
    @scala.inline
    def setContentLocationsVarargs(value: GooglePrivacyDlpV2ContentLocation*): Self = StObject.set(x, "contentLocations", js.Array(value :_*))
  }
}
