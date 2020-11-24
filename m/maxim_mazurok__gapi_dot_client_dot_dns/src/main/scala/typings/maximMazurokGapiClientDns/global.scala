package typings.maximMazurokGapiClientDns

import typings.maximMazurokGapiClientDns.gapi.client.dns.ChangesResource
import typings.maximMazurokGapiClientDns.gapi.client.dns.DnsKeysResource
import typings.maximMazurokGapiClientDns.gapi.client.dns.ManagedZoneOperationsResource
import typings.maximMazurokGapiClientDns.gapi.client.dns.ManagedZonesResource
import typings.maximMazurokGapiClientDns.gapi.client.dns.PoliciesResource
import typings.maximMazurokGapiClientDns.gapi.client.dns.ProjectsResource
import typings.maximMazurokGapiClientDns.gapi.client.dns.ResourceRecordSetsResource
import typings.maximMazurokGapiClientDns.maximMazurokGapiClientDnsStrings.dns
import typings.maximMazurokGapiClientDns.maximMazurokGapiClientDnsStrings.v1
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
      
      /** Load Cloud DNS API v1 */
      def load(name: dns, version: v1): js.Thenable[Unit] = js.native
      def load(name: dns, version: v1, callback: js.Function0[_]): Unit = js.native
      
      @js.native
      object dns extends js.Object {
        
        val changes: ChangesResource = js.native
        
        val dnsKeys: DnsKeysResource = js.native
        
        val managedZoneOperations: ManagedZoneOperationsResource = js.native
        
        val managedZones: ManagedZonesResource = js.native
        
        val policies: PoliciesResource = js.native
        
        val projects: ProjectsResource = js.native
        
        val resourceRecordSets: ResourceRecordSetsResource = js.native
      }
    }
  }
}
