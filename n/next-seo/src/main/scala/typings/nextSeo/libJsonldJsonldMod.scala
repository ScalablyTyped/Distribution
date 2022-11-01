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
  
  inline def JsonLd(param0: JsonLdPropsscriptKeystrin): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("JsonLd")(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  trait JsonLdProps
    extends StObject
       with /* key */ StringDictionary[Any] {
    
    var dataArray: js.UndefOr[js.Array[Any]] = js.undefined
    
    var scriptId: js.UndefOr[String] = js.undefined
    
    var `type`: js.UndefOr[String] = js.undefined
    
    var useAppDir: js.UndefOr[Boolean] = js.undefined
  }
  object JsonLdProps {
    
    inline def apply(): JsonLdProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[JsonLdProps]
    }
    
    extension [Self <: JsonLdProps](x: Self) {
      
      inline def setDataArray(value: js.Array[Any]): Self = StObject.set(x, "dataArray", value.asInstanceOf[js.Any])
      
      inline def setDataArrayUndefined: Self = StObject.set(x, "dataArray", js.undefined)
      
      inline def setDataArrayVarargs(value: Any*): Self = StObject.set(x, "dataArray", js.Array(value*))
      
      inline def setScriptId(value: String): Self = StObject.set(x, "scriptId", value.asInstanceOf[js.Any])
      
      inline def setScriptIdUndefined: Self = StObject.set(x, "scriptId", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setUseAppDir(value: Boolean): Self = StObject.set(x, "useAppDir", value.asInstanceOf[js.Any])
      
      inline def setUseAppDirUndefined: Self = StObject.set(x, "useAppDir", js.undefined)
    }
  }
}
