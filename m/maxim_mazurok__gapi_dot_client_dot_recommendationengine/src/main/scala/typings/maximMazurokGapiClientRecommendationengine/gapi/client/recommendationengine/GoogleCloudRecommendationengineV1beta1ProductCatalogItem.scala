package typings.maximMazurokGapiClientRecommendationengine.gapi.client.recommendationengine

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudRecommendationengineV1beta1ProductCatalogItem extends js.Object {
  
  /** Optional. The available quantity of the item. */
  var availableQuantity: js.UndefOr[String] = js.native
  
  /** Optional. Canonical URL directly linking to the item detail page with a length limit of 5 KiB.. */
  var canonicalProductUri: js.UndefOr[String] = js.native
  
  /**
    * Optional. A map to pass the costs associated with the product. For example: {"manufacturing": 45.5} The profit of selling this item is computed like so: * If 'exactPrice' is
    * provided, profit = displayPrice - sum(costs) * If 'priceRange' is provided, profit = minPrice - sum(costs)
    */
  var costs: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: number}
    */ typings.maximMazurokGapiClientRecommendationengine.maximMazurokGapiClientRecommendationengineStrings.GoogleCloudRecommendationengineV1beta1ProductCatalogItem with TopLevel[js.Any]
  ] = js.native
  
  /** Optional. Only required if the price is set. Currency code for price/costs. Use three-character ISO-4217 code. */
  var currencyCode: js.UndefOr[String] = js.native
  
  /** Optional. The exact product price. */
  var exactPrice: js.UndefOr[GoogleCloudRecommendationengineV1beta1ProductCatalogItemExactPrice] = js.native
  
  /** Optional. Product images for the catalog item. */
  var images: js.UndefOr[js.Array[GoogleCloudRecommendationengineV1beta1Image]] = js.native
  
  /** Optional. The product price range. */
  var priceRange: js.UndefOr[GoogleCloudRecommendationengineV1beta1ProductCatalogItemPriceRange] = js.native
  
  /** Optional. Online stock state of the catalog item. Default is `IN_STOCK`. */
  var stockState: js.UndefOr[String] = js.native
}
object GoogleCloudRecommendationengineV1beta1ProductCatalogItem {
  
  @scala.inline
  def apply(): GoogleCloudRecommendationengineV1beta1ProductCatalogItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudRecommendationengineV1beta1ProductCatalogItem]
  }
  
  @scala.inline
  implicit class GoogleCloudRecommendationengineV1beta1ProductCatalogItemOps[Self <: GoogleCloudRecommendationengineV1beta1ProductCatalogItem] (val x: Self) extends AnyVal {
    
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
    def setAvailableQuantity(value: String): Self = this.set("availableQuantity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAvailableQuantity: Self = this.set("availableQuantity", js.undefined)
    
    @scala.inline
    def setCanonicalProductUri(value: String): Self = this.set("canonicalProductUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCanonicalProductUri: Self = this.set("canonicalProductUri", js.undefined)
    
    @scala.inline
    def setCosts(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: number}
      */ typings.maximMazurokGapiClientRecommendationengine.maximMazurokGapiClientRecommendationengineStrings.GoogleCloudRecommendationengineV1beta1ProductCatalogItem with TopLevel[js.Any]
    ): Self = this.set("costs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCosts: Self = this.set("costs", js.undefined)
    
    @scala.inline
    def setCurrencyCode(value: String): Self = this.set("currencyCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCurrencyCode: Self = this.set("currencyCode", js.undefined)
    
    @scala.inline
    def setExactPrice(value: GoogleCloudRecommendationengineV1beta1ProductCatalogItemExactPrice): Self = this.set("exactPrice", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExactPrice: Self = this.set("exactPrice", js.undefined)
    
    @scala.inline
    def setImagesVarargs(value: GoogleCloudRecommendationengineV1beta1Image*): Self = this.set("images", js.Array(value :_*))
    
    @scala.inline
    def setImages(value: js.Array[GoogleCloudRecommendationengineV1beta1Image]): Self = this.set("images", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImages: Self = this.set("images", js.undefined)
    
    @scala.inline
    def setPriceRange(value: GoogleCloudRecommendationengineV1beta1ProductCatalogItemPriceRange): Self = this.set("priceRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePriceRange: Self = this.set("priceRange", js.undefined)
    
    @scala.inline
    def setStockState(value: String): Self = this.set("stockState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStockState: Self = this.set("stockState", js.undefined)
  }
}
