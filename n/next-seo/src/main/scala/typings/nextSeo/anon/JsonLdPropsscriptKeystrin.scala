package typings.nextSeo.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined next-seo.next-seo/lib/jsonld/jsonld.JsonLdProps & {  scriptKey :string} */
trait JsonLdPropsscriptKeystrin
  extends StObject
     with /* key */ StringDictionary[Any] {
  
  var scriptId: js.UndefOr[String] = js.undefined
  
  var scriptKey: String
  
  var `type`: js.UndefOr[String] = js.undefined
}
object JsonLdPropsscriptKeystrin {
  
  inline def apply(scriptKey: String): JsonLdPropsscriptKeystrin = {
    val __obj = js.Dynamic.literal(scriptKey = scriptKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[JsonLdPropsscriptKeystrin]
  }
  
  extension [Self <: JsonLdPropsscriptKeystrin](x: Self) {
    
    inline def setScriptId(value: String): Self = StObject.set(x, "scriptId", value.asInstanceOf[js.Any])
    
    inline def setScriptIdUndefined: Self = StObject.set(x, "scriptId", js.undefined)
    
    inline def setScriptKey(value: String): Self = StObject.set(x, "scriptKey", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
