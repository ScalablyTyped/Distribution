package typings.node.dnsMod

import typings.node.AnonHostname
import typings.node.FnA
import typings.node.FnHostname
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
    var getServers_Original: js.Function0[js.Array[String]] = js.native
    @JSName("resolve4")
    var resolve4_Original: FnHostname = js.native
    @JSName("resolve6")
    var resolve6_Original: FnHostname = js.native
    @JSName("resolveAny")
    var resolveAny_Original: js.Function1[/* hostname */ String, js.Promise[js.Array[AnyRecord]]] = js.native
    @JSName("resolveCname")
    var resolveCname_Original: js.Function1[/* hostname */ String, js.Promise[js.Array[String]]] = js.native
    @JSName("resolveMx")
    var resolveMx_Original: js.Function1[/* hostname */ String, js.Promise[js.Array[MxRecord]]] = js.native
    @JSName("resolveNaptr")
    var resolveNaptr_Original: js.Function1[/* hostname */ String, js.Promise[js.Array[NaptrRecord]]] = js.native
    @JSName("resolveNs")
    var resolveNs_Original: js.Function1[/* hostname */ String, js.Promise[js.Array[String]]] = js.native
    @JSName("resolvePtr")
    var resolvePtr_Original: js.Function1[/* hostname */ String, js.Promise[js.Array[String]]] = js.native
    @JSName("resolveSoa")
    var resolveSoa_Original: js.Function1[/* hostname */ String, js.Promise[SoaRecord]] = js.native
    @JSName("resolveSrv")
    var resolveSrv_Original: js.Function1[/* hostname */ String, js.Promise[js.Array[SrvRecord]]] = js.native
    @JSName("resolveTxt")
    var resolveTxt_Original: js.Function1[/* hostname */ String, js.Promise[js.Array[js.Array[String]]]] = js.native
    @JSName("resolve")
    var resolve_Original: FnA = js.native
    @JSName("reverse")
    var reverse_Original: js.Function1[/* ip */ String, js.Promise[js.Array[String]]] = js.native
    @JSName("setServers")
    var setServers_Original: js.Function1[/* servers */ js.Array[String], Unit] = js.native
    def getServers(): js.Array[String] = js.native
    def resolve(hostname: String): js.Promise[js.Array[String]] = js.native
    def resolve(hostname: String, rrtype: String): js.Promise[
        (js.Array[AnyRecord | js.Array[String] | MxRecord | NaptrRecord | SrvRecord | String]) | SoaRecord
      ] = js.native
    def resolve4(hostname: String): js.Promise[js.Array[String]] = js.native
    def resolve4(hostname: String, options: ResolveOptions): js.Promise[js.Array[RecordWithTtl | String]] = js.native
    def resolve4(hostname: String, options: ResolveWithTtlOptions): js.Promise[js.Array[RecordWithTtl]] = js.native
    def resolve6(hostname: String): js.Promise[js.Array[String]] = js.native
    def resolve6(hostname: String, options: ResolveOptions): js.Promise[js.Array[RecordWithTtl | String]] = js.native
    def resolve6(hostname: String, options: ResolveWithTtlOptions): js.Promise[js.Array[RecordWithTtl]] = js.native
    def resolveAny(hostname: String): js.Promise[js.Array[AnyRecord]] = js.native
    def resolveCname(hostname: String): js.Promise[js.Array[String]] = js.native
    def resolveMx(hostname: String): js.Promise[js.Array[MxRecord]] = js.native
    def resolveNaptr(hostname: String): js.Promise[js.Array[NaptrRecord]] = js.native
    def resolveNs(hostname: String): js.Promise[js.Array[String]] = js.native
    def resolvePtr(hostname: String): js.Promise[js.Array[String]] = js.native
    def resolveSoa(hostname: String): js.Promise[SoaRecord] = js.native
    def resolveSrv(hostname: String): js.Promise[js.Array[SrvRecord]] = js.native
    def resolveTxt(hostname: String): js.Promise[js.Array[js.Array[String]]] = js.native
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
    def resolve_PTR(hostname: String, rrtype: PTR): js.Promise[js.Array[String]] = js.native
    @JSName("resolve")
    def resolve_SOA(hostname: String, rrtype: SOA): js.Promise[SoaRecord] = js.native
    @JSName("resolve")
    def resolve_SRV(hostname: String, rrtype: SRV): js.Promise[js.Array[SrvRecord]] = js.native
    @JSName("resolve")
    def resolve_TXT(hostname: String, rrtype: TXT): js.Promise[js.Array[js.Array[String]]] = js.native
    def reverse(ip: String): js.Promise[js.Array[String]] = js.native
    def setServers(servers: js.Array[String]): Unit = js.native
  }
  
  def getServers(): js.Array[String] = js.native
  def lookup(hostname: String): js.Promise[LookupAddress] = js.native
  def lookup(hostname: String, family: Double): js.Promise[LookupAddress] = js.native
  def lookup(hostname: String, options: LookupAllOptions): js.Promise[js.Array[LookupAddress]] = js.native
  def lookup(hostname: String, options: LookupOneOptions): js.Promise[LookupAddress] = js.native
  def lookup(hostname: String, options: LookupOptions): js.Promise[LookupAddress | js.Array[LookupAddress]] = js.native
  def lookupService(address: String, port: Double): js.Promise[AnonHostname] = js.native
  def resolve(hostname: String): js.Promise[js.Array[String]] = js.native
  def resolve(hostname: String, rrtype: String): js.Promise[
    (js.Array[AnyRecord | js.Array[String] | MxRecord | NaptrRecord | SrvRecord | String]) | SoaRecord
  ] = js.native
  def resolve4(hostname: String): js.Promise[js.Array[String]] = js.native
  def resolve4(hostname: String, options: ResolveOptions): js.Promise[js.Array[RecordWithTtl | String]] = js.native
  def resolve4(hostname: String, options: ResolveWithTtlOptions): js.Promise[js.Array[RecordWithTtl]] = js.native
  def resolve6(hostname: String): js.Promise[js.Array[String]] = js.native
  def resolve6(hostname: String, options: ResolveOptions): js.Promise[js.Array[RecordWithTtl | String]] = js.native
  def resolve6(hostname: String, options: ResolveWithTtlOptions): js.Promise[js.Array[RecordWithTtl]] = js.native
  def resolveAny(hostname: String): js.Promise[js.Array[AnyRecord]] = js.native
  def resolveCname(hostname: String): js.Promise[js.Array[String]] = js.native
  def resolveMx(hostname: String): js.Promise[js.Array[MxRecord]] = js.native
  def resolveNaptr(hostname: String): js.Promise[js.Array[NaptrRecord]] = js.native
  def resolveNs(hostname: String): js.Promise[js.Array[String]] = js.native
  def resolvePtr(hostname: String): js.Promise[js.Array[String]] = js.native
  def resolveSoa(hostname: String): js.Promise[SoaRecord] = js.native
  def resolveSrv(hostname: String): js.Promise[js.Array[SrvRecord]] = js.native
  def resolveTxt(hostname: String): js.Promise[js.Array[js.Array[String]]] = js.native
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
  def resolve_PTR(hostname: String, rrtype: PTR): js.Promise[js.Array[String]] = js.native
  @JSName("resolve")
  def resolve_SOA(hostname: String, rrtype: SOA): js.Promise[SoaRecord] = js.native
  @JSName("resolve")
  def resolve_SRV(hostname: String, rrtype: SRV): js.Promise[js.Array[SrvRecord]] = js.native
  @JSName("resolve")
  def resolve_TXT(hostname: String, rrtype: TXT): js.Promise[js.Array[js.Array[String]]] = js.native
  def reverse(ip: String): js.Promise[js.Array[String]] = js.native
  def setServers(servers: js.Array[String]): Unit = js.native
}

