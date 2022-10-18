package typings.nextSeo

import typings.nextSeo.libJsonldJsonldMod.JsonLdProps
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libJsonldSiteLinksSearchBoxMod {
  
  @JSImport("next-seo/lib/jsonld/siteLinksSearchBox", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(hasTypeKeyOverridePotentialActionsRest: SiteLinksSearchBoxJsonLdProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(hasTypeKeyOverridePotentialActionsRest.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  trait PotentialAction extends StObject {
    
    var queryInput: String
    
    var target: String
  }
  object PotentialAction {
    
    inline def apply(queryInput: String, target: String): PotentialAction = {
      val __obj = js.Dynamic.literal(queryInput = queryInput.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
      __obj.asInstanceOf[PotentialAction]
    }
    
    extension [Self <: PotentialAction](x: Self) {
      
      inline def setQueryInput(value: String): Self = StObject.set(x, "queryInput", value.asInstanceOf[js.Any])
      
      inline def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    }
  }
  
  trait SiteLinksSearchBoxJsonLdProps
    extends StObject
       with JsonLdProps {
    
    var potentialActions: js.Array[PotentialAction]
    
    var url: String
  }
  object SiteLinksSearchBoxJsonLdProps {
    
    inline def apply(potentialActions: js.Array[PotentialAction], url: String): SiteLinksSearchBoxJsonLdProps = {
      val __obj = js.Dynamic.literal(potentialActions = potentialActions.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[SiteLinksSearchBoxJsonLdProps]
    }
    
    extension [Self <: SiteLinksSearchBoxJsonLdProps](x: Self) {
      
      inline def setPotentialActions(value: js.Array[PotentialAction]): Self = StObject.set(x, "potentialActions", value.asInstanceOf[js.Any])
      
      inline def setPotentialActionsVarargs(value: PotentialAction*): Self = StObject.set(x, "potentialActions", js.Array(value*))
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
}
