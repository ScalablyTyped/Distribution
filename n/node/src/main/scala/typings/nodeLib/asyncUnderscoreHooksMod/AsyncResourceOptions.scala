package typings
package nodeLib.asyncUnderscoreHooksMod

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
  var requireManualDestroy: js.UndefOr[scala.Boolean] = js.undefined
  /**
         * The ID of the execution context that created this async event.
         * Default: `executionAsyncId()`
         */
  var triggerAsyncId: js.UndefOr[scala.Double] = js.undefined
}

