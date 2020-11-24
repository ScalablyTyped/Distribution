package typings.maximMazurokGapiClientRecommendationengine.gapi.client.recommendationengine

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudRecommendationengineV1beta1ProductCatalogItemExactPrice extends js.Object {
  
  /** Optional. Display price of the product. */
  var displayPrice: js.UndefOr[Double] = js.native
  
  /** Optional. Price of the product without any discount. If zero, by default set to be the 'displayPrice'. */
  var originalPrice: js.UndefOr[Double] = js.native
}
object GoogleCloudRecommendationengineV1beta1ProductCatalogItemExactPrice {
  
  @scala.inline
  def apply(): GoogleCloudRecommendationengineV1beta1ProductCatalogItemExactPrice = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudRecommendationengineV1beta1ProductCatalogItemExactPrice]
  }
  
  @scala.inline
  implicit class GoogleCloudRecommendationengineV1beta1ProductCatalogItemExactPriceOps[Self <: GoogleCloudRecommendationengineV1beta1ProductCatalogItemExactPrice] (val x: Self) extends AnyVal {
    
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
    def setDisplayPrice(value: Double): Self = this.set("displayPrice", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplayPrice: Self = this.set("displayPrice", js.undefined)
    
    @scala.inline
    def setOriginalPrice(value: Double): Self = this.set("originalPrice", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOriginalPrice: Self = this.set("originalPrice", js.undefined)
  }
}
