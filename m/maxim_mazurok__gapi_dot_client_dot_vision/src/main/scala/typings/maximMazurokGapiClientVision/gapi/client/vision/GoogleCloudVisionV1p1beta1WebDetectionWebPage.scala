package typings.maximMazurokGapiClientVision.gapi.client.vision

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudVisionV1p1beta1WebDetectionWebPage extends StObject {
  
  /** Fully matching images on the page. Can include resized copies of the query image. */
  var fullMatchingImages: js.UndefOr[js.Array[GoogleCloudVisionV1p1beta1WebDetectionWebImage]] = js.undefined
  
  /** Title for the web page, may contain HTML markups. */
  var pageTitle: js.UndefOr[String] = js.undefined
  
  /** Partial matching images on the page. Those images are similar enough to share some key-point features. For example an original image will likely have partial matching for its crops. */
  var partialMatchingImages: js.UndefOr[js.Array[GoogleCloudVisionV1p1beta1WebDetectionWebImage]] = js.undefined
  
  /** (Deprecated) Overall relevancy score for the web page. */
  var score: js.UndefOr[Double] = js.undefined
  
  /** The result web page URL. */
  var url: js.UndefOr[String] = js.undefined
}
object GoogleCloudVisionV1p1beta1WebDetectionWebPage {
  
  inline def apply(): GoogleCloudVisionV1p1beta1WebDetectionWebPage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudVisionV1p1beta1WebDetectionWebPage]
  }
  
  extension [Self <: GoogleCloudVisionV1p1beta1WebDetectionWebPage](x: Self) {
    
    inline def setFullMatchingImages(value: js.Array[GoogleCloudVisionV1p1beta1WebDetectionWebImage]): Self = StObject.set(x, "fullMatchingImages", value.asInstanceOf[js.Any])
    
    inline def setFullMatchingImagesUndefined: Self = StObject.set(x, "fullMatchingImages", js.undefined)
    
    inline def setFullMatchingImagesVarargs(value: GoogleCloudVisionV1p1beta1WebDetectionWebImage*): Self = StObject.set(x, "fullMatchingImages", js.Array(value*))
    
    inline def setPageTitle(value: String): Self = StObject.set(x, "pageTitle", value.asInstanceOf[js.Any])
    
    inline def setPageTitleUndefined: Self = StObject.set(x, "pageTitle", js.undefined)
    
    inline def setPartialMatchingImages(value: js.Array[GoogleCloudVisionV1p1beta1WebDetectionWebImage]): Self = StObject.set(x, "partialMatchingImages", value.asInstanceOf[js.Any])
    
    inline def setPartialMatchingImagesUndefined: Self = StObject.set(x, "partialMatchingImages", js.undefined)
    
    inline def setPartialMatchingImagesVarargs(value: GoogleCloudVisionV1p1beta1WebDetectionWebImage*): Self = StObject.set(x, "partialMatchingImages", js.Array(value*))
    
    inline def setScore(value: Double): Self = StObject.set(x, "score", value.asInstanceOf[js.Any])
    
    inline def setScoreUndefined: Self = StObject.set(x, "score", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
