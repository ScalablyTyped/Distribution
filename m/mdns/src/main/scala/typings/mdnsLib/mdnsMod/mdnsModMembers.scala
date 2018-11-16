package typings
package mdnsLib.mdnsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mdns", JSImport.Namespace)
@js.native
object mdnsModMembers extends js.Object {
  // --- Statics & Classes ---
  var Advertisement: mdnsLib.mdnsMod.MDNSNs.AdvertisementCreatable = js.native
  var Browser: mdnsLib.mdnsMod.MDNSNs.BrowserStatic = js.native
  var ServiceType: mdnsLib.mdnsMod.MDNSNs.ServiceType = js.native
  // -------------------- -------------------- -------------------- -------------------- -------------------- -------------------- -------------------- -------------------- --------------------
  //Constants from dns_sd.h (C-Code of Bonjour -> see https://developer.apple.com/library/mac/documentation/Networking/Reference/DNSServiceDiscovery_CRef/Reference/reference.html)
  var _DNS_SD_H: scala.Double = js.native
  // constants
  var isAvahi: scala.Boolean = js.native
  var kDNSServiceClass_IN: scala.Double = js.native
  var kDNSServiceErr_AlreadyRegistered: scala.Double = js.native
  var kDNSServiceErr_BadFlags: scala.Double = js.native
  var kDNSServiceErr_BadInterfaceIndex: scala.Double = js.native
  var kDNSServiceErr_BadKey: scala.Double = js.native
  var kDNSServiceErr_BadParam: scala.Double = js.native
  var kDNSServiceErr_BadReference: scala.Double = js.native
  var kDNSServiceErr_BadSig: scala.Double = js.native
  var kDNSServiceErr_BadState: scala.Double = js.native
  var kDNSServiceErr_BadTime: scala.Double = js.native
  var kDNSServiceErr_DoubleNAT: scala.Double = js.native
  var kDNSServiceErr_Firewall: scala.Double = js.native
  var kDNSServiceErr_Incompatible: scala.Double = js.native
  var kDNSServiceErr_Invalid: scala.Double = js.native
  var kDNSServiceErr_NATPortMappingDisabled: scala.Double = js.native
  var kDNSServiceErr_NATPortMappingUnsupported: scala.Double = js.native
  var kDNSServiceErr_NATTraversal: scala.Double = js.native
  var kDNSServiceErr_NameConflict: scala.Double = js.native
  var kDNSServiceErr_NoAuth: scala.Double = js.native
  var kDNSServiceErr_NoError: scala.Double = js.native
  var kDNSServiceErr_NoMemory: scala.Double = js.native
  var kDNSServiceErr_NoRouter: scala.Double = js.native
  var kDNSServiceErr_NoSuchKey: scala.Double = js.native
  var kDNSServiceErr_NoSuchName: scala.Double = js.native
  var kDNSServiceErr_NoSuchRecord: scala.Double = js.native
  var kDNSServiceErr_NotInitialized: scala.Double = js.native
  var kDNSServiceErr_PollingMode: scala.Double = js.native
  var kDNSServiceErr_Refused: scala.Double = js.native
  var kDNSServiceErr_ServiceNotRunning: scala.Double = js.native
  var kDNSServiceErr_Timeout: scala.Double = js.native
  var kDNSServiceErr_Transient: scala.Double = js.native
  var kDNSServiceErr_Unknown: scala.Double = js.native
  var kDNSServiceErr_Unsupported: scala.Double = js.native
  var kDNSServiceFlagsAdd: scala.Double = js.native
  var kDNSServiceFlagsAllowRemoteQuery: scala.Double = js.native
  var kDNSServiceFlagsBackgroundTrafficClass: scala.Double = js.native
  var kDNSServiceFlagsBogus: scala.Double = js.native
  var kDNSServiceFlagsBrowseDomains: scala.Double = js.native
  var kDNSServiceFlagsDefault: scala.Double = js.native
  var kDNSServiceFlagsForceMulticast: scala.Double = js.native
  var kDNSServiceFlagsIncludeAWDL: scala.Double = js.native
  var kDNSServiceFlagsIndeterminate: scala.Double = js.native
  var kDNSServiceFlagsInsecure: scala.Double = js.native
  var kDNSServiceFlagsKnownUnique: scala.Double = js.native
  var kDNSServiceFlagsLongLivedQuery: scala.Double = js.native
  var kDNSServiceFlagsMoreComing: scala.Double = js.native
  var kDNSServiceFlagsNoAutoRename: scala.Double = js.native
  var kDNSServiceFlagsNonBrowsable: scala.Double = js.native
  var kDNSServiceFlagsRegistrationDomains: scala.Double = js.native
  var kDNSServiceFlagsReturnIntermediates: scala.Double = js.native
  var kDNSServiceFlagsSecure: scala.Double = js.native
  var kDNSServiceFlagsShareConnection: scala.Double = js.native
  var kDNSServiceFlagsShared: scala.Double = js.native
  var kDNSServiceFlagsSuppressUnusable: scala.Double = js.native
  var kDNSServiceFlagsUnicastResponse: scala.Double = js.native
  var kDNSServiceFlagsUnique: scala.Double = js.native
  var kDNSServiceFlagsValidate: scala.Double = js.native
  var kDNSServiceFlagsValidateOptional: scala.Double = js.native
  var kDNSServiceFlagsWakeOnResolve: scala.Double = js.native
  var kDNSServiceFlagsWakeOnlyService: scala.Double = js.native
  var kDNSServiceMaxDomainName: java.lang.String = js.native
  var kDNSServiceMaxServiceName: scala.Double = js.native
  var kDNSServiceOutputFlags: js.Any = js.native
  var kDNSServiceProperty_DaemonVersion: scala.Double = js.native
  var kDNSServiceProtocol_IPv4: scala.Double = js.native
  var kDNSServiceProtocol_IPv6: scala.Double = js.native
  var kDNSServiceProtocol_TCP: scala.Double = js.native
  var kDNSServiceProtocol_UDP: scala.Double = js.native
  var kDNSServiceType_A: scala.Double = js.native
  var kDNSServiceType_A6: scala.Double = js.native
  var kDNSServiceType_AAAA: scala.Double = js.native
  var kDNSServiceType_AFSDB: scala.Double = js.native
  var kDNSServiceType_ANY: scala.Double = js.native
  var kDNSServiceType_APL: scala.Double = js.native
  var kDNSServiceType_ATMA: scala.Double = js.native
  var kDNSServiceType_AXFR: scala.Double = js.native
  var kDNSServiceType_CERT: scala.Double = js.native
  var kDNSServiceType_CNAME: scala.Double = js.native
  var kDNSServiceType_DHCID: scala.Double = js.native
  var kDNSServiceType_DNAME: scala.Double = js.native
  var kDNSServiceType_DNSKEY: scala.Double = js.native
  var kDNSServiceType_DS: scala.Double = js.native
  var kDNSServiceType_EID: scala.Double = js.native
  var kDNSServiceType_GID: scala.Double = js.native
  var kDNSServiceType_GPOS: scala.Double = js.native
  var kDNSServiceType_HINFO: scala.Double = js.native
  var kDNSServiceType_HIP: scala.Double = js.native
  var kDNSServiceType_IPSECKEY: scala.Double = js.native
  var kDNSServiceType_ISDN: scala.Double = js.native
  var kDNSServiceType_IXFR: scala.Double = js.native
  var kDNSServiceType_KEY: scala.Double = js.native
  var kDNSServiceType_KX: scala.Double = js.native
  var kDNSServiceType_LOC: scala.Double = js.native
  var kDNSServiceType_MAILA: scala.Double = js.native
  var kDNSServiceType_MAILB: scala.Double = js.native
  var kDNSServiceType_MB: scala.Double = js.native
  var kDNSServiceType_MD: scala.Double = js.native
  var kDNSServiceType_MF: scala.Double = js.native
  var kDNSServiceType_MG: scala.Double = js.native
  var kDNSServiceType_MINFO: scala.Double = js.native
  var kDNSServiceType_MR: scala.Double = js.native
  var kDNSServiceType_MX: scala.Double = js.native
  var kDNSServiceType_NAPTR: scala.Double = js.native
  var kDNSServiceType_NIMLOC: scala.Double = js.native
  var kDNSServiceType_NS: scala.Double = js.native
  var kDNSServiceType_NSAP: scala.Double = js.native
  var kDNSServiceType_NSAP_PTR: scala.Double = js.native
  var kDNSServiceType_NSEC: scala.Double = js.native
  var kDNSServiceType_NSEC3: scala.Double = js.native
  var kDNSServiceType_NSEC3PARAM: scala.Double = js.native
  var kDNSServiceType_NULL: scala.Double = js.native
  var kDNSServiceType_NXT: scala.Double = js.native
  var kDNSServiceType_OPT: scala.Double = js.native
  var kDNSServiceType_PTR: scala.Double = js.native
  var kDNSServiceType_PX: scala.Double = js.native
  var kDNSServiceType_RP: scala.Double = js.native
  var kDNSServiceType_RRSIG: scala.Double = js.native
  var kDNSServiceType_RT: scala.Double = js.native
  var kDNSServiceType_SIG: scala.Double = js.native
  var kDNSServiceType_SINK: scala.Double = js.native
  var kDNSServiceType_SOA: scala.Double = js.native
  var kDNSServiceType_SPF: scala.Double = js.native
  var kDNSServiceType_SRV: scala.Double = js.native
  var kDNSServiceType_SSHFP: scala.Double = js.native
  var kDNSServiceType_TKEY: scala.Double = js.native
  var kDNSServiceType_TSIG: scala.Double = js.native
  var kDNSServiceType_TXT: scala.Double = js.native
  var kDNSServiceType_UID: scala.Double = js.native
  var kDNSServiceType_UINFO: scala.Double = js.native
  var kDNSServiceType_UNSPEC: scala.Double = js.native
  var kDNSServiceType_WKS: scala.Double = js.native
  var kDNSServiceType_X25: scala.Double = js.native
  var rst: mdnsLib.mdnsMod.MDNSNs.DefaultResolverSequenceTasks = js.native
  def browseThemAll(options: mdnsLib.mdnsMod.MDNSNs.BrowserOptions): mdnsLib.mdnsMod.MDNSNs.Browser = js.native
  def createAdvertisement(serviceType: mdnsLib.mdnsMod.MDNSNs.ServiceType, port: scala.Double): mdnsLib.mdnsMod.MDNSNs.Advertisement = js.native
  def createAdvertisement(
    serviceType: mdnsLib.mdnsMod.MDNSNs.ServiceType,
    port: scala.Double,
    options: mdnsLib.mdnsMod.MDNSNs.AdvertisementOptions
  ): mdnsLib.mdnsMod.MDNSNs.Advertisement = js.native
  def createAdvertisement(
    serviceType: mdnsLib.mdnsMod.MDNSNs.ServiceType,
    port: scala.Double,
    options: mdnsLib.mdnsMod.MDNSNs.AdvertisementOptions,
    callback: js.Function2[
      /* error */ mdnsLib.mdnsMod.MDNSNs.DnsSdError, 
      /* service */ mdnsLib.mdnsMod.MDNSNs.Service, 
      scala.Unit
    ]
  ): mdnsLib.mdnsMod.MDNSNs.Advertisement = js.native
  def createBrowser(serviceType: mdnsLib.mdnsMod.MDNSNs.ServiceType): mdnsLib.mdnsMod.MDNSNs.Browser = js.native
  def createBrowser(serviceType: mdnsLib.mdnsMod.MDNSNs.ServiceType, options: mdnsLib.mdnsMod.MDNSNs.BrowserOptions): mdnsLib.mdnsMod.MDNSNs.Browser = js.native
  def loopbackInterface(): js.Any = js.native
  def makeServiceType(name: java.lang.String, protocol: java.lang.String, subtypes: java.lang.String*): mdnsLib.mdnsMod.MDNSNs.ServiceType = js.native
  def makeServiceType(serviceTypeIdentifier: java.lang.String): mdnsLib.mdnsMod.MDNSNs.ServiceType = js.native
  def makeServiceType(serviceTypeIdentifier: js.Array[java.lang.String]): mdnsLib.mdnsMod.MDNSNs.ServiceType = js.native
  def makeServiceType(serviceTypeIdentifier: mdnsLib.Anon_Name): mdnsLib.mdnsMod.MDNSNs.ServiceType = js.native
  def makeServiceType(serviceType: mdnsLib.mdnsMod.MDNSNs.ServiceType): mdnsLib.mdnsMod.MDNSNs.ServiceType = js.native
  def resolve(service: mdnsLib.mdnsMod.MDNSNs.Service): scala.Unit = js.native
  def resolve(
    service: mdnsLib.mdnsMod.MDNSNs.Service,
    sequence: js.Array[
      js.Function2[
        /* service */ mdnsLib.mdnsMod.MDNSNs.Service, 
        /* next */ js.Function0[scala.Unit], 
        scala.Boolean
      ]
    ]
  ): scala.Unit = js.native
  def resolve(
    service: mdnsLib.mdnsMod.MDNSNs.Service,
    sequence: js.Array[
      js.Function2[
        /* service */ mdnsLib.mdnsMod.MDNSNs.Service, 
        /* next */ js.Function0[scala.Unit], 
        scala.Boolean
      ]
    ],
    callback: js.Function2[
      /* error */ mdnsLib.mdnsMod.MDNSNs.DnsSdError, 
      /* service */ mdnsLib.mdnsMod.MDNSNs.Service, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  // static functions
  def tcp(name: java.lang.String, subtypes: java.lang.String*): mdnsLib.mdnsMod.MDNSNs.ServiceType = js.native
  def udp(name: java.lang.String, subtypes: java.lang.String*): mdnsLib.mdnsMod.MDNSNs.ServiceType = js.native
}

