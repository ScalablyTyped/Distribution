package typings.maximMazurokGapiClientVision.gapi.client.vision

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudVisionV1p3beta1WebDetection extends StObject {
  
  /** The service's best guess as to the topic of the request image. Inferred from similar images on the open web. */
  var bestGuessLabels: js.UndefOr[js.Array[GoogleCloudVisionV1p3beta1WebDetectionWebLabel]] = js.undefined
  
  /** Fully matching images from the Internet. Can include resized copies of the query image. */
  var fullMatchingImages: js.UndefOr[js.Array[GoogleCloudVisionV1p3beta1WebDetectionWebImage]] = js.undefined
  
  /** Web pages containing the matching images from the Internet. */
  var pagesWithMatchingImages: js.UndefOr[js.Array[GoogleCloudVisionV1p3beta1WebDetectionWebPage]] = js.undefined
  
  /**
    * Partial matching images from the Internet. Those images are similar enough to share some key-point features. For example an original image will likely have partial matching for its
    * crops.
    */
  var partialMatchingImages: js.UndefOr[js.Array[GoogleCloudVisionV1p3beta1WebDetectionWebImage]] = js.undefined
  
  /** The visually similar image results. */
  var visuallySimilarImages: js.UndefOr[js.Array[GoogleCloudVisionV1p3beta1WebDetectionWebImage]] = js.undefined
  
  /** Deduced entities from similar images on the Internet. */
  var webEntities: js.UndefOr[js.Array[GoogleCloudVisionV1p3beta1WebDetectionWebEntity]] = js.undefined
}
object GoogleCloudVisionV1p3beta1WebDetection {
  
  @scala.inline
  def apply(): GoogleCloudVisionV1p3beta1WebDetection = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudVisionV1p3beta1WebDetection]
  }
  
  @scala.inline
  implicit class GoogleCloudVisionV1p3beta1WebDetectionMutableBuilder[Self <: GoogleCloudVisionV1p3beta1WebDetection] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBestGuessLabels(value: js.Array[GoogleCloudVisionV1p3beta1WebDetectionWebLabel]): Self = StObject.set(x, "bestGuessLabels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBestGuessLabelsUndefined: Self = StObject.set(x, "bestGuessLabels", js.undefined)
    
    @scala.inline
    def setBestGuessLabelsVarargs(value: GoogleCloudVisionV1p3beta1WebDetectionWebLabel*): Self = StObject.set(x, "bestGuessLabels", js.Array(value :_*))
    
    @scala.inline
    def setFullMatchingImages(value: js.Array[GoogleCloudVisionV1p3beta1WebDetectionWebImage]): Self = StObject.set(x, "fullMatchingImages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFullMatchingImagesUndefined: Self = StObject.set(x, "fullMatchingImages", js.undefined)
    
    @scala.inline
    def setFullMatchingImagesVarargs(value: GoogleCloudVisionV1p3beta1WebDetectionWebImage*): Self = StObject.set(x, "fullMatchingImages", js.Array(value :_*))
    
    @scala.inline
    def setPagesWithMatchingImages(value: js.Array[GoogleCloudVisionV1p3beta1WebDetectionWebPage]): Self = StObject.set(x, "pagesWithMatchingImages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPagesWithMatchingImagesUndefined: Self = StObject.set(x, "pagesWithMatchingImages", js.undefined)
    
    @scala.inline
    def setPagesWithMatchingImagesVarargs(value: GoogleCloudVisionV1p3beta1WebDetectionWebPage*): Self = StObject.set(x, "pagesWithMatchingImages", js.Array(value :_*))
    
    @scala.inline
    def setPartialMatchingImages(value: js.Array[GoogleCloudVisionV1p3beta1WebDetectionWebImage]): Self = StObject.set(x, "partialMatchingImages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPartialMatchingImagesUndefined: Self = StObject.set(x, "partialMatchingImages", js.undefined)
    
    @scala.inline
    def setPartialMatchingImagesVarargs(value: GoogleCloudVisionV1p3beta1WebDetectionWebImage*): Self = StObject.set(x, "partialMatchingImages", js.Array(value :_*))
    
    @scala.inline
    def setVisuallySimilarImages(value: js.Array[GoogleCloudVisionV1p3beta1WebDetectionWebImage]): Self = StObject.set(x, "visuallySimilarImages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisuallySimilarImagesUndefined: Self = StObject.set(x, "visuallySimilarImages", js.undefined)
    
    @scala.inline
    def setVisuallySimilarImagesVarargs(value: GoogleCloudVisionV1p3beta1WebDetectionWebImage*): Self = StObject.set(x, "visuallySimilarImages", js.Array(value :_*))
    
    @scala.inline
    def setWebEntities(value: js.Array[GoogleCloudVisionV1p3beta1WebDetectionWebEntity]): Self = StObject.set(x, "webEntities", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebEntitiesUndefined: Self = StObject.set(x, "webEntities", js.undefined)
    
    @scala.inline
    def setWebEntitiesVarargs(value: GoogleCloudVisionV1p3beta1WebDetectionWebEntity*): Self = StObject.set(x, "webEntities", js.Array(value :_*))
  }
}
