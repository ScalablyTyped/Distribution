package typings.mz

import typings.mz.mzStrings.A
import typings.mz.mzStrings.AAAA
import typings.mz.mzStrings.ANY
import typings.mz.mzStrings.CAA
import typings.mz.mzStrings.CNAME
import typings.mz.mzStrings.MX
import typings.mz.mzStrings.NAPTR
import typings.mz.mzStrings.NS
import typings.mz.mzStrings.PTR
import typings.mz.mzStrings.SOA
import typings.mz.mzStrings.SRV
import typings.mz.mzStrings.TXT
import typings.mz.mzStrings.ipv4first
import typings.mz.mzStrings.verbatim
import typings.node.anon.Hostname
import typings.node.dnsMod.AnyRecord
import typings.node.dnsMod.CaaRecord
import typings.node.dnsMod.LookupAddress
import typings.node.dnsMod.LookupAllOptions
import typings.node.dnsMod.LookupOneOptions
import typings.node.dnsMod.LookupOptions
import typings.node.dnsMod.MxRecord
import typings.node.dnsMod.NaptrRecord
import typings.node.dnsMod.RecordWithTtl
import typings.node.dnsMod.ResolveOptions
import typings.node.dnsMod.ResolveWithTtlOptions
import typings.node.dnsMod.ResolverOptions
import typings.node.dnsMod.SoaRecord
import typings.node.dnsMod.SrvRecord
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dnsMod {
  
  @JSImport("mz/dns", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("mz/dns", "ADDRCONFIG")
  @js.native
  val ADDRCONFIG: Double = js.native
  
  @JSImport("mz/dns", "ADDRGETNETWORKPARAMS")
  @js.native
  val ADDRGETNETWORKPARAMS: String = js.native
  
  @JSImport("mz/dns", "ALL")
  @js.native
  val ALL: Double = js.native
  
  @JSImport("mz/dns", "BADFAMILY")
  @js.native
  val BADFAMILY: String = js.native
  
  @JSImport("mz/dns", "BADFLAGS")
  @js.native
  val BADFLAGS: String = js.native
  
  @JSImport("mz/dns", "BADHINTS")
  @js.native
  val BADHINTS: String = js.native
  
  @JSImport("mz/dns", "BADNAME")
  @js.native
  val BADNAME: String = js.native
  
  @JSImport("mz/dns", "BADQUERY")
  @js.native
  val BADQUERY: String = js.native
  
  @JSImport("mz/dns", "BADRESP")
  @js.native
  val BADRESP: String = js.native
  
  @JSImport("mz/dns", "BADSTR")
  @js.native
  val BADSTR: String = js.native
  
  @JSImport("mz/dns", "CANCELLED")
  @js.native
  val CANCELLED: String = js.native
  
  @JSImport("mz/dns", "CONNREFUSED")
  @js.native
  val CONNREFUSED: String = js.native
  
  @JSImport("mz/dns", "DESTRUCTION")
  @js.native
  val DESTRUCTION: String = js.native
  
  @JSImport("mz/dns", "EOF")
  @js.native
  val EOF: String = js.native
  
  @JSImport("mz/dns", "FILE")
  @js.native
  val FILE: String = js.native
  
  @JSImport("mz/dns", "FORMERR")
  @js.native
  val FORMERR: String = js.native
  
  @JSImport("mz/dns", "LOADIPHLPAPI")
  @js.native
  val LOADIPHLPAPI: String = js.native
  
  @JSImport("mz/dns", "NODATA")
  @js.native
  val NODATA: String = js.native
  
  @JSImport("mz/dns", "NOMEM")
  @js.native
  val NOMEM: String = js.native
  
  @JSImport("mz/dns", "NONAME")
  @js.native
  val NONAME: String = js.native
  
  @JSImport("mz/dns", "NOTFOUND")
  @js.native
  val NOTFOUND: String = js.native
  
  @JSImport("mz/dns", "NOTIMP")
  @js.native
  val NOTIMP: String = js.native
  
  @JSImport("mz/dns", "NOTINITIALIZED")
  @js.native
  val NOTINITIALIZED: String = js.native
  
  @JSImport("mz/dns", "REFUSED")
  @js.native
  val REFUSED: String = js.native
  
  @JSImport("mz/dns", "Resolver")
  @js.native
  open class Resolver ()
    extends typings.node.dnsMod.Resolver {
    def this(options: ResolverOptions) = this()
  }
  
  @JSImport("mz/dns", "SERVFAIL")
  @js.native
  val SERVFAIL: String = js.native
  
  @JSImport("mz/dns", "TIMEOUT")
  @js.native
  val TIMEOUT: String = js.native
  
  @JSImport("mz/dns", "V4MAPPED")
  @js.native
  val V4MAPPED: Double = js.native
  
  inline def getServers(): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getServers")().asInstanceOf[js.Array[String]]
  
  inline def lookup(hostname: String): js.Promise[js.Tuple2[String, Double]] = ^.asInstanceOf[js.Dynamic].applyDynamic("lookup")(hostname.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Tuple2[String, Double]]]
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
  inline def lookup(hostname: String, options: Double): js.Promise[js.Tuple2[String, Double]] = (^.asInstanceOf[js.Dynamic].applyDynamic("lookup")(hostname.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Tuple2[String, Double]]]
  inline def lookup(hostname: String, options: LookupAllOptions): js.Promise[js.Array[LookupAddress]] = (^.asInstanceOf[js.Dynamic].applyDynamic("lookup")(hostname.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[LookupAddress]]]
  inline def lookup(
    hostname: String,
    options: LookupAllOptions,
    callback: js.Function2[
      /* err */ (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NodeJS.ErrnoException */ Any) | Null, 
      /* addresses */ js.Array[LookupAddress], 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("lookup")(hostname.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def lookup(hostname: String, options: LookupOneOptions): js.Promise[js.Tuple2[String, Double]] = (^.asInstanceOf[js.Dynamic].applyDynamic("lookup")(hostname.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Tuple2[String, Double]]]
  inline def lookup(
    hostname: String,
    // `options` can't be mixed into `family`
  // tslint:disable-next-line: unified-signatures
  options: LookupOneOptions,
    callback: js.Function3[
      /* err */ (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NodeJS.ErrnoException */ Any) | Null, 
      /* address */ String, 
      /* family */ Double, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("lookup")(hostname.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def lookup(hostname: String, options: LookupOptions): js.Promise[(js.Tuple2[String, Double]) | js.Array[LookupAddress]] = (^.asInstanceOf[js.Dynamic].applyDynamic("lookup")(hostname.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[(js.Tuple2[String, Double]) | js.Array[LookupAddress]]]
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
  
  inline def lookupService(address: String, port: Double): js.Promise[js.Tuple2[String, String]] = (^.asInstanceOf[js.Dynamic].applyDynamic("lookupService")(address.asInstanceOf[js.Any], port.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Tuple2[String, String]]]
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
  
  object promises {
    
    @JSImport("mz/dns", "promises")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("mz/dns", "promises.Resolver")
    @js.native
    open class Resolver ()
      extends typings.node.dnsMod.promises.Resolver {
      def this(options: ResolverOptions) = this()
    }
    
    /**
      * Returns an array of IP address strings, formatted according to [RFC 5952](https://tools.ietf.org/html/rfc5952#section-6),
      * that are currently configured for DNS resolution. A string will include a port
      * section if a custom port is used.
      *
      * ```js
      * [
      *   '4.4.4.4',
      *   '2001:4860:4860::8888',
      *   '4.4.4.4:1053',
      *   '[2001:4860:4860::8888]:1053',
      * ]
      * ```
      * @since v10.6.0
      */
    inline def getServers(): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getServers")().asInstanceOf[js.Array[String]]
    
    inline def lookup(hostname: String): js.Promise[LookupAddress] = ^.asInstanceOf[js.Dynamic].applyDynamic("lookup")(hostname.asInstanceOf[js.Any]).asInstanceOf[js.Promise[LookupAddress]]
    /**
      * Resolves a host name (e.g. `'nodejs.org'`) into the first found A (IPv4) or
      * AAAA (IPv6) record. All `option` properties are optional. If `options` is an
      * integer, then it must be `4` or `6` – if `options` is not provided, then IPv4
      * and IPv6 addresses are both returned if found.
      *
      * With the `all` option set to `true`, the `Promise` is resolved with `addresses`being an array of objects with the properties `address` and `family`.
      *
      * On error, the `Promise` is rejected with an `Error` object, where `err.code`is the error code.
      * Keep in mind that `err.code` will be set to `'ENOTFOUND'` not only when
      * the host name does not exist but also when the lookup fails in other ways
      * such as no available file descriptors.
      *
      * `dnsPromises.lookup()` does not necessarily have anything to do with the DNS
      * protocol. The implementation uses an operating system facility that can
      * associate names with addresses, and vice versa. This implementation can have
      * subtle but important consequences on the behavior of any Node.js program. Please
      * take some time to consult the `Implementation considerations section` before
      * using `dnsPromises.lookup()`.
      *
      * Example usage:
      *
      * ```js
      * const dns = require('dns');
      * const dnsPromises = dns.promises;
      * const options = {
      *   family: 6,
      *   hints: dns.ADDRCONFIG | dns.V4MAPPED,
      * };
      *
      * dnsPromises.lookup('example.com', options).then((result) => {
      *   console.log('address: %j family: IPv%s', result.address, result.family);
      *   // address: "2606:2800:220:1:248:1893:25c8:1946" family: IPv6
      * });
      *
      * // When options.all is true, the result will be an Array.
      * options.all = true;
      * dnsPromises.lookup('example.com', options).then((result) => {
      *   console.log('addresses: %j', result);
      *   // addresses: [{"address":"2606:2800:220:1:248:1893:25c8:1946","family":6}]
      * });
      * ```
      * @since v10.6.0
      */
    inline def lookup(hostname: String, family: Double): js.Promise[LookupAddress] = (^.asInstanceOf[js.Dynamic].applyDynamic("lookup")(hostname.asInstanceOf[js.Any], family.asInstanceOf[js.Any])).asInstanceOf[js.Promise[LookupAddress]]
    inline def lookup(hostname: String, options: LookupAllOptions): js.Promise[js.Array[LookupAddress]] = (^.asInstanceOf[js.Dynamic].applyDynamic("lookup")(hostname.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[LookupAddress]]]
    inline def lookup(hostname: String, options: LookupOneOptions): js.Promise[LookupAddress] = (^.asInstanceOf[js.Dynamic].applyDynamic("lookup")(hostname.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[LookupAddress]]
    inline def lookup(hostname: String, options: LookupOptions): js.Promise[LookupAddress | js.Array[LookupAddress]] = (^.asInstanceOf[js.Dynamic].applyDynamic("lookup")(hostname.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[LookupAddress | js.Array[LookupAddress]]]
    
    /**
      * Resolves the given `address` and `port` into a host name and service using
      * the operating system's underlying `getnameinfo` implementation.
      *
      * If `address` is not a valid IP address, a `TypeError` will be thrown.
      * The `port` will be coerced to a number. If it is not a legal port, a `TypeError`will be thrown.
      *
      * On error, the `Promise` is rejected with an `Error` object, where `err.code`is the error code.
      *
      * ```js
      * const dnsPromises = require('dns').promises;
      * dnsPromises.lookupService('127.0.0.1', 22).then((result) => {
      *   console.log(result.hostname, result.service);
      *   // Prints: localhost ssh
      * });
      * ```
      * @since v10.6.0
      */
    inline def lookupService(address: String, port: Double): js.Promise[Hostname] = (^.asInstanceOf[js.Dynamic].applyDynamic("lookupService")(address.asInstanceOf[js.Any], port.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Hostname]]
    
    /**
      * Uses the DNS protocol to resolve a host name (e.g. `'nodejs.org'`) into an array
      * of the resource records. When successful, the `Promise` is resolved with an
      * array of resource records. The type and structure of individual results vary
      * based on `rrtype`:
      *
      * <omitted>
      *
      * On error, the `Promise` is rejected with an `Error` object, where `err.code`is one of the `DNS error codes`.
      * @since v10.6.0
      * @param hostname Host name to resolve.
      * @param [rrtype='A'] Resource record type.
      */
    inline def resolve(hostname: String): js.Promise[js.Array[String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("resolve")(hostname.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[String]]]
    inline def resolve(hostname: String, rrtype: String): js.Promise[
        (js.Array[AnyRecord | js.Array[String] | MxRecord | NaptrRecord | SrvRecord | String]) | SoaRecord
      ] = (^.asInstanceOf[js.Dynamic].applyDynamic("resolve")(hostname.asInstanceOf[js.Any], rrtype.asInstanceOf[js.Any])).asInstanceOf[js.Promise[
        (js.Array[AnyRecord | js.Array[String] | MxRecord | NaptrRecord | SrvRecord | String]) | SoaRecord
      ]]
    
    /**
      * Uses the DNS protocol to resolve IPv4 addresses (`A` records) for the`hostname`. On success, the `Promise` is resolved with an array of IPv4
      * addresses (e.g. `['74.125.79.104', '74.125.79.105', '74.125.79.106']`).
      * @since v10.6.0
      * @param hostname Host name to resolve.
      */
    inline def resolve4(hostname: String): js.Promise[js.Array[String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("resolve4")(hostname.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[String]]]
    inline def resolve4(hostname: String, options: ResolveOptions): js.Promise[js.Array[RecordWithTtl | String]] = (^.asInstanceOf[js.Dynamic].applyDynamic("resolve4")(hostname.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[RecordWithTtl | String]]]
    inline def resolve4(hostname: String, options: ResolveWithTtlOptions): js.Promise[js.Array[RecordWithTtl]] = (^.asInstanceOf[js.Dynamic].applyDynamic("resolve4")(hostname.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[RecordWithTtl]]]
    
    /**
      * Uses the DNS protocol to resolve IPv6 addresses (`AAAA` records) for the`hostname`. On success, the `Promise` is resolved with an array of IPv6
      * addresses.
      * @since v10.6.0
      * @param hostname Host name to resolve.
      */
    inline def resolve6(hostname: String): js.Promise[js.Array[String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("resolve6")(hostname.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[String]]]
    inline def resolve6(hostname: String, options: ResolveOptions): js.Promise[js.Array[RecordWithTtl | String]] = (^.asInstanceOf[js.Dynamic].applyDynamic("resolve6")(hostname.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[RecordWithTtl | String]]]
    inline def resolve6(hostname: String, options: ResolveWithTtlOptions): js.Promise[js.Array[RecordWithTtl]] = (^.asInstanceOf[js.Dynamic].applyDynamic("resolve6")(hostname.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[RecordWithTtl]]]
    
    /**
      * Uses the DNS protocol to resolve all records (also known as `ANY` or `*` query).
      * On success, the `Promise` is resolved with an array containing various types of
      * records. Each object has a property `type` that indicates the type of the
      * current record. And depending on the `type`, additional properties will be
      * present on the object:
      *
      * <omitted>
      *
      * Here is an example of the result object:
      *
      * ```js
      * [ { type: 'A', address: '127.0.0.1', ttl: 299 },
      *   { type: 'CNAME', value: 'example.com' },
      *   { type: 'MX', exchange: 'alt4.aspmx.l.example.com', priority: 50 },
      *   { type: 'NS', value: 'ns1.example.com' },
      *   { type: 'TXT', entries: [ 'v=spf1 include:_spf.example.com ~all' ] },
      *   { type: 'SOA',
      *     nsname: 'ns1.example.com',
      *     hostmaster: 'admin.example.com',
      *     serial: 156696742,
      *     refresh: 900,
      *     retry: 900,
      *     expire: 1800,
      *     minttl: 60 } ]
      * ```
      * @since v10.6.0
      */
    inline def resolveAny(hostname: String): js.Promise[js.Array[AnyRecord]] = ^.asInstanceOf[js.Dynamic].applyDynamic("resolveAny")(hostname.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[AnyRecord]]]
    
    /**
      * Uses the DNS protocol to resolve `CAA` records for the `hostname`. On success,
      * the `Promise` is resolved with an array of objects containing available
      * certification authority authorization records available for the `hostname`(e.g. `[{critical: 0, iodef: 'mailto:pki@example.com'},{critical: 128, issue: 'pki.example.com'}]`).
      * @since v15.0.0, v14.17.0
      */
    inline def resolveCaa(hostname: String): js.Promise[js.Array[CaaRecord]] = ^.asInstanceOf[js.Dynamic].applyDynamic("resolveCaa")(hostname.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[CaaRecord]]]
    
    /**
      * Uses the DNS protocol to resolve `CNAME` records for the `hostname`. On success,
      * the `Promise` is resolved with an array of canonical name records available for
      * the `hostname` (e.g. `['bar.example.com']`).
      * @since v10.6.0
      */
    inline def resolveCname(hostname: String): js.Promise[js.Array[String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("resolveCname")(hostname.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[String]]]
    
    /**
      * Uses the DNS protocol to resolve mail exchange records (`MX` records) for the`hostname`. On success, the `Promise` is resolved with an array of objects
      * containing both a `priority` and `exchange` property (e.g.`[{priority: 10, exchange: 'mx.example.com'}, ...]`).
      * @since v10.6.0
      */
    inline def resolveMx(hostname: String): js.Promise[js.Array[MxRecord]] = ^.asInstanceOf[js.Dynamic].applyDynamic("resolveMx")(hostname.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[MxRecord]]]
    
    /**
      * Uses the DNS protocol to resolve regular expression based records (`NAPTR`records) for the `hostname`. On success, the `Promise` is resolved with an array
      * of objects with the following properties:
      *
      * * `flags`
      * * `service`
      * * `regexp`
      * * `replacement`
      * * `order`
      * * `preference`
      *
      * ```js
      * {
      *   flags: 's',
      *   service: 'SIP+D2U',
      *   regexp: '',
      *   replacement: '_sip._udp.example.com',
      *   order: 30,
      *   preference: 100
      * }
      * ```
      * @since v10.6.0
      */
    inline def resolveNaptr(hostname: String): js.Promise[js.Array[NaptrRecord]] = ^.asInstanceOf[js.Dynamic].applyDynamic("resolveNaptr")(hostname.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[NaptrRecord]]]
    
    /**
      * Uses the DNS protocol to resolve name server records (`NS` records) for the`hostname`. On success, the `Promise` is resolved with an array of name server
      * records available for `hostname` (e.g.`['ns1.example.com', 'ns2.example.com']`).
      * @since v10.6.0
      */
    inline def resolveNs(hostname: String): js.Promise[js.Array[String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("resolveNs")(hostname.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[String]]]
    
    /**
      * Uses the DNS protocol to resolve pointer records (`PTR` records) for the`hostname`. On success, the `Promise` is resolved with an array of strings
      * containing the reply records.
      * @since v10.6.0
      */
    inline def resolvePtr(hostname: String): js.Promise[js.Array[String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("resolvePtr")(hostname.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[String]]]
    
    /**
      * Uses the DNS protocol to resolve a start of authority record (`SOA` record) for
      * the `hostname`. On success, the `Promise` is resolved with an object with the
      * following properties:
      *
      * * `nsname`
      * * `hostmaster`
      * * `serial`
      * * `refresh`
      * * `retry`
      * * `expire`
      * * `minttl`
      *
      * ```js
      * {
      *   nsname: 'ns.example.com',
      *   hostmaster: 'root.example.com',
      *   serial: 2013101809,
      *   refresh: 10000,
      *   retry: 2400,
      *   expire: 604800,
      *   minttl: 3600
      * }
      * ```
      * @since v10.6.0
      */
    inline def resolveSoa(hostname: String): js.Promise[SoaRecord] = ^.asInstanceOf[js.Dynamic].applyDynamic("resolveSoa")(hostname.asInstanceOf[js.Any]).asInstanceOf[js.Promise[SoaRecord]]
    
    /**
      * Uses the DNS protocol to resolve service records (`SRV` records) for the`hostname`. On success, the `Promise` is resolved with an array of objects with
      * the following properties:
      *
      * * `priority`
      * * `weight`
      * * `port`
      * * `name`
      *
      * ```js
      * {
      *   priority: 10,
      *   weight: 5,
      *   port: 21223,
      *   name: 'service.example.com'
      * }
      * ```
      * @since v10.6.0
      */
    inline def resolveSrv(hostname: String): js.Promise[js.Array[SrvRecord]] = ^.asInstanceOf[js.Dynamic].applyDynamic("resolveSrv")(hostname.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[SrvRecord]]]
    
    /**
      * Uses the DNS protocol to resolve text queries (`TXT` records) for the`hostname`. On success, the `Promise` is resolved with a two-dimensional array
      * of the text records available for `hostname` (e.g.`[ ['v=spf1 ip4:0.0.0.0 ', '~all' ] ]`). Each sub-array contains TXT chunks of
      * one record. Depending on the use case, these could be either joined together or
      * treated separately.
      * @since v10.6.0
      */
    inline def resolveTxt(hostname: String): js.Promise[js.Array[js.Array[String]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("resolveTxt")(hostname.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[js.Array[String]]]]
    
    inline def resolve_A(hostname: String, rrtype: A): js.Promise[js.Array[String]] = (^.asInstanceOf[js.Dynamic].applyDynamic("resolve")(hostname.asInstanceOf[js.Any], rrtype.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[String]]]
    
    inline def resolve_AAAA(hostname: String, rrtype: AAAA): js.Promise[js.Array[String]] = (^.asInstanceOf[js.Dynamic].applyDynamic("resolve")(hostname.asInstanceOf[js.Any], rrtype.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[String]]]
    
    inline def resolve_ANY(hostname: String, rrtype: ANY): js.Promise[js.Array[AnyRecord]] = (^.asInstanceOf[js.Dynamic].applyDynamic("resolve")(hostname.asInstanceOf[js.Any], rrtype.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[AnyRecord]]]
    
    inline def resolve_CAA(hostname: String, rrtype: CAA): js.Promise[js.Array[CaaRecord]] = (^.asInstanceOf[js.Dynamic].applyDynamic("resolve")(hostname.asInstanceOf[js.Any], rrtype.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[CaaRecord]]]
    
    inline def resolve_CNAME(hostname: String, rrtype: CNAME): js.Promise[js.Array[String]] = (^.asInstanceOf[js.Dynamic].applyDynamic("resolve")(hostname.asInstanceOf[js.Any], rrtype.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[String]]]
    
    inline def resolve_MX(hostname: String, rrtype: MX): js.Promise[js.Array[MxRecord]] = (^.asInstanceOf[js.Dynamic].applyDynamic("resolve")(hostname.asInstanceOf[js.Any], rrtype.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[MxRecord]]]
    
    inline def resolve_NAPTR(hostname: String, rrtype: NAPTR): js.Promise[js.Array[NaptrRecord]] = (^.asInstanceOf[js.Dynamic].applyDynamic("resolve")(hostname.asInstanceOf[js.Any], rrtype.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[NaptrRecord]]]
    
    inline def resolve_NS(hostname: String, rrtype: NS): js.Promise[js.Array[String]] = (^.asInstanceOf[js.Dynamic].applyDynamic("resolve")(hostname.asInstanceOf[js.Any], rrtype.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[String]]]
    
    inline def resolve_PTR(hostname: String, rrtype: PTR): js.Promise[js.Array[String]] = (^.asInstanceOf[js.Dynamic].applyDynamic("resolve")(hostname.asInstanceOf[js.Any], rrtype.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[String]]]
    
    inline def resolve_SOA(hostname: String, rrtype: SOA): js.Promise[SoaRecord] = (^.asInstanceOf[js.Dynamic].applyDynamic("resolve")(hostname.asInstanceOf[js.Any], rrtype.asInstanceOf[js.Any])).asInstanceOf[js.Promise[SoaRecord]]
    
    inline def resolve_SRV(hostname: String, rrtype: SRV): js.Promise[js.Array[SrvRecord]] = (^.asInstanceOf[js.Dynamic].applyDynamic("resolve")(hostname.asInstanceOf[js.Any], rrtype.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[SrvRecord]]]
    
    inline def resolve_TXT(hostname: String, rrtype: TXT): js.Promise[js.Array[js.Array[String]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("resolve")(hostname.asInstanceOf[js.Any], rrtype.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[js.Array[String]]]]
    
    /**
      * Performs a reverse DNS query that resolves an IPv4 or IPv6 address to an
      * array of host names.
      *
      * On error, the `Promise` is rejected with an `Error` object, where `err.code`is one of the `DNS error codes`.
      * @since v10.6.0
      */
    inline def reverse(ip: String): js.Promise[js.Array[String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("reverse")(ip.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[String]]]
    
    /**
      * Set the default value of `verbatim` in `dns.lookup()` and `dnsPromises.lookup()`. The value could be:
      *
      * * `ipv4first`: sets default `verbatim` `false`.
      * * `verbatim`: sets default `verbatim` `true`.
      *
      * The default is `ipv4first` and `dnsPromises.setDefaultResultOrder()` have
      * higher priority than `--dns-result-order`. When using `worker threads`,`dnsPromises.setDefaultResultOrder()` from the main thread won't affect the
      * default dns orders in workers.
      * @since v16.4.0, v14.18.0
      * @param order must be `'ipv4first'` or `'verbatim'`.
      */
    inline def setDefaultResultOrder(order: ipv4first | verbatim): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setDefaultResultOrder")(order.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * Sets the IP address and port of servers to be used when performing DNS
      * resolution. The `servers` argument is an array of [RFC 5952](https://tools.ietf.org/html/rfc5952#section-6) formatted
      * addresses. If the port is the IANA default DNS port (53) it can be omitted.
      *
      * ```js
      * dnsPromises.setServers([
      *   '4.4.4.4',
      *   '[2001:4860:4860::8888]',
      *   '4.4.4.4:1053',
      *   '[2001:4860:4860::8888]:1053',
      * ]);
      * ```
      *
      * An error will be thrown if an invalid address is provided.
      *
      * The `dnsPromises.setServers()` method must not be called while a DNS query is in
      * progress.
      *
      * This method works much like [resolve.conf](https://man7.org/linux/man-pages/man5/resolv.conf.5.html).
      * That is, if attempting to resolve with the first server provided results in a`NOTFOUND` error, the `resolve()` method will _not_ attempt to resolve with
      * subsequent servers provided. Fallback DNS servers will only be used if the
      * earlier ones time out or result in some other error.
      * @since v10.6.0
      * @param servers array of `RFC 5952` formatted addresses
      */
    inline def setServers(servers: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setServers")(servers.asInstanceOf[js.Any]).asInstanceOf[Unit]
  }
  
  inline def resolve(hostname: String): js.Promise[js.Array[String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("resolve")(hostname.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[String]]]
  inline def resolve(
    hostname: String,
    callback: js.Function2[
      /* err */ (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NodeJS.ErrnoException */ Any) | Null, 
      /* addresses */ js.Array[String], 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("resolve")(hostname.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def resolve(hostname: String, rrtype: A | AAAA | CNAME | NS | PTR): js.Promise[js.Array[String]] = (^.asInstanceOf[js.Dynamic].applyDynamic("resolve")(hostname.asInstanceOf[js.Any], rrtype.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[String]]]
  inline def resolve(
    hostname: String,
    rrtype: A | AAAA | CNAME | NS | PTR,
    callback: js.Function2[
      /* err */ (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NodeJS.ErrnoException */ Any) | Null, 
      /* addresses */ js.Array[String], 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("resolve")(hostname.asInstanceOf[js.Any], rrtype.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def resolve(hostname: String, rrtype: String): js.Promise[
    (js.Array[AnyRecord | js.Array[String] | MxRecord | NaptrRecord | SrvRecord | String]) | SoaRecord
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("resolve")(hostname.asInstanceOf[js.Any], rrtype.asInstanceOf[js.Any])).asInstanceOf[js.Promise[
    (js.Array[AnyRecord | js.Array[String] | MxRecord | NaptrRecord | SrvRecord | String]) | SoaRecord
  ]]
  inline def resolve(
    hostname: String,
    rrtype: String,
    callback: js.Function2[
      /* err */ (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NodeJS.ErrnoException */ Any) | Null, 
      /* addresses */ (js.Array[AnyRecord | js.Array[String] | MxRecord | NaptrRecord | SrvRecord | String]) | SoaRecord, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("resolve")(hostname.asInstanceOf[js.Any], rrtype.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def resolve4(hostname: String): js.Promise[js.Array[String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("resolve4")(hostname.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[String]]]
  inline def resolve4(
    hostname: String,
    callback: js.Function2[
      /* err */ (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NodeJS.ErrnoException */ Any) | Null, 
      /* addresses */ js.Array[String], 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("resolve4")(hostname.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def resolve4(hostname: String, options: ResolveOptions): js.Promise[js.Array[RecordWithTtl | String]] = (^.asInstanceOf[js.Dynamic].applyDynamic("resolve4")(hostname.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[RecordWithTtl | String]]]
  inline def resolve4(
    hostname: String,
    options: ResolveOptions,
    callback: js.Function2[
      /* err */ (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NodeJS.ErrnoException */ Any) | Null, 
      /* addresses */ js.Array[RecordWithTtl | String], 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("resolve4")(hostname.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def resolve4(hostname: String, options: ResolveWithTtlOptions): js.Promise[js.Array[RecordWithTtl]] = (^.asInstanceOf[js.Dynamic].applyDynamic("resolve4")(hostname.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[RecordWithTtl]]]
  inline def resolve4(
    hostname: String,
    options: ResolveWithTtlOptions,
    callback: js.Function2[
      /* err */ (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NodeJS.ErrnoException */ Any) | Null, 
      /* addresses */ js.Array[RecordWithTtl], 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("resolve4")(hostname.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def resolve6(hostname: String): js.Promise[js.Array[String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("resolve6")(hostname.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[String]]]
  inline def resolve6(
    hostname: String,
    callback: js.Function2[
      /* err */ (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NodeJS.ErrnoException */ Any) | Null, 
      /* addresses */ js.Array[String], 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("resolve6")(hostname.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def resolve6(hostname: String, options: ResolveOptions): js.Promise[js.Array[RecordWithTtl | String]] = (^.asInstanceOf[js.Dynamic].applyDynamic("resolve6")(hostname.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[RecordWithTtl | String]]]
  inline def resolve6(
    hostname: String,
    options: ResolveOptions,
    callback: js.Function2[
      /* err */ (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NodeJS.ErrnoException */ Any) | Null, 
      /* addresses */ js.Array[RecordWithTtl | String], 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("resolve6")(hostname.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def resolve6(hostname: String, options: ResolveWithTtlOptions): js.Promise[js.Array[RecordWithTtl]] = (^.asInstanceOf[js.Dynamic].applyDynamic("resolve6")(hostname.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[RecordWithTtl]]]
  inline def resolve6(
    hostname: String,
    options: ResolveWithTtlOptions,
    callback: js.Function2[
      /* err */ (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NodeJS.ErrnoException */ Any) | Null, 
      /* addresses */ js.Array[RecordWithTtl], 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("resolve6")(hostname.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def resolveAny(hostname: String): js.Promise[js.Array[AnyRecord]] = ^.asInstanceOf[js.Dynamic].applyDynamic("resolveAny")(hostname.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[AnyRecord]]]
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
  
  inline def resolveCname(hostname: String): js.Promise[js.Array[String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("resolveCname")(hostname.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[String]]]
  inline def resolveCname(
    hostname: String,
    callback: js.Function2[
      /* err */ (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NodeJS.ErrnoException */ Any) | Null, 
      /* addresses */ js.Array[String], 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveCname")(hostname.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def resolveMx(hostname: String): js.Promise[js.Array[MxRecord]] = ^.asInstanceOf[js.Dynamic].applyDynamic("resolveMx")(hostname.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[MxRecord]]]
  inline def resolveMx(
    hostname: String,
    callback: js.Function2[
      /* err */ (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NodeJS.ErrnoException */ Any) | Null, 
      /* addresses */ js.Array[MxRecord], 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveMx")(hostname.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def resolveNaptr(hostname: String): js.Promise[js.Array[NaptrRecord]] = ^.asInstanceOf[js.Dynamic].applyDynamic("resolveNaptr")(hostname.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[NaptrRecord]]]
  inline def resolveNaptr(
    hostname: String,
    callback: js.Function2[
      /* err */ (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NodeJS.ErrnoException */ Any) | Null, 
      /* addresses */ js.Array[NaptrRecord], 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveNaptr")(hostname.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def resolveNs(hostname: String): js.Promise[js.Array[String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("resolveNs")(hostname.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[String]]]
  inline def resolveNs(
    hostname: String,
    callback: js.Function2[
      /* err */ (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NodeJS.ErrnoException */ Any) | Null, 
      /* addresses */ js.Array[String], 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveNs")(hostname.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def resolvePtr(hostname: String): js.Promise[js.Array[String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("resolvePtr")(hostname.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[String]]]
  inline def resolvePtr(
    hostname: String,
    callback: js.Function2[
      /* err */ (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NodeJS.ErrnoException */ Any) | Null, 
      /* addresses */ js.Array[String], 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("resolvePtr")(hostname.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def resolveSoa(hostname: String): js.Promise[SoaRecord] = ^.asInstanceOf[js.Dynamic].applyDynamic("resolveSoa")(hostname.asInstanceOf[js.Any]).asInstanceOf[js.Promise[SoaRecord]]
  inline def resolveSoa(
    hostname: String,
    callback: js.Function2[
      /* err */ (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NodeJS.ErrnoException */ Any) | Null, 
      /* address */ SoaRecord, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveSoa")(hostname.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def resolveSrv(hostname: String): js.Promise[js.Array[SrvRecord]] = ^.asInstanceOf[js.Dynamic].applyDynamic("resolveSrv")(hostname.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[SrvRecord]]]
  inline def resolveSrv(
    hostname: String,
    callback: js.Function2[
      /* err */ (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NodeJS.ErrnoException */ Any) | Null, 
      /* addresses */ js.Array[SrvRecord], 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveSrv")(hostname.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def resolveTxt(hostname: String): js.Promise[js.Array[js.Array[String]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("resolveTxt")(hostname.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[js.Array[String]]]]
  inline def resolveTxt(
    hostname: String,
    callback: js.Function2[
      /* err */ (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NodeJS.ErrnoException */ Any) | Null, 
      /* addresses */ js.Array[js.Array[String]], 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveTxt")(hostname.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def resolve_ANY(hostname: String, rrtype: ANY): js.Promise[js.Array[AnyRecord]] = (^.asInstanceOf[js.Dynamic].applyDynamic("resolve")(hostname.asInstanceOf[js.Any], rrtype.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[AnyRecord]]]
  inline def resolve_ANY(
    hostname: String,
    rrtype: ANY,
    callback: js.Function2[
      /* err */ (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NodeJS.ErrnoException */ Any) | Null, 
      /* addresses */ js.Array[AnyRecord], 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("resolve")(hostname.asInstanceOf[js.Any], rrtype.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def resolve_MX(hostname: String, rrtype: MX): js.Promise[js.Array[MxRecord]] = (^.asInstanceOf[js.Dynamic].applyDynamic("resolve")(hostname.asInstanceOf[js.Any], rrtype.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[MxRecord]]]
  inline def resolve_MX(
    hostname: String,
    rrtype: MX,
    callback: js.Function2[
      /* err */ (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NodeJS.ErrnoException */ Any) | Null, 
      /* addresses */ js.Array[MxRecord], 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("resolve")(hostname.asInstanceOf[js.Any], rrtype.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def resolve_NAPTR(hostname: String, rrtype: NAPTR): js.Promise[js.Array[NaptrRecord]] = (^.asInstanceOf[js.Dynamic].applyDynamic("resolve")(hostname.asInstanceOf[js.Any], rrtype.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[NaptrRecord]]]
  inline def resolve_NAPTR(
    hostname: String,
    rrtype: NAPTR,
    callback: js.Function2[
      /* err */ (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NodeJS.ErrnoException */ Any) | Null, 
      /* addresses */ js.Array[NaptrRecord], 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("resolve")(hostname.asInstanceOf[js.Any], rrtype.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def resolve_SOA(hostname: String, rrtype: SOA): js.Promise[SoaRecord] = (^.asInstanceOf[js.Dynamic].applyDynamic("resolve")(hostname.asInstanceOf[js.Any], rrtype.asInstanceOf[js.Any])).asInstanceOf[js.Promise[SoaRecord]]
  inline def resolve_SOA(
    hostname: String,
    rrtype: SOA,
    callback: js.Function2[
      /* err */ (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NodeJS.ErrnoException */ Any) | Null, 
      /* addresses */ SoaRecord, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("resolve")(hostname.asInstanceOf[js.Any], rrtype.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def resolve_SRV(hostname: String, rrtype: SRV): js.Promise[js.Array[SrvRecord]] = (^.asInstanceOf[js.Dynamic].applyDynamic("resolve")(hostname.asInstanceOf[js.Any], rrtype.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[SrvRecord]]]
  inline def resolve_SRV(
    hostname: String,
    rrtype: SRV,
    callback: js.Function2[
      /* err */ (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NodeJS.ErrnoException */ Any) | Null, 
      /* addresses */ js.Array[SrvRecord], 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("resolve")(hostname.asInstanceOf[js.Any], rrtype.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def resolve_TXT(hostname: String, rrtype: TXT): js.Promise[js.Array[js.Array[String]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("resolve")(hostname.asInstanceOf[js.Any], rrtype.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[js.Array[String]]]]
  inline def resolve_TXT(
    hostname: String,
    rrtype: TXT,
    callback: js.Function2[
      /* err */ (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NodeJS.ErrnoException */ Any) | Null, 
      /* addresses */ js.Array[js.Array[String]], 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("resolve")(hostname.asInstanceOf[js.Any], rrtype.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def reverse(ip: String): js.Promise[js.Array[String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("reverse")(ip.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[String]]]
  inline def reverse(
    ip: String,
    callback: js.Function2[
      /* err */ (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NodeJS.ErrnoException */ Any) | Null, 
      /* domains */ js.Array[String], 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("reverse")(ip.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def setDefaultResultOrder(order: ipv4first | verbatim): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setDefaultResultOrder")(order.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def setServers(servers: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setServers")(servers.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
