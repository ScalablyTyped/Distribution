package typings.maximMazurokGapiClientVision.gapi.client.vision

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudVisionV1p1beta1WebDetectionWebImage extends StObject {
  
  /** (Deprecated) Overall relevancy score for the image. */
  var score: js.UndefOr[Double] = js.undefined
  
  /** The result image URL. */
  var url: js.UndefOr[String] = js.undefined
}
object GoogleCloudVisionV1p1beta1WebDetectionWebImage {
  
  @scala.inline
  def apply(): GoogleCloudVisionV1p1beta1WebDetectionWebImage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudVisionV1p1beta1WebDetectionWebImage]
  }
  
  @scala.inline
  implicit class GoogleCloudVisionV1p1beta1WebDetectionWebImageMutableBuilder[Self <: GoogleCloudVisionV1p1beta1WebDetectionWebImage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setScore(value: Double): Self = StObject.set(x, "score", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScoreUndefined: Self = StObject.set(x, "score", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
