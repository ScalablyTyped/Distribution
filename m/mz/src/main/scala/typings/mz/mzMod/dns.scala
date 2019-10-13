package typings.mz.mzMod

import typings.mz.mzStrings.A
import typings.mz.mzStrings.AAAA
import typings.mz.mzStrings.ANY
import typings.mz.mzStrings.CNAME
import typings.mz.mzStrings.MX
import typings.mz.mzStrings.NAPTR
import typings.mz.mzStrings.NS
import typings.mz.mzStrings.PTR
import typings.mz.mzStrings.SOA
import typings.mz.mzStrings.SRV
import typings.mz.mzStrings.TXT
import typings.node.Anon_Hostname
import typings.node.NodeJS.ErrnoException
import typings.node.dnsMod.AnyRecord
import typings.node.dnsMod.LookupAddress
import typings.node.dnsMod.LookupAllOptions
import typings.node.dnsMod.LookupOneOptions
import typings.node.dnsMod.LookupOptions
import typings.node.dnsMod.MxRecord
import typings.node.dnsMod.NaptrRecord
import typings.node.dnsMod.RecordWithTtl
import typings.node.dnsMod.ResolveOptions
import typings.node.dnsMod.ResolveWithTtlOptions
import typings.node.dnsMod.SoaRecord
import typings.node.dnsMod.SrvRecord
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mz", "dns")
@js.native
object dns extends js.Object {
  @js.native
  class Resolver ()
    extends typings.node.dnsMod.Resolver
  
  // Supported getaddrinfo flags.
  val ADDRCONFIG: Double = js.native
  val ADDRGETNETWORKPARAMS: String = js.native
  val BADFAMILY: String = js.native
  val BADFLAGS: String = js.native
  val BADHINTS: String = js.native
  val BADNAME: String = js.native
  val BADQUERY: String = js.native
  val BADRESP: String = js.native
  val BADSTR: String = js.native
  val CANCELLED: String = js.native
  val CONNREFUSED: String = js.native
  val DESTRUCTION: String = js.native
  val EOF: String = js.native
  val FILE: String = js.native
  val FORMERR: String = js.native
  val LOADIPHLPAPI: String = js.native
  // Error codes
  val NODATA: String = js.native
  val NOMEM: String = js.native
  val NONAME: String = js.native
  val NOTFOUND: String = js.native
  val NOTIMP: String = js.native
  val NOTINITIALIZED: String = js.native
  val REFUSED: String = js.native
  val SERVFAIL: String = js.native
  val TIMEOUT: String = js.native
  val V4MAPPED: Double = js.native
  def getServers(): js.Array[String] = js.native
  def reverse(ip: String): js.Promise[js.Array[String]] = js.native
  def reverse(
    ip: String,
    callback: js.Function2[
      ErrnoException | (/* err */ Error) | Null, 
      /* hostnames */ /* domains */ js.Array[String], 
      Unit
    ]
  ): Unit = js.native
  def setServers(servers: js.Array[String]): Unit = js.native
  // NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
  @js.native
  object lookup extends js.Object {
    def apply(domain: String): js.Promise[js.Tuple2[String, Double]] = js.native
    def apply(domain: String, family: Double): js.Promise[js.Tuple2[String, Double]] = js.native
    def apply(
      hostname: String,
      callback: js.Function3[
          ErrnoException | (/* err */ Error) | Null, 
          /* address */ String, 
          /* family */ Double, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      hostname: String,
      family: Double,
      callback: js.Function3[
          ErrnoException | (/* err */ Error) | Null, 
          /* address */ String, 
          /* family */ Double, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      hostname: String,
      options: LookupAllOptions,
      callback: js.Function2[/* err */ ErrnoException | Null, /* addresses */ js.Array[LookupAddress], Unit]
    ): Unit = js.native
    def apply(
      hostname: String,
      options: LookupOneOptions,
      callback: js.Function3[/* err */ ErrnoException | Null, /* address */ String, /* family */ Double, Unit]
    ): Unit = js.native
    def apply(
      hostname: String,
      options: LookupOptions,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* address */ String | js.Array[LookupAddress], 
          /* family */ Double, 
          Unit
        ]
    ): Unit = js.native
    def __promisify__(hostname: String): js.Promise[LookupAddress] = js.native
    def __promisify__(hostname: String, options: Double): js.Promise[LookupAddress] = js.native
    def __promisify__(hostname: String, options: LookupAllOptions): js.Promise[js.Array[LookupAddress]] = js.native
    def __promisify__(hostname: String, options: LookupOneOptions): js.Promise[LookupAddress] = js.native
    def __promisify__(hostname: String, options: LookupOptions): js.Promise[LookupAddress | js.Array[LookupAddress]] = js.native
  }
  
