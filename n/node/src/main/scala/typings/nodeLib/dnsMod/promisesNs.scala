package typings
package nodeLib.dnsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("dns", "promises")
@js.native
object promisesNs extends js.Object {
  @js.native
  class Resolver () extends js.Object {
    @JSName("getServers")
    var getServers_Original: js.Function0[js.Array[java.lang.String]] = js.native
    @JSName("resolve4")
    var resolve4_Original: nodeLib.Fn_Hostname = js.native
    @JSName("resolve6")
    var resolve6_Original: nodeLib.Fn_Hostname = js.native
    @JSName("resolveAny")
    var resolveAny_Original: js.Function1[/* hostname */ java.lang.String, js.Promise[js.Array[nodeLib.dnsMod.AnyRecord]]] = js.native
    @JSName("resolveCname")
    var resolveCname_Original: js.Function1[/* hostname */ java.lang.String, js.Promise[js.Array[java.lang.String]]] = js.native
    @JSName("resolveMx")
    var resolveMx_Original: js.Function1[/* hostname */ java.lang.String, js.Promise[js.Array[nodeLib.dnsMod.MxRecord]]] = js.native
    @JSName("resolveNaptr")
    var resolveNaptr_Original: js.Function1[/* hostname */ java.lang.String, js.Promise[js.Array[nodeLib.dnsMod.NaptrRecord]]] = js.native
    @JSName("resolveNs")
    var resolveNs_Original: js.Function1[/* hostname */ java.lang.String, js.Promise[js.Array[java.lang.String]]] = js.native
    @JSName("resolvePtr")
    var resolvePtr_Original: js.Function1[/* hostname */ java.lang.String, js.Promise[js.Array[java.lang.String]]] = js.native
    @JSName("resolveSoa")
    var resolveSoa_Original: js.Function1[/* hostname */ java.lang.String, js.Promise[nodeLib.dnsMod.SoaRecord]] = js.native
    @JSName("resolveSrv")
    var resolveSrv_Original: js.Function1[/* hostname */ java.lang.String, js.Promise[js.Array[nodeLib.dnsMod.SrvRecord]]] = js.native
    @JSName("resolveTxt")
    var resolveTxt_Original: js.Function1[/* hostname */ java.lang.String, js.Promise[js.Array[js.Array[java.lang.String]]]] = js.native
    @JSName("resolve")
    var resolve_Original: nodeLib.Fn_A = js.native
    @JSName("reverse")
    var reverse_Original: js.Function1[/* ip */ java.lang.String, js.Promise[js.Array[java.lang.String]]] = js.native
    @JSName("setServers")
    var setServers_Original: js.Function1[/* servers */ js.Array[java.lang.String], scala.Unit] = js.native
    def getServers(): js.Array[java.lang.String] = js.native
    def resolve(hostname: java.lang.String): js.Promise[js.Array[java.lang.String]] = js.native
    def resolve(hostname: java.lang.String, rrtype: java.lang.String): js.Promise[
        (js.Array[
          nodeLib.dnsMod.AnyRecord | js.Array[java.lang.String] | nodeLib.dnsMod.MxRecord | nodeLib.dnsMod.NaptrRecord | nodeLib.dnsMod.SrvRecord | java.lang.String
        ]) | nodeLib.dnsMod.SoaRecord
      ] = js.native
    def resolve4(hostname: java.lang.String): js.Promise[js.Array[java.lang.String]] = js.native
    def resolve4(hostname: java.lang.String, options: nodeLib.dnsMod.ResolveOptions): js.Promise[js.Array[nodeLib.dnsMod.RecordWithTtl | java.lang.String]] = js.native
    def resolve4(hostname: java.lang.String, options: nodeLib.dnsMod.ResolveWithTtlOptions): js.Promise[js.Array[nodeLib.dnsMod.RecordWithTtl]] = js.native
    def resolve6(hostname: java.lang.String): js.Promise[js.Array[java.lang.String]] = js.native
    def resolve6(hostname: java.lang.String, options: nodeLib.dnsMod.ResolveOptions): js.Promise[js.Array[nodeLib.dnsMod.RecordWithTtl | java.lang.String]] = js.native
    def resolve6(hostname: java.lang.String, options: nodeLib.dnsMod.ResolveWithTtlOptions): js.Promise[js.Array[nodeLib.dnsMod.RecordWithTtl]] = js.native
    def resolveAny(hostname: java.lang.String): js.Promise[js.Array[nodeLib.dnsMod.AnyRecord]] = js.native
    def resolveCname(hostname: java.lang.String): js.Promise[js.Array[java.lang.String]] = js.native
    def resolveMx(hostname: java.lang.String): js.Promise[js.Array[nodeLib.dnsMod.MxRecord]] = js.native
    def resolveNaptr(hostname: java.lang.String): js.Promise[js.Array[nodeLib.dnsMod.NaptrRecord]] = js.native
    def resolveNs(hostname: java.lang.String): js.Promise[js.Array[java.lang.String]] = js.native
    def resolvePtr(hostname: java.lang.String): js.Promise[js.Array[java.lang.String]] = js.native
    def resolveSoa(hostname: java.lang.String): js.Promise[nodeLib.dnsMod.SoaRecord] = js.native
    def resolveSrv(hostname: java.lang.String): js.Promise[js.Array[nodeLib.dnsMod.SrvRecord]] = js.native
    def resolveTxt(hostname: java.lang.String): js.Promise[js.Array[js.Array[java.lang.String]]] = js.native
    @JSName("resolve")
    def resolve_A(hostname: java.lang.String, rrtype: nodeLib.nodeLibStrings.A): js.Promise[js.Array[java.lang.String]] = js.native
    @JSName("resolve")
    def resolve_AAAA(hostname: java.lang.String, rrtype: nodeLib.nodeLibStrings.AAAA): js.Promise[js.Array[java.lang.String]] = js.native
    @JSName("resolve")
    def resolve_ANY(hostname: java.lang.String, rrtype: nodeLib.nodeLibStrings.ANY): js.Promise[js.Array[nodeLib.dnsMod.AnyRecord]] = js.native
    @JSName("resolve")
    def resolve_CNAME(hostname: java.lang.String, rrtype: nodeLib.nodeLibStrings.CNAME): js.Promise[js.Array[java.lang.String]] = js.native
    @JSName("resolve")
    def resolve_MX(hostname: java.lang.String, rrtype: nodeLib.nodeLibStrings.MX): js.Promise[js.Array[nodeLib.dnsMod.MxRecord]] = js.native
    @JSName("resolve")
    def resolve_NAPTR(hostname: java.lang.String, rrtype: nodeLib.nodeLibStrings.NAPTR): js.Promise[js.Array[nodeLib.dnsMod.NaptrRecord]] = js.native
    @JSName("resolve")
    def resolve_NS(hostname: java.lang.String, rrtype: nodeLib.nodeLibStrings.NS): js.Promise[js.Array[java.lang.String]] = js.native
    @JSName("resolve")
    def resolve_PTR(hostname: java.lang.String, rrtype: nodeLib.nodeLibStrings.PTR): js.Promise[js.Array[java.lang.String]] = js.native
    @JSName("resolve")
    def resolve_SOA(hostname: java.lang.String, rrtype: nodeLib.nodeLibStrings.SOA): js.Promise[nodeLib.dnsMod.SoaRecord] = js.native
    @JSName("resolve")
    def resolve_SRV(hostname: java.lang.String, rrtype: nodeLib.nodeLibStrings.SRV): js.Promise[js.Array[nodeLib.dnsMod.SrvRecord]] = js.native
    @JSName("resolve")
    def resolve_TXT(hostname: java.lang.String, rrtype: nodeLib.nodeLibStrings.TXT): js.Promise[js.Array[js.Array[java.lang.String]]] = js.native
    def reverse(ip: java.lang.String): js.Promise[js.Array[java.lang.String]] = js.native
    def setServers(servers: js.Array[java.lang.String]): scala.Unit = js.native
  }
  
