package typings.maximMazurokGapiClientVision.gapi.client.vision

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudVisionV1p1beta1CropHintsAnnotation extends StObject {
  
  /** Crop hint results. */
  var cropHints: js.UndefOr[js.Array[GoogleCloudVisionV1p1beta1CropHint]] = js.native
}
object GoogleCloudVisionV1p1beta1CropHintsAnnotation {
  
  @scala.inline
  def apply(): GoogleCloudVisionV1p1beta1CropHintsAnnotation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudVisionV1p1beta1CropHintsAnnotation]
  }
  
  @scala.inline
  implicit class GoogleCloudVisionV1p1beta1CropHintsAnnotationMutableBuilder[Self <: GoogleCloudVisionV1p1beta1CropHintsAnnotation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCropHints(value: js.Array[GoogleCloudVisionV1p1beta1CropHint]): Self = StObject.set(x, "cropHints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCropHintsUndefined: Self = StObject.set(x, "cropHints", js.undefined)
    
    @scala.inline
    def setCropHintsVarargs(value: GoogleCloudVisionV1p1beta1CropHint*): Self = StObject.set(x, "cropHints", js.Array(value :_*))
  }
}
