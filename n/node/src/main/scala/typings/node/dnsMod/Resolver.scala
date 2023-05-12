package typings.node.dnsMod

import typings.node.NodeJS.ErrnoException
import typings.node.anon.FnCallHostnameOptionsCallback
import typings.node.anon.FnCallHostnameRrtypeCallback
import typings.node.nodeStrings.A
import typings.node.nodeStrings.AAAA
import typings.node.nodeStrings.ANY
import typings.node.nodeStrings.CNAME
import typings.node.nodeStrings.MX
import typings.node.nodeStrings.NAPTR
import typings.node.nodeStrings.NS
import typings.node.nodeStrings.PTR
import typings.node.nodeStrings.SOA
import typings.node.nodeStrings.SRV
import typings.node.nodeStrings.TXT
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("dns", "Resolver")
@js.native
open class Resolver () extends StObject {
  def this(options: ResolverOptions) = this()
  
  /**
    * Cancel all outstanding DNS queries made by this resolver. The corresponding
    * callbacks will be called with an error with code `ECANCELLED`.
    * @since v8.3.0
    */
  def cancel(): Unit = js.native
  
  def getServers(): js.Array[String] = js.native
  @JSName("getServers")
  var getServers_Original: js.Function0[js.Array[String]] = js.native
  
  def resolve(
    hostname: String,
    callback: js.Function2[/* err */ ErrnoException | Null, /* addresses */ js.Array[String], Unit]
  ): Unit = js.native
  def resolve(
    hostname: String,
    rrtype: String,
    callback: js.Function2[
      /* err */ ErrnoException | Null, 
      /* addresses */ (js.Array[AnyRecord | js.Array[String] | MxRecord | NaptrRecord | SrvRecord | String]) | SoaRecord, 
      Unit
    ]
  ): Unit = js.native
  
  def resolve4(
    hostname: String,
    callback: js.Function2[/* err */ ErrnoException | Null, /* addresses */ js.Array[String], Unit]
  ): Unit = js.native
  def resolve4(
    hostname: String,
    options: ResolveOptions,
    callback: js.Function2[
      /* err */ ErrnoException | Null, 
      /* addresses */ js.Array[RecordWithTtl | String], 
      Unit
    ]
  ): Unit = js.native
  def resolve4(
    hostname: String,
    options: ResolveWithTtlOptions,
    callback: js.Function2[/* err */ ErrnoException | Null, /* addresses */ js.Array[RecordWithTtl], Unit]
  ): Unit = js.native
  @JSName("resolve4")
  var resolve4_Original: FnCallHostnameOptionsCallback = js.native
  
  def resolve6(
    hostname: String,
    callback: js.Function2[/* err */ ErrnoException | Null, /* addresses */ js.Array[String], Unit]
  ): Unit = js.native
  def resolve6(
    hostname: String,
    options: ResolveOptions,
    callback: js.Function2[
      /* err */ ErrnoException | Null, 
      /* addresses */ js.Array[RecordWithTtl | String], 
      Unit
    ]
  ): Unit = js.native
  def resolve6(
    hostname: String,
    options: ResolveWithTtlOptions,
    callback: js.Function2[/* err */ ErrnoException | Null, /* addresses */ js.Array[RecordWithTtl], Unit]
  ): Unit = js.native
  @JSName("resolve6")
  var resolve6_Original: FnCallHostnameOptionsCallback = js.native
  
  def resolveAny(
    hostname: String,
    callback: js.Function2[/* err */ ErrnoException | Null, /* addresses */ js.Array[AnyRecord], Unit]
  ): Unit = js.native
  @JSName("resolveAny")
  var resolveAny_Original: js.Function2[
    /* hostname */ String, 
    /* callback */ js.Function2[/* err */ ErrnoException | Null, /* addresses */ js.Array[AnyRecord], Unit], 
    Unit
  ] = js.native
  
  def resolveCaa(
    hostname: String,
    callback: js.Function2[/* err */ ErrnoException | Null, /* records */ js.Array[CaaRecord], Unit]
  ): Unit = js.native
  @JSName("resolveCaa")
  var resolveCaa_Original: js.Function2[
    /* hostname */ String, 
    /* callback */ js.Function2[/* err */ ErrnoException | Null, /* records */ js.Array[CaaRecord], Unit], 
    Unit
  ] = js.native
  
