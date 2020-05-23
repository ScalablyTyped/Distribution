package typings.octokitPluginRestEndpointMethods

import typings.octokitCore.mod.Octokit
import typings.octokitPluginRestEndpointMethods.typesMod.Api
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@octokit/plugin-rest-endpoint-methods", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  object restEndpointMethods extends js.Object {
    var VERSION: String = js.native
    def apply(octokit: Octokit): Api = js.native
  }
  
}

