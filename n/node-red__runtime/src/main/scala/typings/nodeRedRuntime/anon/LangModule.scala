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
  
  @scala.inline
  def apply(lang: String, module: String): LangModule = {
    val __obj = js.Dynamic.literal(lang = lang.asInstanceOf[js.Any], module = module.asInstanceOf[js.Any])
    __obj.asInstanceOf[LangModule]
  }
  
  @scala.inline
  implicit class LangModuleMutableBuilder[Self <: LangModule] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLang(value: String): Self = StObject.set(x, "lang", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModule(value: String): Self = StObject.set(x, "module", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReq(value: js.Object): Self = StObject.set(x, "req", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReqUndefined: Self = StObject.set(x, "req", js.undefined)
  }
}
