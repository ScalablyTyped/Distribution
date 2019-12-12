package typings.openui5.sap.ui.core

import org.scalablytyped.runtime.TopLevel
import typings.jquery.JQueryPromise
import typings.openui5.sap.ui.base.EventProvider
import typings.openui5.sap.ui.core.mvc.View
import typings.openui5.sap.ui.core.routing.HashChanger
import typings.openui5.sap.ui.core.routing.Route
import typings.openui5.sap.ui.core.routing.Target
import typings.openui5.sap.ui.core.routing.Targets
import typings.openui5.sap.ui.core.routing.Views
import typings.openui5.sap.ui.core.routing.routing.HistoryDirection
import typings.openui5.sap.ui.core.routing.routing.HistoryDirection.Backwards
import typings.openui5.sap.ui.core.routing.routing.HistoryDirection.Forwards
import typings.openui5.sap.ui.core.routing.routing.HistoryDirection.NewEntry
import typings.openui5.sap.ui.core.routing.routing.HistoryDirection.Unknown
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("sap.ui.core.routing")
@js.native
object routing extends js.Object {
  @js.native
  class HashChanger () extends EventProvider {
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
  
  @js.native
  class History protected () extends js.Object {
    /**
      * Used to determine the {@link sap.ui.core.HistoryDirection} of the current or a future
      * navigation,done with a {@link sap.ui.core.routing.Router} or {@link
      * sap.ui.core.routing.HashChanger}.<strong>ATTENTION:</strong> this class will not be accurate if
      * someone does hash-replacement without the named classes aboveIf you are manipulating the hash
      * directly this class is not supported anymore.
      * @param oHashChanger required, without a HashChanger this class cannot work. The class needs to be
      * aware of the hash-changes.
      */
    def this(oHashChanger: HashChanger) = this()
    /**
      * Determines what the navigation direction for a newly given hash would beIt will say Unknown if there
      * is a history foo - bar (current history) - fooIf you now ask for the direction of the hash "foo" you
      * get Unknown because it might be backwards or forwards.For hash replacements, the history stack will
      * be replaced at this position for the history.
      * @param sNewHash optional, if this parameter is not passed the last hashChange is taken.
      * @returns or undefined, if no navigation has taken place yet.
      */
    def getDirection(sNewHash: String): js.Any = js.native
    /**
      * @returns a global singleton that gets created as soon as the sap.ui.core.routing.History is required
      */
    def getInstance(): typings.openui5.sap.ui.core.routing.History = js.native
    /**
      * gets the previous hash in the history - if the last direction was Unknown or there was no navigation
      * yet, undefined will be returned
      * @returns or undefined
      */
    def getPreviousHash(): String = js.native
  }
  
