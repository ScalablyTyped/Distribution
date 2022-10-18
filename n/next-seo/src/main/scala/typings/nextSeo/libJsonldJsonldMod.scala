package typings.nextSeo

import org.scalablytyped.runtime.StringDictionary
import typings.nextSeo.anon.JsonLdPropsscriptKeystrin
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libJsonldJsonldMod {
  
  @JSImport("next-seo/lib/jsonld/jsonld", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def JsonLd(hasTypeKeyOverrideScriptKeyScriptIdRest: JsonLdPropsscriptKeystrin): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("JsonLd")(hasTypeKeyOverrideScriptKeyScriptIdRest.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  trait JsonLdProps
    extends StObject
       with /* key */ StringDictionary[Any] {
    
    var scriptId: js.UndefOr[String] = js.undefined
    
    var `type`: js.UndefOr[String] = js.undefined
  }
  object JsonLdProps {
    
    inline def apply(): JsonLdProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[JsonLdProps]
    }
    
    extension [Self <: JsonLdProps](x: Self) {
      
      inline def setScriptId(value: String): Self = StObject.set(x, "scriptId", value.asInstanceOf[js.Any])
      
      inline def setScriptIdUndefined: Self = StObject.set(x, "scriptId", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
}
