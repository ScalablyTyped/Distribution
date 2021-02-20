package typings.maximMazurokGapiClientNetworkmanagement.gapi.client.networkmanagement

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Endpoint extends StObject {
  
  /** A Compute Engine instance URI. */
  var instance: js.UndefOr[String] = js.native
  
  /**
    * The IP address of the endpoint, which can be an external or internal IP. An IPv6 address is only allowed when the test's destination is a [global load balancer
    * VIP](/load-balancing/docs/load-balancing-overview).
    */
  var ipAddress: js.UndefOr[String] = js.native
  
  /** A Compute Engine network URI. */
  var network: js.UndefOr[String] = js.native
  
  /** Type of the network where the endpoint is located. Applicable only to source endpoint, as destination network type can be inferred from the source. */
  var networkType: js.UndefOr[String] = js.native
  
  /** The IP protocol port of the endpoint. Only applicable when protocol is TCP or UDP. */
  var port: js.UndefOr[Double] = js.native
  
  /**
    * Project ID where the endpoint is located. The Project ID can be derived from the URI if you provide a VM instance or network URI. The following are two cases where you must provide
    * the project ID: 1. Only the IP address is specified, and the IP address is within a GCP project. 2. When you are using Shared VPC and the IP address that you provide is from the
    * service project. In this case, the network that the IP address resides in is defined in the host project.
    */
  var projectId: js.UndefOr[String] = js.native
}
object Endpoint {
  
  @scala.inline
  def apply(): Endpoint = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Endpoint]
  }
  
  @scala.inline
  implicit class EndpointMutableBuilder[Self <: Endpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInstance(value: String): Self = StObject.set(x, "instance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceUndefined: Self = StObject.set(x, "instance", js.undefined)
    
    @scala.inline
    def setIpAddress(value: String): Self = StObject.set(x, "ipAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIpAddressUndefined: Self = StObject.set(x, "ipAddress", js.undefined)
    
    @scala.inline
    def setNetwork(value: String): Self = StObject.set(x, "network", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNetworkType(value: String): Self = StObject.set(x, "networkType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNetworkTypeUndefined: Self = StObject.set(x, "networkType", js.undefined)
    
    @scala.inline
    def setNetworkUndefined: Self = StObject.set(x, "network", js.undefined)
    
    @scala.inline
    def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
    
    @scala.inline
    def setProjectId(value: String): Self = StObject.set(x, "projectId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProjectIdUndefined: Self = StObject.set(x, "projectId", js.undefined)
  }
}
