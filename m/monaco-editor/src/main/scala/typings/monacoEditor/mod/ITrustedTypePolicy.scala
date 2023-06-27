package typings.monacoEditor.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ITrustedTypePolicy extends StObject {
  
  var createHTML: js.UndefOr[js.Function1[/* input */ String, Any]] = js.undefined
  
  var createScript: js.UndefOr[js.Function1[/* input */ String, Any]] = js.undefined
  
  var createScriptURL: js.UndefOr[js.Function1[/* input */ String, Any]] = js.undefined
  
  val name: String
}
object ITrustedTypePolicy {
  
  inline def apply(name: String): ITrustedTypePolicy = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITrustedTypePolicy]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ITrustedTypePolicy] (val x: Self) extends AnyVal {
    
    inline def setCreateHTML(value: /* input */ String => Any): Self = StObject.set(x, "createHTML", js.Any.fromFunction1(value))
    
    inline def setCreateHTMLUndefined: Self = StObject.set(x, "createHTML", js.undefined)
    
    inline def setCreateScript(value: /* input */ String => Any): Self = StObject.set(x, "createScript", js.Any.fromFunction1(value))
    
    inline def setCreateScriptURL(value: /* input */ String => Any): Self = StObject.set(x, "createScriptURL", js.Any.fromFunction1(value))
    
    inline def setCreateScriptURLUndefined: Self = StObject.set(x, "createScriptURL", js.undefined)
    
    inline def setCreateScriptUndefined: Self = StObject.set(x, "createScript", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
