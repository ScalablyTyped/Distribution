package typings.nextSeo

import typings.nextSeo.libJsonldJsonldMod.JsonLdProps
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libJsonldQaPageMod {
  
  @JSImport("next-seo/lib/jsonld/qaPage", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(param0: QAPageJsonLdProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  trait QAPageJsonLdProps
    extends StObject
       with JsonLdProps {
    
    var mainEntity: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Question */ Any
  }
  object QAPageJsonLdProps {
    
    inline def apply(
      mainEntity: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Question */ Any
    ): QAPageJsonLdProps = {
      val __obj = js.Dynamic.literal(mainEntity = mainEntity.asInstanceOf[js.Any])
      __obj.asInstanceOf[QAPageJsonLdProps]
    }
    
    extension [Self <: QAPageJsonLdProps](x: Self) {
      
      inline def setMainEntity(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Question */ Any
      ): Self = StObject.set(x, "mainEntity", value.asInstanceOf[js.Any])
    }
  }
}
