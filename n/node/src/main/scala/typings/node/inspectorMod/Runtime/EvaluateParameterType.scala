package typings.node.inspectorMod.Runtime

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EvaluateParameterType extends js.Object {
  /**
    * Whether execution should <code>await</code> for resulting value and return once awaited promise is resolved.
    */
  var awaitPromise: js.UndefOr[Boolean] = js.native
  /**
    * Specifies in which execution context to perform evaluation. If the parameter is omitted the evaluation will be performed in the context of the inspected page.
    */
  var contextId: js.UndefOr[ExecutionContextId] = js.native
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
    * Determines whether Command Line API should be available during the evaluation.
    */
  var includeCommandLineAPI: js.UndefOr[Boolean] = js.native
  /**
    * Symbolic group name that can be used to release multiple objects.
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
    * Whether execution should be treated as initiated by user in the UI.
    */
  var userGesture: js.UndefOr[Boolean] = js.native
}

object EvaluateParameterType {
  @scala.inline
  def apply(expression: String): EvaluateParameterType = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any])
    __obj.asInstanceOf[EvaluateParameterType]
  }
  @scala.inline
  implicit class EvaluateParameterTypeOps[Self <: EvaluateParameterType] (val x: Self) extends AnyVal {
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
    def setExpression(value: String): Self = this.set("expression", value.asInstanceOf[js.Any])
    @scala.inline
    def setAwaitPromise(value: Boolean): Self = this.set("awaitPromise", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAwaitPromise: Self = this.set("awaitPromise", js.undefined)
    @scala.inline
    def setContextId(value: ExecutionContextId): Self = this.set("contextId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContextId: Self = this.set("contextId", js.undefined)
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
    def setUserGesture(value: Boolean): Self = this.set("userGesture", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUserGesture: Self = this.set("userGesture", js.undefined)
  }
  
}

