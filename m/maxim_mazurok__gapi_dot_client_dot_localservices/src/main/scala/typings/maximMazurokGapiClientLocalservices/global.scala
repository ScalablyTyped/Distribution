package typings.maximMazurokGapiClientLocalservices

import typings.maximMazurokGapiClientLocalservices.gapi.client.localservices.AccountReportsResource
import typings.maximMazurokGapiClientLocalservices.gapi.client.localservices.DetailedLeadReportsResource
import typings.maximMazurokGapiClientLocalservices.maximMazurokGapiClientLocalservicesStrings.localservices
import typings.maximMazurokGapiClientLocalservices.maximMazurokGapiClientLocalservicesStrings.v1
import typings.std.PromiseLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object gapi {
    
    object client {
      
      @JSGlobal("gapi.client")
      @js.native
      val ^ : js.Any = js.native
      
      /** Load Local Services API v1 */
      inline def load(name: localservices, version: v1): PromiseLike[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any])).asInstanceOf[PromiseLike[Unit]]
      inline def load(name: localservices, version: v1, callback: js.Function0[Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      object localservices {
        
        @JSGlobal("gapi.client.localservices.accountReports")
        @js.native
        val accountReports: AccountReportsResource = js.native
        
        @JSGlobal("gapi.client.localservices.detailedLeadReports")
        @js.native
        val detailedLeadReports: DetailedLeadReportsResource = js.native
      }
    }
  }
}
