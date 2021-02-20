package typings.maximMazurokGapiClientVision.gapi.client.vision

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudVisionV1p3beta1DominantColorsAnnotation extends StObject {
  
  /** RGB color values with their score and pixel fraction. */
  var colors: js.UndefOr[js.Array[GoogleCloudVisionV1p3beta1ColorInfo]] = js.native
}
object GoogleCloudVisionV1p3beta1DominantColorsAnnotation {
  
  @scala.inline
  def apply(): GoogleCloudVisionV1p3beta1DominantColorsAnnotation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudVisionV1p3beta1DominantColorsAnnotation]
  }
  
  @scala.inline
  implicit class GoogleCloudVisionV1p3beta1DominantColorsAnnotationMutableBuilder[Self <: GoogleCloudVisionV1p3beta1DominantColorsAnnotation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColors(value: js.Array[GoogleCloudVisionV1p3beta1ColorInfo]): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorsUndefined: Self = StObject.set(x, "colors", js.undefined)
    
    @scala.inline
    def setColorsVarargs(value: GoogleCloudVisionV1p3beta1ColorInfo*): Self = StObject.set(x, "colors", js.Array(value :_*))
  }
}
