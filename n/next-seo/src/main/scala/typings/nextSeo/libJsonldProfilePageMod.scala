package typings.nextSeo

import typings.nextSeo.libJsonldJsonldMod.JsonLdProps
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libJsonldProfilePageMod {
  
  @JSImport("next-seo/lib/jsonld/profilePage", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(hasTypeKeyOverrideBreadcrumbRest: ProfilePageJsonLdProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(hasTypeKeyOverrideBreadcrumbRest.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  trait ProfilePageJsonLdProps
    extends StObject
       with JsonLdProps {
    
    var breadcrumb: String | (js.Array[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ItemListElements */ Any
      ])
    
    var lastReviewed: js.UndefOr[String] = js.undefined
  }
  object ProfilePageJsonLdProps {
    
    inline def apply(
      breadcrumb: String | (js.Array[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ItemListElements */ Any
        ])
    ): ProfilePageJsonLdProps = {
      val __obj = js.Dynamic.literal(breadcrumb = breadcrumb.asInstanceOf[js.Any])
      __obj.asInstanceOf[ProfilePageJsonLdProps]
    }
    
    extension [Self <: ProfilePageJsonLdProps](x: Self) {
      
      inline def setBreadcrumb(
        value: String | (js.Array[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ItemListElements */ Any
            ])
      ): Self = StObject.set(x, "breadcrumb", value.asInstanceOf[js.Any])
      
      inline def setBreadcrumbVarargs(
        value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ItemListElements */ Any)*
      ): Self = StObject.set(x, "breadcrumb", js.Array(value*))
      
      inline def setLastReviewed(value: String): Self = StObject.set(x, "lastReviewed", value.asInstanceOf[js.Any])
      
      inline def setLastReviewedUndefined: Self = StObject.set(x, "lastReviewed", js.undefined)
    }
  }
}
