package typings.octokitPluginRestEndpointMethods

import typings.octokitCore.mod.Octokit
import typings.octokitPluginRestEndpointMethods.typesMod.Api
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@octokit/plugin-rest-endpoint-methods", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  @js.native
  object restEndpointMethods extends js.Object {
    
    def apply(octokit: Octokit): Api = js.native
    
    var VERSION: String = js.native
  }
}
