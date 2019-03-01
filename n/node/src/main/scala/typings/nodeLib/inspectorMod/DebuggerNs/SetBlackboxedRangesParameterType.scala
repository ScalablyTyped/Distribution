package typings
package nodeLib.inspectorMod.DebuggerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SetBlackboxedRangesParameterType extends js.Object {
  var positions: js.Array[ScriptPosition]
  /**
    * Id of the script.
    */
  var scriptId: nodeLib.inspectorMod.RuntimeNs.ScriptId
}

object SetBlackboxedRangesParameterType {
  @scala.inline
  def apply(positions: js.Array[ScriptPosition], scriptId: nodeLib.inspectorMod.RuntimeNs.ScriptId): SetBlackboxedRangesParameterType = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("positions")(positions)
    __obj.updateDynamic("scriptId")(scriptId)
    __obj.asInstanceOf[SetBlackboxedRangesParameterType]
  }
}

