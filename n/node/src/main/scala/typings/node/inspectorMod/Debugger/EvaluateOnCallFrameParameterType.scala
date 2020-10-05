package typings.node.inspectorMod.Debugger

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EvaluateOnCallFrameParameterType extends js.Object {
  /**
    * Call frame identifier to evaluate on.
    */
  var callFrameId: CallFrameId = js.native
  /**
    * Expression to evaluate.
    */
  var expression: String = js.native
  /**
    * Whether preview should be generated for the result.
    * @experimental
    */
  var generatePreview: js.UndefOr[Boolean] = js.native
  /**
    * Specifies whether command line API should be available to the evaluated expression, defaults to false.
    */
  var includeCommandLineAPI: js.UndefOr[Boolean] = js.native
  /**
    * String object group name to put result into (allows rapid releasing resulting object handles using <code>releaseObjectGroup</code>).
    */
  var objectGroup: js.UndefOr[String] = js.native
  /**
    * Whether the result is expected to be a JSON object that should be sent by value.
    */
  var returnByValue: js.UndefOr[Boolean] = js.native
  /**
    * In silent mode exceptions thrown during evaluation are not reported and do not pause execution. Overrides <code>setPauseOnException</code> state.
    */
  var silent: js.UndefOr[Boolean] = js.native
  /**
    * Whether to throw an exception if side effect cannot be ruled out during evaluation.
    */
  var throwOnSideEffect: js.UndefOr[Boolean] = js.native
}

object EvaluateOnCallFrameParameterType {
  @scala.inline
  def apply(callFrameId: CallFrameId, expression: String): EvaluateOnCallFrameParameterType = {
    val __obj = js.Dynamic.literal(callFrameId = callFrameId.asInstanceOf[js.Any], expression = expression.asInstanceOf[js.Any])
    __obj.asInstanceOf[EvaluateOnCallFrameParameterType]
  }
  @scala.inline
  implicit class EvaluateOnCallFrameParameterTypeOps[Self <: EvaluateOnCallFrameParameterType] (val x: Self) extends AnyVal {
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
    def setCallFrameId(value: CallFrameId): Self = this.set("callFrameId", value.asInstanceOf[js.Any])
    @scala.inline
    def setExpression(value: String): Self = this.set("expression", value.asInstanceOf[js.Any])
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
    @scala.inline
    def setThrowOnSideEffect(value: Boolean): Self = this.set("throwOnSideEffect", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteThrowOnSideEffect: Self = this.set("throwOnSideEffect", js.undefined)
  }
  
}

