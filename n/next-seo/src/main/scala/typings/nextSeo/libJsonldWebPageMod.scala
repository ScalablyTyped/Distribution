package typings.nextSeo

import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libJsonldWebPageMod {
  
  @JSImport("next-seo/lib/jsonld/webPage", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(param0: WebPageJsonLdProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  trait WebPageJsonLdProps extends StObject {
    
    var description: js.UndefOr[String] = js.undefined
    
    var id: String
    
    var keyOverride: js.UndefOr[String] = js.undefined
    
    var lastReviewed: js.UndefOr[String] = js.undefined
    
    var reviewedBy: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ReviewedBy */ Any
      ] = js.undefined
  }
  object WebPageJsonLdProps {
    
    inline def apply(id: String): WebPageJsonLdProps = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[WebPageJsonLdProps]
    }
    
    extension [Self <: WebPageJsonLdProps](x: Self) {
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setKeyOverride(value: String): Self = StObject.set(x, "keyOverride", value.asInstanceOf[js.Any])
      
      inline def setKeyOverrideUndefined: Self = StObject.set(x, "keyOverride", js.undefined)
      
      inline def setLastReviewed(value: String): Self = StObject.set(x, "lastReviewed", value.asInstanceOf[js.Any])
      
      inline def setLastReviewedUndefined: Self = StObject.set(x, "lastReviewed", js.undefined)
      
      inline def setReviewedBy(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ReviewedBy */ Any
      ): Self = StObject.set(x, "reviewedBy", value.asInstanceOf[js.Any])
      
      inline def setReviewedByUndefined: Self = StObject.set(x, "reviewedBy", js.undefined)
    }
  }
}
