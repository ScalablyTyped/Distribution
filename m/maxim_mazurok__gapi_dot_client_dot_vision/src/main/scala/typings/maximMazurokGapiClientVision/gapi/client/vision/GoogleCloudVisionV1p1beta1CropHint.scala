package typings.maximMazurokGapiClientVision.gapi.client.vision

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudVisionV1p1beta1CropHint extends StObject {
  
  /** The bounding polygon for the crop region. The coordinates of the bounding box are in the original image's scale. */
  var boundingPoly: js.UndefOr[GoogleCloudVisionV1p1beta1BoundingPoly] = js.undefined
  
  /** Confidence of this being a salient region. Range [0, 1]. */
  var confidence: js.UndefOr[Double] = js.undefined
  
  /** Fraction of importance of this salient region with respect to the original image. */
  var importanceFraction: js.UndefOr[Double] = js.undefined
}
object GoogleCloudVisionV1p1beta1CropHint {
  
  @scala.inline
  def apply(): GoogleCloudVisionV1p1beta1CropHint = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudVisionV1p1beta1CropHint]
  }
  
  @scala.inline
  implicit class GoogleCloudVisionV1p1beta1CropHintMutableBuilder[Self <: GoogleCloudVisionV1p1beta1CropHint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBoundingPoly(value: GoogleCloudVisionV1p1beta1BoundingPoly): Self = StObject.set(x, "boundingPoly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBoundingPolyUndefined: Self = StObject.set(x, "boundingPoly", js.undefined)
    
    @scala.inline
    def setConfidence(value: Double): Self = StObject.set(x, "confidence", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfidenceUndefined: Self = StObject.set(x, "confidence", js.undefined)
    
    @scala.inline
    def setImportanceFraction(value: Double): Self = StObject.set(x, "importanceFraction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImportanceFractionUndefined: Self = StObject.set(x, "importanceFraction", js.undefined)
  }
}
