package typings.maximMazurokGapiClientVision.gapi.client.vision

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudVisionV1p2beta1ImageProperties extends StObject {
  
  /** If present, dominant colors completed successfully. */
  var dominantColors: js.UndefOr[GoogleCloudVisionV1p2beta1DominantColorsAnnotation] = js.undefined
}
object GoogleCloudVisionV1p2beta1ImageProperties {
  
  @scala.inline
  def apply(): GoogleCloudVisionV1p2beta1ImageProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudVisionV1p2beta1ImageProperties]
  }
  
  @scala.inline
  implicit class GoogleCloudVisionV1p2beta1ImagePropertiesMutableBuilder[Self <: GoogleCloudVisionV1p2beta1ImageProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDominantColors(value: GoogleCloudVisionV1p2beta1DominantColorsAnnotation): Self = StObject.set(x, "dominantColors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDominantColorsUndefined: Self = StObject.set(x, "dominantColors", js.undefined)
  }
}
