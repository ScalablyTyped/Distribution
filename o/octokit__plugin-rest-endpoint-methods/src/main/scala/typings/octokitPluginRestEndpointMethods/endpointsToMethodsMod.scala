package typings.octokitPluginRestEndpointMethods

import typings.octokitCore.mod.Octokit
import typings.octokitPluginRestEndpointMethods.methodTypesMod.RestEndpointMethods
import typings.octokitPluginRestEndpointMethods.typesMod.EndpointsDefaultsAndDecorations
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object endpointsToMethodsMod {
  
  @JSImport("@octokit/plugin-rest-endpoint-methods/dist-types/endpoints-to-methods", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def endpointsToMethods(octokit: Octokit, endpointsMap: EndpointsDefaultsAndDecorations): RestEndpointMethods = (^.asInstanceOf[js.Dynamic].applyDynamic("endpointsToMethods")(octokit.asInstanceOf[js.Any], endpointsMap.asInstanceOf[js.Any])).asInstanceOf[RestEndpointMethods]
}
