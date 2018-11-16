package typings
package nodeLib.dnsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("dns", JSImport.Namespace)
@js.native
object dnsModMembers extends js.Object {
  // Supported getaddrinfo flags.
  val ADDRCONFIG: scala.Double = js.native
  val ADDRGETNETWORKPARAMS: java.lang.String = js.native
  val BADFAMILY: java.lang.String = js.native
  val BADFLAGS: java.lang.String = js.native
  val BADHINTS: java.lang.String = js.native
  val BADNAME: java.lang.String = js.native
  val BADQUERY: java.lang.String = js.native
  val BADRESP: java.lang.String = js.native
  val BADSTR: java.lang.String = js.native
  val CANCELLED: java.lang.String = js.native
  val CONNREFUSED: java.lang.String = js.native
  val DESTRUCTION: java.lang.String = js.native
  val EOF: java.lang.String = js.native
  val FILE: java.lang.String = js.native
  val FORMERR: java.lang.String = js.native
  val LOADIPHLPAPI: java.lang.String = js.native
  // Error codes
  val NODATA: java.lang.String = js.native
  val NOMEM: java.lang.String = js.native
  val NONAME: java.lang.String = js.native
  val NOTFOUND: java.lang.String = js.native
  val NOTIMP: java.lang.String = js.native
  val NOTINITIALIZED: java.lang.String = js.native
  val REFUSED: java.lang.String = js.native
  val SERVFAIL: java.lang.String = js.native
  val TIMEOUT: java.lang.String = js.native
  val V4MAPPED: scala.Double = js.native
  def getServers(): js.Array[java.lang.String] = js.native
  def lookup(
    hostname: java.lang.String,
    callback: js.Function3[
      /* err */ nodeLib.NodeJSNs.ErrnoException, 
      /* address */ java.lang.String, 
      /* family */ scala.Double, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def lookup(
    hostname: java.lang.String,
    family: scala.Double,
    callback: js.Function3[
      /* err */ nodeLib.NodeJSNs.ErrnoException, 
      /* address */ java.lang.String, 
      /* family */ scala.Double, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def lookup(
    hostname: java.lang.String,
    options: LookupAllOptions,
    callback: js.Function2[
      /* err */ nodeLib.NodeJSNs.ErrnoException, 
      /* addresses */ js.Array[LookupAddress], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def lookup(
    hostname: java.lang.String,
    options: LookupOneOptions,
    callback: js.Function3[
      /* err */ nodeLib.NodeJSNs.ErrnoException, 
      /* address */ java.lang.String, 
      /* family */ scala.Double, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def lookup(
    hostname: java.lang.String,
    options: LookupOptions,
    callback: js.Function3[
      /* err */ nodeLib.NodeJSNs.ErrnoException, 
      /* address */ java.lang.String | js.Array[LookupAddress], 
      /* family */ scala.Double, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def lookupService(
    address: java.lang.String,
    port: scala.Double,
    callback: js.Function3[
      /* err */ nodeLib.NodeJSNs.ErrnoException, 
      /* hostname */ java.lang.String, 
      /* service */ java.lang.String, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def resolve(
    hostname: java.lang.String,
    callback: js.Function2[
      /* err */ nodeLib.NodeJSNs.ErrnoException, 
      /* addresses */ js.Array[java.lang.String], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def resolve(
    hostname: java.lang.String,
    rrtype: java.lang.String,
    callback: js.Function2[
      /* err */ nodeLib.NodeJSNs.ErrnoException, 
      /* addresses */ js.Array[java.lang.String] | js.Array[MxRecord] | js.Array[NaptrRecord] | SoaRecord | js.Array[SrvRecord] | js.Array[js.Array[java.lang.String]] | js.Array[AnyRecord], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def resolve4(
    hostname: java.lang.String,
    callback: js.Function2[
      /* err */ nodeLib.NodeJSNs.ErrnoException, 
      /* addresses */ js.Array[java.lang.String], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def resolve4(
    hostname: java.lang.String,
    options: ResolveOptions,
    callback: js.Function2[
      /* err */ nodeLib.NodeJSNs.ErrnoException, 
      /* addresses */ js.Array[java.lang.String] | js.Array[RecordWithTtl], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def resolve4(
    hostname: java.lang.String,
    options: ResolveWithTtlOptions,
    callback: js.Function2[
      /* err */ nodeLib.NodeJSNs.ErrnoException, 
      /* addresses */ js.Array[RecordWithTtl], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def resolve6(
    hostname: java.lang.String,
    callback: js.Function2[
      /* err */ nodeLib.NodeJSNs.ErrnoException, 
      /* addresses */ js.Array[java.lang.String], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def resolve6(
    hostname: java.lang.String,
    options: ResolveOptions,
    callback: js.Function2[
      /* err */ nodeLib.NodeJSNs.ErrnoException, 
      /* addresses */ js.Array[java.lang.String] | js.Array[RecordWithTtl], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def resolve6(
    hostname: java.lang.String,
    options: ResolveWithTtlOptions,
    callback: js.Function2[
      /* err */ nodeLib.NodeJSNs.ErrnoException, 
      /* addresses */ js.Array[RecordWithTtl], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def resolveAny(
    hostname: java.lang.String,
    callback: js.Function2[
      /* err */ nodeLib.NodeJSNs.ErrnoException, 
      /* addresses */ js.Array[AnyRecord], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def resolveCname(
    hostname: java.lang.String,
    callback: js.Function2[
      /* err */ nodeLib.NodeJSNs.ErrnoException, 
      /* addresses */ js.Array[java.lang.String], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def resolveMx(
    hostname: java.lang.String,
    callback: js.Function2[
      /* err */ nodeLib.NodeJSNs.ErrnoException, 
      /* addresses */ js.Array[MxRecord], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def resolveNaptr(
    hostname: java.lang.String,
    callback: js.Function2[
      /* err */ nodeLib.NodeJSNs.ErrnoException, 
      /* addresses */ js.Array[NaptrRecord], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def resolveNs(
    hostname: java.lang.String,
    callback: js.Function2[
      /* err */ nodeLib.NodeJSNs.ErrnoException, 
      /* addresses */ js.Array[java.lang.String], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def resolvePtr(
    hostname: java.lang.String,
    callback: js.Function2[
      /* err */ nodeLib.NodeJSNs.ErrnoException, 
      /* addresses */ js.Array[java.lang.String], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def resolveSoa(
    hostname: java.lang.String,
    callback: js.Function2[/* err */ nodeLib.NodeJSNs.ErrnoException, /* address */ SoaRecord, scala.Unit]
  ): scala.Unit = js.native
  def resolveSrv(
    hostname: java.lang.String,
    callback: js.Function2[
      /* err */ nodeLib.NodeJSNs.ErrnoException, 
      /* addresses */ js.Array[SrvRecord], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def resolveTxt(
    hostname: java.lang.String,
    callback: js.Function2[
      /* err */ nodeLib.NodeJSNs.ErrnoException, 
      /* addresses */ js.Array[js.Array[java.lang.String]], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("resolve")
  def resolve_A(
    hostname: java.lang.String,
    rrtype: nodeLib.nodeLibStrings.A,
    callback: js.Function2[
      /* err */ nodeLib.NodeJSNs.ErrnoException, 
      /* addresses */ js.Array[java.lang.String], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("resolve")
  def resolve_AAAA(
    hostname: java.lang.String,
    rrtype: nodeLib.nodeLibStrings.AAAA,
    callback: js.Function2[
      /* err */ nodeLib.NodeJSNs.ErrnoException, 
      /* addresses */ js.Array[java.lang.String], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("resolve")
  def resolve_ANY(
    hostname: java.lang.String,
    rrtype: nodeLib.nodeLibStrings.ANY,
    callback: js.Function2[
      /* err */ nodeLib.NodeJSNs.ErrnoException, 
      /* addresses */ js.Array[AnyRecord], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("resolve")
  def resolve_CNAME(
    hostname: java.lang.String,
    rrtype: nodeLib.nodeLibStrings.CNAME,
    callback: js.Function2[
      /* err */ nodeLib.NodeJSNs.ErrnoException, 
      /* addresses */ js.Array[java.lang.String], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("resolve")
  def resolve_MX(
    hostname: java.lang.String,
    rrtype: nodeLib.nodeLibStrings.MX,
    callback: js.Function2[
      /* err */ nodeLib.NodeJSNs.ErrnoException, 
      /* addresses */ js.Array[MxRecord], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("resolve")
  def resolve_NAPTR(
    hostname: java.lang.String,
    rrtype: nodeLib.nodeLibStrings.NAPTR,
    callback: js.Function2[
      /* err */ nodeLib.NodeJSNs.ErrnoException, 
      /* addresses */ js.Array[NaptrRecord], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("resolve")
  def resolve_NS(
    hostname: java.lang.String,
    rrtype: nodeLib.nodeLibStrings.NS,
    callback: js.Function2[
      /* err */ nodeLib.NodeJSNs.ErrnoException, 
      /* addresses */ js.Array[java.lang.String], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("resolve")
  def resolve_PTR(
    hostname: java.lang.String,
    rrtype: nodeLib.nodeLibStrings.PTR,
    callback: js.Function2[
      /* err */ nodeLib.NodeJSNs.ErrnoException, 
      /* addresses */ js.Array[java.lang.String], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("resolve")
  def resolve_SOA(
    hostname: java.lang.String,
    rrtype: nodeLib.nodeLibStrings.SOA,
    callback: js.Function2[/* err */ nodeLib.NodeJSNs.ErrnoException, /* addresses */ SoaRecord, scala.Unit]
  ): scala.Unit = js.native
  @JSName("resolve")
  def resolve_SRV(
    hostname: java.lang.String,
    rrtype: nodeLib.nodeLibStrings.SRV,
    callback: js.Function2[
      /* err */ nodeLib.NodeJSNs.ErrnoException, 
      /* addresses */ js.Array[SrvRecord], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("resolve")
  def resolve_TXT(
    hostname: java.lang.String,
    rrtype: nodeLib.nodeLibStrings.TXT,
    callback: js.Function2[
      /* err */ nodeLib.NodeJSNs.ErrnoException, 
      /* addresses */ js.Array[js.Array[java.lang.String]], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def reverse(
    ip: java.lang.String,
    callback: js.Function2[
      /* err */ nodeLib.NodeJSNs.ErrnoException, 
      /* hostnames */ js.Array[java.lang.String], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def setServers(servers: js.Array[java.lang.String]): scala.Unit = js.native
}

