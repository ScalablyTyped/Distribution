package typings.maximMazurokGapiClientOsconfig

import typings.maximMazurokGapiClientOsconfig.gapi.client.osconfig.ProjectsResource
import typings.maximMazurokGapiClientOsconfig.maximMazurokGapiClientOsconfigStrings.osconfig
import typings.maximMazurokGapiClientOsconfig.maximMazurokGapiClientOsconfigStrings.v1
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobalScope
@js.native
object global extends js.Object {
  
  @js.native
  object gapi extends js.Object {
    
    @js.native
    object client extends js.Object {
      
      /** Load OS Config API v1 */
      def load(name: osconfig, version: v1): js.Thenable[Unit] = js.native
      def load(name: osconfig, version: v1, callback: js.Function0[_]): Unit = js.native
      
      @js.native
      object osconfig extends js.Object {
        
        val projects: ProjectsResource = js.native
      }
    }
  }
}
