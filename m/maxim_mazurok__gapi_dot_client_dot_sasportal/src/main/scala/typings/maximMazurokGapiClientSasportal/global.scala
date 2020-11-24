package typings.maximMazurokGapiClientSasportal

import typings.maximMazurokGapiClientSasportal.gapi.client.sasportal.CustomersResource
import typings.maximMazurokGapiClientSasportal.gapi.client.sasportal.DeploymentsResource
import typings.maximMazurokGapiClientSasportal.gapi.client.sasportal.InstallerResource
import typings.maximMazurokGapiClientSasportal.gapi.client.sasportal.NodesResource
import typings.maximMazurokGapiClientSasportal.gapi.client.sasportal.PoliciesResource
import typings.maximMazurokGapiClientSasportal.maximMazurokGapiClientSasportalStrings.sasportal
import typings.maximMazurokGapiClientSasportal.maximMazurokGapiClientSasportalStrings.v1alpha1
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
      
      /** Load SAS Portal API v1alpha1 */
      def load(name: sasportal, version: v1alpha1): js.Thenable[Unit] = js.native
      def load(name: sasportal, version: v1alpha1, callback: js.Function0[_]): Unit = js.native
      
      @js.native
      object sasportal extends js.Object {
        
        val customers: CustomersResource = js.native
        
        val deployments: DeploymentsResource = js.native
        
        val installer: InstallerResource = js.native
        
        val nodes: NodesResource = js.native
        
        val policies: PoliciesResource = js.native
      }
    }
  }
}
