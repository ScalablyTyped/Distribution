package typings.postmanCollection.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EventDefinition extends PropertyDefinition {
  
  var listen: js.UndefOr[String] = js.native
  
  var script: String | js.Array[String] | ScriptDefinition | Script = js.native
}
object EventDefinition {
  
  @scala.inline
  def apply(script: String | js.Array[String] | ScriptDefinition | Script): EventDefinition = {
    val __obj = js.Dynamic.literal(script = script.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventDefinition]
  }
  
  @scala.inline
  implicit class EventDefinitionMutableBuilder[Self <: EventDefinition] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setListen(value: String): Self = StObject.set(x, "listen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListenUndefined: Self = StObject.set(x, "listen", js.undefined)
    
    @scala.inline
    def setScript(value: String | js.Array[String] | ScriptDefinition | Script): Self = StObject.set(x, "script", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScriptVarargs(value: String*): Self = StObject.set(x, "script", js.Array(value :_*))
  }
}
