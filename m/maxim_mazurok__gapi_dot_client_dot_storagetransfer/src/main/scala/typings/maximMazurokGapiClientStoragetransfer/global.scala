package typings.maximMazurokGapiClientStoragetransfer

import typings.maximMazurokGapiClientStoragetransfer.gapi.client.storagetransfer.GoogleServiceAccountsResource
import typings.maximMazurokGapiClientStoragetransfer.gapi.client.storagetransfer.TransferJobsResource
import typings.maximMazurokGapiClientStoragetransfer.gapi.client.storagetransfer.TransferOperationsResource
import typings.maximMazurokGapiClientStoragetransfer.maximMazurokGapiClientStoragetransferStrings.storagetransfer
import typings.maximMazurokGapiClientStoragetransfer.maximMazurokGapiClientStoragetransferStrings.v1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object gapi {
    
    object client {
      
      @JSGlobal("gapi.client")
      @js.native
      val ^ : js.Any = js.native
      
      /** Load Storage Transfer API v1 */
      @scala.inline
      def load(name: storagetransfer, version: v1): js.Thenable[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any])).asInstanceOf[js.Thenable[Unit]]
      @scala.inline
      def load(name: storagetransfer, version: v1, callback: js.Function0[js.Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
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
