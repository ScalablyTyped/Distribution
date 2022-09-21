package typings.maximMazurokGapiClientDlp.gapi.client.dlp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GooglePrivacyDlpV2InfoTypeTransformations extends StObject {
  
  /** Required. Transformation for each infoType. Cannot specify more than one for a given infoType. */
  var transformations: js.UndefOr[js.Array[GooglePrivacyDlpV2InfoTypeTransformation]] = js.undefined
}
object GooglePrivacyDlpV2InfoTypeTransformations {
  
  inline def apply(): GooglePrivacyDlpV2InfoTypeTransformations = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GooglePrivacyDlpV2InfoTypeTransformations]
  }
  
  extension [Self <: GooglePrivacyDlpV2InfoTypeTransformations](x: Self) {
    
    inline def setTransformations(value: js.Array[GooglePrivacyDlpV2InfoTypeTransformation]): Self = StObject.set(x, "transformations", value.asInstanceOf[js.Any])
    
    inline def setTransformationsUndefined: Self = StObject.set(x, "transformations", js.undefined)
    
    inline def setTransformationsVarargs(value: GooglePrivacyDlpV2InfoTypeTransformation*): Self = StObject.set(x, "transformations", js.Array(value*))
  }
}
