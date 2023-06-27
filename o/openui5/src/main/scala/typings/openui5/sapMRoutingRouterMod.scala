package typings.openui5

import typings.openui5.anon.`1`
import typings.openui5.sap.ClassInfo
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapMRoutingRouterMod {
  
  @JSImport("sap/m/routing/Router", JSImport.Default)
  @js.native
  /**
    * Constructor for a new `sap.m.routing.Router`. See `{@link sap.ui.core.routing.Router}` for the constructor
    * arguments.
    */
  open class default () extends Router {
    def this(/**
      * may contain many Route configurations as {@link sap.ui.core.routing.Route#constructor}.
      *  Each of the routes contained in the array/object will be added to the router.
      *
      *
      * One way of defining routes is an array:
      * ```javascript
      *
      * [
      *     //Will create a route called 'firstRouter' you can later use this name in navTo to navigate to this route
      *     {
      *         name: "firstRoute"
      *         pattern : "usefulPattern"
      *     },
      *     //Will create a route called 'anotherRoute'
      *     {
      *         name: "anotherRoute"
      *         pattern : "anotherPattern"
      *     },
      *     //Will create a route for a nested component with the prefix 'componentPrefix'
      *     {
      *         pattern: "componentPattern",
      *         name: "componentRoute",
      *         target: [
      *              {
      *                  name: "subComponent",
      *                  prefix: "componentPrefix"
      *              }
      *         ]
      *     }
      * ]
      * ```
      *
      *
      * The alternative way of defining routes is an Object.
      *  If you choose this way, the name attribute is the name of the property.
      * ```javascript
      *
      * {
      *     //Will create a route called 'firstRouter' you can later use this name in navTo to navigate to this route
      *     firstRoute : {
      *         pattern : "usefulPattern"
      *     },
      *     //Will create a route called 'anotherRoute'
      *     anotherRoute : {
      *         pattern : "anotherPattern"
      *     },
      *     //Will create a route for a nested component with the prefix 'componentPrefix'
      *     componentRoute{
      *         pattern: "componentPattern",
      *         target: [
      *              {
      *                  name: "subComponent",
      *                  prefix: "componentPrefix"
      *              }
      *         ]
      *     }
      * }
      * ```
      *  The values that may be provided are the same as in {@link sap.ui.core.routing.Route#constructor}
      */
    oRoutes: js.Array[js.Object]) = this()
    def this(/**
      * may contain many Route configurations as {@link sap.ui.core.routing.Route#constructor}.
      *  Each of the routes contained in the array/object will be added to the router.
      *
      *
      * One way of defining routes is an array:
      * ```javascript
      *
      * [
      *     //Will create a route called 'firstRouter' you can later use this name in navTo to navigate to this route
      *     {
      *         name: "firstRoute"
      *         pattern : "usefulPattern"
      *     },
      *     //Will create a route called 'anotherRoute'
      *     {
      *         name: "anotherRoute"
      *         pattern : "anotherPattern"
      *     },
      *     //Will create a route for a nested component with the prefix 'componentPrefix'
      *     {
      *         pattern: "componentPattern",
      *         name: "componentRoute",
      *         target: [
      *              {
      *                  name: "subComponent",
      *                  prefix: "componentPrefix"
      *              }
      *         ]
      *     }
      * ]
      * ```
      *
      *
      * The alternative way of defining routes is an Object.
      *  If you choose this way, the name attribute is the name of the property.
      * ```javascript
      *
      * {
      *     //Will create a route called 'firstRouter' you can later use this name in navTo to navigate to this route
      *     firstRoute : {
      *         pattern : "usefulPattern"
      *     },
      *     //Will create a route called 'anotherRoute'
      *     anotherRoute : {
      *         pattern : "anotherPattern"
      *     },
      *     //Will create a route for a nested component with the prefix 'componentPrefix'
      *     componentRoute{
      *         pattern: "componentPattern",
      *         target: [
      *              {
      *                  name: "subComponent",
      *                  prefix: "componentPrefix"
      *              }
      *         ]
      *     }
      * }
      * ```
      *  The values that may be provided are the same as in {@link sap.ui.core.routing.Route#constructor}
      */
    oRoutes: js.Object) = this()
    def this(
      /**
      * may contain many Route configurations as {@link sap.ui.core.routing.Route#constructor}.
      *  Each of the routes contained in the array/object will be added to the router.
      *
      *
      * One way of defining routes is an array:
      * ```javascript
      *
      * [
      *     //Will create a route called 'firstRouter' you can later use this name in navTo to navigate to this route
      *     {
      *         name: "firstRoute"
      *         pattern : "usefulPattern"
      *     },
      *     //Will create a route called 'anotherRoute'
      *     {
      *         name: "anotherRoute"
      *         pattern : "anotherPattern"
      *     },
      *     //Will create a route for a nested component with the prefix 'componentPrefix'
      *     {
      *         pattern: "componentPattern",
      *         name: "componentRoute",
      *         target: [
      *              {
      *                  name: "subComponent",
      *                  prefix: "componentPrefix"
      *              }
      *         ]
      *     }
      * ]
      * ```
      *
      *
      * The alternative way of defining routes is an Object.
      *  If you choose this way, the name attribute is the name of the property.
      * ```javascript
      *
      * {
      *     //Will create a route called 'firstRouter' you can later use this name in navTo to navigate to this route
      *     firstRoute : {
      *         pattern : "usefulPattern"
      *     },
      *     //Will create a route called 'anotherRoute'
      *     anotherRoute : {
      *         pattern : "anotherPattern"
      *     },
      *     //Will create a route for a nested component with the prefix 'componentPrefix'
      *     componentRoute{
      *         pattern: "componentPattern",
      *         target: [
      *              {
      *                  name: "subComponent",
      *                  prefix: "componentPrefix"
      *              }
      *         ]
      *     }
      * }
      * ```
      *  The values that may be provided are the same as in {@link sap.ui.core.routing.Route#constructor}
      */
    oRoutes: js.Array[js.Object],
      /**
      * Default values for route configuration - also takes the same parameters as {@link sap.ui.core.routing.Target#constructor}.
      *  This config will be used for routes and for targets, used in the router
      *  Eg: if the config object specifies :
      * ```javascript
      *
      *
      * { viewType : "XML" }
      *
      * ```
      *  The targets look like this:
      * ```javascript
      *
      * {
      *     xmlTarget : {
      *         ...
      *     },
      *     jsTarget : {
      *         viewType : "JS"
      *         ...
      *     },
      *     componentTarget: {
      *         type: "Component",
      *         name: "subComponent",
      *         id: "mySubComponent",
      *         options: {
      *             // the Component configuration:
      *             manifest: true
      *             ...
      *         },
      *         controlId: "myRootView",
      *         controlAggregation: "content"
      *     }
      * }
      * ```
      *  Then the effective config will look like this:
      * ```javascript
      *
      * {
      *     xmlTarget : {
      *         viewType : "XML"
      *         ...
      *     },
      *     jsTarget : {
      *         viewType : "JS"
      *         ...
      *     },
      * 	   componentTarget: {
      *         type: "Component",
      *         name: "subComponent",
      *         id: "mySubComponent",
      *         options: {
      *             // the Component configuration:
      *             manifest: true
      *             ...
      *         },
      *         controlId: "myRootView",
      *         controlAggregation: "content"
      *     }
      * }
      * ```
      *
      *
      * Since the xmlTarget does not specify its viewType, XML is taken from the config object. The jsTarget
      * is specifying it, so the viewType will be JS.
      */
    oConfig: `1`
    ) = this()
    def this(
      /**
      * may contain many Route configurations as {@link sap.ui.core.routing.Route#constructor}.
      *  Each of the routes contained in the array/object will be added to the router.
      *
      *
      * One way of defining routes is an array:
      * ```javascript
      *
      * [
      *     //Will create a route called 'firstRouter' you can later use this name in navTo to navigate to this route
      *     {
      *         name: "firstRoute"
      *         pattern : "usefulPattern"
      *     },
      *     //Will create a route called 'anotherRoute'
      *     {
      *         name: "anotherRoute"
      *         pattern : "anotherPattern"
      *     },
      *     //Will create a route for a nested component with the prefix 'componentPrefix'
      *     {
      *         pattern: "componentPattern",
      *         name: "componentRoute",
      *         target: [
      *              {
      *                  name: "subComponent",
      *                  prefix: "componentPrefix"
      *              }
      *         ]
      *     }
      * ]
      * ```
      *
      *
      * The alternative way of defining routes is an Object.
      *  If you choose this way, the name attribute is the name of the property.
      * ```javascript
      *
      * {
      *     //Will create a route called 'firstRouter' you can later use this name in navTo to navigate to this route
      *     firstRoute : {
      *         pattern : "usefulPattern"
      *     },
      *     //Will create a route called 'anotherRoute'
      *     anotherRoute : {
      *         pattern : "anotherPattern"
      *     },
      *     //Will create a route for a nested component with the prefix 'componentPrefix'
      *     componentRoute{
      *         pattern: "componentPattern",
      *         target: [
      *              {
      *                  name: "subComponent",
      *                  prefix: "componentPrefix"
      *              }
      *         ]
      *     }
      * }
      * ```
      *  The values that may be provided are the same as in {@link sap.ui.core.routing.Route#constructor}
      */
    oRoutes: js.Object,
      /**
      * Default values for route configuration - also takes the same parameters as {@link sap.ui.core.routing.Target#constructor}.
      *  This config will be used for routes and for targets, used in the router
      *  Eg: if the config object specifies :
      * ```javascript
      *
      *
      * { viewType : "XML" }
      *
      * ```
      *  The targets look like this:
      * ```javascript
      *
      * {
      *     xmlTarget : {
      *         ...
      *     },
      *     jsTarget : {
      *         viewType : "JS"
      *         ...
      *     },
      *     componentTarget: {
      *         type: "Component",
      *         name: "subComponent",
      *         id: "mySubComponent",
      *         options: {
      *             // the Component configuration:
      *             manifest: true
      *             ...
      *         },
      *         controlId: "myRootView",
      *         controlAggregation: "content"
      *     }
      * }
      * ```
      *  Then the effective config will look like this:
      * ```javascript
      *
      * {
      *     xmlTarget : {
      *         viewType : "XML"
      *         ...
      *     },
      *     jsTarget : {
      *         viewType : "JS"
      *         ...
      *     },
      * 	   componentTarget: {
      *         type: "Component",
      *         name: "subComponent",
      *         id: "mySubComponent",
      *         options: {
      *             // the Component configuration:
      *             manifest: true
      *             ...
      *         },
      *         controlId: "myRootView",
      *         controlAggregation: "content"
      *     }
      * }
      * ```
      *
      *
      * Since the xmlTarget does not specify its viewType, XML is taken from the config object. The jsTarget
      * is specifying it, so the viewType will be JS.
      */
    oConfig: `1`
    ) = this()
    def this(
      /**
      * may contain many Route configurations as {@link sap.ui.core.routing.Route#constructor}.
      *  Each of the routes contained in the array/object will be added to the router.
      *
      *
      * One way of defining routes is an array:
      * ```javascript
      *
      * [
      *     //Will create a route called 'firstRouter' you can later use this name in navTo to navigate to this route
      *     {
      *         name: "firstRoute"
      *         pattern : "usefulPattern"
      *     },
      *     //Will create a route called 'anotherRoute'
      *     {
      *         name: "anotherRoute"
      *         pattern : "anotherPattern"
      *     },
      *     //Will create a route for a nested component with the prefix 'componentPrefix'
      *     {
      *         pattern: "componentPattern",
      *         name: "componentRoute",
      *         target: [
      *              {
      *                  name: "subComponent",
      *                  prefix: "componentPrefix"
      *              }
      *         ]
      *     }
      * ]
      * ```
      *
      *
      * The alternative way of defining routes is an Object.
      *  If you choose this way, the name attribute is the name of the property.
      * ```javascript
      *
      * {
      *     //Will create a route called 'firstRouter' you can later use this name in navTo to navigate to this route
      *     firstRoute : {
      *         pattern : "usefulPattern"
      *     },
      *     //Will create a route called 'anotherRoute'
      *     anotherRoute : {
      *         pattern : "anotherPattern"
      *     },
      *     //Will create a route for a nested component with the prefix 'componentPrefix'
      *     componentRoute{
      *         pattern: "componentPattern",
      *         target: [
      *              {
      *                  name: "subComponent",
      *                  prefix: "componentPrefix"
      *              }
      *         ]
      *     }
      * }
      * ```
      *  The values that may be provided are the same as in {@link sap.ui.core.routing.Route#constructor}
      */
    oRoutes: Unit,
      /**
      * Default values for route configuration - also takes the same parameters as {@link sap.ui.core.routing.Target#constructor}.
      *  This config will be used for routes and for targets, used in the router
      *  Eg: if the config object specifies :
      * ```javascript
      *
      *
      * { viewType : "XML" }
      *
      * ```
      *  The targets look like this:
      * ```javascript
      *
      * {
      *     xmlTarget : {
      *         ...
      *     },
      *     jsTarget : {
      *         viewType : "JS"
      *         ...
      *     },
      *     componentTarget: {
      *         type: "Component",
      *         name: "subComponent",
      *         id: "mySubComponent",
      *         options: {
      *             // the Component configuration:
      *             manifest: true
      *             ...
      *         },
      *         controlId: "myRootView",
      *         controlAggregation: "content"
      *     }
      * }
      * ```
      *  Then the effective config will look like this:
      * ```javascript
      *
      * {
      *     xmlTarget : {
      *         viewType : "XML"
      *         ...
      *     },
      *     jsTarget : {
      *         viewType : "JS"
      *         ...
      *     },
      * 	   componentTarget: {
      *         type: "Component",
      *         name: "subComponent",
      *         id: "mySubComponent",
      *         options: {
      *             // the Component configuration:
      *             manifest: true
      *             ...
      *         },
      *         controlId: "myRootView",
      *         controlAggregation: "content"
      *     }
      * }
      * ```
      *
      *
      * Since the xmlTarget does not specify its viewType, XML is taken from the config object. The jsTarget
      * is specifying it, so the viewType will be JS.
      */
    oConfig: `1`
    ) = this()
    def this(
      /**
      * may contain many Route configurations as {@link sap.ui.core.routing.Route#constructor}.
      *  Each of the routes contained in the array/object will be added to the router.
      *
      *
      * One way of defining routes is an array:
      * ```javascript
      *
      * [
      *     //Will create a route called 'firstRouter' you can later use this name in navTo to navigate to this route
      *     {
      *         name: "firstRoute"
      *         pattern : "usefulPattern"
      *     },
      *     //Will create a route called 'anotherRoute'
      *     {
      *         name: "anotherRoute"
      *         pattern : "anotherPattern"
      *     },
      *     //Will create a route for a nested component with the prefix 'componentPrefix'
      *     {
      *         pattern: "componentPattern",
      *         name: "componentRoute",
      *         target: [
      *              {
      *                  name: "subComponent",
      *                  prefix: "componentPrefix"
      *              }
      *         ]
      *     }
      * ]
      * ```
      *
      *
      * The alternative way of defining routes is an Object.
      *  If you choose this way, the name attribute is the name of the property.
      * ```javascript
      *
      * {
      *     //Will create a route called 'firstRouter' you can later use this name in navTo to navigate to this route
      *     firstRoute : {
      *         pattern : "usefulPattern"
      *     },
      *     //Will create a route called 'anotherRoute'
      *     anotherRoute : {
      *         pattern : "anotherPattern"
      *     },
      *     //Will create a route for a nested component with the prefix 'componentPrefix'
      *     componentRoute{
      *         pattern: "componentPattern",
      *         target: [
      *              {
      *                  name: "subComponent",
      *                  prefix: "componentPrefix"
      *              }
      *         ]
      *     }
      * }
      * ```
      *  The values that may be provided are the same as in {@link sap.ui.core.routing.Route#constructor}
      */
    oRoutes: js.Array[js.Object],
      /**
      * Default values for route configuration - also takes the same parameters as {@link sap.ui.core.routing.Target#constructor}.
      *  This config will be used for routes and for targets, used in the router
      *  Eg: if the config object specifies :
      * ```javascript
      *
      *
      * { viewType : "XML" }
      *
      * ```
      *  The targets look like this:
      * ```javascript
      *
      * {
      *     xmlTarget : {
      *         ...
      *     },
      *     jsTarget : {
      *         viewType : "JS"
      *         ...
      *     },
      *     componentTarget: {
      *         type: "Component",
      *         name: "subComponent",
      *         id: "mySubComponent",
      *         options: {
      *             // the Component configuration:
      *             manifest: true
      *             ...
      *         },
      *         controlId: "myRootView",
      *         controlAggregation: "content"
      *     }
      * }
      * ```
      *  Then the effective config will look like this:
      * ```javascript
      *
      * {
      *     xmlTarget : {
      *         viewType : "XML"
      *         ...
      *     },
      *     jsTarget : {
      *         viewType : "JS"
      *         ...
      *     },
      * 	   componentTarget: {
      *         type: "Component",
      *         name: "subComponent",
      *         id: "mySubComponent",
      *         options: {
      *             // the Component configuration:
      *             manifest: true
      *             ...
      *         },
      *         controlId: "myRootView",
      *         controlAggregation: "content"
      *     }
      * }
      * ```
      *
      *
      * Since the xmlTarget does not specify its viewType, XML is taken from the config object. The jsTarget
      * is specifying it, so the viewType will be JS.
      */
    oConfig: Unit,
      /**
      * the Component of all the views that will be created by this Router,
      *  will get forwarded to the {@link sap.ui.core.routing.Views#constructor}.
      *  If you are using the componentMetadata to define your routes you should skip this parameter.
      */
    oOwner: typings.openui5.sapUiCoreUicomponentMod.default
    ) = this()
    def this(
      /**
      * may contain many Route configurations as {@link sap.ui.core.routing.Route#constructor}.
      *  Each of the routes contained in the array/object will be added to the router.
      *
      *
      * One way of defining routes is an array:
      * ```javascript
      *
      * [
      *     //Will create a route called 'firstRouter' you can later use this name in navTo to navigate to this route
      *     {
      *         name: "firstRoute"
      *         pattern : "usefulPattern"
      *     },
      *     //Will create a route called 'anotherRoute'
      *     {
      *         name: "anotherRoute"
      *         pattern : "anotherPattern"
      *     },
      *     //Will create a route for a nested component with the prefix 'componentPrefix'
      *     {
      *         pattern: "componentPattern",
      *         name: "componentRoute",
      *         target: [
      *              {
      *                  name: "subComponent",
      *                  prefix: "componentPrefix"
      *              }
      *         ]
      *     }
      * ]
      * ```
      *
      *
      * The alternative way of defining routes is an Object.
      *  If you choose this way, the name attribute is the name of the property.
      * ```javascript
      *
      * {
      *     //Will create a route called 'firstRouter' you can later use this name in navTo to navigate to this route
      *     firstRoute : {
      *         pattern : "usefulPattern"
      *     },
      *     //Will create a route called 'anotherRoute'
      *     anotherRoute : {
      *         pattern : "anotherPattern"
      *     },
      *     //Will create a route for a nested component with the prefix 'componentPrefix'
      *     componentRoute{
      *         pattern: "componentPattern",
      *         target: [
      *              {
      *                  name: "subComponent",
      *                  prefix: "componentPrefix"
      *              }
      *         ]
      *     }
      * }
      * ```
      *  The values that may be provided are the same as in {@link sap.ui.core.routing.Route#constructor}
      */
    oRoutes: js.Array[js.Object],
      /**
      * Default values for route configuration - also takes the same parameters as {@link sap.ui.core.routing.Target#constructor}.
      *  This config will be used for routes and for targets, used in the router
      *  Eg: if the config object specifies :
      * ```javascript
      *
      *
      * { viewType : "XML" }
      *
      * ```
      *  The targets look like this:
      * ```javascript
      *
      * {
      *     xmlTarget : {
      *         ...
      *     },
      *     jsTarget : {
      *         viewType : "JS"
      *         ...
      *     },
      *     componentTarget: {
      *         type: "Component",
      *         name: "subComponent",
      *         id: "mySubComponent",
      *         options: {
      *             // the Component configuration:
      *             manifest: true
      *             ...
      *         },
      *         controlId: "myRootView",
      *         controlAggregation: "content"
      *     }
      * }
      * ```
      *  Then the effective config will look like this:
      * ```javascript
      *
      * {
      *     xmlTarget : {
      *         viewType : "XML"
      *         ...
      *     },
      *     jsTarget : {
      *         viewType : "JS"
      *         ...
      *     },
      * 	   componentTarget: {
      *         type: "Component",
      *         name: "subComponent",
      *         id: "mySubComponent",
      *         options: {
      *             // the Component configuration:
      *             manifest: true
      *             ...
      *         },
      *         controlId: "myRootView",
      *         controlAggregation: "content"
      *     }
      * }
      * ```
      *
      *
      * Since the xmlTarget does not specify its viewType, XML is taken from the config object. The jsTarget
      * is specifying it, so the viewType will be JS.
      */
    oConfig: `1`,
      /**
      * the Component of all the views that will be created by this Router,
      *  will get forwarded to the {@link sap.ui.core.routing.Views#constructor}.
      *  If you are using the componentMetadata to define your routes you should skip this parameter.
      */
    oOwner: typings.openui5.sapUiCoreUicomponentMod.default
    ) = this()
    def this(
      /**
      * may contain many Route configurations as {@link sap.ui.core.routing.Route#constructor}.
      *  Each of the routes contained in the array/object will be added to the router.
      *
      *
      * One way of defining routes is an array:
      * ```javascript
      *
      * [
      *     //Will create a route called 'firstRouter' you can later use this name in navTo to navigate to this route
      *     {
      *         name: "firstRoute"
      *         pattern : "usefulPattern"
      *     },
      *     //Will create a route called 'anotherRoute'
      *     {
      *         name: "anotherRoute"
      *         pattern : "anotherPattern"
      *     },
      *     //Will create a route for a nested component with the prefix 'componentPrefix'
      *     {
      *         pattern: "componentPattern",
      *         name: "componentRoute",
      *         target: [
      *              {
      *                  name: "subComponent",
      *                  prefix: "componentPrefix"
      *              }
      *         ]
      *     }
      * ]
      * ```
      *
      *
      * The alternative way of defining routes is an Object.
      *  If you choose this way, the name attribute is the name of the property.
      * ```javascript
      *
      * {
      *     //Will create a route called 'firstRouter' you can later use this name in navTo to navigate to this route
      *     firstRoute : {
      *         pattern : "usefulPattern"
      *     },
      *     //Will create a route called 'anotherRoute'
      *     anotherRoute : {
      *         pattern : "anotherPattern"
      *     },
      *     //Will create a route for a nested component with the prefix 'componentPrefix'
      *     componentRoute{
      *         pattern: "componentPattern",
      *         target: [
      *              {
      *                  name: "subComponent",
      *                  prefix: "componentPrefix"
      *              }
      *         ]
      *     }
      * }
      * ```
      *  The values that may be provided are the same as in {@link sap.ui.core.routing.Route#constructor}
      */
    oRoutes: js.Object,
      /**
      * Default values for route configuration - also takes the same parameters as {@link sap.ui.core.routing.Target#constructor}.
      *  This config will be used for routes and for targets, used in the router
      *  Eg: if the config object specifies :
      * ```javascript
      *
      *
      * { viewType : "XML" }
      *
      * ```
      *  The targets look like this:
      * ```javascript
      *
      * {
      *     xmlTarget : {
      *         ...
      *     },
      *     jsTarget : {
      *         viewType : "JS"
      *         ...
      *     },
      *     componentTarget: {
      *         type: "Component",
      *         name: "subComponent",
      *         id: "mySubComponent",
      *         options: {
      *             // the Component configuration:
      *             manifest: true
      *             ...
      *         },
      *         controlId: "myRootView",
      *         controlAggregation: "content"
      *     }
      * }
      * ```
      *  Then the effective config will look like this:
      * ```javascript
      *
      * {
      *     xmlTarget : {
      *         viewType : "XML"
      *         ...
      *     },
      *     jsTarget : {
      *         viewType : "JS"
      *         ...
      *     },
      * 	   componentTarget: {
      *         type: "Component",
      *         name: "subComponent",
      *         id: "mySubComponent",
      *         options: {
      *             // the Component configuration:
      *             manifest: true
      *             ...
      *         },
      *         controlId: "myRootView",
      *         controlAggregation: "content"
      *     }
      * }
      * ```
      *
      *
      * Since the xmlTarget does not specify its viewType, XML is taken from the config object. The jsTarget
      * is specifying it, so the viewType will be JS.
      */
    oConfig: Unit,
      /**
      * the Component of all the views that will be created by this Router,
      *  will get forwarded to the {@link sap.ui.core.routing.Views#constructor}.
      *  If you are using the componentMetadata to define your routes you should skip this parameter.
      */
    oOwner: typings.openui5.sapUiCoreUicomponentMod.default
    ) = this()
    def this(
      /**
      * may contain many Route configurations as {@link sap.ui.core.routing.Route#constructor}.
      *  Each of the routes contained in the array/object will be added to the router.
      *
      *
      * One way of defining routes is an array:
      * ```javascript
      *
      * [
      *     //Will create a route called 'firstRouter' you can later use this name in navTo to navigate to this route
      *     {
      *         name: "firstRoute"
      *         pattern : "usefulPattern"
      *     },
      *     //Will create a route called 'anotherRoute'
      *     {
      *         name: "anotherRoute"
      *         pattern : "anotherPattern"
      *     },
      *     //Will create a route for a nested component with the prefix 'componentPrefix'
      *     {
      *         pattern: "componentPattern",
      *         name: "componentRoute",
      *         target: [
      *              {
      *                  name: "subComponent",
      *                  prefix: "componentPrefix"
      *              }
      *         ]
      *     }
      * ]
      * ```
      *
      *
      * The alternative way of defining routes is an Object.
      *  If you choose this way, the name attribute is the name of the property.
      * ```javascript
      *
      * {
      *     //Will create a route called 'firstRouter' you can later use this name in navTo to navigate to this route
      *     firstRoute : {
      *         pattern : "usefulPattern"
      *     },
      *     //Will create a route called 'anotherRoute'
      *     anotherRoute : {
      *         pattern : "anotherPattern"
      *     },
      *     //Will create a route for a nested component with the prefix 'componentPrefix'
      *     componentRoute{
      *         pattern: "componentPattern",
      *         target: [
      *              {
      *                  name: "subComponent",
      *                  prefix: "componentPrefix"
      *              }
      *         ]
      *     }
      * }
      * ```
      *  The values that may be provided are the same as in {@link sap.ui.core.routing.Route#constructor}
      */
    oRoutes: js.Object,
      /**
      * Default values for route configuration - also takes the same parameters as {@link sap.ui.core.routing.Target#constructor}.
      *  This config will be used for routes and for targets, used in the router
      *  Eg: if the config object specifies :
      * ```javascript
      *
      *
      * { viewType : "XML" }
      *
      * ```
      *  The targets look like this:
      * ```javascript
      *
      * {
      *     xmlTarget : {
      *         ...
      *     },
      *     jsTarget : {
      *         viewType : "JS"
      *         ...
      *     },
      *     componentTarget: {
      *         type: "Component",
      *         name: "subComponent",
      *         id: "mySubComponent",
      *         options: {
      *             // the Component configuration:
      *             manifest: true
      *             ...
      *         },
      *         controlId: "myRootView",
      *         controlAggregation: "content"
      *     }
      * }
      * ```
      *  Then the effective config will look like this:
      * ```javascript
      *
      * {
      *     xmlTarget : {
      *         viewType : "XML"
      *         ...
      *     },
      *     jsTarget : {
      *         viewType : "JS"
      *         ...
      *     },
      * 	   componentTarget: {
      *         type: "Component",
      *         name: "subComponent",
      *         id: "mySubComponent",
      *         options: {
      *             // the Component configuration:
      *             manifest: true
      *             ...
      *         },
      *         controlId: "myRootView",
      *         controlAggregation: "content"
      *     }
      * }
      * ```
      *
      *
      * Since the xmlTarget does not specify its viewType, XML is taken from the config object. The jsTarget
      * is specifying it, so the viewType will be JS.
      */
    oConfig: `1`,
      /**
      * the Component of all the views that will be created by this Router,
      *  will get forwarded to the {@link sap.ui.core.routing.Views#constructor}.
      *  If you are using the componentMetadata to define your routes you should skip this parameter.
      */
    oOwner: typings.openui5.sapUiCoreUicomponentMod.default
    ) = this()
    def this(
      /**
      * may contain many Route configurations as {@link sap.ui.core.routing.Route#constructor}.
      *  Each of the routes contained in the array/object will be added to the router.
      *
      *
      * One way of defining routes is an array:
      * ```javascript
      *
      * [
      *     //Will create a route called 'firstRouter' you can later use this name in navTo to navigate to this route
      *     {
      *         name: "firstRoute"
      *         pattern : "usefulPattern"
      *     },
      *     //Will create a route called 'anotherRoute'
      *     {
      *         name: "anotherRoute"
      *         pattern : "anotherPattern"
      *     },
      *     //Will create a route for a nested component with the prefix 'componentPrefix'
      *     {
      *         pattern: "componentPattern",
      *         name: "componentRoute",
      *         target: [
      *              {
      *                  name: "subComponent",
      *                  prefix: "componentPrefix"
      *              }
      *         ]
      *     }
      * ]
      * ```
      *
      *
      * The alternative way of defining routes is an Object.
      *  If you choose this way, the name attribute is the name of the property.
      * ```javascript
      *
      * {
      *     //Will create a route called 'firstRouter' you can later use this name in navTo to navigate to this route
      *     firstRoute : {
      *         pattern : "usefulPattern"
      *     },
      *     //Will create a route called 'anotherRoute'
      *     anotherRoute : {
      *         pattern : "anotherPattern"
      *     },
      *     //Will create a route for a nested component with the prefix 'componentPrefix'
      *     componentRoute{
      *         pattern: "componentPattern",
      *         target: [
      *              {
      *                  name: "subComponent",
      *                  prefix: "componentPrefix"
      *              }
      *         ]
      *     }
      * }
      * ```
      *  The values that may be provided are the same as in {@link sap.ui.core.routing.Route#constructor}
      */
    oRoutes: Unit,
      /**
      * Default values for route configuration - also takes the same parameters as {@link sap.ui.core.routing.Target#constructor}.
      *  This config will be used for routes and for targets, used in the router
      *  Eg: if the config object specifies :
      * ```javascript
      *
      *
      * { viewType : "XML" }
      *
      * ```
      *  The targets look like this:
      * ```javascript
      *
      * {
      *     xmlTarget : {
      *         ...
      *     },
      *     jsTarget : {
      *         viewType : "JS"
      *         ...
      *     },
      *     componentTarget: {
      *         type: "Component",
      *         name: "subComponent",
      *         id: "mySubComponent",
      *         options: {
      *             // the Component configuration:
      *             manifest: true
      *             ...
      *         },
      *         controlId: "myRootView",
      *         controlAggregation: "content"
      *     }
      * }
      * ```
      *  Then the effective config will look like this:
      * ```javascript
      *
      * {
      *     xmlTarget : {
      *         viewType : "XML"
      *         ...
      *     },
      *     jsTarget : {
      *         viewType : "JS"
      *         ...
      *     },
      * 	   componentTarget: {
      *         type: "Component",
      *         name: "subComponent",
      *         id: "mySubComponent",
      *         options: {
      *             // the Component configuration:
      *             manifest: true
      *             ...
      *         },
      *         controlId: "myRootView",
      *         controlAggregation: "content"
      *     }
      * }
      * ```
      *
      *
      * Since the xmlTarget does not specify its viewType, XML is taken from the config object. The jsTarget
      * is specifying it, so the viewType will be JS.
      */
    oConfig: Unit,
      /**
      * the Component of all the views that will be created by this Router,
      *  will get forwarded to the {@link sap.ui.core.routing.Views#constructor}.
      *  If you are using the componentMetadata to define your routes you should skip this parameter.
      */
    oOwner: typings.openui5.sapUiCoreUicomponentMod.default
    ) = this()
    def this(
      /**
      * may contain many Route configurations as {@link sap.ui.core.routing.Route#constructor}.
      *  Each of the routes contained in the array/object will be added to the router.
      *
      *
      * One way of defining routes is an array:
      * ```javascript
      *
      * [
      *     //Will create a route called 'firstRouter' you can later use this name in navTo to navigate to this route
      *     {
      *         name: "firstRoute"
      *         pattern : "usefulPattern"
      *     },
      *     //Will create a route called 'anotherRoute'
      *     {
      *         name: "anotherRoute"
      *         pattern : "anotherPattern"
      *     },
      *     //Will create a route for a nested component with the prefix 'componentPrefix'
      *     {
      *         pattern: "componentPattern",
      *         name: "componentRoute",
      *         target: [
      *              {
      *                  name: "subComponent",
      *                  prefix: "componentPrefix"
      *              }
      *         ]
      *     }
      * ]
      * ```
      *
      *
      * The alternative way of defining routes is an Object.
      *  If you choose this way, the name attribute is the name of the property.
      * ```javascript
      *
      * {
      *     //Will create a route called 'firstRouter' you can later use this name in navTo to navigate to this route
      *     firstRoute : {
      *         pattern : "usefulPattern"
      *     },
      *     //Will create a route called 'anotherRoute'
      *     anotherRoute : {
      *         pattern : "anotherPattern"
      *     },
      *     //Will create a route for a nested component with the prefix 'componentPrefix'
      *     componentRoute{
      *         pattern: "componentPattern",
      *         target: [
      *              {
      *                  name: "subComponent",
      *                  prefix: "componentPrefix"
      *              }
      *         ]
      *     }
      * }
      * ```
      *  The values that may be provided are the same as in {@link sap.ui.core.routing.Route#constructor}
      */
    oRoutes: Unit,
      /**
      * Default values for route configuration - also takes the same parameters as {@link sap.ui.core.routing.Target#constructor}.
      *  This config will be used for routes and for targets, used in the router
      *  Eg: if the config object specifies :
      * ```javascript
      *
      *
      * { viewType : "XML" }
      *
      * ```
      *  The targets look like this:
      * ```javascript
      *
      * {
      *     xmlTarget : {
      *         ...
      *     },
      *     jsTarget : {
      *         viewType : "JS"
      *         ...
      *     },
      *     componentTarget: {
      *         type: "Component",
      *         name: "subComponent",
      *         id: "mySubComponent",
      *         options: {
      *             // the Component configuration:
      *             manifest: true
      *             ...
      *         },
      *         controlId: "myRootView",
      *         controlAggregation: "content"
      *     }
      * }
      * ```
      *  Then the effective config will look like this:
      * ```javascript
      *
      * {
      *     xmlTarget : {
      *         viewType : "XML"
      *         ...
      *     },
      *     jsTarget : {
      *         viewType : "JS"
      *         ...
      *     },
      * 	   componentTarget: {
      *         type: "Component",
      *         name: "subComponent",
      *         id: "mySubComponent",
      *         options: {
      *             // the Component configuration:
      *             manifest: true
      *             ...
      *         },
      *         controlId: "myRootView",
      *         controlAggregation: "content"
      *     }
      * }
      * ```
      *
      *
      * Since the xmlTarget does not specify its viewType, XML is taken from the config object. The jsTarget
      * is specifying it, so the viewType will be JS.
      */
    oConfig: `1`,
      /**
      * the Component of all the views that will be created by this Router,
      *  will get forwarded to the {@link sap.ui.core.routing.Views#constructor}.
      *  If you are using the componentMetadata to define your routes you should skip this parameter.
      */
    oOwner: typings.openui5.sapUiCoreUicomponentMod.default
    ) = this()
    def this(
      /**
      * may contain many Route configurations as {@link sap.ui.core.routing.Route#constructor}.
      *  Each of the routes contained in the array/object will be added to the router.
      *
      *
      * One way of defining routes is an array:
      * ```javascript
      *
      * [
      *     //Will create a route called 'firstRouter' you can later use this name in navTo to navigate to this route
      *     {
      *         name: "firstRoute"
      *         pattern : "usefulPattern"
      *     },
      *     //Will create a route called 'anotherRoute'
      *     {
      *         name: "anotherRoute"
      *         pattern : "anotherPattern"
      *     },
      *     //Will create a route for a nested component with the prefix 'componentPrefix'
      *     {
      *         pattern: "componentPattern",
      *         name: "componentRoute",
      *         target: [
      *              {
      *                  name: "subComponent",
      *                  prefix: "componentPrefix"
      *              }
      *         ]
      *     }
      * ]
      * ```
      *
      *
      * The alternative way of defining routes is an Object.
      *  If you choose this way, the name attribute is the name of the property.
      * ```javascript
      *
      * {
      *     //Will create a route called 'firstRouter' you can later use this name in navTo to navigate to this route
      *     firstRoute : {
      *         pattern : "usefulPattern"
      *     },
      *     //Will create a route called 'anotherRoute'
      *     anotherRoute : {
      *         pattern : "anotherPattern"
      *     },
      *     //Will create a route for a nested component with the prefix 'componentPrefix'
      *     componentRoute{
      *         pattern: "componentPattern",
      *         target: [
      *              {
      *                  name: "subComponent",
      *                  prefix: "componentPrefix"
      *              }
      *         ]
      *     }
      * }
      * ```
      *  The values that may be provided are the same as in {@link sap.ui.core.routing.Route#constructor}
      */
    oRoutes: js.Array[js.Object],
      /**
      * Default values for route configuration - also takes the same parameters as {@link sap.ui.core.routing.Target#constructor}.
      *  This config will be used for routes and for targets, used in the router
      *  Eg: if the config object specifies :
      * ```javascript
      *
      *
      * { viewType : "XML" }
      *
      * ```
      *  The targets look like this:
      * ```javascript
      *
      * {
      *     xmlTarget : {
      *         ...
      *     },
      *     jsTarget : {
      *         viewType : "JS"
      *         ...
      *     },
      *     componentTarget: {
      *         type: "Component",
      *         name: "subComponent",
      *         id: "mySubComponent",
      *         options: {
      *             // the Component configuration:
      *             manifest: true
      *             ...
      *         },
      *         controlId: "myRootView",
      *         controlAggregation: "content"
      *     }
      * }
      * ```
      *  Then the effective config will look like this:
      * ```javascript
      *
      * {
      *     xmlTarget : {
      *         viewType : "XML"
      *         ...
      *     },
      *     jsTarget : {
      *         viewType : "JS"
      *         ...
      *     },
      * 	   componentTarget: {
      *         type: "Component",
      *         name: "subComponent",
      *         id: "mySubComponent",
      *         options: {
      *             // the Component configuration:
      *             manifest: true
      *             ...
      *         },
      *         controlId: "myRootView",
      *         controlAggregation: "content"
      *     }
      * }
      * ```
      *
      *
      * Since the xmlTarget does not specify its viewType, XML is taken from the config object. The jsTarget
      * is specifying it, so the viewType will be JS.
      */
    oConfig: Unit,
      /**
      * the Component of all the views that will be created by this Router,
      *  will get forwarded to the {@link sap.ui.core.routing.Views#constructor}.
      *  If you are using the componentMetadata to define your routes you should skip this parameter.
      */
    oOwner: Unit,
      /**
      * the target configuration, see {@link sap.m.routing.Targets#constructor} documentation (the options object).
      *  You should use Targets to create and display views. The route should only contain routing relevant properties.
      *  **Example:**
      * ```javascript
      *
      *
      *     new Router(
      *     // Routes
      *     [
      *         {
      *             // no view creation related properties are in the route
      *             name: "startRoute",
      *             //no hash
      *             pattern: "",
      *             // you can find this target in the targetConfig
      *             target: "welcome"
      *         }
      *     ],
      *     // Default values shared by routes and Targets
      *     {
      *         path: "my.application.namespace",
      *         viewType: "XML"
      *     },
      *     // You should only use this constructor when you are not using a router with a component.
      *     // Please use the metadata of a component to define your routes and targets.
      *     // The documentation can be found here: {@link sap.ui.core.UIComponent.extend}.
      *     null,
      *     // Target config
      *     {
      *          //same name as in the route called 'startRoute'
      *          welcome: {
      *              // All properties for creating and placing a view go here or in the config
      *              type: "View",
      *              name: "Welcome",
      *              controlId: "app",
      *              controlAggregation: "pages"
      *          }
      *     })
      *
      * ```
      */
    oTargetsConfig: js.Object
    ) = this()
    def this(
      /**
      * may contain many Route configurations as {@link sap.ui.core.routing.Route#constructor}.
      *  Each of the routes contained in the array/object will be added to the router.
      *
      *
      * One way of defining routes is an array:
      * ```javascript
      *
      * [
      *     //Will create a route called 'firstRouter' you can later use this name in navTo to navigate to this route
      *     {
      *         name: "firstRoute"
      *         pattern : "usefulPattern"
      *     },
      *     //Will create a route called 'anotherRoute'
      *     {
      *         name: "anotherRoute"
      *         pattern : "anotherPattern"
      *     },
      *     //Will create a route for a nested component with the prefix 'componentPrefix'
      *     {
      *         pattern: "componentPattern",
      *         name: "componentRoute",
      *         target: [
      *              {
      *                  name: "subComponent",
      *                  prefix: "componentPrefix"
      *              }
      *         ]
      *     }
      * ]
      * ```
      *
      *
      * The alternative way of defining routes is an Object.
      *  If you choose this way, the name attribute is the name of the property.
      * ```javascript
      *
      * {
      *     //Will create a route called 'firstRouter' you can later use this name in navTo to navigate to this route
      *     firstRoute : {
      *         pattern : "usefulPattern"
      *     },
      *     //Will create a route called 'anotherRoute'
      *     anotherRoute : {
      *         pattern : "anotherPattern"
      *     },
      *     //Will create a route for a nested component with the prefix 'componentPrefix'
      *     componentRoute{
      *         pattern: "componentPattern",
      *         target: [
      *              {
      *                  name: "subComponent",
      *                  prefix: "componentPrefix"
      *              }
      *         ]
      *     }
      * }
      * ```
      *  The values that may be provided are the same as in {@link sap.ui.core.routing.Route#constructor}
      */
    oRoutes: js.Array[js.Object],
      /**
      * Default values for route configuration - also takes the same parameters as {@link sap.ui.core.routing.Target#constructor}.
      *  This config will be used for routes and for targets, used in the router
      *  Eg: if the config object specifies :
      * ```javascript
      *
      *
      * { viewType : "XML" }
      *
      * ```
      *  The targets look like this:
      * ```javascript
      *
      * {
      *     xmlTarget : {
      *         ...
      *     },
      *     jsTarget : {
      *         viewType : "JS"
      *         ...
      *     },
      *     componentTarget: {
      *         type: "Component",
      *         name: "subComponent",
      *         id: "mySubComponent",
      *         options: {
      *             // the Component configuration:
      *             manifest: true
      *             ...
      *         },
      *         controlId: "myRootView",
      *         controlAggregation: "content"
      *     }
      * }
      * ```
      *  Then the effective config will look like this:
      * ```javascript
      *
      * {
      *     xmlTarget : {
      *         viewType : "XML"
      *         ...
      *     },
      *     jsTarget : {
      *         viewType : "JS"
      *         ...
      *     },
      * 	   componentTarget: {
      *         type: "Component",
      *         name: "subComponent",
      *         id: "mySubComponent",
      *         options: {
      *             // the Component configuration:
      *             manifest: true
      *             ...
      *         },
      *         controlId: "myRootView",
      *         controlAggregation: "content"
      *     }
      * }
      * ```
      *
      *
      * Since the xmlTarget does not specify its viewType, XML is taken from the config object. The jsTarget
      * is specifying it, so the viewType will be JS.
      */
    oConfig: Unit,
      /**
      * the Component of all the views that will be created by this Router,
      *  will get forwarded to the {@link sap.ui.core.routing.Views#constructor}.
      *  If you are using the componentMetadata to define your routes you should skip this parameter.
      */
    oOwner: typings.openui5.sapUiCoreUicomponentMod.default,
      /**
      * the target configuration, see {@link sap.m.routing.Targets#constructor} documentation (the options object).
      *  You should use Targets to create and display views. The route should only contain routing relevant properties.
      *  **Example:**
      * ```javascript
      *
      *
      *     new Router(
      *     // Routes
      *     [
      *         {
      *             // no view creation related properties are in the route
      *             name: "startRoute",
      *             //no hash
      *             pattern: "",
      *             // you can find this target in the targetConfig
      *             target: "welcome"
      *         }
      *     ],
      *     // Default values shared by routes and Targets
      *     {
      *         path: "my.application.namespace",
      *         viewType: "XML"
      *     },
      *     // You should only use this constructor when you are not using a router with a component.
      *     // Please use the metadata of a component to define your routes and targets.
      *     // The documentation can be found here: {@link sap.ui.core.UIComponent.extend}.
      *     null,
      *     // Target config
      *     {
      *          //same name as in the route called 'startRoute'
      *          welcome: {
      *              // All properties for creating and placing a view go here or in the config
      *              type: "View",
      *              name: "Welcome",
      *              controlId: "app",
      *              controlAggregation: "pages"
      *          }
      *     })
      *
      * ```
      */
    oTargetsConfig: js.Object
    ) = this()
    def this(
      /**
      * may contain many Route configurations as {@link sap.ui.core.routing.Route#constructor}.
      *  Each of the routes contained in the array/object will be added to the router.
      *
      *
      * One way of defining routes is an array:
      * ```javascript
      *
      * [
      *     //Will create a route called 'firstRouter' you can later use this name in navTo to navigate to this route
      *     {
      *         name: "firstRoute"
      *         pattern : "usefulPattern"
      *     },
      *     //Will create a route called 'anotherRoute'
      *     {
      *         name: "anotherRoute"
      *         pattern : "anotherPattern"
      *     },
      *     //Will create a route for a nested component with the prefix 'componentPrefix'
      *     {
      *         pattern: "componentPattern",
      *         name: "componentRoute",
      *         target: [
      *              {
      *                  name: "subComponent",
      *                  prefix: "componentPrefix"
      *              }
      *         ]
      *     }
      * ]
      * ```
      *
      *
      * The alternative way of defining routes is an Object.
      *  If you choose this way, the name attribute is the name of the property.
      * ```javascript
      *
      * {
      *     //Will create a route called 'firstRouter' you can later use this name in navTo to navigate to this route
      *     firstRoute : {
      *         pattern : "usefulPattern"
      *     },
      *     //Will create a route called 'anotherRoute'
      *     anotherRoute : {
      *         pattern : "anotherPattern"
      *     },
      *     //Will create a route for a nested component with the prefix 'componentPrefix'
      *     componentRoute{
      *         pattern: "componentPattern",
      *         target: [
      *              {
      *                  name: "subComponent",
      *                  prefix: "componentPrefix"
      *              }
      *         ]
      *     }
      * }
      * ```
      *  The values that may be provided are the same as in {@link sap.ui.core.routing.Route#constructor}
      */
    oRoutes: js.Array[js.Object],
      /**
      * Default values for route configuration - also takes the same parameters as {@link sap.ui.core.routing.Target#constructor}.
      *  This config will be used for routes and for targets, used in the router
      *  Eg: if the config object specifies :
      * ```javascript
      *
      *
      * { viewType : "XML" }
      *
      * ```
      *  The targets look like this:
      * ```javascript
      *
      * {
      *     xmlTarget : {
      *         ...
      *     },
      *     jsTarget : {
      *         viewType : "JS"
      *         ...
      *     },
      *     componentTarget: {
      *         type: "Component",
      *         name: "subComponent",
      *         id: "mySubComponent",
      *         options: {
      *             // the Component configuration:
      *             manifest: true
      *             ...
      *         },
      *         controlId: "myRootView",
      *         controlAggregation: "content"
      *     }
      * }
      * ```
      *  Then the effective config will look like this:
      * ```javascript
      *
      * {
      *     xmlTarget : {
      *         viewType : "XML"
      *         ...
      *     },
      *     jsTarget : {
      *         viewType : "JS"
      *         ...
      *     },
      * 	   componentTarget: {
      *         type: "Component",
      *         name: "subComponent",
      *         id: "mySubComponent",
      *         options: {
      *             // the Component configuration:
      *             manifest: true
      *             ...
      *         },
      *         controlId: "myRootView",
      *         controlAggregation: "content"
      *     }
      * }
      * ```
      *
      *
      * Since the xmlTarget does not specify its viewType, XML is taken from the config object. The jsTarget
      * is specifying it, so the viewType will be JS.
      */
    oConfig: `1`,
      /**
      * the Component of all the views that will be created by this Router,
      *  will get forwarded to the {@link sap.ui.core.routing.Views#constructor}.
      *  If you are using the componentMetadata to define your routes you should skip this parameter.
      */
    oOwner: Unit,
      /**
      * the target configuration, see {@link sap.m.routing.Targets#constructor} documentation (the options object).
      *  You should use Targets to create and display views. The route should only contain routing relevant properties.
      *  **Example:**
      * ```javascript
      *
      *
      *     new Router(
      *     // Routes
      *     [
      *         {
      *             // no view creation related properties are in the route
      *             name: "startRoute",
      *             //no hash
      *             pattern: "",
      *             // you can find this target in the targetConfig
      *             target: "welcome"
      *         }
      *     ],
      *     // Default values shared by routes and Targets
      *     {
      *         path: "my.application.namespace",
      *         viewType: "XML"
      *     },
      *     // You should only use this constructor when you are not using a router with a component.
      *     // Please use the metadata of a component to define your routes and targets.
      *     // The documentation can be found here: {@link sap.ui.core.UIComponent.extend}.
      *     null,
      *     // Target config
      *     {
      *          //same name as in the route called 'startRoute'
      *          welcome: {
      *              // All properties for creating and placing a view go here or in the config
      *              type: "View",
      *              name: "Welcome",
      *              controlId: "app",
      *              controlAggregation: "pages"
      *          }
      *     })
      *
      * ```
      */
    oTargetsConfig: js.Object
    ) = this()
    def this(
      /**
      * may contain many Route configurations as {@link sap.ui.core.routing.Route#constructor}.
      *  Each of the routes contained in the array/object will be added to the router.
      *
      *
      * One way of defining routes is an array:
      * ```javascript
      *
      * [
      *     //Will create a route called 'firstRouter' you can later use this name in navTo to navigate to this route
      *     {
      *         name: "firstRoute"
      *         pattern : "usefulPattern"
      *     },
      *     //Will create a route called 'anotherRoute'
      *     {
      *         name: "anotherRoute"
      *         pattern : "anotherPattern"
      *     },
      *     //Will create a route for a nested component with the prefix 'componentPrefix'
      *     {
      *         pattern: "componentPattern",
      *         name: "componentRoute",
      *         target: [
      *              {
      *                  name: "subComponent",
      *                  prefix: "componentPrefix"
      *              }
      *         ]
      *     }
      * ]
      * ```
      *
      *
      * The alternative way of defining routes is an Object.
      *  If you choose this way, the name attribute is the name of the property.
      * ```javascript
      *
      * {
      *     //Will create a route called 'firstRouter' you can later use this name in navTo to navigate to this route
      *     firstRoute : {
      *         pattern : "usefulPattern"
      *     },
      *     //Will create a route called 'anotherRoute'
      *     anotherRoute : {
      *         pattern : "anotherPattern"
      *     },
      *     //Will create a route for a nested component with the prefix 'componentPrefix'
      *     componentRoute{
      *         pattern: "componentPattern",
      *         target: [
      *              {
      *                  name: "subComponent",
      *                  prefix: "componentPrefix"
      *              }
      *         ]
      *     }
      * }
      * ```
      *  The values that may be provided are the same as in {@link sap.ui.core.routing.Route#constructor}
      */
    oRoutes: js.Array[js.Object],
      /**
      * Default values for route configuration - also takes the same parameters as {@link sap.ui.core.routing.Target#constructor}.
      *  This config will be used for routes and for targets, used in the router
      *  Eg: if the config object specifies :
      * ```javascript
      *
      *
      * { viewType : "XML" }
      *
      * ```
      *  The targets look like this:
      * ```javascript
      *
      * {
      *     xmlTarget : {
      *         ...
      *     },
      *     jsTarget : {
      *         viewType : "JS"
      *         ...
      *     },
      *     componentTarget: {
      *         type: "Component",
      *         name: "subComponent",
      *         id: "mySubComponent",
      *         options: {
      *             // the Component configuration:
      *             manifest: true
      *             ...
      *         },
      *         controlId: "myRootView",
      *         controlAggregation: "content"
      *     }
      * }
      * ```
      *  Then the effective config will look like this:
      * ```javascript
      *
      * {
      *     xmlTarget : {
      *         viewType : "XML"
      *         ...
      *     },
      *     jsTarget : {
      *         viewType : "JS"
      *         ...
      *     },
      * 	   componentTarget: {
      *         type: "Component",
      *         name: "subComponent",
      *         id: "mySubComponent",
      *         options: {
      *             // the Component configuration:
      *             manifest: true
      *             ...
      *         },
      *         controlId: "myRootView",
      *         controlAggregation: "content"
      *     }
      * }
      * ```
      *
      *
      * Since the xmlTarget does not specify its viewType, XML is taken from the config object. The jsTarget
      * is specifying it, so the viewType will be JS.
      */
    oConfig: `1`,
      /**
      * the Component of all the views that will be created by this Router,
      *  will get forwarded to the {@link sap.ui.core.routing.Views#constructor}.
      *  If you are using the componentMetadata to define your routes you should skip this parameter.
      */
    oOwner: typings.openui5.sapUiCoreUicomponentMod.default,
      /**
      * the target configuration, see {@link sap.m.routing.Targets#constructor} documentation (the options object).
      *  You should use Targets to create and display views. The route should only contain routing relevant properties.
      *  **Example:**
      * ```javascript
      *
      *
      *     new Router(
      *     // Routes
      *     [
      *         {
      *             // no view creation related properties are in the route
      *             name: "startRoute",
      *             //no hash
      *             pattern: "",
      *             // you can find this target in the targetConfig
      *             target: "welcome"
      *         }
      *     ],
      *     // Default values shared by routes and Targets
      *     {
      *         path: "my.application.namespace",
      *         viewType: "XML"
      *     },
      *     // You should only use this constructor when you are not using a router with a component.
      *     // Please use the metadata of a component to define your routes and targets.
      *     // The documentation can be found here: {@link sap.ui.core.UIComponent.extend}.
      *     null,
      *     // Target config
      *     {
      *          //same name as in the route called 'startRoute'
      *          welcome: {
      *              // All properties for creating and placing a view go here or in the config
      *              type: "View",
      *              name: "Welcome",
      *              controlId: "app",
      *              controlAggregation: "pages"
      *          }
      *     })
      *
      * ```
      */
    oTargetsConfig: js.Object
    ) = this()
    def this(
      /**
      * may contain many Route configurations as {@link sap.ui.core.routing.Route#constructor}.
      *  Each of the routes contained in the array/object will be added to the router.
      *
      *
      * One way of defining routes is an array:
      * ```javascript
      *
      * [
      *     //Will create a route called 'firstRouter' you can later use this name in navTo to navigate to this route
      *     {
      *         name: "firstRoute"
      *         pattern : "usefulPattern"
      *     },
      *     //Will create a route called 'anotherRoute'
      *     {
      *         name: "anotherRoute"
      *         pattern : "anotherPattern"
      *     },
      *     //Will create a route for a nested component with the prefix 'componentPrefix'
      *     {
      *         pattern: "componentPattern",
      *         name: "componentRoute",
      *         target: [
      *              {
      *                  name: "subComponent",
      *                  prefix: "componentPrefix"
      *              }
      *         ]
      *     }
      * ]
      * ```
      *
      *
      * The alternative way of defining routes is an Object.
      *  If you choose this way, the name attribute is the name of the property.
      * ```javascript
      *
      * {
      *     //Will create a route called 'firstRouter' you can later use this name in navTo to navigate to this route
      *     firstRoute : {
      *         pattern : "usefulPattern"
      *     },
      *     //Will create a route called 'anotherRoute'
      *     anotherRoute : {
      *         pattern : "anotherPattern"
      *     },
      *     //Will create a route for a nested component with the prefix 'componentPrefix'
      *     componentRoute{
      *         pattern: "componentPattern",
      *         target: [
      *              {
      *                  name: "subComponent",
      *                  prefix: "componentPrefix"
      *              }
      *         ]
      *     }
      * }
      * ```
      *  The values that may be provided are the same as in {@link sap.ui.core.routing.Route#constructor}
      */
    oRoutes: js.Object,
      /**
      * Default values for route configuration - also takes the same parameters as {@link sap.ui.core.routing.Target#constructor}.
      *  This config will be used for routes and for targets, used in the router
      *  Eg: if the config object specifies :
      * ```javascript
      *
      *
      * { viewType : "XML" }
      *
      * ```
      *  The targets look like this:
      * ```javascript
      *
      * {
      *     xmlTarget : {
      *         ...
      *     },
      *     jsTarget : {
      *         viewType : "JS"
      *         ...
      *     },
      *     componentTarget: {
      *         type: "Component",
      *         name: "subComponent",
      *         id: "mySubComponent",
      *         options: {
      *             // the Component configuration:
      *             manifest: true
      *             ...
      *         },
      *         controlId: "myRootView",
      *         controlAggregation: "content"
      *     }
      * }
      * ```
      *  Then the effective config will look like this:
      * ```javascript
      *
      * {
      *     xmlTarget : {
      *         viewType : "XML"
      *         ...
      *     },
      *     jsTarget : {
      *         viewType : "JS"
      *         ...
      *     },
      * 	   componentTarget: {
      *         type: "Component",
      *         name: "subComponent",
      *         id: "mySubComponent",
      *         options: {
      *             // the Component configuration:
      *             manifest: true
      *             ...
      *         },
      *         controlId: "myRootView",
      *         controlAggregation: "content"
      *     }
      * }
      * ```
      *
      *
      * Since the xmlTarget does not specify its viewType, XML is taken from the config object. The jsTarget
      * is specifying it, so the viewType will be JS.
      */
    oConfig: Unit,
      /**
      * the Component of all the views that will be created by this Router,
      *  will get forwarded to the {@link sap.ui.core.routing.Views#constructor}.
      *  If you are using the componentMetadata to define your routes you should skip this parameter.
      */
    oOwner: Unit,
      /**
      * the target configuration, see {@link sap.m.routing.Targets#constructor} documentation (the options object).
      *  You should use Targets to create and display views. The route should only contain routing relevant properties.
      *  **Example:**
      * ```javascript
      *
      *
      *     new Router(
      *     // Routes
      *     [
      *         {
      *             // no view creation related properties are in the route
      *             name: "startRoute",
      *             //no hash
      *             pattern: "",
      *             // you can find this target in the targetConfig
      *             target: "welcome"
      *         }
      *     ],
      *     // Default values shared by routes and Targets
      *     {
      *         path: "my.application.namespace",
      *         viewType: "XML"
      *     },
      *     // You should only use this constructor when you are not using a router with a component.
      *     // Please use the metadata of a component to define your routes and targets.
      *     // The documentation can be found here: {@link sap.ui.core.UIComponent.extend}.
      *     null,
      *     // Target config
      *     {
      *          //same name as in the route called 'startRoute'
      *          welcome: {
      *              // All properties for creating and placing a view go here or in the config
      *              type: "View",
      *              name: "Welcome",
      *              controlId: "app",
      *              controlAggregation: "pages"
      *          }
      *     })
      *
      * ```
      */
    oTargetsConfig: js.Object
    ) = this()
    def this(
      /**
      * may contain many Route configurations as {@link sap.ui.core.routing.Route#constructor}.
      *  Each of the routes contained in the array/object will be added to the router.
      *
      *
      * One way of defining routes is an array:
      * ```javascript
      *
      * [
      *     //Will create a route called 'firstRouter' you can later use this name in navTo to navigate to this route
      *     {
      *         name: "firstRoute"
      *         pattern : "usefulPattern"
      *     },
      *     //Will create a route called 'anotherRoute'
      *     {
      *         name: "anotherRoute"
      *         pattern : "anotherPattern"
      *     },
      *     //Will create a route for a nested component with the prefix 'componentPrefix'
      *     {
      *         pattern: "componentPattern",
      *         name: "componentRoute",
      *         target: [
      *              {
      *                  name: "subComponent",
      *                  prefix: "componentPrefix"
      *              }
      *         ]
      *     }
      * ]
      * ```
      *
      *
      * The alternative way of defining routes is an Object.
      *  If you choose this way, the name attribute is the name of the property.
      * ```javascript
      *
      * {
      *     //Will create a route called 'firstRouter' you can later use this name in navTo to navigate to this route
      *     firstRoute : {
      *         pattern : "usefulPattern"
      *     },
      *     //Will create a route called 'anotherRoute'
      *     anotherRoute : {
      *         pattern : "anotherPattern"
      *     },
      *     //Will create a route for a nested component with the prefix 'componentPrefix'
      *     componentRoute{
      *         pattern: "componentPattern",
      *         target: [
      *              {
      *                  name: "subComponent",
      *                  prefix: "componentPrefix"
      *              }
      *         ]
      *     }
      * }
      * ```
      *  The values that may be provided are the same as in {@link sap.ui.core.routing.Route#constructor}
      */
    oRoutes: js.Object,
      /**
      * Default values for route configuration - also takes the same parameters as {@link sap.ui.core.routing.Target#constructor}.
      *  This config will be used for routes and for targets, used in the router
      *  Eg: if the config object specifies :
      * ```javascript
      *
      *
      * { viewType : "XML" }
      *
      * ```
      *  The targets look like this:
      * ```javascript
      *
      * {
      *     xmlTarget : {
      *         ...
      *     },
      *     jsTarget : {
      *         viewType : "JS"
      *         ...
      *     },
      *     componentTarget: {
      *         type: "Component",
      *         name: "subComponent",
      *         id: "mySubComponent",
      *         options: {
      *             // the Component configuration:
      *             manifest: true
      *             ...
      *         },
      *         controlId: "myRootView",
      *         controlAggregation: "content"
      *     }
      * }
      * ```
      *  Then the effective config will look like this:
      * ```javascript
      *
      * {
      *     xmlTarget : {
      *         viewType : "XML"
      *         ...
      *     },
      *     jsTarget : {
      *         viewType : "JS"
      *         ...
      *     },
      * 	   componentTarget: {
      *         type: "Component",
      *         name: "subComponent",
      *         id: "mySubComponent",
      *         options: {
      *             // the Component configuration:
      *             manifest: true
      *             ...
      *         },
      *         controlId: "myRootView",
      *         controlAggregation: "content"
      *     }
      * }
      * ```
      *
      *
      * Since the xmlTarget does not specify its viewType, XML is taken from the config object. The jsTarget
      * is specifying it, so the viewType will be JS.
      */
    oConfig: Unit,
      /**
      * the Component of all the views that will be created by this Router,
      *  will get forwarded to the {@link sap.ui.core.routing.Views#constructor}.
      *  If you are using the componentMetadata to define your routes you should skip this parameter.
      */
    oOwner: typings.openui5.sapUiCoreUicomponentMod.default,
      /**
      * the target configuration, see {@link sap.m.routing.Targets#constructor} documentation (the options object).
      *  You should use Targets to create and display views. The route should only contain routing relevant properties.
      *  **Example:**
      * ```javascript
      *
      *
      *     new Router(
      *     // Routes
      *     [
      *         {
      *             // no view creation related properties are in the route
      *             name: "startRoute",
      *             //no hash
      *             pattern: "",
      *             // you can find this target in the targetConfig
      *             target: "welcome"
      *         }
      *     ],
      *     // Default values shared by routes and Targets
      *     {
      *         path: "my.application.namespace",
      *         viewType: "XML"
      *     },
      *     // You should only use this constructor when you are not using a router with a component.
      *     // Please use the metadata of a component to define your routes and targets.
      *     // The documentation can be found here: {@link sap.ui.core.UIComponent.extend}.
      *     null,
      *     // Target config
      *     {
      *          //same name as in the route called 'startRoute'
      *          welcome: {
      *              // All properties for creating and placing a view go here or in the config
      *              type: "View",
      *              name: "Welcome",
      *              controlId: "app",
      *              controlAggregation: "pages"
      *          }
      *     })
      *
      * ```
      */
    oTargetsConfig: js.Object
    ) = this()
    def this(
      /**
      * may contain many Route configurations as {@link sap.ui.core.routing.Route#constructor}.
      *  Each of the routes contained in the array/object will be added to the router.
      *
      *
      * One way of defining routes is an array:
      * ```javascript
      *
      * [
      *     //Will create a route called 'firstRouter' you can later use this name in navTo to navigate to this route
      *     {
      *         name: "firstRoute"
      *         pattern : "usefulPattern"
      *     },
      *     //Will create a route called 'anotherRoute'
      *     {
      *         name: "anotherRoute"
      *         pattern : "anotherPattern"
      *     },
      *     //Will create a route for a nested component with the prefix 'componentPrefix'
      *     {
      *         pattern: "componentPattern",
      *         name: "componentRoute",
      *         target: [
      *              {
      *                  name: "subComponent",
      *                  prefix: "componentPrefix"
      *              }
      *         ]
      *     }
      * ]
      * ```
      *
      *
      * The alternative way of defining routes is an Object.
      *  If you choose this way, the name attribute is the name of the property.
      * ```javascript
      *
      * {
      *     //Will create a route called 'firstRouter' you can later use this name in navTo to navigate to this route
      *     firstRoute : {
      *         pattern : "usefulPattern"
      *     },
      *     //Will create a route called 'anotherRoute'
      *     anotherRoute : {
      *         pattern : "anotherPattern"
      *     },
      *     //Will create a route for a nested component with the prefix 'componentPrefix'
      *     componentRoute{
      *         pattern: "componentPattern",
      *         target: [
      *              {
      *                  name: "subComponent",
      *                  prefix: "componentPrefix"
      *              }
      *         ]
      *     }
      * }
      * ```
      *  The values that may be provided are the same as in {@link sap.ui.core.routing.Route#constructor}
      */
    oRoutes: js.Object,
      /**
      * Default values for route configuration - also takes the same parameters as {@link sap.ui.core.routing.Target#constructor}.
      *  This config will be used for routes and for targets, used in the router
      *  Eg: if the config object specifies :
      * ```javascript
      *
      *
      * { viewType : "XML" }
      *
      * ```
      *  The targets look like this:
      * ```javascript
      *
      * {
      *     xmlTarget : {
      *         ...
      *     },
      *     jsTarget : {
      *         viewType : "JS"
      *         ...
      *     },
      *     componentTarget: {
      *         type: "Component",
      *         name: "subComponent",
      *         id: "mySubComponent",
      *         options: {
      *             // the Component configuration:
      *             manifest: true
      *             ...
      *         },
      *         controlId: "myRootView",
      *         controlAggregation: "content"
      *     }
      * }
      * ```
      *  Then the effective config will look like this:
      * ```javascript
      *
      * {
      *     xmlTarget : {
      *         viewType : "XML"
      *         ...
      *     },
      *     jsTarget : {
      *         viewType : "JS"
      *         ...
      *     },
      * 	   componentTarget: {
      *         type: "Component",
      *         name: "subComponent",
      *         id: "mySubComponent",
      *         options: {
      *             // the Component configuration:
      *             manifest: true
      *             ...
      *         },
      *         controlId: "myRootView",
      *         controlAggregation: "content"
      *     }
      * }
      * ```
      *
      *
      * Since the xmlTarget does not specify its viewType, XML is taken from the config object. The jsTarget
      * is specifying it, so the viewType will be JS.
      */
    oConfig: `1`,
      /**
      * the Component of all the views that will be created by this Router,
      *  will get forwarded to the {@link sap.ui.core.routing.Views#constructor}.
      *  If you are using the componentMetadata to define your routes you should skip this parameter.
      */
    oOwner: Unit,
      /**
      * the target configuration, see {@link sap.m.routing.Targets#constructor} documentation (the options object).
      *  You should use Targets to create and display views. The route should only contain routing relevant properties.
      *  **Example:**
      * ```javascript
      *
      *
      *     new Router(
      *     // Routes
      *     [
      *         {
      *             // no view creation related properties are in the route
      *             name: "startRoute",
      *             //no hash
      *             pattern: "",
      *             // you can find this target in the targetConfig
      *             target: "welcome"
      *         }
      *     ],
      *     // Default values shared by routes and Targets
      *     {
      *         path: "my.application.namespace",
      *         viewType: "XML"
      *     },
      *     // You should only use this constructor when you are not using a router with a component.
      *     // Please use the metadata of a component to define your routes and targets.
      *     // The documentation can be found here: {@link sap.ui.core.UIComponent.extend}.
      *     null,
      *     // Target config
      *     {
      *          //same name as in the route called 'startRoute'
      *          welcome: {
      *              // All properties for creating and placing a view go here or in the config
      *              type: "View",
      *              name: "Welcome",
      *              controlId: "app",
      *              controlAggregation: "pages"
      *          }
      *     })
      *
      * ```
      */
    oTargetsConfig: js.Object
    ) = this()
    def this(
      /**
      * may contain many Route configurations as {@link sap.ui.core.routing.Route#constructor}.
      *  Each of the routes contained in the array/object will be added to the router.
      *
      *
      * One way of defining routes is an array:
      * ```javascript
      *
      * [
      *     //Will create a route called 'firstRouter' you can later use this name in navTo to navigate to this route
      *     {
      *         name: "firstRoute"
      *         pattern : "usefulPattern"
      *     },
      *     //Will create a route called 'anotherRoute'
      *     {
      *         name: "anotherRoute"
      *         pattern : "anotherPattern"
      *     },
      *     //Will create a route for a nested component with the prefix 'componentPrefix'
      *     {
      *         pattern: "componentPattern",
      *         name: "componentRoute",
      *         target: [
      *              {
      *                  name: "subComponent",
      *                  prefix: "componentPrefix"
      *              }
      *         ]
      *     }
      * ]
      * ```
      *
      *
      * The alternative way of defining routes is an Object.
      *  If you choose this way, the name attribute is the name of the property.
      * ```javascript
      *
      * {
      *     //Will create a route called 'firstRouter' you can later use this name in navTo to navigate to this route
      *     firstRoute : {
      *         pattern : "usefulPattern"
      *     },
      *     //Will create a route called 'anotherRoute'
      *     anotherRoute : {
      *         pattern : "anotherPattern"
      *     },
      *     //Will create a route for a nested component with the prefix 'componentPrefix'
      *     componentRoute{
      *         pattern: "componentPattern",
      *         target: [
      *              {
      *                  name: "subComponent",
      *                  prefix: "componentPrefix"
      *              }
      *         ]
      *     }
      * }
      * ```
      *  The values that may be provided are the same as in {@link sap.ui.core.routing.Route#constructor}
      */
    oRoutes: js.Object,
      /**
      * Default values for route configuration - also takes the same parameters as {@link sap.ui.core.routing.Target#constructor}.
      *  This config will be used for routes and for targets, used in the router
      *  Eg: if the config object specifies :
      * ```javascript
      *
      *
      * { viewType : "XML" }
      *
      * ```
      *  The targets look like this:
      * ```javascript
      *
      * {
      *     xmlTarget : {
      *         ...
      *     },
      *     jsTarget : {
      *         viewType : "JS"
      *         ...
      *     },
      *     componentTarget: {
      *         type: "Component",
      *         name: "subComponent",
      *         id: "mySubComponent",
      *         options: {
      *             // the Component configuration:
      *             manifest: true
      *             ...
      *         },
      *         controlId: "myRootView",
      *         controlAggregation: "content"
      *     }
      * }
      * ```
      *  Then the effective config will look like this:
      * ```javascript
      *
      * {
      *     xmlTarget : {
      *         viewType : "XML"
      *         ...
      *     },
      *     jsTarget : {
      *         viewType : "JS"
      *         ...
      *     },
      * 	   componentTarget: {
      *         type: "Component",
      *         name: "subComponent",
      *         id: "mySubComponent",
      *         options: {
      *             // the Component configuration:
      *             manifest: true
      *             ...
      *         },
      *         controlId: "myRootView",
      *         controlAggregation: "content"
      *     }
      * }
      * ```
      *
      *
      * Since the xmlTarget does not specify its viewType, XML is taken from the config object. The jsTarget
      * is specifying it, so the viewType will be JS.
      */
    oConfig: `1`,
      /**
      * the Component of all the views that will be created by this Router,
      *  will get forwarded to the {@link sap.ui.core.routing.Views#constructor}.
      *  If you are using the componentMetadata to define your routes you should skip this parameter.
      */
    oOwner: typings.openui5.sapUiCoreUicomponentMod.default,
      /**
      * the target configuration, see {@link sap.m.routing.Targets#constructor} documentation (the options object).
      *  You should use Targets to create and display views. The route should only contain routing relevant properties.
      *  **Example:**
      * ```javascript
      *
      *
      *     new Router(
      *     // Routes
      *     [
      *         {
      *             // no view creation related properties are in the route
      *             name: "startRoute",
      *             //no hash
      *             pattern: "",
      *             // you can find this target in the targetConfig
      *             target: "welcome"
      *         }
      *     ],
      *     // Default values shared by routes and Targets
      *     {
      *         path: "my.application.namespace",
      *         viewType: "XML"
      *     },
      *     // You should only use this constructor when you are not using a router with a component.
      *     // Please use the metadata of a component to define your routes and targets.
      *     // The documentation can be found here: {@link sap.ui.core.UIComponent.extend}.
      *     null,
      *     // Target config
      *     {
      *          //same name as in the route called 'startRoute'
      *          welcome: {
      *              // All properties for creating and placing a view go here or in the config
      *              type: "View",
      *              name: "Welcome",
      *              controlId: "app",
      *              controlAggregation: "pages"
      *          }
      *     })
      *
      * ```
      */
    oTargetsConfig: js.Object
    ) = this()
    def this(
      /**
      * may contain many Route configurations as {@link sap.ui.core.routing.Route#constructor}.
      *  Each of the routes contained in the array/object will be added to the router.
      *
      *
      * One way of defining routes is an array:
      * ```javascript
      *
      * [
      *     //Will create a route called 'firstRouter' you can later use this name in navTo to navigate to this route
      *     {
      *         name: "firstRoute"
      *         pattern : "usefulPattern"
      *     },
      *     //Will create a route called 'anotherRoute'
      *     {
      *         name: "anotherRoute"
      *         pattern : "anotherPattern"
      *     },
      *     //Will create a route for a nested component with the prefix 'componentPrefix'
      *     {
      *         pattern: "componentPattern",
      *         name: "componentRoute",
      *         target: [
      *              {
      *                  name: "subComponent",
      *                  prefix: "componentPrefix"
      *              }
      *         ]
      *     }
      * ]
      * ```
      *
      *
      * The alternative way of defining routes is an Object.
      *  If you choose this way, the name attribute is the name of the property.
      * ```javascript
      *
      * {
      *     //Will create a route called 'firstRouter' you can later use this name in navTo to navigate to this route
      *     firstRoute : {
      *         pattern : "usefulPattern"
      *     },
      *     //Will create a route called 'anotherRoute'
      *     anotherRoute : {
      *         pattern : "anotherPattern"
      *     },
      *     //Will create a route for a nested component with the prefix 'componentPrefix'
      *     componentRoute{
      *         pattern: "componentPattern",
      *         target: [
      *              {
      *                  name: "subComponent",
      *                  prefix: "componentPrefix"
      *              }
      *         ]
      *     }
      * }
      * ```
      *  The values that may be provided are the same as in {@link sap.ui.core.routing.Route#constructor}
      */
    oRoutes: Unit,
      /**
      * Default values for route configuration - also takes the same parameters as {@link sap.ui.core.routing.Target#constructor}.
      *  This config will be used for routes and for targets, used in the router
      *  Eg: if the config object specifies :
      * ```javascript
      *
      *
      * { viewType : "XML" }
      *
      * ```
      *  The targets look like this:
      * ```javascript
      *
      * {
      *     xmlTarget : {
      *         ...
      *     },
      *     jsTarget : {
      *         viewType : "JS"
      *         ...
      *     },
      *     componentTarget: {
      *         type: "Component",
      *         name: "subComponent",
      *         id: "mySubComponent",
      *         options: {
      *             // the Component configuration:
      *             manifest: true
      *             ...
      *         },
      *         controlId: "myRootView",
      *         controlAggregation: "content"
      *     }
      * }
      * ```
      *  Then the effective config will look like this:
      * ```javascript
      *
      * {
      *     xmlTarget : {
      *         viewType : "XML"
      *         ...
      *     },
      *     jsTarget : {
      *         viewType : "JS"
      *         ...
      *     },
      * 	   componentTarget: {
      *         type: "Component",
      *         name: "subComponent",
      *         id: "mySubComponent",
      *         options: {
      *             // the Component configuration:
      *             manifest: true
      *             ...
      *         },
      *         controlId: "myRootView",
      *         controlAggregation: "content"
      *     }
      * }
      * ```
      *
      *
      * Since the xmlTarget does not specify its viewType, XML is taken from the config object. The jsTarget
      * is specifying it, so the viewType will be JS.
      */
    oConfig: Unit,
      /**
      * the Component of all the views that will be created by this Router,
      *  will get forwarded to the {@link sap.ui.core.routing.Views#constructor}.
      *  If you are using the componentMetadata to define your routes you should skip this parameter.
      */
    oOwner: Unit,
      /**
      * the target configuration, see {@link sap.m.routing.Targets#constructor} documentation (the options object).
      *  You should use Targets to create and display views. The route should only contain routing relevant properties.
      *  **Example:**
      * ```javascript
      *
      *
      *     new Router(
      *     // Routes
      *     [
      *         {
      *             // no view creation related properties are in the route
      *             name: "startRoute",
      *             //no hash
      *             pattern: "",
      *             // you can find this target in the targetConfig
      *             target: "welcome"
      *         }
      *     ],
      *     // Default values shared by routes and Targets
      *     {
      *         path: "my.application.namespace",
      *         viewType: "XML"
      *     },
      *     // You should only use this constructor when you are not using a router with a component.
      *     // Please use the metadata of a component to define your routes and targets.
      *     // The documentation can be found here: {@link sap.ui.core.UIComponent.extend}.
      *     null,
      *     // Target config
      *     {
      *          //same name as in the route called 'startRoute'
      *          welcome: {
      *              // All properties for creating and placing a view go here or in the config
      *              type: "View",
      *              name: "Welcome",
      *              controlId: "app",
      *              controlAggregation: "pages"
      *          }
      *     })
      *
      * ```
      */
    oTargetsConfig: js.Object
    ) = this()
    def this(
      /**
      * may contain many Route configurations as {@link sap.ui.core.routing.Route#constructor}.
      *  Each of the routes contained in the array/object will be added to the router.
      *
      *
      * One way of defining routes is an array:
      * ```javascript
      *
      * [
      *     //Will create a route called 'firstRouter' you can later use this name in navTo to navigate to this route
      *     {
      *         name: "firstRoute"
      *         pattern : "usefulPattern"
      *     },
      *     //Will create a route called 'anotherRoute'
      *     {
      *         name: "anotherRoute"
      *         pattern : "anotherPattern"
      *     },
      *     //Will create a route for a nested component with the prefix 'componentPrefix'
      *     {
      *         pattern: "componentPattern",
      *         name: "componentRoute",
      *         target: [
      *              {
      *                  name: "subComponent",
      *                  prefix: "componentPrefix"
      *              }
      *         ]
      *     }
      * ]
      * ```
      *
      *
      * The alternative way of defining routes is an Object.
      *  If you choose this way, the name attribute is the name of the property.
      * ```javascript
      *
      * {
      *     //Will create a route called 'firstRouter' you can later use this name in navTo to navigate to this route
      *     firstRoute : {
      *         pattern : "usefulPattern"
      *     },
      *     //Will create a route called 'anotherRoute'
      *     anotherRoute : {
      *         pattern : "anotherPattern"
      *     },
      *     //Will create a route for a nested component with the prefix 'componentPrefix'
      *     componentRoute{
      *         pattern: "componentPattern",
      *         target: [
      *              {
      *                  name: "subComponent",
      *                  prefix: "componentPrefix"
      *              }
      *         ]
      *     }
      * }
      * ```
      *  The values that may be provided are the same as in {@link sap.ui.core.routing.Route#constructor}
      */
    oRoutes: Unit,
      /**
      * Default values for route configuration - also takes the same parameters as {@link sap.ui.core.routing.Target#constructor}.
      *  This config will be used for routes and for targets, used in the router
      *  Eg: if the config object specifies :
      * ```javascript
      *
      *
      * { viewType : "XML" }
      *
      * ```
      *  The targets look like this:
      * ```javascript
      *
      * {
      *     xmlTarget : {
      *         ...
      *     },
      *     jsTarget : {
      *         viewType : "JS"
      *         ...
      *     },
      *     componentTarget: {
      *         type: "Component",
      *         name: "subComponent",
      *         id: "mySubComponent",
      *         options: {
      *             // the Component configuration:
      *             manifest: true
      *             ...
      *         },
      *         controlId: "myRootView",
      *         controlAggregation: "content"
      *     }
      * }
      * ```
      *  Then the effective config will look like this:
      * ```javascript
      *
      * {
      *     xmlTarget : {
      *         viewType : "XML"
      *         ...
      *     },
      *     jsTarget : {
      *         viewType : "JS"
      *         ...
      *     },
      * 	   componentTarget: {
      *         type: "Component",
      *         name: "subComponent",
      *         id: "mySubComponent",
      *         options: {
      *             // the Component configuration:
      *             manifest: true
      *             ...
      *         },
      *         controlId: "myRootView",
      *         controlAggregation: "content"
      *     }
      * }
      * ```
      *
      *
      * Since the xmlTarget does not specify its viewType, XML is taken from the config object. The jsTarget
      * is specifying it, so the viewType will be JS.
      */
    oConfig: Unit,
      /**
      * the Component of all the views that will be created by this Router,
      *  will get forwarded to the {@link sap.ui.core.routing.Views#constructor}.
      *  If you are using the componentMetadata to define your routes you should skip this parameter.
      */
    oOwner: typings.openui5.sapUiCoreUicomponentMod.default,
      /**
      * the target configuration, see {@link sap.m.routing.Targets#constructor} documentation (the options object).
      *  You should use Targets to create and display views. The route should only contain routing relevant properties.
      *  **Example:**
      * ```javascript
      *
      *
      *     new Router(
      *     // Routes
      *     [
      *         {
      *             // no view creation related properties are in the route
      *             name: "startRoute",
      *             //no hash
      *             pattern: "",
      *             // you can find this target in the targetConfig
      *             target: "welcome"
      *         }
      *     ],
      *     // Default values shared by routes and Targets
      *     {
      *         path: "my.application.namespace",
      *         viewType: "XML"
      *     },
      *     // You should only use this constructor when you are not using a router with a component.
      *     // Please use the metadata of a component to define your routes and targets.
      *     // The documentation can be found here: {@link sap.ui.core.UIComponent.extend}.
      *     null,
      *     // Target config
      *     {
      *          //same name as in the route called 'startRoute'
      *          welcome: {
      *              // All properties for creating and placing a view go here or in the config
      *              type: "View",
      *              name: "Welcome",
      *              controlId: "app",
      *              controlAggregation: "pages"
      *          }
      *     })
      *
      * ```
      */
    oTargetsConfig: js.Object
    ) = this()
    def this(
      /**
      * may contain many Route configurations as {@link sap.ui.core.routing.Route#constructor}.
      *  Each of the routes contained in the array/object will be added to the router.
      *
      *
      * One way of defining routes is an array:
      * ```javascript
      *
      * [
      *     //Will create a route called 'firstRouter' you can later use this name in navTo to navigate to this route
      *     {
      *         name: "firstRoute"
      *         pattern : "usefulPattern"
      *     },
      *     //Will create a route called 'anotherRoute'
      *     {
      *         name: "anotherRoute"
      *         pattern : "anotherPattern"
      *     },
      *     //Will create a route for a nested component with the prefix 'componentPrefix'
      *     {
      *         pattern: "componentPattern",
      *         name: "componentRoute",
      *         target: [
      *              {
      *                  name: "subComponent",
      *                  prefix: "componentPrefix"
      *              }
      *         ]
      *     }
      * ]
      * ```
      *
      *
      * The alternative way of defining routes is an Object.
      *  If you choose this way, the name attribute is the name of the property.
      * ```javascript
      *
      * {
      *     //Will create a route called 'firstRouter' you can later use this name in navTo to navigate to this route
      *     firstRoute : {
      *         pattern : "usefulPattern"
      *     },
      *     //Will create a route called 'anotherRoute'
      *     anotherRoute : {
      *         pattern : "anotherPattern"
      *     },
      *     //Will create a route for a nested component with the prefix 'componentPrefix'
      *     componentRoute{
      *         pattern: "componentPattern",
      *         target: [
      *              {
      *                  name: "subComponent",
      *                  prefix: "componentPrefix"
      *              }
      *         ]
      *     }
      * }
      * ```
      *  The values that may be provided are the same as in {@link sap.ui.core.routing.Route#constructor}
      */
    oRoutes: Unit,
      /**
      * Default values for route configuration - also takes the same parameters as {@link sap.ui.core.routing.Target#constructor}.
      *  This config will be used for routes and for targets, used in the router
      *  Eg: if the config object specifies :
      * ```javascript
      *
      *
      * { viewType : "XML" }
      *
      * ```
      *  The targets look like this:
      * ```javascript
      *
      * {
      *     xmlTarget : {
      *         ...
      *     },
      *     jsTarget : {
      *         viewType : "JS"
      *         ...
      *     },
      *     componentTarget: {
      *         type: "Component",
      *         name: "subComponent",
      *         id: "mySubComponent",
      *         options: {
      *             // the Component configuration:
      *             manifest: true
      *             ...
      *         },
      *         controlId: "myRootView",
      *         controlAggregation: "content"
      *     }
      * }
      * ```
      *  Then the effective config will look like this:
      * ```javascript
      *
      * {
      *     xmlTarget : {
      *         viewType : "XML"
      *         ...
      *     },
      *     jsTarget : {
      *         viewType : "JS"
      *         ...
      *     },
      * 	   componentTarget: {
      *         type: "Component",
      *         name: "subComponent",
      *         id: "mySubComponent",
      *         options: {
      *             // the Component configuration:
      *             manifest: true
      *             ...
      *         },
      *         controlId: "myRootView",
      *         controlAggregation: "content"
      *     }
      * }
      * ```
      *
      *
      * Since the xmlTarget does not specify its viewType, XML is taken from the config object. The jsTarget
      * is specifying it, so the viewType will be JS.
      */
    oConfig: `1`,
      /**
      * the Component of all the views that will be created by this Router,
      *  will get forwarded to the {@link sap.ui.core.routing.Views#constructor}.
      *  If you are using the componentMetadata to define your routes you should skip this parameter.
      */
    oOwner: Unit,
      /**
      * the target configuration, see {@link sap.m.routing.Targets#constructor} documentation (the options object).
      *  You should use Targets to create and display views. The route should only contain routing relevant properties.
      *  **Example:**
      * ```javascript
      *
      *
      *     new Router(
      *     // Routes
      *     [
      *         {
      *             // no view creation related properties are in the route
      *             name: "startRoute",
      *             //no hash
      *             pattern: "",
      *             // you can find this target in the targetConfig
      *             target: "welcome"
      *         }
      *     ],
      *     // Default values shared by routes and Targets
      *     {
      *         path: "my.application.namespace",
      *         viewType: "XML"
      *     },
      *     // You should only use this constructor when you are not using a router with a component.
      *     // Please use the metadata of a component to define your routes and targets.
      *     // The documentation can be found here: {@link sap.ui.core.UIComponent.extend}.
      *     null,
      *     // Target config
      *     {
      *          //same name as in the route called 'startRoute'
      *          welcome: {
      *              // All properties for creating and placing a view go here or in the config
      *              type: "View",
      *              name: "Welcome",
      *              controlId: "app",
      *              controlAggregation: "pages"
      *          }
      *     })
      *
      * ```
      */
    oTargetsConfig: js.Object
    ) = this()
    def this(
      /**
      * may contain many Route configurations as {@link sap.ui.core.routing.Route#constructor}.
      *  Each of the routes contained in the array/object will be added to the router.
      *
      *
      * One way of defining routes is an array:
      * ```javascript
      *
      * [
      *     //Will create a route called 'firstRouter' you can later use this name in navTo to navigate to this route
      *     {
      *         name: "firstRoute"
      *         pattern : "usefulPattern"
      *     },
      *     //Will create a route called 'anotherRoute'
      *     {
      *         name: "anotherRoute"
      *         pattern : "anotherPattern"
      *     },
      *     //Will create a route for a nested component with the prefix 'componentPrefix'
      *     {
      *         pattern: "componentPattern",
      *         name: "componentRoute",
      *         target: [
      *              {
      *                  name: "subComponent",
      *                  prefix: "componentPrefix"
      *              }
      *         ]
      *     }
      * ]
      * ```
      *
      *
      * The alternative way of defining routes is an Object.
      *  If you choose this way, the name attribute is the name of the property.
      * ```javascript
      *
      * {
      *     //Will create a route called 'firstRouter' you can later use this name in navTo to navigate to this route
      *     firstRoute : {
      *         pattern : "usefulPattern"
      *     },
      *     //Will create a route called 'anotherRoute'
      *     anotherRoute : {
      *         pattern : "anotherPattern"
      *     },
      *     //Will create a route for a nested component with the prefix 'componentPrefix'
      *     componentRoute{
      *         pattern: "componentPattern",
      *         target: [
      *              {
      *                  name: "subComponent",
      *                  prefix: "componentPrefix"
      *              }
      *         ]
      *     }
      * }
      * ```
      *  The values that may be provided are the same as in {@link sap.ui.core.routing.Route#constructor}
      */
    oRoutes: Unit,
      /**
      * Default values for route configuration - also takes the same parameters as {@link sap.ui.core.routing.Target#constructor}.
      *  This config will be used for routes and for targets, used in the router
      *  Eg: if the config object specifies :
      * ```javascript
      *
      *
      * { viewType : "XML" }
      *
      * ```
      *  The targets look like this:
      * ```javascript
      *
      * {
      *     xmlTarget : {
      *         ...
      *     },
      *     jsTarget : {
      *         viewType : "JS"
      *         ...
      *     },
      *     componentTarget: {
      *         type: "Component",
      *         name: "subComponent",
      *         id: "mySubComponent",
      *         options: {
      *             // the Component configuration:
      *             manifest: true
      *             ...
      *         },
      *         controlId: "myRootView",
      *         controlAggregation: "content"
      *     }
      * }
      * ```
      *  Then the effective config will look like this:
      * ```javascript
      *
      * {
      *     xmlTarget : {
      *         viewType : "XML"
      *         ...
      *     },
      *     jsTarget : {
      *         viewType : "JS"
      *         ...
      *     },
      * 	   componentTarget: {
      *         type: "Component",
      *         name: "subComponent",
      *         id: "mySubComponent",
      *         options: {
      *             // the Component configuration:
      *             manifest: true
      *             ...
      *         },
      *         controlId: "myRootView",
      *         controlAggregation: "content"
      *     }
      * }
      * ```
      *
      *
      * Since the xmlTarget does not specify its viewType, XML is taken from the config object. The jsTarget
      * is specifying it, so the viewType will be JS.
      */
    oConfig: `1`,
      /**
      * the Component of all the views that will be created by this Router,
      *  will get forwarded to the {@link sap.ui.core.routing.Views#constructor}.
      *  If you are using the componentMetadata to define your routes you should skip this parameter.
      */
    oOwner: typings.openui5.sapUiCoreUicomponentMod.default,
      /**
      * the target configuration, see {@link sap.m.routing.Targets#constructor} documentation (the options object).
      *  You should use Targets to create and display views. The route should only contain routing relevant properties.
      *  **Example:**
      * ```javascript
      *
      *
      *     new Router(
      *     // Routes
      *     [
      *         {
      *             // no view creation related properties are in the route
      *             name: "startRoute",
      *             //no hash
      *             pattern: "",
      *             // you can find this target in the targetConfig
      *             target: "welcome"
      *         }
      *     ],
      *     // Default values shared by routes and Targets
      *     {
      *         path: "my.application.namespace",
      *         viewType: "XML"
      *     },
      *     // You should only use this constructor when you are not using a router with a component.
      *     // Please use the metadata of a component to define your routes and targets.
      *     // The documentation can be found here: {@link sap.ui.core.UIComponent.extend}.
      *     null,
      *     // Target config
      *     {
      *          //same name as in the route called 'startRoute'
      *          welcome: {
      *              // All properties for creating and placing a view go here or in the config
      *              type: "View",
      *              name: "Welcome",
      *              controlId: "app",
      *              controlAggregation: "pages"
      *          }
      *     })
      *
      * ```
      */
    oTargetsConfig: js.Object
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/m/routing/Router", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.m.routing.Router with name `sClassName` and enriches it with the
      * information contained in `oClassInfo`.
      *
      * `oClassInfo` might contain the same kind of information as described in {@link sap.ui.core.routing.Router.extend}.
      *
      * @returns Created class / constructor function
      */
    inline def extend[T /* <: Record[String, Any] */](/**
      * Name of the class being created
      */
    sClassName: String): js.Function = ^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any]).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: Unit,
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, Router]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, Router],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.m.routing.Router.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiBaseMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiBaseMetadataMod.default]
  }
  
  @js.native
  trait Router
    extends typings.openui5.sapUiCoreRoutingRouterMod.default {
    
    /**
      * Returns the TargetHandler instance.
      *
      * @returns the TargetHandler instance
      */
    def getTargetHandler(): typings.openui5.sapMRoutingTargetHandlerMod.default = js.native
  }
}
