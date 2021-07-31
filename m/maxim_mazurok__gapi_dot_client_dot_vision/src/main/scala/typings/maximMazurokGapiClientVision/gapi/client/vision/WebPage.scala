package typings.maximMazurokGapiClientVision.gapi.client.vision

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WebPage extends StObject {
  
  /** Fully matching images on the page. Can include resized copies of the query image. */
  var fullMatchingImages: js.UndefOr[js.Array[WebImage]] = js.undefined
  
  /** Title for the web page, may contain HTML markups. */
  var pageTitle: js.UndefOr[String] = js.undefined
  
  /** Partial matching images on the page. Those images are similar enough to share some key-point features. For example an original image will likely have partial matching for its crops. */
  var partialMatchingImages: js.UndefOr[js.Array[WebImage]] = js.undefined
  
  /** (Deprecated) Overall relevancy score for the web page. */
  var score: js.UndefOr[Double] = js.undefined
  
  /** The result web page URL. */
  var url: js.UndefOr[String] = js.undefined
}
object WebPage {
  
  @scala.inline
  def apply(): WebPage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WebPage]
  }
  
  @scala.inline
  implicit class WebPageMutableBuilder[Self <: WebPage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFullMatchingImages(value: js.Array[WebImage]): Self = StObject.set(x, "fullMatchingImages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFullMatchingImagesUndefined: Self = StObject.set(x, "fullMatchingImages", js.undefined)
    
    @scala.inline
    def setFullMatchingImagesVarargs(value: WebImage*): Self = StObject.set(x, "fullMatchingImages", js.Array(value :_*))
    
    @scala.inline
    def setPageTitle(value: String): Self = StObject.set(x, "pageTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageTitleUndefined: Self = StObject.set(x, "pageTitle", js.undefined)
    
    @scala.inline
    def setPartialMatchingImages(value: js.Array[WebImage]): Self = StObject.set(x, "partialMatchingImages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPartialMatchingImagesUndefined: Self = StObject.set(x, "partialMatchingImages", js.undefined)
    
    @scala.inline
    def setPartialMatchingImagesVarargs(value: WebImage*): Self = StObject.set(x, "partialMatchingImages", js.Array(value :_*))
    
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
