package typings.node.dnsMod

import typings.node.anon.FnCallHostnameOptions
import typings.node.anon.FnCallHostnameRrtype
import typings.node.anon.Hostname
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

object promises {
  
  @JSImport("dns", "promises")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("dns", "promises.Resolver")
  @js.native
  class Resolver () extends StObject {
    
    def getServers(): js.Array[String] = js.native
    @JSName("getServers")
    var getServers_Original: js.Function0[js.Array[String]] = js.native
    
    def resolve(hostname: String): js.Promise[js.Array[String]] = js.native
    def resolve(hostname: String, rrtype: String): js.Promise[
        (js.Array[AnyRecord | js.Array[String] | MxRecord | NaptrRecord | SrvRecord | String]) | SoaRecord
      ] = js.native
    
    def resolve4(hostname: String): js.Promise[js.Array[String]] = js.native
    def resolve4(hostname: String, options: ResolveOptions): js.Promise[js.Array[RecordWithTtl | String]] = js.native
    def resolve4(hostname: String, options: ResolveWithTtlOptions): js.Promise[js.Array[RecordWithTtl]] = js.native
    @JSName("resolve4")
    var resolve4_Original: FnCallHostnameOptions = js.native
    
    def resolve6(hostname: String): js.Promise[js.Array[String]] = js.native
    def resolve6(hostname: String, options: ResolveOptions): js.Promise[js.Array[RecordWithTtl | String]] = js.native
    def resolve6(hostname: String, options: ResolveWithTtlOptions): js.Promise[js.Array[RecordWithTtl]] = js.native
    @JSName("resolve6")
    var resolve6_Original: FnCallHostnameOptions = js.native
    
    def resolveAny(hostname: String): js.Promise[js.Array[AnyRecord]] = js.native
    @JSName("resolveAny")
    var resolveAny_Original: js.Function1[/* hostname */ String, js.Promise[js.Array[AnyRecord]]] = js.native
    
    def resolveCname(hostname: String): js.Promise[js.Array[String]] = js.native
    @JSName("resolveCname")
    var resolveCname_Original: js.Function1[/* hostname */ String, js.Promise[js.Array[String]]] = js.native
    
    def resolveMx(hostname: String): js.Promise[js.Array[MxRecord]] = js.native
    @JSName("resolveMx")
    var resolveMx_Original: js.Function1[/* hostname */ String, js.Promise[js.Array[MxRecord]]] = js.native
    
    def resolveNaptr(hostname: String): js.Promise[js.Array[NaptrRecord]] = js.native
    @JSName("resolveNaptr")
    var resolveNaptr_Original: js.Function1[/* hostname */ String, js.Promise[js.Array[NaptrRecord]]] = js.native
    
    def resolveNs(hostname: String): js.Promise[js.Array[String]] = js.native
    @JSName("resolveNs")
    var resolveNs_Original: js.Function1[/* hostname */ String, js.Promise[js.Array[String]]] = js.native
    
    def resolvePtr(hostname: String): js.Promise[js.Array[String]] = js.native
    @JSName("resolvePtr")
    var resolvePtr_Original: js.Function1[/* hostname */ String, js.Promise[js.Array[String]]] = js.native
    
    def resolveSoa(hostname: String): js.Promise[SoaRecord] = js.native
    @JSName("resolveSoa")
    var resolveSoa_Original: js.Function1[/* hostname */ String, js.Promise[SoaRecord]] = js.native
    
    def resolveSrv(hostname: String): js.Promise[js.Array[SrvRecord]] = js.native
    @JSName("resolveSrv")
    var resolveSrv_Original: js.Function1[/* hostname */ String, js.Promise[js.Array[SrvRecord]]] = js.native
    
    def resolveTxt(hostname: String): js.Promise[js.Array[js.Array[String]]] = js.native
    @JSName("resolveTxt")
    var resolveTxt_Original: js.Function1[/* hostname */ String, js.Promise[js.Array[js.Array[String]]]] = js.native
    
