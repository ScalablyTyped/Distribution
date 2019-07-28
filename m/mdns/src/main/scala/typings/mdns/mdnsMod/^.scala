package typings.mdns.mdnsMod

import typings.mdns.Anon_Name
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mdns", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  // --- Statics & Classes ---
  var Advertisement: AdvertisementCreatable = js.native
  var Browser: BrowserStatic = js.native
  var ServiceType: typings.mdns.mdnsMod.ServiceType = js.native
  // -------------------- -------------------- -------------------- -------------------- -------------------- -------------------- -------------------- -------------------- --------------------
  //Constants from dns_sd.h (C-Code of Bonjour -> see https://developer.apple.com/library/mac/documentation/Networking/Reference/DNSServiceDiscovery_CRef/Reference/reference.html)
  var _DNS_SD_H: Double = js.native
  var dns_sd: js.Any = js.native
  // constants
  var isAvahi: Boolean = js.native
  var kDNSServiceClass_IN: Double = js.native
  var kDNSServiceErr_AlreadyRegistered: Double = js.native
  var kDNSServiceErr_BadFlags: Double = js.native
  var kDNSServiceErr_BadInterfaceIndex: Double = js.native
  var kDNSServiceErr_BadKey: Double = js.native
  var kDNSServiceErr_BadParam: Double = js.native
  var kDNSServiceErr_BadReference: Double = js.native
  var kDNSServiceErr_BadSig: Double = js.native
  var kDNSServiceErr_BadState: Double = js.native
  var kDNSServiceErr_BadTime: Double = js.native
  var kDNSServiceErr_DoubleNAT: Double = js.native
  var kDNSServiceErr_Firewall: Double = js.native
  var kDNSServiceErr_Incompatible: Double = js.native
  var kDNSServiceErr_Invalid: Double = js.native
  var kDNSServiceErr_NATPortMappingDisabled: Double = js.native
  var kDNSServiceErr_NATPortMappingUnsupported: Double = js.native
  var kDNSServiceErr_NATTraversal: Double = js.native
  var kDNSServiceErr_NameConflict: Double = js.native
  var kDNSServiceErr_NoAuth: Double = js.native
  var kDNSServiceErr_NoError: Double = js.native
  var kDNSServiceErr_NoMemory: Double = js.native
  var kDNSServiceErr_NoRouter: Double = js.native
  var kDNSServiceErr_NoSuchKey: Double = js.native
  var kDNSServiceErr_NoSuchName: Double = js.native
  var kDNSServiceErr_NoSuchRecord: Double = js.native
  var kDNSServiceErr_NotInitialized: Double = js.native
  var kDNSServiceErr_PollingMode: Double = js.native
  var kDNSServiceErr_Refused: Double = js.native
  var kDNSServiceErr_ServiceNotRunning: Double = js.native
  var kDNSServiceErr_Timeout: Double = js.native
  var kDNSServiceErr_Transient: Double = js.native
  var kDNSServiceErr_Unknown: Double = js.native
  var kDNSServiceErr_Unsupported: Double = js.native
  var kDNSServiceFlagsAdd: Double = js.native
  var kDNSServiceFlagsAllowRemoteQuery: Double = js.native
  var kDNSServiceFlagsBackgroundTrafficClass: Double = js.native
  var kDNSServiceFlagsBogus: Double = js.native
  var kDNSServiceFlagsBrowseDomains: Double = js.native
  var kDNSServiceFlagsDefault: Double = js.native
  var kDNSServiceFlagsForceMulticast: Double = js.native
  var kDNSServiceFlagsIncludeAWDL: Double = js.native
  var kDNSServiceFlagsIndeterminate: Double = js.native
  var kDNSServiceFlagsInsecure: Double = js.native
  var kDNSServiceFlagsKnownUnique: Double = js.native
  var kDNSServiceFlagsLongLivedQuery: Double = js.native
  var kDNSServiceFlagsMoreComing: Double = js.native
  var kDNSServiceFlagsNoAutoRename: Double = js.native
  var kDNSServiceFlagsNonBrowsable: Double = js.native
  var kDNSServiceFlagsRegistrationDomains: Double = js.native
  var kDNSServiceFlagsReturnIntermediates: Double = js.native
  var kDNSServiceFlagsSecure: Double = js.native
  var kDNSServiceFlagsShareConnection: Double = js.native
  var kDNSServiceFlagsShared: Double = js.native
  var kDNSServiceFlagsSuppressUnusable: Double = js.native
  var kDNSServiceFlagsUnicastResponse: Double = js.native
  var kDNSServiceFlagsUnique: Double = js.native
  var kDNSServiceFlagsValidate: Double = js.native
  var kDNSServiceFlagsValidateOptional: Double = js.native
  var kDNSServiceFlagsWakeOnResolve: Double = js.native
  var kDNSServiceFlagsWakeOnlyService: Double = js.native
  var kDNSServiceMaxDomainName: String = js.native
  var kDNSServiceMaxServiceName: Double = js.native
  var kDNSServiceOutputFlags: js.Any = js.native
  var kDNSServiceProperty_DaemonVersion: Double = js.native
  var kDNSServiceProtocol_IPv4: Double = js.native
  var kDNSServiceProtocol_IPv6: Double = js.native
  var kDNSServiceProtocol_TCP: Double = js.native
  var kDNSServiceProtocol_UDP: Double = js.native
  var kDNSServiceType_A: Double = js.native
  var kDNSServiceType_A6: Double = js.native
  var kDNSServiceType_AAAA: Double = js.native
  var kDNSServiceType_AFSDB: Double = js.native
  var kDNSServiceType_ANY: Double = js.native
  var kDNSServiceType_APL: Double = js.native
  var kDNSServiceType_ATMA: Double = js.native
  var kDNSServiceType_AXFR: Double = js.native
  var kDNSServiceType_CERT: Double = js.native
  var kDNSServiceType_CNAME: Double = js.native
  var kDNSServiceType_DHCID: Double = js.native
  var kDNSServiceType_DNAME: Double = js.native
  var kDNSServiceType_DNSKEY: Double = js.native
  var kDNSServiceType_DS: Double = js.native
  var kDNSServiceType_EID: Double = js.native
  var kDNSServiceType_GID: Double = js.native
  var kDNSServiceType_GPOS: Double = js.native
  var kDNSServiceType_HINFO: Double = js.native
  var kDNSServiceType_HIP: Double = js.native
  var kDNSServiceType_IPSECKEY: Double = js.native
  var kDNSServiceType_ISDN: Double = js.native
  var kDNSServiceType_IXFR: Double = js.native
  var kDNSServiceType_KEY: Double = js.native
  var kDNSServiceType_KX: Double = js.native
  var kDNSServiceType_LOC: Double = js.native
  var kDNSServiceType_MAILA: Double = js.native
  var kDNSServiceType_MAILB: Double = js.native
  var kDNSServiceType_MB: Double = js.native
  var kDNSServiceType_MD: Double = js.native
  var kDNSServiceType_MF: Double = js.native
  var kDNSServiceType_MG: Double = js.native
  var kDNSServiceType_MINFO: Double = js.native
  var kDNSServiceType_MR: Double = js.native
  var kDNSServiceType_MX: Double = js.native
  var kDNSServiceType_NAPTR: Double = js.native
  var kDNSServiceType_NIMLOC: Double = js.native
  var kDNSServiceType_NS: Double = js.native
  var kDNSServiceType_NSAP: Double = js.native
  var kDNSServiceType_NSAP_PTR: Double = js.native
  var kDNSServiceType_NSEC: Double = js.native
  var kDNSServiceType_NSEC3: Double = js.native
  var kDNSServiceType_NSEC3PARAM: Double = js.native
  var kDNSServiceType_NULL: Double = js.native
  var kDNSServiceType_NXT: Double = js.native
  var kDNSServiceType_OPT: Double = js.native
  var kDNSServiceType_PTR: Double = js.native
  var kDNSServiceType_PX: Double = js.native
  var kDNSServiceType_RP: Double = js.native
  var kDNSServiceType_RRSIG: Double = js.native
  var kDNSServiceType_RT: Double = js.native
  var kDNSServiceType_SIG: Double = js.native
  var kDNSServiceType_SINK: Double = js.native
  var kDNSServiceType_SOA: Double = js.native
  var kDNSServiceType_SPF: Double = js.native
  var kDNSServiceType_SRV: Double = js.native
  var kDNSServiceType_SSHFP: Double = js.native
  var kDNSServiceType_TKEY: Double = js.native
  var kDNSServiceType_TSIG: Double = js.native
  var kDNSServiceType_TXT: Double = js.native
  var kDNSServiceType_UID: Double = js.native
  var kDNSServiceType_UINFO: Double = js.native
  var kDNSServiceType_UNSPEC: Double = js.native
  var kDNSServiceType_WKS: Double = js.native
  var kDNSServiceType_X25: Double = js.native
  var rst: DefaultResolverSequenceTasks = js.native
  def browseThemAll(options: BrowserOptions): Browser = js.native
  def createAdvertisement(serviceType: ServiceType, port: Double): Advertisement = js.native
  def createAdvertisement(serviceType: ServiceType, port: Double, options: AdvertisementOptions): Advertisement = js.native
  def createAdvertisement(
    serviceType: ServiceType,
    port: Double,
    options: AdvertisementOptions,
    callback: js.Function2[/* error */ DnsSdError, /* service */ Service, Unit]
  ): Advertisement = js.native
  def createBrowser(serviceType: ServiceType): Browser = js.native
  def createBrowser(serviceType: ServiceType, options: BrowserOptions): Browser = js.native
  def loopbackInterface(): js.Any = js.native
  def makeServiceType(name: String, protocol: String, subtypes: String*): ServiceType = js.native
  def makeServiceType(serviceTypeIdentifier: String): ServiceType = js.native
  def makeServiceType(serviceTypeIdentifier: js.Array[String]): ServiceType = js.native
  def makeServiceType(serviceTypeIdentifier: Anon_Name): ServiceType = js.native
  def makeServiceType(serviceType: ServiceType): ServiceType = js.native
  def resolve(service: Service): Unit = js.native
  def resolve(
    service: Service,
    sequence: js.Array[js.Function2[/* service */ Service, /* next */ js.Function0[Unit], Boolean]]
  ): Unit = js.native
  def resolve(
    service: Service,
    sequence: js.Array[js.Function2[/* service */ Service, /* next */ js.Function0[Unit], Boolean]],
    callback: js.Function2[/* error */ DnsSdError, /* service */ Service, Unit]
  ): Unit = js.native
  // static functions
  def tcp(name: String, subtypes: String*): ServiceType = js.native
  def udp(name: String, subtypes: String*): ServiceType = js.native
}