  def getServers(): js.Array[java.lang.String] = js.native
  def lookup(hostname: java.lang.String): js.Promise[nodeLib.dnsMod.LookupAddress] = js.native
  def lookup(hostname: java.lang.String, family: scala.Double): js.Promise[nodeLib.dnsMod.LookupAddress] = js.native
  def lookup(hostname: java.lang.String, options: nodeLib.dnsMod.LookupAllOptions): js.Promise[js.Array[nodeLib.dnsMod.LookupAddress]] = js.native
  def lookup(hostname: java.lang.String, options: nodeLib.dnsMod.LookupOneOptions): js.Promise[nodeLib.dnsMod.LookupAddress] = js.native
  def lookup(hostname: java.lang.String, options: nodeLib.dnsMod.LookupOptions): js.Promise[nodeLib.dnsMod.LookupAddress | js.Array[nodeLib.dnsMod.LookupAddress]] = js.native
  def lookupService(address: java.lang.String, port: scala.Double): js.Promise[nodeLib.Anon_Hostname] = js.native
  def resolve(hostname: java.lang.String): js.Promise[js.Array[java.lang.String]] = js.native
  def resolve(hostname: java.lang.String, rrtype: java.lang.String): js.Promise[
    (js.Array[
      nodeLib.dnsMod.AnyRecord | js.Array[java.lang.String] | nodeLib.dnsMod.MxRecord | nodeLib.dnsMod.NaptrRecord | nodeLib.dnsMod.SrvRecord | java.lang.String
    ]) | nodeLib.dnsMod.SoaRecord
  ] = js.native
  def resolve4(hostname: java.lang.String): js.Promise[js.Array[java.lang.String]] = js.native
  def resolve4(hostname: java.lang.String, options: nodeLib.dnsMod.ResolveOptions): js.Promise[js.Array[nodeLib.dnsMod.RecordWithTtl | java.lang.String]] = js.native
  def resolve4(hostname: java.lang.String, options: nodeLib.dnsMod.ResolveWithTtlOptions): js.Promise[js.Array[nodeLib.dnsMod.RecordWithTtl]] = js.native
  def resolve6(hostname: java.lang.String): js.Promise[js.Array[java.lang.String]] = js.native
  def resolve6(hostname: java.lang.String, options: nodeLib.dnsMod.ResolveOptions): js.Promise[js.Array[nodeLib.dnsMod.RecordWithTtl | java.lang.String]] = js.native
  def resolve6(hostname: java.lang.String, options: nodeLib.dnsMod.ResolveWithTtlOptions): js.Promise[js.Array[nodeLib.dnsMod.RecordWithTtl]] = js.native
  def resolveAny(hostname: java.lang.String): js.Promise[js.Array[nodeLib.dnsMod.AnyRecord]] = js.native
  def resolveCname(hostname: java.lang.String): js.Promise[js.Array[java.lang.String]] = js.native
  def resolveMx(hostname: java.lang.String): js.Promise[js.Array[nodeLib.dnsMod.MxRecord]] = js.native
  def resolveNaptr(hostname: java.lang.String): js.Promise[js.Array[nodeLib.dnsMod.NaptrRecord]] = js.native
  def resolveNs(hostname: java.lang.String): js.Promise[js.Array[java.lang.String]] = js.native
  def resolvePtr(hostname: java.lang.String): js.Promise[js.Array[java.lang.String]] = js.native
  def resolveSoa(hostname: java.lang.String): js.Promise[nodeLib.dnsMod.SoaRecord] = js.native
  def resolveSrv(hostname: java.lang.String): js.Promise[js.Array[nodeLib.dnsMod.SrvRecord]] = js.native
  def resolveTxt(hostname: java.lang.String): js.Promise[js.Array[js.Array[java.lang.String]]] = js.native
  @JSName("resolve")
  def resolve_A(hostname: java.lang.String, rrtype: nodeLib.nodeLibStrings.A): js.Promise[js.Array[java.lang.String]] = js.native
  @JSName("resolve")
  def resolve_AAAA(hostname: java.lang.String, rrtype: nodeLib.nodeLibStrings.AAAA): js.Promise[js.Array[java.lang.String]] = js.native
  @JSName("resolve")
  def resolve_ANY(hostname: java.lang.String, rrtype: nodeLib.nodeLibStrings.ANY): js.Promise[js.Array[nodeLib.dnsMod.AnyRecord]] = js.native
  @JSName("resolve")
  def resolve_CNAME(hostname: java.lang.String, rrtype: nodeLib.nodeLibStrings.CNAME): js.Promise[js.Array[java.lang.String]] = js.native
  @JSName("resolve")
  def resolve_MX(hostname: java.lang.String, rrtype: nodeLib.nodeLibStrings.MX): js.Promise[js.Array[nodeLib.dnsMod.MxRecord]] = js.native
  @JSName("resolve")
  def resolve_NAPTR(hostname: java.lang.String, rrtype: nodeLib.nodeLibStrings.NAPTR): js.Promise[js.Array[nodeLib.dnsMod.NaptrRecord]] = js.native
  @JSName("resolve")
  def resolve_NS(hostname: java.lang.String, rrtype: nodeLib.nodeLibStrings.NS): js.Promise[js.Array[java.lang.String]] = js.native
  @JSName("resolve")
  def resolve_PTR(hostname: java.lang.String, rrtype: nodeLib.nodeLibStrings.PTR): js.Promise[js.Array[java.lang.String]] = js.native
  @JSName("resolve")
  def resolve_SOA(hostname: java.lang.String, rrtype: nodeLib.nodeLibStrings.SOA): js.Promise[nodeLib.dnsMod.SoaRecord] = js.native
  @JSName("resolve")
  def resolve_SRV(hostname: java.lang.String, rrtype: nodeLib.nodeLibStrings.SRV): js.Promise[js.Array[nodeLib.dnsMod.SrvRecord]] = js.native
  @JSName("resolve")
  def resolve_TXT(hostname: java.lang.String, rrtype: nodeLib.nodeLibStrings.TXT): js.Promise[js.Array[js.Array[java.lang.String]]] = js.native
  def reverse(ip: java.lang.String): js.Promise[js.Array[java.lang.String]] = js.native
  def setServers(servers: js.Array[java.lang.String]): scala.Unit = js.native
}

