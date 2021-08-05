package typings.maximMazurokGapiClientManufacturers

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientManufacturers.anon.Accesstoken
import typings.maximMazurokGapiClientManufacturers.anon.Alt
import typings.maximMazurokGapiClientManufacturers.anon.Callback
import typings.maximMazurokGapiClientManufacturers.anon.Fields
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object gapi {
  
  object client {
    
    object manufacturers {
      
      trait AccountsResource extends StObject {
        
        var products: ProductsResource
      }
      object AccountsResource {
        
        inline def apply(products: ProductsResource): AccountsResource = {
          val __obj = js.Dynamic.literal(products = products.asInstanceOf[js.Any])
          __obj.asInstanceOf[AccountsResource]
        }
        
        extension [Self <: AccountsResource](x: Self) {
          
          inline def setProducts(value: ProductsResource): Self = StObject.set(x, "products", value.asInstanceOf[js.Any])
        }
      }
      
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
        
        /** A list of excluded destinations. */
        var excludedDestination: js.UndefOr[js.Array[String]] = js.undefined
        
        /** The rich format description of the product. For more information, see https://support.google.com/manufacturers/answer/6124116#featuredesc. */
        var featureDescription: js.UndefOr[js.Array[FeatureDescription]] = js.undefined
        
        /** The flavor of the product. For more information, see https://support.google.com/manufacturers/answer/6124116#flavor. */
        var flavor: js.UndefOr[String] = js.undefined
        
        /** The format of the product. For more information, see https://support.google.com/manufacturers/answer/6124116#format. */
        var format: js.UndefOr[String] = js.undefined
        
        /** The target gender of the product. For more information, see https://support.google.com/manufacturers/answer/6124116#gender. */
        var gender: js.UndefOr[String] = js.undefined
        
        /** The Global Trade Item Number (GTIN) of the product. For more information, see https://support.google.com/manufacturers/answer/6124116#gtin. */
        var gtin: js.UndefOr[js.Array[String]] = js.undefined
        
        /** The image of the product. For more information, see https://support.google.com/manufacturers/answer/6124116#image. */
        var imageLink: js.UndefOr[Image] = js.undefined
        
        /** A list of included destinations. */
        var includedDestination: js.UndefOr[js.Array[String]] = js.undefined
        
        /** The item group id of the product. For more information, see https://support.google.com/manufacturers/answer/6124116#itemgroupid. */
        var itemGroupId: js.UndefOr[String] = js.undefined
        
        /** The material of the product. For more information, see https://support.google.com/manufacturers/answer/6124116#material. */
        var material: js.UndefOr[String] = js.undefined
        
        /** The Manufacturer Part Number (MPN) of the product. For more information, see https://support.google.com/manufacturers/answer/6124116#mpn. */
        var mpn: js.UndefOr[String] = js.undefined
        
        /** The pattern of the product. For more information, see https://support.google.com/manufacturers/answer/6124116#pattern. */
        var pattern: js.UndefOr[String] = js.undefined
        
        /** The details of the product. For more information, see https://support.google.com/manufacturers/answer/6124116#productdetail. */
        var productDetail: js.UndefOr[js.Array[ProductDetail]] = js.undefined
        
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
        var sizeType: js.UndefOr[String] = js.undefined
        
        /** The suggested retail price (MSRP) of the product. For more information, see https://support.google.com/manufacturers/answer/6124116#price. */
        var suggestedRetailPrice: js.UndefOr[Price] = js.undefined
        
        /** The target client id. Should only be used in the accounts of the data partners. */
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
        
        extension [Self <: Attributes](x: Self) {
          
          inline def setAdditionalImageLink(value: js.Array[Image]): Self = StObject.set(x, "additionalImageLink", value.asInstanceOf[js.Any])
          
          inline def setAdditionalImageLinkUndefined: Self = StObject.set(x, "additionalImageLink", js.undefined)
          
          inline def setAdditionalImageLinkVarargs(value: Image*): Self = StObject.set(x, "additionalImageLink", js.Array(value :_*))
          
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
          
          inline def setExcludedDestinationVarargs(value: String*): Self = StObject.set(x, "excludedDestination", js.Array(value :_*))
          
          inline def setFeatureDescription(value: js.Array[FeatureDescription]): Self = StObject.set(x, "featureDescription", value.asInstanceOf[js.Any])
          
          inline def setFeatureDescriptionUndefined: Self = StObject.set(x, "featureDescription", js.undefined)
          
          inline def setFeatureDescriptionVarargs(value: FeatureDescription*): Self = StObject.set(x, "featureDescription", js.Array(value :_*))
          
          inline def setFlavor(value: String): Self = StObject.set(x, "flavor", value.asInstanceOf[js.Any])
          
          inline def setFlavorUndefined: Self = StObject.set(x, "flavor", js.undefined)
          
          inline def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
          
          inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
          
          inline def setGender(value: String): Self = StObject.set(x, "gender", value.asInstanceOf[js.Any])
          
          inline def setGenderUndefined: Self = StObject.set(x, "gender", js.undefined)
          
          inline def setGtin(value: js.Array[String]): Self = StObject.set(x, "gtin", value.asInstanceOf[js.Any])
          
          inline def setGtinUndefined: Self = StObject.set(x, "gtin", js.undefined)
          
          inline def setGtinVarargs(value: String*): Self = StObject.set(x, "gtin", js.Array(value :_*))
          
          inline def setImageLink(value: Image): Self = StObject.set(x, "imageLink", value.asInstanceOf[js.Any])
          
          inline def setImageLinkUndefined: Self = StObject.set(x, "imageLink", js.undefined)
          
          inline def setIncludedDestination(value: js.Array[String]): Self = StObject.set(x, "includedDestination", value.asInstanceOf[js.Any])
          
          inline def setIncludedDestinationUndefined: Self = StObject.set(x, "includedDestination", js.undefined)
          
          inline def setIncludedDestinationVarargs(value: String*): Self = StObject.set(x, "includedDestination", js.Array(value :_*))
          
          inline def setItemGroupId(value: String): Self = StObject.set(x, "itemGroupId", value.asInstanceOf[js.Any])
          
          inline def setItemGroupIdUndefined: Self = StObject.set(x, "itemGroupId", js.undefined)
          
          inline def setMaterial(value: String): Self = StObject.set(x, "material", value.asInstanceOf[js.Any])
          
          inline def setMaterialUndefined: Self = StObject.set(x, "material", js.undefined)
          
          inline def setMpn(value: String): Self = StObject.set(x, "mpn", value.asInstanceOf[js.Any])
          
          inline def setMpnUndefined: Self = StObject.set(x, "mpn", js.undefined)
          
          inline def setPattern(value: String): Self = StObject.set(x, "pattern", value.asInstanceOf[js.Any])
          
          inline def setPatternUndefined: Self = StObject.set(x, "pattern", js.undefined)
          
          inline def setProductDetail(value: js.Array[ProductDetail]): Self = StObject.set(x, "productDetail", value.asInstanceOf[js.Any])
          
          inline def setProductDetailUndefined: Self = StObject.set(x, "productDetail", js.undefined)
          
          inline def setProductDetailVarargs(value: ProductDetail*): Self = StObject.set(x, "productDetail", js.Array(value :_*))
          
          inline def setProductLine(value: String): Self = StObject.set(x, "productLine", value.asInstanceOf[js.Any])
          
          inline def setProductLineUndefined: Self = StObject.set(x, "productLine", js.undefined)
          
          inline def setProductName(value: String): Self = StObject.set(x, "productName", value.asInstanceOf[js.Any])
          
          inline def setProductNameUndefined: Self = StObject.set(x, "productName", js.undefined)
          
          inline def setProductPageUrl(value: String): Self = StObject.set(x, "productPageUrl", value.asInstanceOf[js.Any])
          
          inline def setProductPageUrlUndefined: Self = StObject.set(x, "productPageUrl", js.undefined)
          
          inline def setProductType(value: js.Array[String]): Self = StObject.set(x, "productType", value.asInstanceOf[js.Any])
          
          inline def setProductTypeUndefined: Self = StObject.set(x, "productType", js.undefined)
          
          inline def setProductTypeVarargs(value: String*): Self = StObject.set(x, "productType", js.Array(value :_*))
          
          inline def setReleaseDate(value: String): Self = StObject.set(x, "releaseDate", value.asInstanceOf[js.Any])
          
          inline def setReleaseDateUndefined: Self = StObject.set(x, "releaseDate", js.undefined)
          
          inline def setRichProductContent(value: js.Array[String]): Self = StObject.set(x, "richProductContent", value.asInstanceOf[js.Any])
          
          inline def setRichProductContentUndefined: Self = StObject.set(x, "richProductContent", js.undefined)
          
          inline def setRichProductContentVarargs(value: String*): Self = StObject.set(x, "richProductContent", js.Array(value :_*))
          
          inline def setScent(value: String): Self = StObject.set(x, "scent", value.asInstanceOf[js.Any])
          
          inline def setScentUndefined: Self = StObject.set(x, "scent", js.undefined)
          
          inline def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
          
          inline def setSizeSystem(value: String): Self = StObject.set(x, "sizeSystem", value.asInstanceOf[js.Any])
          
          inline def setSizeSystemUndefined: Self = StObject.set(x, "sizeSystem", js.undefined)
          
          inline def setSizeType(value: String): Self = StObject.set(x, "sizeType", value.asInstanceOf[js.Any])
          
          inline def setSizeTypeUndefined: Self = StObject.set(x, "sizeType", js.undefined)
          
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
          
          inline def setVideoLinkVarargs(value: String*): Self = StObject.set(x, "videoLink", js.Array(value :_*))
        }
      }
      
      trait Capacity extends StObject {
        
        /** The unit of the capacity, i.e., MB, GB, or TB. */
        var unit: js.UndefOr[String] = js.undefined
        
        /** The numeric value of the capacity. */
        var value: js.UndefOr[String] = js.undefined
      }
      object Capacity {
        
        inline def apply(): Capacity = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[Capacity]
        }
        
        extension [Self <: Capacity](x: Self) {
          
          inline def setUnit(value: String): Self = StObject.set(x, "unit", value.asInstanceOf[js.Any])
          
          inline def setUnitUndefined: Self = StObject.set(x, "unit", js.undefined)
          
          inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
          
          inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
        }
      }
      
      trait Count extends StObject {
        
        /** The unit in which these products are counted. */
        var unit: js.UndefOr[String] = js.undefined
        
        /** The numeric value of the number of products in a package. */
        var value: js.UndefOr[String] = js.undefined
      }
      object Count {
        
        inline def apply(): Count = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[Count]
        }
        
        extension [Self <: Count](x: Self) {
          
          inline def setUnit(value: String): Self = StObject.set(x, "unit", value.asInstanceOf[js.Any])
          
          inline def setUnitUndefined: Self = StObject.set(x, "unit", js.undefined)
          
          inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
          
          inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
        }
      }
      
      trait DestinationStatus extends StObject {
        
        /** The name of the destination. */
        var destination: js.UndefOr[String] = js.undefined
        
        /** The status of the destination. */
        var status: js.UndefOr[String] = js.undefined
      }
      object DestinationStatus {
        
        inline def apply(): DestinationStatus = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[DestinationStatus]
        }
        
        extension [Self <: DestinationStatus](x: Self) {
          
          inline def setDestination(value: String): Self = StObject.set(x, "destination", value.asInstanceOf[js.Any])
          
          inline def setDestinationUndefined: Self = StObject.set(x, "destination", js.undefined)
          
          inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
          
          inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
        }
      }
      
      // tslint:disable-next-line:no-empty-interface
      trait Empty extends StObject
      
      trait FeatureDescription extends StObject {
        
        /** A short description of the feature. */
        var headline: js.UndefOr[String] = js.undefined
        
        /** An optional image describing the feature. */
        var image: js.UndefOr[Image] = js.undefined
        
        /** A detailed description of the feature. */
        var text: js.UndefOr[String] = js.undefined
      }
      object FeatureDescription {
        
        inline def apply(): FeatureDescription = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[FeatureDescription]
        }
        
        extension [Self <: FeatureDescription](x: Self) {
          
          inline def setHeadline(value: String): Self = StObject.set(x, "headline", value.asInstanceOf[js.Any])
          
          inline def setHeadlineUndefined: Self = StObject.set(x, "headline", js.undefined)
          
          inline def setImage(value: Image): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
          
          inline def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
          
          inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
          
          inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
        }
      }
      
      trait Image extends StObject {
        
        /** The URL of the image. For crawled images, this is the provided URL. For uploaded images, this is a serving URL from Google if the image has been processed successfully. */
        var imageUrl: js.UndefOr[String] = js.undefined
        
        /** The status of the image. @OutputOnly */
        var status: js.UndefOr[String] = js.undefined
        
        /** The type of the image, i.e., crawled or uploaded. @OutputOnly */
        var `type`: js.UndefOr[String] = js.undefined
      }
      object Image {
        
        inline def apply(): Image = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[Image]
        }
        
        extension [Self <: Image](x: Self) {
          
          inline def setImageUrl(value: String): Self = StObject.set(x, "imageUrl", value.asInstanceOf[js.Any])
          
          inline def setImageUrlUndefined: Self = StObject.set(x, "imageUrl", js.undefined)
          
          inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
          
          inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
          
          inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
          
          inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
        }
      }
      
      trait Issue extends StObject {
        
        /** If present, the attribute that triggered the issue. For more information about attributes, see https://support.google.com/manufacturers/answer/6124116. */
        var attribute: js.UndefOr[String] = js.undefined
        
        /** Longer description of the issue focused on how to resolve it. */
        var description: js.UndefOr[String] = js.undefined
        
        /** The destination this issue applies to. */
        var destination: js.UndefOr[String] = js.undefined
        
        /** What needs to happen to resolve the issue. */
        var resolution: js.UndefOr[String] = js.undefined
        
        /** The severity of the issue. */
        var severity: js.UndefOr[String] = js.undefined
        
        /** The timestamp when this issue appeared. */
        var timestamp: js.UndefOr[String] = js.undefined
        
        /** Short title describing the nature of the issue. */
        var title: js.UndefOr[String] = js.undefined
        
        /** The server-generated type of the issue, for example, “INCORRECT_TEXT_FORMATTING”, “IMAGE_NOT_SERVEABLE”, etc. */
        var `type`: js.UndefOr[String] = js.undefined
      }
      object Issue {
        
        inline def apply(): Issue = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[Issue]
        }
        
        extension [Self <: Issue](x: Self) {
          
          inline def setAttribute(value: String): Self = StObject.set(x, "attribute", value.asInstanceOf[js.Any])
          
          inline def setAttributeUndefined: Self = StObject.set(x, "attribute", js.undefined)
          
          inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
          
          inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
          
          inline def setDestination(value: String): Self = StObject.set(x, "destination", value.asInstanceOf[js.Any])
          
          inline def setDestinationUndefined: Self = StObject.set(x, "destination", js.undefined)
          
          inline def setResolution(value: String): Self = StObject.set(x, "resolution", value.asInstanceOf[js.Any])
          
          inline def setResolutionUndefined: Self = StObject.set(x, "resolution", js.undefined)
          
          inline def setSeverity(value: String): Self = StObject.set(x, "severity", value.asInstanceOf[js.Any])
          
          inline def setSeverityUndefined: Self = StObject.set(x, "severity", js.undefined)
          
          inline def setTimestamp(value: String): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
          
          inline def setTimestampUndefined: Self = StObject.set(x, "timestamp", js.undefined)
          
          inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
          
          inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
          
          inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
          
          inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
        }
      }
      
      trait ListProductsResponse extends StObject {
        
        /** The token for the retrieval of the next page of product statuses. */
        var nextPageToken: js.UndefOr[String] = js.undefined
        
        /** List of the products. */
        var products: js.UndefOr[js.Array[Product]] = js.undefined
      }
      object ListProductsResponse {
        
        inline def apply(): ListProductsResponse = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[ListProductsResponse]
        }
        
        extension [Self <: ListProductsResponse](x: Self) {
          
          inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
          
          inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
          
          inline def setProducts(value: js.Array[Product]): Self = StObject.set(x, "products", value.asInstanceOf[js.Any])
          
          inline def setProductsUndefined: Self = StObject.set(x, "products", js.undefined)
          
          inline def setProductsVarargs(value: Product*): Self = StObject.set(x, "products", js.Array(value :_*))
        }
      }
      
      trait Price extends StObject {
        
        /** The numeric value of the price. */
        var amount: js.UndefOr[String] = js.undefined
        
        /** The currency in which the price is denoted. */
        var currency: js.UndefOr[String] = js.undefined
      }
      object Price {
        
        inline def apply(): Price = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[Price]
        }
        
        extension [Self <: Price](x: Self) {
          
          inline def setAmount(value: String): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
          
          inline def setAmountUndefined: Self = StObject.set(x, "amount", js.undefined)
          
          inline def setCurrency(value: String): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
          
          inline def setCurrencyUndefined: Self = StObject.set(x, "currency", js.undefined)
        }
      }
      
      trait Product extends StObject {
        
        /** Attributes of the product uploaded to the Manufacturer Center. Manually edited attributes are taken into account. */
        var attributes: js.UndefOr[Attributes] = js.undefined
        
        /** The content language of the product as a two-letter ISO 639-1 language code (for example, en). */
        var contentLanguage: js.UndefOr[String] = js.undefined
        
        /** The status of the destinations. */
        var destinationStatuses: js.UndefOr[js.Array[DestinationStatus]] = js.undefined
        
        /** A server-generated list of issues associated with the product. */
        var issues: js.UndefOr[js.Array[Issue]] = js.undefined
        
        /**
          * Name in the format `{target_country}:{content_language}:{product_id}`. `target_country` - The target country of the product as a CLDR territory code (for example, US).
          * `content_language` - The content language of the product as a two-letter ISO 639-1 language code (for example, en). `product_id` - The ID of the product. For more information, see
          * https://support.google.com/manufacturers/answer/6124116#id.
          */
        var name: js.UndefOr[String] = js.undefined
        
        /** Parent ID in the format `accounts/{account_id}`. `account_id` - The ID of the Manufacturer Center account. */
        var parent: js.UndefOr[String] = js.undefined
        
        /** The ID of the product. For more information, see https://support.google.com/manufacturers/answer/6124116#id. */
        var productId: js.UndefOr[String] = js.undefined
        
        /** The target country of the product as a CLDR territory code (for example, US). */
        var targetCountry: js.UndefOr[String] = js.undefined
      }
      object Product {
        
        inline def apply(): Product = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[Product]
        }
        
        extension [Self <: Product](x: Self) {
          
          inline def setAttributes(value: Attributes): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
          
          inline def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
          
          inline def setContentLanguage(value: String): Self = StObject.set(x, "contentLanguage", value.asInstanceOf[js.Any])
          
          inline def setContentLanguageUndefined: Self = StObject.set(x, "contentLanguage", js.undefined)
          
          inline def setDestinationStatuses(value: js.Array[DestinationStatus]): Self = StObject.set(x, "destinationStatuses", value.asInstanceOf[js.Any])
          
          inline def setDestinationStatusesUndefined: Self = StObject.set(x, "destinationStatuses", js.undefined)
          
          inline def setDestinationStatusesVarargs(value: DestinationStatus*): Self = StObject.set(x, "destinationStatuses", js.Array(value :_*))
          
          inline def setIssues(value: js.Array[Issue]): Self = StObject.set(x, "issues", value.asInstanceOf[js.Any])
          
          inline def setIssuesUndefined: Self = StObject.set(x, "issues", js.undefined)
          
          inline def setIssuesVarargs(value: Issue*): Self = StObject.set(x, "issues", js.Array(value :_*))
          
          inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
          
          inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
          
          inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
          
          inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
          
          inline def setProductId(value: String): Self = StObject.set(x, "productId", value.asInstanceOf[js.Any])
          
          inline def setProductIdUndefined: Self = StObject.set(x, "productId", js.undefined)
          
          inline def setTargetCountry(value: String): Self = StObject.set(x, "targetCountry", value.asInstanceOf[js.Any])
          
          inline def setTargetCountryUndefined: Self = StObject.set(x, "targetCountry", js.undefined)
        }
      }
      
      trait ProductDetail extends StObject {
        
        /** The name of the attribute. */
        var attributeName: js.UndefOr[String] = js.undefined
        
        /** The value of the attribute. */
        var attributeValue: js.UndefOr[String] = js.undefined
        
        /** A short section name that can be reused between multiple product details. */
        var sectionName: js.UndefOr[String] = js.undefined
      }
      object ProductDetail {
        
        inline def apply(): ProductDetail = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[ProductDetail]
        }
        
        extension [Self <: ProductDetail](x: Self) {
          
          inline def setAttributeName(value: String): Self = StObject.set(x, "attributeName", value.asInstanceOf[js.Any])
          
          inline def setAttributeNameUndefined: Self = StObject.set(x, "attributeName", js.undefined)
          
          inline def setAttributeValue(value: String): Self = StObject.set(x, "attributeValue", value.asInstanceOf[js.Any])
          
          inline def setAttributeValueUndefined: Self = StObject.set(x, "attributeValue", js.undefined)
          
          inline def setSectionName(value: String): Self = StObject.set(x, "sectionName", value.asInstanceOf[js.Any])
          
          inline def setSectionNameUndefined: Self = StObject.set(x, "sectionName", js.undefined)
        }
      }
      
      @js.native
      trait ProductsResource extends StObject {
        
        /** Deletes the product from a Manufacturer Center account. */
        def delete(): Request[js.Object] = js.native
        def delete(request: Accesstoken): Request[js.Object] = js.native
        
        /**
          * Gets the product from a Manufacturer Center account, including product issues. A recently updated product takes around 15 minutes to process. Changes are only visible after it has
          * been processed. While some issues may be available once the product has been processed, other issues may take days to appear.
          */
        def get(): Request[Product] = js.native
        def get(request: Alt): Request[Product] = js.native
        
        /** Lists all the products in a Manufacturer Center account. */
        def list(): Request[ListProductsResponse] = js.native
        def list(request: Callback): Request[ListProductsResponse] = js.native
        
        def update(request: Accesstoken, body: Attributes): Request[js.Object] = js.native
        /**
          * Inserts or updates the attributes of the product in a Manufacturer Center account. Creates a product with the provided attributes. If the product already exists, then all attributes
          * are replaced with the new ones. The checks at upload time are minimal. All required attributes need to be present for a product to be valid. Issues may show up later after the API
          * has accepted a new upload for a product and it is possible to overwrite an existing valid product with an invalid product. To detect this, you should retrieve the product and check
          * it for issues once the new version is available. Uploaded attributes first need to be processed before they can be retrieved. Until then, new products will be unavailable, and
          * retrieval of previously uploaded products will return the original state of the product.
          */
        def update(request: Fields): Request[js.Object] = js.native
      }
    }
  }
}
