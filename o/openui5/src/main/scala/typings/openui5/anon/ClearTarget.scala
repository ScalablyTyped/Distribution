package typings.openui5.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClearTarget extends StObject {
  
  /**
    * **Deprecated since 1.28, use `target.clearControlAggregation` instead.**
    *  Defines a boolean that can be passed to specify if the aggregation should be cleared before adding the
    * View to it. When using an {@link sap.ui.ux3.Shell} this should be true. For an {@link sap.m.NavContainer}
    * it should be false
    */
  var clearTarget: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Since 1.27. By default only the first route matching the hash, will fire events. If greedy is turned
    * on for a route, its events will be fired even if another route has already matched.
    */
  var greedy: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Name of the route, it will be used to retrieve the route from the router, it needs to be unique per router
    * instance
    */
  var name: String
  
  /**
    * Since 1.32. This property contains the information about the route which nests this route in the form:
    * "[componentName:]routeName". The nesting routes pattern will be prefixed to this routes pattern and hence
    * the nesting route also matches if this one matches.
    */
  var parent: js.UndefOr[String] = js.undefined
  
  /**
    * URL pattern where it needs to match again. A pattern may consist of the following:
    * 	 -  hardcoded parts: "pattern" : "product/settings" - this pattern will only match if the hash of the
    * 			browser is product/settings and no arguments will be passed to the events of the route.
    *
    * 	 -  mandatory parameters: "pattern" : "product/{id}" - {id} is a mandatory parameter, e. g. the following
    * 			hashes would match: product/5, product/3. The pattenMatched event will get 5 or 3 passed as id in its
    * 			arguments.The hash product/ will not match.
    *
    * 	 -  optional parameters: "pattern" : "product/{id}/detail/:detailId:" - :detailId: is an optional parameter,
    * 			e. g. the following hashes would match: product/5/detail, product/3/detail/2
    *
    * 	 -  query parameters: "pattern" : "product{?query}" // {?query} allows you to pass queries with any
    * 			parameters, e. g. the following hashes would match: product?first=firstValue, product?first=firstValue&second=secondValue
    *    rest as string parameters: "pattern" : ":all*:" - this pattern will define an optional variable
    * that will pass the whole hash as string to the routing events. It may be used to define a catchall route,
    * e. g. the following hashes would match: foo, product/5/3, product/5/detail/3/foo. You can also combine
    * it with the other variables but make sure a variable with a * is the last one.
    */
  var pattern: js.UndefOr[String] = js.undefined
  
  /**
    * **Deprecated since 1.28, use `targets.parent` instead.** one or multiple route configs taking all of
    * these parameters again. If a subroute is hit, it will fire the routeMatched event for all its parents.
    * The routePatternMatched event will only be fired for the subroute not the parents. The routing will also
    * display all the targets of the subroutes and its parents.
    */
  var subroutes: js.UndefOr[js.Object] = js.undefined
  
  /**
    * One or multiple name of targets {@link sap.ui.core.routing.Targets}. As soon as the route matches, the
    * target(s) will be displayed. All the deprecated parameters are ignored, if a target is used.
    */
  var target: js.UndefOr[String | js.Array[String]] = js.undefined
  
  /**
    * **Deprecated since 1.28, use `target.controlAggregation` instead.**
    *  The name of an aggregation of the targetControl, that contains views. Eg: an {@link sap.m.NavContainer}
    * has an aggregation "pages", another Example is the {@link sap.ui.ux3.Shell} it has "content".
    */
  var targetAggregation: js.UndefOr[String] = js.undefined
  
  /**
    * **Deprecated since 1.28, use `target.controlId` instead.**
    *  Views will be put into a container Control, this might be an {@link sap.ui.ux3.Shell} control or an
    * {@link sap.m.NavContainer} if working with mobile, or any other container. The id of this control has
    * to be put in here
    */
  var targetControl: js.UndefOr[String] = js.undefined
  
  /**
    * **Deprecated since 1.28, use `config.rootView` (only available in the router config) instead.**
    *  The id of the parent of the targetControl - This should be the id view your targetControl is located
    * in. By default, this will be the view created by a component, or if the Route is a subroute the view
    * of the parent route is taken. You only need to specify this, if you are not using a router created by
    * a component on your top level routes
    */
  var targetParent: js.UndefOr[String] = js.undefined
  
  /**
    * **Deprecated since 1.28, use `target.viewName` instead.**
    *  The name of a view that will be created, the first time this route will be matched. To place the view
    * into a Control use the targetAggregation and targetControl. Views will only be created once per Router
    */
  var view: js.UndefOr[String] = js.undefined
  
  /**
    * **Deprecated since 1.28, use `target.viewPath` instead.**
    *  A prefix that will be prepended in front of the view eg: view is set to "myView" and viewPath is set
    * to "myApp" - the created view will be "myApp.myView"
    */
  var viewPath: js.UndefOr[String] = js.undefined
  
  /**
    * **Deprecated since 1.28, use `target.viewType` instead.**
    *  The type of the view that is going to be created. eg: "XML", "JS"
    */
  var viewType: js.UndefOr[String] = js.undefined
}
object ClearTarget {
  
  inline def apply(name: String): ClearTarget = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClearTarget]
  }
  
  extension [Self <: ClearTarget](x: Self) {
    
    inline def setClearTarget(value: Boolean): Self = StObject.set(x, "clearTarget", value.asInstanceOf[js.Any])
    
    inline def setClearTargetUndefined: Self = StObject.set(x, "clearTarget", js.undefined)
    
    inline def setGreedy(value: Boolean): Self = StObject.set(x, "greedy", value.asInstanceOf[js.Any])
    
    inline def setGreedyUndefined: Self = StObject.set(x, "greedy", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    inline def setPattern(value: String): Self = StObject.set(x, "pattern", value.asInstanceOf[js.Any])
    
    inline def setPatternUndefined: Self = StObject.set(x, "pattern", js.undefined)
    
    inline def setSubroutes(value: js.Object): Self = StObject.set(x, "subroutes", value.asInstanceOf[js.Any])
    
    inline def setSubroutesUndefined: Self = StObject.set(x, "subroutes", js.undefined)
    
    inline def setTarget(value: String | js.Array[String]): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setTargetAggregation(value: String): Self = StObject.set(x, "targetAggregation", value.asInstanceOf[js.Any])
    
    inline def setTargetAggregationUndefined: Self = StObject.set(x, "targetAggregation", js.undefined)
    
    inline def setTargetControl(value: String): Self = StObject.set(x, "targetControl", value.asInstanceOf[js.Any])
    
    inline def setTargetControlUndefined: Self = StObject.set(x, "targetControl", js.undefined)
    
    inline def setTargetParent(value: String): Self = StObject.set(x, "targetParent", value.asInstanceOf[js.Any])
    
    inline def setTargetParentUndefined: Self = StObject.set(x, "targetParent", js.undefined)
    
    inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
    
    inline def setTargetVarargs(value: String*): Self = StObject.set(x, "target", js.Array(value*))
    
    inline def setView(value: String): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
    
    inline def setViewPath(value: String): Self = StObject.set(x, "viewPath", value.asInstanceOf[js.Any])
    
    inline def setViewPathUndefined: Self = StObject.set(x, "viewPath", js.undefined)
    
    inline def setViewType(value: String): Self = StObject.set(x, "viewType", value.asInstanceOf[js.Any])
    
    inline def setViewTypeUndefined: Self = StObject.set(x, "viewType", js.undefined)
    
    inline def setViewUndefined: Self = StObject.set(x, "view", js.undefined)
  }
}