  @js.native
  object lookupService extends js.Object {
    def apply(
      address: String,
      port: Double,
      callback: js.Function3[/* err */ ErrnoException | Null, /* hostname */ String, /* service */ String, Unit]
    ): Unit = js.native
    def __promisify__(address: String, port: Double): js.Promise[Anon_Hostname] = js.native
  }
  
  @js.native
  object promises extends js.Object {
    @js.native
    class Resolver ()
      extends typings.node.dnsMod.promises.Resolver
    
    def getServers(): js.Array[String] = js.native
    def lookup(hostname: String): js.Promise[LookupAddress] = js.native
    def lookup(hostname: String, family: Double): js.Promise[LookupAddress] = js.native
    def lookup(hostname: String, options: LookupAllOptions): js.Promise[js.Array[LookupAddress]] = js.native
    def lookup(hostname: String, options: LookupOneOptions): js.Promise[LookupAddress] = js.native
    def lookup(hostname: String, options: LookupOptions): js.Promise[LookupAddress | js.Array[LookupAddress]] = js.native
    def lookupService(address: String, port: Double): js.Promise[Anon_Hostname] = js.native
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
  
  // NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
  @js.native
  object resolve extends js.Object {
    def apply(domain: String): js.Promise[js.Array[String]] = js.native
    def apply(domain: String, rrtype: String): js.Promise[js.Array[String]] = js.native
    def apply(
      hostname: String,
      callback: js.Function2[ErrnoException | (/* err */ Error) | Null, /* addresses */ js.Array[String], Unit]
    ): Unit = js.native
    def apply(
      hostname: String,
      rrtype: String,
      callback: js.Function2[
          ErrnoException | (/* err */ Error) | Null, 
          (/* addresses */ js.Array[AnyRecord | js.Array[String] | MxRecord | NaptrRecord | SrvRecord | String]) | SoaRecord, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      hostname: String,
      rrtype: AAAA,
      callback: js.Function2[/* err */ ErrnoException | Null, /* addresses */ js.Array[String], Unit]
    ): Unit = js.native
    def apply(
      hostname: String,
      rrtype: ANY,
      callback: js.Function2[/* err */ ErrnoException | Null, /* addresses */ js.Array[AnyRecord], Unit]
    ): Unit = js.native
    def apply(
      hostname: String,
      rrtype: A,
      callback: js.Function2[/* err */ ErrnoException | Null, /* addresses */ js.Array[String], Unit]
    ): Unit = js.native
    def apply(
      hostname: String,
      rrtype: CNAME,
      callback: js.Function2[/* err */ ErrnoException | Null, /* addresses */ js.Array[String], Unit]
    ): Unit = js.native
    def apply(
      hostname: String,
      rrtype: MX,
      callback: js.Function2[/* err */ ErrnoException | Null, /* addresses */ js.Array[MxRecord], Unit]
    ): Unit = js.native
    def apply(
      hostname: String,
      rrtype: NAPTR,
      callback: js.Function2[/* err */ ErrnoException | Null, /* addresses */ js.Array[NaptrRecord], Unit]
    ): Unit = js.native
    def apply(
      hostname: String,
      rrtype: NS,
      callback: js.Function2[/* err */ ErrnoException | Null, /* addresses */ js.Array[String], Unit]
    ): Unit = js.native
    def apply(
      hostname: String,
      rrtype: PTR,
      callback: js.Function2[/* err */ ErrnoException | Null, /* addresses */ js.Array[String], Unit]
    ): Unit = js.native
    def apply(
      hostname: String,
      rrtype: SOA,
      callback: js.Function2[/* err */ ErrnoException | Null, /* addresses */ SoaRecord, Unit]
    ): Unit = js.native
    def apply(
      hostname: String,
      rrtype: SRV,
      callback: js.Function2[/* err */ ErrnoException | Null, /* addresses */ js.Array[SrvRecord], Unit]
    ): Unit = js.native
    def apply(
      hostname: String,
      rrtype: TXT,
      callback: js.Function2[/* err */ ErrnoException | Null, /* addresses */ js.Array[js.Array[String]], Unit]
    ): Unit = js.native
    def __promisify__(hostname: String): js.Promise[js.Array[String]] = js.native
    def __promisify__(hostname: String, rrtype: String): js.Promise[
        (js.Array[AnyRecord | js.Array[String] | MxRecord | NaptrRecord | SrvRecord | String]) | SoaRecord
      ] = js.native
    @JSName("__promisify__")
    def __promisify___A(hostname: String, rrtype: A): js.Promise[js.Array[String]] = js.native
    @JSName("__promisify__")
    def __promisify___AAAA(hostname: String, rrtype: AAAA): js.Promise[js.Array[String]] = js.native
    @JSName("__promisify__")
    def __promisify___ANY(hostname: String, rrtype: ANY): js.Promise[js.Array[AnyRecord]] = js.native
    @JSName("__promisify__")
    def __promisify___CNAME(hostname: String, rrtype: CNAME): js.Promise[js.Array[String]] = js.native
    @JSName("__promisify__")
    def __promisify___MX(hostname: String, rrtype: MX): js.Promise[js.Array[MxRecord]] = js.native
    @JSName("__promisify__")
    def __promisify___NAPTR(hostname: String, rrtype: NAPTR): js.Promise[js.Array[NaptrRecord]] = js.native
    @JSName("__promisify__")
    def __promisify___NS(hostname: String, rrtype: NS): js.Promise[js.Array[String]] = js.native
    @JSName("__promisify__")
    def __promisify___PTR(hostname: String, rrtype: PTR): js.Promise[js.Array[String]] = js.native
    @JSName("__promisify__")
    def __promisify___SOA(hostname: String, rrtype: SOA): js.Promise[SoaRecord] = js.native
    @JSName("__promisify__")
    def __promisify___SRV(hostname: String, rrtype: SRV): js.Promise[js.Array[SrvRecord]] = js.native
    @JSName("__promisify__")
    def __promisify___TXT(hostname: String, rrtype: TXT): js.Promise[js.Array[js.Array[String]]] = js.native
  }
  
  // NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
  @js.native
  object resolve4 extends js.Object {
    def apply(domain: String): js.Promise[js.Array[String]] = js.native
    def apply(
      hostname: String,
      callback: js.Function2[ErrnoException | (/* err */ Error) | Null, /* addresses */ js.Array[String], Unit]
    ): Unit = js.native
    def apply(
      hostname: String,
      options: ResolveOptions,
      callback: js.Function2[
          /* err */ ErrnoException | Null, 
          /* addresses */ js.Array[RecordWithTtl | String], 
          Unit
        ]
    ): Unit = js.native
    def apply(
      hostname: String,
      options: ResolveWithTtlOptions,
      callback: js.Function2[/* err */ ErrnoException | Null, /* addresses */ js.Array[RecordWithTtl], Unit]
    ): Unit = js.native
    def __promisify__(hostname: String): js.Promise[js.Array[String]] = js.native
    def __promisify__(hostname: String, options: ResolveOptions): js.Promise[js.Array[RecordWithTtl | String]] = js.native
    def __promisify__(hostname: String, options: ResolveWithTtlOptions): js.Promise[js.Array[RecordWithTtl]] = js.native
  }
  
  // NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
  @js.native
  object resolve6 extends js.Object {
    def apply(domain: String): js.Promise[js.Array[String]] = js.native
    def apply(
      hostname: String,
      callback: js.Function2[ErrnoException | (/* err */ Error) | Null, /* addresses */ js.Array[String], Unit]
    ): Unit = js.native
    def apply(
      hostname: String,
      options: ResolveOptions,
      callback: js.Function2[
          /* err */ ErrnoException | Null, 
          /* addresses */ js.Array[RecordWithTtl | String], 
          Unit
        ]
    ): Unit = js.native
    def apply(
      hostname: String,
      options: ResolveWithTtlOptions,
      callback: js.Function2[/* err */ ErrnoException | Null, /* addresses */ js.Array[RecordWithTtl], Unit]
    ): Unit = js.native
    def __promisify__(hostname: String): js.Promise[js.Array[String]] = js.native
    def __promisify__(hostname: String, options: ResolveOptions): js.Promise[js.Array[RecordWithTtl | String]] = js.native
    def __promisify__(hostname: String, options: ResolveWithTtlOptions): js.Promise[js.Array[RecordWithTtl]] = js.native
  }
  
