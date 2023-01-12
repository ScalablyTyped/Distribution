package typings.nginstackEngine.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScriptKey extends StObject {
  
  var scriptKey: js.UndefOr[String] = js.undefined
  
  var scriptURI: js.UndefOr[String] = js.undefined
}
object ScriptKey {
  
  inline def apply(): ScriptKey = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScriptKey]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ScriptKey] (val x: Self) extends AnyVal {
    
    inline def setScriptKey(value: String): Self = StObject.set(x, "scriptKey", value.asInstanceOf[js.Any])
    
    inline def setScriptKeyUndefined: Self = StObject.set(x, "scriptKey", js.undefined)
    
    inline def setScriptURI(value: String): Self = StObject.set(x, "scriptURI", value.asInstanceOf[js.Any])
    
    inline def setScriptURIUndefined: Self = StObject.set(x, "scriptURI", js.undefined)
  }
}
