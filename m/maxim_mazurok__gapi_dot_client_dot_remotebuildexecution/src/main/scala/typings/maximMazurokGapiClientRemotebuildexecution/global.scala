package typings.maximMazurokGapiClientRemotebuildexecution

import typings.maximMazurokGapiClientRemotebuildexecution.gapi.client.remotebuildexecution.ActionResultsResource
import typings.maximMazurokGapiClientRemotebuildexecution.gapi.client.remotebuildexecution.ActionsResource
import typings.maximMazurokGapiClientRemotebuildexecution.gapi.client.remotebuildexecution.BlobsResource
import typings.maximMazurokGapiClientRemotebuildexecution.gapi.client.remotebuildexecution.OperationsResource
import typings.maximMazurokGapiClientRemotebuildexecution.gapi.client.remotebuildexecution.V2Resource
import typings.maximMazurokGapiClientRemotebuildexecution.maximMazurokGapiClientRemotebuildexecutionStrings.remotebuildexecution
import typings.maximMazurokGapiClientRemotebuildexecution.maximMazurokGapiClientRemotebuildexecutionStrings.v2
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object gapi {
    
    object client {
      
      @JSGlobal("gapi.client")
      @js.native
      val ^ : js.Any = js.native
      
      /** Load Remote Build Execution API v2 */
      inline def load(name: remotebuildexecution, version: v2): js.Thenable[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any])).asInstanceOf[js.Thenable[Unit]]
      inline def load(name: remotebuildexecution, version: v2, callback: js.Function0[js.Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      object remotebuildexecution {
        
        @JSGlobal("gapi.client.remotebuildexecution.actionResults")
        @js.native
        val actionResults: ActionResultsResource = js.native
        
        @JSGlobal("gapi.client.remotebuildexecution.actions")
        @js.native
        val actions: ActionsResource = js.native
        
        @JSGlobal("gapi.client.remotebuildexecution.blobs")
        @js.native
        val blobs: BlobsResource = js.native
        
        @JSGlobal("gapi.client.remotebuildexecution.operations")
        @js.native
        val operations: OperationsResource = js.native
        
        @JSGlobal("gapi.client.remotebuildexecution.v2")
        @js.native
        val v2: V2Resource = js.native
      }
    }
  }
}
