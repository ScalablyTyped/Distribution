package typings.maximMazurokGapiClientRecommendationengine.gapi.client.recommendationengine

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudRecommendationengineV1beta1CatalogItem extends js.Object {
  
  /**
    * Required. Catalog item categories. This field is repeated for supporting one catalog item belonging to several parallel category hierarchies. For example, if a shoes product belongs
    * to both ["Shoes & Accessories" -> "Shoes"] and ["Sports & Fitness" -> "Athletic Clothing" -> "Shoes"], it could be represented as: "categoryHierarchies": [ { "categories": ["Shoes &
    * Accessories", "Shoes"]}, { "categories": ["Sports & Fitness", "Athletic Clothing", "Shoes"] } ]
    */
  var categoryHierarchies: js.UndefOr[js.Array[GoogleCloudRecommendationengineV1beta1CatalogItemCategoryHierarchy]] = js.native
  
  /** Optional. Catalog item description. UTF-8 encoded string with a length limit of 5 KiB. */
  var description: js.UndefOr[String] = js.native
  
  /**
    * Required. Catalog item identifier. UTF-8 encoded string with a length limit of 128 bytes. This id must be unique among all catalog items within the same catalog. It should also be
    * used when logging user events in order for the user events to be joined with the Catalog.
    */
  var id: js.UndefOr[String] = js.native
  
  /**
    * Optional. Highly encouraged. Extra catalog item attributes to be included in the recommendation model. For example, for retail products, this could include the store name, vendor,
    * style, color, etc. These are very strong signals for recommendation model, thus we highly recommend providing the item attributes here.
    */
  var itemAttributes: js.UndefOr[GoogleCloudRecommendationengineV1beta1FeatureMap] = js.native
  
  /**
    * Optional. Variant group identifier for prediction results. UTF-8 encoded string with a length limit of 128 bytes. This field must be enabled before it can be used. [Learn
    * more](/recommendations-ai/docs/catalog#item-group-id).
    */
  var itemGroupId: js.UndefOr[String] = js.native
  
  /**
    * Optional. Deprecated. The model automatically detects the text language. Your catalog can include text in different languages, but duplicating catalog items to provide text in
    * multiple languages can result in degraded model performance.
    */
  var languageCode: js.UndefOr[String] = js.native
  
  /** Optional. Metadata specific to retail products. */
  var productMetadata: js.UndefOr[GoogleCloudRecommendationengineV1beta1ProductCatalogItem] = js.native
  
  /**
    * Optional. Filtering tags associated with the catalog item. Each tag should be a UTF-8 encoded string with a length limit of 1 KiB. This tag can be used for filtering recommendation
    * results by passing the tag as part of the predict request filter.
    */
  var tags: js.UndefOr[js.Array[String]] = js.native
  
  /** Required. Catalog item title. UTF-8 encoded string with a length limit of 1 KiB. */
  var title: js.UndefOr[String] = js.native
}
object GoogleCloudRecommendationengineV1beta1CatalogItem {
  
  @scala.inline
  def apply(): GoogleCloudRecommendationengineV1beta1CatalogItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudRecommendationengineV1beta1CatalogItem]
  }
  
  @scala.inline
  implicit class GoogleCloudRecommendationengineV1beta1CatalogItemOps[Self <: GoogleCloudRecommendationengineV1beta1CatalogItem] (val x: Self) extends AnyVal {
    
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
    def setCategoryHierarchiesVarargs(value: GoogleCloudRecommendationengineV1beta1CatalogItemCategoryHierarchy*): Self = this.set("categoryHierarchies", js.Array(value :_*))
    
    @scala.inline
    def setCategoryHierarchies(value: js.Array[GoogleCloudRecommendationengineV1beta1CatalogItemCategoryHierarchy]): Self = this.set("categoryHierarchies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCategoryHierarchies: Self = this.set("categoryHierarchies", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setItemAttributes(value: GoogleCloudRecommendationengineV1beta1FeatureMap): Self = this.set("itemAttributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItemAttributes: Self = this.set("itemAttributes", js.undefined)
    
    @scala.inline
    def setItemGroupId(value: String): Self = this.set("itemGroupId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItemGroupId: Self = this.set("itemGroupId", js.undefined)
    
    @scala.inline
    def setLanguageCode(value: String): Self = this.set("languageCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLanguageCode: Self = this.set("languageCode", js.undefined)
    
    @scala.inline
    def setProductMetadata(value: GoogleCloudRecommendationengineV1beta1ProductCatalogItem): Self = this.set("productMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProductMetadata: Self = this.set("productMetadata", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: String*): Self = this.set("tags", js.Array(value :_*))
    
    @scala.inline
    def setTags(value: js.Array[String]): Self = this.set("tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
  }
}
