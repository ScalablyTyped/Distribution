package typings.maximMazurokGapiClientVision.gapi.client.vision

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudVisionV1p4beta1CropHintsAnnotation extends StObject {
  
  /** Crop hint results. */
  var cropHints: js.UndefOr[js.Array[GoogleCloudVisionV1p4beta1CropHint]] = js.undefined
}
object GoogleCloudVisionV1p4beta1CropHintsAnnotation {
  
  @scala.inline
  def apply(): GoogleCloudVisionV1p4beta1CropHintsAnnotation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudVisionV1p4beta1CropHintsAnnotation]
  }
  
  @scala.inline
  implicit class GoogleCloudVisionV1p4beta1CropHintsAnnotationMutableBuilder[Self <: GoogleCloudVisionV1p4beta1CropHintsAnnotation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCropHints(value: js.Array[GoogleCloudVisionV1p4beta1CropHint]): Self = StObject.set(x, "cropHints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCropHintsUndefined: Self = StObject.set(x, "cropHints", js.undefined)
    
    @scala.inline
    def setCropHintsVarargs(value: GoogleCloudVisionV1p4beta1CropHint*): Self = StObject.set(x, "cropHints", js.Array(value :_*))
  }
}
