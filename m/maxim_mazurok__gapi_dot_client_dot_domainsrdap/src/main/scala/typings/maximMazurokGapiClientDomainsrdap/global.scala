package typings.maximMazurokGapiClientDomainsrdap

import typings.maximMazurokGapiClientDomainsrdap.gapi.client.domainsrdap.AutnumResource
import typings.maximMazurokGapiClientDomainsrdap.gapi.client.domainsrdap.DomainResource
import typings.maximMazurokGapiClientDomainsrdap.gapi.client.domainsrdap.EntityResource
import typings.maximMazurokGapiClientDomainsrdap.gapi.client.domainsrdap.IpResource
import typings.maximMazurokGapiClientDomainsrdap.gapi.client.domainsrdap.NameserverResource
import typings.maximMazurokGapiClientDomainsrdap.gapi.client.domainsrdap.V1Resource
import typings.maximMazurokGapiClientDomainsrdap.maximMazurokGapiClientDomainsrdapStrings.domainsrdap
import typings.maximMazurokGapiClientDomainsrdap.maximMazurokGapiClientDomainsrdapStrings.v1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object gapi {
    
    object client {
      
      @JSGlobal("gapi.client")
      @js.native
      val ^ : js.Any = js.native
      
      object domainsrdap {
        
        @JSGlobal("gapi.client.domainsrdap.autnum")
        @js.native
        val autnum: AutnumResource = js.native
        
        @JSGlobal("gapi.client.domainsrdap.domain")
        @js.native
        val domain: DomainResource = js.native
        
        @JSGlobal("gapi.client.domainsrdap.entity")
        @js.native
        val entity: EntityResource = js.native
        
        @JSGlobal("gapi.client.domainsrdap.ip")
        @js.native
        val ip: IpResource = js.native
        
        @JSGlobal("gapi.client.domainsrdap.nameserver")
        @js.native
        val nameserver: NameserverResource = js.native
        
        @JSGlobal("gapi.client.domainsrdap.v1")
        @js.native
        val v1: V1Resource = js.native
      }
      
      /** Load Domains RDAP API v1 */
      inline def load(name: domainsrdap, version: v1): js.Thenable[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any])).asInstanceOf[js.Thenable[Unit]]
      inline def load(name: domainsrdap, version: v1, callback: js.Function0[js.Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    }
  }
}
