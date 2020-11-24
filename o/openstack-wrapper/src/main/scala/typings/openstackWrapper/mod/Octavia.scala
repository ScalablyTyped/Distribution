package typings.openstackWrapper.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("openstack-wrapper", "Octavia")
@js.native
class Octavia protected () extends js.Object {
  def this(endpoint_url: String, auth_token: String) = this()
  
  def createLBHealthMonitor(
    pool_id: String,
    `type`: js.Any,
    delay: Double,
    timeout: Double,
    max_retries: Double,
    data: js.Any,
    cb: js.Function1[/* repeated */ js.Any, _]
  ): js.Any = js.native
  
  def createLBListener(
    loadbalancer_id: String,
    protocol: js.Any,
    data: js.Any,
    cb: js.Function1[/* repeated */ js.Any, _]
  ): js.Any = js.native
  
  def createLBPool(protocol: js.Any, lb_algorithm: js.Any, data: js.Any, cb: js.Function1[/* repeated */ js.Any, _]): js.Any = js.native
  
  def createLBPoolMember(
    pool_id: String,
    address: js.Any,
    protocol_port: js.Any,
    data: js.Any,
    cb: js.Function1[/* repeated */ js.Any, _]
  ): js.Any = js.native
  
  def createLoadBalancer(project_id: String, data: js.Any, cb: js.Function1[/* repeated */ js.Any, _]): js.Any = js.native
  
  def getLBHealthMonitor(health_monitor_id: String, cb: js.Function1[/* repeated */ js.Any, _]): js.Any = js.native
  
  def getLBListener(listener_id: String, cb: js.Function1[/* repeated */ js.Any, _]): js.Any = js.native
  
  def getLBPool(pool_id: String, cb: js.Function1[/* repeated */ js.Any, _]): js.Any = js.native
  
  def getLBPoolMember(pool_id: String, member_id: String, cb: js.Function1[/* repeated */ js.Any, _]): js.Any = js.native
  
  def getLBStats(lb_id: String, cb: js.Function1[/* repeated */ js.Any, _]): js.Any = js.native
  
  def getLoadBalancer(lb_id: String, cb: js.Function1[/* repeated */ js.Any, _]): js.Any = js.native
  
  def getRequestOptions(path: String, json_value: js.Any): RequestOption = js.native
  
  def listLBHealthMonitors(cb: js.Function1[/* repeated */ js.Any, _]): js.Any = js.native
  
  def listLBListeners(cb: js.Function1[/* repeated */ js.Any, _]): js.Any = js.native
  
  def listLBPoolMembers(pool_id: String, cb: js.Function1[/* repeated */ js.Any, _]): js.Any = js.native
  
  def listLBPools(cb: js.Function1[/* repeated */ js.Any, _]): js.Any = js.native
  
  def listLoadBalancers(cb: js.Function1[/* repeated */ js.Any, _]): js.Any = js.native
  
  var logger: js.Any = js.native
  
  def removeLBHealthMonitor(health_monitor_id: String, cb: js.Function1[/* repeated */ js.Any, _]): js.Any = js.native
  
  def removeLBListener(listener_id: String, cb: js.Function1[/* repeated */ js.Any, _]): js.Any = js.native
  
  def removeLBPool(pool_id: String, cb: js.Function1[/* repeated */ js.Any, _]): js.Any = js.native
  
  def removeLBPoolMember(pool_id: String, member_id: String, cb: js.Function1[/* repeated */ js.Any, _]): js.Any = js.native
  
  def removeLoadBalancer(lb_id: String, cb: js.Function1[/* repeated */ js.Any, _]): js.Any = js.native
  
  var request_id: js.Any = js.native
  
  var retries: Double = js.native
  
  var retry_delay: Double = js.native
  
  def setLogger(logger: js.Any): Unit = js.native
  
  def setRequest(request_lib: js.Any): Unit = js.native
  
  def setRequestID(request_id: js.Any): Unit = js.native
  
  def setRetries(retries: Double): Unit = js.native
  
  def setRetryDelay(retry_delay: Double): Unit = js.native
  
  def setTimeout(new_timeout: js.Any): Unit = js.native
  
  def setUserName(user_name: String): Unit = js.native
  
  var timeout: js.Any = js.native
  
  var token: js.Any = js.native
  
  def updateLBHealthMonitor(health_monitor_id: String, data: js.Any, cb: js.Function1[/* repeated */ js.Any, _]): js.Any = js.native
  
  def updateLBListener(listener_id: String, data: js.Any, cb: js.Function1[/* repeated */ js.Any, _]): js.Any = js.native
  
  def updateLBPool(pool_id: String, data: js.Any, cb: js.Function1[/* repeated */ js.Any, _]): js.Any = js.native
  
  def updateLBPoolMember(pool_id: String, member_id: String, data: js.Any, cb: js.Function1[/* repeated */ js.Any, _]): js.Any = js.native
  
  def updateLoadBalancer(lb_id: String, data: js.Any, cb: js.Function1[/* repeated */ js.Any, _]): js.Any = js.native
  
  var url: js.Any = js.native
  
  var user_name: String = js.native
}
