package typings.maximMazurokGapiClientManufacturers.gapi.client.manufacturers

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Attributes extends StObject {
  
  /** The additional images of the product. For more information, see https://support.google.com/manufacturers/answer/6124116#addlimage. */
  var additionalImageLink: js.UndefOr[js.Array[Image]] = js.undefined
  
  /** The target age group of the product. For more information, see https://support.google.com/manufacturers/answer/6124116#agegroup. */
  var ageGroup: js.UndefOr[String] = js.undefined
  
  /** The brand name of the product. For more information, see https://support.google.com/manufacturers/answer/6124116#brand. */
  var brand: js.UndefOr[String] = js.undefined
  
  /** The capacity of the product. For more information, see https://support.google.com/manufacturers/answer/6124116#capacity. */
  var capacity: js.UndefOr[Capacity] = js.undefined
  
  /** The color of the product. For more information, see https://support.google.com/manufacturers/answer/6124116#color. */
  var color: js.UndefOr[String] = js.undefined
  
  /** The count of the product. For more information, see https://support.google.com/manufacturers/answer/6124116#count. */
  var count: js.UndefOr[Count] = js.undefined
  
  /** The description of the product. For more information, see https://support.google.com/manufacturers/answer/6124116#description. */
  var description: js.UndefOr[String] = js.undefined
  
  /** The disclosure date of the product. For more information, see https://support.google.com/manufacturers/answer/6124116#disclosure. */
  var disclosureDate: js.UndefOr[String] = js.undefined
  
  /**
    * A list of excluded destinations such as "ClientExport", "ClientShoppingCatalog" or "PartnerShoppingCatalog". For more information, see
    * https://support.google.com/manufacturers/answer/7443550
    */
  var excludedDestination: js.UndefOr[js.Array[String]] = js.undefined
  
  /** The rich format description of the product. For more information, see https://support.google.com/manufacturers/answer/6124116#featuredesc. */
  var featureDescription: js.UndefOr[js.Array[FeatureDescription]] = js.undefined
  
  /** The flavor of the product. For more information, see https://support.google.com/manufacturers/answer/6124116#flavor. */
  var flavor: js.UndefOr[String] = js.undefined
  
  /** The format of the product. For more information, see https://support.google.com/manufacturers/answer/6124116#format. */
  var format: js.UndefOr[String] = js.undefined
  
  /** The target gender of the product. For more information, see https://support.google.com/manufacturers/answer/6124116#gender. */
  var gender: js.UndefOr[String] = js.undefined
  
  /** Grocery Attributes. For more information, see go/mfc-nutrition-attributes. */
  var grocery: js.UndefOr[Grocery] = js.undefined
  
  /** The Global Trade Item Number (GTIN) of the product. For more information, see https://support.google.com/manufacturers/answer/6124116#gtin. */
  var gtin: js.UndefOr[js.Array[String]] = js.undefined
  
  /** The image of the product. For more information, see https://support.google.com/manufacturers/answer/6124116#image. */
  var imageLink: js.UndefOr[Image] = js.undefined
  
  /**
    * A list of included destinations such as "ClientExport", "ClientShoppingCatalog" or "PartnerShoppingCatalog". For more information, see
    * https://support.google.com/manufacturers/answer/7443550
    */
  var includedDestination: js.UndefOr[js.Array[String]] = js.undefined
  
  /** The item group id of the product. For more information, see https://support.google.com/manufacturers/answer/6124116#itemgroupid. */
  var itemGroupId: js.UndefOr[String] = js.undefined
  
  /** The material of the product. For more information, see https://support.google.com/manufacturers/answer/6124116#material. */
  var material: js.UndefOr[String] = js.undefined
  
  /** The Manufacturer Part Number (MPN) of the product. For more information, see https://support.google.com/manufacturers/answer/6124116#mpn. */
  var mpn: js.UndefOr[String] = js.undefined
  
  /** Nutrition Attributes. For more information, see go/mfc-nutrition-attributes. */
  var nutrition: js.UndefOr[Nutrition] = js.undefined
  
  /** The pattern of the product. For more information, see https://support.google.com/manufacturers/answer/6124116#pattern. */
  var pattern: js.UndefOr[String] = js.undefined
  
  /** The details of the product. For more information, see https://support.google.com/manufacturers/answer/6124116#productdetail. */
  var productDetail: js.UndefOr[js.Array[ProductDetail]] = js.undefined
  
  /** The product highlights. For more information, see https://support.google.com/manufacturers/answer/10066942 */
  var productHighlight: js.UndefOr[js.Array[String]] = js.undefined
  
  /** The name of the group of products related to the product. For more information, see https://support.google.com/manufacturers/answer/6124116#productline. */
  var productLine: js.UndefOr[String] = js.undefined
  
  /** The canonical name of the product. For more information, see https://support.google.com/manufacturers/answer/6124116#productname. */
  var productName: js.UndefOr[String] = js.undefined
  
  /** The URL of the detail page of the product. For more information, see https://support.google.com/manufacturers/answer/6124116#productpage. */
  var productPageUrl: js.UndefOr[String] = js.undefined
  
  /** The type or category of the product. For more information, see https://support.google.com/manufacturers/answer/6124116#producttype. */
  var productType: js.UndefOr[js.Array[String]] = js.undefined
  
  /** The release date of the product. For more information, see https://support.google.com/manufacturers/answer/6124116#release. */
  var releaseDate: js.UndefOr[String] = js.undefined
  
  /** Rich product content. For more information, see https://support.google.com/manufacturers/answer/9389865 */
  var richProductContent: js.UndefOr[js.Array[String]] = js.undefined
  
  /** The scent of the product. For more information, see https://support.google.com/manufacturers/answer/6124116#scent. */
  var scent: js.UndefOr[String] = js.undefined
  
  /** The size of the product. For more information, see https://support.google.com/manufacturers/answer/6124116#size. */
  var size: js.UndefOr[String] = js.undefined
  
  /** The size system of the product. For more information, see https://support.google.com/manufacturers/answer/6124116#sizesystem. */
  var sizeSystem: js.UndefOr[String] = js.undefined
  
  /** The size type of the product. For more information, see https://support.google.com/manufacturers/answer/6124116#sizetype. */
  var sizeType: js.UndefOr[js.Array[String]] = js.undefined
  
  /** The suggested retail price (MSRP) of the product. For more information, see https://support.google.com/manufacturers/answer/6124116#price. */
  var suggestedRetailPrice: js.UndefOr[Price] = js.undefined
  
  /** The target client id. Should only be used in the accounts of the data partners. For more information, see https://support.google.com/manufacturers/answer/10857344 */
  var targetClientId: js.UndefOr[String] = js.undefined
  
  /** The theme of the product. For more information, see https://support.google.com/manufacturers/answer/6124116#theme. */
  var theme: js.UndefOr[String] = js.undefined
  
  /** The title of the product. For more information, see https://support.google.com/manufacturers/answer/6124116#title. */
  var title: js.UndefOr[String] = js.undefined
  
  /** The videos of the product. For more information, see https://support.google.com/manufacturers/answer/6124116#video. */
  var videoLink: js.UndefOr[js.Array[String]] = js.undefined
}
object Attributes {
  
