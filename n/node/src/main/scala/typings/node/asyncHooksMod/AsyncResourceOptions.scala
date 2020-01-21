package typings.node.asyncHooksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AsyncResourceOptions extends js.Object {
  /**
    * Disables automatic `emitDestroy` when the object is garbage collected.
    * This usually does not need to be set (even if `emitDestroy` is called
    * manually), unless the resource's `asyncId` is retrieved and the
    * sensitive API's `emitDestroy` is called with it.
    * Default: `false`
    */
  var requireManualDestroy: js.UndefOr[Boolean] = js.undefined
  /**
    * The ID of the execution context that created this async event.
    * Default: `executionAsyncId()`
    */
  var triggerAsyncId: js.UndefOr[Double] = js.undefined
}

object AsyncResourceOptions {
  @scala.inline
  def apply(requireManualDestroy: js.UndefOr[Boolean] = js.undefined, triggerAsyncId: Int | Double = null): AsyncResourceOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(requireManualDestroy)) __obj.updateDynamic("requireManualDestroy")(requireManualDestroy.asInstanceOf[js.Any])
    if (triggerAsyncId != null) __obj.updateDynamic("triggerAsyncId")(triggerAsyncId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AsyncResourceOptions]
  }
}

