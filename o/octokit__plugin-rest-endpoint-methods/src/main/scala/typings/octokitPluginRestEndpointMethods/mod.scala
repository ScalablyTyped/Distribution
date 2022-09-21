package typings.octokitPluginRestEndpointMethods

import typings.octokitCore.mod.Octokit
import typings.octokitPluginRestEndpointMethods.methodTypesMod.RestEndpointMethods
import typings.octokitPluginRestEndpointMethods.typesMod.Api
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object legacyRestEndpointMethods {
    
    inline def apply(octokit: Octokit): RestEndpointMethods & Api = ^.asInstanceOf[js.Dynamic].apply(octokit.asInstanceOf[js.Any]).asInstanceOf[RestEndpointMethods & Api]
    
    @JSImport("@octokit/plugin-rest-endpoint-methods", "legacyRestEndpointMethods")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@octokit/plugin-rest-endpoint-methods", "legacyRestEndpointMethods.VERSION")
    @js.native
    def VERSION: String = js.native
    inline def VERSION_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VERSION")(x.asInstanceOf[js.Any])
  }
  
  object restEndpointMethods {
    
    inline def apply(octokit: Octokit): Api = ^.asInstanceOf[js.Dynamic].apply(octokit.asInstanceOf[js.Any]).asInstanceOf[Api]
    
    @JSImport("@octokit/plugin-rest-endpoint-methods", "restEndpointMethods")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@octokit/plugin-rest-endpoint-methods", "restEndpointMethods.VERSION")
    @js.native
    def VERSION: String = js.native
    inline def VERSION_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VERSION")(x.asInstanceOf[js.Any])
  }
}
