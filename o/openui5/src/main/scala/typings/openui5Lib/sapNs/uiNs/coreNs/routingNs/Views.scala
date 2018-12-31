package typings
package openui5Lib.sapNs.uiNs.coreNs.routingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("sap.ui.core.routing.Views")
@js.native
class Views protected ()
  extends openui5Lib.sapNs.uiNs.baseNs.EventProvider {
  /**
    * Instantiates a view repository that creates and caches views. If it is destroyed, all the Views it
    * created are destroyed.Usually you do not have to create instances of this class, it is used by the
    * {@link sap.ui.core.routing.Router}.If you are using {@link sap.ui.core.routing.Targets} without
    * using a {@link sap.ui.core.UIComponent} you have to create an instance of this class.They will
    * create an instance on their own, or if they are used with a {@link sap.ui.core.UIComponent} they
    * will share the same instance of Views.
    * @param oOptions undefined
    */
  def this(oOptions: js.Any) = this()
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

