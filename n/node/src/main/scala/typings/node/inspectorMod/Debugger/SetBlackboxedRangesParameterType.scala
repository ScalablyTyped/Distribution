package typings.node.inspectorMod.Debugger

import typings.node.inspectorMod.Runtime.ScriptId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SetBlackboxedRangesParameterType extends js.Object {
  var positions: js.Array[ScriptPosition] = js.native
  /**
    * Id of the script.
    */
  var scriptId: ScriptId = js.native
}

object SetBlackboxedRangesParameterType {
  @scala.inline
  def apply(positions: js.Array[ScriptPosition], scriptId: ScriptId): SetBlackboxedRangesParameterType = {
    val __obj = js.Dynamic.literal(positions = positions.asInstanceOf[js.Any], scriptId = scriptId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetBlackboxedRangesParameterType]
  }
  @scala.inline
  implicit class SetBlackboxedRangesParameterTypeOps[Self <: SetBlackboxedRangesParameterType] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setPositionsVarargs(value: ScriptPosition*): Self = this.set("positions", js.Array(value :_*))
    @scala.inline
    def setPositions(value: js.Array[ScriptPosition]): Self = this.set("positions", value.asInstanceOf[js.Any])
    @scala.inline
    def setScriptId(value: ScriptId): Self = this.set("scriptId", value.asInstanceOf[js.Any])
  }
  
}

