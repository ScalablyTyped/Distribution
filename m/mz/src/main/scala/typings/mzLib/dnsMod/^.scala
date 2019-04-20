package typings
package mzLib.dnsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mz/dns", JSImport.Namespace)
@js.native
object ^ extends js.Object {
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
  def lookup(domain: java.lang.String): js.Promise[js.Tuple2[java.lang.String, scala.Double]] = js.native
  def lookup(domain: java.lang.String, family: scala.Double): js.Promise[js.Tuple2[java.lang.String, scala.Double]] = js.native
  def lookup(
    hostname: java.lang.String,
    callback: js.Function3[
      nodeLib.NodeJSNs.ErrnoException | (/* err */ stdLib.Error) | scala.Null, 
      /* address */ java.lang.String, 
      /* family */ scala.Double, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def lookup(
    hostname: java.lang.String,
    family: scala.Double,
    callback: js.Function3[
      nodeLib.NodeJSNs.ErrnoException | (/* err */ stdLib.Error) | scala.Null, 
      /* address */ java.lang.String, 
      /* family */ scala.Double, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def lookup(
    hostname: java.lang.String,
    options: nodeLib.dnsMod.LookupAllOptions,
    callback: js.Function2[
      /* err */ nodeLib.NodeJSNs.ErrnoException | scala.Null, 
      /* addresses */ js.Array[nodeLib.dnsMod.LookupAddress], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def lookup(
    hostname: java.lang.String,
    options: nodeLib.dnsMod.LookupOneOptions,
    callback: js.Function3[
      /* err */ nodeLib.NodeJSNs.ErrnoException | scala.Null, 
      /* address */ java.lang.String, 
      /* family */ scala.Double, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def lookup(
    hostname: java.lang.String,
    options: nodeLib.dnsMod.LookupOptions,
    callback: js.Function3[
      /* err */ nodeLib.NodeJSNs.ErrnoException | scala.Null, 
      /* address */ java.lang.String | js.Array[nodeLib.dnsMod.LookupAddress], 
      /* family */ scala.Double, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def lookupService(
    address: java.lang.String,
    port: scala.Double,
    callback: js.Function3[
      /* err */ nodeLib.NodeJSNs.ErrnoException | scala.Null, 
      /* hostname */ java.lang.String, 
      /* service */ java.lang.String, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def resolve(domain: java.lang.String): js.Promise[js.Array[java.lang.String]] = js.native
  def resolve(domain: java.lang.String, rrtype: java.lang.String): js.Promise[js.Array[java.lang.String]] = js.native
  def resolve(
    hostname: java.lang.String,
    callback: js.Function2[
      nodeLib.NodeJSNs.ErrnoException | (/* err */ stdLib.Error) | scala.Null, 
      /* addresses */ js.Array[java.lang.String], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def resolve(
    hostname: java.lang.String,
    rrtype: java.lang.String,
    callback: js.Function2[
      nodeLib.NodeJSNs.ErrnoException | (/* err */ stdLib.Error) | scala.Null, 
      (/* addresses */ js.Array[java.lang.String]) | js.Array[nodeLib.dnsMod.MxRecord] | js.Array[nodeLib.dnsMod.NaptrRecord] | js.Array[nodeLib.dnsMod.SrvRecord] | js.Array[js.Array[java.lang.String]] | js.Array[nodeLib.dnsMod.AnyRecord] | nodeLib.dnsMod.SoaRecord, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def resolve4(domain: java.lang.String): js.Promise[js.Array[java.lang.String]] = js.native
  def resolve4(
    hostname: java.lang.String,
    callback: js.Function2[
      nodeLib.NodeJSNs.ErrnoException | (/* err */ stdLib.Error) | scala.Null, 
      /* addresses */ js.Array[java.lang.String], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def resolve4(
    hostname: java.lang.String,
    options: nodeLib.dnsMod.ResolveOptions,
    callback: js.Function2[
      /* err */ nodeLib.NodeJSNs.ErrnoException | scala.Null, 
      /* addresses */ js.Array[java.lang.String] | js.Array[nodeLib.dnsMod.RecordWithTtl], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def resolve4(
    hostname: java.lang.String,
    options: nodeLib.dnsMod.ResolveWithTtlOptions,
    callback: js.Function2[
      /* err */ nodeLib.NodeJSNs.ErrnoException | scala.Null, 
      /* addresses */ js.Array[nodeLib.dnsMod.RecordWithTtl], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def resolve6(domain: java.lang.String): js.Promise[js.Array[java.lang.String]] = js.native
  def resolve6(
    hostname: java.lang.String,
    callback: js.Function2[
      nodeLib.NodeJSNs.ErrnoException | (/* err */ stdLib.Error) | scala.Null, 
      /* addresses */ js.Array[java.lang.String], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def resolve6(
    hostname: java.lang.String,
    options: nodeLib.dnsMod.ResolveOptions,
    callback: js.Function2[
      /* err */ nodeLib.NodeJSNs.ErrnoException | scala.Null, 
      /* addresses */ js.Array[java.lang.String] | js.Array[nodeLib.dnsMod.RecordWithTtl], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def resolve6(
    hostname: java.lang.String,
    options: nodeLib.dnsMod.ResolveWithTtlOptions,
    callback: js.Function2[
      /* err */ nodeLib.NodeJSNs.ErrnoException | scala.Null, 
      /* addresses */ js.Array[nodeLib.dnsMod.RecordWithTtl], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def resolveAny(
    hostname: java.lang.String,
    callback: js.Function2[
      /* err */ nodeLib.NodeJSNs.ErrnoException | scala.Null, 
      /* addresses */ js.Array[nodeLib.dnsMod.AnyRecord], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def resolveCname(domain: java.lang.String): js.Promise[js.Array[java.lang.String]] = js.native
  def resolveCname(
    hostname: java.lang.String,
    callback: js.Function2[
      nodeLib.NodeJSNs.ErrnoException | (/* err */ stdLib.Error) | scala.Null, 
      /* addresses */ js.Array[java.lang.String], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def resolveMx(domain: java.lang.String): js.Promise[js.Array[nodeLib.dnsMod.MxRecord]] = js.native
  def resolveMx(
    hostname: java.lang.String,
    callback: js.Function2[
      nodeLib.NodeJSNs.ErrnoException | (/* err */ stdLib.Error) | scala.Null, 
      /* addresses */ js.Array[nodeLib.dnsMod.MxRecord], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def resolveNaptr(
    hostname: java.lang.String,
    callback: js.Function2[
      /* err */ nodeLib.NodeJSNs.ErrnoException | scala.Null, 
      /* addresses */ js.Array[nodeLib.dnsMod.NaptrRecord], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def resolveNs(domain: java.lang.String): js.Promise[js.Array[java.lang.String]] = js.native
  def resolveNs(
    hostname: java.lang.String,
    callback: js.Function2[
      nodeLib.NodeJSNs.ErrnoException | (/* err */ stdLib.Error) | scala.Null, 
      /* addresses */ js.Array[java.lang.String], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def resolvePtr(
    hostname: java.lang.String,
    callback: js.Function2[
      /* err */ nodeLib.NodeJSNs.ErrnoException | scala.Null, 
      /* addresses */ js.Array[java.lang.String], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def resolveSoa(
    hostname: java.lang.String,
    callback: js.Function2[
      /* err */ nodeLib.NodeJSNs.ErrnoException | scala.Null, 
      /* address */ nodeLib.dnsMod.SoaRecord, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def resolveSrv(domain: java.lang.String): js.Promise[js.Array[java.lang.String]] = js.native
  def resolveSrv(
    hostname: java.lang.String,
    callback: js.Function2[
      nodeLib.NodeJSNs.ErrnoException | (/* err */ stdLib.Error) | scala.Null, 
      /* addresses */ js.Array[nodeLib.dnsMod.SrvRecord | java.lang.String], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def resolveTxt(domain: java.lang.String): js.Promise[js.Array[java.lang.String]] = js.native
  def resolveTxt(
    hostname: java.lang.String,
    callback: js.Function2[
      nodeLib.NodeJSNs.ErrnoException | (/* err */ stdLib.Error) | scala.Null, 
      /* addresses */ js.Array[js.Array[java.lang.String] | java.lang.String], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("resolve")
  def resolve_A(
    hostname: java.lang.String,
    rrtype: mzLib.mzLibStrings.A,
    callback: js.Function2[
      /* err */ nodeLib.NodeJSNs.ErrnoException | scala.Null, 
      /* addresses */ js.Array[java.lang.String], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("resolve")
  def resolve_AAAA(
    hostname: java.lang.String,
    rrtype: mzLib.mzLibStrings.AAAA,
    callback: js.Function2[
      /* err */ nodeLib.NodeJSNs.ErrnoException | scala.Null, 
      /* addresses */ js.Array[java.lang.String], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("resolve")
  def resolve_ANY(
    hostname: java.lang.String,
    rrtype: mzLib.mzLibStrings.ANY,
    callback: js.Function2[
      /* err */ nodeLib.NodeJSNs.ErrnoException | scala.Null, 
      /* addresses */ js.Array[nodeLib.dnsMod.AnyRecord], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("resolve")
  def resolve_CNAME(
    hostname: java.lang.String,
    rrtype: mzLib.mzLibStrings.CNAME,
    callback: js.Function2[
      /* err */ nodeLib.NodeJSNs.ErrnoException | scala.Null, 
      /* addresses */ js.Array[java.lang.String], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("resolve")
  def resolve_MX(
    hostname: java.lang.String,
    rrtype: mzLib.mzLibStrings.MX,
    callback: js.Function2[
      /* err */ nodeLib.NodeJSNs.ErrnoException | scala.Null, 
      /* addresses */ js.Array[nodeLib.dnsMod.MxRecord], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("resolve")
  def resolve_NAPTR(
    hostname: java.lang.String,
    rrtype: mzLib.mzLibStrings.NAPTR,
    callback: js.Function2[
      /* err */ nodeLib.NodeJSNs.ErrnoException | scala.Null, 
      /* addresses */ js.Array[nodeLib.dnsMod.NaptrRecord], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("resolve")
  def resolve_NS(
    hostname: java.lang.String,
    rrtype: mzLib.mzLibStrings.NS,
    callback: js.Function2[
      /* err */ nodeLib.NodeJSNs.ErrnoException | scala.Null, 
      /* addresses */ js.Array[java.lang.String], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("resolve")
  def resolve_PTR(
    hostname: java.lang.String,
    rrtype: mzLib.mzLibStrings.PTR,
    callback: js.Function2[
      /* err */ nodeLib.NodeJSNs.ErrnoException | scala.Null, 
      /* addresses */ js.Array[java.lang.String], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("resolve")
  def resolve_SOA(
    hostname: java.lang.String,
    rrtype: mzLib.mzLibStrings.SOA,
    callback: js.Function2[
      /* err */ nodeLib.NodeJSNs.ErrnoException | scala.Null, 
      /* addresses */ nodeLib.dnsMod.SoaRecord, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("resolve")
  def resolve_SRV(
    hostname: java.lang.String,
    rrtype: mzLib.mzLibStrings.SRV,
    callback: js.Function2[
      /* err */ nodeLib.NodeJSNs.ErrnoException | scala.Null, 
      /* addresses */ js.Array[nodeLib.dnsMod.SrvRecord], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("resolve")
  def resolve_TXT(
    hostname: java.lang.String,
    rrtype: mzLib.mzLibStrings.TXT,
    callback: js.Function2[
      /* err */ nodeLib.NodeJSNs.ErrnoException | scala.Null, 
      /* addresses */ js.Array[js.Array[java.lang.String]], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def reverse(ip: java.lang.String): js.Promise[js.Array[java.lang.String]] = js.native
  def reverse(
    ip: java.lang.String,
    callback: js.Function2[
      nodeLib.NodeJSNs.ErrnoException | (/* err */ stdLib.Error) | scala.Null, 
      /* hostnames */ /* domains */ js.Array[java.lang.String], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def setServers(servers: js.Array[java.lang.String]): scala.Unit = js.native
}

