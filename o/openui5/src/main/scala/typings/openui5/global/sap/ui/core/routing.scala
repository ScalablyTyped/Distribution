package typings.openui5.global.sap.ui.core

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object routing {
  
  @JSGlobal("sap.ui.core.routing.HashChanger")
  @js.native
  class HashChanger ()
    extends StObject
       with typings.openui5.sap.ui.core.routing.HashChanger
  
  @JSGlobal("sap.ui.core.routing.History")
  @js.native
  class History protected ()
    extends StObject
       with typings.openui5.sap.ui.core.routing.History {
    /**
      * Used to determine the {@link sap.ui.core.HistoryDirection} of the current or a future
      * navigation,done with a {@link sap.ui.core.routing.Router} or {@link
      * sap.ui.core.routing.HashChanger}.<strong>ATTENTION:</strong> this class will not be accurate if
      * someone does hash-replacement without the named classes aboveIf you are manipulating the hash
      * directly this class is not supported anymore.
      * @param oHashChanger required, without a HashChanger this class cannot work. The class needs to be
      * aware of the hash-changes.
      */
    def this(oHashChanger: typings.openui5.sap.ui.core.routing.HashChanger) = this()
    
    /**
      * Determines what the navigation direction for a newly given hash would beIt will say Unknown if there
      * is a history foo - bar (current history) - fooIf you now ask for the direction of the hash "foo" you
      * get Unknown because it might be backwards or forwards.For hash replacements, the history stack will
      * be replaced at this position for the history.
      * @param sNewHash optional, if this parameter is not passed the last hashChange is taken.
      * @returns or undefined, if no navigation has taken place yet.
      */
    /* CompleteClass */
    override def getDirection(sNewHash: String): js.Any = js.native
    
    /**
      * @returns a global singleton that gets created as soon as the sap.ui.core.routing.History is required
      */
    /* CompleteClass */
    override def getInstance(): typings.openui5.sap.ui.core.routing.History = js.native
    
    /**
      * gets the previous hash in the history - if the last direction was Unknown or there was no navigation
      * yet, undefined will be returned
      * @returns or undefined
      */
    /* CompleteClass */
    override def getPreviousHash(): String = js.native
  }
  
  @JSGlobal("sap.ui.core.routing.Route")
  @js.native
  class Route protected ()
    extends StObject
       with typings.openui5.sap.ui.core.routing.Route {
    /**
      * Instantiates a SAPUI5 Route
      * @param The router instance, the route will be added to.
      * @param oConfig configuration object for the route
      * @param oParent The parent route - if a parent route is given, the routeMatched event of this route
      * will also trigger the route matched of the parent and it will also create the view of the parent(if
      * provided).
      */
    def this(The: typings.openui5.sap.m.routing.Router, oConfig: js.Any) = this()
    def this(
      The: typings.openui5.sap.m.routing.Router,
      oConfig: js.Any,
      oParent: typings.openui5.sap.ui.core.routing.Route
    ) = this()
  }
  
  @JSGlobal("sap.ui.core.routing.Router")
  @js.native
  class Router protected ()
    extends StObject
       with typings.openui5.sap.ui.core.routing.Router {
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
    def this(oRoutes: js.Array[js.Any]) = this()
    def this(oRoutes: js.Any, oConfig: js.Any) = this()
    def this(oRoutes: js.Array[js.Any], oConfig: js.Any) = this()
    def this(oRoutes: js.Any, oConfig: js.Any, oOwner: typings.openui5.sap.ui.core.UIComponent) = this()
    def this(oRoutes: js.Any, oConfig: Unit, oOwner: typings.openui5.sap.ui.core.UIComponent) = this()
    def this(oRoutes: js.Array[js.Any], oConfig: js.Any, oOwner: typings.openui5.sap.ui.core.UIComponent) = this()
    def this(oRoutes: js.Array[js.Any], oConfig: Unit, oOwner: typings.openui5.sap.ui.core.UIComponent) = this()
    def this(oRoutes: js.Any, oConfig: js.Any, oOwner: Unit, oTargetsConfig: js.Any) = this()
    def this(
      oRoutes: js.Any,
      oConfig: js.Any,
      oOwner: typings.openui5.sap.ui.core.UIComponent,
      oTargetsConfig: js.Any
    ) = this()
    def this(oRoutes: js.Any, oConfig: Unit, oOwner: Unit, oTargetsConfig: js.Any) = this()
    def this(
      oRoutes: js.Any,
      oConfig: Unit,
      oOwner: typings.openui5.sap.ui.core.UIComponent,
      oTargetsConfig: js.Any
    ) = this()
    def this(oRoutes: js.Array[js.Any], oConfig: js.Any, oOwner: Unit, oTargetsConfig: js.Any) = this()
    def this(
      oRoutes: js.Array[js.Any],
      oConfig: js.Any,
      oOwner: typings.openui5.sap.ui.core.UIComponent,
      oTargetsConfig: js.Any
    ) = this()
    def this(oRoutes: js.Array[js.Any], oConfig: Unit, oOwner: Unit, oTargetsConfig: js.Any) = this()
    def this(
      oRoutes: js.Array[js.Any],
      oConfig: Unit,
      oOwner: typings.openui5.sap.ui.core.UIComponent,
      oTargetsConfig: js.Any
    ) = this()
  }
  
  @JSGlobal("sap.ui.core.routing.Target")
  @js.native
  class Target protected ()
    extends StObject
       with typings.openui5.sap.ui.core.routing.Target {
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
    def this(oOptions: js.Any, oViews: typings.openui5.sap.ui.core.routing.Views) = this()
    def this(
      oOptions: js.Any,
      oViews: typings.openui5.sap.ui.core.routing.Views,
      oParent: typings.openui5.sap.ui.core.routing.Target
    ) = this()
  }
  
  @JSGlobal("sap.ui.core.routing.Targets")
  @js.native
  class Targets protected ()
    extends StObject
       with typings.openui5.sap.ui.core.routing.Targets {
    /**
      * Provides a convenient way for placing views into the correct containers of your application.The main
      * benefit of Targets is lazy loading: you do not have to create the views until you really need
      * them.If you are using the mobile library, please use {@link sap.m.routing.Targets} instead of this
      * class.
      * @param oOptions undefined
      */
    def this(oOptions: js.Any) = this()
  }
  
  @JSGlobal("sap.ui.core.routing.Views")
  @js.native
  class Views protected ()
    extends StObject
       with typings.openui5.sap.ui.core.routing.Views {
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
  }
  
  /**
    * Enumaration for different HistoryDirections
    */
  object routing {
    
    @JSGlobal("sap.ui.core.routing.routing.HistoryDirection")
    @js.native
    object HistoryDirection extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typings.openui5.sap.ui.core.routing.routing.HistoryDirection & Double] = js.native
      
      /* 0 */ val Backwards: typings.openui5.sap.ui.core.routing.routing.HistoryDirection.Backwards & Double = js.native
      
      /* 1 */ val Forwards: typings.openui5.sap.ui.core.routing.routing.HistoryDirection.Forwards & Double = js.native
      
      /* 2 */ val NewEntry: typings.openui5.sap.ui.core.routing.routing.HistoryDirection.NewEntry & Double = js.native
      
      /* 3 */ val Unknown: typings.openui5.sap.ui.core.routing.routing.HistoryDirection.Unknown & Double = js.native
    }
  }
}
