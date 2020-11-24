package typings.maximMazurokGapiClientDomainsrdap

import typings.maximMazurokGapiClientDomainsrdap.gapi.client.domainsrdap.AutnumResource
import typings.maximMazurokGapiClientDomainsrdap.gapi.client.domainsrdap.DomainResource
import typings.maximMazurokGapiClientDomainsrdap.gapi.client.domainsrdap.EntityResource
import typings.maximMazurokGapiClientDomainsrdap.gapi.client.domainsrdap.IpResource
import typings.maximMazurokGapiClientDomainsrdap.gapi.client.domainsrdap.NameserverResource
import typings.maximMazurokGapiClientDomainsrdap.gapi.client.domainsrdap.V1Resource
import typings.maximMazurokGapiClientDomainsrdap.maximMazurokGapiClientDomainsrdapStrings.domainsrdap
import typings.maximMazurokGapiClientDomainsrdap.maximMazurokGapiClientDomainsrdapStrings.v1
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
      
      /** Load Domains RDAP API v1 */
      def load(name: domainsrdap, version: v1): js.Thenable[Unit] = js.native
      def load(name: domainsrdap, version: v1, callback: js.Function0[_]): Unit = js.native
      
      @js.native
      object domainsrdap extends js.Object {
        
        val autnum: AutnumResource = js.native
        
        val domain: DomainResource = js.native
        
        val entity: EntityResource = js.native
        
        val ip: IpResource = js.native
        
        val nameserver: NameserverResource = js.native
        
        val v1: V1Resource = js.native
      }
    }
  }
}
