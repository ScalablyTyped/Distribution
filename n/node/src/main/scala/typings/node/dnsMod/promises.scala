package typings.node.dnsMod

import typings.node.Anon_Hostname
import typings.node.Fn_A
import typings.node.Fn_Hostname
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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("dns", "promises")
@js.native
object promises extends js.Object {
  @js.native
  class Resolver () extends js.Object {
    @JSName("getServers")
    var getServers_Original: js.Function0[js.Array[java.lang.String]] = js.native
    @JSName("resolve4")
    var resolve4_Original: Fn_Hostname = js.native
    @JSName("resolve6")
    var resolve6_Original: Fn_Hostname = js.native
    @JSName("resolveAny")
    var resolveAny_Original: js.Function1[/* hostname */ java.lang.String, js.Promise[js.Array[AnyRecord]]] = js.native
    @JSName("resolveCname")
    var resolveCname_Original: js.Function1[/* hostname */ java.lang.String, js.Promise[js.Array[java.lang.String]]] = js.native
    @JSName("resolveMx")
    var resolveMx_Original: js.Function1[/* hostname */ java.lang.String, js.Promise[js.Array[MxRecord]]] = js.native
    @JSName("resolveNaptr")
    var resolveNaptr_Original: js.Function1[/* hostname */ java.lang.String, js.Promise[js.Array[NaptrRecord]]] = js.native
    @JSName("resolveNs")
    var resolveNs_Original: js.Function1[/* hostname */ java.lang.String, js.Promise[js.Array[java.lang.String]]] = js.native
    @JSName("resolvePtr")
    var resolvePtr_Original: js.Function1[/* hostname */ java.lang.String, js.Promise[js.Array[java.lang.String]]] = js.native
    @JSName("resolveSoa")
    var resolveSoa_Original: js.Function1[/* hostname */ java.lang.String, js.Promise[SoaRecord]] = js.native
    @JSName("resolveSrv")
    var resolveSrv_Original: js.Function1[/* hostname */ java.lang.String, js.Promise[js.Array[SrvRecord]]] = js.native
    @JSName("resolveTxt")
    var resolveTxt_Original: js.Function1[/* hostname */ java.lang.String, js.Promise[js.Array[js.Array[java.lang.String]]]] = js.native
    @JSName("resolve")
    var resolve_Original: Fn_A = js.native
    @JSName("reverse")
    var reverse_Original: js.Function1[/* ip */ java.lang.String, js.Promise[js.Array[java.lang.String]]] = js.native
    @JSName("setServers")
    var setServers_Original: js.Function1[/* servers */ js.Array[java.lang.String], Unit] = js.native
    def getServers(): js.Array[java.lang.String] = js.native
    def resolve(hostname: java.lang.String): js.Promise[js.Array[java.lang.String]] = js.native
    def resolve(hostname: java.lang.String, rrtype: java.lang.String): js.Promise[
        (js.Array[
          AnyRecord | js.Array[java.lang.String] | MxRecord | NaptrRecord | SrvRecord | java.lang.String
        ]) | SoaRecord
      ] = js.native
    def resolve4(hostname: java.lang.String): js.Promise[js.Array[java.lang.String]] = js.native
    def resolve4(hostname: java.lang.String, options: ResolveOptions): js.Promise[js.Array[RecordWithTtl | java.lang.String]] = js.native
    def resolve4(hostname: java.lang.String, options: ResolveWithTtlOptions): js.Promise[js.Array[RecordWithTtl]] = js.native
    def resolve6(hostname: java.lang.String): js.Promise[js.Array[java.lang.String]] = js.native
    def resolve6(hostname: java.lang.String, options: ResolveOptions): js.Promise[js.Array[RecordWithTtl | java.lang.String]] = js.native
    def resolve6(hostname: java.lang.String, options: ResolveWithTtlOptions): js.Promise[js.Array[RecordWithTtl]] = js.native
    def resolveAny(hostname: java.lang.String): js.Promise[js.Array[AnyRecord]] = js.native
    def resolveCname(hostname: java.lang.String): js.Promise[js.Array[java.lang.String]] = js.native
    def resolveMx(hostname: java.lang.String): js.Promise[js.Array[MxRecord]] = js.native
    def resolveNaptr(hostname: java.lang.String): js.Promise[js.Array[NaptrRecord]] = js.native
    def resolveNs(hostname: java.lang.String): js.Promise[js.Array[java.lang.String]] = js.native
    def resolvePtr(hostname: java.lang.String): js.Promise[js.Array[java.lang.String]] = js.native
    def resolveSoa(hostname: java.lang.String): js.Promise[SoaRecord] = js.native
    def resolveSrv(hostname: java.lang.String): js.Promise[js.Array[SrvRecord]] = js.native
    def resolveTxt(hostname: java.lang.String): js.Promise[js.Array[js.Array[java.lang.String]]] = js.native
    @JSName("resolve")
    def resolve_A(hostname: java.lang.String, rrtype: A): js.Promise[js.Array[java.lang.String]] = js.native
    @JSName("resolve")
    def resolve_AAAA(hostname: java.lang.String, rrtype: AAAA): js.Promise[js.Array[java.lang.String]] = js.native
    @JSName("resolve")
    def resolve_ANY(hostname: java.lang.String, rrtype: ANY): js.Promise[js.Array[AnyRecord]] = js.native
    @JSName("resolve")
    def resolve_CNAME(hostname: java.lang.String, rrtype: CNAME): js.Promise[js.Array[java.lang.String]] = js.native
    @JSName("resolve")
    def resolve_MX(hostname: java.lang.String, rrtype: MX): js.Promise[js.Array[MxRecord]] = js.native
    @JSName("resolve")
    def resolve_NAPTR(hostname: java.lang.String, rrtype: NAPTR): js.Promise[js.Array[NaptrRecord]] = js.native
    @JSName("resolve")
    def resolve_NS(hostname: java.lang.String, rrtype: NS): js.Promise[js.Array[java.lang.String]] = js.native
    @JSName("resolve")
    def resolve_PTR(hostname: java.lang.String, rrtype: PTR): js.Promise[js.Array[java.lang.String]] = js.native
    @JSName("resolve")
    def resolve_SOA(hostname: java.lang.String, rrtype: SOA): js.Promise[SoaRecord] = js.native
    @JSName("resolve")
    def resolve_SRV(hostname: java.lang.String, rrtype: SRV): js.Promise[js.Array[SrvRecord]] = js.native
    @JSName("resolve")
    def resolve_TXT(hostname: java.lang.String, rrtype: TXT): js.Promise[js.Array[js.Array[java.lang.String]]] = js.native
    def reverse(ip: java.lang.String): js.Promise[js.Array[java.lang.String]] = js.native
    def setServers(servers: js.Array[java.lang.String]): Unit = js.native
  }
  
