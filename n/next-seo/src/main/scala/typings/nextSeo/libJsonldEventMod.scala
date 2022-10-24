package typings.nextSeo

import typings.nextSeo.libJsonldJsonldMod.JsonLdProps
import typings.react.mod.global.JSX.Element
import typings.std.Location
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libJsonldEventMod {
  
  @JSImport("next-seo/lib/jsonld/event", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(param0: EventJsonLdProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  trait EventJsonLdProps
    extends StObject
       with JsonLdProps {
    
    var aggregateOffer: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AggregateOffer */ Any
      ] = js.undefined
    
    var description: js.UndefOr[String] = js.undefined
    
    var endDate: String
    
    var eventAttendanceMode: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EventAttendanceMode */ Any
      ] = js.undefined
    
    var eventStatus: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EventStatus */ Any
      ] = js.undefined
    
    var images: js.UndefOr[js.Array[String]] = js.undefined
    
    var location: Location
    
    var name: String
    
    var offers: js.UndefOr[
        (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Offers */ Any) | (js.Array[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Offers */ Any
        ])
      ] = js.undefined
    
    var organizer: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Organizer */ Any
      ] = js.undefined
    
    var performers: js.UndefOr[
        (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Performer */ Any) | (js.Array[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Performer */ Any
        ])
      ] = js.undefined
    
    var startDate: String
    
    var url: js.UndefOr[String] = js.undefined
  }
  object EventJsonLdProps {
    
    inline def apply(endDate: String, location: Location, name: String, startDate: String): EventJsonLdProps = {
      val __obj = js.Dynamic.literal(endDate = endDate.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], startDate = startDate.asInstanceOf[js.Any])
      __obj.asInstanceOf[EventJsonLdProps]
    }
    
    extension [Self <: EventJsonLdProps](x: Self) {
      
      inline def setAggregateOffer(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AggregateOffer */ Any
      ): Self = StObject.set(x, "aggregateOffer", value.asInstanceOf[js.Any])
      
      inline def setAggregateOfferUndefined: Self = StObject.set(x, "aggregateOffer", js.undefined)
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      inline def setEndDate(value: String): Self = StObject.set(x, "endDate", value.asInstanceOf[js.Any])
      
      inline def setEventAttendanceMode(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EventAttendanceMode */ Any
      ): Self = StObject.set(x, "eventAttendanceMode", value.asInstanceOf[js.Any])
      
      inline def setEventAttendanceModeUndefined: Self = StObject.set(x, "eventAttendanceMode", js.undefined)
      
      inline def setEventStatus(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EventStatus */ Any
      ): Self = StObject.set(x, "eventStatus", value.asInstanceOf[js.Any])
      
      inline def setEventStatusUndefined: Self = StObject.set(x, "eventStatus", js.undefined)
      
      inline def setImages(value: js.Array[String]): Self = StObject.set(x, "images", value.asInstanceOf[js.Any])
      
      inline def setImagesUndefined: Self = StObject.set(x, "images", js.undefined)
      
      inline def setImagesVarargs(value: String*): Self = StObject.set(x, "images", js.Array(value*))
      
      inline def setLocation(value: Location): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
      
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
      
      inline def setOrganizer(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Organizer */ Any
      ): Self = StObject.set(x, "organizer", value.asInstanceOf[js.Any])
      
      inline def setOrganizerUndefined: Self = StObject.set(x, "organizer", js.undefined)
      
      inline def setPerformers(
        value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Performer */ Any) | (js.Array[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Performer */ Any
            ])
      ): Self = StObject.set(x, "performers", value.asInstanceOf[js.Any])
      
      inline def setPerformersUndefined: Self = StObject.set(x, "performers", js.undefined)
      
      inline def setPerformersVarargs(
        value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Performer */ Any)*
      ): Self = StObject.set(x, "performers", js.Array(value*))
      
      inline def setStartDate(value: String): Self = StObject.set(x, "startDate", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    }
  }
}
