package typings.octokitPluginRestEndpointMethods

import typings.octokitCore.mod.Octokit
import typings.octokitPluginRestEndpointMethods.typesMod.Api
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object restEndpointMethods {
    
    @JSImport("@octokit/plugin-rest-endpoint-methods", "restEndpointMethods")
    @js.native
    def apply(octokit: Octokit): Api = js.native
    @JSImport("@octokit/plugin-rest-endpoint-methods", "restEndpointMethods")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@octokit/plugin-rest-endpoint-methods", "restEndpointMethods.VERSION")
    @js.native
    def VERSION: String = js.native
    @scala.inline
    def VERSION_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VERSION")(x.asInstanceOf[js.Any])
  }
}