  @js.native
  class Route protected () extends EventProvider {
    /**
      * Instantiates a SAPUI5 Route
      * @param The router instance, the route will be added to.
      * @param oConfig configuration object for the route
      * @param oParent The parent route - if a parent route is given, the routeMatched event of this route
      * will also trigger the route matched of the parent and it will also create the view of the parent(if
      * provided).
      */
    def this(The: typings.openui5.sap.m.routing.Router, oConfig: js.Any) = this()
    def this(The: typings.openui5.sap.m.routing.Router, oConfig: js.Any, oParent: Route) = this()
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
  class Router protected () extends EventProvider {
    /**
      * Instantiates a SAPUI5 Router
      * @param oRoutes may contain many Route configurations as {@link
      * sap.ui.core.routing.Route#constructor}.<br/>Each of the routes contained in the array/object will be
      * added to the router.<br/>One way of defining routes is an array:<pre>[    //Will create a route
      * called 'firstRouter' you can later use this name in navTo to navigate to this route    {       
      * name: "firstRoute"        pattern : "usefulPattern"    },    //Will create a route called
      * 'anotherRoute'    {        name: "anotherRoute"        pattern : "anotherPattern"    }]</pre>The
      * alternative way of defining routes is an Object.If you choose this way, the name attribute is the
      * name of the property.<pre>{    //Will create a route called 'firstRouter' you can later use this
      * name in navTo to navigate to this route    firstRoute : {        pattern : "usefulPattern"    },   
      * //Will create a route called 'anotherRoute'    anotherRoute : {        pattern : "anotherPattern"   
      * }}</pre>The values that may be provided are the same as in {@link
      * sap.ui.core.routing.Route#constructor}
      * @param oConfig Default values for route configuration - also takes the same parameters as {@link
      * sap.ui.core.routing.Target#constructor}.<br/>This config will be used for routes and for targets,
      * used in the router<br/>Eg: if the config object specifies :<pre><code>{    viewType :
      * "XML"}</code></pre>The targets look like this:<pre>{    xmlTarget : {        ...    },    jsTarget :
      * {        viewType : "JS"        ...    }}</pre>Then the effective config will look like this:<pre>{ 
      *   xmlTarget : {        viewType : "XML"        ...    },    jsTarget : {        viewType : "JS"     
      *   ...    }}</pre>Since the xmlTarget does not specify its viewType, XML is taken from the config
      * object. The jsTarget is specifying it, so the viewType will be JS.
      * @param oOwner the Component of all the views that will be created by this Router,<br/>will get
      * forwarded to the {@link sap.ui.core.routing.Views#contructor}.<br/>If you are using the
      * componentMetadata to define your routes you should skip this parameter.
      * @param oTargetsConfig available @since 1.28 the target configuration, see {@link
      * sap.ui.core.Targets#constructor} documentation (the options object).<br/>You should use Targets to
      * create and display views. Since 1.28 the route should only contain routing relevant
      * properties.<br/><b>Example:</b><pre><code>    new Router(    // Routes    [        {            //
      * no view creation related properties are in the route            name: "startRoute",            //no
      * hash            pattern: "",            // you can find this target in the targetConfig           
      * target: "welcome"        }    ],    // Default values shared by routes and Targets    {       
      * viewNamespace: "my.application.namespace",        viewType: "XML"    },    // You should only use
      * this constructor when you are not using a router with a component.    // Please use the metadata of
      * a component to define your routes and targets.    // The documentation can be found here: {@link
      * sap.ui.core.UIComponent#.extend}.    null,    // Target config    {         //same name as in the
      * route called 'startRoute'         welcome: {             // All properties for creating and placing
      * a view go here or in the config             viewName: "Welcome",             controlId: "app",      
      *       controlAggregation: "pages"         }    })</code></pre>
      */
    def this(oRoutes: js.Any) = this()
    def this(oRoutes: js.Array[_]) = this()
    def this(oRoutes: js.Any, oConfig: js.Any) = this()
    def this(oRoutes: js.Array[_], oConfig: js.Any) = this()
    def this(oRoutes: js.Any, oConfig: js.Any, oOwner: UIComponent) = this()
    def this(oRoutes: js.Array[_], oConfig: js.Any, oOwner: UIComponent) = this()
    def this(oRoutes: js.Any, oConfig: js.Any, oOwner: UIComponent, oTargetsConfig: js.Any) = this()
    def this(oRoutes: js.Array[_], oConfig: js.Any, oOwner: UIComponent, oTargetsConfig: js.Any) = this()
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
  class Target protected () extends EventProvider {
    /**
      * Provides a convenient way for placing views into the correct containers of your application.<br/>The
      * main benefit of Targets is lazy loading: you do not have to create the views until you really need
      * them.<br/><b>Don't call this constructor directly</b>, use {@link sap.ui.core.routing.Targets}
      * instead, it will create instances of a Target.<br/>If you are using the mobile library, please use
      * the {@link sap.m.routing.Targets} constructor, please read the documentation there.<br/>
      * @param oOptions all of the parameters defined in {@link sap.m.routing.Targets#constructor} are
      * accepted here, except for children you need to specify the parent.
      * @param oViews All views required by this target will get created by the views instance using {@link
      * sap.ui.core.routing.Views#getView}
      * @param oParent the parent of this target. Will also get displayed, if you display this target. In
      * the config you have the fill the children property {@link sap.m.routing.Targets#constructor}
      */
    def this(oOptions: js.Any, oViews: Views) = this()
    def this(oOptions: js.Any, oViews: Views, oParent: Target) = this()
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
  
  @js.native
  class Targets protected () extends EventProvider {
    /**
      * Provides a convenient way for placing views into the correct containers of your application.The main
      * benefit of Targets is lazy loading: you do not have to create the views until you really need
      * them.If you are using the mobile library, please use {@link sap.m.routing.Targets} instead of this
      * class.
      * @param oOptions undefined
      */
    def this(oOptions: js.Any) = this()
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
  class Views protected () extends EventProvider {
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
  
  /**
    * Enumaration for different HistoryDirections
    */
  @js.native
  object routing extends js.Object {
    @js.native
    sealed trait HistoryDirection extends js.Object
    
    @js.native
    object HistoryDirection extends js.Object {
      @js.native
      sealed trait Backwards extends HistoryDirection
      
      @js.native
      sealed trait Forwards extends HistoryDirection
      
      @js.native
      sealed trait NewEntry extends HistoryDirection
      
      @js.native
      sealed trait Unknown extends HistoryDirection
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[HistoryDirection with Double] = js.native
      /* 0 */ @js.native
      object Backwards extends TopLevel[Backwards with Double]
      
      /* 1 */ @js.native
      object Forwards extends TopLevel[Forwards with Double]
      
      /* 2 */ @js.native
      object NewEntry extends TopLevel[NewEntry with Double]
      
      /* 3 */ @js.native
      object Unknown extends TopLevel[Unknown with Double]
      
    }
    
  }
  
}

