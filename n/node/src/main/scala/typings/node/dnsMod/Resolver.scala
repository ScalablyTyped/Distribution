package typings.node.dnsMod

import typings.node.Anon_A
import typings.node.Anon_Addresses
import typings.node.NodeJSNs.ErrnoException
import typings.node.TypeofresolveAny
import typings.node.TypeofresolveCname
import typings.node.TypeofresolveMx
import typings.node.TypeofresolveNaptr
import typings.node.TypeofresolveNs
import typings.node.TypeofresolvePtr
import typings.node.TypeofresolveSoa
import typings.node.TypeofresolveSrv
import typings.node.TypeofresolveTxt
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

@JSImport("dns", "Resolver")
@js.native
class Resolver () extends js.Object {
  @JSName("getServers")
  var getServers_Original: js.Function0[js.Array[java.lang.String]] = js.native
  @JSName("resolve4")
  var resolve4_Original: Anon_Addresses = js.native
  @JSName("resolve6")
  var resolve6_Original: Anon_Addresses = js.native
  @JSName("resolveAny")
  var resolveAny_Original: (js.Function2[
    /* hostname */ java.lang.String, 
    /* callback */ js.Function2[/* err */ ErrnoException | Null, /* addresses */ js.Array[AnyRecord], Unit], 
    Unit
  ]) with TypeofresolveAny = js.native
  @JSName("resolveCname")
  var resolveCname_Original: (js.Function2[
    /* hostname */ java.lang.String, 
    /* callback */ js.Function2[/* err */ ErrnoException | Null, /* addresses */ js.Array[java.lang.String], Unit], 
    Unit
  ]) with TypeofresolveCname = js.native
  @JSName("resolveMx")
  var resolveMx_Original: (js.Function2[
    /* hostname */ java.lang.String, 
    /* callback */ js.Function2[/* err */ ErrnoException | Null, /* addresses */ js.Array[MxRecord], Unit], 
    Unit
  ]) with TypeofresolveMx = js.native
  @JSName("resolveNaptr")
  var resolveNaptr_Original: (js.Function2[
    /* hostname */ java.lang.String, 
    /* callback */ js.Function2[/* err */ ErrnoException | Null, /* addresses */ js.Array[NaptrRecord], Unit], 
    Unit
  ]) with TypeofresolveNaptr = js.native
  @JSName("resolveNs")
  var resolveNs_Original: (js.Function2[
    /* hostname */ java.lang.String, 
    /* callback */ js.Function2[/* err */ ErrnoException | Null, /* addresses */ js.Array[java.lang.String], Unit], 
    Unit
  ]) with TypeofresolveNs = js.native
  @JSName("resolvePtr")
  var resolvePtr_Original: (js.Function2[
    /* hostname */ java.lang.String, 
    /* callback */ js.Function2[/* err */ ErrnoException | Null, /* addresses */ js.Array[java.lang.String], Unit], 
    Unit
  ]) with TypeofresolvePtr = js.native
  @JSName("resolveSoa")
  var resolveSoa_Original: (js.Function2[
    /* hostname */ java.lang.String, 
    /* callback */ js.Function2[/* err */ ErrnoException | Null, /* address */ SoaRecord, Unit], 
    Unit
  ]) with TypeofresolveSoa = js.native
  @JSName("resolveSrv")
  var resolveSrv_Original: (js.Function2[
    /* hostname */ java.lang.String, 
    /* callback */ js.Function2[/* err */ ErrnoException | Null, /* addresses */ js.Array[SrvRecord], Unit], 
    Unit
  ]) with TypeofresolveSrv = js.native
  @JSName("resolveTxt")
  var resolveTxt_Original: (js.Function2[
    /* hostname */ java.lang.String, 
    /* callback */ js.Function2[
      /* err */ ErrnoException | Null, 
      /* addresses */ js.Array[js.Array[java.lang.String]], 
      Unit
    ], 
    Unit
  ]) with TypeofresolveTxt = js.native
  @JSName("resolve")
  var resolve_Original: Anon_A = js.native
  @JSName("reverse")
  var reverse_Original: js.Function2[
    /* ip */ java.lang.String, 
    /* callback */ js.Function2[/* err */ ErrnoException | Null, /* hostnames */ js.Array[java.lang.String], Unit], 
    Unit
  ] = js.native
  @JSName("setServers")
  var setServers_Original: js.Function1[/* servers */ js.Array[java.lang.String], Unit] = js.native
  def cancel(): Unit = js.native
  def getServers(): js.Array[java.lang.String] = js.native
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

