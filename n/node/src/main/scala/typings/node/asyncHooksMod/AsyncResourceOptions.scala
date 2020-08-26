package typings.node.asyncHooksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AsyncResourceOptions extends js.Object {
  /**
    * Disables automatic `emitDestroy` when the object is garbage collected.
    * This usually does not need to be set (even if `emitDestroy` is called
    * manually), unless the resource's `asyncId` is retrieved and the
    * sensitive API's `emitDestroy` is called with it.
    * Default: `false`
    */
  var requireManualDestroy: js.UndefOr[Boolean] = js.native
  /**
    * The ID of the execution context that created this async event.
    * Default: `executionAsyncId()`
    */
  var triggerAsyncId: js.UndefOr[Double] = js.native
}

object AsyncResourceOptions {
  @scala.inline
  def apply(): AsyncResourceOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AsyncResourceOptions]
  }
  @scala.inline
  implicit class AsyncResourceOptionsOps[Self <: AsyncResourceOptions] (val x: Self) extends AnyVal {
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
    def setRequireManualDestroy(value: Boolean): Self = this.set("requireManualDestroy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequireManualDestroy: Self = this.set("requireManualDestroy", js.undefined)
    @scala.inline
    def setTriggerAsyncId(value: Double): Self = this.set("triggerAsyncId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTriggerAsyncId: Self = this.set("triggerAsyncId", js.undefined)
  }
  
}

