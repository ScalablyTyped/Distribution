package typings.maximMazurokGapiClientTrafficdirector.gapi.client.trafficdirector

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SocketAddress extends StObject {
  
  /**
    * The address for this socket. :ref:`Listeners ` will bind to the address. An empty address is not allowed. Specify ``0.0.0.0`` or ``::`` to bind to any address.
    * [#comment:TODO(zuercher) reinstate when implemented: It is possible to distinguish a Listener address via the prefix/suffix matching in :ref:`FilterChainMatch `.] When used within
    * an upstream :ref:`BindConfig `, the address controls the source address of outbound connections. For :ref:`clusters `, the cluster type determines whether the address must be an IP
    * (*STATIC* or *EDS* clusters) or a hostname resolved by DNS (*STRICT_DNS* or *LOGICAL_DNS* clusters). Address resolution can be customized via :ref:`resolver_name `.
    */
  var address: js.UndefOr[String] = js.undefined
  
  /**
    * When binding to an IPv6 address above, this enables `IPv4 compatibility `_. Binding to ``::`` will allow both IPv4 and IPv6 connections, with peer IPv4 addresses mapped into IPv6
    * space as ``::FFFF:``.
    */
  var ipv4Compat: js.UndefOr[Boolean] = js.undefined
  
  /** This is only valid if :ref:`resolver_name ` is specified below and the named resolver is capable of named port resolution. */
  var namedPort: js.UndefOr[String] = js.undefined
  
  var portValue: js.UndefOr[Double] = js.undefined
  
  var protocol: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the custom resolver. This must have been registered with Envoy. If this is empty, a context dependent default applies. If the address is a concrete IP address, no
    * resolution will occur. If address is a hostname this should be set for resolution other than DNS. Specifying a custom resolver with *STRICT_DNS* or *LOGICAL_DNS* will generate an
    * error at runtime.
    */
  var resolverName: js.UndefOr[String] = js.undefined
}
object SocketAddress {
  
  @scala.inline
  def apply(): SocketAddress = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SocketAddress]
  }
  
  @scala.inline
  implicit class SocketAddressMutableBuilder[Self <: SocketAddress] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddressUndefined: Self = StObject.set(x, "address", js.undefined)
    
    @scala.inline
    def setIpv4Compat(value: Boolean): Self = StObject.set(x, "ipv4Compat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIpv4CompatUndefined: Self = StObject.set(x, "ipv4Compat", js.undefined)
    
    @scala.inline
    def setNamedPort(value: String): Self = StObject.set(x, "namedPort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNamedPortUndefined: Self = StObject.set(x, "namedPort", js.undefined)
    
    @scala.inline
    def setPortValue(value: Double): Self = StObject.set(x, "portValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPortValueUndefined: Self = StObject.set(x, "portValue", js.undefined)
    
    @scala.inline
    def setProtocol(value: String): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProtocolUndefined: Self = StObject.set(x, "protocol", js.undefined)
    
    @scala.inline
    def setResolverName(value: String): Self = StObject.set(x, "resolverName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResolverNameUndefined: Self = StObject.set(x, "resolverName", js.undefined)
  }
}
