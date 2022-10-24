package typings.nextSeo

import typings.nextSeo.libJsonldJsonldMod.JsonLdProps
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libJsonldBrandMod {
  
  @JSImport("next-seo/lib/jsonld/brand", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(param0: BrandJsonLdProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  trait BrandJsonLdProps
    extends StObject
       with JsonLdProps {
    
    var aggregateRating: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AggregateRating */ Any
      ] = js.undefined
    
    var id: String
    
    var logo: js.UndefOr[String] = js.undefined
    
    var slogan: js.UndefOr[String] = js.undefined
  }
  object BrandJsonLdProps {
    
    inline def apply(id: String): BrandJsonLdProps = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[BrandJsonLdProps]
    }
    
    extension [Self <: BrandJsonLdProps](x: Self) {
      
      inline def setAggregateRating(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AggregateRating */ Any
      ): Self = StObject.set(x, "aggregateRating", value.asInstanceOf[js.Any])
      
      inline def setAggregateRatingUndefined: Self = StObject.set(x, "aggregateRating", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setLogo(value: String): Self = StObject.set(x, "logo", value.asInstanceOf[js.Any])
      
      inline def setLogoUndefined: Self = StObject.set(x, "logo", js.undefined)
      
      inline def setSlogan(value: String): Self = StObject.set(x, "slogan", value.asInstanceOf[js.Any])
      
      inline def setSloganUndefined: Self = StObject.set(x, "slogan", js.undefined)
    }
  }
}
