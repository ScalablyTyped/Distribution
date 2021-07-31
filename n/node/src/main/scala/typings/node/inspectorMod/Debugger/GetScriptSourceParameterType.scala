package typings.node.inspectorMod.Debugger

import typings.node.inspectorMod.Runtime.ScriptId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetScriptSourceParameterType extends StObject {
  
  /**
    * Id of the script to get source for.
    */
  var scriptId: ScriptId
}
object GetScriptSourceParameterType {
  
  @scala.inline
  def apply(scriptId: ScriptId): GetScriptSourceParameterType = {
    val __obj = js.Dynamic.literal(scriptId = scriptId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetScriptSourceParameterType]
  }
  
  @scala.inline
  implicit class GetScriptSourceParameterTypeMutableBuilder[Self <: GetScriptSourceParameterType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setScriptId(value: ScriptId): Self = StObject.set(x, "scriptId", value.asInstanceOf[js.Any])
  }
}
