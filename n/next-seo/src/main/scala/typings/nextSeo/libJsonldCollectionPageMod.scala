package typings.nextSeo

import typings.nextSeo.libJsonldJsonldMod.JsonLdProps
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libJsonldCollectionPageMod {
  
  @JSImport("next-seo/lib/jsonld/collectionPage", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(param0: CollectionPageJsonLdProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  trait CollectionPageJsonLdProps
    extends StObject
       with JsonLdProps {
    
    var hasPart: js.Array[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CreativeWork */ Any
      ]
    
    var name: String
  }
  object CollectionPageJsonLdProps {
    
    inline def apply(
      hasPart: js.Array[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CreativeWork */ Any
        ],
      name: String
    ): CollectionPageJsonLdProps = {
      val __obj = js.Dynamic.literal(hasPart = hasPart.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[CollectionPageJsonLdProps]
    }
    
    extension [Self <: CollectionPageJsonLdProps](x: Self) {
      
      inline def setHasPart(
        value: js.Array[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CreativeWork */ Any
            ]
      ): Self = StObject.set(x, "hasPart", value.asInstanceOf[js.Any])
      
      inline def setHasPartVarargs(
        value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CreativeWork */ Any)*
      ): Self = StObject.set(x, "hasPart", js.Array(value*))
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
}