  def getServers(): js.Array[java.lang.String] = js.native
  def lookup(hostname: java.lang.String): js.Promise[LookupAddress] = js.native
  def lookup(hostname: java.lang.String, family: Double): js.Promise[LookupAddress] = js.native
  def lookup(hostname: java.lang.String, options: LookupAllOptions): js.Promise[js.Array[LookupAddress]] = js.native
  def lookup(hostname: java.lang.String, options: LookupOneOptions): js.Promise[LookupAddress] = js.native
  def lookup(hostname: java.lang.String, options: LookupOptions): js.Promise[LookupAddress | js.Array[LookupAddress]] = js.native
  def lookupService(address: java.lang.String, port: Double): js.Promise[Anon_Hostname] = js.native
  def resolve(hostname: java.lang.String): js.Promise[js.Array[java.lang.String]] = js.native
  def resolve(hostname: java.lang.String, rrtype: java.lang.String): js.Promise[
    (js.Array[
      AnyRecord | js.Array[java.lang.String] | MxRecord | NaptrRecord | SrvRecord | java.lang.String
    ]) | SoaRecord
  ] = js.native
  def resolve4(hostname: java.lang.String): js.Promise[js.Array[java.lang.String]] = js.native
  def resolve4(hostname: java.lang.String, options: ResolveOptions): js.Promise[js.Array[RecordWithTtl | java.lang.String]] = js.native
  def resolve4(hostname: java.lang.String, options: ResolveWithTtlOptions): js.Promise[js.Array[RecordWithTtl]] = js.native
  def resolve6(hostname: java.lang.String): js.Promise[js.Array[java.lang.String]] = js.native
  def resolve6(hostname: java.lang.String, options: ResolveOptions): js.Promise[js.Array[RecordWithTtl | java.lang.String]] = js.native
  def resolve6(hostname: java.lang.String, options: ResolveWithTtlOptions): js.Promise[js.Array[RecordWithTtl]] = js.native
  def resolveAny(hostname: java.lang.String): js.Promise[js.Array[AnyRecord]] = js.native
  def resolveCname(hostname: java.lang.String): js.Promise[js.Array[java.lang.String]] = js.native
  def resolveMx(hostname: java.lang.String): js.Promise[js.Array[MxRecord]] = js.native
  def resolveNaptr(hostname: java.lang.String): js.Promise[js.Array[NaptrRecord]] = js.native
  def resolveNs(hostname: java.lang.String): js.Promise[js.Array[java.lang.String]] = js.native
  def resolvePtr(hostname: java.lang.String): js.Promise[js.Array[java.lang.String]] = js.native
  def resolveSoa(hostname: java.lang.String): js.Promise[SoaRecord] = js.native
  def resolveSrv(hostname: java.lang.String): js.Promise[js.Array[SrvRecord]] = js.native
  def resolveTxt(hostname: java.lang.String): js.Promise[js.Array[js.Array[java.lang.String]]] = js.native
  @JSName("resolve")
  def resolve_A(hostname: java.lang.String, rrtype: A): js.Promise[js.Array[java.lang.String]] = js.native
  @JSName("resolve")
  def resolve_AAAA(hostname: java.lang.String, rrtype: AAAA): js.Promise[js.Array[java.lang.String]] = js.native
  @JSName("resolve")
  def resolve_ANY(hostname: java.lang.String, rrtype: ANY): js.Promise[js.Array[AnyRecord]] = js.native
  @JSName("resolve")
  def resolve_CNAME(hostname: java.lang.String, rrtype: CNAME): js.Promise[js.Array[java.lang.String]] = js.native
  @JSName("resolve")
  def resolve_MX(hostname: java.lang.String, rrtype: MX): js.Promise[js.Array[MxRecord]] = js.native
  @JSName("resolve")
  def resolve_NAPTR(hostname: java.lang.String, rrtype: NAPTR): js.Promise[js.Array[NaptrRecord]] = js.native
  @JSName("resolve")
  def resolve_NS(hostname: java.lang.String, rrtype: NS): js.Promise[js.Array[java.lang.String]] = js.native
  @JSName("resolve")
  def resolve_PTR(hostname: java.lang.String, rrtype: PTR): js.Promise[js.Array[java.lang.String]] = js.native
  @JSName("resolve")
  def resolve_SOA(hostname: java.lang.String, rrtype: SOA): js.Promise[SoaRecord] = js.native
  @JSName("resolve")
  def resolve_SRV(hostname: java.lang.String, rrtype: SRV): js.Promise[js.Array[SrvRecord]] = js.native
  @JSName("resolve")
  def resolve_TXT(hostname: java.lang.String, rrtype: TXT): js.Promise[js.Array[js.Array[java.lang.String]]] = js.native
  def reverse(ip: java.lang.String): js.Promise[js.Array[java.lang.String]] = js.native
  def setServers(servers: js.Array[java.lang.String]): Unit = js.native
}

