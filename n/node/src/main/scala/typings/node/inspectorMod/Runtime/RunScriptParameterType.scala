package typings.node.inspectorMod.Runtime

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RunScriptParameterType extends js.Object {
  /**
    * Whether execution should <code>await</code> for resulting value and return once awaited promise is resolved.
    */
  var awaitPromise: js.UndefOr[Boolean] = js.native
  /**
    * Specifies in which execution context to perform script run. If the parameter is omitted the evaluation will be performed in the context of the inspected page.
    */
  var executionContextId: js.UndefOr[ExecutionContextId] = js.native
  /**
    * Whether preview should be generated for the result.
    */
  var generatePreview: js.UndefOr[Boolean] = js.native
  /**
    * Determines whether Command Line API should be available during the evaluation.
    */
  var includeCommandLineAPI: js.UndefOr[Boolean] = js.native
  /**
    * Symbolic group name that can be used to release multiple objects.
    */
  var objectGroup: js.UndefOr[String] = js.native
  /**
    * Whether the result is expected to be a JSON object which should be sent by value.
    */
  var returnByValue: js.UndefOr[Boolean] = js.native
  /**
    * Id of the script to run.
    */
  var scriptId: ScriptId = js.native
  /**
    * In silent mode exceptions thrown during evaluation are not reported and do not pause execution. Overrides <code>setPauseOnException</code> state.
    */
  var silent: js.UndefOr[Boolean] = js.native
}

object RunScriptParameterType {
  @scala.inline
  def apply(scriptId: ScriptId): RunScriptParameterType = {
    val __obj = js.Dynamic.literal(scriptId = scriptId.asInstanceOf[js.Any])
    __obj.asInstanceOf[RunScriptParameterType]
  }
  @scala.inline
  implicit class RunScriptParameterTypeOps[Self <: RunScriptParameterType] (val x: Self) extends AnyVal {
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
    def setAwaitPromise(value: Boolean): Self = this.set("awaitPromise", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAwaitPromise: Self = this.set("awaitPromise", js.undefined)
    @scala.inline
    def setExecutionContextId(value: ExecutionContextId): Self = this.set("executionContextId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExecutionContextId: Self = this.set("executionContextId", js.undefined)
    @scala.inline
    def setGeneratePreview(value: Boolean): Self = this.set("generatePreview", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGeneratePreview: Self = this.set("generatePreview", js.undefined)
    @scala.inline
    def setIncludeCommandLineAPI(value: Boolean): Self = this.set("includeCommandLineAPI", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIncludeCommandLineAPI: Self = this.set("includeCommandLineAPI", js.undefined)
    @scala.inline
    def setObjectGroup(value: String): Self = this.set("objectGroup", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteObjectGroup: Self = this.set("objectGroup", js.undefined)
    @scala.inline
    def setReturnByValue(value: Boolean): Self = this.set("returnByValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReturnByValue: Self = this.set("returnByValue", js.undefined)
    @scala.inline
    def setSilent(value: Boolean): Self = this.set("silent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSilent: Self = this.set("silent", js.undefined)
  }
  
}

