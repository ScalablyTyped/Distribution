package typings.mdns.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mdns", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  // --- Statics & Classes ---
  var Advertisement: AdvertisementCreatable = js.native
  var Browser: BrowserStatic = js.native
  var ServiceType: typings.mdns.mod.ServiceType = js.native
  // -------------------- -------------------- -------------------- -------------------- -------------------- -------------------- -------------------- -------------------- --------------------
  //Constants from dns_sd.h (C-Code of Bonjour -> see https://developer.apple.com/library/mac/documentation/Networking/Reference/DNSServiceDiscovery_CRef/Reference/reference.html)
  var _DNS_SD_H: Double = js.native
  @JSName("dns_sd")
  var dnsSd: js.Any = js.native
  // constants
  var isAvahi: Boolean = js.native
  @JSName("kDNSServiceClass_IN")
  var kDNSServiceClassIN: Double = js.native
  @JSName("kDNSServiceErr_AlreadyRegistered")
  var kDNSServiceErrAlreadyRegistered: Double = js.native
  @JSName("kDNSServiceErr_BadFlags")
  var kDNSServiceErrBadFlags: Double = js.native
  @JSName("kDNSServiceErr_BadInterfaceIndex")
  var kDNSServiceErrBadInterfaceIndex: Double = js.native
  @JSName("kDNSServiceErr_BadKey")
  var kDNSServiceErrBadKey: Double = js.native
  @JSName("kDNSServiceErr_BadParam")
  var kDNSServiceErrBadParam: Double = js.native
  @JSName("kDNSServiceErr_BadReference")
  var kDNSServiceErrBadReference: Double = js.native
  @JSName("kDNSServiceErr_BadSig")
  var kDNSServiceErrBadSig: Double = js.native
  @JSName("kDNSServiceErr_BadState")
  var kDNSServiceErrBadState: Double = js.native
  @JSName("kDNSServiceErr_BadTime")
  var kDNSServiceErrBadTime: Double = js.native
  @JSName("kDNSServiceErr_DoubleNAT")
  var kDNSServiceErrDoubleNAT: Double = js.native
  @JSName("kDNSServiceErr_Firewall")
  var kDNSServiceErrFirewall: Double = js.native
  @JSName("kDNSServiceErr_Incompatible")
  var kDNSServiceErrIncompatible: Double = js.native
  @JSName("kDNSServiceErr_Invalid")
  var kDNSServiceErrInvalid: Double = js.native
  @JSName("kDNSServiceErr_NATPortMappingDisabled")
  var kDNSServiceErrNATPortMappingDisabled: Double = js.native
  @JSName("kDNSServiceErr_NATPortMappingUnsupported")
  var kDNSServiceErrNATPortMappingUnsupported: Double = js.native
  @JSName("kDNSServiceErr_NATTraversal")
  var kDNSServiceErrNATTraversal: Double = js.native
  @JSName("kDNSServiceErr_NameConflict")
  var kDNSServiceErrNameConflict: Double = js.native
  @JSName("kDNSServiceErr_NoAuth")
  var kDNSServiceErrNoAuth: Double = js.native
  @JSName("kDNSServiceErr_NoError")
  var kDNSServiceErrNoError: Double = js.native
  @JSName("kDNSServiceErr_NoMemory")
  var kDNSServiceErrNoMemory: Double = js.native
  @JSName("kDNSServiceErr_NoRouter")
  var kDNSServiceErrNoRouter: Double = js.native
  @JSName("kDNSServiceErr_NoSuchKey")
  var kDNSServiceErrNoSuchKey: Double = js.native
  @JSName("kDNSServiceErr_NoSuchName")
  var kDNSServiceErrNoSuchName: Double = js.native
  @JSName("kDNSServiceErr_NoSuchRecord")
  var kDNSServiceErrNoSuchRecord: Double = js.native
  @JSName("kDNSServiceErr_NotInitialized")
  var kDNSServiceErrNotInitialized: Double = js.native
  @JSName("kDNSServiceErr_PollingMode")
  var kDNSServiceErrPollingMode: Double = js.native
  @JSName("kDNSServiceErr_Refused")
  var kDNSServiceErrRefused: Double = js.native
  @JSName("kDNSServiceErr_ServiceNotRunning")
  var kDNSServiceErrServiceNotRunning: Double = js.native
  @JSName("kDNSServiceErr_Timeout")
  var kDNSServiceErrTimeout: Double = js.native
  @JSName("kDNSServiceErr_Transient")
  var kDNSServiceErrTransient: Double = js.native
  @JSName("kDNSServiceErr_Unknown")
  var kDNSServiceErrUnknown: Double = js.native
  @JSName("kDNSServiceErr_Unsupported")
  var kDNSServiceErrUnsupported: Double = js.native
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
  @JSName("kDNSServiceProperty_DaemonVersion")
  var kDNSServicePropertyDaemonVersion: Double = js.native
  @JSName("kDNSServiceProtocol_IPv4")
  var kDNSServiceProtocolIPv4: Double = js.native
  @JSName("kDNSServiceProtocol_IPv6")
  var kDNSServiceProtocolIPv6: Double = js.native
  @JSName("kDNSServiceProtocol_TCP")
  var kDNSServiceProtocolTCP: Double = js.native
  @JSName("kDNSServiceProtocol_UDP")
  var kDNSServiceProtocolUDP: Double = js.native
  @JSName("kDNSServiceType_A")
  var kDNSServiceTypeA: Double = js.native
  @JSName("kDNSServiceType_A6")
  var kDNSServiceTypeA6: Double = js.native
  @JSName("kDNSServiceType_AAAA")
  var kDNSServiceTypeAAAA: Double = js.native
  @JSName("kDNSServiceType_AFSDB")
  var kDNSServiceTypeAFSDB: Double = js.native
  @JSName("kDNSServiceType_ANY")
  var kDNSServiceTypeANY: Double = js.native
  @JSName("kDNSServiceType_APL")
  var kDNSServiceTypeAPL: Double = js.native
  @JSName("kDNSServiceType_ATMA")
  var kDNSServiceTypeATMA: Double = js.native
  @JSName("kDNSServiceType_AXFR")
  var kDNSServiceTypeAXFR: Double = js.native
  @JSName("kDNSServiceType_CERT")
  var kDNSServiceTypeCERT: Double = js.native
  @JSName("kDNSServiceType_CNAME")
  var kDNSServiceTypeCNAME: Double = js.native
  @JSName("kDNSServiceType_DHCID")
  var kDNSServiceTypeDHCID: Double = js.native
  @JSName("kDNSServiceType_DNAME")
  var kDNSServiceTypeDNAME: Double = js.native
  @JSName("kDNSServiceType_DNSKEY")
  var kDNSServiceTypeDNSKEY: Double = js.native
  @JSName("kDNSServiceType_DS")
  var kDNSServiceTypeDS: Double = js.native
  @JSName("kDNSServiceType_EID")
  var kDNSServiceTypeEID: Double = js.native
  @JSName("kDNSServiceType_GID")
  var kDNSServiceTypeGID: Double = js.native
  @JSName("kDNSServiceType_GPOS")
  var kDNSServiceTypeGPOS: Double = js.native
  @JSName("kDNSServiceType_HINFO")
  var kDNSServiceTypeHINFO: Double = js.native
  @JSName("kDNSServiceType_HIP")
  var kDNSServiceTypeHIP: Double = js.native
  @JSName("kDNSServiceType_IPSECKEY")
  var kDNSServiceTypeIPSECKEY: Double = js.native
  @JSName("kDNSServiceType_ISDN")
  var kDNSServiceTypeISDN: Double = js.native
  @JSName("kDNSServiceType_IXFR")
  var kDNSServiceTypeIXFR: Double = js.native
  @JSName("kDNSServiceType_KEY")
  var kDNSServiceTypeKEY: Double = js.native
  @JSName("kDNSServiceType_KX")
  var kDNSServiceTypeKX: Double = js.native
  @JSName("kDNSServiceType_LOC")
  var kDNSServiceTypeLOC: Double = js.native
  @JSName("kDNSServiceType_MAILA")
  var kDNSServiceTypeMAILA: Double = js.native
  @JSName("kDNSServiceType_MAILB")
  var kDNSServiceTypeMAILB: Double = js.native
  @JSName("kDNSServiceType_MB")
  var kDNSServiceTypeMB: Double = js.native
  @JSName("kDNSServiceType_MD")
  var kDNSServiceTypeMD: Double = js.native
  @JSName("kDNSServiceType_MF")
  var kDNSServiceTypeMF: Double = js.native
  @JSName("kDNSServiceType_MG")
  var kDNSServiceTypeMG: Double = js.native
  @JSName("kDNSServiceType_MINFO")
  var kDNSServiceTypeMINFO: Double = js.native
  @JSName("kDNSServiceType_MR")
  var kDNSServiceTypeMR: Double = js.native
  @JSName("kDNSServiceType_MX")
  var kDNSServiceTypeMX: Double = js.native
  @JSName("kDNSServiceType_NAPTR")
  var kDNSServiceTypeNAPTR: Double = js.native
  @JSName("kDNSServiceType_NIMLOC")
  var kDNSServiceTypeNIMLOC: Double = js.native
  @JSName("kDNSServiceType_NS")
  var kDNSServiceTypeNS: Double = js.native
  @JSName("kDNSServiceType_NSAP")
  var kDNSServiceTypeNSAP: Double = js.native
  @JSName("kDNSServiceType_NSAP_PTR")
  var kDNSServiceTypeNSAPPTR: Double = js.native
  @JSName("kDNSServiceType_NSEC")
  var kDNSServiceTypeNSEC: Double = js.native
  @JSName("kDNSServiceType_NSEC3")
  var kDNSServiceTypeNSEC3: Double = js.native
  @JSName("kDNSServiceType_NSEC3PARAM")
  var kDNSServiceTypeNSEC3PARAM: Double = js.native
  @JSName("kDNSServiceType_NULL")
  var kDNSServiceTypeNULL: Double = js.native
  @JSName("kDNSServiceType_NXT")
  var kDNSServiceTypeNXT: Double = js.native
  @JSName("kDNSServiceType_OPT")
  var kDNSServiceTypeOPT: Double = js.native
  @JSName("kDNSServiceType_PTR")
  var kDNSServiceTypePTR: Double = js.native
  @JSName("kDNSServiceType_PX")
  var kDNSServiceTypePX: Double = js.native
  @JSName("kDNSServiceType_RP")
  var kDNSServiceTypeRP: Double = js.native
  @JSName("kDNSServiceType_RRSIG")
  var kDNSServiceTypeRRSIG: Double = js.native
  @JSName("kDNSServiceType_RT")
  var kDNSServiceTypeRT: Double = js.native
  @JSName("kDNSServiceType_SIG")
  var kDNSServiceTypeSIG: Double = js.native
  @JSName("kDNSServiceType_SINK")
  var kDNSServiceTypeSINK: Double = js.native
  @JSName("kDNSServiceType_SOA")
  var kDNSServiceTypeSOA: Double = js.native
  @JSName("kDNSServiceType_SPF")
  var kDNSServiceTypeSPF: Double = js.native
  @JSName("kDNSServiceType_SRV")
  var kDNSServiceTypeSRV: Double = js.native
  @JSName("kDNSServiceType_SSHFP")
  var kDNSServiceTypeSSHFP: Double = js.native
  @JSName("kDNSServiceType_TKEY")
  var kDNSServiceTypeTKEY: Double = js.native
  @JSName("kDNSServiceType_TSIG")
  var kDNSServiceTypeTSIG: Double = js.native
  @JSName("kDNSServiceType_TXT")
  var kDNSServiceTypeTXT: Double = js.native
  @JSName("kDNSServiceType_UID")
  var kDNSServiceTypeUID: Double = js.native
  @JSName("kDNSServiceType_UINFO")
  var kDNSServiceTypeUINFO: Double = js.native
  @JSName("kDNSServiceType_UNSPEC")
  var kDNSServiceTypeUNSPEC: Double = js.native
  @JSName("kDNSServiceType_WKS")
  var kDNSServiceTypeWKS: Double = js.native
  @JSName("kDNSServiceType_X25")
  var kDNSServiceTypeX25: Double = js.native
  var rst: DefaultResolverSequenceTasks = js.native
}

