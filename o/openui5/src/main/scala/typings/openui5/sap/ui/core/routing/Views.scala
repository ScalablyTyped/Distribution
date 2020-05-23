package typings.openui5.sap.ui.core.routing

import typings.openui5.sap.ui.base.EventProvider
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Views extends EventProvider {
  /**
    * Attach event-handler <code>fnFunction</code> to the 'created' event of this
    * <code>sap.ui.core.routing.Views</code>.<br/>
    * @param oData The object, that should be passed along with the event-object when firing the event.
    * @param fnFunction The function to call, when the event occurs. This function will be called on
    * theoListener-instance (if present) or in a 'static way'.
    * @param oListener Object on which to call the given function.
    * @returns <code>this</code> to allow method chaining
    */
  def attachCreated(oData: js.Any, fnFunction: js.Any): Views = js.native
  def attachCreated(oData: js.Any, fnFunction: js.Any, oListener: js.Any): Views = js.native
  /**
    * Detach event-handler <code>fnFunction</code> from the 'created' event of this
    * <code>sap.ui.core.routing.Views</code>.<br/>The passed function and listener object must match the
    * ones previously used for event registration.
    * @param fnFunction The function to call, when the event occurs.
    * @param oListener Object on which the given function had to be called.
    * @returns <code>this</code> to allow method chaining
    */
  def detachCreated(fnFunction: js.Any, oListener: js.Any): Views = js.native
  /**
    * Fire event created to attached listeners.
    * @param mArguments the arguments to pass along with the event.
    * @returns <code>this</code> to allow method chaining
    */
  def fireCreated(mArguments: js.Any): Views = js.native
}

