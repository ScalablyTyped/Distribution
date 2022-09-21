package typings.postmanCollection.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EventDefinition
  extends StObject
     with PropertyDefinition {
  
  var listen: js.UndefOr[String] = js.undefined
  
  var script: String | js.Array[String] | ScriptDefinition | Script
}
object EventDefinition {
  
  inline def apply(script: String | js.Array[String] | ScriptDefinition | Script): EventDefinition = {
    val __obj = js.Dynamic.literal(script = script.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventDefinition]
  }
  
  extension [Self <: EventDefinition](x: Self) {
    
    inline def setListen(value: String): Self = StObject.set(x, "listen", value.asInstanceOf[js.Any])
    
    inline def setListenUndefined: Self = StObject.set(x, "listen", js.undefined)
    
    inline def setScript(value: String | js.Array[String] | ScriptDefinition | Script): Self = StObject.set(x, "script", value.asInstanceOf[js.Any])
    
    inline def setScriptVarargs(value: String*): Self = StObject.set(x, "script", js.Array(value*))
  }
}
