package typings.nextSeo

import typings.nextSeo.libJsonldJsonldMod.JsonLdProps
import typings.nextSeo.nextSeoStrings.Organization
import typings.nextSeo.nextSeoStrings.Person
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libJsonldSocialProfileMod {
  
  @JSImport("next-seo/lib/jsonld/socialProfile", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(param0: SocialProfileJsonLdProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  trait SocialProfileJsonLdProps
    extends StObject
       with JsonLdProps {
    
    var name: String
    
    var sameAs: js.Array[String]
    
    @JSName("type")
    var type_SocialProfileJsonLdProps: Person | Organization
    
    var url: String
  }
  object SocialProfileJsonLdProps {
    
    inline def apply(name: String, sameAs: js.Array[String], `type`: Person | Organization, url: String): SocialProfileJsonLdProps = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], sameAs = sameAs.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[SocialProfileJsonLdProps]
    }
    
    extension [Self <: SocialProfileJsonLdProps](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setSameAs(value: js.Array[String]): Self = StObject.set(x, "sameAs", value.asInstanceOf[js.Any])
      
      inline def setSameAsVarargs(value: String*): Self = StObject.set(x, "sameAs", js.Array(value*))
      
      inline def setType(value: Person | Organization): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
}
