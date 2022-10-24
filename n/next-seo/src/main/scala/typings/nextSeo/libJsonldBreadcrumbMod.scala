package typings.nextSeo

import typings.nextSeo.libJsonldJsonldMod.JsonLdProps
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libJsonldBreadcrumbMod {
  
  @JSImport("next-seo/lib/jsonld/breadcrumb", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(param0: BreadCrumbJsonLdProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  trait BreadCrumbJsonLdProps
    extends StObject
       with JsonLdProps {
    
    var itemListElements: js.Array[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ItemListElements */ Any
      ]
  }
  object BreadCrumbJsonLdProps {
    
    inline def apply(
      itemListElements: js.Array[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ItemListElements */ Any
        ]
    ): BreadCrumbJsonLdProps = {
      val __obj = js.Dynamic.literal(itemListElements = itemListElements.asInstanceOf[js.Any])
      __obj.asInstanceOf[BreadCrumbJsonLdProps]
    }
    
    extension [Self <: BreadCrumbJsonLdProps](x: Self) {
      
      inline def setItemListElements(
        value: js.Array[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ItemListElements */ Any
            ]
      ): Self = StObject.set(x, "itemListElements", value.asInstanceOf[js.Any])
      
      inline def setItemListElementsVarargs(
        value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ItemListElements */ Any)*
      ): Self = StObject.set(x, "itemListElements", js.Array(value*))
    }
  }
}
