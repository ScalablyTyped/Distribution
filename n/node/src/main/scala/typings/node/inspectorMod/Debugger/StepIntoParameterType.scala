package typings.node.inspectorMod.Debugger

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StepIntoParameterType extends js.Object {
  /**
    * Debugger will issue additional Debugger.paused notification if any async task is scheduled before next pause.
    * @experimental
    */
  var breakOnAsyncCall: js.UndefOr[Boolean] = js.undefined
}

object StepIntoParameterType {
  @scala.inline
  def apply(breakOnAsyncCall: js.UndefOr[Boolean] = js.undefined): StepIntoParameterType = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(breakOnAsyncCall)) __obj.updateDynamic("breakOnAsyncCall")(breakOnAsyncCall.asInstanceOf[js.Any])
    __obj.asInstanceOf[StepIntoParameterType]
  }
}

