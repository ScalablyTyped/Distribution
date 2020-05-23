package typings.openui5.sap.ui.core.routing

import typings.openui5.sap.ui.base.EventProvider
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Route extends EventProvider {
  /**
    * Attach event-handler <code>fnFunction</code> to the 'matched' event of this
    * <code>sap.ui.core.routing.Route</code>.<br/>
    * @since 1.25.1
    * @param oData The object, that should be passed along with the event-object when firing the event.
    * @param fnFunction The function to call, when the event occurs. This function will be called on the  
    *         oListener-instance (if present) or in a 'static way'.
    * @param oListener Object on which to call the given function. If empty, this Model is used.
    * @returns <code>this</code> to allow method chaining
    */
  def attachMatched(oData: js.Any, fnFunction: js.Any): Route = js.native
  def attachMatched(oData: js.Any, fnFunction: js.Any, oListener: js.Any): Route = js.native
  /**
    * Attach event-handler <code>fnFunction</code> to the 'patternMatched' event of this
    * <code>sap.ui.core.routing.Route</code>.<br/>
    * @since 1.25.1
    * @param oData The object, that should be passed along with the event-object when firing the event.
    * @param fnFunction The function to call, when the event occurs. This function will be called on the  
    *         oListener-instance (if present) or in a 'static way'.
    * @param oListener Object on which to call the given function. If empty, this Model is used.
    * @returns <code>this</code> to allow method chaining
    */
  def attachPatternMatched(oData: js.Any, fnFunction: js.Any): Route = js.native
  def attachPatternMatched(oData: js.Any, fnFunction: js.Any, oListener: js.Any): Route = js.native
  /**
    * Destroys a route
    * @returns this for chaining.
    */
  def destroy(): Route = js.native
  /**
    * Detach event-handler <code>fnFunction</code> from the 'matched' event of this
    * <code>sap.ui.core.routing.Route</code>.<br/>The passed function and listener object must match the
    * ones previously used for event registration.
    * @since 1.25.1
    * @param fnFunction The function to call, when the event occurs.
    * @param oListener Object on which the given function had to be called.
    * @returns <code>this</code> to allow method chaining
    */
  def detachMatched(fnFunction: js.Any, oListener: js.Any): Route = js.native
  /**
    * Detach event-handler <code>fnFunction</code> from the 'patternMatched' event of this
    * <code>sap.ui.core.routing.Route</code>.<br/>The passed function and listener object must match the
    * ones previously used for event registration.
    * @since 1.25.1
    * @param fnFunction The function to call, when the event occurs.
    * @param oListener Object on which the given function had to be called.
    * @returns <code>this</code> to allow method chaining
    */
  def detachPatternMatched(fnFunction: js.Any, oListener: js.Any): Route = js.native
  /**
    * Return the pattern of the route. If there are multiple patterns, the first pattern is returned
    * @returns the routes pattern
    */
  def getPattern(): String = js.native
  /**
    * Returns the URL for the route and replaces the placeholders with the values in oParameters
    * @param oParameters Parameters for the route
    * @returns the unencoded pattern with interpolated arguments
    */
  def getURL(oParameters: js.Any): String = js.native
}

