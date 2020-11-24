package typings.maximMazurokGapiClientVision.gapi.client.vision

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudVisionV1p2beta1WebDetection extends js.Object {
  
  /** The service's best guess as to the topic of the request image. Inferred from similar images on the open web. */
  var bestGuessLabels: js.UndefOr[js.Array[GoogleCloudVisionV1p2beta1WebDetectionWebLabel]] = js.native
  
  /** Fully matching images from the Internet. Can include resized copies of the query image. */
  var fullMatchingImages: js.UndefOr[js.Array[GoogleCloudVisionV1p2beta1WebDetectionWebImage]] = js.native
  
  /** Web pages containing the matching images from the Internet. */
  var pagesWithMatchingImages: js.UndefOr[js.Array[GoogleCloudVisionV1p2beta1WebDetectionWebPage]] = js.native
  
  /**
    * Partial matching images from the Internet. Those images are similar enough to share some key-point features. For example an original image will likely have partial matching for its
    * crops.
    */
  var partialMatchingImages: js.UndefOr[js.Array[GoogleCloudVisionV1p2beta1WebDetectionWebImage]] = js.native
  
  /** The visually similar image results. */
  var visuallySimilarImages: js.UndefOr[js.Array[GoogleCloudVisionV1p2beta1WebDetectionWebImage]] = js.native
  
  /** Deduced entities from similar images on the Internet. */
  var webEntities: js.UndefOr[js.Array[GoogleCloudVisionV1p2beta1WebDetectionWebEntity]] = js.native
}
object GoogleCloudVisionV1p2beta1WebDetection {
  
  @scala.inline
  def apply(): GoogleCloudVisionV1p2beta1WebDetection = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudVisionV1p2beta1WebDetection]
  }
  
  @scala.inline
  implicit class GoogleCloudVisionV1p2beta1WebDetectionOps[Self <: GoogleCloudVisionV1p2beta1WebDetection] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBestGuessLabelsVarargs(value: GoogleCloudVisionV1p2beta1WebDetectionWebLabel*): Self = this.set("bestGuessLabels", js.Array(value :_*))
    
    @scala.inline
    def setBestGuessLabels(value: js.Array[GoogleCloudVisionV1p2beta1WebDetectionWebLabel]): Self = this.set("bestGuessLabels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBestGuessLabels: Self = this.set("bestGuessLabels", js.undefined)
    
    @scala.inline
    def setFullMatchingImagesVarargs(value: GoogleCloudVisionV1p2beta1WebDetectionWebImage*): Self = this.set("fullMatchingImages", js.Array(value :_*))
    
    @scala.inline
    def setFullMatchingImages(value: js.Array[GoogleCloudVisionV1p2beta1WebDetectionWebImage]): Self = this.set("fullMatchingImages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFullMatchingImages: Self = this.set("fullMatchingImages", js.undefined)
    
    @scala.inline
    def setPagesWithMatchingImagesVarargs(value: GoogleCloudVisionV1p2beta1WebDetectionWebPage*): Self = this.set("pagesWithMatchingImages", js.Array(value :_*))
    
    @scala.inline
    def setPagesWithMatchingImages(value: js.Array[GoogleCloudVisionV1p2beta1WebDetectionWebPage]): Self = this.set("pagesWithMatchingImages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePagesWithMatchingImages: Self = this.set("pagesWithMatchingImages", js.undefined)
    
    @scala.inline
    def setPartialMatchingImagesVarargs(value: GoogleCloudVisionV1p2beta1WebDetectionWebImage*): Self = this.set("partialMatchingImages", js.Array(value :_*))
    
    @scala.inline
    def setPartialMatchingImages(value: js.Array[GoogleCloudVisionV1p2beta1WebDetectionWebImage]): Self = this.set("partialMatchingImages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePartialMatchingImages: Self = this.set("partialMatchingImages", js.undefined)
    
    @scala.inline
    def setVisuallySimilarImagesVarargs(value: GoogleCloudVisionV1p2beta1WebDetectionWebImage*): Self = this.set("visuallySimilarImages", js.Array(value :_*))
    
    @scala.inline
    def setVisuallySimilarImages(value: js.Array[GoogleCloudVisionV1p2beta1WebDetectionWebImage]): Self = this.set("visuallySimilarImages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisuallySimilarImages: Self = this.set("visuallySimilarImages", js.undefined)
    
    @scala.inline
    def setWebEntitiesVarargs(value: GoogleCloudVisionV1p2beta1WebDetectionWebEntity*): Self = this.set("webEntities", js.Array(value :_*))
    
    @scala.inline
    def setWebEntities(value: js.Array[GoogleCloudVisionV1p2beta1WebDetectionWebEntity]): Self = this.set("webEntities", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWebEntities: Self = this.set("webEntities", js.undefined)
  }
}
