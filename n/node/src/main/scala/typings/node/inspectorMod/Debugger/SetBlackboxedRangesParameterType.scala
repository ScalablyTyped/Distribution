package typings.node.inspectorMod.Debugger

import typings.node.inspectorMod.Runtime.ScriptId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SetBlackboxedRangesParameterType extends js.Object {
  var positions: js.Array[ScriptPosition]
  /**
    * Id of the script.
    */
  var scriptId: ScriptId
}

object SetBlackboxedRangesParameterType {
  @scala.inline
  def apply(positions: js.Array[ScriptPosition], scriptId: ScriptId): SetBlackboxedRangesParameterType = {
    val __obj = js.Dynamic.literal(positions = positions, scriptId = scriptId)
  
    __obj.asInstanceOf[SetBlackboxedRangesParameterType]
  }
}

