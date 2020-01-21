package typings.openstackWrapper.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("openstack-wrapper", "Neutron")
@js.native
class Neutron protected () extends js.Object {
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
  def createFloatingIp(floating_network_id: js.Any, cb: js.Function1[/* repeated */ js.Any, _]): js.Any = js.native
  def createLBHealthMonitor(
    tenant_id: js.Any,
    `type`: js.Any,
    delay: js.Any,
    timeout: js.Any,
    max_retries: js.Any,
    pool_id: js.Any,
    data: js.Any,
    cb: js.Function1[/* repeated */ js.Any, _]
  ): js.Any = js.native
  def createLBListener(
    tenant_id: js.Any,
    loadbalancer_id: js.Any,
    description: js.Any,
    protocol: js.Any,
    data: js.Any,
    cb: js.Function1[/* repeated */ js.Any, _]
  ): js.Any = js.native
  def createLBPool(
    tenant_id: js.Any,
    protocol: js.Any,
    lb_algorithm: js.Any,
    listener_id: js.Any,
    data: js.Any,
    cb: js.Function1[/* repeated */ js.Any, _]
  ): js.Any = js.native
  def createLBPoolMember(
    pool_id: js.Any,
    tenant_id: js.Any,
    address: js.Any,
    protocol_port: js.Any,
    data: js.Any,
    cb: js.Function1[/* repeated */ js.Any, _]
  ): js.Any = js.native
  def createLoadBalancer(tenant_id: js.Any, vip_subnet_id: js.Any, cb: js.Function1[/* repeated */ js.Any, _]): js.Any = js.native
  def createSecurityGroup(group_name: js.Any, data: js.Any, cb: js.Function1[/* repeated */ js.Any, _]): js.Any = js.native
  def createSecurityGroupRule(group_id: js.Any, data: js.Any, cb: js.Function1[/* repeated */ js.Any, _]): js.Any = js.native
  def getFloatingIp(ip_id: js.Any, cb: js.Function1[/* repeated */ js.Any, _]): js.Any = js.native
  def getLBHealthMonitor(health_monitor_id: js.Any, cb: js.Function1[/* repeated */ js.Any, _]): js.Any = js.native
  def getLBListener(lb_id: js.Any, cb: js.Function1[/* repeated */ js.Any, _]): js.Any = js.native
  def getLBPool(pool_id: js.Any, cb: js.Function1[/* repeated */ js.Any, _]): js.Any = js.native
  def getLBPoolMember(pool_id: js.Any, member_id: js.Any, cb: js.Function1[/* repeated */ js.Any, _]): js.Any = js.native
  def getLBStats(lb_id: js.Any, cb: js.Function1[/* repeated */ js.Any, _]): js.Any = js.native
  def getLoadBalancer(lb_id: js.Any, cb: js.Function1[/* repeated */ js.Any, _]): js.Any = js.native
  def getNetwork(network_id: String, cb: js.Function1[/* repeated */ js.Any, _]): js.Any = js.native
  def getPort(port_id: js.Any, cb: js.Function1[/* repeated */ js.Any, _]): js.Any = js.native
  def getRequestOptions(path: String, json_value: js.Any, extra_headers: js.Any): RequestOption = js.native
  def getRouter(router_id: js.Any, cb: js.Function1[/* repeated */ js.Any, _]): js.Any = js.native
  def getSecurityGroup(group_id: js.Any, cb: js.Function1[/* repeated */ js.Any, _]): js.Any = js.native
  def getSecurityGroupRule(rule_id: js.Any, cb: js.Function1[/* repeated */ js.Any, _]): js.Any = js.native
  def getSubnet(subnet_id: js.Any, cb: js.Function1[/* repeated */ js.Any, _]): js.Any = js.native
  def listFloatingIps(options: js.Any, cb: js.Function1[/* repeated */ js.Any, _]): js.Any = js.native
  def listLBHealthMonitors(cb: js.Function1[/* repeated */ js.Any, _]): js.Any = js.native
  def listLBListeners(cb: js.Function1[/* repeated */ js.Any, _]): js.Any = js.native
  def listLBPoolMembers(pool_id: js.Any, cb: js.Function1[/* repeated */ js.Any, _]): js.Any = js.native
  def listLBPools(cb: js.Function1[/* repeated */ js.Any, _]): js.Any = js.native
  def listLoadBalancers(cb: js.Function1[/* repeated */ js.Any, _]): js.Any = js.native
  def listNetworks(cb: js.Function1[/* repeated */ js.Any, _]): js.Any = js.native
  def listPorts(options: js.Any, cb: js.Function1[/* repeated */ js.Any, _]): js.Any = js.native
  def listRouters(cb: js.Function1[/* repeated */ js.Any, _]): js.Any = js.native
  def listSecurityGroupRules(cb: js.Function1[/* repeated */ js.Any, _]): js.Any = js.native
  def listSecurityGroups(project_id: js.Any, cb: js.Function1[/* repeated */ js.Any, _]): js.Any = js.native
  def listSubnets(cb: js.Function1[/* repeated */ js.Any, _]): js.Any = js.native
  def removeFloatingIp(ip_id: js.Any, cb: js.Function1[/* repeated */ js.Any, _]): js.Any = js.native
  def removeLBHealthMonitor(health_monitor_id: js.Any, cb: js.Function1[/* repeated */ js.Any, _]): js.Any = js.native
  def removeLBListener(listener_id: js.Any, cb: js.Function1[/* repeated */ js.Any, _]): js.Any = js.native
  def removeLBPool(pool_id: js.Any, cb: js.Function1[/* repeated */ js.Any, _]): js.Any = js.native
  def removeLBPoolMember(pool_id: js.Any, member_id: js.Any, cb: js.Function1[/* repeated */ js.Any, _]): js.Any = js.native
  def removeLoadBalancer(lb_id: js.Any, cb: js.Function1[/* repeated */ js.Any, _]): js.Any = js.native
  def removeSecurityGroup(group_id: js.Any, cb: js.Function1[/* repeated */ js.Any, _]): js.Any = js.native
  def removeSecurityGroupRule(rule_id: js.Any, cb: js.Function1[/* repeated */ js.Any, _]): js.Any = js.native
  def setLogger(logger: js.Any): Unit = js.native
  def setMangler(mangle_lib: js.Any): Unit = js.native
  def setRequest(request_lib: js.Any): Unit = js.native
  def setRequestID(request_id: js.Any): Unit = js.native
  def setTimeout(new_timeout: js.Any): Unit = js.native
  def setUserName(user_name: String): Unit = js.native
  def updateFloatingIp(ip_id: js.Any, port_id: js.Any, cb: js.Function1[/* repeated */ js.Any, _]): js.Any = js.native
  def updateLBHealthMonitor(health_monitor_id: js.Any, data: js.Any, cb: js.Function1[/* repeated */ js.Any, _]): js.Any = js.native
  def updateLBListener(listener_id: js.Any, data: js.Any, cb: js.Function1[/* repeated */ js.Any, _]): js.Any = js.native
  def updateLBPool(pool_id: js.Any, data: js.Any, cb: js.Function1[/* repeated */ js.Any, _]): js.Any = js.native
  def updateLBPoolMember(pool_id: js.Any, member_id: js.Any, data: js.Any, cb: js.Function1[/* repeated */ js.Any, _]): js.Any = js.native
  def updateLoadBalancer(lb_id: js.Any, data: js.Any, cb: js.Function1[/* repeated */ js.Any, _]): js.Any = js.native
  def updatePort(port_id: js.Any, data: js.Any, cb: js.Function1[/* repeated */ js.Any, _]): js.Any = js.native
  def updateSecurityGroup(group_id: js.Any, data: js.Any, cb: js.Function1[/* repeated */ js.Any, _]): js.Any = js.native
}

