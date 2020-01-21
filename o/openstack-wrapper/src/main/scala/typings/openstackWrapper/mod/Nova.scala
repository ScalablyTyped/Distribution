package typings.openstackWrapper.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("openstack-wrapper", "Nova")
@js.native
class Nova protected () extends js.Object {
  def this(endpoint_url: String, auth_token: String) = this()
  var logger: js.Any = js.native
  var mangleObject: js.Any = js.native
  var mangler: js.Any = js.native
  var request: js.Any = js.native
  var request_id: js.Any = js.native
  var timeout: js.Any = js.native
  var token: js.Any = js.native
  var url: js.Any = js.native
  var user_name: js.Any = js.native
  def assignSecurityGroup(security_group_name: String, instance_id: String, cb: js.Function1[/* repeated */ js.Any, _]): js.Any = js.native
  def associateFloatingIp(instance_id: js.Any, ip_address: js.Any, cb: js.Function1[/* repeated */ js.Any, _]): js.Any = js.native
  def confirmResizeServer(id: String, cb: js.Function1[/* repeated */ js.Any, _]): js.Any = js.native
  def createFloatingIp(data: js.Any, cb: js.Function1[/* repeated */ js.Any, _]): js.Any = js.native
  def createKeyPair(name: String, public_key: js.Any, cb: js.Function1[/* repeated */ js.Any, _]): js.Any = js.native
  def createServer(data: js.Any, cb: js.Function1[/* repeated */ js.Any, _]): js.Any = js.native
  def createServerImage(id: String, data: js.Any, cb: js.Function1[/* repeated */ js.Any, _]): js.Any = js.native
  def disassociateFloatingIp(instance_id: js.Any, ip_address: js.Any, cb: js.Function1[/* repeated */ js.Any, _]): js.Any = js.native
  def forceRebootServer(id: String, cb: js.Function1[/* repeated */ js.Any, _]): js.Any = js.native
  def getAvailabilityZone(id: String, cb: js.Function1[/* repeated */ js.Any, _]): js.Any = js.native
  def getFlavor(id: String, cb: js.Function1[/* repeated */ js.Any, _]): js.Any = js.native
  def getFloatingIp(id: String, cb: js.Function1[/* repeated */ js.Any, _]): js.Any = js.native
  def getFloatingIpPool(id: String, cb: js.Function1[/* repeated */ js.Any, _]): js.Any = js.native
  def getImageMetaData(id: String, cb: js.Function1[/* repeated */ js.Any, _]): js.Any = js.native
  def getKeyPair(id: String, cb: js.Function1[/* repeated */ js.Any, _]): js.Any = js.native
  def getQuotaSet(project_id: String, cb: js.Function1[/* repeated */ js.Any, _]): js.Any = js.native
  def getRequestOptions(path: String, json_value: js.Any, extra_headers: js.Any): RequestOption = js.native
  def getServer(id: String, cb: js.Function1[/* repeated */ js.Any, _]): js.Any = js.native
  def getServerConsoleURL(`type`: js.Any, id: String, cb: js.Function1[/* repeated */ js.Any, _]): js.Any = js.native
  def getServerLog(id: String, length: js.Any, cb: js.Function1[/* repeated */ js.Any, _]): js.Any = js.native
  def getTenantUsage(
    project_id: String,
    start_date_obj: js.Any,
    end_date_obj: js.Any,
    cb: js.Function1[/* repeated */ js.Any, _]
  ): js.Any = js.native
  def listAvailabilityZones(cb: js.Function1[/* repeated */ js.Any, _]): js.Any = js.native
  def listFlavors(cb: js.Function1[/* repeated */ js.Any, _]): js.Any = js.native
  def listFloatingIpPools(cb: js.Function1[/* repeated */ js.Any, _]): js.Any = js.native
  def listFloatingIps(cb: js.Function1[/* repeated */ js.Any, _]): js.Any = js.native
  def listKeyPairs(cb: js.Function1[/* repeated */ js.Any, _]): js.Any = js.native
  def listServers(cb: js.Function1[/* repeated */ js.Any, _]): js.Any = js.native
  def pauseServer(id: String, cb: js.Function1[/* repeated */ js.Any, _]): js.Any = js.native
  def rebootServer(id: String, cb: js.Function1[/* repeated */ js.Any, _]): js.Any = js.native
  def removeFloatingIp(id: String, cb: js.Function1[/* repeated */ js.Any, _]): js.Any = js.native
  def removeKeyPair(id: String, cb: js.Function1[/* repeated */ js.Any, _]): js.Any = js.native
  def removeSecurityGroup(security_group_name: String, instance_id: String, cb: js.Function1[/* repeated */ js.Any, _]): js.Any = js.native
  def removeServer(id: String, cb: js.Function1[/* repeated */ js.Any, _]): js.Any = js.native
  def renameServer(id: String, name: String, cb: js.Function1[/* repeated */ js.Any, _]): js.Any = js.native
  def resizeServer(id: String, flavor: js.Any, cb: js.Function1[/* repeated */ js.Any, _]): js.Any = js.native
  def resumeServer(is: String, cb: js.Function1[/* repeated */ js.Any, _]): js.Any = js.native
  def revertResizeServer(id: String, cb: js.Function1[/* repeated */ js.Any, _]): js.Any = js.native
  def setImageMetaData(id: String, data: js.Any, cb: js.Function1[/* repeated */ js.Any, _]): js.Any = js.native
  def setLogger(logger: js.Any): Unit = js.native
  def setMangler(mangle_lib: js.Any): Unit = js.native
  def setQuotaSet(project_id: String, data: js.Any, cb: js.Function1[/* repeated */ js.Any, _]): js.Any = js.native
  def setRequest(request_lib: js.Any): Unit = js.native
  def setRequestID(request_id: js.Any): Unit = js.native
  def setServerMetadata(id: String, data: js.Any, cb: js.Function1[/* repeated */ js.Any, _]): js.Any = js.native
  def setTimeout(new_timeout: js.Any): Unit = js.native
  def setUserName(user_name: String): Unit = js.native
  def startServer(id: String, cb: js.Function1[/* repeated */ js.Any, _]): js.Any = js.native
  def stopServer(id: String, cb: js.Function1[/* repeated */ js.Any, _]): js.Any = js.native
  def suspendServer(id: String, cb: js.Function1[/* repeated */ js.Any, _]): js.Any = js.native
}

