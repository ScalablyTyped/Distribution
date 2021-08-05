package typings.octokitEndpoint

import typings.octokitTypes.endpointDefaultsMod.EndpointDefaults
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.octokitTypes.routeMod.Route
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mergeMod {
  
  @JSImport("@octokit/endpoint/dist-types/merge", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def merge(): EndpointDefaults = ^.asInstanceOf[js.Dynamic].applyDynamic("merge")().asInstanceOf[EndpointDefaults]
  inline def merge(defaults: Null, route: Unit, options: RequestParameters): EndpointDefaults = (^.asInstanceOf[js.Dynamic].applyDynamic("merge")(defaults.asInstanceOf[js.Any], route.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[EndpointDefaults]
  inline def merge(defaults: Null, route: RequestParameters): EndpointDefaults = (^.asInstanceOf[js.Dynamic].applyDynamic("merge")(defaults.asInstanceOf[js.Any], route.asInstanceOf[js.Any])).asInstanceOf[EndpointDefaults]
  inline def merge(defaults: Null, route: RequestParameters, options: RequestParameters): EndpointDefaults = (^.asInstanceOf[js.Dynamic].applyDynamic("merge")(defaults.asInstanceOf[js.Any], route.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[EndpointDefaults]
  inline def merge(defaults: Null, route: Route): EndpointDefaults = (^.asInstanceOf[js.Dynamic].applyDynamic("merge")(defaults.asInstanceOf[js.Any], route.asInstanceOf[js.Any])).asInstanceOf[EndpointDefaults]
  inline def merge(defaults: Null, route: Route, options: RequestParameters): EndpointDefaults = (^.asInstanceOf[js.Dynamic].applyDynamic("merge")(defaults.asInstanceOf[js.Any], route.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[EndpointDefaults]
  inline def merge(defaults: EndpointDefaults): EndpointDefaults = ^.asInstanceOf[js.Dynamic].applyDynamic("merge")(defaults.asInstanceOf[js.Any]).asInstanceOf[EndpointDefaults]
  inline def merge(defaults: EndpointDefaults, route: Unit, options: RequestParameters): EndpointDefaults = (^.asInstanceOf[js.Dynamic].applyDynamic("merge")(defaults.asInstanceOf[js.Any], route.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[EndpointDefaults]
  inline def merge(defaults: EndpointDefaults, route: RequestParameters): EndpointDefaults = (^.asInstanceOf[js.Dynamic].applyDynamic("merge")(defaults.asInstanceOf[js.Any], route.asInstanceOf[js.Any])).asInstanceOf[EndpointDefaults]
  inline def merge(defaults: EndpointDefaults, route: RequestParameters, options: RequestParameters): EndpointDefaults = (^.asInstanceOf[js.Dynamic].applyDynamic("merge")(defaults.asInstanceOf[js.Any], route.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[EndpointDefaults]
  inline def merge(defaults: EndpointDefaults, route: Route): EndpointDefaults = (^.asInstanceOf[js.Dynamic].applyDynamic("merge")(defaults.asInstanceOf[js.Any], route.asInstanceOf[js.Any])).asInstanceOf[EndpointDefaults]
  inline def merge(defaults: EndpointDefaults, route: Route, options: RequestParameters): EndpointDefaults = (^.asInstanceOf[js.Dynamic].applyDynamic("merge")(defaults.asInstanceOf[js.Any], route.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[EndpointDefaults]
}
