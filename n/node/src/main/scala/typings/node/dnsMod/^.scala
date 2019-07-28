package typings.node.dnsMod

import typings.node.NodeJSNs.ErrnoException
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

@JSImport("dns", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  // Supported getaddrinfo flags.
  val ADDRCONFIG: Double = js.native
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
  val V4MAPPED: Double = js.native
  def getServers(): js.Array[java.lang.String] = js.native
  def lookup(
    hostname: java.lang.String,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* address */ java.lang.String, 
      /* family */ Double, 
      Unit
    ]
  ): Unit = js.native
  def lookup(
    hostname: java.lang.String,
    family: Double,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* address */ java.lang.String, 
      /* family */ Double, 
      Unit
    ]
  ): Unit = js.native
  def lookup(
    hostname: java.lang.String,
    options: LookupAllOptions,
    callback: js.Function2[/* err */ ErrnoException | Null, /* addresses */ js.Array[LookupAddress], Unit]
  ): Unit = js.native
  def lookup(
    hostname: java.lang.String,
    options: LookupOneOptions,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* address */ java.lang.String, 
      /* family */ Double, 
      Unit
    ]
  ): Unit = js.native
  def lookup(
    hostname: java.lang.String,
    options: LookupOptions,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* address */ java.lang.String | js.Array[LookupAddress], 
      /* family */ Double, 
      Unit
    ]
  ): Unit = js.native
  def lookupService(
    address: java.lang.String,
    port: Double,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* hostname */ java.lang.String, 
      /* service */ java.lang.String, 
      Unit
    ]
  ): Unit = js.native
  def resolve(
    hostname: java.lang.String,
    callback: js.Function2[/* err */ ErrnoException | Null, /* addresses */ js.Array[java.lang.String], Unit]
  ): Unit = js.native
  def resolve(
    hostname: java.lang.String,
    rrtype: java.lang.String,
    callback: js.Function2[
      /* err */ ErrnoException | Null, 
      /* addresses */ (js.Array[
        AnyRecord | js.Array[java.lang.String] | MxRecord | NaptrRecord | SrvRecord | java.lang.String
      ]) | SoaRecord, 
      Unit
    ]
  ): Unit = js.native
  def resolve4(
    hostname: java.lang.String,
    callback: js.Function2[/* err */ ErrnoException | Null, /* addresses */ js.Array[java.lang.String], Unit]
  ): Unit = js.native
  def resolve4(
    hostname: java.lang.String,
    options: ResolveOptions,
    callback: js.Function2[
      /* err */ ErrnoException | Null, 
      /* addresses */ js.Array[RecordWithTtl | java.lang.String], 
      Unit
    ]
  ): Unit = js.native
  def resolve4(
    hostname: java.lang.String,
    options: ResolveWithTtlOptions,
    callback: js.Function2[/* err */ ErrnoException | Null, /* addresses */ js.Array[RecordWithTtl], Unit]
  ): Unit = js.native
  def resolve6(
    hostname: java.lang.String,
    callback: js.Function2[/* err */ ErrnoException | Null, /* addresses */ js.Array[java.lang.String], Unit]
  ): Unit = js.native
  def resolve6(
    hostname: java.lang.String,
    options: ResolveOptions,
    callback: js.Function2[
      /* err */ ErrnoException | Null, 
      /* addresses */ js.Array[RecordWithTtl | java.lang.String], 
      Unit
    ]
  ): Unit = js.native
  def resolve6(
    hostname: java.lang.String,
    options: ResolveWithTtlOptions,
    callback: js.Function2[/* err */ ErrnoException | Null, /* addresses */ js.Array[RecordWithTtl], Unit]
  ): Unit = js.native
  def resolveAny(
    hostname: java.lang.String,
    callback: js.Function2[/* err */ ErrnoException | Null, /* addresses */ js.Array[AnyRecord], Unit]
  ): Unit = js.native
  def resolveCname(
    hostname: java.lang.String,
    callback: js.Function2[/* err */ ErrnoException | Null, /* addresses */ js.Array[java.lang.String], Unit]
  ): Unit = js.native
  def resolveMx(
    hostname: java.lang.String,
    callback: js.Function2[/* err */ ErrnoException | Null, /* addresses */ js.Array[MxRecord], Unit]
  ): Unit = js.native
  def resolveNaptr(
    hostname: java.lang.String,
    callback: js.Function2[/* err */ ErrnoException | Null, /* addresses */ js.Array[NaptrRecord], Unit]
  ): Unit = js.native
  def resolveNs(
    hostname: java.lang.String,
    callback: js.Function2[/* err */ ErrnoException | Null, /* addresses */ js.Array[java.lang.String], Unit]
  ): Unit = js.native
  def resolvePtr(
    hostname: java.lang.String,
    callback: js.Function2[/* err */ ErrnoException | Null, /* addresses */ js.Array[java.lang.String], Unit]
  ): Unit = js.native
  def resolveSoa(
    hostname: java.lang.String,
    callback: js.Function2[/* err */ ErrnoException | Null, /* address */ SoaRecord, Unit]
  ): Unit = js.native
  def resolveSrv(
    hostname: java.lang.String,
    callback: js.Function2[/* err */ ErrnoException | Null, /* addresses */ js.Array[SrvRecord], Unit]
  ): Unit = js.native
  def resolveTxt(
    hostname: java.lang.String,
    callback: js.Function2[
      /* err */ ErrnoException | Null, 
      /* addresses */ js.Array[js.Array[java.lang.String]], 
      Unit
    ]
  ): Unit = js.native
  @JSName("resolve")
  def resolve_A(
    hostname: java.lang.String,
    rrtype: A,
    callback: js.Function2[/* err */ ErrnoException | Null, /* addresses */ js.Array[java.lang.String], Unit]
  ): Unit = js.native
  @JSName("resolve")
  def resolve_AAAA(
    hostname: java.lang.String,
    rrtype: AAAA,
    callback: js.Function2[/* err */ ErrnoException | Null, /* addresses */ js.Array[java.lang.String], Unit]
  ): Unit = js.native
  @JSName("resolve")
  def resolve_ANY(
    hostname: java.lang.String,
    rrtype: ANY,
    callback: js.Function2[/* err */ ErrnoException | Null, /* addresses */ js.Array[AnyRecord], Unit]
  ): Unit = js.native
  @JSName("resolve")
  def resolve_CNAME(
    hostname: java.lang.String,
    rrtype: CNAME,
    callback: js.Function2[/* err */ ErrnoException | Null, /* addresses */ js.Array[java.lang.String], Unit]
  ): Unit = js.native
  @JSName("resolve")
  def resolve_MX(
    hostname: java.lang.String,
    rrtype: MX,
    callback: js.Function2[/* err */ ErrnoException | Null, /* addresses */ js.Array[MxRecord], Unit]
  ): Unit = js.native
  @JSName("resolve")
  def resolve_NAPTR(
    hostname: java.lang.String,
    rrtype: NAPTR,
    callback: js.Function2[/* err */ ErrnoException | Null, /* addresses */ js.Array[NaptrRecord], Unit]
  ): Unit = js.native
  @JSName("resolve")
  def resolve_NS(
    hostname: java.lang.String,
    rrtype: NS,
    callback: js.Function2[/* err */ ErrnoException | Null, /* addresses */ js.Array[java.lang.String], Unit]
  ): Unit = js.native
  @JSName("resolve")
  def resolve_PTR(
    hostname: java.lang.String,
    rrtype: PTR,
    callback: js.Function2[/* err */ ErrnoException | Null, /* addresses */ js.Array[java.lang.String], Unit]
  ): Unit = js.native
  @JSName("resolve")
  def resolve_SOA(
    hostname: java.lang.String,
    rrtype: SOA,
    callback: js.Function2[/* err */ ErrnoException | Null, /* addresses */ SoaRecord, Unit]
  ): Unit = js.native
  @JSName("resolve")
  def resolve_SRV(
    hostname: java.lang.String,
    rrtype: SRV,
    callback: js.Function2[/* err */ ErrnoException | Null, /* addresses */ js.Array[SrvRecord], Unit]
  ): Unit = js.native
  @JSName("resolve")
  def resolve_TXT(
    hostname: java.lang.String,
    rrtype: TXT,
    callback: js.Function2[
      /* err */ ErrnoException | Null, 
      /* addresses */ js.Array[js.Array[java.lang.String]], 
      Unit
    ]
  ): Unit = js.native
  def reverse(
    ip: java.lang.String,
    callback: js.Function2[/* err */ ErrnoException | Null, /* hostnames */ js.Array[java.lang.String], Unit]
  ): Unit = js.native
  def setServers(servers: js.Array[java.lang.String]): Unit = js.native
}

