package typings.maximMazurokGapiClientLogging

import typings.maximMazurokGapiClientLogging.gapi.client.logging.BillingAccountsResource
import typings.maximMazurokGapiClientLogging.gapi.client.logging.EntriesResource
import typings.maximMazurokGapiClientLogging.gapi.client.logging.ExclusionsResource
import typings.maximMazurokGapiClientLogging.gapi.client.logging.FoldersResource
import typings.maximMazurokGapiClientLogging.gapi.client.logging.LocationsResource
import typings.maximMazurokGapiClientLogging.gapi.client.logging.LogsResource
import typings.maximMazurokGapiClientLogging.gapi.client.logging.MonitoredResourceDescriptorsResource
import typings.maximMazurokGapiClientLogging.gapi.client.logging.OrganizationsResource
import typings.maximMazurokGapiClientLogging.gapi.client.logging.ProjectsResource
import typings.maximMazurokGapiClientLogging.gapi.client.logging.SinksResource
import typings.maximMazurokGapiClientLogging.gapi.client.logging.V2Resource
import typings.maximMazurokGapiClientLogging.maximMazurokGapiClientLoggingStrings.logging
import typings.maximMazurokGapiClientLogging.maximMazurokGapiClientLoggingStrings.v2
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object gapi {
    
    object client {
      
      @JSGlobal("gapi.client")
      @js.native
      val ^ : js.Any = js.native
      
      /** Load Cloud Logging API v2 */
      @scala.inline
      def load(name: logging, version: v2): js.Thenable[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any])).asInstanceOf[js.Thenable[Unit]]
      @scala.inline
      def load(name: logging, version: v2, callback: js.Function0[js.Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      object logging {
        
        @JSGlobal("gapi.client.logging.billingAccounts")
        @js.native
        val billingAccounts: BillingAccountsResource = js.native
        
        @JSGlobal("gapi.client.logging.entries")
        @js.native
        val entries: EntriesResource = js.native
        
        @JSGlobal("gapi.client.logging.exclusions")
        @js.native
        val exclusions: ExclusionsResource = js.native
        
        @JSGlobal("gapi.client.logging.folders")
        @js.native
        val folders: FoldersResource = js.native
        
        @JSGlobal("gapi.client.logging.locations")
        @js.native
        val locations: LocationsResource = js.native
        
        @JSGlobal("gapi.client.logging.logs")
        @js.native
        val logs: LogsResource = js.native
        
        @JSGlobal("gapi.client.logging.monitoredResourceDescriptors")
        @js.native
        val monitoredResourceDescriptors: MonitoredResourceDescriptorsResource = js.native
        
        @JSGlobal("gapi.client.logging.organizations")
        @js.native
        val organizations: OrganizationsResource = js.native
        
        @JSGlobal("gapi.client.logging.projects")
        @js.native
        val projects: ProjectsResource = js.native
        
        @JSGlobal("gapi.client.logging.sinks")
        @js.native
        val sinks: SinksResource = js.native
        
        @JSGlobal("gapi.client.logging.v2")
        @js.native
        val v2: V2Resource = js.native
      }
    }
  }
}
