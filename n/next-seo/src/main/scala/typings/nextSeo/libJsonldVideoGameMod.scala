package typings.nextSeo

import typings.nextSeo.libJsonldJsonldMod.JsonLdProps
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libJsonldVideoGameMod {
  
  @JSImport("next-seo/lib/jsonld/videoGame", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(
    hasTypeKeyOverrideAggregateRatingTrailerReviewsImageAuthorNameProviderProducerNameProducerUrlOffersOperatingSystemNamePlatformNameTranslatorNameLanguageNameGenreNamePublisherNameRest: VideoGameJsonLdProps
  ): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(hasTypeKeyOverrideAggregateRatingTrailerReviewsImageAuthorNameProviderProducerNameProducerUrlOffersOperatingSystemNamePlatformNameTranslatorNameLanguageNameGenreNamePublisherNameRest.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  trait VideoGameJsonLdProps
    extends StObject
       with JsonLdProps {
    
    var aggregateRating: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AggregateRating */ Any
      ] = js.undefined
    
    var applicationCategory: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ApplicationCategory */ Any
      ] = js.undefined
    
    var authorName: js.UndefOr[String] = js.undefined
    
    var datePublished: js.UndefOr[String] = js.undefined
    
    var description: js.UndefOr[String] = js.undefined
    
    var genreName: js.UndefOr[String | js.Array[String]] = js.undefined
    
    var image: js.UndefOr[String] = js.undefined
    
    var keyOverride: js.UndefOr[String] = js.undefined
    
    var keywords: js.UndefOr[String] = js.undefined
    
    var languageName: js.UndefOr[String | js.Array[String]] = js.undefined
    
    var memoryRequirements: js.UndefOr[String] = js.undefined
    
    var name: String
    
    var offers: js.UndefOr[
        (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Offers */ Any) | (js.Array[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Offers */ Any
        ])
      ] = js.undefined
    
    var operatingSystemName: js.UndefOr[String | js.Array[String]] = js.undefined
    
    var platformName: js.UndefOr[String | js.Array[String]] = js.undefined
    
    var playMode: js.UndefOr[
        (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify GamePlayMode */ Any) | (js.Array[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify GamePlayMode */ Any
        ])
      ] = js.undefined
    
    var processorRequirements: js.UndefOr[String] = js.undefined
    
    var producerName: js.UndefOr[String] = js.undefined
    
    var producerUrl: js.UndefOr[String] = js.undefined
    
    var providerName: js.UndefOr[String] = js.undefined
    
    var providerUrl: js.UndefOr[String] = js.undefined
    
    var publisherName: js.UndefOr[String | js.Array[String]] = js.undefined
    
    var reviews: js.UndefOr[
        js.Array[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Review */ Any
        ]
      ] = js.undefined
    
    var storageRequirements: js.UndefOr[String] = js.undefined
    
    var trailer: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Video */ Any
      ] = js.undefined
    
    var translatorName: js.UndefOr[String | js.Array[String]] = js.undefined
    
    var url: js.UndefOr[String] = js.undefined
  }
  object VideoGameJsonLdProps {
    
    inline def apply(name: String): VideoGameJsonLdProps = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[VideoGameJsonLdProps]
    }
    
    extension [Self <: VideoGameJsonLdProps](x: Self) {
      
      inline def setAggregateRating(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AggregateRating */ Any
      ): Self = StObject.set(x, "aggregateRating", value.asInstanceOf[js.Any])
      
      inline def setAggregateRatingUndefined: Self = StObject.set(x, "aggregateRating", js.undefined)
      
      inline def setApplicationCategory(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ApplicationCategory */ Any
      ): Self = StObject.set(x, "applicationCategory", value.asInstanceOf[js.Any])
      
      inline def setApplicationCategoryUndefined: Self = StObject.set(x, "applicationCategory", js.undefined)
      
      inline def setAuthorName(value: String): Self = StObject.set(x, "authorName", value.asInstanceOf[js.Any])
      
      inline def setAuthorNameUndefined: Self = StObject.set(x, "authorName", js.undefined)
      
      inline def setDatePublished(value: String): Self = StObject.set(x, "datePublished", value.asInstanceOf[js.Any])
      
      inline def setDatePublishedUndefined: Self = StObject.set(x, "datePublished", js.undefined)
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      inline def setGenreName(value: String | js.Array[String]): Self = StObject.set(x, "genreName", value.asInstanceOf[js.Any])
      
      inline def setGenreNameUndefined: Self = StObject.set(x, "genreName", js.undefined)
      
      inline def setGenreNameVarargs(value: String*): Self = StObject.set(x, "genreName", js.Array(value*))
      
      inline def setImage(value: String): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
      
      inline def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
      
      inline def setKeyOverride(value: String): Self = StObject.set(x, "keyOverride", value.asInstanceOf[js.Any])
      
      inline def setKeyOverrideUndefined: Self = StObject.set(x, "keyOverride", js.undefined)
      
      inline def setKeywords(value: String): Self = StObject.set(x, "keywords", value.asInstanceOf[js.Any])
      
      inline def setKeywordsUndefined: Self = StObject.set(x, "keywords", js.undefined)
      
      inline def setLanguageName(value: String | js.Array[String]): Self = StObject.set(x, "languageName", value.asInstanceOf[js.Any])
      
      inline def setLanguageNameUndefined: Self = StObject.set(x, "languageName", js.undefined)
      
      inline def setLanguageNameVarargs(value: String*): Self = StObject.set(x, "languageName", js.Array(value*))
      
      inline def setMemoryRequirements(value: String): Self = StObject.set(x, "memoryRequirements", value.asInstanceOf[js.Any])
      
      inline def setMemoryRequirementsUndefined: Self = StObject.set(x, "memoryRequirements", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setOffers(
        value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Offers */ Any) | (js.Array[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Offers */ Any
            ])
      ): Self = StObject.set(x, "offers", value.asInstanceOf[js.Any])
      
      inline def setOffersUndefined: Self = StObject.set(x, "offers", js.undefined)
      
      inline def setOffersVarargs(
        value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Offers */ Any)*
      ): Self = StObject.set(x, "offers", js.Array(value*))
      
      inline def setOperatingSystemName(value: String | js.Array[String]): Self = StObject.set(x, "operatingSystemName", value.asInstanceOf[js.Any])
      
      inline def setOperatingSystemNameUndefined: Self = StObject.set(x, "operatingSystemName", js.undefined)
      
      inline def setOperatingSystemNameVarargs(value: String*): Self = StObject.set(x, "operatingSystemName", js.Array(value*))
      
      inline def setPlatformName(value: String | js.Array[String]): Self = StObject.set(x, "platformName", value.asInstanceOf[js.Any])
      
      inline def setPlatformNameUndefined: Self = StObject.set(x, "platformName", js.undefined)
      
      inline def setPlatformNameVarargs(value: String*): Self = StObject.set(x, "platformName", js.Array(value*))
      
      inline def setPlayMode(
        value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify GamePlayMode */ Any) | (js.Array[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify GamePlayMode */ Any
            ])
      ): Self = StObject.set(x, "playMode", value.asInstanceOf[js.Any])
      
      inline def setPlayModeUndefined: Self = StObject.set(x, "playMode", js.undefined)
      
      inline def setPlayModeVarargs(
        value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify GamePlayMode */ Any)*
      ): Self = StObject.set(x, "playMode", js.Array(value*))
      
      inline def setProcessorRequirements(value: String): Self = StObject.set(x, "processorRequirements", value.asInstanceOf[js.Any])
      
      inline def setProcessorRequirementsUndefined: Self = StObject.set(x, "processorRequirements", js.undefined)
      
      inline def setProducerName(value: String): Self = StObject.set(x, "producerName", value.asInstanceOf[js.Any])
      
      inline def setProducerNameUndefined: Self = StObject.set(x, "producerName", js.undefined)
      
      inline def setProducerUrl(value: String): Self = StObject.set(x, "producerUrl", value.asInstanceOf[js.Any])
      
      inline def setProducerUrlUndefined: Self = StObject.set(x, "producerUrl", js.undefined)
      
      inline def setProviderName(value: String): Self = StObject.set(x, "providerName", value.asInstanceOf[js.Any])
      
      inline def setProviderNameUndefined: Self = StObject.set(x, "providerName", js.undefined)
      
      inline def setProviderUrl(value: String): Self = StObject.set(x, "providerUrl", value.asInstanceOf[js.Any])
      
      inline def setProviderUrlUndefined: Self = StObject.set(x, "providerUrl", js.undefined)
      
      inline def setPublisherName(value: String | js.Array[String]): Self = StObject.set(x, "publisherName", value.asInstanceOf[js.Any])
      
      inline def setPublisherNameUndefined: Self = StObject.set(x, "publisherName", js.undefined)
      
      inline def setPublisherNameVarargs(value: String*): Self = StObject.set(x, "publisherName", js.Array(value*))
      
      inline def setReviews(
        value: js.Array[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Review */ Any
            ]
      ): Self = StObject.set(x, "reviews", value.asInstanceOf[js.Any])
      
      inline def setReviewsUndefined: Self = StObject.set(x, "reviews", js.undefined)
      
      inline def setReviewsVarargs(
        value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Review */ Any)*
      ): Self = StObject.set(x, "reviews", js.Array(value*))
      
      inline def setStorageRequirements(value: String): Self = StObject.set(x, "storageRequirements", value.asInstanceOf[js.Any])
      
      inline def setStorageRequirementsUndefined: Self = StObject.set(x, "storageRequirements", js.undefined)
      
      inline def setTrailer(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Video */ Any
      ): Self = StObject.set(x, "trailer", value.asInstanceOf[js.Any])
      
      inline def setTrailerUndefined: Self = StObject.set(x, "trailer", js.undefined)
      
      inline def setTranslatorName(value: String | js.Array[String]): Self = StObject.set(x, "translatorName", value.asInstanceOf[js.Any])
      
      inline def setTranslatorNameUndefined: Self = StObject.set(x, "translatorName", js.undefined)
      
      inline def setTranslatorNameVarargs(value: String*): Self = StObject.set(x, "translatorName", js.Array(value*))
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    }
  }
}
