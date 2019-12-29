package typings.node.inspectorMod.Debugger

import typings.node.inspectorMod.Runtime.ScriptId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SetScriptSourceParameterType extends js.Object {
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
  def apply(scriptId: ScriptId, scriptSource: String, dryRun: js.UndefOr[Boolean] = js.undefined): SetScriptSourceParameterType = {
    val __obj = js.Dynamic.literal(scriptId = scriptId.asInstanceOf[js.Any], scriptSource = scriptSource.asInstanceOf[js.Any])
    if (!js.isUndefined(dryRun)) __obj.updateDynamic("dryRun")(dryRun.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetScriptSourceParameterType]
  }
}

