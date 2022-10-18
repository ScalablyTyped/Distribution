package typings.nextSeo

import typings.nextSeo.libJsonldJsonldMod.JsonLdProps
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libJsonldProductMod {
  
  @JSImport("next-seo/lib/jsonld/product", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(
    hasTypeKeyOverrideImagesBrandReviewsAggregateRatingManufacturerLogoManufacturerNameOffersAggregateOfferProductNameRest: ProductJsonLdProps
  ): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(hasTypeKeyOverrideImagesBrandReviewsAggregateRatingManufacturerLogoManufacturerNameOffersAggregateOfferProductNameRest.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  trait ProductJsonLdProps
    extends StObject
       with JsonLdProps {
    
    var aggregateOffer: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AggregateOffer */ Any
      ] = js.undefined
    
    var aggregateRating: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AggregateRating */ Any
      ] = js.undefined
    
    var award: js.UndefOr[String] = js.undefined
    
    var brand: js.UndefOr[String] = js.undefined
    
    var color: js.UndefOr[String] = js.undefined
    
    var description: js.UndefOr[String] = js.undefined
    
    var disambiguatingDescription: js.UndefOr[String] = js.undefined
    
    var gtin13: js.UndefOr[String] = js.undefined
    
    var gtin14: js.UndefOr[String] = js.undefined
    
    var gtin8: js.UndefOr[String] = js.undefined
    
    var images: js.UndefOr[js.Array[String]] = js.undefined
    
    var manufacturerLogo: js.UndefOr[String] = js.undefined
    
    var manufacturerName: js.UndefOr[String] = js.undefined
    
    var material: js.UndefOr[String] = js.undefined
    
    var mpn: js.UndefOr[String] = js.undefined
    
    var offers: js.UndefOr[
        (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Offers */ Any) | (js.Array[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Offers */ Any
        ])
      ] = js.undefined
    
    var productName: String
    
    var productionDate: js.UndefOr[String] = js.undefined
    
    var purchaseDate: js.UndefOr[String] = js.undefined
    
    var releaseDate: js.UndefOr[String] = js.undefined
    
    var reviews: js.UndefOr[
        js.Array[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Review */ Any
        ]
      ] = js.undefined
    
    var sku: js.UndefOr[String] = js.undefined
    
    var slogan: js.UndefOr[String] = js.undefined
  }
  object ProductJsonLdProps {
    
    inline def apply(productName: String): ProductJsonLdProps = {
      val __obj = js.Dynamic.literal(productName = productName.asInstanceOf[js.Any])
      __obj.asInstanceOf[ProductJsonLdProps]
    }
    
    extension [Self <: ProductJsonLdProps](x: Self) {
      
      inline def setAggregateOffer(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AggregateOffer */ Any
      ): Self = StObject.set(x, "aggregateOffer", value.asInstanceOf[js.Any])
      
      inline def setAggregateOfferUndefined: Self = StObject.set(x, "aggregateOffer", js.undefined)
      
      inline def setAggregateRating(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AggregateRating */ Any
      ): Self = StObject.set(x, "aggregateRating", value.asInstanceOf[js.Any])
      
      inline def setAggregateRatingUndefined: Self = StObject.set(x, "aggregateRating", js.undefined)
      
      inline def setAward(value: String): Self = StObject.set(x, "award", value.asInstanceOf[js.Any])
      
      inline def setAwardUndefined: Self = StObject.set(x, "award", js.undefined)
      
      inline def setBrand(value: String): Self = StObject.set(x, "brand", value.asInstanceOf[js.Any])
      
      inline def setBrandUndefined: Self = StObject.set(x, "brand", js.undefined)
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      inline def setDisambiguatingDescription(value: String): Self = StObject.set(x, "disambiguatingDescription", value.asInstanceOf[js.Any])
      
      inline def setDisambiguatingDescriptionUndefined: Self = StObject.set(x, "disambiguatingDescription", js.undefined)
      
      inline def setGtin13(value: String): Self = StObject.set(x, "gtin13", value.asInstanceOf[js.Any])
      
      inline def setGtin13Undefined: Self = StObject.set(x, "gtin13", js.undefined)
      
      inline def setGtin14(value: String): Self = StObject.set(x, "gtin14", value.asInstanceOf[js.Any])
      
      inline def setGtin14Undefined: Self = StObject.set(x, "gtin14", js.undefined)
      
      inline def setGtin8(value: String): Self = StObject.set(x, "gtin8", value.asInstanceOf[js.Any])
      
      inline def setGtin8Undefined: Self = StObject.set(x, "gtin8", js.undefined)
      
      inline def setImages(value: js.Array[String]): Self = StObject.set(x, "images", value.asInstanceOf[js.Any])
      
      inline def setImagesUndefined: Self = StObject.set(x, "images", js.undefined)
      
      inline def setImagesVarargs(value: String*): Self = StObject.set(x, "images", js.Array(value*))
      
      inline def setManufacturerLogo(value: String): Self = StObject.set(x, "manufacturerLogo", value.asInstanceOf[js.Any])
      
      inline def setManufacturerLogoUndefined: Self = StObject.set(x, "manufacturerLogo", js.undefined)
      
      inline def setManufacturerName(value: String): Self = StObject.set(x, "manufacturerName", value.asInstanceOf[js.Any])
      
      inline def setManufacturerNameUndefined: Self = StObject.set(x, "manufacturerName", js.undefined)
      
      inline def setMaterial(value: String): Self = StObject.set(x, "material", value.asInstanceOf[js.Any])
      
      inline def setMaterialUndefined: Self = StObject.set(x, "material", js.undefined)
      
      inline def setMpn(value: String): Self = StObject.set(x, "mpn", value.asInstanceOf[js.Any])
      
      inline def setMpnUndefined: Self = StObject.set(x, "mpn", js.undefined)
      
      inline def setOffers(
        value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Offers */ Any) | (js.Array[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Offers */ Any
            ])
      ): Self = StObject.set(x, "offers", value.asInstanceOf[js.Any])
      
      inline def setOffersUndefined: Self = StObject.set(x, "offers", js.undefined)
      
      inline def setOffersVarargs(
        value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Offers */ Any)*
      ): Self = StObject.set(x, "offers", js.Array(value*))
      
      inline def setProductName(value: String): Self = StObject.set(x, "productName", value.asInstanceOf[js.Any])
      
      inline def setProductionDate(value: String): Self = StObject.set(x, "productionDate", value.asInstanceOf[js.Any])
      
      inline def setProductionDateUndefined: Self = StObject.set(x, "productionDate", js.undefined)
      
      inline def setPurchaseDate(value: String): Self = StObject.set(x, "purchaseDate", value.asInstanceOf[js.Any])
      
      inline def setPurchaseDateUndefined: Self = StObject.set(x, "purchaseDate", js.undefined)
      
      inline def setReleaseDate(value: String): Self = StObject.set(x, "releaseDate", value.asInstanceOf[js.Any])
      
      inline def setReleaseDateUndefined: Self = StObject.set(x, "releaseDate", js.undefined)
      
      inline def setReviews(
        value: js.Array[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Review */ Any
            ]
      ): Self = StObject.set(x, "reviews", value.asInstanceOf[js.Any])
      
      inline def setReviewsUndefined: Self = StObject.set(x, "reviews", js.undefined)
      
      inline def setReviewsVarargs(
        value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Review */ Any)*
      ): Self = StObject.set(x, "reviews", js.Array(value*))
      
      inline def setSku(value: String): Self = StObject.set(x, "sku", value.asInstanceOf[js.Any])
      
      inline def setSkuUndefined: Self = StObject.set(x, "sku", js.undefined)
      
      inline def setSlogan(value: String): Self = StObject.set(x, "slogan", value.asInstanceOf[js.Any])
      
      inline def setSloganUndefined: Self = StObject.set(x, "slogan", js.undefined)
    }
  }
}
