package typings.maximMazurokGapiClientRemotebuildexecution

import typings.maximMazurokGapiClientRemotebuildexecution.gapi.client.remotebuildexecution.ActionResultsResource
import typings.maximMazurokGapiClientRemotebuildexecution.gapi.client.remotebuildexecution.ActionsResource
import typings.maximMazurokGapiClientRemotebuildexecution.gapi.client.remotebuildexecution.BlobsResource
import typings.maximMazurokGapiClientRemotebuildexecution.gapi.client.remotebuildexecution.OperationsResource
import typings.maximMazurokGapiClientRemotebuildexecution.gapi.client.remotebuildexecution.V2Resource
import typings.maximMazurokGapiClientRemotebuildexecution.maximMazurokGapiClientRemotebuildexecutionStrings.remotebuildexecution
import typings.maximMazurokGapiClientRemotebuildexecution.maximMazurokGapiClientRemotebuildexecutionStrings.v2
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
      
      /** Load Remote Build Execution API v2 */
      def load(name: remotebuildexecution, version: v2): js.Thenable[Unit] = js.native
      def load(name: remotebuildexecution, version: v2, callback: js.Function0[_]): Unit = js.native
      
      @js.native
      object remotebuildexecution extends js.Object {
        
        val actionResults: ActionResultsResource = js.native
        
        val actions: ActionsResource = js.native
        
        val blobs: BlobsResource = js.native
        
        val operations: OperationsResource = js.native
        
        val v2: V2Resource = js.native
      }
    }
  }
}
