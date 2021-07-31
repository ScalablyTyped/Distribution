package typings.maximMazurokGapiClientDlp.gapi.client.dlp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GooglePrivacyDlpV2TransformationOverview extends StObject {
  
  /** Transformations applied to the dataset. */
  var transformationSummaries: js.UndefOr[js.Array[GooglePrivacyDlpV2TransformationSummary]] = js.undefined
  
  /** Total size in bytes that were transformed in some way. */
  var transformedBytes: js.UndefOr[String] = js.undefined
}
object GooglePrivacyDlpV2TransformationOverview {
  
  @scala.inline
  def apply(): GooglePrivacyDlpV2TransformationOverview = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GooglePrivacyDlpV2TransformationOverview]
  }
  
  @scala.inline
  implicit class GooglePrivacyDlpV2TransformationOverviewMutableBuilder[Self <: GooglePrivacyDlpV2TransformationOverview] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTransformationSummaries(value: js.Array[GooglePrivacyDlpV2TransformationSummary]): Self = StObject.set(x, "transformationSummaries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransformationSummariesUndefined: Self = StObject.set(x, "transformationSummaries", js.undefined)
    
    @scala.inline
    def setTransformationSummariesVarargs(value: GooglePrivacyDlpV2TransformationSummary*): Self = StObject.set(x, "transformationSummaries", js.Array(value :_*))
    
    @scala.inline
    def setTransformedBytes(value: String): Self = StObject.set(x, "transformedBytes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransformedBytesUndefined: Self = StObject.set(x, "transformedBytes", js.undefined)
  }
}
