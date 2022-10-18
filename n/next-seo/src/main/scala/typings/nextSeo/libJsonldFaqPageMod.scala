package typings.nextSeo

import typings.nextSeo.libJsonldJsonldMod.JsonLdProps
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libJsonldFaqPageMod {
  
  @JSImport("next-seo/lib/jsonld/faqPage", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(hasTypeKeyOverrideMainEntityRest: FAQPageJsonLdProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(hasTypeKeyOverrideMainEntityRest.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  trait FAQPageJsonLdProps
    extends StObject
       with JsonLdProps {
    
    var mainEntity: js.Array[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Question */ Any
      ]
  }
  object FAQPageJsonLdProps {
    
    inline def apply(
      mainEntity: js.Array[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Question */ Any
        ]
    ): FAQPageJsonLdProps = {
      val __obj = js.Dynamic.literal(mainEntity = mainEntity.asInstanceOf[js.Any])
      __obj.asInstanceOf[FAQPageJsonLdProps]
    }
    
    extension [Self <: FAQPageJsonLdProps](x: Self) {
      
      inline def setMainEntity(
        value: js.Array[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Question */ Any
            ]
      ): Self = StObject.set(x, "mainEntity", value.asInstanceOf[js.Any])
      
      inline def setMainEntityVarargs(
        value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Question */ Any)*
      ): Self = StObject.set(x, "mainEntity", js.Array(value*))
    }
  }
}
