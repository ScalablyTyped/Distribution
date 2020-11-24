package typings.maximMazurokGapiClientTrafficdirector.gapi.client.trafficdirector

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SocketAddress extends js.Object {
  
  /**
    * The address for this socket. :ref:`Listeners ` will bind to the address. An empty address is not allowed. Specify ``0.0.0.0`` or ``::`` to bind to any address.
    * [#comment:TODO(zuercher) reinstate when implemented: It is possible to distinguish a Listener address via the prefix/suffix matching in :ref:`FilterChainMatch `.] When used within
    * an upstream :ref:`BindConfig `, the address controls the source address of outbound connections. For :ref:`clusters `, the cluster type determines whether the address must be an IP
    * (*STATIC* or *EDS* clusters) or a hostname resolved by DNS (*STRICT_DNS* or *LOGICAL_DNS* clusters). Address resolution can be customized via :ref:`resolver_name `.
    */
  var address: js.UndefOr[String] = js.native
  
  /**
    * When binding to an IPv6 address above, this enables `IPv4 compatibility `_. Binding to ``::`` will allow both IPv4 and IPv6 connections, with peer IPv4 addresses mapped into IPv6
    * space as ``::FFFF:``.
    */
  var ipv4Compat: js.UndefOr[Boolean] = js.native
  
  /** This is only valid if :ref:`resolver_name ` is specified below and the named resolver is capable of named port resolution. */
  var namedPort: js.UndefOr[String] = js.native
  
  var portValue: js.UndefOr[Double] = js.native
  
  var protocol: js.UndefOr[String] = js.native
  
  /**
    * The name of the custom resolver. This must have been registered with Envoy. If this is empty, a context dependent default applies. If the address is a concrete IP address, no
    * resolution will occur. If address is a hostname this should be set for resolution other than DNS. Specifying a custom resolver with *STRICT_DNS* or *LOGICAL_DNS* will generate an
    * error at runtime.
    */
  var resolverName: js.UndefOr[String] = js.native
}
object SocketAddress {
  
  @scala.inline
  def apply(): SocketAddress = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SocketAddress]
  }
  
  @scala.inline
  implicit class SocketAddressOps[Self <: SocketAddress] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAddress(value: String): Self = this.set("address", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAddress: Self = this.set("address", js.undefined)
    
    @scala.inline
    def setIpv4Compat(value: Boolean): Self = this.set("ipv4Compat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIpv4Compat: Self = this.set("ipv4Compat", js.undefined)
    
    @scala.inline
    def setNamedPort(value: String): Self = this.set("namedPort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNamedPort: Self = this.set("namedPort", js.undefined)
    
    @scala.inline
    def setPortValue(value: Double): Self = this.set("portValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePortValue: Self = this.set("portValue", js.undefined)
    
    @scala.inline
    def setProtocol(value: String): Self = this.set("protocol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProtocol: Self = this.set("protocol", js.undefined)
    
    @scala.inline
    def setResolverName(value: String): Self = this.set("resolverName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResolverName: Self = this.set("resolverName", js.undefined)
  }
}
