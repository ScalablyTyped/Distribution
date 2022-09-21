package typings.node.dnsMod

import typings.node.dnsMod.^
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
import typings.node.nodeStrings.ipv4first
import typings.node.nodeStrings.verbatim
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def ADDRCONFIG: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("ADDRCONFIG").asInstanceOf[Double]

inline def ADDRGETNETWORKPARAMS: String = ^.asInstanceOf[js.Dynamic].selectDynamic("ADDRGETNETWORKPARAMS").asInstanceOf[String]

inline def ALL: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("ALL").asInstanceOf[Double]

inline def BADFAMILY: String = ^.asInstanceOf[js.Dynamic].selectDynamic("BADFAMILY").asInstanceOf[String]

inline def BADFLAGS: String = ^.asInstanceOf[js.Dynamic].selectDynamic("BADFLAGS").asInstanceOf[String]

inline def BADHINTS: String = ^.asInstanceOf[js.Dynamic].selectDynamic("BADHINTS").asInstanceOf[String]

inline def BADNAME: String = ^.asInstanceOf[js.Dynamic].selectDynamic("BADNAME").asInstanceOf[String]

inline def BADQUERY: String = ^.asInstanceOf[js.Dynamic].selectDynamic("BADQUERY").asInstanceOf[String]

inline def BADRESP: String = ^.asInstanceOf[js.Dynamic].selectDynamic("BADRESP").asInstanceOf[String]

inline def BADSTR: String = ^.asInstanceOf[js.Dynamic].selectDynamic("BADSTR").asInstanceOf[String]

inline def CANCELLED: String = ^.asInstanceOf[js.Dynamic].selectDynamic("CANCELLED").asInstanceOf[String]

inline def CONNREFUSED: String = ^.asInstanceOf[js.Dynamic].selectDynamic("CONNREFUSED").asInstanceOf[String]

inline def DESTRUCTION: String = ^.asInstanceOf[js.Dynamic].selectDynamic("DESTRUCTION").asInstanceOf[String]

inline def EOF: String = ^.asInstanceOf[js.Dynamic].selectDynamic("EOF").asInstanceOf[String]

inline def FILE: String = ^.asInstanceOf[js.Dynamic].selectDynamic("FILE").asInstanceOf[String]

inline def FORMERR: String = ^.asInstanceOf[js.Dynamic].selectDynamic("FORMERR").asInstanceOf[String]

inline def LOADIPHLPAPI: String = ^.asInstanceOf[js.Dynamic].selectDynamic("LOADIPHLPAPI").asInstanceOf[String]

inline def NODATA: String = ^.asInstanceOf[js.Dynamic].selectDynamic("NODATA").asInstanceOf[String]

inline def NOMEM: String = ^.asInstanceOf[js.Dynamic].selectDynamic("NOMEM").asInstanceOf[String]

inline def NONAME: String = ^.asInstanceOf[js.Dynamic].selectDynamic("NONAME").asInstanceOf[String]

inline def NOTFOUND: String = ^.asInstanceOf[js.Dynamic].selectDynamic("NOTFOUND").asInstanceOf[String]

inline def NOTIMP: String = ^.asInstanceOf[js.Dynamic].selectDynamic("NOTIMP").asInstanceOf[String]

inline def NOTINITIALIZED: String = ^.asInstanceOf[js.Dynamic].selectDynamic("NOTINITIALIZED").asInstanceOf[String]

inline def REFUSED: String = ^.asInstanceOf[js.Dynamic].selectDynamic("REFUSED").asInstanceOf[String]

inline def SERVFAIL: String = ^.asInstanceOf[js.Dynamic].selectDynamic("SERVFAIL").asInstanceOf[String]

inline def TIMEOUT: String = ^.asInstanceOf[js.Dynamic].selectDynamic("TIMEOUT").asInstanceOf[String]

inline def V4MAPPED: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("V4MAPPED").asInstanceOf[Double]

inline def getServers(): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getServers")().asInstanceOf[js.Array[String]]

