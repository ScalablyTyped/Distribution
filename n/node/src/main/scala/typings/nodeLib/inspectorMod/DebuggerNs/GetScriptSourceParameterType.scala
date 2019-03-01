package typings
package nodeLib.inspectorMod.DebuggerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetScriptSourceParameterType extends js.Object {
  /**
    * Id of the script to get source for.
    */
  var scriptId: nodeLib.inspectorMod.RuntimeNs.ScriptId
}

object GetScriptSourceParameterType {
  @scala.inline
  def apply(scriptId: nodeLib.inspectorMod.RuntimeNs.ScriptId): GetScriptSourceParameterType = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("scriptId")(scriptId)
    __obj.asInstanceOf[GetScriptSourceParameterType]
  }
}

