package typings.nextSeo

import typings.nextSeo.libJsonldJsonldMod.JsonLdProps
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libJsonldVideoMod {
  
  @JSImport("next-seo/lib/jsonld/video", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(hasTypeKeyOverrideRest: VideoJsonLdProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(hasTypeKeyOverrideRest.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Video * / any */ trait VideoJsonLdProps
    extends StObject
       with JsonLdProps
  object VideoJsonLdProps {
    
    inline def apply(): VideoJsonLdProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[VideoJsonLdProps]
    }
  }
}
