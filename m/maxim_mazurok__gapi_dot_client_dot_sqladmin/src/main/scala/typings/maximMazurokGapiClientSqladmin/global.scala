package typings.maximMazurokGapiClientSqladmin

import typings.maximMazurokGapiClientSqladmin.gapi.client.sqladmin.BackupRunsResource
import typings.maximMazurokGapiClientSqladmin.gapi.client.sqladmin.ConnectResource
import typings.maximMazurokGapiClientSqladmin.gapi.client.sqladmin.DatabasesResource
import typings.maximMazurokGapiClientSqladmin.gapi.client.sqladmin.FlagsResource
import typings.maximMazurokGapiClientSqladmin.gapi.client.sqladmin.InstancesResource
import typings.maximMazurokGapiClientSqladmin.gapi.client.sqladmin.OperationsResource
import typings.maximMazurokGapiClientSqladmin.gapi.client.sqladmin.ProjectsResource
import typings.maximMazurokGapiClientSqladmin.gapi.client.sqladmin.SslCertsResource
import typings.maximMazurokGapiClientSqladmin.gapi.client.sqladmin.TiersResource
import typings.maximMazurokGapiClientSqladmin.gapi.client.sqladmin.UsersResource
import typings.maximMazurokGapiClientSqladmin.maximMazurokGapiClientSqladminStrings.sqladmin
import typings.maximMazurokGapiClientSqladmin.maximMazurokGapiClientSqladminStrings.v1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object gapi {
    
    object client {
      
      @JSGlobal("gapi.client")
      @js.native
      val ^ : js.Any = js.native
      
      /** Load Cloud SQL Admin API v1 */
      inline def load(name: sqladmin, version: v1): js.Thenable[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any])).asInstanceOf[js.Thenable[Unit]]
      inline def load(name: sqladmin, version: v1, callback: js.Function0[Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      object sqladmin {
        
        @JSGlobal("gapi.client.sqladmin.backupRuns")
        @js.native
        val backupRuns: BackupRunsResource = js.native
        
        @JSGlobal("gapi.client.sqladmin.connect")
        @js.native
        val connect: ConnectResource = js.native
        
        @JSGlobal("gapi.client.sqladmin.databases")
        @js.native
        val databases: DatabasesResource = js.native
        
        @JSGlobal("gapi.client.sqladmin.flags")
        @js.native
        val flags: FlagsResource = js.native
        
        @JSGlobal("gapi.client.sqladmin.instances")
        @js.native
        val instances: InstancesResource = js.native
        
        @JSGlobal("gapi.client.sqladmin.operations")
        @js.native
        val operations: OperationsResource = js.native
        
        @JSGlobal("gapi.client.sqladmin.projects")
        @js.native
        val projects: ProjectsResource = js.native
        
        @JSGlobal("gapi.client.sqladmin.sslCerts")
        @js.native
        val sslCerts: SslCertsResource = js.native
        
        @JSGlobal("gapi.client.sqladmin.tiers")
        @js.native
        val tiers: TiersResource = js.native
        
        @JSGlobal("gapi.client.sqladmin.users")
        @js.native
        val users: UsersResource = js.native
      }
    }
  }
}