    @JSName("resolve")
    def resolve_A(hostname: String, rrtype: A): js.Promise[js.Array[String]] = js.native
    @JSName("resolve")
    def resolve_AAAA(hostname: String, rrtype: AAAA): js.Promise[js.Array[String]] = js.native
    @JSName("resolve")
    def resolve_ANY(hostname: String, rrtype: ANY): js.Promise[js.Array[AnyRecord]] = js.native
    @JSName("resolve")
    def resolve_CNAME(hostname: String, rrtype: CNAME): js.Promise[js.Array[String]] = js.native
    @JSName("resolve")
    def resolve_MX(hostname: String, rrtype: MX): js.Promise[js.Array[MxRecord]] = js.native
    @JSName("resolve")
    def resolve_NAPTR(hostname: String, rrtype: NAPTR): js.Promise[js.Array[NaptrRecord]] = js.native
    @JSName("resolve")
    def resolve_NS(hostname: String, rrtype: NS): js.Promise[js.Array[String]] = js.native
    @JSName("resolve")
    var resolve_Original: FnCallHostnameRrtype = js.native
    @JSName("resolve")
    def resolve_PTR(hostname: String, rrtype: PTR): js.Promise[js.Array[String]] = js.native
    @JSName("resolve")
    def resolve_SOA(hostname: String, rrtype: SOA): js.Promise[SoaRecord] = js.native
    @JSName("resolve")
    def resolve_SRV(hostname: String, rrtype: SRV): js.Promise[js.Array[SrvRecord]] = js.native
    @JSName("resolve")
    def resolve_TXT(hostname: String, rrtype: TXT): js.Promise[js.Array[js.Array[String]]] = js.native
    
    def reverse(ip: String): js.Promise[js.Array[String]] = js.native
    @JSName("reverse")
    var reverse_Original: js.Function1[/* ip */ String, js.Promise[js.Array[String]]] = js.native
    
    def setServers(servers: js.Array[String]): Unit = js.native
    @JSName("setServers")
    var setServers_Original: js.Function1[/* servers */ js.Array[String], Unit] = js.native
  }
  
  inline def getServers(): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getServers")().asInstanceOf[js.Array[String]]
  
