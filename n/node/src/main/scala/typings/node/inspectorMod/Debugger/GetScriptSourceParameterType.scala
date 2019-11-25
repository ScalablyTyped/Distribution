package typings.node.inspectorMod.Debugger

import typings.node.inspectorMod.Runtime.ScriptId
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
    val __obj = js.Dynamic.literal(scriptId = scriptId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetScriptSourceParameterType]
  }
}

