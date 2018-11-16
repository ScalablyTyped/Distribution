package typings
package openstackDashWrapperLib.openstackDashWrapperMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("openstack-wrapper", "Octavia")
@js.native
class Octavia protected () extends js.Object {
  def this(endpoint_url: java.lang.String, auth_token: java.lang.String) = this()
  var logger: js.Any = js.native
  var request_id: js.Any = js.native
  var retries: scala.Double = js.native
  var retry_delay: scala.Double = js.native
  var timeout: js.Any = js.native
  var token: js.Any = js.native
  var url: js.Any = js.native
  var user_name: java.lang.String = js.native
  def createLBHealthMonitor(
    pool_id: java.lang.String,
    `type`: js.Any,
    delay: scala.Double,
    timeout: scala.Double,
    max_retries: scala.Double,
    data: js.Any,
    cb: js.Function1[/* repeated */js.Any, _]
  ): js.Any = js.native
  def createLBListener(
    loadbalancer_id: java.lang.String,
    protocol: js.Any,
    data: js.Any,
    cb: js.Function1[/* repeated */js.Any, _]
  ): js.Any = js.native
  def createLBPool(protocol: js.Any, lb_algorithm: js.Any, data: js.Any, cb: js.Function1[/* repeated */js.Any, _]): js.Any = js.native
  def createLBPoolMember(
    pool_id: java.lang.String,
    address: js.Any,
    protocol_port: js.Any,
    data: js.Any,
    cb: js.Function1[/* repeated */js.Any, _]
  ): js.Any = js.native
  def createLoadBalancer(project_id: java.lang.String, data: js.Any, cb: js.Function1[/* repeated */js.Any, _]): js.Any = js.native
  def getLBHealthMonitor(health_monitor_id: java.lang.String, cb: js.Function1[/* repeated */js.Any, _]): js.Any = js.native
  def getLBListener(listener_id: java.lang.String, cb: js.Function1[/* repeated */js.Any, _]): js.Any = js.native
  def getLBPool(pool_id: java.lang.String, cb: js.Function1[/* repeated */js.Any, _]): js.Any = js.native
  def getLBPoolMember(pool_id: java.lang.String, member_id: java.lang.String, cb: js.Function1[/* repeated */js.Any, _]): js.Any = js.native
  def getLBStats(lb_id: java.lang.String, cb: js.Function1[/* repeated */js.Any, _]): js.Any = js.native
  def getLoadBalancer(lb_id: java.lang.String, cb: js.Function1[/* repeated */js.Any, _]): js.Any = js.native
  def getRequestOptions(path: java.lang.String, json_value: js.Any): RequestOption = js.native
  def listLBHealthMonitors(cb: js.Function1[/* repeated */js.Any, _]): js.Any = js.native
  def listLBListeners(cb: js.Function1[/* repeated */js.Any, _]): js.Any = js.native
  def listLBPoolMembers(pool_id: java.lang.String, cb: js.Function1[/* repeated */js.Any, _]): js.Any = js.native
  def listLBPools(cb: js.Function1[/* repeated */js.Any, _]): js.Any = js.native
  def listLoadBalancers(cb: js.Function1[/* repeated */js.Any, _]): js.Any = js.native
  def removeLBHealthMonitor(health_monitor_id: java.lang.String, cb: js.Function1[/* repeated */js.Any, _]): js.Any = js.native
  def removeLBListener(listener_id: java.lang.String, cb: js.Function1[/* repeated */js.Any, _]): js.Any = js.native
  def removeLBPool(pool_id: java.lang.String, cb: js.Function1[/* repeated */js.Any, _]): js.Any = js.native
  def removeLBPoolMember(pool_id: java.lang.String, member_id: java.lang.String, cb: js.Function1[/* repeated */js.Any, _]): js.Any = js.native
  def removeLoadBalancer(lb_id: java.lang.String, cb: js.Function1[/* repeated */js.Any, _]): js.Any = js.native
  def setLogger(logger: js.Any): scala.Unit = js.native
  def setRequest(request_lib: js.Any): scala.Unit = js.native
  def setRequestID(request_id: js.Any): scala.Unit = js.native
  def setRetries(retries: scala.Double): scala.Unit = js.native
  def setRetryDelay(retry_delay: scala.Double): scala.Unit = js.native
  def setTimeout(new_timeout: js.Any): scala.Unit = js.native
  def setUserName(user_name: java.lang.String): scala.Unit = js.native
  def updateLBHealthMonitor(health_monitor_id: java.lang.String, data: js.Any, cb: js.Function1[/* repeated */js.Any, _]): js.Any = js.native
  def updateLBListener(listener_id: java.lang.String, data: js.Any, cb: js.Function1[/* repeated */js.Any, _]): js.Any = js.native
  def updateLBPool(pool_id: java.lang.String, data: js.Any, cb: js.Function1[/* repeated */js.Any, _]): js.Any = js.native
  def updateLBPoolMember(
    pool_id: java.lang.String,
    member_id: java.lang.String,
    data: js.Any,
    cb: js.Function1[/* repeated */js.Any, _]
  ): js.Any = js.native
  def updateLoadBalancer(lb_id: java.lang.String, data: js.Any, cb: js.Function1[/* repeated */js.Any, _]): js.Any = js.native
}

