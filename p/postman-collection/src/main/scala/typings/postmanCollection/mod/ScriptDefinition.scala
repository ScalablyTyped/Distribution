package typings.postmanCollection.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScriptDefinition
  extends StObject
     with PropertyDefinition {
  
  var exec: js.UndefOr[String | js.Array[String]] = js.undefined
  
  var src: js.UndefOr[String | Url] = js.undefined
  
  var `type`: js.UndefOr[String] = js.undefined
}
object ScriptDefinition {
  
  inline def apply(): ScriptDefinition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScriptDefinition]
  }
  
  extension [Self <: ScriptDefinition](x: Self) {
    
    inline def setExec(value: String | js.Array[String]): Self = StObject.set(x, "exec", value.asInstanceOf[js.Any])
    
    inline def setExecUndefined: Self = StObject.set(x, "exec", js.undefined)
    
    inline def setExecVarargs(value: String*): Self = StObject.set(x, "exec", js.Array(value :_*))
    
    inline def setSrc(value: String | Url): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
    
    inline def setSrcUndefined: Self = StObject.set(x, "src", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
