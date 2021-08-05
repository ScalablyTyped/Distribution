package typings.nodeRedRuntime.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LangModule extends StObject {
  
  var lang: String
  
  var module: String
  
  var req: js.UndefOr[js.Object] = js.undefined
}
object LangModule {
  
  inline def apply(lang: String, module: String): LangModule = {
    val __obj = js.Dynamic.literal(lang = lang.asInstanceOf[js.Any], module = module.asInstanceOf[js.Any])
    __obj.asInstanceOf[LangModule]
  }
  
  extension [Self <: LangModule](x: Self) {
    
    inline def setLang(value: String): Self = StObject.set(x, "lang", value.asInstanceOf[js.Any])
    
    inline def setModule(value: String): Self = StObject.set(x, "module", value.asInstanceOf[js.Any])
    
    inline def setReq(value: js.Object): Self = StObject.set(x, "req", value.asInstanceOf[js.Any])
    
    inline def setReqUndefined: Self = StObject.set(x, "req", js.undefined)
  }
}
