package typings.maximMazurokGapiClientLibraryagent

import typings.maximMazurokGapiClientLibraryagent.gapi.client.libraryagent.ShelvesResource
import typings.maximMazurokGapiClientLibraryagent.maximMazurokGapiClientLibraryagentStrings.libraryagent
import typings.maximMazurokGapiClientLibraryagent.maximMazurokGapiClientLibraryagentStrings.v1
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
      
      /** Load Library Agent API v1 */
      def load(name: libraryagent, version: v1): js.Thenable[Unit] = js.native
      def load(name: libraryagent, version: v1, callback: js.Function0[_]): Unit = js.native
      
      @js.native
      object libraryagent extends js.Object {
        
        val shelves: ShelvesResource = js.native
      }
    }
  }
}
