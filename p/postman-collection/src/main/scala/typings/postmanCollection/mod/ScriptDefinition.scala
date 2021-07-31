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
  
  @scala.inline
  def apply(): ScriptDefinition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScriptDefinition]
  }
  
  @scala.inline
  implicit class ScriptDefinitionMutableBuilder[Self <: ScriptDefinition] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExec(value: String | js.Array[String]): Self = StObject.set(x, "exec", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExecUndefined: Self = StObject.set(x, "exec", js.undefined)
    
    @scala.inline
    def setExecVarargs(value: String*): Self = StObject.set(x, "exec", js.Array(value :_*))
    
    @scala.inline
    def setSrc(value: String | Url): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSrcUndefined: Self = StObject.set(x, "src", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
