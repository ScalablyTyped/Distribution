package typings.octokitEndpoint

import typings.octokitTypes.endpointDefaultsMod.EndpointDefaults
import typings.octokitTypes.endpointOptionsMod.EndpointOptions
import typings.octokitTypes.requestOptionsMod.RequestOptions
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.octokitTypes.routeMod.Route
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object endpointWithDefaultsMod {
  
  @JSImport("@octokit/endpoint/dist-types/endpoint-with-defaults", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def endpointWithDefaults(defaults: EndpointDefaults, route: EndpointOptions): RequestOptions = (^.asInstanceOf[js.Dynamic].applyDynamic("endpointWithDefaults")(defaults.asInstanceOf[js.Any], route.asInstanceOf[js.Any])).asInstanceOf[RequestOptions]
  inline def endpointWithDefaults(defaults: EndpointDefaults, route: EndpointOptions, options: RequestParameters): RequestOptions = (^.asInstanceOf[js.Dynamic].applyDynamic("endpointWithDefaults")(defaults.asInstanceOf[js.Any], route.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[RequestOptions]
  inline def endpointWithDefaults(defaults: EndpointDefaults, route: Route): RequestOptions = (^.asInstanceOf[js.Dynamic].applyDynamic("endpointWithDefaults")(defaults.asInstanceOf[js.Any], route.asInstanceOf[js.Any])).asInstanceOf[RequestOptions]
  inline def endpointWithDefaults(defaults: EndpointDefaults, route: Route, options: RequestParameters): RequestOptions = (^.asInstanceOf[js.Dynamic].applyDynamic("endpointWithDefaults")(defaults.asInstanceOf[js.Any], route.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[RequestOptions]
}
