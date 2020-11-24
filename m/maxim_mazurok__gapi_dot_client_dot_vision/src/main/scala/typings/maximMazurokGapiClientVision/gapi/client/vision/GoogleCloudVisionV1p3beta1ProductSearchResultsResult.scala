package typings.maximMazurokGapiClientVision.gapi.client.vision

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudVisionV1p3beta1ProductSearchResultsResult extends js.Object {
  
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
  implicit class GoogleCloudVisionV1p3beta1ProductSearchResultsResultOps[Self <: GoogleCloudVisionV1p3beta1ProductSearchResultsResult] (val x: Self) extends AnyVal {
    
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
    def setImage(value: String): Self = this.set("image", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImage: Self = this.set("image", js.undefined)
    
    @scala.inline
    def setProduct(value: GoogleCloudVisionV1p3beta1Product): Self = this.set("product", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProduct: Self = this.set("product", js.undefined)
    
    @scala.inline
    def setScore(value: Double): Self = this.set("score", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScore: Self = this.set("score", js.undefined)
  }
}
