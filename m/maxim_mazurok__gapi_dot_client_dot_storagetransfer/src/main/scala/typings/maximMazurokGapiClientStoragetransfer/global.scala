package typings.maximMazurokGapiClientStoragetransfer

import typings.maximMazurokGapiClientStoragetransfer.gapi.client.storagetransfer.GoogleServiceAccountsResource
import typings.maximMazurokGapiClientStoragetransfer.gapi.client.storagetransfer.TransferJobsResource
import typings.maximMazurokGapiClientStoragetransfer.gapi.client.storagetransfer.TransferOperationsResource
import typings.maximMazurokGapiClientStoragetransfer.maximMazurokGapiClientStoragetransferStrings.storagetransfer
import typings.maximMazurokGapiClientStoragetransfer.maximMazurokGapiClientStoragetransferStrings.v1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object gapi {
    
    object client {
      
      /** Load Storage Transfer API v1 */
      @JSGlobal("gapi.client.load")
      @js.native
      def load(name: storagetransfer, version: v1): js.Thenable[Unit] = js.native
      @JSGlobal("gapi.client.load")
      @js.native
      def load(name: storagetransfer, version: v1, callback: js.Function0[_]): Unit = js.native
      
      object storagetransfer {
        
        @JSGlobal("gapi.client.storagetransfer.googleServiceAccounts")
        @js.native
        val googleServiceAccounts: GoogleServiceAccountsResource = js.native
        
        @JSGlobal("gapi.client.storagetransfer.transferJobs")
        @js.native
        val transferJobs: TransferJobsResource = js.native
        
        @JSGlobal("gapi.client.storagetransfer.transferOperations")
        @js.native
        val transferOperations: TransferOperationsResource = js.native
      }
    }
  }
}
