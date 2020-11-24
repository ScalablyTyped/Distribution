package typings.maximMazurokGapiClientEventarc

import typings.maximMazurokGapiClientEventarc.gapi.client.eventarc.ProjectsResource
import typings.maximMazurokGapiClientEventarc.maximMazurokGapiClientEventarcStrings.eventarc
import typings.maximMazurokGapiClientEventarc.maximMazurokGapiClientEventarcStrings.v1beta1
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
      
      /** Load Eventarc API v1beta1 */
      def load(name: eventarc, version: v1beta1): js.Thenable[Unit] = js.native
      def load(name: eventarc, version: v1beta1, callback: js.Function0[_]): Unit = js.native
      
      @js.native
      object eventarc extends js.Object {
        
        val projects: ProjectsResource = js.native
      }
    }
  }
}
