package typings.maximMazurokGapiClientVision.gapi.client.vision

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudVisionV1p3beta1ProductSearchResultsResult extends StObject {
  
  /** The resource name of the image from the product that is the closest match to the query. */
  var image: js.UndefOr[String] = js.native
  
  /** The Product. */
  var product: js.UndefOr[GoogleCloudVisionV1p3beta1Product] = js.native
  
  /** A confidence level on the match, ranging from 0 (no confidence) to 1 (full confidence). */
  var score: js.UndefOr[Double] = js.native
}
object GoogleCloudVisionV1p3beta1ProductSearchResultsResult {
  
  @scala.inline
  def apply(): GoogleCloudVisionV1p3beta1ProductSearchResultsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudVisionV1p3beta1ProductSearchResultsResult]
  }
  
  @scala.inline
  implicit class GoogleCloudVisionV1p3beta1ProductSearchResultsResultMutableBuilder[Self <: GoogleCloudVisionV1p3beta1ProductSearchResultsResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setImage(value: String): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
    
    @scala.inline
    def setProduct(value: GoogleCloudVisionV1p3beta1Product): Self = StObject.set(x, "product", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProductUndefined: Self = StObject.set(x, "product", js.undefined)
    
    @scala.inline
    def setScore(value: Double): Self = StObject.set(x, "score", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScoreUndefined: Self = StObject.set(x, "score", js.undefined)
  }
}
