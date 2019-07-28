package typings.node.inspectorMod.DebuggerNs

import typings.node.inspectorMod.RuntimeNs.ScriptId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetScriptSourceParameterType extends js.Object {
  /**
    * Id of the script to get source for.
    */
  var scriptId: ScriptId
}

object GetScriptSourceParameterType {
  @scala.inline
  def apply(scriptId: ScriptId): GetScriptSourceParameterType = {
    val __obj = js.Dynamic.literal(scriptId = scriptId)
  
    __obj.asInstanceOf[GetScriptSourceParameterType]
  }
}

