package typings
package openstackDashWrapperLib.openstackDashWrapperMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("openstack-wrapper", "Nova")
@js.native
class Nova protected () extends js.Object {
  def this(endpoint_url: java.lang.String, auth_token: java.lang.String) = this()
  var logger: js.Any = js.native
  var mangleObject: js.Any = js.native
  var mangler: js.Any = js.native
  var request: js.Any = js.native
  var request_id: js.Any = js.native
  var timeout: js.Any = js.native
  var token: js.Any = js.native
  var url: js.Any = js.native
  var user_name: js.Any = js.native
  def assignSecurityGroup(
    security_group_name: java.lang.String,
    instance_id: java.lang.String,
    cb: js.Function1[/* repeated */js.Any, _]
  ): js.Any = js.native
  def associateFloatingIp(instance_id: js.Any, ip_address: js.Any, cb: js.Function1[/* repeated */js.Any, _]): js.Any = js.native
  def confirmResizeServer(id: java.lang.String, cb: js.Function1[/* repeated */js.Any, _]): js.Any = js.native
  def createFloatingIp(data: js.Any, cb: js.Function1[/* repeated */js.Any, _]): js.Any = js.native
  def createKeyPair(name: java.lang.String, public_key: js.Any, cb: js.Function1[/* repeated */js.Any, _]): js.Any = js.native
  def createServer(data: js.Any, cb: js.Function1[/* repeated */js.Any, _]): js.Any = js.native
  def createServerImage(id: java.lang.String, data: js.Any, cb: js.Function1[/* repeated */js.Any, _]): js.Any = js.native
  def disassociateFloatingIp(instance_id: js.Any, ip_address: js.Any, cb: js.Function1[/* repeated */js.Any, _]): js.Any = js.native
  def forceRebootServer(id: java.lang.String, cb: js.Function1[/* repeated */js.Any, _]): js.Any = js.native
  def getAvailabilityZone(id: java.lang.String, cb: js.Function1[/* repeated */js.Any, _]): js.Any = js.native
  def getFlavor(id: java.lang.String, cb: js.Function1[/* repeated */js.Any, _]): js.Any = js.native
  def getFloatingIp(id: java.lang.String, cb: js.Function1[/* repeated */js.Any, _]): js.Any = js.native
  def getFloatingIpPool(id: java.lang.String, cb: js.Function1[/* repeated */js.Any, _]): js.Any = js.native
  def getImageMetaData(id: java.lang.String, cb: js.Function1[/* repeated */js.Any, _]): js.Any = js.native
  def getKeyPair(id: java.lang.String, cb: js.Function1[/* repeated */js.Any, _]): js.Any = js.native
  def getQuotaSet(project_id: java.lang.String, cb: js.Function1[/* repeated */js.Any, _]): js.Any = js.native
  def getRequestOptions(path: java.lang.String, json_value: js.Any, extra_headers: js.Any): RequestOption = js.native
  def getServer(id: java.lang.String, cb: js.Function1[/* repeated */js.Any, _]): js.Any = js.native
  def getServerConsoleURL(`type`: js.Any, id: java.lang.String, cb: js.Function1[/* repeated */js.Any, _]): js.Any = js.native
  def getServerLog(id: java.lang.String, length: js.Any, cb: js.Function1[/* repeated */js.Any, _]): js.Any = js.native
  def getTenantUsage(
    project_id: java.lang.String,
    start_date_obj: js.Any,
    end_date_obj: js.Any,
    cb: js.Function1[/* repeated */js.Any, _]
  ): js.Any = js.native
  def listAvailabilityZones(cb: js.Function1[/* repeated */js.Any, _]): js.Any = js.native
  def listFlavors(cb: js.Function1[/* repeated */js.Any, _]): js.Any = js.native
  def listFloatingIpPools(cb: js.Function1[/* repeated */js.Any, _]): js.Any = js.native
  def listFloatingIps(cb: js.Function1[/* repeated */js.Any, _]): js.Any = js.native
  def listKeyPairs(cb: js.Function1[/* repeated */js.Any, _]): js.Any = js.native
  def listServers(cb: js.Function1[/* repeated */js.Any, _]): js.Any = js.native
  def pauseServer(id: java.lang.String, cb: js.Function1[/* repeated */js.Any, _]): js.Any = js.native
  def rebootServer(id: java.lang.String, cb: js.Function1[/* repeated */js.Any, _]): js.Any = js.native
  def removeFloatingIp(id: java.lang.String, cb: js.Function1[/* repeated */js.Any, _]): js.Any = js.native
  def removeKeyPair(id: java.lang.String, cb: js.Function1[/* repeated */js.Any, _]): js.Any = js.native
  def removeSecurityGroup(
    security_group_name: java.lang.String,
    instance_id: java.lang.String,
    cb: js.Function1[/* repeated */js.Any, _]
  ): js.Any = js.native
  def removeServer(id: java.lang.String, cb: js.Function1[/* repeated */js.Any, _]): js.Any = js.native
  def renameServer(id: java.lang.String, name: java.lang.String, cb: js.Function1[/* repeated */js.Any, _]): js.Any = js.native
  def resizeServer(id: java.lang.String, flavor: js.Any, cb: js.Function1[/* repeated */js.Any, _]): js.Any = js.native
  def resumeServer(is: java.lang.String, cb: js.Function1[/* repeated */js.Any, _]): js.Any = js.native
  def revertResizeServer(id: java.lang.String, cb: js.Function1[/* repeated */js.Any, _]): js.Any = js.native
  def setImageMetaData(id: java.lang.String, data: js.Any, cb: js.Function1[/* repeated */js.Any, _]): js.Any = js.native
  def setLogger(logger: js.Any): scala.Unit = js.native
  def setMangler(mangle_lib: js.Any): scala.Unit = js.native
  def setQuotaSet(project_id: java.lang.String, data: js.Any, cb: js.Function1[/* repeated */js.Any, _]): js.Any = js.native
  def setRequest(request_lib: js.Any): scala.Unit = js.native
  def setRequestID(request_id: js.Any): scala.Unit = js.native
  def setServerMetadata(id: java.lang.String, data: js.Any, cb: js.Function1[/* repeated */js.Any, _]): js.Any = js.native
  def setTimeout(new_timeout: js.Any): scala.Unit = js.native
  def setUserName(user_name: java.lang.String): scala.Unit = js.native
  def startServer(id: java.lang.String, cb: js.Function1[/* repeated */js.Any, _]): js.Any = js.native
  def stopServer(id: java.lang.String, cb: js.Function1[/* repeated */js.Any, _]): js.Any = js.native
  def suspendServer(id: java.lang.String, cb: js.Function1[/* repeated */js.Any, _]): js.Any = js.native
}

