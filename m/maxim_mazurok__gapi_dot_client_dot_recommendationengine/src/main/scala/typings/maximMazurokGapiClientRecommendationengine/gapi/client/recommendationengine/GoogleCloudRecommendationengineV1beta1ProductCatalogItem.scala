package typings.maximMazurokGapiClientRecommendationengine.gapi.client.recommendationengine

import org.scalablytyped.runtime.TopLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudRecommendationengineV1beta1ProductCatalogItem extends StObject {
  
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
  implicit class GoogleCloudRecommendationengineV1beta1ProductCatalogItemMutableBuilder[Self <: GoogleCloudRecommendationengineV1beta1ProductCatalogItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAvailableQuantity(value: String): Self = StObject.set(x, "availableQuantity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAvailableQuantityUndefined: Self = StObject.set(x, "availableQuantity", js.undefined)
    
    @scala.inline
    def setCanonicalProductUri(value: String): Self = StObject.set(x, "canonicalProductUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCanonicalProductUriUndefined: Self = StObject.set(x, "canonicalProductUri", js.undefined)
    
    @scala.inline
    def setCosts(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: number}
      */ typings.maximMazurokGapiClientRecommendationengine.maximMazurokGapiClientRecommendationengineStrings.GoogleCloudRecommendationengineV1beta1ProductCatalogItem with TopLevel[js.Any]
    ): Self = StObject.set(x, "costs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCostsUndefined: Self = StObject.set(x, "costs", js.undefined)
    
    @scala.inline
    def setCurrencyCode(value: String): Self = StObject.set(x, "currencyCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrencyCodeUndefined: Self = StObject.set(x, "currencyCode", js.undefined)
    
    @scala.inline
    def setExactPrice(value: GoogleCloudRecommendationengineV1beta1ProductCatalogItemExactPrice): Self = StObject.set(x, "exactPrice", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExactPriceUndefined: Self = StObject.set(x, "exactPrice", js.undefined)
    
    @scala.inline
    def setImages(value: js.Array[GoogleCloudRecommendationengineV1beta1Image]): Self = StObject.set(x, "images", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImagesUndefined: Self = StObject.set(x, "images", js.undefined)
    
    @scala.inline
    def setImagesVarargs(value: GoogleCloudRecommendationengineV1beta1Image*): Self = StObject.set(x, "images", js.Array(value :_*))
    
    @scala.inline
    def setPriceRange(value: GoogleCloudRecommendationengineV1beta1ProductCatalogItemPriceRange): Self = StObject.set(x, "priceRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPriceRangeUndefined: Self = StObject.set(x, "priceRange", js.undefined)
    
    @scala.inline
    def setStockState(value: String): Self = StObject.set(x, "stockState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStockStateUndefined: Self = StObject.set(x, "stockState", js.undefined)
  }
}