  def resolveCname(
    hostname: String,
    callback: js.Function2[/* err */ ErrnoException | Null, /* addresses */ js.Array[String], Unit]
  ): Unit = js.native
  @JSName("resolveCname")
  var resolveCname_Original: js.Function2[
    /* hostname */ String, 
    /* callback */ js.Function2[/* err */ ErrnoException | Null, /* addresses */ js.Array[String], Unit], 
    Unit
  ] = js.native
  
  def resolveMx(
    hostname: String,
    callback: js.Function2[/* err */ ErrnoException | Null, /* addresses */ js.Array[MxRecord], Unit]
  ): Unit = js.native
  @JSName("resolveMx")
  var resolveMx_Original: js.Function2[
    /* hostname */ String, 
    /* callback */ js.Function2[/* err */ ErrnoException | Null, /* addresses */ js.Array[MxRecord], Unit], 
    Unit
  ] = js.native
  
  def resolveNaptr(
    hostname: String,
    callback: js.Function2[/* err */ ErrnoException | Null, /* addresses */ js.Array[NaptrRecord], Unit]
  ): Unit = js.native
  @JSName("resolveNaptr")
  var resolveNaptr_Original: js.Function2[
    /* hostname */ String, 
    /* callback */ js.Function2[/* err */ ErrnoException | Null, /* addresses */ js.Array[NaptrRecord], Unit], 
    Unit
  ] = js.native
  
  def resolveNs(
    hostname: String,
    callback: js.Function2[/* err */ ErrnoException | Null, /* addresses */ js.Array[String], Unit]
  ): Unit = js.native
  @JSName("resolveNs")
  var resolveNs_Original: js.Function2[
    /* hostname */ String, 
    /* callback */ js.Function2[/* err */ ErrnoException | Null, /* addresses */ js.Array[String], Unit], 
    Unit
  ] = js.native
  
  def resolvePtr(
    hostname: String,
    callback: js.Function2[/* err */ ErrnoException | Null, /* addresses */ js.Array[String], Unit]
  ): Unit = js.native
  @JSName("resolvePtr")
  var resolvePtr_Original: js.Function2[
    /* hostname */ String, 
    /* callback */ js.Function2[/* err */ ErrnoException | Null, /* addresses */ js.Array[String], Unit], 
    Unit
  ] = js.native
  
  def resolveSoa(
    hostname: String,
    callback: js.Function2[/* err */ ErrnoException | Null, /* address */ SoaRecord, Unit]
  ): Unit = js.native
  @JSName("resolveSoa")
  var resolveSoa_Original: js.Function2[
    /* hostname */ String, 
    /* callback */ js.Function2[/* err */ ErrnoException | Null, /* address */ SoaRecord, Unit], 
    Unit
  ] = js.native
  
  def resolveSrv(
    hostname: String,
    callback: js.Function2[/* err */ ErrnoException | Null, /* addresses */ js.Array[SrvRecord], Unit]
  ): Unit = js.native
  @JSName("resolveSrv")
  var resolveSrv_Original: js.Function2[
    /* hostname */ String, 
    /* callback */ js.Function2[/* err */ ErrnoException | Null, /* addresses */ js.Array[SrvRecord], Unit], 
    Unit
  ] = js.native
  
  def resolveTxt(
    hostname: String,
    callback: js.Function2[/* err */ ErrnoException | Null, /* addresses */ js.Array[js.Array[String]], Unit]
  ): Unit = js.native
  @JSName("resolveTxt")
  var resolveTxt_Original: js.Function2[
    /* hostname */ String, 
    /* callback */ js.Function2[/* err */ ErrnoException | Null, /* addresses */ js.Array[js.Array[String]], Unit], 
    Unit
  ] = js.native
  
