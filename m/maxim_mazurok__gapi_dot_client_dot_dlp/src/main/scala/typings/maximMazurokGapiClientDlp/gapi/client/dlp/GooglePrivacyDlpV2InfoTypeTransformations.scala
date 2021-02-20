package typings.maximMazurokGapiClientDlp.gapi.client.dlp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GooglePrivacyDlpV2InfoTypeTransformations extends StObject {
  
  /** Required. Transformation for each infoType. Cannot specify more than one for a given infoType. */
  var transformations: js.UndefOr[js.Array[GooglePrivacyDlpV2InfoTypeTransformation]] = js.native
}
object GooglePrivacyDlpV2InfoTypeTransformations {
  
  @scala.inline
  def apply(): GooglePrivacyDlpV2InfoTypeTransformations = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GooglePrivacyDlpV2InfoTypeTransformations]
  }
  
  @scala.inline
  implicit class GooglePrivacyDlpV2InfoTypeTransformationsMutableBuilder[Self <: GooglePrivacyDlpV2InfoTypeTransformations] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTransformations(value: js.Array[GooglePrivacyDlpV2InfoTypeTransformation]): Self = StObject.set(x, "transformations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransformationsUndefined: Self = StObject.set(x, "transformations", js.undefined)
    
    @scala.inline
    def setTransformationsVarargs(value: GooglePrivacyDlpV2InfoTypeTransformation*): Self = StObject.set(x, "transformations", js.Array(value :_*))
  }
}
