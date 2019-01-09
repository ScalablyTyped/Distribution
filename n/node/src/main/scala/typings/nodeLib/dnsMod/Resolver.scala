package typings
package nodeLib.dnsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("dns", "Resolver")
@js.native
class Resolver () extends js.Object {
  @JSName("getServers")
  var getServers_Original: js.Function0[js.Array[java.lang.String]] = js.native
  @JSName("resolve4")
  var resolve4_Original: nodeLib.Anon_Addresses = js.native
  @JSName("resolve6")
  var resolve6_Original: nodeLib.Anon_Addresses = js.native
  @JSName("resolveAny")
  var resolveAny_Original: (js.Function2[
    /* hostname */ java.lang.String, 
    /* callback */ js.Function2[
      /* err */ nodeLib.NodeJSNs.ErrnoException, 
      /* addresses */ js.Array[AnyRecord], 
      scala.Unit
    ], 
    scala.Unit
  ]) with nodeLib.Anon_HostnamePromisify = js.native
  @JSName("resolveCname")
  var resolveCname_Original: (js.Function2[
    /* hostname */ java.lang.String, 
    /* callback */ js.Function2[
      /* err */ nodeLib.NodeJSNs.ErrnoException, 
      /* addresses */ js.Array[java.lang.String], 
      scala.Unit
    ], 
    scala.Unit
  ]) with nodeLib.Anon_HostnamePromisifyArray = js.native
  @JSName("resolveMx")
  var resolveMx_Original: (js.Function2[
    /* hostname */ java.lang.String, 
    /* callback */ js.Function2[
      /* err */ nodeLib.NodeJSNs.ErrnoException, 
      /* addresses */ js.Array[MxRecord], 
      scala.Unit
    ], 
    scala.Unit
  ]) with nodeLib.Anon_HostnamePromisifyArrayMxRecord = js.native
  @JSName("resolveNaptr")
  var resolveNaptr_Original: (js.Function2[
    /* hostname */ java.lang.String, 
    /* callback */ js.Function2[
      /* err */ nodeLib.NodeJSNs.ErrnoException, 
      /* addresses */ js.Array[NaptrRecord], 
      scala.Unit
    ], 
    scala.Unit
  ]) with nodeLib.Anon_HostnamePromisifyArrayNaptrRecord = js.native
  @JSName("resolveNs")
  var resolveNs_Original: (js.Function2[
    /* hostname */ java.lang.String, 
    /* callback */ js.Function2[
      /* err */ nodeLib.NodeJSNs.ErrnoException, 
      /* addresses */ js.Array[java.lang.String], 
      scala.Unit
    ], 
    scala.Unit
  ]) with nodeLib.Anon_HostnamePromisifyArray = js.native
  @JSName("resolvePtr")
  var resolvePtr_Original: (js.Function2[
    /* hostname */ java.lang.String, 
    /* callback */ js.Function2[
      /* err */ nodeLib.NodeJSNs.ErrnoException, 
      /* addresses */ js.Array[java.lang.String], 
      scala.Unit
    ], 
    scala.Unit
  ]) with nodeLib.Anon_HostnamePromisifyArray = js.native
  @JSName("resolveSoa")
  var resolveSoa_Original: (js.Function2[
    /* hostname */ java.lang.String, 
    /* callback */ js.Function2[/* err */ nodeLib.NodeJSNs.ErrnoException, /* address */ SoaRecord, scala.Unit], 
    scala.Unit
  ]) with nodeLib.Anon_HostnamePromisifyPromise = js.native
  @JSName("resolveSrv")
  var resolveSrv_Original: (js.Function2[
    /* hostname */ java.lang.String, 
    /* callback */ js.Function2[
      /* err */ nodeLib.NodeJSNs.ErrnoException, 
      /* addresses */ js.Array[SrvRecord], 
      scala.Unit
    ], 
    scala.Unit
  ]) with nodeLib.Anon_HostnamePromisifyArrayPromise = js.native
  @JSName("resolveTxt")
  var resolveTxt_Original: (js.Function2[
    /* hostname */ java.lang.String, 
    /* callback */ js.Function2[
      /* err */ nodeLib.NodeJSNs.ErrnoException, 
      /* addresses */ js.Array[js.Array[java.lang.String]], 
      scala.Unit
    ], 
    scala.Unit
  ]) with nodeLib.Anon_HostnamePromisifyArrayPromiseString = js.native
  @JSName("resolve")
  var resolve_Original: nodeLib.Anon_A = js.native
  @JSName("reverse")
  var reverse_Original: js.Function2[
    /* ip */ java.lang.String, 
    /* callback */ js.Function2[
      /* err */ nodeLib.NodeJSNs.ErrnoException, 
      /* hostnames */ js.Array[java.lang.String], 
      scala.Unit
    ], 
    scala.Unit
  ] = js.native
  @JSName("setServers")
  var setServers_Original: js.Function1[/* servers */ js.Array[java.lang.String], scala.Unit] = js.native
  def cancel(): scala.Unit = js.native
  def getServers(): js.Array[java.lang.String] = js.native
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

