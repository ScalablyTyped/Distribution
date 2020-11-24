package typings.openui5.sap.ui.core.routing

import typings.openui5.sap.ui.base.EventProvider
import typings.openui5.sap.ui.core.mvc.View
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Router extends EventProvider {
  
  /**
    * Adds a route to the router
    * @param oConfig configuration object for the route @see sap.ui.core.routing.Route#constructor
    * @param oParent The parent route - if a parent route is given, the routeMatched event of this route
    * will also trigger the route matched of the parent and it will also create the view of the parent (if
    * provided).
    */
  def addRoute(oConfig: js.Any, oParent: Route): Unit = js.native
  
  /**
    * Attach event-handler <code>fnFunction</code> to the 'bypassed' event of this
    * <code>sap.ui.core.routing.Router</code>.<br/>The event will get fired, if none of the routes of the
    * routes is matching. <br/>
    * @param oData The object, that should be passed along with the event-object when firing the event.
    * @param fnFunction The function to call, when the event occurs. This function will be called on the  
    *         oListener-instance (if present) or in a 'static way'.
    * @param oListener Object on which to call the given function. If empty, this Model is used.
    * @returns <code>this</code> to allow method chaining
    */
  def attachBypassed(oData: js.Any, fnFunction: js.Any): typings.openui5.sap.m.routing.Router = js.native
  def attachBypassed(oData: js.Any, fnFunction: js.Any, oListener: js.Any): typings.openui5.sap.m.routing.Router = js.native
  
  /**
    * Attach event-handler <code>fnFunction</code> to the 'routeMatched' event of this
    * <code>sap.ui.core.routing.Router</code>.<br/>
    * @param oData The object, that should be passed along with the event-object when firing the event.
    * @param fnFunction The function to call, when the event occurs. This function will be called on the  
    *         oListener-instance (if present) or in a 'static way'.
    * @param oListener Object on which to call the given function. If empty, this Model is used.
    * @returns <code>this</code> to allow method chaining
    */
  def attachRouteMatched(oData: js.Any, fnFunction: js.Any): typings.openui5.sap.m.routing.Router = js.native
  def attachRouteMatched(oData: js.Any, fnFunction: js.Any, oListener: js.Any): typings.openui5.sap.m.routing.Router = js.native
  
  /**
    * Attach event-handler <code>fnFunction</code> to the 'routePatternMatched' event of this
    * <code>sap.ui.core.routing.Router</code>.<br/>This event is similar to route matched. But it will
    * only fire for the route that has a matching pattern, not for its parent Routes <br/>
    * @param oData The object, that should be passed along with the event-object when firing the event.
    * @param fnFunction The function to call, when the event occurs. This function will be called on the  
    *         oListener-instance (if present) or in a 'static way'.
    * @param oListener Object on which to call the given function. If empty, this Model is used.
    * @returns <code>this</code> to allow method chaining
    */
  def attachRoutePatternMatched(oData: js.Any, fnFunction: js.Any): typings.openui5.sap.m.routing.Router = js.native
  def attachRoutePatternMatched(oData: js.Any, fnFunction: js.Any, oListener: js.Any): typings.openui5.sap.m.routing.Router = js.native
  
  /**
    * Attach event-handler <code>fnFunction</code> to the 'viewCreated' event of this
    * <code>sap.ui.core.routing.Router</code>.<br/>
    * @param oData The object, that should be passed along with the event-object when firing the event.
    * @param fnFunction The function to call, when the event occurs. This function will be called on
    * theoListener-instance (if present) or in a 'static way'.
    * @param oListener Object on which to call the given function. If empty, this Model is used.
    * @returns <code>this</code> to allow method chaining
    */
  def attachViewCreated(oData: js.Any, fnFunction: js.Any): typings.openui5.sap.m.routing.Router = js.native
  def attachViewCreated(oData: js.Any, fnFunction: js.Any, oListener: js.Any): typings.openui5.sap.m.routing.Router = js.native
  
  /**
    * Removes the router from the hash changer @see sap.ui.core.routing.HashChanger
    * @returns this for chaining.
    */
  def destroy(): typings.openui5.sap.m.routing.Router = js.native
  
  /**
    * Detach event-handler <code>fnFunction</code> from the 'bypassed' event of this
    * <code>sap.ui.core.routing.Router</code>.<br/>The event will get fired, if none of the routes of the
    * routes is matching. <br/>The passed function and listener object must match the ones previously used
    * for event registration.
    * @param fnFunction The function to call, when the event occurs.
    * @param oListener Object on which the given function had to be called.
    * @returns <code>this</code> to allow method chaining
    */
  def detachBypassed(fnFunction: js.Any, oListener: js.Any): typings.openui5.sap.m.routing.Router = js.native
  
  /**
    * Detach event-handler <code>fnFunction</code> from the 'routeMatched' event of this
    * <code>sap.ui.core.routing.Router</code>.<br/>The passed function and listener object must match the
    * ones previously used for event registration.
    * @param fnFunction The function to call, when the event occurs.
    * @param oListener Object on which the given function had to be called.
    * @returns <code>this</code> to allow method chaining
    */
  def detachRouteMatched(fnFunction: js.Any, oListener: js.Any): typings.openui5.sap.m.routing.Router = js.native
  
  /**
    * Detach event-handler <code>fnFunction</code> from the 'routePatternMatched' event of this
    * <code>sap.ui.core.routing.Router</code>.<br/>This event is similar to route matched. But it will
    * only fire for the route that has a matching pattern, not for its parent Routes <br/>The passed
    * function and listener object must match the ones previously used for event registration.
    * @param fnFunction The function to call, when the event occurs.
    * @param oListener Object on which the given function had to be called.
    * @returns <code>this</code> to allow method chaining
    */
  def detachRoutePatternMatched(fnFunction: js.Any, oListener: js.Any): typings.openui5.sap.m.routing.Router = js.native
  
  /**
    * Detach event-handler <code>fnFunction</code> from the 'viewCreated' event of this
    * <code>sap.ui.core.routing.Router</code>.<br/>The passed function and listener object must match the
    * ones previously used for event registration.
    * @param fnFunction The function to call, when the event occurs.
    * @param oListener Object on which the given function had to be called.
    * @returns <code>this</code> to allow method chaining
    */
  def detachViewCreated(fnFunction: js.Any, oListener: js.Any): typings.openui5.sap.m.routing.Router = js.native
  
  /**
    * Fire event bypassed to attached listeners.The event will get fired, if none of the routes of the
    * routes is matching. <br/>
    * @param mArguments the arguments to pass along with the event.
    * @returns <code>this</code> to allow method chaining
    */
  def fireBypassed(mArguments: js.Any): typings.openui5.sap.m.routing.Router = js.native
  
  /**
    * Fire event routeMatched to attached listeners.
    * @param mArguments the arguments to pass along with the event.
    * @returns <code>this</code> to allow method chaining
    */
  def fireRouteMatched(mArguments: js.Any): typings.openui5.sap.m.routing.Router = js.native
  
  /**
    * Fire event routePatternMatched to attached listeners.This event is similar to route matched. But it
    * will only fire for the route that has a matching pattern, not for its parent Routes <br/>
    * @param mArguments the arguments to pass along with the event.
    * @returns <code>this</code> to allow method chaining
    */
  def fireRoutePatternMatched(mArguments: js.Any): typings.openui5.sap.m.routing.Router = js.native
  
  /**
    * Fire event viewCreated to attached listeners.
    * @param mArguments the arguments to pass along with the event.
    * @returns <code>this</code> to allow method chaining
    */
  def fireViewCreated(mArguments: js.Any): typings.openui5.sap.m.routing.Router = js.native
  
  /**
    * Returns the Route with a name, if no route is found undefined is returned
    * @since 1.25.1
    * @param sName Name of the route
    * @returns the route with the provided name or undefined.
    */
  def getRoute(sName: String): Route = js.native
  
  /**
    * Get a registered router
    * @param sName Name of the router
    * @returns The router with the specified name, else undefined
    */
  def getRouter(sName: String): typings.openui5.sap.m.routing.Router = js.native
  
  /**
    * Returns the instance of Targets, if you pass a targets config to the router
    * @returns The instance of targets, the router uses to place views or undefined if you did not specify
    * the targets parameter in the router's constructor.
    */
  def getTargets(): Targets | js.Any = js.native
  
  /**
    * Returns the URL for the route and replaces the placeholders with the values in oParameters
    * @param sName Name of the route
    * @param oParameters Parameters for the route
    * @returns the unencoded pattern with interpolated arguments
    */
  def getURL(sName: String): String = js.native
  def getURL(sName: String, oParameters: js.Any): String = js.native
  
  /**
    * Returns a cached view for a given name or creates it if it does not yet exists
    * @param sViewName Name of the view
    * @param sViewType Type of the view
    * @param sViewId Optional view id
    * @returns the view instance
    */
  def getView(sViewName: String, sViewType: String, sViewId: String): View = js.native
  
  /**
    * Returns the views instance created by the router
    * @since 1.28
    * @returns the Views instance
    */
  def getViews(): Views = js.native
  
  /**
    * Attaches the router to the hash changer @see sap.ui.core.routing.HashChanger
    * @returns this for chaining.
    */
  def initialize(): typings.openui5.sap.m.routing.Router = js.native
  
  /**
    * Navigates to a specific route defining a set of parameters. The Parameters will be URI encoded - the
    * characters ; , / ? : @ & = + $ are reserved and will not be encoded.If you want to use special
    * characters in your oParameters, you have to encode them (encodeURIComponent).IF the given route name
    * can't be found, an error message is logged to the console and the hash will be changed to empty
    * string.
    * @param sName Name of the route
    * @param oParameters Parameters for the route
    * @param bReplace Defines if the hash should be replaced (no browser history entry) or set (browser
    * history entry)
    * @returns this for chaining.
    */
  def navTo(sName: String): typings.openui5.sap.m.routing.Router = js.native
  def navTo(sName: String, oParameters: js.UndefOr[scala.Nothing], bReplace: Boolean): typings.openui5.sap.m.routing.Router = js.native
  def navTo(sName: String, oParameters: js.Any): typings.openui5.sap.m.routing.Router = js.native
  def navTo(sName: String, oParameters: js.Any, bReplace: Boolean): typings.openui5.sap.m.routing.Router = js.native
  
  /**
    * Will trigger routing events + place targets for routes matching the string
    * @param sNewHash a new hash
    */
  def parse(sNewHash: String): Unit = js.native
  
  /**
    * Registers the router to access it from another context. Use sap.ui.routing.Router.getRouter() to
    * receive the instance
    * @param sName Name of the router
    */
  def register(sName: String): Unit = js.native
  
  /**
    * Adds or overwrites a view in the viewcache of the router, the viewname serves as a key
    * @since 1.22
    * @param sViewName Name of the view
    * @param oView the view instance
    * @returns @since 1.28 the this pointer for chaining
    */
  def setView(sViewName: String, oView: View): typings.openui5.sap.m.routing.Router = js.native
  
  /**
    * Stops to listen to the hashChange of the browser.</br>If you want the router to start again, call
    * initialize again.
    * @returns this for chaining.
    */
  def stop(): typings.openui5.sap.m.routing.Router = js.native
}
