package typings.openui5.sap.ui.core.routing

import typings.jquery.JQueryPromise
import typings.openui5.sap.ui.base.EventProvider
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Target extends EventProvider {
  /**
    * Attach event-handler <code>fnFunction</code> to the 'display' event of this
    * <code>sap.ui.core.routing.Target</code>.<br/>
    * @param oData The object, that should be passed along with the event-object when firing the event.
    * @param fnFunction The function to call, when the event occurs. This function will be called on
    * theoListener-instance (if present) or in a 'static way'.
    * @param oListener Object on which to call the given function.
    * @returns <code>this</code> to allow method chaining
    */
  def attachDisplay(oData: js.Any, fnFunction: js.Any): Target = js.native
  def attachDisplay(oData: js.Any, fnFunction: js.Any, oListener: js.Any): Target = js.native
  /**
    * Destroys the target, will be called by {@link sap.m.routing.Targets} don't call this directly.
    * @returns this for chaining.
    */
  def destroy(): Target = js.native
  /**
    * Detach event-handler <code>fnFunction</code> from the 'display' event of this
    * <code>sap.ui.core.routing.Target</code>.<br/>The passed function and listener object must match the
    * ones previously used for event registration.
    * @param fnFunction The function to call, when the event occurs.
    * @param oListener Object on which the given function had to be called.
    * @returns <code>this</code> to allow method chaining
    */
  def detachDisplay(fnFunction: js.Any, oListener: js.Any): Target = js.native
  /**
    * Creates a view and puts it in an aggregation of a control that has been defined in the {@link
    * sap.ui.core.routing.Target#constructor}.
    * @param vData an object that will be passed to the display event in the data property. If the target
    * has parents, the data will also be passed to them.
    * @returns resolves with {name: *, view: *, control: *} if the target can be successfully displayed
    * otherwise it resolves with {name: *, error: *}
    */
  def display(vData: js.Any): JQueryPromise[_] = js.native
  /**
    * Fire event created to attached listeners.
    * @param mArguments the arguments to pass along with the event.
    * @returns <code>this</code> to allow method chaining
    */
  def fireDisplay(mArguments: js.Any): Target = js.native
}

