package typings.maximMazurokGapiClientRecommendationengine.gapi.client.recommendationengine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudRecommendationengineV1beta1ProductDetail extends StObject {
  
  /**
    * Optional. Quantity of the products in stock when a user event happens. Optional. If provided, this overrides the available quantity in Catalog for this event. and can only be set if
    * `stock_status` is set to `IN_STOCK`. Note that if an item is out of stock, you must set the `stock_state` field to be `OUT_OF_STOCK`. Leaving this field unspecified / as zero is not
    * sufficient to mark the item out of stock.
    */
  var availableQuantity: js.UndefOr[Double] = js.native
  
  /** Optional. Currency code for price/costs. Use three-character ISO-4217 code. Required only if originalPrice or displayPrice is set. */
  var currencyCode: js.UndefOr[String] = js.native
  
  /** Optional. Display price of the product (e.g. discounted price). If provided, this will override the display price in Catalog for this product. */
  var displayPrice: js.UndefOr[Double] = js.native
  
  /** Required. Catalog item ID. UTF-8 encoded string with a length limit of 128 characters. */
  var id: js.UndefOr[String] = js.native
  
  /** Optional. Extra features associated with a product in the user event. */
  var itemAttributes: js.UndefOr[GoogleCloudRecommendationengineV1beta1FeatureMap] = js.native
  
  /** Optional. Original price of the product. If provided, this will override the original price in Catalog for this product. */
  var originalPrice: js.UndefOr[Double] = js.native
  
  /**
    * Optional. Quantity of the product associated with the user event. For example, this field will be 2 if two products are added to the shopping cart for `add-to-cart` event. Required
    * for `add-to-cart`, `add-to-list`, `remove-from-cart`, `checkout-start`, `purchase-complete`, `refund` event types.
    */
  var quantity: js.UndefOr[Double] = js.native
  
  /** Optional. Item stock state. If provided, this overrides the stock state in Catalog for items in this event. */
  var stockState: js.UndefOr[String] = js.native
}
object GoogleCloudRecommendationengineV1beta1ProductDetail {
  
  @scala.inline
  def apply(): GoogleCloudRecommendationengineV1beta1ProductDetail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudRecommendationengineV1beta1ProductDetail]
  }
  
  @scala.inline
  implicit class GoogleCloudRecommendationengineV1beta1ProductDetailMutableBuilder[Self <: GoogleCloudRecommendationengineV1beta1ProductDetail] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAvailableQuantity(value: Double): Self = StObject.set(x, "availableQuantity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAvailableQuantityUndefined: Self = StObject.set(x, "availableQuantity", js.undefined)
    
    @scala.inline
    def setCurrencyCode(value: String): Self = StObject.set(x, "currencyCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrencyCodeUndefined: Self = StObject.set(x, "currencyCode", js.undefined)
    
    @scala.inline
    def setDisplayPrice(value: Double): Self = StObject.set(x, "displayPrice", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayPriceUndefined: Self = StObject.set(x, "displayPrice", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setItemAttributes(value: GoogleCloudRecommendationengineV1beta1FeatureMap): Self = StObject.set(x, "itemAttributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemAttributesUndefined: Self = StObject.set(x, "itemAttributes", js.undefined)
    
    @scala.inline
    def setOriginalPrice(value: Double): Self = StObject.set(x, "originalPrice", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOriginalPriceUndefined: Self = StObject.set(x, "originalPrice", js.undefined)
    
    @scala.inline
    def setQuantity(value: Double): Self = StObject.set(x, "quantity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuantityUndefined: Self = StObject.set(x, "quantity", js.undefined)
    
    @scala.inline
    def setStockState(value: String): Self = StObject.set(x, "stockState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStockStateUndefined: Self = StObject.set(x, "stockState", js.undefined)
  }
}
