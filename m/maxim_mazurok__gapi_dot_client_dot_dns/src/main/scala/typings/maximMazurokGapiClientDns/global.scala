package typings.maximMazurokGapiClientDns

import typings.maximMazurokGapiClientDns.gapi.client.dns.ChangesResource
import typings.maximMazurokGapiClientDns.gapi.client.dns.DnsKeysResource
import typings.maximMazurokGapiClientDns.gapi.client.dns.ManagedZoneOperationsResource
import typings.maximMazurokGapiClientDns.gapi.client.dns.ManagedZonesResource
import typings.maximMazurokGapiClientDns.gapi.client.dns.PoliciesResource
import typings.maximMazurokGapiClientDns.gapi.client.dns.ProjectsResource
import typings.maximMazurokGapiClientDns.gapi.client.dns.ResourceRecordSetsResource
import typings.maximMazurokGapiClientDns.gapi.client.dns.ResponsePoliciesResource
import typings.maximMazurokGapiClientDns.gapi.client.dns.ResponsePolicyRulesResource
import typings.maximMazurokGapiClientDns.maximMazurokGapiClientDnsStrings.dns
import typings.maximMazurokGapiClientDns.maximMazurokGapiClientDnsStrings.v1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object gapi {
    
    object client {
      
      @JSGlobal("gapi.client")
      @js.native
      val ^ : js.Any = js.native
      
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
        
        @JSGlobal("gapi.client.dns.responsePolicies")
        @js.native
        val responsePolicies: ResponsePoliciesResource = js.native
        
        @JSGlobal("gapi.client.dns.responsePolicyRules")
        @js.native
        val responsePolicyRules: ResponsePolicyRulesResource = js.native
      }
      
      /** Load Cloud DNS API v1 */
      inline def load(name: dns, version: v1): js.Thenable[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any])).asInstanceOf[js.Thenable[Unit]]
      inline def load(name: dns, version: v1, callback: js.Function0[Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    }
  }
}
