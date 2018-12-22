package typings
package officeDashJsDashPreviewLib.OfficeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Provides options to determine which event handler or handlers are removed.
     */

trait RemoveHandlerOptions extends js.Object {
  /**
           * A user-defined item of any type that is returned, unchanged, in the asyncContext property of the AsyncResult object that is passed to a callback.
           */
  var asyncContext: js.UndefOr[js.Any] = js.undefined
  /**
           * The handler to be removed. If not specified all handlers for the specified event type are removed.
           */
  var handler: js.UndefOr[java.lang.String] = js.undefined
}

