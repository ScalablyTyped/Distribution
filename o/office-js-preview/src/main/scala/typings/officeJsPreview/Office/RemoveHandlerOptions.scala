package typings.officeJsPreview.Office

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
  var handler: js.UndefOr[String] = js.undefined
}

object RemoveHandlerOptions {
  @scala.inline
  def apply(asyncContext: js.Any = null, handler: String = null): RemoveHandlerOptions = {
    val __obj = js.Dynamic.literal()
    if (asyncContext != null) __obj.updateDynamic("asyncContext")(asyncContext.asInstanceOf[js.Any])
    if (handler != null) __obj.updateDynamic("handler")(handler.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemoveHandlerOptions]
  }
}

