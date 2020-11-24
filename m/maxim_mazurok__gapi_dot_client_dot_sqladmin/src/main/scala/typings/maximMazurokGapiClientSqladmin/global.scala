package typings.maximMazurokGapiClientSqladmin

import typings.maximMazurokGapiClientSqladmin.gapi.client.sqladmin.BackupRunsResource
import typings.maximMazurokGapiClientSqladmin.gapi.client.sqladmin.DatabasesResource
import typings.maximMazurokGapiClientSqladmin.gapi.client.sqladmin.FlagsResource
import typings.maximMazurokGapiClientSqladmin.gapi.client.sqladmin.InstancesResource
import typings.maximMazurokGapiClientSqladmin.gapi.client.sqladmin.OperationsResource
import typings.maximMazurokGapiClientSqladmin.gapi.client.sqladmin.ProjectsResource
import typings.maximMazurokGapiClientSqladmin.gapi.client.sqladmin.SslCertsResource
import typings.maximMazurokGapiClientSqladmin.gapi.client.sqladmin.TiersResource
import typings.maximMazurokGapiClientSqladmin.gapi.client.sqladmin.UsersResource
import typings.maximMazurokGapiClientSqladmin.maximMazurokGapiClientSqladminStrings.sqladmin
import typings.maximMazurokGapiClientSqladmin.maximMazurokGapiClientSqladminStrings.v1beta4
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
      
      /** Load Cloud SQL Admin API v1beta4 */
      def load(name: sqladmin, version: v1beta4): js.Thenable[Unit] = js.native
      def load(name: sqladmin, version: v1beta4, callback: js.Function0[_]): Unit = js.native
      
      @js.native
      object sqladmin extends js.Object {
        
        val backupRuns: BackupRunsResource = js.native
        
        val databases: DatabasesResource = js.native
        
        val flags: FlagsResource = js.native
        
        val instances: InstancesResource = js.native
        
        val operations: OperationsResource = js.native
        
        val projects: ProjectsResource = js.native
        
        val sslCerts: SslCertsResource = js.native
        
        val tiers: TiersResource = js.native
        
        val users: UsersResource = js.native
      }
    }
  }
}
