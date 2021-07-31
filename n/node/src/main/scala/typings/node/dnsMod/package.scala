package typings.node.dnsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


// Supported getaddrinfo flags.
@scala.inline
def ADDRCONFIG: scala.Double = typings.node.dnsMod.^.asInstanceOf[js.Dynamic].selectDynamic("ADDRCONFIG").asInstanceOf[scala.Double]

@scala.inline
def ADDRGETNETWORKPARAMS: java.lang.String = typings.node.dnsMod.^.asInstanceOf[js.Dynamic].selectDynamic("ADDRGETNETWORKPARAMS").asInstanceOf[java.lang.String]

/**
  * If `dns.V4MAPPED` is specified, return resolved IPv6 addresses as
  * well as IPv4 mapped IPv6 addresses.
  */
@scala.inline
def ALL: scala.Double = typings.node.dnsMod.^.asInstanceOf[js.Dynamic].selectDynamic("ALL").asInstanceOf[scala.Double]

@scala.inline
def BADFAMILY: java.lang.String = typings.node.dnsMod.^.asInstanceOf[js.Dynamic].selectDynamic("BADFAMILY").asInstanceOf[java.lang.String]

@scala.inline
def BADFLAGS: java.lang.String = typings.node.dnsMod.^.asInstanceOf[js.Dynamic].selectDynamic("BADFLAGS").asInstanceOf[java.lang.String]

@scala.inline
def BADHINTS: java.lang.String = typings.node.dnsMod.^.asInstanceOf[js.Dynamic].selectDynamic("BADHINTS").asInstanceOf[java.lang.String]

@scala.inline
def BADNAME: java.lang.String = typings.node.dnsMod.^.asInstanceOf[js.Dynamic].selectDynamic("BADNAME").asInstanceOf[java.lang.String]

@scala.inline
def BADQUERY: java.lang.String = typings.node.dnsMod.^.asInstanceOf[js.Dynamic].selectDynamic("BADQUERY").asInstanceOf[java.lang.String]

@scala.inline
def BADRESP: java.lang.String = typings.node.dnsMod.^.asInstanceOf[js.Dynamic].selectDynamic("BADRESP").asInstanceOf[java.lang.String]

@scala.inline
def BADSTR: java.lang.String = typings.node.dnsMod.^.asInstanceOf[js.Dynamic].selectDynamic("BADSTR").asInstanceOf[java.lang.String]

@scala.inline
def CANCELLED: java.lang.String = typings.node.dnsMod.^.asInstanceOf[js.Dynamic].selectDynamic("CANCELLED").asInstanceOf[java.lang.String]

@scala.inline
def CONNREFUSED: java.lang.String = typings.node.dnsMod.^.asInstanceOf[js.Dynamic].selectDynamic("CONNREFUSED").asInstanceOf[java.lang.String]

@scala.inline
def DESTRUCTION: java.lang.String = typings.node.dnsMod.^.asInstanceOf[js.Dynamic].selectDynamic("DESTRUCTION").asInstanceOf[java.lang.String]

@scala.inline
def EOF: java.lang.String = typings.node.dnsMod.^.asInstanceOf[js.Dynamic].selectDynamic("EOF").asInstanceOf[java.lang.String]

@scala.inline
def FILE: java.lang.String = typings.node.dnsMod.^.asInstanceOf[js.Dynamic].selectDynamic("FILE").asInstanceOf[java.lang.String]

@scala.inline
def FORMERR: java.lang.String = typings.node.dnsMod.^.asInstanceOf[js.Dynamic].selectDynamic("FORMERR").asInstanceOf[java.lang.String]

@scala.inline
def LOADIPHLPAPI: java.lang.String = typings.node.dnsMod.^.asInstanceOf[js.Dynamic].selectDynamic("LOADIPHLPAPI").asInstanceOf[java.lang.String]

// Error codes
@scala.inline
def NODATA: java.lang.String = typings.node.dnsMod.^.asInstanceOf[js.Dynamic].selectDynamic("NODATA").asInstanceOf[java.lang.String]

@scala.inline
def NOMEM: java.lang.String = typings.node.dnsMod.^.asInstanceOf[js.Dynamic].selectDynamic("NOMEM").asInstanceOf[java.lang.String]

