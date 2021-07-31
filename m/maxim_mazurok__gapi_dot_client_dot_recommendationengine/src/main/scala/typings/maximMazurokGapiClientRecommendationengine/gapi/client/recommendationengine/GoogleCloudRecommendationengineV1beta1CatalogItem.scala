package typings.maximMazurokGapiClientRecommendationengine.gapi.client.recommendationengine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudRecommendationengineV1beta1CatalogItem extends StObject {
  
  /**
    * Required. Catalog item categories. This field is repeated for supporting one catalog item belonging to several parallel category hierarchies. For example, if a shoes product belongs
    * to both ["Shoes & Accessories" -> "Shoes"] and ["Sports & Fitness" -> "Athletic Clothing" -> "Shoes"], it could be represented as: "categoryHierarchies": [ { "categories": ["Shoes &
    * Accessories", "Shoes"]}, { "categories": ["Sports & Fitness", "Athletic Clothing", "Shoes"] } ]
    */
  var categoryHierarchies: js.UndefOr[js.Array[GoogleCloudRecommendationengineV1beta1CatalogItemCategoryHierarchy]] = js.undefined
  
  /** Optional. Catalog item description. UTF-8 encoded string with a length limit of 5 KiB. */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * Required. Catalog item identifier. UTF-8 encoded string with a length limit of 128 bytes. This id must be unique among all catalog items within the same catalog. It should also be
    * used when logging user events in order for the user events to be joined with the Catalog.
    */
  var id: js.UndefOr[String] = js.undefined
  
  /**
    * Optional. Highly encouraged. Extra catalog item attributes to be included in the recommendation model. For example, for retail products, this could include the store name, vendor,
    * style, color, etc. These are very strong signals for recommendation model, thus we highly recommend providing the item attributes here.
    */
  var itemAttributes: js.UndefOr[GoogleCloudRecommendationengineV1beta1FeatureMap] = js.undefined
  
  /**
    * Optional. Variant group identifier for prediction results. UTF-8 encoded string with a length limit of 128 bytes. This field must be enabled before it can be used. [Learn
    * more](/recommendations-ai/docs/catalog#item-group-id).
    */
  var itemGroupId: js.UndefOr[String] = js.undefined
  
  /**
    * Optional. Deprecated. The model automatically detects the text language. Your catalog can include text in different languages, but duplicating catalog items to provide text in
    * multiple languages can result in degraded model performance.
    */
  var languageCode: js.UndefOr[String] = js.undefined
  
  /** Optional. Metadata specific to retail products. */
  var productMetadata: js.UndefOr[GoogleCloudRecommendationengineV1beta1ProductCatalogItem] = js.undefined
  
  /**
    * Optional. Filtering tags associated with the catalog item. Each tag should be a UTF-8 encoded string with a length limit of 1 KiB. This tag can be used for filtering recommendation
    * results by passing the tag as part of the predict request filter.
    */
  var tags: js.UndefOr[js.Array[String]] = js.undefined
  
  /** Required. Catalog item title. UTF-8 encoded string with a length limit of 1 KiB. */
  var title: js.UndefOr[String] = js.undefined
}
object GoogleCloudRecommendationengineV1beta1CatalogItem {
  
  @scala.inline
  def apply(): GoogleCloudRecommendationengineV1beta1CatalogItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudRecommendationengineV1beta1CatalogItem]
  }
  
  @scala.inline
  implicit class GoogleCloudRecommendationengineV1beta1CatalogItemMutableBuilder[Self <: GoogleCloudRecommendationengineV1beta1CatalogItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCategoryHierarchies(value: js.Array[GoogleCloudRecommendationengineV1beta1CatalogItemCategoryHierarchy]): Self = StObject.set(x, "categoryHierarchies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCategoryHierarchiesUndefined: Self = StObject.set(x, "categoryHierarchies", js.undefined)
    
    @scala.inline
    def setCategoryHierarchiesVarargs(value: GoogleCloudRecommendationengineV1beta1CatalogItemCategoryHierarchy*): Self = StObject.set(x, "categoryHierarchies", js.Array(value :_*))
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setItemAttributes(value: GoogleCloudRecommendationengineV1beta1FeatureMap): Self = StObject.set(x, "itemAttributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemAttributesUndefined: Self = StObject.set(x, "itemAttributes", js.undefined)
    
    @scala.inline
    def setItemGroupId(value: String): Self = StObject.set(x, "itemGroupId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemGroupIdUndefined: Self = StObject.set(x, "itemGroupId", js.undefined)
    
    @scala.inline
    def setLanguageCode(value: String): Self = StObject.set(x, "languageCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLanguageCodeUndefined: Self = StObject.set(x, "languageCode", js.undefined)
    
    @scala.inline
    def setProductMetadata(value: GoogleCloudRecommendationengineV1beta1ProductCatalogItem): Self = StObject.set(x, "productMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProductMetadataUndefined: Self = StObject.set(x, "productMetadata", js.undefined)
    
    @scala.inline
    def setTags(value: js.Array[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: String*): Self = StObject.set(x, "tags", js.Array(value :_*))
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
