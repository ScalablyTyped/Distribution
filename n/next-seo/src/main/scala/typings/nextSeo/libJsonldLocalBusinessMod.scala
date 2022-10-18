package typings.nextSeo

import typings.nextSeo.libJsonldJsonldMod.JsonLdProps
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libJsonldLocalBusinessMod {
  
  @JSImport("next-seo/lib/jsonld/localBusiness", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(
    hasTypeKeyOverrideAddressGeoRatingReviewActionAreaServedMakesOfferOpeningHoursImagesRest: LocalBusinessJsonLdProps
  ): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(hasTypeKeyOverrideAddressGeoRatingReviewActionAreaServedMakesOfferOpeningHoursImagesRest.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  trait LocalBusinessJsonLdProps
    extends StObject
       with JsonLdProps {
    
    var action: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Action */ Any
      ] = js.undefined
    
    var address: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Address */ Any
    
    var areaServed: js.UndefOr[
        js.Array[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify GeoCircle */ Any
        ]
      ] = js.undefined
    
    var description: String
    
    var geo: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Geo */ Any
      ] = js.undefined
    
    var id: String
    
    var images: js.UndefOr[js.Array[String]] = js.undefined
    
    var makesOffer: js.UndefOr[
        js.Array[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Offer */ Any
        ]
      ] = js.undefined
    
    var name: String
    
    var openingHours: js.UndefOr[
        (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OpeningHoursSpecification */ Any) | (js.Array[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OpeningHoursSpecification */ Any
        ])
      ] = js.undefined
    
    var priceRange: js.UndefOr[String] = js.undefined
    
    var rating: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AggregateRating */ Any
      ] = js.undefined
    
    var review: js.UndefOr[
        js.Array[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Review */ Any
        ]
      ] = js.undefined
    
    var sameAs: js.UndefOr[js.Array[String]] = js.undefined
    
    var servesCuisine: js.UndefOr[String | js.Array[String]] = js.undefined
    
    var telephone: js.UndefOr[String] = js.undefined
    
    @JSName("type")
    var type_LocalBusinessJsonLdProps: String
    
    var url: js.UndefOr[String] = js.undefined
  }
  object LocalBusinessJsonLdProps {
    
    inline def apply(
      address: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Address */ Any,
      description: String,
      id: String,
      name: String,
      `type`: String
    ): LocalBusinessJsonLdProps = {
      val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[LocalBusinessJsonLdProps]
    }
    
    extension [Self <: LocalBusinessJsonLdProps](x: Self) {
      
      inline def setAction(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Action */ Any
      ): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
      
      inline def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
      
      inline def setAddress(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Address */ Any
      ): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
      
      inline def setAreaServed(
        value: js.Array[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify GeoCircle */ Any
            ]
      ): Self = StObject.set(x, "areaServed", value.asInstanceOf[js.Any])
      
      inline def setAreaServedUndefined: Self = StObject.set(x, "areaServed", js.undefined)
      
      inline def setAreaServedVarargs(
        value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify GeoCircle */ Any)*
      ): Self = StObject.set(x, "areaServed", js.Array(value*))
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setGeo(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Geo */ Any
      ): Self = StObject.set(x, "geo", value.asInstanceOf[js.Any])
      
      inline def setGeoUndefined: Self = StObject.set(x, "geo", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setImages(value: js.Array[String]): Self = StObject.set(x, "images", value.asInstanceOf[js.Any])
      
      inline def setImagesUndefined: Self = StObject.set(x, "images", js.undefined)
      
      inline def setImagesVarargs(value: String*): Self = StObject.set(x, "images", js.Array(value*))
      
      inline def setMakesOffer(
        value: js.Array[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Offer */ Any
            ]
      ): Self = StObject.set(x, "makesOffer", value.asInstanceOf[js.Any])
      
      inline def setMakesOfferUndefined: Self = StObject.set(x, "makesOffer", js.undefined)
      
      inline def setMakesOfferVarargs(
        value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Offer */ Any)*
      ): Self = StObject.set(x, "makesOffer", js.Array(value*))
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setOpeningHours(
        value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OpeningHoursSpecification */ Any) | (js.Array[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OpeningHoursSpecification */ Any
            ])
      ): Self = StObject.set(x, "openingHours", value.asInstanceOf[js.Any])
      
      inline def setOpeningHoursUndefined: Self = StObject.set(x, "openingHours", js.undefined)
      
      inline def setOpeningHoursVarargs(
        value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OpeningHoursSpecification */ Any)*
      ): Self = StObject.set(x, "openingHours", js.Array(value*))
      
      inline def setPriceRange(value: String): Self = StObject.set(x, "priceRange", value.asInstanceOf[js.Any])
      
      inline def setPriceRangeUndefined: Self = StObject.set(x, "priceRange", js.undefined)
      
      inline def setRating(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AggregateRating */ Any
      ): Self = StObject.set(x, "rating", value.asInstanceOf[js.Any])
      
      inline def setRatingUndefined: Self = StObject.set(x, "rating", js.undefined)
      
      inline def setReview(
        value: js.Array[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Review */ Any
            ]
      ): Self = StObject.set(x, "review", value.asInstanceOf[js.Any])
      
      inline def setReviewUndefined: Self = StObject.set(x, "review", js.undefined)
      
      inline def setReviewVarargs(
        value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Review */ Any)*
      ): Self = StObject.set(x, "review", js.Array(value*))
      
      inline def setSameAs(value: js.Array[String]): Self = StObject.set(x, "sameAs", value.asInstanceOf[js.Any])
      
      inline def setSameAsUndefined: Self = StObject.set(x, "sameAs", js.undefined)
      
      inline def setSameAsVarargs(value: String*): Self = StObject.set(x, "sameAs", js.Array(value*))
      
      inline def setServesCuisine(value: String | js.Array[String]): Self = StObject.set(x, "servesCuisine", value.asInstanceOf[js.Any])
      
      inline def setServesCuisineUndefined: Self = StObject.set(x, "servesCuisine", js.undefined)
      
      inline def setServesCuisineVarargs(value: String*): Self = StObject.set(x, "servesCuisine", js.Array(value*))
      
      inline def setTelephone(value: String): Self = StObject.set(x, "telephone", value.asInstanceOf[js.Any])
      
      inline def setTelephoneUndefined: Self = StObject.set(x, "telephone", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    }
  }
}
