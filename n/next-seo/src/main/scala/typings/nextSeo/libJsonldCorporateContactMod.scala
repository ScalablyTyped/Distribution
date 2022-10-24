package typings.nextSeo

import typings.nextSeo.libJsonldJsonldMod.JsonLdProps
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libJsonldCorporateContactMod {
  
  @JSImport("next-seo/lib/jsonld/corporateContact", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(param0: CorporateContactJsonLdProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  trait CorporateContactJsonLdProps
    extends StObject
       with JsonLdProps {
    
    var contactPoint: js.Array[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ContactPoint */ Any
      ]
    
    var logo: js.UndefOr[String] = js.undefined
    
    var url: String
  }
  object CorporateContactJsonLdProps {
    
    inline def apply(
      contactPoint: js.Array[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ContactPoint */ Any
        ],
      url: String
    ): CorporateContactJsonLdProps = {
      val __obj = js.Dynamic.literal(contactPoint = contactPoint.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[CorporateContactJsonLdProps]
    }
    
    extension [Self <: CorporateContactJsonLdProps](x: Self) {
      
      inline def setContactPoint(
        value: js.Array[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ContactPoint */ Any
            ]
      ): Self = StObject.set(x, "contactPoint", value.asInstanceOf[js.Any])
      
      inline def setContactPointVarargs(
        value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ContactPoint */ Any)*
      ): Self = StObject.set(x, "contactPoint", js.Array(value*))
      
      inline def setLogo(value: String): Self = StObject.set(x, "logo", value.asInstanceOf[js.Any])
      
      inline def setLogoUndefined: Self = StObject.set(x, "logo", js.undefined)
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
}
