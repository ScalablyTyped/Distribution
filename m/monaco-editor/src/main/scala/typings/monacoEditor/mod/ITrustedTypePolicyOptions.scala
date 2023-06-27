package typings.monacoEditor.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ITrustedTypePolicyOptions extends StObject {
  
  var createHTML: js.UndefOr[js.Function2[/* input */ String, /* repeated */ Any, String]] = js.undefined
  
  var createScript: js.UndefOr[js.Function2[/* input */ String, /* repeated */ Any, String]] = js.undefined
  
  var createScriptURL: js.UndefOr[js.Function2[/* input */ String, /* repeated */ Any, String]] = js.undefined
}
object ITrustedTypePolicyOptions {
  
  inline def apply(): ITrustedTypePolicyOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ITrustedTypePolicyOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ITrustedTypePolicyOptions] (val x: Self) extends AnyVal {
    
    inline def setCreateHTML(value: (/* input */ String, /* repeated */ Any) => String): Self = StObject.set(x, "createHTML", js.Any.fromFunction2(value))
    
    inline def setCreateHTMLUndefined: Self = StObject.set(x, "createHTML", js.undefined)
    
    inline def setCreateScript(value: (/* input */ String, /* repeated */ Any) => String): Self = StObject.set(x, "createScript", js.Any.fromFunction2(value))
    
    inline def setCreateScriptURL(value: (/* input */ String, /* repeated */ Any) => String): Self = StObject.set(x, "createScriptURL", js.Any.fromFunction2(value))
    
    inline def setCreateScriptURLUndefined: Self = StObject.set(x, "createScriptURL", js.undefined)
    
    inline def setCreateScriptUndefined: Self = StObject.set(x, "createScript", js.undefined)
  }
}