  @JSName("resolve")
  def resolve_A(
    hostname: String,
    rrtype: A,
    callback: js.Function2[/* err */ ErrnoException | Null, /* addresses */ js.Array[String], Unit]
  ): Unit = js.native
  @JSName("resolve")
  def resolve_AAAA(
    hostname: String,
    rrtype: AAAA,
    callback: js.Function2[/* err */ ErrnoException | Null, /* addresses */ js.Array[String], Unit]
  ): Unit = js.native
  @JSName("resolve")
  def resolve_ANY(
    hostname: String,
    rrtype: ANY,
    callback: js.Function2[/* err */ ErrnoException | Null, /* addresses */ js.Array[AnyRecord], Unit]
  ): Unit = js.native
  @JSName("resolve")
  def resolve_CNAME(
    hostname: String,
    rrtype: CNAME,
    callback: js.Function2[/* err */ ErrnoException | Null, /* addresses */ js.Array[String], Unit]
  ): Unit = js.native
  @JSName("resolve")
  def resolve_MX(
    hostname: String,
    rrtype: MX,
    callback: js.Function2[/* err */ ErrnoException | Null, /* addresses */ js.Array[MxRecord], Unit]
  ): Unit = js.native
  @JSName("resolve")
  def resolve_NAPTR(
    hostname: String,
    rrtype: NAPTR,
    callback: js.Function2[/* err */ ErrnoException | Null, /* addresses */ js.Array[NaptrRecord], Unit]
  ): Unit = js.native
  @JSName("resolve")
  def resolve_NS(
    hostname: String,
    rrtype: NS,
    callback: js.Function2[/* err */ ErrnoException | Null, /* addresses */ js.Array[String], Unit]
  ): Unit = js.native
  @JSName("resolve")
  var resolve_Original: FnCallHostnameRrtypeCallback = js.native
  @JSName("resolve")
  def resolve_PTR(
    hostname: String,
    rrtype: PTR,
    callback: js.Function2[/* err */ ErrnoException | Null, /* addresses */ js.Array[String], Unit]
  ): Unit = js.native
  @JSName("resolve")
  def resolve_SOA(
    hostname: String,
    rrtype: SOA,
    callback: js.Function2[/* err */ ErrnoException | Null, /* addresses */ SoaRecord, Unit]
  ): Unit = js.native
  @JSName("resolve")
  def resolve_SRV(
    hostname: String,
    rrtype: SRV,
    callback: js.Function2[/* err */ ErrnoException | Null, /* addresses */ js.Array[SrvRecord], Unit]
  ): Unit = js.native
  @JSName("resolve")
  def resolve_TXT(
    hostname: String,
    rrtype: TXT,
    callback: js.Function2[/* err */ ErrnoException | Null, /* addresses */ js.Array[js.Array[String]], Unit]
  ): Unit = js.native
  
  def reverse(
    ip: String,
    callback: js.Function2[/* err */ ErrnoException | Null, /* hostnames */ js.Array[String], Unit]
  ): Unit = js.native
  @JSName("reverse")
  var reverse_Original: js.Function2[
    /* ip */ String, 
    /* callback */ js.Function2[/* err */ ErrnoException | Null, /* hostnames */ js.Array[String], Unit], 
    Unit
  ] = js.native
  
  /**
    * The resolver instance will send its requests from the specified IP address.
    * This allows programs to specify outbound interfaces when used on multi-homed
    * systems.
    *
    * If a v4 or v6 address is not specified, it is set to the default and the
    * operating system will choose a local address automatically.
    *
    * The resolver will use the v4 local address when making requests to IPv4 DNS
    * servers, and the v6 local address when making requests to IPv6 DNS servers.
    * The `rrtype` of resolution requests has no impact on the local address used.
    * @since v15.1.0, v14.17.0
    * @param [ipv4='0.0.0.0'] A string representation of an IPv4 address.
    * @param [ipv6='::0'] A string representation of an IPv6 address.
    */
  def setLocalAddress(): Unit = js.native
  def setLocalAddress(ipv4: String): Unit = js.native
  def setLocalAddress(ipv4: String, ipv6: String): Unit = js.native
  def setLocalAddress(ipv4: Unit, ipv6: String): Unit = js.native
  
  def setServers(servers: js.Array[String]): Unit = js.native
  @JSName("setServers")
  var setServers_Original: js.Function1[/* servers */ js.Array[String], Unit] = js.native
}
