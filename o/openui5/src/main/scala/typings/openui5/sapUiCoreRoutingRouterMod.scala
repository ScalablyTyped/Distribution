package typings.openui5

import typings.openui5.anon.Bypassed
import typings.openui5.anon.`30`
import typings.openui5.sap.ClassInfo
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiCoreRoutingRouterMod {
  
  @JSImport("sap/ui/core/routing/Router", JSImport.Default)
  @js.native
  /**
    * Instantiates a router
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
      *     //Will create a route called 'anotherRoute' for displaying the target 'targetView' which is defined in 'oTargets'
      *     {
      *         name: "anotherRoute"
      *         pattern : "anotherPattern",
      *         target: "targetView"
      *     },
      *     //Will create a route for displaying a nested component which is defined in 'oTargets' with the prefix 'componentPrefix'
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
      *     //Will create a route called 'anotherRoute' for displaying the target 'targetView' which is defined in 'oTargets'
      *     anotherRoute : {
      *         pattern : "anotherPattern",
      *         target: "targetView"
      *     },
      *     //Will create a route for displaying a nested component which is defined in 'oTargets' with the prefix 'componentPrefix'
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
      *     //Will create a route called 'anotherRoute' for displaying the target 'targetView' which is defined in 'oTargets'
      *     {
      *         name: "anotherRoute"
      *         pattern : "anotherPattern",
      *         target: "targetView"
      *     },
      *     //Will create a route for displaying a nested component which is defined in 'oTargets' with the prefix 'componentPrefix'
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
      *     //Will create a route called 'anotherRoute' for displaying the target 'targetView' which is defined in 'oTargets'
      *     anotherRoute : {
      *         pattern : "anotherPattern",
      *         target: "targetView"
      *     },
      *     //Will create a route for displaying a nested component which is defined in 'oTargets' with the prefix 'componentPrefix'
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
      *     //Will create a route called 'anotherRoute' for displaying the target 'targetView' which is defined in 'oTargets'
      *     {
      *         name: "anotherRoute"
      *         pattern : "anotherPattern",
      *         target: "targetView"
      *     },
      *     //Will create a route for displaying a nested component which is defined in 'oTargets' with the prefix 'componentPrefix'
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
      *     //Will create a route called 'anotherRoute' for displaying the target 'targetView' which is defined in 'oTargets'
      *     anotherRoute : {
      *         pattern : "anotherPattern",
      *         target: "targetView"
      *     },
      *     //Will create a route for displaying a nested component which is defined in 'oTargets' with the prefix 'componentPrefix'
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
      *  Eg: if the config object specifies:
      * ```javascript
      *
      * {
      *     viewType: "XML"
      * }
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
      *     }
      * }
      * ```
      *
      *
      * Since the xmlTarget does not specify its viewType, XML is taken from the config object. The jsTarget
      * is specifying it, so the viewType will be JS.
      */
    oConfig: Bypassed
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
      *     //Will create a route called 'anotherRoute' for displaying the target 'targetView' which is defined in 'oTargets'
      *     {
      *         name: "anotherRoute"
      *         pattern : "anotherPattern",
      *         target: "targetView"
      *     },
      *     //Will create a route for displaying a nested component which is defined in 'oTargets' with the prefix 'componentPrefix'
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
      *     //Will create a route called 'anotherRoute' for displaying the target 'targetView' which is defined in 'oTargets'
      *     anotherRoute : {
      *         pattern : "anotherPattern",
      *         target: "targetView"
      *     },
      *     //Will create a route for displaying a nested component which is defined in 'oTargets' with the prefix 'componentPrefix'
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
      *  Eg: if the config object specifies:
      * ```javascript
      *
      * {
      *     viewType: "XML"
      * }
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
      *     }
      * }
      * ```
      *
      *
      * Since the xmlTarget does not specify its viewType, XML is taken from the config object. The jsTarget
      * is specifying it, so the viewType will be JS.
      */
    oConfig: Bypassed
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
      *     //Will create a route called 'anotherRoute' for displaying the target 'targetView' which is defined in 'oTargets'
      *     {
      *         name: "anotherRoute"
      *         pattern : "anotherPattern",
      *         target: "targetView"
      *     },
      *     //Will create a route for displaying a nested component which is defined in 'oTargets' with the prefix 'componentPrefix'
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
      *     //Will create a route called 'anotherRoute' for displaying the target 'targetView' which is defined in 'oTargets'
      *     anotherRoute : {
      *         pattern : "anotherPattern",
      *         target: "targetView"
      *     },
      *     //Will create a route for displaying a nested component which is defined in 'oTargets' with the prefix 'componentPrefix'
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
      *  Eg: if the config object specifies:
      * ```javascript
      *
      * {
      *     viewType: "XML"
      * }
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
      *     }
      * }
      * ```
      *
      *
      * Since the xmlTarget does not specify its viewType, XML is taken from the config object. The jsTarget
      * is specifying it, so the viewType will be JS.
      */
    oConfig: Bypassed
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
      *     //Will create a route called 'anotherRoute' for displaying the target 'targetView' which is defined in 'oTargets'
      *     {
      *         name: "anotherRoute"
      *         pattern : "anotherPattern",
      *         target: "targetView"
      *     },
      *     //Will create a route for displaying a nested component which is defined in 'oTargets' with the prefix 'componentPrefix'
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
      *     //Will create a route called 'anotherRoute' for displaying the target 'targetView' which is defined in 'oTargets'
      *     anotherRoute : {
      *         pattern : "anotherPattern",
      *         target: "targetView"
      *     },
      *     //Will create a route for displaying a nested component which is defined in 'oTargets' with the prefix 'componentPrefix'
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
      *  Eg: if the config object specifies:
      * ```javascript
      *
      * {
      *     viewType: "XML"
      * }
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
      *     //Will create a route called 'anotherRoute' for displaying the target 'targetView' which is defined in 'oTargets'
      *     {
      *         name: "anotherRoute"
      *         pattern : "anotherPattern",
      *         target: "targetView"
      *     },
      *     //Will create a route for displaying a nested component which is defined in 'oTargets' with the prefix 'componentPrefix'
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
      *     //Will create a route called 'anotherRoute' for displaying the target 'targetView' which is defined in 'oTargets'
      *     anotherRoute : {
      *         pattern : "anotherPattern",
      *         target: "targetView"
      *     },
      *     //Will create a route for displaying a nested component which is defined in 'oTargets' with the prefix 'componentPrefix'
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
      *  Eg: if the config object specifies:
      * ```javascript
      *
      * {
      *     viewType: "XML"
      * }
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
      *     }
      * }
      * ```
      *
      *
      * Since the xmlTarget does not specify its viewType, XML is taken from the config object. The jsTarget
      * is specifying it, so the viewType will be JS.
      */
    oConfig: Bypassed,
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
      *     //Will create a route called 'anotherRoute' for displaying the target 'targetView' which is defined in 'oTargets'
      *     {
      *         name: "anotherRoute"
      *         pattern : "anotherPattern",
      *         target: "targetView"
      *     },
      *     //Will create a route for displaying a nested component which is defined in 'oTargets' with the prefix 'componentPrefix'
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
      *     //Will create a route called 'anotherRoute' for displaying the target 'targetView' which is defined in 'oTargets'
      *     anotherRoute : {
      *         pattern : "anotherPattern",
      *         target: "targetView"
      *     },
      *     //Will create a route for displaying a nested component which is defined in 'oTargets' with the prefix 'componentPrefix'
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
      *  Eg: if the config object specifies:
      * ```javascript
      *
      * {
      *     viewType: "XML"
      * }
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
      *     //Will create a route called 'anotherRoute' for displaying the target 'targetView' which is defined in 'oTargets'
      *     {
      *         name: "anotherRoute"
      *         pattern : "anotherPattern",
      *         target: "targetView"
      *     },
      *     //Will create a route for displaying a nested component which is defined in 'oTargets' with the prefix 'componentPrefix'
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
      *     //Will create a route called 'anotherRoute' for displaying the target 'targetView' which is defined in 'oTargets'
      *     anotherRoute : {
      *         pattern : "anotherPattern",
      *         target: "targetView"
      *     },
      *     //Will create a route for displaying a nested component which is defined in 'oTargets' with the prefix 'componentPrefix'
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
      *  Eg: if the config object specifies:
      * ```javascript
      *
      * {
      *     viewType: "XML"
      * }
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
      *     }
      * }
      * ```
      *
      *
      * Since the xmlTarget does not specify its viewType, XML is taken from the config object. The jsTarget
      * is specifying it, so the viewType will be JS.
      */
    oConfig: Bypassed,
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
      *     //Will create a route called 'anotherRoute' for displaying the target 'targetView' which is defined in 'oTargets'
      *     {
      *         name: "anotherRoute"
      *         pattern : "anotherPattern",
      *         target: "targetView"
      *     },
      *     //Will create a route for displaying a nested component which is defined in 'oTargets' with the prefix 'componentPrefix'
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
      *     //Will create a route called 'anotherRoute' for displaying the target 'targetView' which is defined in 'oTargets'
      *     anotherRoute : {
      *         pattern : "anotherPattern",
      *         target: "targetView"
      *     },
      *     //Will create a route for displaying a nested component which is defined in 'oTargets' with the prefix 'componentPrefix'
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
      *  Eg: if the config object specifies:
      * ```javascript
      *
      * {
      *     viewType: "XML"
      * }
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
      *     //Will create a route called 'anotherRoute' for displaying the target 'targetView' which is defined in 'oTargets'
      *     {
      *         name: "anotherRoute"
      *         pattern : "anotherPattern",
      *         target: "targetView"
      *     },
      *     //Will create a route for displaying a nested component which is defined in 'oTargets' with the prefix 'componentPrefix'
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
      *     //Will create a route called 'anotherRoute' for displaying the target 'targetView' which is defined in 'oTargets'
      *     anotherRoute : {
      *         pattern : "anotherPattern",
      *         target: "targetView"
      *     },
      *     //Will create a route for displaying a nested component which is defined in 'oTargets' with the prefix 'componentPrefix'
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
      *  Eg: if the config object specifies:
      * ```javascript
      *
      * {
      *     viewType: "XML"
      * }
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
      *     }
      * }
      * ```
      *
      *
      * Since the xmlTarget does not specify its viewType, XML is taken from the config object. The jsTarget
      * is specifying it, so the viewType will be JS.
      */
    oConfig: Bypassed,
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
      *     //Will create a route called 'anotherRoute' for displaying the target 'targetView' which is defined in 'oTargets'
      *     {
      *         name: "anotherRoute"
      *         pattern : "anotherPattern",
      *         target: "targetView"
      *     },
      *     //Will create a route for displaying a nested component which is defined in 'oTargets' with the prefix 'componentPrefix'
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
      *     //Will create a route called 'anotherRoute' for displaying the target 'targetView' which is defined in 'oTargets'
      *     anotherRoute : {
      *         pattern : "anotherPattern",
      *         target: "targetView"
      *     },
      *     //Will create a route for displaying a nested component which is defined in 'oTargets' with the prefix 'componentPrefix'
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
      *  Eg: if the config object specifies:
      * ```javascript
      *
      * {
      *     viewType: "XML"
      * }
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
      * Since 1.28 the target configuration, see {@link sap.ui.core.routing.Targets#constructor} documentation
      * (the options object).
      *  You should use Targets to create and display views. Since 1.28 the route should only contain routing
      * relevant properties.
      *  **Example:**
      * ```javascript
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
      *     // You should only use this constructor when you are using a router without a component.
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
      *     //Will create a route called 'anotherRoute' for displaying the target 'targetView' which is defined in 'oTargets'
      *     {
      *         name: "anotherRoute"
      *         pattern : "anotherPattern",
      *         target: "targetView"
      *     },
      *     //Will create a route for displaying a nested component which is defined in 'oTargets' with the prefix 'componentPrefix'
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
      *     //Will create a route called 'anotherRoute' for displaying the target 'targetView' which is defined in 'oTargets'
      *     anotherRoute : {
      *         pattern : "anotherPattern",
      *         target: "targetView"
      *     },
      *     //Will create a route for displaying a nested component which is defined in 'oTargets' with the prefix 'componentPrefix'
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
      *  Eg: if the config object specifies:
      * ```javascript
      *
      * {
      *     viewType: "XML"
      * }
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
      * Since 1.28 the target configuration, see {@link sap.ui.core.routing.Targets#constructor} documentation
      * (the options object).
      *  You should use Targets to create and display views. Since 1.28 the route should only contain routing
      * relevant properties.
      *  **Example:**
      * ```javascript
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
      *     // You should only use this constructor when you are using a router without a component.
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
      *     //Will create a route called 'anotherRoute' for displaying the target 'targetView' which is defined in 'oTargets'
      *     {
      *         name: "anotherRoute"
      *         pattern : "anotherPattern",
      *         target: "targetView"
      *     },
      *     //Will create a route for displaying a nested component which is defined in 'oTargets' with the prefix 'componentPrefix'
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
      *     //Will create a route called 'anotherRoute' for displaying the target 'targetView' which is defined in 'oTargets'
      *     anotherRoute : {
      *         pattern : "anotherPattern",
      *         target: "targetView"
      *     },
      *     //Will create a route for displaying a nested component which is defined in 'oTargets' with the prefix 'componentPrefix'
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
      *  Eg: if the config object specifies:
      * ```javascript
      *
      * {
      *     viewType: "XML"
      * }
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
      *     }
      * }
      * ```
      *
      *
      * Since the xmlTarget does not specify its viewType, XML is taken from the config object. The jsTarget
      * is specifying it, so the viewType will be JS.
      */
    oConfig: Bypassed,
      /**
      * the Component of all the views that will be created by this Router,
      *  will get forwarded to the {@link sap.ui.core.routing.Views#constructor}.
      *  If you are using the componentMetadata to define your routes you should skip this parameter.
      */
    oOwner: Unit,
      /**
      * Since 1.28 the target configuration, see {@link sap.ui.core.routing.Targets#constructor} documentation
      * (the options object).
      *  You should use Targets to create and display views. Since 1.28 the route should only contain routing
      * relevant properties.
      *  **Example:**
      * ```javascript
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
      *     // You should only use this constructor when you are using a router without a component.
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
      *     //Will create a route called 'anotherRoute' for displaying the target 'targetView' which is defined in 'oTargets'
      *     {
      *         name: "anotherRoute"
      *         pattern : "anotherPattern",
      *         target: "targetView"
      *     },
      *     //Will create a route for displaying a nested component which is defined in 'oTargets' with the prefix 'componentPrefix'
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
      *     //Will create a route called 'anotherRoute' for displaying the target 'targetView' which is defined in 'oTargets'
      *     anotherRoute : {
      *         pattern : "anotherPattern",
      *         target: "targetView"
      *     },
      *     //Will create a route for displaying a nested component which is defined in 'oTargets' with the prefix 'componentPrefix'
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
      *  Eg: if the config object specifies:
      * ```javascript
      *
      * {
      *     viewType: "XML"
      * }
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
      *     }
      * }
      * ```
      *
      *
      * Since the xmlTarget does not specify its viewType, XML is taken from the config object. The jsTarget
      * is specifying it, so the viewType will be JS.
      */
    oConfig: Bypassed,
      /**
      * the Component of all the views that will be created by this Router,
      *  will get forwarded to the {@link sap.ui.core.routing.Views#constructor}.
      *  If you are using the componentMetadata to define your routes you should skip this parameter.
      */
    oOwner: typings.openui5.sapUiCoreUicomponentMod.default,
      /**
      * Since 1.28 the target configuration, see {@link sap.ui.core.routing.Targets#constructor} documentation
      * (the options object).
      *  You should use Targets to create and display views. Since 1.28 the route should only contain routing
      * relevant properties.
      *  **Example:**
      * ```javascript
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
      *     // You should only use this constructor when you are using a router without a component.
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
      *     //Will create a route called 'anotherRoute' for displaying the target 'targetView' which is defined in 'oTargets'
      *     {
      *         name: "anotherRoute"
      *         pattern : "anotherPattern",
      *         target: "targetView"
      *     },
      *     //Will create a route for displaying a nested component which is defined in 'oTargets' with the prefix 'componentPrefix'
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
      *     //Will create a route called 'anotherRoute' for displaying the target 'targetView' which is defined in 'oTargets'
      *     anotherRoute : {
      *         pattern : "anotherPattern",
      *         target: "targetView"
      *     },
      *     //Will create a route for displaying a nested component which is defined in 'oTargets' with the prefix 'componentPrefix'
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
      *  Eg: if the config object specifies:
      * ```javascript
      *
      * {
      *     viewType: "XML"
      * }
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
      * Since 1.28 the target configuration, see {@link sap.ui.core.routing.Targets#constructor} documentation
      * (the options object).
      *  You should use Targets to create and display views. Since 1.28 the route should only contain routing
      * relevant properties.
      *  **Example:**
      * ```javascript
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
      *     // You should only use this constructor when you are using a router without a component.
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
      *     //Will create a route called 'anotherRoute' for displaying the target 'targetView' which is defined in 'oTargets'
      *     {
      *         name: "anotherRoute"
      *         pattern : "anotherPattern",
      *         target: "targetView"
      *     },
      *     //Will create a route for displaying a nested component which is defined in 'oTargets' with the prefix 'componentPrefix'
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
      *     //Will create a route called 'anotherRoute' for displaying the target 'targetView' which is defined in 'oTargets'
      *     anotherRoute : {
      *         pattern : "anotherPattern",
      *         target: "targetView"
      *     },
      *     //Will create a route for displaying a nested component which is defined in 'oTargets' with the prefix 'componentPrefix'
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
      *  Eg: if the config object specifies:
      * ```javascript
      *
      * {
      *     viewType: "XML"
      * }
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
      * Since 1.28 the target configuration, see {@link sap.ui.core.routing.Targets#constructor} documentation
      * (the options object).
      *  You should use Targets to create and display views. Since 1.28 the route should only contain routing
      * relevant properties.
      *  **Example:**
      * ```javascript
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
      *     // You should only use this constructor when you are using a router without a component.
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
      *     //Will create a route called 'anotherRoute' for displaying the target 'targetView' which is defined in 'oTargets'
      *     {
      *         name: "anotherRoute"
      *         pattern : "anotherPattern",
      *         target: "targetView"
      *     },
      *     //Will create a route for displaying a nested component which is defined in 'oTargets' with the prefix 'componentPrefix'
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
      *     //Will create a route called 'anotherRoute' for displaying the target 'targetView' which is defined in 'oTargets'
      *     anotherRoute : {
      *         pattern : "anotherPattern",
      *         target: "targetView"
      *     },
      *     //Will create a route for displaying a nested component which is defined in 'oTargets' with the prefix 'componentPrefix'
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
      *  Eg: if the config object specifies:
      * ```javascript
      *
      * {
      *     viewType: "XML"
      * }
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
      *     }
      * }
      * ```
      *
      *
      * Since the xmlTarget does not specify its viewType, XML is taken from the config object. The jsTarget
      * is specifying it, so the viewType will be JS.
      */
    oConfig: Bypassed,
      /**
      * the Component of all the views that will be created by this Router,
      *  will get forwarded to the {@link sap.ui.core.routing.Views#constructor}.
      *  If you are using the componentMetadata to define your routes you should skip this parameter.
      */
    oOwner: Unit,
      /**
      * Since 1.28 the target configuration, see {@link sap.ui.core.routing.Targets#constructor} documentation
      * (the options object).
      *  You should use Targets to create and display views. Since 1.28 the route should only contain routing
      * relevant properties.
      *  **Example:**
      * ```javascript
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
      *     // You should only use this constructor when you are using a router without a component.
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
      *     //Will create a route called 'anotherRoute' for displaying the target 'targetView' which is defined in 'oTargets'
      *     {
      *         name: "anotherRoute"
      *         pattern : "anotherPattern",
      *         target: "targetView"
      *     },
      *     //Will create a route for displaying a nested component which is defined in 'oTargets' with the prefix 'componentPrefix'
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
      *     //Will create a route called 'anotherRoute' for displaying the target 'targetView' which is defined in 'oTargets'
      *     anotherRoute : {
      *         pattern : "anotherPattern",
      *         target: "targetView"
      *     },
      *     //Will create a route for displaying a nested component which is defined in 'oTargets' with the prefix 'componentPrefix'
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
      *  Eg: if the config object specifies:
      * ```javascript
      *
      * {
      *     viewType: "XML"
      * }
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
      *     }
      * }
      * ```
      *
      *
      * Since the xmlTarget does not specify its viewType, XML is taken from the config object. The jsTarget
      * is specifying it, so the viewType will be JS.
      */
    oConfig: Bypassed,
      /**
      * the Component of all the views that will be created by this Router,
      *  will get forwarded to the {@link sap.ui.core.routing.Views#constructor}.
      *  If you are using the componentMetadata to define your routes you should skip this parameter.
      */
    oOwner: typings.openui5.sapUiCoreUicomponentMod.default,
      /**
      * Since 1.28 the target configuration, see {@link sap.ui.core.routing.Targets#constructor} documentation
      * (the options object).
      *  You should use Targets to create and display views. Since 1.28 the route should only contain routing
      * relevant properties.
      *  **Example:**
      * ```javascript
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
      *     // You should only use this constructor when you are using a router without a component.
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
      *     //Will create a route called 'anotherRoute' for displaying the target 'targetView' which is defined in 'oTargets'
      *     {
      *         name: "anotherRoute"
      *         pattern : "anotherPattern",
      *         target: "targetView"
      *     },
      *     //Will create a route for displaying a nested component which is defined in 'oTargets' with the prefix 'componentPrefix'
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
      *     //Will create a route called 'anotherRoute' for displaying the target 'targetView' which is defined in 'oTargets'
      *     anotherRoute : {
      *         pattern : "anotherPattern",
      *         target: "targetView"
      *     },
      *     //Will create a route for displaying a nested component which is defined in 'oTargets' with the prefix 'componentPrefix'
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
      *  Eg: if the config object specifies:
      * ```javascript
      *
      * {
      *     viewType: "XML"
      * }
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
      * Since 1.28 the target configuration, see {@link sap.ui.core.routing.Targets#constructor} documentation
      * (the options object).
      *  You should use Targets to create and display views. Since 1.28 the route should only contain routing
      * relevant properties.
      *  **Example:**
      * ```javascript
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
      *     // You should only use this constructor when you are using a router without a component.
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
      *     //Will create a route called 'anotherRoute' for displaying the target 'targetView' which is defined in 'oTargets'
      *     {
      *         name: "anotherRoute"
      *         pattern : "anotherPattern",
      *         target: "targetView"
      *     },
      *     //Will create a route for displaying a nested component which is defined in 'oTargets' with the prefix 'componentPrefix'
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
      *     //Will create a route called 'anotherRoute' for displaying the target 'targetView' which is defined in 'oTargets'
      *     anotherRoute : {
      *         pattern : "anotherPattern",
      *         target: "targetView"
      *     },
      *     //Will create a route for displaying a nested component which is defined in 'oTargets' with the prefix 'componentPrefix'
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
      *  Eg: if the config object specifies:
      * ```javascript
      *
      * {
      *     viewType: "XML"
      * }
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
      * Since 1.28 the target configuration, see {@link sap.ui.core.routing.Targets#constructor} documentation
      * (the options object).
      *  You should use Targets to create and display views. Since 1.28 the route should only contain routing
      * relevant properties.
      *  **Example:**
      * ```javascript
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
      *     // You should only use this constructor when you are using a router without a component.
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
      *     //Will create a route called 'anotherRoute' for displaying the target 'targetView' which is defined in 'oTargets'
      *     {
      *         name: "anotherRoute"
      *         pattern : "anotherPattern",
      *         target: "targetView"
      *     },
      *     //Will create a route for displaying a nested component which is defined in 'oTargets' with the prefix 'componentPrefix'
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
      *     //Will create a route called 'anotherRoute' for displaying the target 'targetView' which is defined in 'oTargets'
      *     anotherRoute : {
      *         pattern : "anotherPattern",
      *         target: "targetView"
      *     },
      *     //Will create a route for displaying a nested component which is defined in 'oTargets' with the prefix 'componentPrefix'
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
      *  Eg: if the config object specifies:
      * ```javascript
      *
      * {
      *     viewType: "XML"
      * }
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
      *     }
      * }
      * ```
      *
      *
      * Since the xmlTarget does not specify its viewType, XML is taken from the config object. The jsTarget
      * is specifying it, so the viewType will be JS.
      */
    oConfig: Bypassed,
      /**
      * the Component of all the views that will be created by this Router,
      *  will get forwarded to the {@link sap.ui.core.routing.Views#constructor}.
      *  If you are using the componentMetadata to define your routes you should skip this parameter.
      */
    oOwner: Unit,
      /**
      * Since 1.28 the target configuration, see {@link sap.ui.core.routing.Targets#constructor} documentation
      * (the options object).
      *  You should use Targets to create and display views. Since 1.28 the route should only contain routing
      * relevant properties.
      *  **Example:**
      * ```javascript
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
      *     // You should only use this constructor when you are using a router without a component.
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
      *     //Will create a route called 'anotherRoute' for displaying the target 'targetView' which is defined in 'oTargets'
      *     {
      *         name: "anotherRoute"
      *         pattern : "anotherPattern",
      *         target: "targetView"
      *     },
      *     //Will create a route for displaying a nested component which is defined in 'oTargets' with the prefix 'componentPrefix'
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
      *     //Will create a route called 'anotherRoute' for displaying the target 'targetView' which is defined in 'oTargets'
      *     anotherRoute : {
      *         pattern : "anotherPattern",
      *         target: "targetView"
      *     },
      *     //Will create a route for displaying a nested component which is defined in 'oTargets' with the prefix 'componentPrefix'
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
      *  Eg: if the config object specifies:
      * ```javascript
      *
      * {
      *     viewType: "XML"
      * }
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
      *     }
      * }
      * ```
      *
      *
      * Since the xmlTarget does not specify its viewType, XML is taken from the config object. The jsTarget
      * is specifying it, so the viewType will be JS.
      */
    oConfig: Bypassed,
      /**
      * the Component of all the views that will be created by this Router,
      *  will get forwarded to the {@link sap.ui.core.routing.Views#constructor}.
      *  If you are using the componentMetadata to define your routes you should skip this parameter.
      */
    oOwner: typings.openui5.sapUiCoreUicomponentMod.default,
      /**
      * Since 1.28 the target configuration, see {@link sap.ui.core.routing.Targets#constructor} documentation
      * (the options object).
      *  You should use Targets to create and display views. Since 1.28 the route should only contain routing
      * relevant properties.
      *  **Example:**
      * ```javascript
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
      *     // You should only use this constructor when you are using a router without a component.
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
      * ```
      */
    oTargetsConfig: js.Object
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/ui/core/routing/Router", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.ui.core.routing.Router with name `sClassName` and enriches it with
      * the information contained in `oClassInfo`.
      *
      * `oClassInfo` might contain the same kind of information as described in {@link sap.ui.base.EventProvider.extend}.
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
      * Returns a metadata object for class sap.ui.core.routing.Router.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiBaseMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiBaseMetadataMod.default]
    
    /**
      * Get a registered router.
      *
      * @returns The router with the specified name, else `undefined`
      */
    inline def getRouter(/**
      * Name of the router
      */
    sName: String): js.UndefOr[Router] = ^.asInstanceOf[js.Dynamic].applyDynamic("getRouter")(sName.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Router]]
  }
  
  trait RouteInfo extends StObject {
    
    /**
      * The route data
      */
    var arguments: Record[String, String]
    
    /**
      * The route name
      */
    var name: String
  }
  object RouteInfo {
    
    inline def apply(arguments: Record[String, String], name: String): RouteInfo = {
      val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[RouteInfo]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RouteInfo] (val x: Self) extends AnyVal {
      
      inline def setArguments(value: Record[String, String]): Self = StObject.set(x, "arguments", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Router
    extends typings.openui5.sapUiBaseEventProviderMod.default {
    
    /**
      * Adds a route to the router.
      */
    def addRoute(
      /**
      * Configuration object for the route @see sap.ui.core.routing.Route#constructor
      */
    oConfig: js.Object,
      /**
      * The parent route - if a parent route is given, the `routeMatched` event of this route will also trigger
      * the `routeMatched` of the parent and it will also create the view of the parent (if provided).
      */
    oParent: typings.openui5.sapUiCoreRoutingRouteMod.default
    ): Unit = js.native
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:beforeRouteMatched beforeRouteMatched} event
      * of this `sap.ui.core.routing.Router`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.core.routing.Router` itself.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachBeforeRouteMatched(/**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function): this.type = js.native
    def attachBeforeRouteMatched(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function,
      /**
      * Context object to call the event handler with, defaults to this `sap.ui.core.routing.Router` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:beforeRouteMatched beforeRouteMatched} event
      * of this `sap.ui.core.routing.Router`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.core.routing.Router` itself.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachBeforeRouteMatched(
      /**
      * An application-specific payload object that will be passed to the event handler along with the event
      * object when firing the event
      */
    oData: js.Object,
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function
    ): this.type = js.native
    def attachBeforeRouteMatched(
      /**
      * An application-specific payload object that will be passed to the event handler along with the event
      * object when firing the event
      */
    oData: js.Object,
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function,
      /**
      * Context object to call the event handler with, defaults to this `sap.ui.core.routing.Router` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:bypassed bypassed} event of this `sap.ui.core.routing.Router`.
      *
      * The event will get fired, if none of the routes of the router is matching.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.core.routing.Router` itself.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachBypassed(/**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function): this.type = js.native
    def attachBypassed(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function,
      /**
      * Context object to call the event handler with, defaults to this `sap.ui.core.routing.Router` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:bypassed bypassed} event of this `sap.ui.core.routing.Router`.
      *
      * The event will get fired, if none of the routes of the router is matching.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.core.routing.Router` itself.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachBypassed(
      /**
      * An application-specific payload object that will be passed to the event handler along with the event
      * object when firing the event
      */
    oData: js.Object,
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function
    ): this.type = js.native
    def attachBypassed(
      /**
      * An application-specific payload object that will be passed to the event handler along with the event
      * object when firing the event
      */
    oData: js.Object,
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function,
      /**
      * Context object to call the event handler with, defaults to this `sap.ui.core.routing.Router` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:routeMatched routeMatched} event of this `sap.ui.core.routing.Router`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.core.routing.Router` itself.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachRouteMatched(/**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function): this.type = js.native
    def attachRouteMatched(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function,
      /**
      * Context object to call the event handler with, defaults to this `sap.ui.core.routing.Router` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:routeMatched routeMatched} event of this `sap.ui.core.routing.Router`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.core.routing.Router` itself.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachRouteMatched(
      /**
      * An application-specific payload object that will be passed to the event handler along with the event
      * object when firing the event
      */
    oData: js.Object,
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function
    ): this.type = js.native
    def attachRouteMatched(
      /**
      * An application-specific payload object that will be passed to the event handler along with the event
      * object when firing the event
      */
    oData: js.Object,
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function,
      /**
      * Context object to call the event handler with, defaults to this `sap.ui.core.routing.Router` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:routePatternMatched routePatternMatched} event
      * of this `sap.ui.core.routing.Router`.
      *
      * This event is similar to `routeMatched`. But it will only fire for the route that has a matching pattern,
      * not for its parent routes.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.core.routing.Router` itself.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachRoutePatternMatched(/**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function): this.type = js.native
    def attachRoutePatternMatched(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function,
      /**
      * Context object to call the event handler with, defaults to this `sap.ui.core.routing.Router` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:routePatternMatched routePatternMatched} event
      * of this `sap.ui.core.routing.Router`.
      *
      * This event is similar to `routeMatched`. But it will only fire for the route that has a matching pattern,
      * not for its parent routes.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.core.routing.Router` itself.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachRoutePatternMatched(
      /**
      * An application-specific payload object that will be passed to the event handler along with the event
      * object when firing the event
      */
    oData: js.Object,
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function
    ): this.type = js.native
    def attachRoutePatternMatched(
      /**
      * An application-specific payload object that will be passed to the event handler along with the event
      * object when firing the event
      */
    oData: js.Object,
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function,
      /**
      * Context object to call the event handler with, defaults to this `sap.ui.core.routing.Router` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:titleChanged titleChanged} event of this `sap.ui.core.routing.Router`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.core.routing.Router` itself.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachTitleChanged(/**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function): this.type = js.native
    def attachTitleChanged(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function,
      /**
      * Context object to call the event handler with, defaults to this `sap.ui.core.routing.Router` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:titleChanged titleChanged} event of this `sap.ui.core.routing.Router`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.core.routing.Router` itself.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachTitleChanged(
      /**
      * An application-specific payload object that will be passed to the event handler along with the event
      * object when firing the event
      */
    oData: js.Object,
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function
    ): this.type = js.native
    def attachTitleChanged(
      /**
      * An application-specific payload object that will be passed to the event handler along with the event
      * object when firing the event
      */
    oData: js.Object,
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function,
      /**
      * Context object to call the event handler with, defaults to this `sap.ui.core.routing.Router` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * @deprecated (since 1.28) - use {@link #getViews} instead.
      *
      * Attaches event handler `fnFunction` to the {@link #event:viewCreated viewCreated} event of this `sap.ui.core.routing.Router`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.core.routing.Router` itself.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachViewCreated(/**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function): this.type = js.native
    def attachViewCreated(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function,
      /**
      * Context object to call the event handler with, defaults to this `sap.ui.core.routing.Router` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * @deprecated (since 1.28) - use {@link #getViews} instead.
      *
      * Attaches event handler `fnFunction` to the {@link #event:viewCreated viewCreated} event of this `sap.ui.core.routing.Router`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.core.routing.Router` itself.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachViewCreated(
      /**
      * An application-specific payload object that will be passed to the event handler along with the event
      * object when firing the event
      */
    oData: js.Object,
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function
    ): this.type = js.native
    def attachViewCreated(
      /**
      * An application-specific payload object that will be passed to the event handler along with the event
      * object when firing the event
      */
    oData: js.Object,
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function,
      /**
      * Context object to call the event handler with, defaults to this `sap.ui.core.routing.Router` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Detaches event handler `fnFunction` from the {@link #event:beforeRouteMatched beforeRouteMatched} event
      * of this `sap.ui.core.routing.Router`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachBeforeRouteMatched(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function,
      /**
      * Context object on which the given function had to be called
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Detaches event handler `fnFunction` from the {@link #event:bypassed bypassed} event of this `sap.ui.core.routing.Router`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * The event will get fired, if none of the routes of the router is matching.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachBypassed(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function,
      /**
      * Context object on which the given function had to be called
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Detaches event handler `fnFunction` from the {@link #event:routeMatched routeMatched} event of this `sap.ui.core.routing.Router`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachRouteMatched(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function,
      /**
      * Context object on which the given function had to be called
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Detaches event handler `fnFunction` from the {@link #event:routePatternMatched routePatternMatched} event
      * of this `sap.ui.core.routing.Router`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * This event is similar to `routeMatched`. But it will only fire for the route that has a matching pattern,
      * not for its parent routes.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachRoutePatternMatched(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function,
      /**
      * Context object on which the given function had to be called
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Detaches event handler `fnFunction` from the {@link #event:titleChanged titleChanged} event of this `sap.ui.core.routing.Router`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachTitleChanged(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function,
      /**
      * Context object on which the given function had to be called
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * @deprecated (since 1.28) - use {@link #getViews} instead.
      *
      * Detaches event handler `fnFunction` from the {@link #event:viewCreated viewCreated} event of this `sap.ui.core.routing.Router`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachViewCreated(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function,
      /**
      * Context object on which the given function had to be called
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Fires event {@link #event:beforeRouteMatched beforeRouteMatched} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireBeforeRouteMatched(): this.type = js.native
    def fireBeforeRouteMatched(/**
      * Parameters to pass along with the event
      */
    oParameters: js.Object): this.type = js.native
    
    /**
      * Fires event {@link #event:bypassed bypassed} to attached listeners.
      *
      * The event will get fired, if none of the routes of the router is matching.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireBypassed(): this.type = js.native
    def fireBypassed(/**
      * Parameters to pass along with the event
      */
    oParameters: js.Object): this.type = js.native
    
    /**
      * Fires event {@link #event:routeMatched routeMatched} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireRouteMatched(): this.type = js.native
    def fireRouteMatched(/**
      * Parameters to pass along with the event
      */
    oParameters: js.Object): this.type = js.native
    
    /**
      * Fires event {@link #event:routePatternMatched routePatternMatched} to attached listeners.
      *
      * This event is similar to `routeMatched`. But it will only fire for the route that has a matching pattern,
      * not for its parent routes.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireRoutePatternMatched(): this.type = js.native
    def fireRoutePatternMatched(/**
      * Parameters to pass along with the event
      */
    oParameters: js.Object): this.type = js.native
    
    /**
      * @deprecated (since 1.28) - use {@link #getViews} instead.
      *
      * Fires event {@link #event:viewCreated viewCreated} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireViewCreated(): this.type = js.native
    def fireViewCreated(/**
      * Parameters to pass along with the event
      */
    oParameters: js.Object): this.type = js.native
    
    /**
      * @SINCE 1.75
      *
      * Returns the hash changer instance which is used in the router.
      *
      * This hash changer behaves differently than the hash changer that is returned by {@link sap.ui.core.routing.HashChanger.getInstance},
      * especially when the router is created in a component which is nested within another component. When this
      * hash changer is used, the other hash parts which belong to the parent components are kept in the browser
      * hash, while the complete browser hash is changed when it's changed by using the {@link sap.ui.core.routing.HashChanger.getInstance}.
      *
      * @returns The hash changer
      */
    def getHashChanger(): typings.openui5.sapUiCoreRoutingRouterHashChangerMod.default = js.native
    
    /**
      * @SINCE 1.25.1
      *
      * Returns the route with the given name or `undefined` if no route is found.
      *
      * @returns Route with the provided name or `undefined`.
      */
    def getRoute(/**
      * Name of the route
      */
    sName: String): js.UndefOr[typings.openui5.sapUiCoreRoutingRouteMod.default] = js.native
    
    /**
      * @SINCE 1.75
      *
      * Returns a route info object containing the name and arguments of the route which matches the given hash
      * or `undefined`.
      *
      * @returns An object containing the route `name` and the `arguments` or `undefined`
      */
    def getRouteInfoByHash(/**
      * The hash to be matched
      */
    sHash: String): js.UndefOr[RouteInfo] = js.native
    
    /**
      * Returns a target by its name.
      *
      * If you pass `myTarget: { view: "myView" })` in the config, `myTarget` is the name. See {@link sap.ui.core.routing.Targets#getTarget}.
      *
      * @returns Target with the corresponding name or `undefined`. If an array of names was passed, this will
      * return an array with all found targets. Non existing targets will not be returned but will log an error.
      */
    def getTarget(/**
      * Name of a single target or an array of names of multiple targets
      */
    vName: String): js.UndefOr[
        typings.openui5.sapUiCoreRoutingTargetMod.default | js.Array[typings.openui5.sapUiCoreRoutingTargetMod.default]
      ] = js.native
    def getTarget(
      /**
      * Name of a single target or an array of names of multiple targets
      */
    vName: js.Array[String]
    ): js.UndefOr[
        typings.openui5.sapUiCoreRoutingTargetMod.default | js.Array[typings.openui5.sapUiCoreRoutingTargetMod.default]
      ] = js.native
    
    /**
      * Returns the instance of `sap.ui.core.routing.Targets`, if you passed a `targets` configuration to the
      * router.
      *
      * @returns Instance of `Targets` which the router uses to place views or `undefined` if you did not specify
      * the `targets` parameter in the router's constructor.
      */
    def getTargets(): js.UndefOr[typings.openui5.sapUiCoreRoutingTargetsMod.default] = js.native
    
    /**
      * Returns the title history.
      *
      * History entry example:
      * ```javascript
      *
      * 	{
      * 		title: "TITLE", // The displayed title
      * 		hash: "HASH" // The url hash
      * 		isHome: "true/false" // The app home indicator
      * 	}
      * ```
      *
      *
      * @returns An array which contains the history entries.
      */
    def getTitleHistory(): js.Array[Any] = js.native
    
    /**
      * Returns the URL for the route and replaces the placeholders with the values in `oParameters`.
      *
      * @returns The unencoded pattern with interpolated arguments or `undefined` if no matching route can be
      * determined
      */
    def getURL(/**
      * Name of the route
      */
    sName: String): js.UndefOr[String] = js.native
    def getURL(
      /**
      * Name of the route
      */
    sName: String,
      /**
      * Parameters for the route
      */
    oParameters: js.Object
    ): js.UndefOr[String] = js.native
    
    /**
      * @deprecated (since 1.28.1) - use {@link #getViews} instead.
      *
      * Returns a cached view for a given name or creates it if it does not exist yet.
      *
      * @returns The view instance
      */
    def getView(
      /**
      * Name of the view
      */
    sViewName: String,
      /**
      * Type of the view
      */
    sViewType: String,
      /**
      * Optional view id
      */
    sViewId: String
    ): typings.openui5.sapUiCoreMvcViewMod.default = js.native
    
    /**
      * @SINCE 1.28
      *
      * Returns the `sap.ui.core.routing.Views` instance created by the router.
      *
      * @returns the Views instance
      */
    def getViews(): typings.openui5.sapUiCoreRoutingViewsMod.default = js.native
    
    /**
      * Attaches the router to the hash changer.
      *
      * See {@link sap.ui.core.routing.HashChanger}.
      *
      * @returns this for chaining.
      */
    def initialize(): this.type = js.native
    def initialize(
      /**
      * Since 1.48.0. Whether the current URL hash shouldn't be parsed after the router is initialized
      */
    bIgnoreInitialHash: Boolean
    ): this.type = js.native
    
    /**
      * @SINCE 1.62
      *
      * Returns whether the router is initialized by calling {@link sap.ui.core.routing.Router#initialize} function.
      *
      * @returns Whether the router is initialized
      */
    def isInitialized(): Boolean = js.native
    
    /**
      * @SINCE 1.62
      *
      * Returns whether the router is stopped by calling {@link sap.ui.core.routing.Router#stop} function.
      *
      * @returns Whether the router is stopped
      */
    def isStopped(): Boolean = js.native
    
    /**
      * @SINCE 1.58.0
      *
      * Returns whether the given hash can be matched by any of the routes in the router.
      *
      * @returns Whether the hash can be matched
      */
    def `match`(/**
      * which will be tested by the Router
      */
    sHash: String): Boolean = js.native
    
    /**
      * Navigates to a specific route defining a set of parameters.
      *
      * The parameters will be URI encoded - the characters ; , / ? : @ & = + $ are reserved and will not be
      * encoded. If you want to use special characters in your `oParameters`, you have to encode them (encodeURIComponent).
      *
      * If the given route name can't be found, an error message is logged to the console and the hash will be
      * changed to the empty string.
      *
      * This method excecutes following steps: 1. Interpolates the pattern with the given parameters 2. Sets
      * the interpolated pattern to the browser's hash 3. Reacts to the browser's `hashchange` event to find
      * out the route which matches the hash
      *
      * If there are multiple routes that have the same pattern, the call of navTo with a specific route won't
      * necessarily trigger the matching process of this route. In the end, the first route in the router configuration
      * list that matches the browser hash will be chosen.
      *
      * If the browser hash is already set with the interpolated pattern from the navTo call, nothing will happen
      * because the browser won't fire `hashchange` event in this case.
      *
      * @returns this for chaining.
      */
    def navTo(/**
      * The name of the route
      */
    sName: String): this.type = js.native
    def navTo(
      /**
      * The name of the route
      */
    sName: String,
      /**
      * The parameters for the route. As of Version 1.75 the recommendation is naming the query parameter with
      * a leading "?" character, which is identical to the definition in the route's pattern. The old syntax
      * without a leading "?" character is deprecated. e.g. **Route:** `{parameterName1}/:parameterName2:/{?queryParameterName}`
      * **Parameter:**
      * ```javascript
      *
      * 				{
      * 					parameterName1: "parameterValue1",
      * 					parameterName2: "parameterValue2",
      * 					"?queryParameterName": {
      * 						queryParameterName1: "queryParameterValue1"
      * 					}
      * 				}
      * 				```
      */
    oParameters: js.Object
    ): this.type = js.native
    def navTo(
      /**
      * The name of the route
      */
    sName: String,
      /**
      * The parameters for the route. As of Version 1.75 the recommendation is naming the query parameter with
      * a leading "?" character, which is identical to the definition in the route's pattern. The old syntax
      * without a leading "?" character is deprecated. e.g. **Route:** `{parameterName1}/:parameterName2:/{?queryParameterName}`
      * **Parameter:**
      * ```javascript
      *
      * 				{
      * 					parameterName1: "parameterValue1",
      * 					parameterName2: "parameterValue2",
      * 					"?queryParameterName": {
      * 						queryParameterName1: "queryParameterValue1"
      * 					}
      * 				}
      * 				```
      */
    oParameters: js.Object,
      /**
      * Information for route name and parameters of the router in nested components. When any target of the
      * route which is specified with the `sName` parameter loads a component and a route of this component whose
      * pattern is different than an empty string should be matched directly with this navTo call, the route
      * name and its parameters can be given by using this parameter. Information for deeper nested component
      * target can be given within the `componentTargetInfo` property which contains the same properties as the
      * top level.
      */
    oComponentTargetInfo: Unit,
      /**
      * If set to `true`, the hash is replaced, and there will be no entry in the browser history. If set to
      * `false`, the hash is set and the entry is stored in the browser history.
      */
    bReplace: Boolean
    ): this.type = js.native
    def navTo(
      /**
      * The name of the route
      */
    sName: String,
      /**
      * The parameters for the route. As of Version 1.75 the recommendation is naming the query parameter with
      * a leading "?" character, which is identical to the definition in the route's pattern. The old syntax
      * without a leading "?" character is deprecated. e.g. **Route:** `{parameterName1}/:parameterName2:/{?queryParameterName}`
      * **Parameter:**
      * ```javascript
      *
      * 				{
      * 					parameterName1: "parameterValue1",
      * 					parameterName2: "parameterValue2",
      * 					"?queryParameterName": {
      * 						queryParameterName1: "queryParameterValue1"
      * 					}
      * 				}
      * 				```
      */
    oParameters: js.Object,
      /**
      * Information for route name and parameters of the router in nested components. When any target of the
      * route which is specified with the `sName` parameter loads a component and a route of this component whose
      * pattern is different than an empty string should be matched directly with this navTo call, the route
      * name and its parameters can be given by using this parameter. Information for deeper nested component
      * target can be given within the `componentTargetInfo` property which contains the same properties as the
      * top level.
      */
    oComponentTargetInfo: `30`
    ): this.type = js.native
    def navTo(
      /**
      * The name of the route
      */
    sName: String,
      /**
      * The parameters for the route. As of Version 1.75 the recommendation is naming the query parameter with
      * a leading "?" character, which is identical to the definition in the route's pattern. The old syntax
      * without a leading "?" character is deprecated. e.g. **Route:** `{parameterName1}/:parameterName2:/{?queryParameterName}`
      * **Parameter:**
      * ```javascript
      *
      * 				{
      * 					parameterName1: "parameterValue1",
      * 					parameterName2: "parameterValue2",
      * 					"?queryParameterName": {
      * 						queryParameterName1: "queryParameterValue1"
      * 					}
      * 				}
      * 				```
      */
    oParameters: js.Object,
      /**
      * Information for route name and parameters of the router in nested components. When any target of the
      * route which is specified with the `sName` parameter loads a component and a route of this component whose
      * pattern is different than an empty string should be matched directly with this navTo call, the route
      * name and its parameters can be given by using this parameter. Information for deeper nested component
      * target can be given within the `componentTargetInfo` property which contains the same properties as the
      * top level.
      */
    oComponentTargetInfo: `30`,
      /**
      * If set to `true`, the hash is replaced, and there will be no entry in the browser history. If set to
      * `false`, the hash is set and the entry is stored in the browser history.
      */
    bReplace: Boolean
    ): this.type = js.native
    def navTo(
      /**
      * The name of the route
      */
    sName: String,
      /**
      * The parameters for the route. As of Version 1.75 the recommendation is naming the query parameter with
      * a leading "?" character, which is identical to the definition in the route's pattern. The old syntax
      * without a leading "?" character is deprecated. e.g. **Route:** `{parameterName1}/:parameterName2:/{?queryParameterName}`
      * **Parameter:**
      * ```javascript
      *
      * 				{
      * 					parameterName1: "parameterValue1",
      * 					parameterName2: "parameterValue2",
      * 					"?queryParameterName": {
      * 						queryParameterName1: "queryParameterValue1"
      * 					}
      * 				}
      * 				```
      */
    oParameters: Unit,
      /**
      * Information for route name and parameters of the router in nested components. When any target of the
      * route which is specified with the `sName` parameter loads a component and a route of this component whose
      * pattern is different than an empty string should be matched directly with this navTo call, the route
      * name and its parameters can be given by using this parameter. Information for deeper nested component
      * target can be given within the `componentTargetInfo` property which contains the same properties as the
      * top level.
      */
    oComponentTargetInfo: Unit,
      /**
      * If set to `true`, the hash is replaced, and there will be no entry in the browser history. If set to
      * `false`, the hash is set and the entry is stored in the browser history.
      */
    bReplace: Boolean
    ): this.type = js.native
    def navTo(
      /**
      * The name of the route
      */
    sName: String,
      /**
      * The parameters for the route. As of Version 1.75 the recommendation is naming the query parameter with
      * a leading "?" character, which is identical to the definition in the route's pattern. The old syntax
      * without a leading "?" character is deprecated. e.g. **Route:** `{parameterName1}/:parameterName2:/{?queryParameterName}`
      * **Parameter:**
      * ```javascript
      *
      * 				{
      * 					parameterName1: "parameterValue1",
      * 					parameterName2: "parameterValue2",
      * 					"?queryParameterName": {
      * 						queryParameterName1: "queryParameterValue1"
      * 					}
      * 				}
      * 				```
      */
    oParameters: Unit,
      /**
      * Information for route name and parameters of the router in nested components. When any target of the
      * route which is specified with the `sName` parameter loads a component and a route of this component whose
      * pattern is different than an empty string should be matched directly with this navTo call, the route
      * name and its parameters can be given by using this parameter. Information for deeper nested component
      * target can be given within the `componentTargetInfo` property which contains the same properties as the
      * top level.
      */
    oComponentTargetInfo: `30`
    ): this.type = js.native
    def navTo(
      /**
      * The name of the route
      */
    sName: String,
      /**
      * The parameters for the route. As of Version 1.75 the recommendation is naming the query parameter with
      * a leading "?" character, which is identical to the definition in the route's pattern. The old syntax
      * without a leading "?" character is deprecated. e.g. **Route:** `{parameterName1}/:parameterName2:/{?queryParameterName}`
      * **Parameter:**
      * ```javascript
      *
      * 				{
      * 					parameterName1: "parameterValue1",
      * 					parameterName2: "parameterValue2",
      * 					"?queryParameterName": {
      * 						queryParameterName1: "queryParameterValue1"
      * 					}
      * 				}
      * 				```
      */
    oParameters: Unit,
      /**
      * Information for route name and parameters of the router in nested components. When any target of the
      * route which is specified with the `sName` parameter loads a component and a route of this component whose
      * pattern is different than an empty string should be matched directly with this navTo call, the route
      * name and its parameters can be given by using this parameter. Information for deeper nested component
      * target can be given within the `componentTargetInfo` property which contains the same properties as the
      * top level.
      */
    oComponentTargetInfo: `30`,
      /**
      * If set to `true`, the hash is replaced, and there will be no entry in the browser history. If set to
      * `false`, the hash is set and the entry is stored in the browser history.
      */
    bReplace: Boolean
    ): this.type = js.native
    
    /**
      * Will trigger routing events + place targets for routes matching the string.
      */
    def parse(/**
      * A new hash
      */
    sNewHash: String): Unit = js.native
    
    /**
      * Centrally register this router instance under a given name to be able to access it from another context,
      * just by knowing the name.
      *
      * Use {@link sap.ui.core.routing.Router.getRouter Router.getRouter()} to retrieve the instance.
      *
      * @returns The router instance
      */
    def register(/**
      * Name of the router instance
      */
    sName: String): this.type = js.native
    
    /**
      * @SINCE 1.22
      * @deprecated (since 1.28) - use {@link #getViews} instead.
      *
      * Adds or overwrites a view in the view cache of the router which will be cached under the given `sViewName`
      * and the "undefined" key.
      *
      * @returns Since 1.28, the `this` pointer for chaining
      */
    def setView(
      /**
      * Name of the view
      */
    sViewName: String,
      /**
      * The view instance
      */
    oView: typings.openui5.sapUiCoreMvcViewMod.default
    ): this.type = js.native
    
    /**
      * Stops to listen to the `hashchange` of the browser.
      *
      * If you want the router to start again, call {@link #initialize} again.
      *
      * @returns this for chaining.
      */
    def stop(): Router = js.native
  }
}
