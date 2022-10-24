package typings.nextSeo

import typings.nextSeo.libJsonldJsonldMod.JsonLdProps
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libJsonldSoftwareAppMod {
  
  @JSImport("next-seo/lib/jsonld/softwareApp", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(param0: SoftwareAppJsonLdProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  trait SoftwareAppJsonLdProps
    extends StObject
       with JsonLdProps {
    
    var aggregateRating: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AggregateRating */ Any
      ] = js.undefined
    
    var applicationCategory: js.UndefOr[String] = js.undefined
    
    var name: String
    
    var operatingSystem: js.UndefOr[String] = js.undefined
    
    var price: String
    
    var priceCurrency: String
    
    var review: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Review */ Any
      ] = js.undefined
  }
  object SoftwareAppJsonLdProps {
    
    inline def apply(name: String, price: String, priceCurrency: String): SoftwareAppJsonLdProps = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], price = price.asInstanceOf[js.Any], priceCurrency = priceCurrency.asInstanceOf[js.Any])
      __obj.asInstanceOf[SoftwareAppJsonLdProps]
    }
    
    extension [Self <: SoftwareAppJsonLdProps](x: Self) {
      
      inline def setAggregateRating(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AggregateRating */ Any
      ): Self = StObject.set(x, "aggregateRating", value.asInstanceOf[js.Any])
      
      inline def setAggregateRatingUndefined: Self = StObject.set(x, "aggregateRating", js.undefined)
      
      inline def setApplicationCategory(value: String): Self = StObject.set(x, "applicationCategory", value.asInstanceOf[js.Any])
      
      inline def setApplicationCategoryUndefined: Self = StObject.set(x, "applicationCategory", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setOperatingSystem(value: String): Self = StObject.set(x, "operatingSystem", value.asInstanceOf[js.Any])
      
      inline def setOperatingSystemUndefined: Self = StObject.set(x, "operatingSystem", js.undefined)
      
      inline def setPrice(value: String): Self = StObject.set(x, "price", value.asInstanceOf[js.Any])
      
      inline def setPriceCurrency(value: String): Self = StObject.set(x, "priceCurrency", value.asInstanceOf[js.Any])
      
      inline def setReview(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Review */ Any
      ): Self = StObject.set(x, "review", value.asInstanceOf[js.Any])
      
      inline def setReviewUndefined: Self = StObject.set(x, "review", js.undefined)
    }
  }
}