  inline def lookup(hostname: String): js.Promise[LookupAddress] = ^.asInstanceOf[js.Dynamic].applyDynamic("lookup")(hostname.asInstanceOf[js.Any]).asInstanceOf[js.Promise[LookupAddress]]
  inline def lookup(hostname: String, family: Double): js.Promise[LookupAddress] = (^.asInstanceOf[js.Dynamic].applyDynamic("lookup")(hostname.asInstanceOf[js.Any], family.asInstanceOf[js.Any])).asInstanceOf[js.Promise[LookupAddress]]
  inline def lookup(hostname: String, options: LookupAllOptions): js.Promise[js.Array[LookupAddress]] = (^.asInstanceOf[js.Dynamic].applyDynamic("lookup")(hostname.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[LookupAddress]]]
  inline def lookup(hostname: String, options: LookupOneOptions): js.Promise[LookupAddress] = (^.asInstanceOf[js.Dynamic].applyDynamic("lookup")(hostname.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[LookupAddress]]
  inline def lookup(hostname: String, options: LookupOptions): js.Promise[LookupAddress | js.Array[LookupAddress]] = (^.asInstanceOf[js.Dynamic].applyDynamic("lookup")(hostname.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[LookupAddress | js.Array[LookupAddress]]]
  
  inline def lookupService(address: String, port: Double): js.Promise[Hostname] = (^.asInstanceOf[js.Dynamic].applyDynamic("lookupService")(address.asInstanceOf[js.Any], port.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Hostname]]
  
  inline def resolve(hostname: String): js.Promise[js.Array[String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("resolve")(hostname.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[String]]]
  inline def resolve(hostname: String, rrtype: String): js.Promise[
    (js.Array[AnyRecord | js.Array[String] | MxRecord | NaptrRecord | SrvRecord | String]) | SoaRecord
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("resolve")(hostname.asInstanceOf[js.Any], rrtype.asInstanceOf[js.Any])).asInstanceOf[js.Promise[
    (js.Array[AnyRecord | js.Array[String] | MxRecord | NaptrRecord | SrvRecord | String]) | SoaRecord
  ]]
  
  inline def resolve4(hostname: String): js.Promise[js.Array[String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("resolve4")(hostname.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[String]]]
  inline def resolve4(hostname: String, options: ResolveOptions): js.Promise[js.Array[RecordWithTtl | String]] = (^.asInstanceOf[js.Dynamic].applyDynamic("resolve4")(hostname.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[RecordWithTtl | String]]]
  inline def resolve4(hostname: String, options: ResolveWithTtlOptions): js.Promise[js.Array[RecordWithTtl]] = (^.asInstanceOf[js.Dynamic].applyDynamic("resolve4")(hostname.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[RecordWithTtl]]]
  
  inline def resolve6(hostname: String): js.Promise[js.Array[String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("resolve6")(hostname.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[String]]]
  inline def resolve6(hostname: String, options: ResolveOptions): js.Promise[js.Array[RecordWithTtl | String]] = (^.asInstanceOf[js.Dynamic].applyDynamic("resolve6")(hostname.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[RecordWithTtl | String]]]
  inline def resolve6(hostname: String, options: ResolveWithTtlOptions): js.Promise[js.Array[RecordWithTtl]] = (^.asInstanceOf[js.Dynamic].applyDynamic("resolve6")(hostname.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[RecordWithTtl]]]
  
  inline def resolveAny(hostname: String): js.Promise[js.Array[AnyRecord]] = ^.asInstanceOf[js.Dynamic].applyDynamic("resolveAny")(hostname.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[AnyRecord]]]
  
  inline def resolveCname(hostname: String): js.Promise[js.Array[String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("resolveCname")(hostname.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[String]]]
  
  inline def resolveMx(hostname: String): js.Promise[js.Array[MxRecord]] = ^.asInstanceOf[js.Dynamic].applyDynamic("resolveMx")(hostname.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[MxRecord]]]
  
  inline def resolveNaptr(hostname: String): js.Promise[js.Array[NaptrRecord]] = ^.asInstanceOf[js.Dynamic].applyDynamic("resolveNaptr")(hostname.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[NaptrRecord]]]
  
  inline def resolveNs(hostname: String): js.Promise[js.Array[String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("resolveNs")(hostname.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[String]]]
  
  inline def resolvePtr(hostname: String): js.Promise[js.Array[String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("resolvePtr")(hostname.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[String]]]
  
  inline def resolveSoa(hostname: String): js.Promise[SoaRecord] = ^.asInstanceOf[js.Dynamic].applyDynamic("resolveSoa")(hostname.asInstanceOf[js.Any]).asInstanceOf[js.Promise[SoaRecord]]
  
  inline def resolveSrv(hostname: String): js.Promise[js.Array[SrvRecord]] = ^.asInstanceOf[js.Dynamic].applyDynamic("resolveSrv")(hostname.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[SrvRecord]]]
  
  inline def resolveTxt(hostname: String): js.Promise[js.Array[js.Array[String]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("resolveTxt")(hostname.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[js.Array[String]]]]
  
  inline def resolve_A(hostname: String, rrtype: A): js.Promise[js.Array[String]] = (^.asInstanceOf[js.Dynamic].applyDynamic("resolve")(hostname.asInstanceOf[js.Any], rrtype.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[String]]]
  
  inline def resolve_AAAA(hostname: String, rrtype: AAAA): js.Promise[js.Array[String]] = (^.asInstanceOf[js.Dynamic].applyDynamic("resolve")(hostname.asInstanceOf[js.Any], rrtype.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[String]]]
  
  inline def resolve_ANY(hostname: String, rrtype: ANY): js.Promise[js.Array[AnyRecord]] = (^.asInstanceOf[js.Dynamic].applyDynamic("resolve")(hostname.asInstanceOf[js.Any], rrtype.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[AnyRecord]]]
  
  inline def resolve_CNAME(hostname: String, rrtype: CNAME): js.Promise[js.Array[String]] = (^.asInstanceOf[js.Dynamic].applyDynamic("resolve")(hostname.asInstanceOf[js.Any], rrtype.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[String]]]
  
  inline def resolve_MX(hostname: String, rrtype: MX): js.Promise[js.Array[MxRecord]] = (^.asInstanceOf[js.Dynamic].applyDynamic("resolve")(hostname.asInstanceOf[js.Any], rrtype.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[MxRecord]]]
  
  inline def resolve_NAPTR(hostname: String, rrtype: NAPTR): js.Promise[js.Array[NaptrRecord]] = (^.asInstanceOf[js.Dynamic].applyDynamic("resolve")(hostname.asInstanceOf[js.Any], rrtype.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[NaptrRecord]]]
  
  inline def resolve_NS(hostname: String, rrtype: NS): js.Promise[js.Array[String]] = (^.asInstanceOf[js.Dynamic].applyDynamic("resolve")(hostname.asInstanceOf[js.Any], rrtype.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[String]]]
  
  inline def resolve_PTR(hostname: String, rrtype: PTR): js.Promise[js.Array[String]] = (^.asInstanceOf[js.Dynamic].applyDynamic("resolve")(hostname.asInstanceOf[js.Any], rrtype.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[String]]]
  
  inline def resolve_SOA(hostname: String, rrtype: SOA): js.Promise[SoaRecord] = (^.asInstanceOf[js.Dynamic].applyDynamic("resolve")(hostname.asInstanceOf[js.Any], rrtype.asInstanceOf[js.Any])).asInstanceOf[js.Promise[SoaRecord]]
  
  inline def resolve_SRV(hostname: String, rrtype: SRV): js.Promise[js.Array[SrvRecord]] = (^.asInstanceOf[js.Dynamic].applyDynamic("resolve")(hostname.asInstanceOf[js.Any], rrtype.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[SrvRecord]]]
  
  inline def resolve_TXT(hostname: String, rrtype: TXT): js.Promise[js.Array[js.Array[String]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("resolve")(hostname.asInstanceOf[js.Any], rrtype.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[js.Array[String]]]]
  
  inline def reverse(ip: String): js.Promise[js.Array[String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("reverse")(ip.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[String]]]
  
  inline def setServers(servers: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setServers")(servers.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
