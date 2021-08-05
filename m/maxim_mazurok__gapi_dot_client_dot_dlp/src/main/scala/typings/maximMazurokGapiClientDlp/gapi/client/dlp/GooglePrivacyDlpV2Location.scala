package typings.maximMazurokGapiClientDlp.gapi.client.dlp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GooglePrivacyDlpV2Location extends StObject {
  
  /**
    * Zero-based byte offsets delimiting the finding. These are relative to the finding's containing element. Note that when the content is not textual, this references the UTF-8 encoded
    * textual representation of the content. Omitted if content is an image.
    */
  var byteRange: js.UndefOr[GooglePrivacyDlpV2Range] = js.undefined
  
  /** Unicode character offsets delimiting the finding. These are relative to the finding's containing element. Provided when the content is text. */
  var codepointRange: js.UndefOr[GooglePrivacyDlpV2Range] = js.undefined
  
  /** Information about the container where this finding occurred, if available. */
  var container: js.UndefOr[GooglePrivacyDlpV2Container] = js.undefined
  
  /** List of nested objects pointing to the precise location of the finding within the file or record. */
  var contentLocations: js.UndefOr[js.Array[GooglePrivacyDlpV2ContentLocation]] = js.undefined
}
object GooglePrivacyDlpV2Location {
  
  inline def apply(): GooglePrivacyDlpV2Location = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GooglePrivacyDlpV2Location]
  }
  
  extension [Self <: GooglePrivacyDlpV2Location](x: Self) {
    
    inline def setByteRange(value: GooglePrivacyDlpV2Range): Self = StObject.set(x, "byteRange", value.asInstanceOf[js.Any])
    
    inline def setByteRangeUndefined: Self = StObject.set(x, "byteRange", js.undefined)
    
    inline def setCodepointRange(value: GooglePrivacyDlpV2Range): Self = StObject.set(x, "codepointRange", value.asInstanceOf[js.Any])
    
    inline def setCodepointRangeUndefined: Self = StObject.set(x, "codepointRange", js.undefined)
    
    inline def setContainer(value: GooglePrivacyDlpV2Container): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
    
    inline def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
    
    inline def setContentLocations(value: js.Array[GooglePrivacyDlpV2ContentLocation]): Self = StObject.set(x, "contentLocations", value.asInstanceOf[js.Any])
    
    inline def setContentLocationsUndefined: Self = StObject.set(x, "contentLocations", js.undefined)
    
    inline def setContentLocationsVarargs(value: GooglePrivacyDlpV2ContentLocation*): Self = StObject.set(x, "contentLocations", js.Array(value :_*))
  }
}
