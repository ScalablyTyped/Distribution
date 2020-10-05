package typings.node.inspectorMod.Debugger

import typings.node.inspectorMod.Runtime.ScriptId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SetScriptSourceParameterType extends js.Object {
  /**
    *  If true the change will not actually be applied. Dry run may be used to get result description without actually modifying the code.
    */
  var dryRun: js.UndefOr[Boolean] = js.native
  /**
    * Id of the script to edit.
    */
  var scriptId: ScriptId = js.native
  /**
    * New content of the script.
    */
  var scriptSource: String = js.native
}

object SetScriptSourceParameterType {
  @scala.inline
  def apply(scriptId: ScriptId, scriptSource: String): SetScriptSourceParameterType = {
    val __obj = js.Dynamic.literal(scriptId = scriptId.asInstanceOf[js.Any], scriptSource = scriptSource.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetScriptSourceParameterType]
  }
  @scala.inline
  implicit class SetScriptSourceParameterTypeOps[Self <: SetScriptSourceParameterType] (val x: Self) extends AnyVal {
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
    def setScriptId(value: ScriptId): Self = this.set("scriptId", value.asInstanceOf[js.Any])
    @scala.inline
    def setScriptSource(value: String): Self = this.set("scriptSource", value.asInstanceOf[js.Any])
    @scala.inline
    def setDryRun(value: Boolean): Self = this.set("dryRun", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDryRun: Self = this.set("dryRun", js.undefined)
  }
  
}