  inline def apply(): Attributes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Attributes]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Attributes] (val x: Self) extends AnyVal {
    
    inline def setAdditionalImageLink(value: js.Array[Image]): Self = StObject.set(x, "additionalImageLink", value.asInstanceOf[js.Any])
    
    inline def setAdditionalImageLinkUndefined: Self = StObject.set(x, "additionalImageLink", js.undefined)
    
    inline def setAdditionalImageLinkVarargs(value: Image*): Self = StObject.set(x, "additionalImageLink", js.Array(value*))
    
    inline def setAgeGroup(value: String): Self = StObject.set(x, "ageGroup", value.asInstanceOf[js.Any])
    
    inline def setAgeGroupUndefined: Self = StObject.set(x, "ageGroup", js.undefined)
    
    inline def setBrand(value: String): Self = StObject.set(x, "brand", value.asInstanceOf[js.Any])
    
    inline def setBrandUndefined: Self = StObject.set(x, "brand", js.undefined)
    
    inline def setCapacity(value: Capacity): Self = StObject.set(x, "capacity", value.asInstanceOf[js.Any])
    
    inline def setCapacityUndefined: Self = StObject.set(x, "capacity", js.undefined)
    
    inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setCount(value: Count): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    inline def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setDisclosureDate(value: String): Self = StObject.set(x, "disclosureDate", value.asInstanceOf[js.Any])
    
    inline def setDisclosureDateUndefined: Self = StObject.set(x, "disclosureDate", js.undefined)
    
    inline def setExcludedDestination(value: js.Array[String]): Self = StObject.set(x, "excludedDestination", value.asInstanceOf[js.Any])
    
    inline def setExcludedDestinationUndefined: Self = StObject.set(x, "excludedDestination", js.undefined)
    
    inline def setExcludedDestinationVarargs(value: String*): Self = StObject.set(x, "excludedDestination", js.Array(value*))
    
    inline def setFeatureDescription(value: js.Array[FeatureDescription]): Self = StObject.set(x, "featureDescription", value.asInstanceOf[js.Any])
    
    inline def setFeatureDescriptionUndefined: Self = StObject.set(x, "featureDescription", js.undefined)
    
    inline def setFeatureDescriptionVarargs(value: FeatureDescription*): Self = StObject.set(x, "featureDescription", js.Array(value*))
    
    inline def setFlavor(value: String): Self = StObject.set(x, "flavor", value.asInstanceOf[js.Any])
    
    inline def setFlavorUndefined: Self = StObject.set(x, "flavor", js.undefined)
    
    inline def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    inline def setGender(value: String): Self = StObject.set(x, "gender", value.asInstanceOf[js.Any])
    
    inline def setGenderUndefined: Self = StObject.set(x, "gender", js.undefined)
    
    inline def setGrocery(value: Grocery): Self = StObject.set(x, "grocery", value.asInstanceOf[js.Any])
    
    inline def setGroceryUndefined: Self = StObject.set(x, "grocery", js.undefined)
    
    inline def setGtin(value: js.Array[String]): Self = StObject.set(x, "gtin", value.asInstanceOf[js.Any])
    
    inline def setGtinUndefined: Self = StObject.set(x, "gtin", js.undefined)
    
    inline def setGtinVarargs(value: String*): Self = StObject.set(x, "gtin", js.Array(value*))
    
    inline def setImageLink(value: Image): Self = StObject.set(x, "imageLink", value.asInstanceOf[js.Any])
    
    inline def setImageLinkUndefined: Self = StObject.set(x, "imageLink", js.undefined)
    
    inline def setIncludedDestination(value: js.Array[String]): Self = StObject.set(x, "includedDestination", value.asInstanceOf[js.Any])
    
    inline def setIncludedDestinationUndefined: Self = StObject.set(x, "includedDestination", js.undefined)
    
    inline def setIncludedDestinationVarargs(value: String*): Self = StObject.set(x, "includedDestination", js.Array(value*))
    
    inline def setItemGroupId(value: String): Self = StObject.set(x, "itemGroupId", value.asInstanceOf[js.Any])
    
    inline def setItemGroupIdUndefined: Self = StObject.set(x, "itemGroupId", js.undefined)
    
    inline def setMaterial(value: String): Self = StObject.set(x, "material", value.asInstanceOf[js.Any])
    
    inline def setMaterialUndefined: Self = StObject.set(x, "material", js.undefined)
    
    inline def setMpn(value: String): Self = StObject.set(x, "mpn", value.asInstanceOf[js.Any])
    
    inline def setMpnUndefined: Self = StObject.set(x, "mpn", js.undefined)
    
    inline def setNutrition(value: Nutrition): Self = StObject.set(x, "nutrition", value.asInstanceOf[js.Any])
    
    inline def setNutritionUndefined: Self = StObject.set(x, "nutrition", js.undefined)
    
    inline def setPattern(value: String): Self = StObject.set(x, "pattern", value.asInstanceOf[js.Any])
    
    inline def setPatternUndefined: Self = StObject.set(x, "pattern", js.undefined)
    
    inline def setProductDetail(value: js.Array[ProductDetail]): Self = StObject.set(x, "productDetail", value.asInstanceOf[js.Any])
    
    inline def setProductDetailUndefined: Self = StObject.set(x, "productDetail", js.undefined)
    
    inline def setProductDetailVarargs(value: ProductDetail*): Self = StObject.set(x, "productDetail", js.Array(value*))
    
    inline def setProductHighlight(value: js.Array[String]): Self = StObject.set(x, "productHighlight", value.asInstanceOf[js.Any])
    
    inline def setProductHighlightUndefined: Self = StObject.set(x, "productHighlight", js.undefined)
    
    inline def setProductHighlightVarargs(value: String*): Self = StObject.set(x, "productHighlight", js.Array(value*))
    
    inline def setProductLine(value: String): Self = StObject.set(x, "productLine", value.asInstanceOf[js.Any])
    
    inline def setProductLineUndefined: Self = StObject.set(x, "productLine", js.undefined)
    
    inline def setProductName(value: String): Self = StObject.set(x, "productName", value.asInstanceOf[js.Any])
    
    inline def setProductNameUndefined: Self = StObject.set(x, "productName", js.undefined)
    
    inline def setProductPageUrl(value: String): Self = StObject.set(x, "productPageUrl", value.asInstanceOf[js.Any])
    
    inline def setProductPageUrlUndefined: Self = StObject.set(x, "productPageUrl", js.undefined)
    
    inline def setProductType(value: js.Array[String]): Self = StObject.set(x, "productType", value.asInstanceOf[js.Any])
    
    inline def setProductTypeUndefined: Self = StObject.set(x, "productType", js.undefined)
    
    inline def setProductTypeVarargs(value: String*): Self = StObject.set(x, "productType", js.Array(value*))
    
    inline def setReleaseDate(value: String): Self = StObject.set(x, "releaseDate", value.asInstanceOf[js.Any])
    
    inline def setReleaseDateUndefined: Self = StObject.set(x, "releaseDate", js.undefined)
    
    inline def setRichProductContent(value: js.Array[String]): Self = StObject.set(x, "richProductContent", value.asInstanceOf[js.Any])
    
    inline def setRichProductContentUndefined: Self = StObject.set(x, "richProductContent", js.undefined)
    
    inline def setRichProductContentVarargs(value: String*): Self = StObject.set(x, "richProductContent", js.Array(value*))
    
    inline def setScent(value: String): Self = StObject.set(x, "scent", value.asInstanceOf[js.Any])
    
    inline def setScentUndefined: Self = StObject.set(x, "scent", js.undefined)
    
    inline def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeSystem(value: String): Self = StObject.set(x, "sizeSystem", value.asInstanceOf[js.Any])
    
    inline def setSizeSystemUndefined: Self = StObject.set(x, "sizeSystem", js.undefined)
    
    inline def setSizeType(value: js.Array[String]): Self = StObject.set(x, "sizeType", value.asInstanceOf[js.Any])
    
    inline def setSizeTypeUndefined: Self = StObject.set(x, "sizeType", js.undefined)
    
    inline def setSizeTypeVarargs(value: String*): Self = StObject.set(x, "sizeType", js.Array(value*))
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    inline def setSuggestedRetailPrice(value: Price): Self = StObject.set(x, "suggestedRetailPrice", value.asInstanceOf[js.Any])
    
    inline def setSuggestedRetailPriceUndefined: Self = StObject.set(x, "suggestedRetailPrice", js.undefined)
    
    inline def setTargetClientId(value: String): Self = StObject.set(x, "targetClientId", value.asInstanceOf[js.Any])
    
    inline def setTargetClientIdUndefined: Self = StObject.set(x, "targetClientId", js.undefined)
    
    inline def setTheme(value: String): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    
    inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setVideoLink(value: js.Array[String]): Self = StObject.set(x, "videoLink", value.asInstanceOf[js.Any])
    
    inline def setVideoLinkUndefined: Self = StObject.set(x, "videoLink", js.undefined)
    
    inline def setVideoLinkVarargs(value: String*): Self = StObject.set(x, "videoLink", js.Array(value*))
  }
}