  @js.native
  object resolveAny extends js.Object {
    def apply(
      hostname: String,
      callback: js.Function2[/* err */ ErrnoException | Null, /* addresses */ js.Array[AnyRecord], Unit]
    ): Unit = js.native
    def __promisify__(hostname: String): js.Promise[js.Array[AnyRecord]] = js.native
  }
  
  @js.native
  object resolveCname extends js.Object {
    def apply(domain: String): js.Promise[js.Array[String]] = js.native
    def apply(
      hostname: String,
      callback: js.Function2[ErrnoException | (/* err */ Error) | Null, /* addresses */ js.Array[String], Unit]
    ): Unit = js.native
    def __promisify__(hostname: String): js.Promise[js.Array[String]] = js.native
  }
  
  @js.native
  object resolveMx extends js.Object {
    def apply(domain: String): js.Promise[js.Array[MxRecord]] = js.native
    def apply(
      hostname: String,
      callback: js.Function2[ErrnoException | (/* err */ Error) | Null, /* addresses */ js.Array[MxRecord], Unit]
    ): Unit = js.native
    def __promisify__(hostname: String): js.Promise[js.Array[MxRecord]] = js.native
  }
  
  @js.native
  object resolveNaptr extends js.Object {
    def apply(
      hostname: String,
      callback: js.Function2[/* err */ ErrnoException | Null, /* addresses */ js.Array[NaptrRecord], Unit]
    ): Unit = js.native
    def __promisify__(hostname: String): js.Promise[js.Array[NaptrRecord]] = js.native
  }
  
  @js.native
  object resolveNs extends js.Object {
    def apply(domain: String): js.Promise[js.Array[String]] = js.native
    def apply(
      hostname: String,
      callback: js.Function2[ErrnoException | (/* err */ Error) | Null, /* addresses */ js.Array[String], Unit]
    ): Unit = js.native
    def __promisify__(hostname: String): js.Promise[js.Array[String]] = js.native
  }
  
  @js.native
  object resolvePtr extends js.Object {
    def apply(
      hostname: String,
      callback: js.Function2[/* err */ ErrnoException | Null, /* addresses */ js.Array[String], Unit]
    ): Unit = js.native
    def __promisify__(hostname: String): js.Promise[js.Array[String]] = js.native
  }
  
  @js.native
  object resolveSoa extends js.Object {
    def apply(
      hostname: String,
      callback: js.Function2[/* err */ ErrnoException | Null, /* address */ SoaRecord, Unit]
    ): Unit = js.native
    def __promisify__(hostname: String): js.Promise[SoaRecord] = js.native
  }
  
  @js.native
  object resolveSrv extends js.Object {
    def apply(domain: String): js.Promise[js.Array[String]] = js.native
    def apply(
      hostname: String,
      callback: js.Function2[
          ErrnoException | (/* err */ Error) | Null, 
          /* addresses */ js.Array[SrvRecord | String], 
          Unit
        ]
    ): Unit = js.native
    def __promisify__(hostname: String): js.Promise[js.Array[SrvRecord]] = js.native
  }
  
  @js.native
  object resolveTxt extends js.Object {
    def apply(domain: String): js.Promise[js.Array[String]] = js.native
    def apply(
      hostname: String,
      callback: js.Function2[
          ErrnoException | (/* err */ Error) | Null, 
          /* addresses */ js.Array[js.Array[String] | String], 
          Unit
        ]
    ): Unit = js.native
    def __promisify__(hostname: String): js.Promise[js.Array[js.Array[String]]] = js.native
  }
  
}

