package typings.maximMazurokGapiClientRecommendationengine.gapi.client.recommendationengine

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudRecommendationengineV1beta1ProductEventDetail extends js.Object {
  
  /**
    * Optional. The id or name of the associated shopping cart. This id is used to associate multiple items added or present in the cart before purchase. This can only be set for
    * `add-to-cart`, `remove-from-cart`, `checkout-start`, `purchase-complete`, or `shopping-cart-page-view` events.
    */
  var cartId: js.UndefOr[String] = js.native
  
  /** Required for `add-to-list` and `remove-from-list` events. The id or name of the list that the item is being added to or removed from. Other event types should not set this field. */
  var listId: js.UndefOr[String] = js.native
  
  /**
    * Required for `category-page-view` events. Other event types should not set this field. The categories associated with a category page. Category pages include special pages such as
    * sales or promotions. For instance, a special sale page may have the category hierarchy: categories : ["Sales", "2017 Black Friday Deals"].
    */
  var pageCategories: js.UndefOr[js.Array[GoogleCloudRecommendationengineV1beta1CatalogItemCategoryHierarchy]] = js.native
  
  /**
    * The main product details related to the event. This field is required for the following event types: * `add-to-cart` * `add-to-list` * `checkout-start` * `detail-page-view` *
    * `purchase-complete` * `refund` * `remove-from-cart` * `remove-from-list` This field is optional for the following event types: * `page-visit` * `shopping-cart-page-view` - note that
    * 'product_details' should be set for this unless the shopping cart is empty. * `search` (highly encouraged) In a `search` event, this field represents the products returned to the
    * end user on the current page (the end user may have not finished broswing the whole page yet). When a new page is returned to the end user, after pagination/filtering/ordering even
    * for the same query, a new SEARCH event with different product_details is desired. The end user may have not finished broswing the whole page yet. This field is not allowed for the
    * following event types: * `category-page-view` * `home-page-view`
    */
  var productDetails: js.UndefOr[js.Array[GoogleCloudRecommendationengineV1beta1ProductDetail]] = js.native
  
  /**
    * Optional. A transaction represents the entire purchase transaction. Required for `purchase-complete` events. Optional for `checkout-start` events. Other event types should not set
    * this field.
    */
  var purchaseTransaction: js.UndefOr[GoogleCloudRecommendationengineV1beta1PurchaseTransaction] = js.native
  
  /** Required for `search` events. Other event types should not set this field. The user's search query as UTF-8 encoded text with a length limit of 5 KiB. */
  var searchQuery: js.UndefOr[String] = js.native
}
object GoogleCloudRecommendationengineV1beta1ProductEventDetail {
  
  @scala.inline
  def apply(): GoogleCloudRecommendationengineV1beta1ProductEventDetail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudRecommendationengineV1beta1ProductEventDetail]
  }
  
  @scala.inline
  implicit class GoogleCloudRecommendationengineV1beta1ProductEventDetailOps[Self <: GoogleCloudRecommendationengineV1beta1ProductEventDetail] (val x: Self) extends AnyVal {
    
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
    def setCartId(value: String): Self = this.set("cartId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCartId: Self = this.set("cartId", js.undefined)
    
    @scala.inline
    def setListId(value: String): Self = this.set("listId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteListId: Self = this.set("listId", js.undefined)
    
    @scala.inline
    def setPageCategoriesVarargs(value: GoogleCloudRecommendationengineV1beta1CatalogItemCategoryHierarchy*): Self = this.set("pageCategories", js.Array(value :_*))
    
    @scala.inline
    def setPageCategories(value: js.Array[GoogleCloudRecommendationengineV1beta1CatalogItemCategoryHierarchy]): Self = this.set("pageCategories", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePageCategories: Self = this.set("pageCategories", js.undefined)
    
    @scala.inline
    def setProductDetailsVarargs(value: GoogleCloudRecommendationengineV1beta1ProductDetail*): Self = this.set("productDetails", js.Array(value :_*))
    
    @scala.inline
    def setProductDetails(value: js.Array[GoogleCloudRecommendationengineV1beta1ProductDetail]): Self = this.set("productDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProductDetails: Self = this.set("productDetails", js.undefined)
    
    @scala.inline
    def setPurchaseTransaction(value: GoogleCloudRecommendationengineV1beta1PurchaseTransaction): Self = this.set("purchaseTransaction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePurchaseTransaction: Self = this.set("purchaseTransaction", js.undefined)
    
    @scala.inline
    def setSearchQuery(value: String): Self = this.set("searchQuery", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSearchQuery: Self = this.set("searchQuery", js.undefined)
  }
}