inline def lookup(
  hostname: String,
  callback: js.Function3[
  /* err */ (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NodeJS.ErrnoException */ Any) | Null, 
  /* address */ String, 
  /* family */ Double, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("lookup")(hostname.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def lookup(
  hostname: String,
  family: Double,
  callback: js.Function3[
  /* err */ (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NodeJS.ErrnoException */ Any) | Null, 
  /* address */ String, 
  /* family */ Double, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("lookup")(hostname.asInstanceOf[js.Any], family.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def lookup(
  hostname: String,
  options: LookupAllOptions,
  callback: js.Function2[
  /* err */ (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NodeJS.ErrnoException */ Any) | Null, 
  /* addresses */ js.Array[LookupAddress], 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("lookup")(hostname.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def lookup(
  hostname: String,
  options: LookupOneOptions,
  callback: js.Function3[
  /* err */ (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NodeJS.ErrnoException */ Any) | Null, 
  /* address */ String, 
  /* family */ Double, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("lookup")(hostname.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def lookup(
  hostname: String,
  options: LookupOptions,
  callback: js.Function3[
  /* err */ (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NodeJS.ErrnoException */ Any) | Null, 
  /* address */ String | js.Array[LookupAddress], 
  /* family */ Double, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("lookup")(hostname.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def lookupService(
  address: String,
  port: Double,
  callback: js.Function3[
  /* err */ (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NodeJS.ErrnoException */ Any) | Null, 
  /* hostname */ String, 
  /* service */ String, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("lookupService")(address.asInstanceOf[js.Any], port.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def resolve(
  hostname: String,
  callback: js.Function2[
  /* err */ (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NodeJS.ErrnoException */ Any) | Null, 
  /* addresses */ js.Array[String], 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("resolve")(hostname.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def resolve(
  hostname: String,
  rrtype: String,
  callback: js.Function2[
  /* err */ (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NodeJS.ErrnoException */ Any) | Null, 
  /* addresses */ (js.Array[AnyRecord | js.Array[String] | MxRecord | NaptrRecord | SrvRecord | String]) | SoaRecord, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("resolve")(hostname.asInstanceOf[js.Any], rrtype.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def resolve(
  hostname: String,
  rrtype: AAAA,
  callback: js.Function2[
  /* err */ (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NodeJS.ErrnoException */ Any) | Null, 
  /* addresses */ js.Array[String], 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("resolve")(hostname.asInstanceOf[js.Any], rrtype.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def resolve(
  hostname: String,
  rrtype: ANY,
  callback: js.Function2[
  /* err */ (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NodeJS.ErrnoException */ Any) | Null, 
  /* addresses */ js.Array[AnyRecord], 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("resolve")(hostname.asInstanceOf[js.Any], rrtype.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def resolve(
  hostname: String,
  rrtype: A,
  callback: js.Function2[
  /* err */ (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NodeJS.ErrnoException */ Any) | Null, 
  /* addresses */ js.Array[String], 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("resolve")(hostname.asInstanceOf[js.Any], rrtype.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def resolve(
  hostname: String,
  rrtype: CNAME,
  callback: js.Function2[
  /* err */ (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NodeJS.ErrnoException */ Any) | Null, 
  /* addresses */ js.Array[String], 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("resolve")(hostname.asInstanceOf[js.Any], rrtype.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def resolve(
  hostname: String,
  rrtype: MX,
  callback: js.Function2[
  /* err */ (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NodeJS.ErrnoException */ Any) | Null, 
  /* addresses */ js.Array[MxRecord], 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("resolve")(hostname.asInstanceOf[js.Any], rrtype.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def resolve(
  hostname: String,
  rrtype: NAPTR,
  callback: js.Function2[
  /* err */ (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NodeJS.ErrnoException */ Any) | Null, 
  /* addresses */ js.Array[NaptrRecord], 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("resolve")(hostname.asInstanceOf[js.Any], rrtype.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def resolve(
  hostname: String,
  rrtype: NS,
  callback: js.Function2[
  /* err */ (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NodeJS.ErrnoException */ Any) | Null, 
  /* addresses */ js.Array[String], 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("resolve")(hostname.asInstanceOf[js.Any], rrtype.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def resolve(
  hostname: String,
  rrtype: PTR,
  callback: js.Function2[
  /* err */ (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NodeJS.ErrnoException */ Any) | Null, 
  /* addresses */ js.Array[String], 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("resolve")(hostname.asInstanceOf[js.Any], rrtype.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def resolve(
  hostname: String,
  rrtype: SOA,
  callback: js.Function2[
  /* err */ (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NodeJS.ErrnoException */ Any) | Null, 
  /* addresses */ SoaRecord, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("resolve")(hostname.asInstanceOf[js.Any], rrtype.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def resolve(
  hostname: String,
  rrtype: SRV,
  callback: js.Function2[
  /* err */ (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NodeJS.ErrnoException */ Any) | Null, 
  /* addresses */ js.Array[SrvRecord], 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("resolve")(hostname.asInstanceOf[js.Any], rrtype.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def resolve(
  hostname: String,
  rrtype: TXT,
  callback: js.Function2[
  /* err */ (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NodeJS.ErrnoException */ Any) | Null, 
  /* addresses */ js.Array[js.Array[String]], 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("resolve")(hostname.asInstanceOf[js.Any], rrtype.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def resolve4(
  hostname: String,
  callback: js.Function2[
  /* err */ (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NodeJS.ErrnoException */ Any) | Null, 
  /* addresses */ js.Array[String], 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("resolve4")(hostname.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def resolve4(
  hostname: String,
  options: ResolveOptions,
  callback: js.Function2[
  /* err */ (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NodeJS.ErrnoException */ Any) | Null, 
  /* addresses */ js.Array[RecordWithTtl | String], 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("resolve4")(hostname.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def resolve4(
  hostname: String,
  options: ResolveWithTtlOptions,
  callback: js.Function2[
  /* err */ (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NodeJS.ErrnoException */ Any) | Null, 
  /* addresses */ js.Array[RecordWithTtl], 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("resolve4")(hostname.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def resolve6(
  hostname: String,
  callback: js.Function2[
  /* err */ (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NodeJS.ErrnoException */ Any) | Null, 
  /* addresses */ js.Array[String], 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("resolve6")(hostname.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def resolve6(
  hostname: String,
  options: ResolveOptions,
  callback: js.Function2[
  /* err */ (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NodeJS.ErrnoException */ Any) | Null, 
  /* addresses */ js.Array[RecordWithTtl | String], 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("resolve6")(hostname.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def resolve6(
  hostname: String,
  options: ResolveWithTtlOptions,
  callback: js.Function2[
  /* err */ (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NodeJS.ErrnoException */ Any) | Null, 
  /* addresses */ js.Array[RecordWithTtl], 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("resolve6")(hostname.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def resolveAny(
  hostname: String,
  callback: js.Function2[
  /* err */ (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NodeJS.ErrnoException */ Any) | Null, 
  /* addresses */ js.Array[AnyRecord], 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveAny")(hostname.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def resolveCaa(
  hostname: String,
  callback: js.Function2[
  /* err */ (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NodeJS.ErrnoException */ Any) | Null, 
  /* records */ js.Array[CaaRecord], 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveCaa")(hostname.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def resolveCname(
  hostname: String,
  callback: js.Function2[
  /* err */ (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NodeJS.ErrnoException */ Any) | Null, 
  /* addresses */ js.Array[String], 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveCname")(hostname.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def resolveMx(
  hostname: String,
  callback: js.Function2[
  /* err */ (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NodeJS.ErrnoException */ Any) | Null, 
  /* addresses */ js.Array[MxRecord], 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveMx")(hostname.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def resolveNaptr(
  hostname: String,
  callback: js.Function2[
  /* err */ (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NodeJS.ErrnoException */ Any) | Null, 
  /* addresses */ js.Array[NaptrRecord], 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveNaptr")(hostname.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def resolveNs(
  hostname: String,
  callback: js.Function2[
  /* err */ (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NodeJS.ErrnoException */ Any) | Null, 
  /* addresses */ js.Array[String], 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveNs")(hostname.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def resolvePtr(
  hostname: String,
  callback: js.Function2[
  /* err */ (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NodeJS.ErrnoException */ Any) | Null, 
  /* addresses */ js.Array[String], 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("resolvePtr")(hostname.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def resolveSoa(
  hostname: String,
  callback: js.Function2[
  /* err */ (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NodeJS.ErrnoException */ Any) | Null, 
  /* address */ SoaRecord, 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveSoa")(hostname.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def resolveSrv(
  hostname: String,
  callback: js.Function2[
  /* err */ (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NodeJS.ErrnoException */ Any) | Null, 
  /* addresses */ js.Array[SrvRecord], 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveSrv")(hostname.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def resolveTxt(
  hostname: String,
  callback: js.Function2[
  /* err */ (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NodeJS.ErrnoException */ Any) | Null, 
  /* addresses */ js.Array[js.Array[String]], 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveTxt")(hostname.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def reverse(
  ip: String,
  callback: js.Function2[
  /* err */ (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NodeJS.ErrnoException */ Any) | Null, 
  /* hostnames */ js.Array[String], 
  Unit
]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("reverse")(ip.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def setDefaultResultOrder(order: ipv4first | verbatim): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setDefaultResultOrder")(order.asInstanceOf[js.Any]).asInstanceOf[Unit]

inline def setServers(servers: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setServers")(servers.asInstanceOf[js.Any]).asInstanceOf[Unit]
