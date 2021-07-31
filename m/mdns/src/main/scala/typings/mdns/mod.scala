package typings.mdns

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import org.scalablytyped.runtime.Instantiable4
import typings.mdns.anon.Flags
import typings.mdns.anon.Name
import typings.mdns.mdnsStrings.serviceDown
import typings.mdns.mdnsStrings.serviceUp
import typings.node.Buffer
import typings.node.eventsMod.global.NodeJS.EventEmitter
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("mdns", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @js.native
  trait Advertisement
    extends StObject
       with EventEmitter {
    
    def start(): Unit = js.native
    
    def stop(): Unit = js.native
  }
  // --- Statics & Classes ---
  @JSImport("mdns", "Advertisement")
  @js.native
  def Advertisement: AdvertisementCreatable = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("mdns", "Advertisement")
  @js.native
  class AdvertisementCls protected ()
    extends StObject
       with Advertisement {
    def this(serviceType: ServiceType, port: Double) = this()
    def this(serviceType: ServiceType, port: Double, options: AdvertisementOptions) = this()
    def this(
      serviceType: ServiceType,
      port: Double,
      options: Unit,
      callback: js.Function2[/* error */ DnsSdError, /* service */ Service, Unit]
    ) = this()
    def this(
      serviceType: ServiceType,
      port: Double,
      options: AdvertisementOptions,
      callback: js.Function2[/* error */ DnsSdError, /* service */ Service, Unit]
    ) = this()
  }
  
  @scala.inline
  def Advertisement_=(x: AdvertisementCreatable): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Advertisement")(x.asInstanceOf[js.Any])
  
  @js.native
  trait Browser
    extends StObject
       with EventEmitter {
    
    def on(event: String, listener: js.Function): this.type = js.native
    @JSName("on")
    def on_serviceDown(event: serviceDown, listener: js.Function1[/* info */ Service, Unit]): this.type = js.native
    @JSName("on")
    def on_serviceUp(event: serviceUp, listener: js.Function1[/* info */ Service, Unit]): this.type = js.native
    
    def start(): js.Any = js.native
    
    def stop(): js.Any = js.native
  }
  @JSImport("mdns", "Browser")
  @js.native
  def Browser: BrowserStatic = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("mdns", "Browser")
  @js.native
  class BrowserCls protected ()
    extends StObject
       with Browser {
    def this(serviceType: ServiceType) = this()
    def this(serviceType: ServiceType, options: BrowserOptions) = this()
  }
  
  @scala.inline
  def Browser_=(x: BrowserStatic): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Browser")(x.asInstanceOf[js.Any])
  
  @js.native
  trait ServiceType
    extends StObject
       with Instantiable1[
          (/* serviceTypeIdentifier */ js.Array[String]) | (/* serviceTypeIdentifier */ Name) | (/* serviceType */ ServiceType) | (/* serviceTypeIdentifier */ String), 
          ServiceType
        ]
       with Instantiable3[
          /* name */ String, 
          /* protocol */ String, 
          /* subtypes (repeated) */ String, 
          ServiceType
        ] {
    
    def fromArray(serviceTypeIdentifier: js.Array[String]): ServiceType = js.native
    
    def fromJSON(serviceTypeIdentifier: Name): ServiceType = js.native
    def fromJSON(serviceType: ServiceType): ServiceType = js.native
    
    def fromString(serviceTypeIdentifier: String): ServiceType = js.native
    
    var fullyQualified: Boolean = js.native
    
    var name: String = js.native
    
    var protocol: String = js.native
    
    var subtypes: js.Array[String] = js.native
    
    def toArray(): js.Array[String] = js.native
  }
  @JSImport("mdns", "ServiceType")
  @js.native
  def ServiceType: ServiceType = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("mdns", "ServiceType")
  @js.native
  class ServiceTypeCls protected ()
    extends StObject
       with ServiceType {
    def this(serviceTypeIdentifier: String) = this()
    def this(serviceTypeIdentifier: js.Array[String]) = this()
    def this(serviceTypeIdentifier: Name) = this()
    def this(serviceType: ServiceType) = this()
    def this(name: String, protocol: String, subtypes: String*) = this()
  }
  
  @scala.inline
  def ServiceType_=(x: ServiceType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ServiceType")(x.asInstanceOf[js.Any])
  
  // -------------------- -------------------- -------------------- -------------------- -------------------- -------------------- -------------------- -------------------- --------------------
  //Constants from dns_sd.h (C-Code of Bonjour -> see https://developer.apple.com/library/mac/documentation/Networking/Reference/DNSServiceDiscovery_CRef/Reference/reference.html)
  @JSImport("mdns", "_DNS_SD_H")
  @js.native
  def _DNS_SD_H: Double = js.native
  @scala.inline
  def _DNS_SD_H_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_DNS_SD_H")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def browseThemAll(options: BrowserOptions): Browser = ^.asInstanceOf[js.Dynamic].applyDynamic("browseThemAll")(options.asInstanceOf[js.Any]).asInstanceOf[Browser]
  
  @scala.inline
  def createAdvertisement(serviceType: ServiceType, port: Double): Advertisement = (^.asInstanceOf[js.Dynamic].applyDynamic("createAdvertisement")(serviceType.asInstanceOf[js.Any], port.asInstanceOf[js.Any])).asInstanceOf[Advertisement]
  @scala.inline
  def createAdvertisement(
    serviceType: ServiceType,
    port: Double,
    options: Unit,
    callback: js.Function2[/* error */ DnsSdError, /* service */ Service, Unit]
  ): Advertisement = (^.asInstanceOf[js.Dynamic].applyDynamic("createAdvertisement")(serviceType.asInstanceOf[js.Any], port.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Advertisement]
  @scala.inline
  def createAdvertisement(serviceType: ServiceType, port: Double, options: AdvertisementOptions): Advertisement = (^.asInstanceOf[js.Dynamic].applyDynamic("createAdvertisement")(serviceType.asInstanceOf[js.Any], port.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Advertisement]
  @scala.inline
  def createAdvertisement(
    serviceType: ServiceType,
    port: Double,
    options: AdvertisementOptions,
    callback: js.Function2[/* error */ DnsSdError, /* service */ Service, Unit]
  ): Advertisement = (^.asInstanceOf[js.Dynamic].applyDynamic("createAdvertisement")(serviceType.asInstanceOf[js.Any], port.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Advertisement]
  
  @scala.inline
  def createBrowser(serviceType: ServiceType): Browser = ^.asInstanceOf[js.Dynamic].applyDynamic("createBrowser")(serviceType.asInstanceOf[js.Any]).asInstanceOf[Browser]
  @scala.inline
  def createBrowser(serviceType: ServiceType, options: BrowserOptions): Browser = (^.asInstanceOf[js.Dynamic].applyDynamic("createBrowser")(serviceType.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Browser]
  
  @JSImport("mdns", "dns_sd")
  @js.native
  def dnsSd: js.Any = js.native
  
  @scala.inline
  def dnsSd_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dns_sd")(x.asInstanceOf[js.Any])
  
  // constants
  @JSImport("mdns", "isAvahi")
  @js.native
  def isAvahi: Boolean = js.native
  @scala.inline
  def isAvahi_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isAvahi")(x.asInstanceOf[js.Any])
  
  @JSImport("mdns", "kDNSServiceClass_IN")
  @js.native
  def kDNSServiceClassIN: Double = js.native
  
  @scala.inline
  def kDNSServiceClassIN_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("kDNSServiceClass_IN")(x.asInstanceOf[js.Any])
  
  @JSImport("mdns", "kDNSServiceErr_AlreadyRegistered")
  @js.native
  def kDNSServiceErrAlreadyRegistered: Double = js.native
  
  @scala.inline
  def kDNSServiceErrAlreadyRegistered_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("kDNSServiceErr_AlreadyRegistered")(x.asInstanceOf[js.Any])
  
  @JSImport("mdns", "kDNSServiceErr_BadFlags")
  @js.native
  def kDNSServiceErrBadFlags: Double = js.native
  
  @scala.inline
  def kDNSServiceErrBadFlags_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("kDNSServiceErr_BadFlags")(x.asInstanceOf[js.Any])
  
  @JSImport("mdns", "kDNSServiceErr_BadInterfaceIndex")
  @js.native
  def kDNSServiceErrBadInterfaceIndex: Double = js.native
  
  @scala.inline
  def kDNSServiceErrBadInterfaceIndex_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("kDNSServiceErr_BadInterfaceIndex")(x.asInstanceOf[js.Any])
  
  @JSImport("mdns", "kDNSServiceErr_BadKey")
  @js.native
  def kDNSServiceErrBadKey: Double = js.native
  
  @scala.inline
  def kDNSServiceErrBadKey_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("kDNSServiceErr_BadKey")(x.asInstanceOf[js.Any])
  
  @JSImport("mdns", "kDNSServiceErr_BadParam")
  @js.native
  def kDNSServiceErrBadParam: Double = js.native
  
  @scala.inline
  def kDNSServiceErrBadParam_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("kDNSServiceErr_BadParam")(x.asInstanceOf[js.Any])
  
  @JSImport("mdns", "kDNSServiceErr_BadReference")
  @js.native
  def kDNSServiceErrBadReference: Double = js.native
  
  @scala.inline
  def kDNSServiceErrBadReference_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("kDNSServiceErr_BadReference")(x.asInstanceOf[js.Any])
  
  @JSImport("mdns", "kDNSServiceErr_BadSig")
  @js.native
  def kDNSServiceErrBadSig: Double = js.native
  
  @scala.inline
  def kDNSServiceErrBadSig_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("kDNSServiceErr_BadSig")(x.asInstanceOf[js.Any])
  
  @JSImport("mdns", "kDNSServiceErr_BadState")
  @js.native
  def kDNSServiceErrBadState: Double = js.native
  
  @scala.inline
  def kDNSServiceErrBadState_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("kDNSServiceErr_BadState")(x.asInstanceOf[js.Any])
  
  @JSImport("mdns", "kDNSServiceErr_BadTime")
  @js.native
  def kDNSServiceErrBadTime: Double = js.native
  
  @scala.inline
  def kDNSServiceErrBadTime_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("kDNSServiceErr_BadTime")(x.asInstanceOf[js.Any])
  
  @JSImport("mdns", "kDNSServiceErr_DoubleNAT")
  @js.native
  def kDNSServiceErrDoubleNAT: Double = js.native
  
  @scala.inline
  def kDNSServiceErrDoubleNAT_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("kDNSServiceErr_DoubleNAT")(x.asInstanceOf[js.Any])
  
  @JSImport("mdns", "kDNSServiceErr_Firewall")
  @js.native
  def kDNSServiceErrFirewall: Double = js.native
  
  @scala.inline
  def kDNSServiceErrFirewall_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("kDNSServiceErr_Firewall")(x.asInstanceOf[js.Any])
  
  @JSImport("mdns", "kDNSServiceErr_Incompatible")
  @js.native
  def kDNSServiceErrIncompatible: Double = js.native
  
  @scala.inline
  def kDNSServiceErrIncompatible_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("kDNSServiceErr_Incompatible")(x.asInstanceOf[js.Any])
  
  @JSImport("mdns", "kDNSServiceErr_Invalid")
  @js.native
  def kDNSServiceErrInvalid: Double = js.native
  
  @scala.inline
  def kDNSServiceErrInvalid_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("kDNSServiceErr_Invalid")(x.asInstanceOf[js.Any])
  
  @JSImport("mdns", "kDNSServiceErr_NATPortMappingDisabled")
  @js.native
  def kDNSServiceErrNATPortMappingDisabled: Double = js.native
  
  @scala.inline
  def kDNSServiceErrNATPortMappingDisabled_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("kDNSServiceErr_NATPortMappingDisabled")(x.asInstanceOf[js.Any])
  
  @JSImport("mdns", "kDNSServiceErr_NATPortMappingUnsupported")
  @js.native
  def kDNSServiceErrNATPortMappingUnsupported: Double = js.native
  
  @scala.inline
  def kDNSServiceErrNATPortMappingUnsupported_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("kDNSServiceErr_NATPortMappingUnsupported")(x.asInstanceOf[js.Any])
  
  @JSImport("mdns", "kDNSServiceErr_NATTraversal")
  @js.native
  def kDNSServiceErrNATTraversal: Double = js.native
  
  @scala.inline
  def kDNSServiceErrNATTraversal_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("kDNSServiceErr_NATTraversal")(x.asInstanceOf[js.Any])
  
  @JSImport("mdns", "kDNSServiceErr_NameConflict")
  @js.native
  def kDNSServiceErrNameConflict: Double = js.native
  
  @scala.inline
  def kDNSServiceErrNameConflict_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("kDNSServiceErr_NameConflict")(x.asInstanceOf[js.Any])
  
  @JSImport("mdns", "kDNSServiceErr_NoAuth")
  @js.native
  def kDNSServiceErrNoAuth: Double = js.native
  
  @scala.inline
  def kDNSServiceErrNoAuth_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("kDNSServiceErr_NoAuth")(x.asInstanceOf[js.Any])
  
  @JSImport("mdns", "kDNSServiceErr_NoError")
  @js.native
  def kDNSServiceErrNoError: Double = js.native
  
  @scala.inline
  def kDNSServiceErrNoError_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("kDNSServiceErr_NoError")(x.asInstanceOf[js.Any])
  
  @JSImport("mdns", "kDNSServiceErr_NoMemory")
  @js.native
  def kDNSServiceErrNoMemory: Double = js.native
  
  @scala.inline
  def kDNSServiceErrNoMemory_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("kDNSServiceErr_NoMemory")(x.asInstanceOf[js.Any])
  
  @JSImport("mdns", "kDNSServiceErr_NoRouter")
  @js.native
  def kDNSServiceErrNoRouter: Double = js.native
  
  @scala.inline
  def kDNSServiceErrNoRouter_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("kDNSServiceErr_NoRouter")(x.asInstanceOf[js.Any])
  
  @JSImport("mdns", "kDNSServiceErr_NoSuchKey")
  @js.native
  def kDNSServiceErrNoSuchKey: Double = js.native
  
  @scala.inline
  def kDNSServiceErrNoSuchKey_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("kDNSServiceErr_NoSuchKey")(x.asInstanceOf[js.Any])
  
  @JSImport("mdns", "kDNSServiceErr_NoSuchName")
  @js.native
  def kDNSServiceErrNoSuchName: Double = js.native
  
  @scala.inline
  def kDNSServiceErrNoSuchName_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("kDNSServiceErr_NoSuchName")(x.asInstanceOf[js.Any])
  
  @JSImport("mdns", "kDNSServiceErr_NoSuchRecord")
  @js.native
  def kDNSServiceErrNoSuchRecord: Double = js.native
  
  @scala.inline
  def kDNSServiceErrNoSuchRecord_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("kDNSServiceErr_NoSuchRecord")(x.asInstanceOf[js.Any])
  
  @JSImport("mdns", "kDNSServiceErr_NotInitialized")
  @js.native
  def kDNSServiceErrNotInitialized: Double = js.native
  
  @scala.inline
  def kDNSServiceErrNotInitialized_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("kDNSServiceErr_NotInitialized")(x.asInstanceOf[js.Any])
  
  @JSImport("mdns", "kDNSServiceErr_PollingMode")
  @js.native
  def kDNSServiceErrPollingMode: Double = js.native
  
  @scala.inline
  def kDNSServiceErrPollingMode_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("kDNSServiceErr_PollingMode")(x.asInstanceOf[js.Any])
  
  @JSImport("mdns", "kDNSServiceErr_Refused")
  @js.native
  def kDNSServiceErrRefused: Double = js.native
  
  @scala.inline
  def kDNSServiceErrRefused_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("kDNSServiceErr_Refused")(x.asInstanceOf[js.Any])
  
  @JSImport("mdns", "kDNSServiceErr_ServiceNotRunning")
  @js.native
  def kDNSServiceErrServiceNotRunning: Double = js.native
  
  @scala.inline
  def kDNSServiceErrServiceNotRunning_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("kDNSServiceErr_ServiceNotRunning")(x.asInstanceOf[js.Any])
  
  @JSImport("mdns", "kDNSServiceErr_Timeout")
  @js.native
  def kDNSServiceErrTimeout: Double = js.native
  
  @scala.inline
  def kDNSServiceErrTimeout_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("kDNSServiceErr_Timeout")(x.asInstanceOf[js.Any])
  
  @JSImport("mdns", "kDNSServiceErr_Transient")
  @js.native
  def kDNSServiceErrTransient: Double = js.native
  
  @scala.inline
  def kDNSServiceErrTransient_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("kDNSServiceErr_Transient")(x.asInstanceOf[js.Any])
  
  @JSImport("mdns", "kDNSServiceErr_Unknown")
  @js.native
  def kDNSServiceErrUnknown: Double = js.native
  
  @scala.inline
  def kDNSServiceErrUnknown_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("kDNSServiceErr_Unknown")(x.asInstanceOf[js.Any])
  
  @JSImport("mdns", "kDNSServiceErr_Unsupported")
  @js.native
  def kDNSServiceErrUnsupported: Double = js.native
  
  @scala.inline
  def kDNSServiceErrUnsupported_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("kDNSServiceErr_Unsupported")(x.asInstanceOf[js.Any])
  
  @JSImport("mdns", "kDNSServiceFlagsAdd")
  @js.native
  def kDNSServiceFlagsAdd: Double = js.native
  @scala.inline
  def kDNSServiceFlagsAdd_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("kDNSServiceFlagsAdd")(x.asInstanceOf[js.Any])
  
  @JSImport("mdns", "kDNSServiceFlagsAllowRemoteQuery")
  @js.native
  def kDNSServiceFlagsAllowRemoteQuery: Double = js.native
  @scala.inline
  def kDNSServiceFlagsAllowRemoteQuery_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("kDNSServiceFlagsAllowRemoteQuery")(x.asInstanceOf[js.Any])
  
  @JSImport("mdns", "kDNSServiceFlagsBackgroundTrafficClass")
  @js.native
  def kDNSServiceFlagsBackgroundTrafficClass: Double = js.native
  @scala.inline
  def kDNSServiceFlagsBackgroundTrafficClass_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("kDNSServiceFlagsBackgroundTrafficClass")(x.asInstanceOf[js.Any])
  
  @JSImport("mdns", "kDNSServiceFlagsBogus")
  @js.native
  def kDNSServiceFlagsBogus: Double = js.native
  @scala.inline
  def kDNSServiceFlagsBogus_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("kDNSServiceFlagsBogus")(x.asInstanceOf[js.Any])
  
  @JSImport("mdns", "kDNSServiceFlagsBrowseDomains")
  @js.native
  def kDNSServiceFlagsBrowseDomains: Double = js.native
  @scala.inline
  def kDNSServiceFlagsBrowseDomains_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("kDNSServiceFlagsBrowseDomains")(x.asInstanceOf[js.Any])
  
  @JSImport("mdns", "kDNSServiceFlagsDefault")
  @js.native
  def kDNSServiceFlagsDefault: Double = js.native
  @scala.inline
  def kDNSServiceFlagsDefault_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("kDNSServiceFlagsDefault")(x.asInstanceOf[js.Any])
  
  @JSImport("mdns", "kDNSServiceFlagsForceMulticast")
  @js.native
  def kDNSServiceFlagsForceMulticast: Double = js.native
  @scala.inline
  def kDNSServiceFlagsForceMulticast_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("kDNSServiceFlagsForceMulticast")(x.asInstanceOf[js.Any])
  
  @JSImport("mdns", "kDNSServiceFlagsIncludeAWDL")
  @js.native
  def kDNSServiceFlagsIncludeAWDL: Double = js.native
  @scala.inline
  def kDNSServiceFlagsIncludeAWDL_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("kDNSServiceFlagsIncludeAWDL")(x.asInstanceOf[js.Any])
  
  @JSImport("mdns", "kDNSServiceFlagsIndeterminate")
  @js.native
  def kDNSServiceFlagsIndeterminate: Double = js.native
  @scala.inline
  def kDNSServiceFlagsIndeterminate_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("kDNSServiceFlagsIndeterminate")(x.asInstanceOf[js.Any])
  
  @JSImport("mdns", "kDNSServiceFlagsInsecure")
  @js.native
  def kDNSServiceFlagsInsecure: Double = js.native
  @scala.inline
  def kDNSServiceFlagsInsecure_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("kDNSServiceFlagsInsecure")(x.asInstanceOf[js.Any])
  
  @JSImport("mdns", "kDNSServiceFlagsKnownUnique")
  @js.native
  def kDNSServiceFlagsKnownUnique: Double = js.native
  @scala.inline
  def kDNSServiceFlagsKnownUnique_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("kDNSServiceFlagsKnownUnique")(x.asInstanceOf[js.Any])
  
  @JSImport("mdns", "kDNSServiceFlagsLongLivedQuery")
  @js.native
  def kDNSServiceFlagsLongLivedQuery: Double = js.native
  @scala.inline
  def kDNSServiceFlagsLongLivedQuery_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("kDNSServiceFlagsLongLivedQuery")(x.asInstanceOf[js.Any])
  
  @JSImport("mdns", "kDNSServiceFlagsMoreComing")
  @js.native
  def kDNSServiceFlagsMoreComing: Double = js.native
  @scala.inline
  def kDNSServiceFlagsMoreComing_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("kDNSServiceFlagsMoreComing")(x.asInstanceOf[js.Any])
  
  @JSImport("mdns", "kDNSServiceFlagsNoAutoRename")
  @js.native
  def kDNSServiceFlagsNoAutoRename: Double = js.native
  @scala.inline
  def kDNSServiceFlagsNoAutoRename_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("kDNSServiceFlagsNoAutoRename")(x.asInstanceOf[js.Any])
  
  @JSImport("mdns", "kDNSServiceFlagsNonBrowsable")
  @js.native
  def kDNSServiceFlagsNonBrowsable: Double = js.native
  @scala.inline
  def kDNSServiceFlagsNonBrowsable_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("kDNSServiceFlagsNonBrowsable")(x.asInstanceOf[js.Any])
  
  @JSImport("mdns", "kDNSServiceFlagsRegistrationDomains")
  @js.native
  def kDNSServiceFlagsRegistrationDomains: Double = js.native
  @scala.inline
  def kDNSServiceFlagsRegistrationDomains_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("kDNSServiceFlagsRegistrationDomains")(x.asInstanceOf[js.Any])
  
  @JSImport("mdns", "kDNSServiceFlagsReturnIntermediates")
  @js.native
  def kDNSServiceFlagsReturnIntermediates: Double = js.native
  @scala.inline
  def kDNSServiceFlagsReturnIntermediates_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("kDNSServiceFlagsReturnIntermediates")(x.asInstanceOf[js.Any])
  
  @JSImport("mdns", "kDNSServiceFlagsSecure")
  @js.native
  def kDNSServiceFlagsSecure: Double = js.native
  @scala.inline
  def kDNSServiceFlagsSecure_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("kDNSServiceFlagsSecure")(x.asInstanceOf[js.Any])
  
  @JSImport("mdns", "kDNSServiceFlagsShareConnection")
  @js.native
  def kDNSServiceFlagsShareConnection: Double = js.native
  @scala.inline
  def kDNSServiceFlagsShareConnection_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("kDNSServiceFlagsShareConnection")(x.asInstanceOf[js.Any])
  
  @JSImport("mdns", "kDNSServiceFlagsShared")
  @js.native
  def kDNSServiceFlagsShared: Double = js.native
  @scala.inline
  def kDNSServiceFlagsShared_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("kDNSServiceFlagsShared")(x.asInstanceOf[js.Any])
  
  @JSImport("mdns", "kDNSServiceFlagsSuppressUnusable")
  @js.native
  def kDNSServiceFlagsSuppressUnusable: Double = js.native
  @scala.inline
  def kDNSServiceFlagsSuppressUnusable_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("kDNSServiceFlagsSuppressUnusable")(x.asInstanceOf[js.Any])
  
  @JSImport("mdns", "kDNSServiceFlagsUnicastResponse")
  @js.native
  def kDNSServiceFlagsUnicastResponse: Double = js.native
  @scala.inline
  def kDNSServiceFlagsUnicastResponse_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("kDNSServiceFlagsUnicastResponse")(x.asInstanceOf[js.Any])
  
  @JSImport("mdns", "kDNSServiceFlagsUnique")
  @js.native
  def kDNSServiceFlagsUnique: Double = js.native
  @scala.inline
  def kDNSServiceFlagsUnique_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("kDNSServiceFlagsUnique")(x.asInstanceOf[js.Any])
  
  @JSImport("mdns", "kDNSServiceFlagsValidate")
  @js.native
  def kDNSServiceFlagsValidate: Double = js.native
  
  @JSImport("mdns", "kDNSServiceFlagsValidateOptional")
  @js.native
  def kDNSServiceFlagsValidateOptional: Double = js.native
  @scala.inline
  def kDNSServiceFlagsValidateOptional_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("kDNSServiceFlagsValidateOptional")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def kDNSServiceFlagsValidate_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("kDNSServiceFlagsValidate")(x.asInstanceOf[js.Any])
  
  @JSImport("mdns", "kDNSServiceFlagsWakeOnResolve")
  @js.native
  def kDNSServiceFlagsWakeOnResolve: Double = js.native
  @scala.inline
  def kDNSServiceFlagsWakeOnResolve_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("kDNSServiceFlagsWakeOnResolve")(x.asInstanceOf[js.Any])
  
  @JSImport("mdns", "kDNSServiceFlagsWakeOnlyService")
  @js.native
  def kDNSServiceFlagsWakeOnlyService: Double = js.native
  @scala.inline
  def kDNSServiceFlagsWakeOnlyService_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("kDNSServiceFlagsWakeOnlyService")(x.asInstanceOf[js.Any])
  
  @JSImport("mdns", "kDNSServiceMaxDomainName")
  @js.native
  def kDNSServiceMaxDomainName: String = js.native
  @scala.inline
  def kDNSServiceMaxDomainName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("kDNSServiceMaxDomainName")(x.asInstanceOf[js.Any])
  
  @JSImport("mdns", "kDNSServiceMaxServiceName")
  @js.native
  def kDNSServiceMaxServiceName: Double = js.native
  @scala.inline
  def kDNSServiceMaxServiceName_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("kDNSServiceMaxServiceName")(x.asInstanceOf[js.Any])
  
  @JSImport("mdns", "kDNSServiceOutputFlags")
  @js.native
  def kDNSServiceOutputFlags: js.Any = js.native
  @scala.inline
  def kDNSServiceOutputFlags_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("kDNSServiceOutputFlags")(x.asInstanceOf[js.Any])
  
  @JSImport("mdns", "kDNSServiceProperty_DaemonVersion")
  @js.native
  def kDNSServicePropertyDaemonVersion: Double = js.native
  
  @scala.inline
  def kDNSServicePropertyDaemonVersion_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("kDNSServiceProperty_DaemonVersion")(x.asInstanceOf[js.Any])
  
  @JSImport("mdns", "kDNSServiceProtocol_IPv4")
  @js.native
  def kDNSServiceProtocolIPv4: Double = js.native
  
  @scala.inline
  def kDNSServiceProtocolIPv4_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("kDNSServiceProtocol_IPv4")(x.asInstanceOf[js.Any])
  
  @JSImport("mdns", "kDNSServiceProtocol_IPv6")
  @js.native
  def kDNSServiceProtocolIPv6: Double = js.native
  
  @scala.inline
  def kDNSServiceProtocolIPv6_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("kDNSServiceProtocol_IPv6")(x.asInstanceOf[js.Any])
  
  @JSImport("mdns", "kDNSServiceProtocol_TCP")
  @js.native
  def kDNSServiceProtocolTCP: Double = js.native
  
  @scala.inline
  def kDNSServiceProtocolTCP_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("kDNSServiceProtocol_TCP")(x.asInstanceOf[js.Any])
  
  @JSImport("mdns", "kDNSServiceProtocol_UDP")
  @js.native
  def kDNSServiceProtocolUDP: Double = js.native
  
  @scala.inline
  def kDNSServiceProtocolUDP_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("kDNSServiceProtocol_UDP")(x.asInstanceOf[js.Any])
  
  @JSImport("mdns", "kDNSServiceType_A")
  @js.native
  def kDNSServiceTypeA: Double = js.native
  
  @JSImport("mdns", "kDNSServiceType_A6")
  @js.native
  def kDNSServiceTypeA6: Double = js.native
  
  @scala.inline
  def kDNSServiceTypeA6_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("kDNSServiceType_A6")(x.asInstanceOf[js.Any])
  
  @JSImport("mdns", "kDNSServiceType_AAAA")
  @js.native
  def kDNSServiceTypeAAAA: Double = js.native
  
  @scala.inline
  def kDNSServiceTypeAAAA_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("kDNSServiceType_AAAA")(x.asInstanceOf[js.Any])
  
  @JSImport("mdns", "kDNSServiceType_AFSDB")
  @js.native
  def kDNSServiceTypeAFSDB: Double = js.native
  
  @scala.inline
  def kDNSServiceTypeAFSDB_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("kDNSServiceType_AFSDB")(x.asInstanceOf[js.Any])
  
  @JSImport("mdns", "kDNSServiceType_ANY")
  @js.native
  def kDNSServiceTypeANY: Double = js.native
  
  @scala.inline
  def kDNSServiceTypeANY_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("kDNSServiceType_ANY")(x.asInstanceOf[js.Any])
  
  @JSImport("mdns", "kDNSServiceType_APL")
  @js.native
  def kDNSServiceTypeAPL: Double = js.native
  
  @scala.inline
  def kDNSServiceTypeAPL_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("kDNSServiceType_APL")(x.asInstanceOf[js.Any])
  
  @JSImport("mdns", "kDNSServiceType_ATMA")
  @js.native
  def kDNSServiceTypeATMA: Double = js.native
  
  @scala.inline
  def kDNSServiceTypeATMA_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("kDNSServiceType_ATMA")(x.asInstanceOf[js.Any])
  
  @JSImport("mdns", "kDNSServiceType_AXFR")
  @js.native
  def kDNSServiceTypeAXFR: Double = js.native
  
  @scala.inline
  def kDNSServiceTypeAXFR_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("kDNSServiceType_AXFR")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def kDNSServiceTypeA_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("kDNSServiceType_A")(x.asInstanceOf[js.Any])
  
  @JSImport("mdns", "kDNSServiceType_CERT")
  @js.native
  def kDNSServiceTypeCERT: Double = js.native
  
  @scala.inline
  def kDNSServiceTypeCERT_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("kDNSServiceType_CERT")(x.asInstanceOf[js.Any])
  
  @JSImport("mdns", "kDNSServiceType_CNAME")
  @js.native
  def kDNSServiceTypeCNAME: Double = js.native
  
  @scala.inline
  def kDNSServiceTypeCNAME_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("kDNSServiceType_CNAME")(x.asInstanceOf[js.Any])
  
  @JSImport("mdns", "kDNSServiceType_DHCID")
  @js.native
  def kDNSServiceTypeDHCID: Double = js.native
  
  @scala.inline
  def kDNSServiceTypeDHCID_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("kDNSServiceType_DHCID")(x.asInstanceOf[js.Any])
  
  @JSImport("mdns", "kDNSServiceType_DNAME")
  @js.native
  def kDNSServiceTypeDNAME: Double = js.native
  
  @scala.inline
  def kDNSServiceTypeDNAME_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("kDNSServiceType_DNAME")(x.asInstanceOf[js.Any])
  
  @JSImport("mdns", "kDNSServiceType_DNSKEY")
  @js.native
  def kDNSServiceTypeDNSKEY: Double = js.native
  
  @scala.inline
  def kDNSServiceTypeDNSKEY_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("kDNSServiceType_DNSKEY")(x.asInstanceOf[js.Any])
  
  @JSImport("mdns", "kDNSServiceType_DS")
  @js.native
  def kDNSServiceTypeDS: Double = js.native
  
  @scala.inline
  def kDNSServiceTypeDS_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("kDNSServiceType_DS")(x.asInstanceOf[js.Any])
  
  @JSImport("mdns", "kDNSServiceType_EID")
  @js.native
  def kDNSServiceTypeEID: Double = js.native
  
  @scala.inline
  def kDNSServiceTypeEID_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("kDNSServiceType_EID")(x.asInstanceOf[js.Any])
  
  @JSImport("mdns", "kDNSServiceType_GID")
  @js.native
  def kDNSServiceTypeGID: Double = js.native
  
  @scala.inline
  def kDNSServiceTypeGID_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("kDNSServiceType_GID")(x.asInstanceOf[js.Any])
  
  @JSImport("mdns", "kDNSServiceType_GPOS")
  @js.native
  def kDNSServiceTypeGPOS: Double = js.native
  
  @scala.inline
  def kDNSServiceTypeGPOS_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("kDNSServiceType_GPOS")(x.asInstanceOf[js.Any])
  
  @JSImport("mdns", "kDNSServiceType_HINFO")
  @js.native
  def kDNSServiceTypeHINFO: Double = js.native
  
  @scala.inline
  def kDNSServiceTypeHINFO_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("kDNSServiceType_HINFO")(x.asInstanceOf[js.Any])
  
  @JSImport("mdns", "kDNSServiceType_HIP")
  @js.native
  def kDNSServiceTypeHIP: Double = js.native
  
  @scala.inline
  def kDNSServiceTypeHIP_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("kDNSServiceType_HIP")(x.asInstanceOf[js.Any])
  
  @JSImport("mdns", "kDNSServiceType_IPSECKEY")
  @js.native
  def kDNSServiceTypeIPSECKEY: Double = js.native
  
  @scala.inline
  def kDNSServiceTypeIPSECKEY_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("kDNSServiceType_IPSECKEY")(x.asInstanceOf[js.Any])
  
  @JSImport("mdns", "kDNSServiceType_ISDN")
  @js.native
  def kDNSServiceTypeISDN: Double = js.native
  
  @scala.inline
  def kDNSServiceTypeISDN_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("kDNSServiceType_ISDN")(x.asInstanceOf[js.Any])
  
  @JSImport("mdns", "kDNSServiceType_IXFR")
  @js.native
  def kDNSServiceTypeIXFR: Double = js.native
  
  @scala.inline
  def kDNSServiceTypeIXFR_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("kDNSServiceType_IXFR")(x.asInstanceOf[js.Any])
  
  @JSImport("mdns", "kDNSServiceType_KEY")
  @js.native
  def kDNSServiceTypeKEY: Double = js.native
  
  @scala.inline
  def kDNSServiceTypeKEY_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("kDNSServiceType_KEY")(x.asInstanceOf[js.Any])
  
  @JSImport("mdns", "kDNSServiceType_KX")
  @js.native
  def kDNSServiceTypeKX: Double = js.native
  
  @scala.inline
  def kDNSServiceTypeKX_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("kDNSServiceType_KX")(x.asInstanceOf[js.Any])
  
  @JSImport("mdns", "kDNSServiceType_LOC")
  @js.native
  def kDNSServiceTypeLOC: Double = js.native
  
  @scala.inline
  def kDNSServiceTypeLOC_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("kDNSServiceType_LOC")(x.asInstanceOf[js.Any])
  
  @JSImport("mdns", "kDNSServiceType_MAILA")
  @js.native
  def kDNSServiceTypeMAILA: Double = js.native
  
  @scala.inline
  def kDNSServiceTypeMAILA_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("kDNSServiceType_MAILA")(x.asInstanceOf[js.Any])
  
  @JSImport("mdns", "kDNSServiceType_MAILB")
  @js.native
  def kDNSServiceTypeMAILB: Double = js.native
  
  @scala.inline
  def kDNSServiceTypeMAILB_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("kDNSServiceType_MAILB")(x.asInstanceOf[js.Any])
  
  @JSImport("mdns", "kDNSServiceType_MB")
  @js.native
  def kDNSServiceTypeMB: Double = js.native
  
  @scala.inline
  def kDNSServiceTypeMB_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("kDNSServiceType_MB")(x.asInstanceOf[js.Any])
  
  @JSImport("mdns", "kDNSServiceType_MD")
  @js.native
  def kDNSServiceTypeMD: Double = js.native
  
  @scala.inline
  def kDNSServiceTypeMD_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("kDNSServiceType_MD")(x.asInstanceOf[js.Any])
  
  @JSImport("mdns", "kDNSServiceType_MF")
  @js.native
  def kDNSServiceTypeMF: Double = js.native
  
  @scala.inline
  def kDNSServiceTypeMF_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("kDNSServiceType_MF")(x.asInstanceOf[js.Any])
  
  @JSImport("mdns", "kDNSServiceType_MG")
  @js.native
  def kDNSServiceTypeMG: Double = js.native
  
  @scala.inline
  def kDNSServiceTypeMG_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("kDNSServiceType_MG")(x.asInstanceOf[js.Any])
  
  @JSImport("mdns", "kDNSServiceType_MINFO")
  @js.native
  def kDNSServiceTypeMINFO: Double = js.native
  
  @scala.inline
  def kDNSServiceTypeMINFO_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("kDNSServiceType_MINFO")(x.asInstanceOf[js.Any])
  
  @JSImport("mdns", "kDNSServiceType_MR")
  @js.native
  def kDNSServiceTypeMR: Double = js.native
  
  @scala.inline
  def kDNSServiceTypeMR_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("kDNSServiceType_MR")(x.asInstanceOf[js.Any])
  
  @JSImport("mdns", "kDNSServiceType_MX")
  @js.native
  def kDNSServiceTypeMX: Double = js.native
  
  @scala.inline
  def kDNSServiceTypeMX_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("kDNSServiceType_MX")(x.asInstanceOf[js.Any])
  
  @JSImport("mdns", "kDNSServiceType_NAPTR")
  @js.native
  def kDNSServiceTypeNAPTR: Double = js.native
  
  @scala.inline
  def kDNSServiceTypeNAPTR_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("kDNSServiceType_NAPTR")(x.asInstanceOf[js.Any])
  
  @JSImport("mdns", "kDNSServiceType_NIMLOC")
  @js.native
  def kDNSServiceTypeNIMLOC: Double = js.native
  
  @scala.inline
  def kDNSServiceTypeNIMLOC_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("kDNSServiceType_NIMLOC")(x.asInstanceOf[js.Any])
  
  @JSImport("mdns", "kDNSServiceType_NS")
  @js.native
  def kDNSServiceTypeNS: Double = js.native
  
  @JSImport("mdns", "kDNSServiceType_NSAP")
  @js.native
  def kDNSServiceTypeNSAP: Double = js.native
  
  @JSImport("mdns", "kDNSServiceType_NSAP_PTR")
  @js.native
  def kDNSServiceTypeNSAPPTR: Double = js.native
  
  @scala.inline
  def kDNSServiceTypeNSAPPTR_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("kDNSServiceType_NSAP_PTR")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def kDNSServiceTypeNSAP_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("kDNSServiceType_NSAP")(x.asInstanceOf[js.Any])
  
  @JSImport("mdns", "kDNSServiceType_NSEC")
  @js.native
  def kDNSServiceTypeNSEC: Double = js.native
  
  @JSImport("mdns", "kDNSServiceType_NSEC3")
  @js.native
  def kDNSServiceTypeNSEC3: Double = js.native
  
  @JSImport("mdns", "kDNSServiceType_NSEC3PARAM")
  @js.native
  def kDNSServiceTypeNSEC3PARAM: Double = js.native
  
  @scala.inline
  def kDNSServiceTypeNSEC3PARAM_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("kDNSServiceType_NSEC3PARAM")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def kDNSServiceTypeNSEC3_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("kDNSServiceType_NSEC3")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def kDNSServiceTypeNSEC_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("kDNSServiceType_NSEC")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def kDNSServiceTypeNS_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("kDNSServiceType_NS")(x.asInstanceOf[js.Any])
  
  @JSImport("mdns", "kDNSServiceType_NULL")
  @js.native
  def kDNSServiceTypeNULL: Double = js.native
  
  @scala.inline
  def kDNSServiceTypeNULL_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("kDNSServiceType_NULL")(x.asInstanceOf[js.Any])
  
  @JSImport("mdns", "kDNSServiceType_NXT")
  @js.native
  def kDNSServiceTypeNXT: Double = js.native
  
  @scala.inline
  def kDNSServiceTypeNXT_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("kDNSServiceType_NXT")(x.asInstanceOf[js.Any])
  
  @JSImport("mdns", "kDNSServiceType_OPT")
  @js.native
  def kDNSServiceTypeOPT: Double = js.native
  
  @scala.inline
  def kDNSServiceTypeOPT_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("kDNSServiceType_OPT")(x.asInstanceOf[js.Any])
  
  @JSImport("mdns", "kDNSServiceType_PTR")
  @js.native
  def kDNSServiceTypePTR: Double = js.native
  
  @scala.inline
  def kDNSServiceTypePTR_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("kDNSServiceType_PTR")(x.asInstanceOf[js.Any])
  
  @JSImport("mdns", "kDNSServiceType_PX")
  @js.native
  def kDNSServiceTypePX: Double = js.native
  
  @scala.inline
  def kDNSServiceTypePX_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("kDNSServiceType_PX")(x.asInstanceOf[js.Any])
  
  @JSImport("mdns", "kDNSServiceType_RP")
  @js.native
  def kDNSServiceTypeRP: Double = js.native
  
  @scala.inline
  def kDNSServiceTypeRP_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("kDNSServiceType_RP")(x.asInstanceOf[js.Any])
  
  @JSImport("mdns", "kDNSServiceType_RRSIG")
  @js.native
  def kDNSServiceTypeRRSIG: Double = js.native
  
  @scala.inline
  def kDNSServiceTypeRRSIG_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("kDNSServiceType_RRSIG")(x.asInstanceOf[js.Any])
  
  @JSImport("mdns", "kDNSServiceType_RT")
  @js.native
  def kDNSServiceTypeRT: Double = js.native
  
  @scala.inline
  def kDNSServiceTypeRT_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("kDNSServiceType_RT")(x.asInstanceOf[js.Any])
  
  @JSImport("mdns", "kDNSServiceType_SIG")
  @js.native
  def kDNSServiceTypeSIG: Double = js.native
  
  @scala.inline
  def kDNSServiceTypeSIG_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("kDNSServiceType_SIG")(x.asInstanceOf[js.Any])
  
  @JSImport("mdns", "kDNSServiceType_SINK")
  @js.native
  def kDNSServiceTypeSINK: Double = js.native
  
  @scala.inline
  def kDNSServiceTypeSINK_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("kDNSServiceType_SINK")(x.asInstanceOf[js.Any])
  
  @JSImport("mdns", "kDNSServiceType_SOA")
  @js.native
  def kDNSServiceTypeSOA: Double = js.native
  
  @scala.inline
  def kDNSServiceTypeSOA_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("kDNSServiceType_SOA")(x.asInstanceOf[js.Any])
  
  @JSImport("mdns", "kDNSServiceType_SPF")
  @js.native
  def kDNSServiceTypeSPF: Double = js.native
  
  @scala.inline
  def kDNSServiceTypeSPF_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("kDNSServiceType_SPF")(x.asInstanceOf[js.Any])
  
  @JSImport("mdns", "kDNSServiceType_SRV")
  @js.native
  def kDNSServiceTypeSRV: Double = js.native
  
  @scala.inline
  def kDNSServiceTypeSRV_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("kDNSServiceType_SRV")(x.asInstanceOf[js.Any])
  
  @JSImport("mdns", "kDNSServiceType_SSHFP")
  @js.native
  def kDNSServiceTypeSSHFP: Double = js.native
  
  @scala.inline
  def kDNSServiceTypeSSHFP_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("kDNSServiceType_SSHFP")(x.asInstanceOf[js.Any])
  
  @JSImport("mdns", "kDNSServiceType_TKEY")
  @js.native
  def kDNSServiceTypeTKEY: Double = js.native
  
  @scala.inline
  def kDNSServiceTypeTKEY_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("kDNSServiceType_TKEY")(x.asInstanceOf[js.Any])
  
  @JSImport("mdns", "kDNSServiceType_TSIG")
  @js.native
  def kDNSServiceTypeTSIG: Double = js.native
  
  @scala.inline
  def kDNSServiceTypeTSIG_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("kDNSServiceType_TSIG")(x.asInstanceOf[js.Any])
  
  @JSImport("mdns", "kDNSServiceType_TXT")
  @js.native
  def kDNSServiceTypeTXT: Double = js.native
  
  @scala.inline
  def kDNSServiceTypeTXT_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("kDNSServiceType_TXT")(x.asInstanceOf[js.Any])
  
  @JSImport("mdns", "kDNSServiceType_UID")
  @js.native
  def kDNSServiceTypeUID: Double = js.native
  
  @scala.inline
  def kDNSServiceTypeUID_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("kDNSServiceType_UID")(x.asInstanceOf[js.Any])
  
  @JSImport("mdns", "kDNSServiceType_UINFO")
  @js.native
  def kDNSServiceTypeUINFO: Double = js.native
  
  @scala.inline
  def kDNSServiceTypeUINFO_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("kDNSServiceType_UINFO")(x.asInstanceOf[js.Any])
  
  @JSImport("mdns", "kDNSServiceType_UNSPEC")
  @js.native
  def kDNSServiceTypeUNSPEC: Double = js.native
  
  @scala.inline
  def kDNSServiceTypeUNSPEC_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("kDNSServiceType_UNSPEC")(x.asInstanceOf[js.Any])
  
  @JSImport("mdns", "kDNSServiceType_WKS")
  @js.native
  def kDNSServiceTypeWKS: Double = js.native
  
  @scala.inline
  def kDNSServiceTypeWKS_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("kDNSServiceType_WKS")(x.asInstanceOf[js.Any])
  
  @JSImport("mdns", "kDNSServiceType_X25")
  @js.native
  def kDNSServiceTypeX25: Double = js.native
  
  @scala.inline
  def kDNSServiceTypeX25_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("kDNSServiceType_X25")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def loopbackInterface(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("loopbackInterface")().asInstanceOf[js.Any]
  
  @scala.inline
  def makeServiceType(name: String, protocol: String, subtypes: String*): ServiceType = (^.asInstanceOf[js.Dynamic].applyDynamic("makeServiceType")(name.asInstanceOf[js.Any], protocol.asInstanceOf[js.Any], subtypes.asInstanceOf[js.Any])).asInstanceOf[ServiceType]
  @scala.inline
  def makeServiceType(serviceTypeIdentifier: String): ServiceType = ^.asInstanceOf[js.Dynamic].applyDynamic("makeServiceType")(serviceTypeIdentifier.asInstanceOf[js.Any]).asInstanceOf[ServiceType]
  @scala.inline
  def makeServiceType(serviceTypeIdentifier: js.Array[String]): ServiceType = ^.asInstanceOf[js.Dynamic].applyDynamic("makeServiceType")(serviceTypeIdentifier.asInstanceOf[js.Any]).asInstanceOf[ServiceType]
  @scala.inline
  def makeServiceType(serviceTypeIdentifier: Name): ServiceType = ^.asInstanceOf[js.Dynamic].applyDynamic("makeServiceType")(serviceTypeIdentifier.asInstanceOf[js.Any]).asInstanceOf[ServiceType]
  @scala.inline
  def makeServiceType(serviceType: ServiceType): ServiceType = ^.asInstanceOf[js.Dynamic].applyDynamic("makeServiceType")(serviceType.asInstanceOf[js.Any]).asInstanceOf[ServiceType]
  
  @scala.inline
  def resolve(service: Service): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("resolve")(service.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def resolve(
    service: Service,
    sequence: js.Array[js.Function2[/* service */ Service, /* next */ js.Function0[Unit], Boolean]]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("resolve")(service.asInstanceOf[js.Any], sequence.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def resolve(
    service: Service,
    sequence: js.Array[js.Function2[/* service */ Service, /* next */ js.Function0[Unit], Boolean]],
    callback: js.Function2[/* error */ DnsSdError, /* service */ Service, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("resolve")(service.asInstanceOf[js.Any], sequence.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def resolve(
    service: Service,
    sequence: Unit,
    callback: js.Function2[/* error */ DnsSdError, /* service */ Service, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("resolve")(service.asInstanceOf[js.Any], sequence.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("mdns", "rst")
  @js.native
  def rst: DefaultResolverSequenceTasks = js.native
  @scala.inline
  def rst_=(x: DefaultResolverSequenceTasks): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rst")(x.asInstanceOf[js.Any])
  
  // static functions
  @scala.inline
  def tcp(name: String, subtypes: String*): ServiceType = (^.asInstanceOf[js.Dynamic].applyDynamic("tcp")(name.asInstanceOf[js.Any], subtypes.asInstanceOf[js.Any])).asInstanceOf[ServiceType]
  
  @scala.inline
  def udp(name: String, subtypes: String*): ServiceType = (^.asInstanceOf[js.Dynamic].applyDynamic("udp")(name.asInstanceOf[js.Any], subtypes.asInstanceOf[js.Any])).asInstanceOf[ServiceType]
  
  @js.native
  trait AdvertisementCreatable
    extends StObject
       with Instantiable2[/* serviceType */ ServiceType, /* port */ Double, Advertisement]
       with Instantiable3[
          /* serviceType */ ServiceType, 
          /* port */ Double, 
          /* options */ AdvertisementOptions, 
          Advertisement
        ]
       with Instantiable4[
          /* serviceType */ ServiceType, 
          /* port */ Double, 
          (/* options */ AdvertisementOptions) | (/* options */ Unit), 
          /* callback */ js.Function2[/* error */ DnsSdError, /* service */ Service, Unit], 
          Advertisement
        ]
  
  // --- Ads ---
  trait AdvertisementOptions extends StObject {
    
    var context: js.UndefOr[js.Any] = js.undefined
    
    var domain: js.UndefOr[js.Any] = js.undefined
    
    var flags: js.UndefOr[js.Any] = js.undefined
    
    var host: js.UndefOr[js.Any] = js.undefined
    
    var interfaceIndex: js.UndefOr[Double] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
    
    var networkInterface: js.UndefOr[String] = js.undefined
    
    var txtRecord: js.UndefOr[js.Any] = js.undefined
  }
  object AdvertisementOptions {
    
    @scala.inline
    def apply(): AdvertisementOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AdvertisementOptions]
    }
    
    @scala.inline
    implicit class AdvertisementOptionsMutableBuilder[Self <: AdvertisementOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContext(value: js.Any): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
      
      @scala.inline
      def setDomain(value: js.Any): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDomainUndefined: Self = StObject.set(x, "domain", js.undefined)
      
      @scala.inline
      def setFlags(value: js.Any): Self = StObject.set(x, "flags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFlagsUndefined: Self = StObject.set(x, "flags", js.undefined)
      
      @scala.inline
      def setHost(value: js.Any): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
      
      @scala.inline
      def setInterfaceIndex(value: Double): Self = StObject.set(x, "interfaceIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInterfaceIndexUndefined: Self = StObject.set(x, "interfaceIndex", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setNetworkInterface(value: String): Self = StObject.set(x, "networkInterface", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNetworkInterfaceUndefined: Self = StObject.set(x, "networkInterface", js.undefined)
      
      @scala.inline
      def setTxtRecord(value: js.Any): Self = StObject.set(x, "txtRecord", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTxtRecordUndefined: Self = StObject.set(x, "txtRecord", js.undefined)
    }
  }
  
  // --- Browser ---
  trait BrowserOptions extends StObject {
    
    var context: js.UndefOr[js.Any] = js.undefined
    
    var domain: js.UndefOr[js.Any] = js.undefined
    
    var flags: js.UndefOr[js.Any] = js.undefined
    
    var interfaceIndex: js.UndefOr[Double] = js.undefined
    
    var networkInterface: js.UndefOr[String] = js.undefined
    
    var resolverSequence: js.UndefOr[
        js.Array[js.Function2[/* service */ Service, /* next */ js.Function0[Unit], Boolean]]
      ] = js.undefined
  }
  object BrowserOptions {
    
    @scala.inline
    def apply(): BrowserOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BrowserOptions]
    }
    
    @scala.inline
    implicit class BrowserOptionsMutableBuilder[Self <: BrowserOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContext(value: js.Any): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
      
      @scala.inline
      def setDomain(value: js.Any): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDomainUndefined: Self = StObject.set(x, "domain", js.undefined)
      
      @scala.inline
      def setFlags(value: js.Any): Self = StObject.set(x, "flags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFlagsUndefined: Self = StObject.set(x, "flags", js.undefined)
      
      @scala.inline
      def setInterfaceIndex(value: Double): Self = StObject.set(x, "interfaceIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInterfaceIndexUndefined: Self = StObject.set(x, "interfaceIndex", js.undefined)
      
      @scala.inline
      def setNetworkInterface(value: String): Self = StObject.set(x, "networkInterface", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNetworkInterfaceUndefined: Self = StObject.set(x, "networkInterface", js.undefined)
      
      @scala.inline
      def setResolverSequence(value: js.Array[js.Function2[/* service */ Service, /* next */ js.Function0[Unit], Boolean]]): Self = StObject.set(x, "resolverSequence", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResolverSequenceUndefined: Self = StObject.set(x, "resolverSequence", js.undefined)
      
      @scala.inline
      def setResolverSequenceVarargs(value: (js.Function2[/* service */ Service, /* next */ js.Function0[Unit], Boolean])*): Self = StObject.set(x, "resolverSequence", js.Array(value :_*))
    }
  }
  
  @js.native
  trait BrowserStatic
    extends StObject
       with Instantiable1[/* serviceType */ ServiceType, Browser]
       with Instantiable2[/* serviceType */ ServiceType, /* options */ BrowserOptions, Browser] {
    
    var defaultResolverSequence: js.Array[js.Function2[/* service */ Service, /* next */ js.Function0[Unit], Boolean]] = js.native
  }
  
  @js.native
  trait DefaultResolverSequenceTasks
    extends StObject
       with MDNSResolverSequenceTasks {
    
    def DNSServiceGetAddrInfo(): js.Function2[/* service */ Service, /* next */ js.Function0[Unit], Boolean] = js.native
    def DNSServiceGetAddrInfo(options: js.Any): js.Function2[/* service */ Service, /* next */ js.Function0[Unit], Boolean] = js.native
    
    def DNSServiceResolve(): js.Function2[/* service */ Service, /* next */ js.Function0[Unit], Boolean] = js.native
    def DNSServiceResolve(options: Flags): js.Function2[/* service */ Service, /* next */ js.Function0[Unit], Boolean] = js.native
    
    def filterAddresses(
      fn: js.Function3[
          /* address */ String, 
          /* index */ js.UndefOr[Double], 
          /* addresses */ js.UndefOr[js.Array[String]], 
          Boolean
        ]
    ): Unit = js.native
    
    def getaddrinfo(): js.Function2[/* service */ Service, /* next */ js.Function0[Unit], Boolean] = js.native
    def getaddrinfo(options: js.Any): js.Function2[/* service */ Service, /* next */ js.Function0[Unit], Boolean] = js.native
    
    def logService(): Unit = js.native
    
    def makeAddressesUnique(): js.Function2[/* service */ Service, /* next */ js.Function0[Unit], Boolean] = js.native
  }
  
  // --- Error ---
  trait DnsSdError
    extends StObject
       with Error {
    
    var errorCode: js.UndefOr[Double] = js.undefined
  }
  object DnsSdError {
    
    @scala.inline
    def apply(message: String, name: String): DnsSdError = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[DnsSdError]
    }
    
    @scala.inline
    implicit class DnsSdErrorMutableBuilder[Self <: DnsSdError] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setErrorCode(value: Double): Self = StObject.set(x, "errorCode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorCodeUndefined: Self = StObject.set(x, "errorCode", js.undefined)
    }
  }
  
  // interface for extending with custom resolvers
  trait MDNSResolverSequenceTasks extends StObject
  
  // --- Services ---
  trait Service extends StObject {
    
    var addresses: js.Array[String]
    
    var flags: Double
    
    var fullname: String
    
    var host: String
    
    var interfaceIndex: Double
    
    var name: js.UndefOr[String] = js.undefined
    
    var networkInterface: String
    
    var port: Double
    
    var rawTxtRecord: js.UndefOr[Buffer] = js.undefined
    
    var replyDomain: String
    
    var txtRecord: js.UndefOr[js.Any] = js.undefined
    
    var `type`: ServiceType
  }
  object Service {
    
    @scala.inline
    def apply(
      addresses: js.Array[String],
      flags: Double,
      fullname: String,
      host: String,
      interfaceIndex: Double,
      networkInterface: String,
      port: Double,
      replyDomain: String,
      `type`: ServiceType
    ): Service = {
      val __obj = js.Dynamic.literal(addresses = addresses.asInstanceOf[js.Any], flags = flags.asInstanceOf[js.Any], fullname = fullname.asInstanceOf[js.Any], host = host.asInstanceOf[js.Any], interfaceIndex = interfaceIndex.asInstanceOf[js.Any], networkInterface = networkInterface.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any], replyDomain = replyDomain.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Service]
    }
    
    @scala.inline
    implicit class ServiceMutableBuilder[Self <: Service] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddresses(value: js.Array[String]): Self = StObject.set(x, "addresses", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAddressesVarargs(value: String*): Self = StObject.set(x, "addresses", js.Array(value :_*))
      
      @scala.inline
      def setFlags(value: Double): Self = StObject.set(x, "flags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFullname(value: String): Self = StObject.set(x, "fullname", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInterfaceIndex(value: Double): Self = StObject.set(x, "interfaceIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setNetworkInterface(value: String): Self = StObject.set(x, "networkInterface", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRawTxtRecord(value: Buffer): Self = StObject.set(x, "rawTxtRecord", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRawTxtRecordUndefined: Self = StObject.set(x, "rawTxtRecord", js.undefined)
      
      @scala.inline
      def setReplyDomain(value: String): Self = StObject.set(x, "replyDomain", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTxtRecord(value: js.Any): Self = StObject.set(x, "txtRecord", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTxtRecordUndefined: Self = StObject.set(x, "txtRecord", js.undefined)
      
      @scala.inline
      def setType(value: ServiceType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
