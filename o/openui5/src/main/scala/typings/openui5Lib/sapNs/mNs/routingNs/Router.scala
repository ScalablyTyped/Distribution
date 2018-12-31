package typings
package openui5Lib.sapNs.mNs.routingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("sap.m.routing.Router")
@js.native
class Router protected ()
  extends openui5Lib.sapNs.uiNs.coreNs.routingNs.Router {
  /**
    * Instantiates a SAPUI5 mobile Router see {@link sap.ui.core.routing.Router} for the constructor
    * argumentsThe difference to the {@link sap.ui.core.routing.Router} are the properties viewLevel,
    * transition and transitionParameters you can specify in every Route or Target created by this router.
    * @param oRoutes may contain many Route configurations as {@link
    * sap.ui.core.routing.Route#constructor}.<br/>Each of the routes contained in the array/object will be
    * added to the router.<br/>One way of defining routes is an array:<pre>[    //Will create a route
    * called 'firstRouter' you can later use this name in navTo to navigate to this route    {       
    * name: "firstRoute"        pattern : "usefulPattern"    },    //Will create a route called
    * 'anotherRoute'    {        name: "anotherRoute"        pattern : "anotherPattern"    }]</pre>The
    * alternative way of defining routes is an Object.<br/>If you choose this way, the name attribute is
    * the name of the property.<pre>{    //Will create a route called 'firstRouter' you can later use this
    * name in navTo to navigate to this route    firstRoute : {        pattern : "usefulPattern"    },   
    * //Will create a route called 'anotherRoute'    anotherRoute : {        pattern : "anotherPattern"   
    * }}</pre>The values that may be provided are the same as in {@link
    * sap.ui.core.routing.Route#constructor}
    * @param oConfig Default values for route configuration - also takes the same parameters as {@link
    * sap.ui.core.routing.Target#constructor}.<br/>This config will be used for routes and for targets,
    * used in the router<br/>Eg: if the config object specifies :<pre><code>{ viewType : "XML"
    * }</code></pre>The targets look like this:<pre>{    xmlTarget : {        ...    },    jsTarget : {   
    *     viewType : "JS"        ...    }}</pre>Then the effective config will look like this:<pre>{   
    * xmlTarget : {        viewType : "XML"        ...    },    jsTarget : {        viewType : "JS"       
    * ...    }}</pre>Since the xmlTarget does not specify its viewType, XML is taken from the config
    * object. The jsTarget is specifying it, so the viewType will be JS.<br/>
    * @param oOwner the Component of all the views that will be created by this Router,<br/>will get
    * forwarded to the {@link sap.ui.core.routing.Views#contructor}.<br/>If you are using the
    * componentMetadata to define your routes you should skip this parameter.<br/>
    * @param oTargetsConfig the target configuration, see {@link sap.m.routing.Targets#constructor}
    * documentation (the options object).<br/>You should use Targets to create and display views. The
    * route should only contain routing relevant properties.<br/><b>Example:</b><pre><code>    new Router(
    *    // Routes    [        {            // no view creation related properties are in the route       
    *     name: "startRoute",            //no hash            pattern: "",            // you can find this
    * target in the targetConfig            target: "welcome"        }    ],    // Default values shared
    * by routes and Targets    {        viewNamespace: "my.application.namespace",        viewType: "XML" 
    *   },    // You should only use this constructor when you are not using a router with a component.   
    * // Please use the metadata of a component to define your routes and targets.    // The documentation
    * can be found here: {@link sap.ui.core.UIComponent#.extend}.    null,    // Target config    {       
    *  //same name as in the route called 'startRoute'         welcome: {             // All properties
    * for creating and placing a view go here or in the config             viewName: "Welcome",           
    *  controlId: "app",             controlAggregation: "pages"         }    })</code></pre>
    */
  def this(oRoutes: js.Any) = this()
  def this(oRoutes: js.Array[_]) = this()
  def this(oRoutes: js.Any, oConfig: js.Any) = this()
  def this(oRoutes: js.Array[_], oConfig: js.Any) = this()
  def this(oRoutes: js.Any, oConfig: js.Any, oOwner: openui5Lib.sapNs.uiNs.coreNs.UIComponent) = this()
  def this(oRoutes: js.Array[_], oConfig: js.Any, oOwner: openui5Lib.sapNs.uiNs.coreNs.UIComponent) = this()
  def this(oRoutes: js.Any, oConfig: js.Any, oOwner: openui5Lib.sapNs.uiNs.coreNs.UIComponent, oTargetsConfig: js.Any) = this()
  def this(oRoutes: js.Array[_], oConfig: js.Any, oOwner: openui5Lib.sapNs.uiNs.coreNs.UIComponent, oTargetsConfig: js.Any) = this()
  /**
    * Returns the TargetHandler instance.
    * @returns the TargetHandler instance
    */
  def getTargetHandler(): TargetHandler = js.native
}

