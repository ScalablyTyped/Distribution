package typings.maximMazurokGapiClientDlp.gapi.client.dlp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GooglePrivacyDlpV2DeidentifyConfig extends StObject {
  
  /** Treat the dataset as free-form text and apply the same free text transformation everywhere. */
  var infoTypeTransformations: js.UndefOr[GooglePrivacyDlpV2InfoTypeTransformations] = js.native
  
  /** Treat the dataset as structured. Transformations can be applied to specific locations within structured datasets, such as transforming a column within a table. */
  var recordTransformations: js.UndefOr[GooglePrivacyDlpV2RecordTransformations] = js.native
  
  /** Mode for handling transformation errors. If left unspecified, the default mode is `TransformationErrorHandling.ThrowError`. */
  var transformationErrorHandling: js.UndefOr[GooglePrivacyDlpV2TransformationErrorHandling] = js.native
}
object GooglePrivacyDlpV2DeidentifyConfig {
  
  @scala.inline
  def apply(): GooglePrivacyDlpV2DeidentifyConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GooglePrivacyDlpV2DeidentifyConfig]
  }
  
  @scala.inline
  implicit class GooglePrivacyDlpV2DeidentifyConfigMutableBuilder[Self <: GooglePrivacyDlpV2DeidentifyConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInfoTypeTransformations(value: GooglePrivacyDlpV2InfoTypeTransformations): Self = StObject.set(x, "infoTypeTransformations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInfoTypeTransformationsUndefined: Self = StObject.set(x, "infoTypeTransformations", js.undefined)
    
    @scala.inline
    def setRecordTransformations(value: GooglePrivacyDlpV2RecordTransformations): Self = StObject.set(x, "recordTransformations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecordTransformationsUndefined: Self = StObject.set(x, "recordTransformations", js.undefined)
    
    @scala.inline
    def setTransformationErrorHandling(value: GooglePrivacyDlpV2TransformationErrorHandling): Self = StObject.set(x, "transformationErrorHandling", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransformationErrorHandlingUndefined: Self = StObject.set(x, "transformationErrorHandling", js.undefined)
  }
}
