package typings.nodeHueApi.mod

import org.scalablytyped.runtime.StringDictionary
import typings.nodeHueApi.anon.Checkforupdate
import typings.nodeHueApi.anon.Communication
import typings.nodeHueApi.anon.Createdate
import typings.nodeHueApi.anon.Errorcode
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IBridgeConfig extends js.Object {
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
  implicit class IBridgeConfigOps[Self <: IBridgeConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setUTC(value: Date): Self = this.set("UTC", value.asInstanceOf[js.Any])
    @scala.inline
    def setApiversion(value: String): Self = this.set("apiversion", value.asInstanceOf[js.Any])
    @scala.inline
    def setBackup(value: Errorcode): Self = this.set("backup", value.asInstanceOf[js.Any])
    @scala.inline
    def setBridgeid(value: String): Self = this.set("bridgeid", value.asInstanceOf[js.Any])
    @scala.inline
    def setDhcp(value: Boolean): Self = this.set("dhcp", value.asInstanceOf[js.Any])
    @scala.inline
    def setFactorynew(value: Boolean): Self = this.set("factorynew", value.asInstanceOf[js.Any])
    @scala.inline
    def setGateway(value: String): Self = this.set("gateway", value.asInstanceOf[js.Any])
    @scala.inline
    def setIpaddress(value: String): Self = this.set("ipaddress", value.asInstanceOf[js.Any])
    @scala.inline
    def setLinkbutton(value: Boolean): Self = this.set("linkbutton", value.asInstanceOf[js.Any])
    @scala.inline
    def setLocaltime(value: Date): Self = this.set("localtime", value.asInstanceOf[js.Any])
    @scala.inline
    def setMac(value: String): Self = this.set("mac", value.asInstanceOf[js.Any])
    @scala.inline
    def setModelid(value: String): Self = this.set("modelid", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setNetmask(value: String): Self = this.set("netmask", value.asInstanceOf[js.Any])
    @scala.inline
    def setPortalconnection(value: String): Self = this.set("portalconnection", value.asInstanceOf[js.Any])
    @scala.inline
    def setPortalservices(value: Boolean): Self = this.set("portalservices", value.asInstanceOf[js.Any])
    @scala.inline
    def setPortalstate(value: Communication): Self = this.set("portalstate", value.asInstanceOf[js.Any])
    @scala.inline
    def setProxyaddress(value: String): Self = this.set("proxyaddress", value.asInstanceOf[js.Any])
    @scala.inline
    def setProxyport(value: Double): Self = this.set("proxyport", value.asInstanceOf[js.Any])
    @scala.inline
    def setSwupdate(value: Checkforupdate): Self = this.set("swupdate", value.asInstanceOf[js.Any])
    @scala.inline
    def setSwversion(value: String): Self = this.set("swversion", value.asInstanceOf[js.Any])
    @scala.inline
    def setTimezone(value: String): Self = this.set("timezone", value.asInstanceOf[js.Any])
    @scala.inline
    def setWhitelist(value: StringDictionary[Createdate]): Self = this.set("whitelist", value.asInstanceOf[js.Any])
    @scala.inline
    def setZigbeechannel(value: Double): Self = this.set("zigbeechannel", value.asInstanceOf[js.Any])
    @scala.inline
    def setReplacesbridgeid(value: String): Self = this.set("replacesbridgeid", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReplacesbridgeid: Self = this.set("replacesbridgeid", js.undefined)
  }
  
}

