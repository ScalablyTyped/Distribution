package typings.maximMazurokGapiClientSasportal

import typings.maximMazurokGapiClientSasportal.gapi.client.sasportal.CustomersResource
import typings.maximMazurokGapiClientSasportal.gapi.client.sasportal.DeploymentsResource
import typings.maximMazurokGapiClientSasportal.gapi.client.sasportal.InstallerResource
import typings.maximMazurokGapiClientSasportal.gapi.client.sasportal.NodesResource
import typings.maximMazurokGapiClientSasportal.gapi.client.sasportal.PoliciesResource
import typings.maximMazurokGapiClientSasportal.maximMazurokGapiClientSasportalStrings.sasportal
import typings.maximMazurokGapiClientSasportal.maximMazurokGapiClientSasportalStrings.v1alpha1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object gapi {
    
    object client {
      
      /** Load SAS Portal API v1alpha1 */
      @JSGlobal("gapi.client.load")
      @js.native
      def load(name: sasportal, version: v1alpha1): js.Thenable[Unit] = js.native
      @JSGlobal("gapi.client.load")
      @js.native
      def load(name: sasportal, version: v1alpha1, callback: js.Function0[_]): Unit = js.native
      
      object sasportal {
        
        @JSGlobal("gapi.client.sasportal.customers")
        @js.native
        val customers: CustomersResource = js.native
        
        @JSGlobal("gapi.client.sasportal.deployments")
        @js.native
        val deployments: DeploymentsResource = js.native
        
        @JSGlobal("gapi.client.sasportal.installer")
        @js.native
        val installer: InstallerResource = js.native
        
        @JSGlobal("gapi.client.sasportal.nodes")
        @js.native
        val nodes: NodesResource = js.native
        
        @JSGlobal("gapi.client.sasportal.policies")
        @js.native
        val policies: PoliciesResource = js.native
      }
    }
  }
}
