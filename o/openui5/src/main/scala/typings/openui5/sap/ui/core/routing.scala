package typings.openui5.sap.ui.core

import typings.jquery.JQueryPromise
import typings.openui5.sap.ui.base.EventProvider
import typings.openui5.sap.ui.core.mvc.View
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object routing {
  
  /**
    * Enumaration for different HistoryDirections
    */
  object routing {
    
    @js.native
    sealed trait HistoryDirection extends StObject
    @JSGlobal("sap.ui.core.routing.routing.HistoryDirection")
    @js.native
    object HistoryDirection extends StObject {
      
      @js.native
      sealed trait Backwards
        extends StObject
           with HistoryDirection
      
      @js.native
      sealed trait Forwards
        extends StObject
           with HistoryDirection
      
      @js.native
      sealed trait NewEntry
        extends StObject
           with HistoryDirection
      
      @js.native
      sealed trait Unknown
        extends StObject
           with HistoryDirection
    }
  }
  
  @js.native
  trait HashChanger
    extends StObject
       with EventProvider {
    
    /**
      * Fires the hashchanged event, may be extended to modify the hash before fireing the event
      * @param newHash the new hash of the browser
      * @param oldHash the previous hash
      */
    def fireHashChanged(newHash: String, oldHash: String): Unit = js.native
    
    /**
      * Gets the current hash
      * @returns the current hash
      */
    def getHash(): String = js.native
    
    /**
      * Gets a global singleton of the HashChanger. The singleton will get created when this function is
      * invoked for the first time.
      */
    def getInstance(): Unit = js.native
    
    /**
      * Will start listening to hashChanges with the parseHash function.This will also fire a hashchanged
      * event with the initial hash.
      */
    def init(): Unit = js.native
    
    /**
      * Replaces the hash to a certain value. When using the replace function no browser history is
      * written.If you want to have an entry in the browser history, please use set setHash function.
      * @param sHash the hash
      */
    def replaceHash(sHash: String): Unit = js.native
    
    /**
      * Sets the hashChanger to a new instance, destroys the old one and copies all its event listeners to
      * the new one
      * @param oHashChanger the new instance for the global singleton
      */
    def replaceHashChanger(oHashChanger: HashChanger): Unit = js.native
    
    /**
      * Sets the hash to a certain value. When using the set function a browser history  entry is written.If
      * you do not want to have an entry in the browser history, please use set replaceHash function.
      * @param sHash the hash
      */
    def setHash(sHash: String): Unit = js.native
  }
  
  trait History extends StObject {
    
    /**
      * Determines what the navigation direction for a newly given hash would beIt will say Unknown if there
      * is a history foo - bar (current history) - fooIf you now ask for the direction of the hash "foo" you
      * get Unknown because it might be backwards or forwards.For hash replacements, the history stack will
      * be replaced at this position for the history.
      * @param sNewHash optional, if this parameter is not passed the last hashChange is taken.
      * @returns or undefined, if no navigation has taken place yet.
      */
    def getDirection(sNewHash: String): js.Any
    
    /**
      * @returns a global singleton that gets created as soon as the sap.ui.core.routing.History is required
      */
    def getInstance(): typings.openui5.sap.ui.core.routing.History
    
    /**
      * gets the previous hash in the history - if the last direction was Unknown or there was no navigation
      * yet, undefined will be returned
      * @returns or undefined
      */
    def getPreviousHash(): String
  }
  object History {
    
    @scala.inline
    def apply(
      getDirection: String => js.Any,
      getInstance: () => typings.openui5.sap.ui.core.routing.History,
      getPreviousHash: () => String
    ): typings.openui5.sap.ui.core.routing.History = {
      val __obj = js.Dynamic.literal(getDirection = js.Any.fromFunction1(getDirection), getInstance = js.Any.fromFunction0(getInstance), getPreviousHash = js.Any.fromFunction0(getPreviousHash))
      __obj.asInstanceOf[typings.openui5.sap.ui.core.routing.History]
    }
    
    @scala.inline
    implicit class HistoryMutableBuilder[Self <: typings.openui5.sap.ui.core.routing.History] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGetDirection(value: String => js.Any): Self = StObject.set(x, "getDirection", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetInstance(value: () => typings.openui5.sap.ui.core.routing.History): Self = StObject.set(x, "getInstance", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetPreviousHash(value: () => String): Self = StObject.set(x, "getPreviousHash", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait Route
    extends StObject
       with EventProvider {
    
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
  
  @js.native
  trait Router
    extends StObject
       with EventProvider {
    
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
    def navTo(sName: String, oParameters: js.Any): typings.openui5.sap.m.routing.Router = js.native
    def navTo(sName: String, oParameters: js.Any, bReplace: Boolean): typings.openui5.sap.m.routing.Router = js.native
    def navTo(sName: String, oParameters: Unit, bReplace: Boolean): typings.openui5.sap.m.routing.Router = js.native
    
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
  
  @js.native
  trait Target
    extends StObject
       with EventProvider {
    
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
    def display(vData: js.Any): JQueryPromise[js.Any] = js.native
    
    /**
      * Fire event created to attached listeners.
      * @param mArguments the arguments to pass along with the event.
      * @returns <code>this</code> to allow method chaining
      */
    def fireDisplay(mArguments: js.Any): Target = js.native
  }
  
  @js.native
  trait Targets
    extends StObject
       with EventProvider {
    
    /**
      * Creates a target by using the given name and options. If there's already a target with the same name
      * exists, the existing target is kept from being overwritten and an error log will be written to the
      * development console.
      * @param sName the name of a target
      * @param oTarget the options of a target. The option names are the same as the ones in
      * "oOptions.targets.anyName" of {@link constructor}.
      * @returns Targets itself for method chaining
      */
    def addTarget(sName: String, oTarget: js.Any): Targets = js.native
    
    /**
      * Attach event-handler <code>fnFunction</code> to the 'display' event of this
      * <code>sap.ui.core.routing.Targets</code>.<br/>
      * @param oData The object, that should be passed along with the event-object when firing the event.
      * @param fnFunction The function to call, when the event occurs. This function will be called on
      * theoListener-instance (if present) or in a 'static way'.
      * @param oListener Object on which to call the given function.
      * @returns <code>this</code> to allow method chaining
      */
    def attachDisplay(oData: js.Any, fnFunction: js.Any): Targets = js.native
    def attachDisplay(oData: js.Any, fnFunction: js.Any, oListener: js.Any): Targets = js.native
    
    /**
      * Destroys the targets instance and all created targets. Does not destroy the views instance passed to
      * the constructor. It has to be destroyed separately.
      * @returns this for chaining.
      */
    def destroy(): Targets = js.native
    
    /**
      * Detach event-handler <code>fnFunction</code> from the 'display' event of this
      * <code>sap.ui.core.routing.Targets</code>.<br/>The passed function and listener object must match the
      * ones previously used for event registration.
      * @param fnFunction The function to call, when the event occurs.
      * @param oListener Object on which the given function had to be called.
      * @returns <code>this</code> to allow method chaining
      */
    def detachDisplay(fnFunction: js.Any, oListener: js.Any): Targets = js.native
    
    /**
      * Creates a view and puts it in an aggregation of the specified control.
      * @param vTargets the key of the target as specified in the {@link #constructor}. To display multiple
      * targets you may also pass an array of keys.
      * @param vData an object that will be passed to the display event in the data property. If the target
      * has parents, the data will also be passed to them.
      * @returns this pointer for chaining
      */
    def display(vTargets: String): Targets = js.native
    def display(vTargets: String, vData: js.Any): Targets = js.native
    def display(vTargets: js.Array[String]): Targets = js.native
    def display(vTargets: js.Array[String], vData: js.Any): Targets = js.native
    
    /**
      * Fire event created to attached listeners.
      * @param mArguments the arguments to pass along with the event.
      * @returns <code>this</code> to allow method chaining
      */
    def fireDisplay(mArguments: js.Any): Targets = js.native
    
    /**
      * Returns a target by its name (if you pass myTarget: { view: "myView" }) in the config myTarget is
      * the name.
      * @param vName the name of a single target or the name of multiple targets
      * @returns The target with the coresponding name or undefined. If an array way passed as name this
      * will return an array with all found targets. Non existing targets will not be returned but will log
      * an error.
      */
    def getTarget(vName: String): Target | js.Any | js.Array[Target] = js.native
    def getTarget(vName: js.Array[String]): Target | js.Any | js.Array[Target] = js.native
    
    /**
      * Returns the views instance passed to the constructor
      * @returns the views instance
      */
    def getViews(): Views = js.native
  }
  
  @js.native
  trait Views
    extends StObject
       with EventProvider {
    
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
}
