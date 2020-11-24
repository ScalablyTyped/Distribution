package typings.octokitPluginRestEndpointMethods

import typings.octokitCore.mod.Octokit
import typings.octokitPluginRestEndpointMethods.methodTypesMod.RestEndpointMethods
import typings.octokitPluginRestEndpointMethods.typesMod.EndpointsDefaultsAndDecorations
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@octokit/plugin-rest-endpoint-methods/dist-types/endpoints-to-methods", JSImport.Namespace)
@js.native
object endpointsToMethodsMod extends js.Object {
  
  def endpointsToMethods(octokit: Octokit, endpointsMap: EndpointsDefaultsAndDecorations): RestEndpointMethods = js.native
}
