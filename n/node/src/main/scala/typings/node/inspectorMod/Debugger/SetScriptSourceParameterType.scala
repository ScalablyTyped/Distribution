package typings.node.inspectorMod.Debugger

import typings.node.inspectorMod.Runtime.ScriptId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SetScriptSourceParameterType extends StObject {
  
  /**
    *  If true the change will not actually be applied. Dry run may be used to get result description without actually modifying the code.
    */
  var dryRun: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Id of the script to edit.
    */
  var scriptId: ScriptId
  
  /**
    * New content of the script.
    */
  var scriptSource: String
}
object SetScriptSourceParameterType {
  
  @scala.inline
  def apply(scriptId: ScriptId, scriptSource: String): SetScriptSourceParameterType = {
    val __obj = js.Dynamic.literal(scriptId = scriptId.asInstanceOf[js.Any], scriptSource = scriptSource.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetScriptSourceParameterType]
  }
  
  @scala.inline
  implicit class SetScriptSourceParameterTypeMutableBuilder[Self <: SetScriptSourceParameterType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDryRun(value: Boolean): Self = StObject.set(x, "dryRun", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDryRunUndefined: Self = StObject.set(x, "dryRun", js.undefined)
    
    @scala.inline
    def setScriptId(value: ScriptId): Self = StObject.set(x, "scriptId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScriptSource(value: String): Self = StObject.set(x, "scriptSource", value.asInstanceOf[js.Any])
  }
}
