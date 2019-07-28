package typings.nodeDashHueDashApi.nodeDashHueDashApiMod

import org.scalablytyped.runtime.StringDictionary
import typings.nodeDashHueDashApi.Anon_Checkforupdate
import typings.nodeDashHueDashApi.Anon_Communication
import typings.nodeDashHueDashApi.Anon_Createdate
import typings.nodeDashHueDashApi.Anon_Errorcode
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IBridgeConfig extends js.Object {
  var UTC: Date
  var apiversion: String
  var backup: Anon_Errorcode
  var bridgeid: String
  var dhcp: Boolean
  var factorynew: Boolean
  var gateway: String
  var ipaddress: String
  var linkbutton: Boolean
  var localtime: Date
  var mac: String
  var modelid: String
  var name: String
  var netmask: String
  var portalconnection: String
  var portalservices: Boolean
  var portalstate: Anon_Communication
  var proxyaddress: String
  var proxyport: Double
  var replacesbridgeid: js.UndefOr[String] = js.undefined
  var swupdate: Anon_Checkforupdate
  var swversion: String
  var timezone: String
  var whitelist: StringDictionary[Anon_Createdate]
  var zigbeechannel: Double
}

object IBridgeConfig {
  @scala.inline
  def apply(
    UTC: Date,
    apiversion: String,
    backup: Anon_Errorcode,
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
    portalstate: Anon_Communication,
    proxyaddress: String,
    proxyport: Double,
    swupdate: Anon_Checkforupdate,
    swversion: String,
    timezone: String,
    whitelist: StringDictionary[Anon_Createdate],
    zigbeechannel: Double,
    replacesbridgeid: String = null
  ): IBridgeConfig = {
    val __obj = js.Dynamic.literal(UTC = UTC, apiversion = apiversion, backup = backup, bridgeid = bridgeid, dhcp = dhcp, factorynew = factorynew, gateway = gateway, ipaddress = ipaddress, linkbutton = linkbutton, localtime = localtime, mac = mac, modelid = modelid, name = name, netmask = netmask, portalconnection = portalconnection, portalservices = portalservices, portalstate = portalstate, proxyaddress = proxyaddress, proxyport = proxyport, swupdate = swupdate, swversion = swversion, timezone = timezone, whitelist = whitelist, zigbeechannel = zigbeechannel)
    if (replacesbridgeid != null) __obj.updateDynamic("replacesbridgeid")(replacesbridgeid)
    __obj.asInstanceOf[IBridgeConfig]
  }
}

