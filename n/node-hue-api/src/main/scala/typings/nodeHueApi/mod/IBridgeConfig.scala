package typings.nodeHueApi.mod

import org.scalablytyped.runtime.StringDictionary
import typings.nodeHueApi.anon.Checkforupdate
import typings.nodeHueApi.anon.Communication
import typings.nodeHueApi.anon.Createdate
import typings.nodeHueApi.anon.Errorcode
import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IBridgeConfig extends StObject {
  
  var UTC: Date = js.native
  
  var apiversion: String = js.native
  
  var backup: Errorcode = js.native
  
  var bridgeid: String = js.native
  
  var dhcp: Boolean = js.native
  
  var factorynew: Boolean = js.native
  
  var gateway: String = js.native
  
  var ipaddress: String = js.native
  
  var linkbutton: Boolean = js.native
  
  var localtime: Date = js.native
  
  var mac: String = js.native
  
  var modelid: String = js.native
  
  var name: String = js.native
  
  var netmask: String = js.native
  
  var portalconnection: String = js.native
  
  var portalservices: Boolean = js.native
  
  var portalstate: Communication = js.native
  
  var proxyaddress: String = js.native
  
  var proxyport: Double = js.native
  
  var replacesbridgeid: js.UndefOr[String] = js.native
  
  var swupdate: Checkforupdate = js.native
  
  var swversion: String = js.native
  
  var timezone: String = js.native
  
  var whitelist: StringDictionary[Createdate] = js.native
  
  var zigbeechannel: Double = js.native
}
object IBridgeConfig {
  
  @scala.inline
  def apply(
    UTC: Date,
    apiversion: String,
    backup: Errorcode,
    bridgeid: String,
    dhcp: Boolean,
    factorynew: Boolean,
    gateway: String,
    ipaddress: String,
    linkbutton: Boolean,
    localtime: Date,
    mac: String,
    modelid: String,
    name: String,
    netmask: String,
    portalconnection: String,
    portalservices: Boolean,
    portalstate: Communication,
    proxyaddress: String,
    proxyport: Double,
    swupdate: Checkforupdate,
    swversion: String,
    timezone: String,
    whitelist: StringDictionary[Createdate],
    zigbeechannel: Double
  ): IBridgeConfig = {
    val __obj = js.Dynamic.literal(UTC = UTC.asInstanceOf[js.Any], apiversion = apiversion.asInstanceOf[js.Any], backup = backup.asInstanceOf[js.Any], bridgeid = bridgeid.asInstanceOf[js.Any], dhcp = dhcp.asInstanceOf[js.Any], factorynew = factorynew.asInstanceOf[js.Any], gateway = gateway.asInstanceOf[js.Any], ipaddress = ipaddress.asInstanceOf[js.Any], linkbutton = linkbutton.asInstanceOf[js.Any], localtime = localtime.asInstanceOf[js.Any], mac = mac.asInstanceOf[js.Any], modelid = modelid.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], netmask = netmask.asInstanceOf[js.Any], portalconnection = portalconnection.asInstanceOf[js.Any], portalservices = portalservices.asInstanceOf[js.Any], portalstate = portalstate.asInstanceOf[js.Any], proxyaddress = proxyaddress.asInstanceOf[js.Any], proxyport = proxyport.asInstanceOf[js.Any], swupdate = swupdate.asInstanceOf[js.Any], swversion = swversion.asInstanceOf[js.Any], timezone = timezone.asInstanceOf[js.Any], whitelist = whitelist.asInstanceOf[js.Any], zigbeechannel = zigbeechannel.asInstanceOf[js.Any])
    __obj.asInstanceOf[IBridgeConfig]
  }
  
  @scala.inline
  implicit class IBridgeConfigMutableBuilder[Self <: IBridgeConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApiversion(value: String): Self = StObject.set(x, "apiversion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackup(value: Errorcode): Self = StObject.set(x, "backup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBridgeid(value: String): Self = StObject.set(x, "bridgeid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDhcp(value: Boolean): Self = StObject.set(x, "dhcp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFactorynew(value: Boolean): Self = StObject.set(x, "factorynew", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGateway(value: String): Self = StObject.set(x, "gateway", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIpaddress(value: String): Self = StObject.set(x, "ipaddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLinkbutton(value: Boolean): Self = StObject.set(x, "linkbutton", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocaltime(value: Date): Self = StObject.set(x, "localtime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMac(value: String): Self = StObject.set(x, "mac", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModelid(value: String): Self = StObject.set(x, "modelid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNetmask(value: String): Self = StObject.set(x, "netmask", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPortalconnection(value: String): Self = StObject.set(x, "portalconnection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPortalservices(value: Boolean): Self = StObject.set(x, "portalservices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPortalstate(value: Communication): Self = StObject.set(x, "portalstate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProxyaddress(value: String): Self = StObject.set(x, "proxyaddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProxyport(value: Double): Self = StObject.set(x, "proxyport", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReplacesbridgeid(value: String): Self = StObject.set(x, "replacesbridgeid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReplacesbridgeidUndefined: Self = StObject.set(x, "replacesbridgeid", js.undefined)
    
    @scala.inline
    def setSwupdate(value: Checkforupdate): Self = StObject.set(x, "swupdate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSwversion(value: String): Self = StObject.set(x, "swversion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimezone(value: String): Self = StObject.set(x, "timezone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUTC(value: Date): Self = StObject.set(x, "UTC", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWhitelist(value: StringDictionary[Createdate]): Self = StObject.set(x, "whitelist", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZigbeechannel(value: Double): Self = StObject.set(x, "zigbeechannel", value.asInstanceOf[js.Any])
  }
}
