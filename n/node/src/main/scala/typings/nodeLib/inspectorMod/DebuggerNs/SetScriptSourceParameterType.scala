package typings
package nodeLib.inspectorMod.DebuggerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SetScriptSourceParameterType extends js.Object {
  /**
    * If true the change will not actually be applied. Dry run may be used to get result
    * description without actually modifying the code.
    */
  var dryRun: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Id of the script to edit.
    */
  var scriptId: nodeLib.inspectorMod.RuntimeNs.ScriptId
  /**
    * New content of the script.
    */
  var scriptSource: java.lang.String
}

object SetScriptSourceParameterType {
  @scala.inline
  def apply(
    scriptId: nodeLib.inspectorMod.RuntimeNs.ScriptId,
    scriptSource: java.lang.String,
    dryRun: js.UndefOr[scala.Boolean] = js.undefined
  ): SetScriptSourceParameterType = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("scriptId")(scriptId)
    __obj.updateDynamic("scriptSource")(scriptSource)
    if (!js.isUndefined(dryRun)) __obj.updateDynamic("dryRun")(dryRun)
    __obj.asInstanceOf[SetScriptSourceParameterType]
  }
}