@scala.inline
def NONAME: java.lang.String = typings.node.dnsMod.^.asInstanceOf[js.Dynamic].selectDynamic("NONAME").asInstanceOf[java.lang.String]

@scala.inline
def NOTFOUND: java.lang.String = typings.node.dnsMod.^.asInstanceOf[js.Dynamic].selectDynamic("NOTFOUND").asInstanceOf[java.lang.String]

@scala.inline
def NOTIMP: java.lang.String = typings.node.dnsMod.^.asInstanceOf[js.Dynamic].selectDynamic("NOTIMP").asInstanceOf[java.lang.String]

@scala.inline
def NOTINITIALIZED: java.lang.String = typings.node.dnsMod.^.asInstanceOf[js.Dynamic].selectDynamic("NOTINITIALIZED").asInstanceOf[java.lang.String]

@scala.inline
def REFUSED: java.lang.String = typings.node.dnsMod.^.asInstanceOf[js.Dynamic].selectDynamic("REFUSED").asInstanceOf[java.lang.String]

@scala.inline
def SERVFAIL: java.lang.String = typings.node.dnsMod.^.asInstanceOf[js.Dynamic].selectDynamic("SERVFAIL").asInstanceOf[java.lang.String]

@scala.inline
def TIMEOUT: java.lang.String = typings.node.dnsMod.^.asInstanceOf[js.Dynamic].selectDynamic("TIMEOUT").asInstanceOf[java.lang.String]

@scala.inline
def V4MAPPED: scala.Double = typings.node.dnsMod.^.asInstanceOf[js.Dynamic].selectDynamic("V4MAPPED").asInstanceOf[scala.Double]

@scala.inline
def getServers(): js.Array[java.lang.String] = typings.node.dnsMod.^.asInstanceOf[js.Dynamic].applyDynamic("getServers")().asInstanceOf[js.Array[java.lang.String]]

// NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
@scala.inline
def lookup(
  hostname: java.lang.String,
  callback: js.Function3[
  /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
  /* address */ java.lang.String, 
  /* family */ scala.Double, 
  scala.Unit
]
): scala.Unit = (typings.node.dnsMod.^.asInstanceOf[js.Dynamic].applyDynamic("lookup")(hostname.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
// NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
@scala.inline
def lookup(
  hostname: java.lang.String,
  family: scala.Double,
  callback: js.Function3[
  /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
  /* address */ java.lang.String, 
  /* family */ scala.Double, 
  scala.Unit
]
): scala.Unit = (typings.node.dnsMod.^.asInstanceOf[js.Dynamic].applyDynamic("lookup")(hostname.asInstanceOf[js.Any], family.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
// NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
@scala.inline
def lookup(
  hostname: java.lang.String,
  options: typings.node.dnsMod.LookupAllOptions,
  callback: js.Function2[
  /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
  /* addresses */ js.Array[typings.node.dnsMod.LookupAddress], 
  scala.Unit
]
): scala.Unit = (typings.node.dnsMod.^.asInstanceOf[js.Dynamic].applyDynamic("lookup")(hostname.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
// NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
@scala.inline
def lookup(
  hostname: java.lang.String,
  options: typings.node.dnsMod.LookupOneOptions,
  callback: js.Function3[
  /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
  /* address */ java.lang.String, 
  /* family */ scala.Double, 
  scala.Unit
]
): scala.Unit = (typings.node.dnsMod.^.asInstanceOf[js.Dynamic].applyDynamic("lookup")(hostname.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
// NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
@scala.inline
def lookup(
  hostname: java.lang.String,
  options: typings.node.dnsMod.LookupOptions,
  callback: js.Function3[
  /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
  /* address */ java.lang.String | js.Array[typings.node.dnsMod.LookupAddress], 
  /* family */ scala.Double, 
  scala.Unit
]
): scala.Unit = (typings.node.dnsMod.^.asInstanceOf[js.Dynamic].applyDynamic("lookup")(hostname.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]

@scala.inline
def lookupService(
  address: java.lang.String,
  port: scala.Double,
  callback: js.Function3[
  /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
  /* hostname */ java.lang.String, 
  /* service */ java.lang.String, 
  scala.Unit
]
): scala.Unit = (typings.node.dnsMod.^.asInstanceOf[js.Dynamic].applyDynamic("lookupService")(address.asInstanceOf[js.Any], port.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]

// NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
@scala.inline
def resolve(
  hostname: java.lang.String,
  callback: js.Function2[
  /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
  /* addresses */ js.Array[java.lang.String], 
  scala.Unit
]
): scala.Unit = (typings.node.dnsMod.^.asInstanceOf[js.Dynamic].applyDynamic("resolve")(hostname.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
// NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
@scala.inline
def resolve(
  hostname: java.lang.String,
  rrtype: java.lang.String,
  callback: js.Function2[
  /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
  /* addresses */ (js.Array[
    typings.node.dnsMod.AnyRecord | js.Array[java.lang.String] | typings.node.dnsMod.MxRecord | typings.node.dnsMod.NaptrRecord | typings.node.dnsMod.SrvRecord | java.lang.String
  ]) | typings.node.dnsMod.SoaRecord, 
  scala.Unit
]
): scala.Unit = (typings.node.dnsMod.^.asInstanceOf[js.Dynamic].applyDynamic("resolve")(hostname.asInstanceOf[js.Any], rrtype.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
// NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
@scala.inline
def resolve(
  hostname: java.lang.String,
  rrtype: typings.node.nodeStrings.AAAA,
  callback: js.Function2[
  /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
  /* addresses */ js.Array[java.lang.String], 
  scala.Unit
]
): scala.Unit = (typings.node.dnsMod.^.asInstanceOf[js.Dynamic].applyDynamic("resolve")(hostname.asInstanceOf[js.Any], rrtype.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
// NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
@scala.inline
def resolve(
  hostname: java.lang.String,
  rrtype: typings.node.nodeStrings.ANY,
  callback: js.Function2[
  /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
  /* addresses */ js.Array[typings.node.dnsMod.AnyRecord], 
  scala.Unit
]
): scala.Unit = (typings.node.dnsMod.^.asInstanceOf[js.Dynamic].applyDynamic("resolve")(hostname.asInstanceOf[js.Any], rrtype.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
// NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
@scala.inline
def resolve(
  hostname: java.lang.String,
  rrtype: typings.node.nodeStrings.A,
  callback: js.Function2[
  /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
  /* addresses */ js.Array[java.lang.String], 
  scala.Unit
]
): scala.Unit = (typings.node.dnsMod.^.asInstanceOf[js.Dynamic].applyDynamic("resolve")(hostname.asInstanceOf[js.Any], rrtype.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
// NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
@scala.inline
def resolve(
  hostname: java.lang.String,
  rrtype: typings.node.nodeStrings.CNAME,
  callback: js.Function2[
  /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
  /* addresses */ js.Array[java.lang.String], 
  scala.Unit
]
): scala.Unit = (typings.node.dnsMod.^.asInstanceOf[js.Dynamic].applyDynamic("resolve")(hostname.asInstanceOf[js.Any], rrtype.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
// NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
@scala.inline
def resolve(
  hostname: java.lang.String,
  rrtype: typings.node.nodeStrings.MX,
  callback: js.Function2[
  /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
  /* addresses */ js.Array[typings.node.dnsMod.MxRecord], 
  scala.Unit
]
): scala.Unit = (typings.node.dnsMod.^.asInstanceOf[js.Dynamic].applyDynamic("resolve")(hostname.asInstanceOf[js.Any], rrtype.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
// NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
@scala.inline
def resolve(
  hostname: java.lang.String,
  rrtype: typings.node.nodeStrings.NAPTR,
  callback: js.Function2[
  /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
  /* addresses */ js.Array[typings.node.dnsMod.NaptrRecord], 
  scala.Unit
]
): scala.Unit = (typings.node.dnsMod.^.asInstanceOf[js.Dynamic].applyDynamic("resolve")(hostname.asInstanceOf[js.Any], rrtype.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
// NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
@scala.inline
def resolve(
  hostname: java.lang.String,
  rrtype: typings.node.nodeStrings.NS,
  callback: js.Function2[
  /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
  /* addresses */ js.Array[java.lang.String], 
  scala.Unit
]
): scala.Unit = (typings.node.dnsMod.^.asInstanceOf[js.Dynamic].applyDynamic("resolve")(hostname.asInstanceOf[js.Any], rrtype.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
// NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
@scala.inline
def resolve(
  hostname: java.lang.String,
  rrtype: typings.node.nodeStrings.PTR,
  callback: js.Function2[
  /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
  /* addresses */ js.Array[java.lang.String], 
  scala.Unit
]
): scala.Unit = (typings.node.dnsMod.^.asInstanceOf[js.Dynamic].applyDynamic("resolve")(hostname.asInstanceOf[js.Any], rrtype.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
// NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
@scala.inline
def resolve(
  hostname: java.lang.String,
  rrtype: typings.node.nodeStrings.SOA,
  callback: js.Function2[
  /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
  /* addresses */ typings.node.dnsMod.SoaRecord, 
  scala.Unit
]
): scala.Unit = (typings.node.dnsMod.^.asInstanceOf[js.Dynamic].applyDynamic("resolve")(hostname.asInstanceOf[js.Any], rrtype.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
// NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
@scala.inline
def resolve(
  hostname: java.lang.String,
  rrtype: typings.node.nodeStrings.SRV,
  callback: js.Function2[
  /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
  /* addresses */ js.Array[typings.node.dnsMod.SrvRecord], 
  scala.Unit
]
): scala.Unit = (typings.node.dnsMod.^.asInstanceOf[js.Dynamic].applyDynamic("resolve")(hostname.asInstanceOf[js.Any], rrtype.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
// NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
@scala.inline
def resolve(
  hostname: java.lang.String,
  rrtype: typings.node.nodeStrings.TXT,
  callback: js.Function2[
  /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
  /* addresses */ js.Array[js.Array[java.lang.String]], 
  scala.Unit
]
): scala.Unit = (typings.node.dnsMod.^.asInstanceOf[js.Dynamic].applyDynamic("resolve")(hostname.asInstanceOf[js.Any], rrtype.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]

// NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
@scala.inline
def resolve4(
  hostname: java.lang.String,
  callback: js.Function2[
  /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
  /* addresses */ js.Array[java.lang.String], 
  scala.Unit
]
): scala.Unit = (typings.node.dnsMod.^.asInstanceOf[js.Dynamic].applyDynamic("resolve4")(hostname.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
// NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
@scala.inline
def resolve4(
  hostname: java.lang.String,
  options: typings.node.dnsMod.ResolveOptions,
  callback: js.Function2[
  /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
  /* addresses */ js.Array[typings.node.dnsMod.RecordWithTtl | java.lang.String], 
  scala.Unit
]
): scala.Unit = (typings.node.dnsMod.^.asInstanceOf[js.Dynamic].applyDynamic("resolve4")(hostname.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
// NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
@scala.inline
def resolve4(
  hostname: java.lang.String,
  options: typings.node.dnsMod.ResolveWithTtlOptions,
  callback: js.Function2[
  /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
  /* addresses */ js.Array[typings.node.dnsMod.RecordWithTtl], 
  scala.Unit
]
): scala.Unit = (typings.node.dnsMod.^.asInstanceOf[js.Dynamic].applyDynamic("resolve4")(hostname.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]

// NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
@scala.inline
def resolve6(
  hostname: java.lang.String,
  callback: js.Function2[
  /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
  /* addresses */ js.Array[java.lang.String], 
  scala.Unit
]
): scala.Unit = (typings.node.dnsMod.^.asInstanceOf[js.Dynamic].applyDynamic("resolve6")(hostname.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
// NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
@scala.inline
def resolve6(
  hostname: java.lang.String,
  options: typings.node.dnsMod.ResolveOptions,
  callback: js.Function2[
  /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
  /* addresses */ js.Array[typings.node.dnsMod.RecordWithTtl | java.lang.String], 
  scala.Unit
]
): scala.Unit = (typings.node.dnsMod.^.asInstanceOf[js.Dynamic].applyDynamic("resolve6")(hostname.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
// NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
@scala.inline
def resolve6(
  hostname: java.lang.String,
  options: typings.node.dnsMod.ResolveWithTtlOptions,
  callback: js.Function2[
  /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
  /* addresses */ js.Array[typings.node.dnsMod.RecordWithTtl], 
  scala.Unit
]
): scala.Unit = (typings.node.dnsMod.^.asInstanceOf[js.Dynamic].applyDynamic("resolve6")(hostname.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]

@scala.inline
def resolveAny(
  hostname: java.lang.String,
  callback: js.Function2[
  /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
  /* addresses */ js.Array[typings.node.dnsMod.AnyRecord], 
  scala.Unit
]
): scala.Unit = (typings.node.dnsMod.^.asInstanceOf[js.Dynamic].applyDynamic("resolveAny")(hostname.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]

@scala.inline
def resolveCname(
  hostname: java.lang.String,
  callback: js.Function2[
  /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
  /* addresses */ js.Array[java.lang.String], 
  scala.Unit
]
): scala.Unit = (typings.node.dnsMod.^.asInstanceOf[js.Dynamic].applyDynamic("resolveCname")(hostname.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]

@scala.inline
def resolveMx(
  hostname: java.lang.String,
  callback: js.Function2[
  /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
  /* addresses */ js.Array[typings.node.dnsMod.MxRecord], 
  scala.Unit
]
): scala.Unit = (typings.node.dnsMod.^.asInstanceOf[js.Dynamic].applyDynamic("resolveMx")(hostname.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]

@scala.inline
def resolveNaptr(
  hostname: java.lang.String,
  callback: js.Function2[
  /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
  /* addresses */ js.Array[typings.node.dnsMod.NaptrRecord], 
  scala.Unit
]
): scala.Unit = (typings.node.dnsMod.^.asInstanceOf[js.Dynamic].applyDynamic("resolveNaptr")(hostname.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]

@scala.inline
def resolveNs(
  hostname: java.lang.String,
  callback: js.Function2[
  /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
  /* addresses */ js.Array[java.lang.String], 
  scala.Unit
]
): scala.Unit = (typings.node.dnsMod.^.asInstanceOf[js.Dynamic].applyDynamic("resolveNs")(hostname.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]

@scala.inline
def resolvePtr(
  hostname: java.lang.String,
  callback: js.Function2[
  /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
  /* addresses */ js.Array[java.lang.String], 
  scala.Unit
]
): scala.Unit = (typings.node.dnsMod.^.asInstanceOf[js.Dynamic].applyDynamic("resolvePtr")(hostname.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]

@scala.inline
def resolveSoa(
  hostname: java.lang.String,
  callback: js.Function2[
  /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
  /* address */ typings.node.dnsMod.SoaRecord, 
  scala.Unit
]
): scala.Unit = (typings.node.dnsMod.^.asInstanceOf[js.Dynamic].applyDynamic("resolveSoa")(hostname.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]

@scala.inline
def resolveSrv(
  hostname: java.lang.String,
  callback: js.Function2[
  /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
  /* addresses */ js.Array[typings.node.dnsMod.SrvRecord], 
  scala.Unit
]
): scala.Unit = (typings.node.dnsMod.^.asInstanceOf[js.Dynamic].applyDynamic("resolveSrv")(hostname.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]

@scala.inline
def resolveTxt(
  hostname: java.lang.String,
  callback: js.Function2[
  /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
  /* addresses */ js.Array[js.Array[java.lang.String]], 
  scala.Unit
]
): scala.Unit = (typings.node.dnsMod.^.asInstanceOf[js.Dynamic].applyDynamic("resolveTxt")(hostname.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]

@scala.inline
def reverse(
  ip: java.lang.String,
  callback: js.Function2[
  /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
  /* hostnames */ js.Array[java.lang.String], 
  scala.Unit
]
): scala.Unit = (typings.node.dnsMod.^.asInstanceOf[js.Dynamic].applyDynamic("reverse")(ip.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]

@scala.inline
def setServers(servers: js.Array[java.lang.String]): scala.Unit = typings.node.dnsMod.^.asInstanceOf[js.Dynamic].applyDynamic("setServers")(servers.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
