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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object gapi {
    
    object client {
      
      object dns {
        
        @JSGlobal("gapi.client.dns.changes")
        @js.native
        val changes: ChangesResource = js.native
        
        @JSGlobal("gapi.client.dns.dnsKeys")
        @js.native
        val dnsKeys: DnsKeysResource = js.native
        
        @JSGlobal("gapi.client.dns.managedZoneOperations")
        @js.native
        val managedZoneOperations: ManagedZoneOperationsResource = js.native
        
        @JSGlobal("gapi.client.dns.managedZones")
        @js.native
        val managedZones: ManagedZonesResource = js.native
        
        @JSGlobal("gapi.client.dns.policies")
        @js.native
        val policies: PoliciesResource = js.native
        
        @JSGlobal("gapi.client.dns.projects")
        @js.native
        val projects: ProjectsResource = js.native
        
        @JSGlobal("gapi.client.dns.resourceRecordSets")
        @js.native
        val resourceRecordSets: ResourceRecordSetsResource = js.native
      }
      
      /** Load Cloud DNS API v1 */
      @JSGlobal("gapi.client.load")
      @js.native
      def load(name: dns, version: v1): js.Thenable[Unit] = js.native
      @JSGlobal("gapi.client.load")
      @js.native
      def load(name: dns, version: v1, callback: js.Function0[_]): Unit = js.native
    }
  }
}
