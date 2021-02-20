package typings.openstackWrapper

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("openstack-wrapper", "Glance")
  @js.native
  class Glance protected () extends StObject {
    def this(endpoint_url: String, auth_token: String) = this()
    
    def getImage(id: js.Any, cb: js.Function1[/* repeated */ js.Any, _]): js.Any = js.native
    
    def getRequestOptions(path: String, json_value: js.Any, extra_headers: js.Any): RequestOption = js.native
    
    def listImages(cb: js.Function1[/* repeated */ js.Any, _]): js.Any = js.native
    
    var logger: js.Any = js.native
    
    var mangleObject: js.Any = js.native
    
    var mangler: js.Any = js.native
    
    def queueImage(data: js.Any, cb: js.Function1[/* repeated */ js.Any, _]): js.Any = js.native
    
    def removeImage(id: js.Any, cb: js.Function1[/* repeated */ js.Any, _]): js.Any = js.native
    
    var request: js.Any = js.native
    
    var request_id: js.Any = js.native
    
    def setLogger(logger: js.Any): Unit = js.native
    
    def setMangler(mangle_lib: js.Any): Unit = js.native
    
    def setRequest(request_lib: js.Any): Unit = js.native
    
    def setRequestID(request_id: js.Any): Unit = js.native
    
    def setTimeout(new_timeout: js.Any): Unit = js.native
    
    def setUserName(user_name: String): Unit = js.native
    
    var timeout: js.Any = js.native
    
    var token: js.Any = js.native
    
    def updateImage(id: js.Any, data: js.Any, cb: js.Function1[/* repeated */ js.Any, _]): js.Any = js.native
    
    def uploadImage(id: js.Any, stream: js.Any, cb: js.Function1[/* repeated */ js.Any, _]): js.Any = js.native
    
    var url: js.Any = js.native
    
    var user_name: js.Any = js.native
  }
  
  @JSImport("openstack-wrapper", "Keystone")
  @js.native
  class Keystone protected () extends StObject {
    def this(endpoint_url: String) = this()
    
    def addRoleAssignment(
      project_token: js.Any,
      project_id: js.Any,
      entry_id: js.Any,
      entry_type: js.Any,
      role_id: js.Any,
      cb: js.Function1[/* repeated */ js.Any, _]
    ): js.Any = js.native
    
    def getProjectByName(admin_access_token: js.Any, project_name: js.Any, cb: js.Function1[/* repeated */ js.Any, _]): js.Any = js.native
    
    def getProjectToken(access_token: js.Any, project_id: js.Any, cb: js.Function1[/* repeated */ js.Any, _]): js.Any = js.native
    
    def getProjectTokenByName(
      access_token: js.Any,
      domain_id: js.Any,
      project_name: String,
      cb: js.Function1[/* repeated */ js.Any, _]
    ): js.Any = js.native
    
    def getProjectTokenForReal(auth_data: js.Any, cb: js.Function1[/* repeated */ js.Any, _]): js.Any = js.native
    
    def getRequestOptions(path: String, json_value: js.Any, extra_headers: js.Any): RequestOption = js.native
    
    def getToken(username: String, password: String, cb: js.Function1[/* repeated */ js.Any, _]): js.Any = js.native
    
    def listMetaEnvironments(auth_token: js.Any, cb: js.Function1[/* repeated */ js.Any, _]): js.Any = js.native
    
    def listMetaOwningGroups(auth_token: js.Any, cb: js.Function1[/* repeated */ js.Any, _]): js.Any = js.native
    
    def listProjectMeta(project_token: js.Any, project_id: js.Any, cb: js.Function1[/* repeated */ js.Any, _]): js.Any = js.native
    
    def listProjects(admin_access_token: js.Any, cb: js.Function1[/* repeated */ js.Any, _]): js.Any = js.native
    
    def listRoleAssignments(project_token: js.Any, project_id: js.Any, cb: js.Function1[/* repeated */ js.Any, _]): js.Any = js.native
    
    def listRoles(project_token: js.Any, cb: js.Function1[/* repeated */ js.Any, _]): js.Any = js.native
    
    def listUserProjects(username: js.Any, access_token: js.Any, cb: js.Function1[/* repeated */ js.Any, _]): js.Any = js.native
    
    var logger: js.Any = js.native
    
    var mangleObject: js.Any = js.native
    
    var mangler: js.Any = js.native
    
    def removeRoleAssignment(
      project_token: js.Any,
      project_id: js.Any,
      entry_id: js.Any,
      entry_type: js.Any,
      role_id: js.Any,
      cb: js.Function1[/* repeated */ js.Any, _]
    ): js.Any = js.native
    
    var request: js.Any = js.native
    
    var request_id: js.Any = js.native
    
    def setLogger(logger: js.Any): Unit = js.native
    
    def setMangler(mangle_lib: js.Any): Unit = js.native
    
    def setRequest(request_lib: js.Any): Unit = js.native
    
    def setRequestID(request_id: js.Any): Unit = js.native
    
    def setTimeout(new_timeout: js.Any): Unit = js.native
    
    def setUserName(user_name: String): Unit = js.native
    
    var timeout: js.Any = js.native
    
    def updateProjectMeta(
      project_token: js.Any,
      project_id: js.Any,
      new_meta: js.Any,
      cb: js.Function1[/* repeated */ js.Any, _]
    ): js.Any = js.native
    
    var url: js.Any = js.native
    
    var user_name: js.Any = js.native
  }
  
  @JSImport("openstack-wrapper", "Neutron")
  @js.native
  class Neutron protected () extends StObject {
    def this(endpoint_url: String, auth_token: String) = this()
    
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
    
    var logger: js.Any = js.native
    
    var mangleObject: js.Any = js.native
    
    var mangler: js.Any = js.native
    
    def removeFloatingIp(ip_id: js.Any, cb: js.Function1[/* repeated */ js.Any, _]): js.Any = js.native
    
    def removeLBHealthMonitor(health_monitor_id: js.Any, cb: js.Function1[/* repeated */ js.Any, _]): js.Any = js.native
    
    def removeLBListener(listener_id: js.Any, cb: js.Function1[/* repeated */ js.Any, _]): js.Any = js.native
    
    def removeLBPool(pool_id: js.Any, cb: js.Function1[/* repeated */ js.Any, _]): js.Any = js.native
    
    def removeLBPoolMember(pool_id: js.Any, member_id: js.Any, cb: js.Function1[/* repeated */ js.Any, _]): js.Any = js.native
    
    def removeLoadBalancer(lb_id: js.Any, cb: js.Function1[/* repeated */ js.Any, _]): js.Any = js.native
    
    def removeSecurityGroup(group_id: js.Any, cb: js.Function1[/* repeated */ js.Any, _]): js.Any = js.native
    
    def removeSecurityGroupRule(rule_id: js.Any, cb: js.Function1[/* repeated */ js.Any, _]): js.Any = js.native
    
    var request: js.Any = js.native
    
    var request_id: js.Any = js.native
    
    def setLogger(logger: js.Any): Unit = js.native
    
    def setMangler(mangle_lib: js.Any): Unit = js.native
    
    def setRequest(request_lib: js.Any): Unit = js.native
    
    def setRequestID(request_id: js.Any): Unit = js.native
    
    def setTimeout(new_timeout: js.Any): Unit = js.native
    
    def setUserName(user_name: String): Unit = js.native
    
    var timeout: js.Any = js.native
    
    var token: js.Any = js.native
    
    def updateFloatingIp(ip_id: js.Any, port_id: js.Any, cb: js.Function1[/* repeated */ js.Any, _]): js.Any = js.native
    
    def updateLBHealthMonitor(health_monitor_id: js.Any, data: js.Any, cb: js.Function1[/* repeated */ js.Any, _]): js.Any = js.native
    
    def updateLBListener(listener_id: js.Any, data: js.Any, cb: js.Function1[/* repeated */ js.Any, _]): js.Any = js.native
    
    def updateLBPool(pool_id: js.Any, data: js.Any, cb: js.Function1[/* repeated */ js.Any, _]): js.Any = js.native
    
    def updateLBPoolMember(pool_id: js.Any, member_id: js.Any, data: js.Any, cb: js.Function1[/* repeated */ js.Any, _]): js.Any = js.native
    
    def updateLoadBalancer(lb_id: js.Any, data: js.Any, cb: js.Function1[/* repeated */ js.Any, _]): js.Any = js.native
    
    def updatePort(port_id: js.Any, data: js.Any, cb: js.Function1[/* repeated */ js.Any, _]): js.Any = js.native
    
    def updateSecurityGroup(group_id: js.Any, data: js.Any, cb: js.Function1[/* repeated */ js.Any, _]): js.Any = js.native
    
    var url: js.Any = js.native
    
    var user_name: js.Any = js.native
  }
  
  @JSImport("openstack-wrapper", "Nova")
  @js.native
  class Nova protected () extends StObject {
    def this(endpoint_url: String, auth_token: String) = this()
    
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
    
    var logger: js.Any = js.native
    
    var mangleObject: js.Any = js.native
    
    var mangler: js.Any = js.native
    
    def pauseServer(id: String, cb: js.Function1[/* repeated */ js.Any, _]): js.Any = js.native
    
    def rebootServer(id: String, cb: js.Function1[/* repeated */ js.Any, _]): js.Any = js.native
    
    def removeFloatingIp(id: String, cb: js.Function1[/* repeated */ js.Any, _]): js.Any = js.native
    
    def removeKeyPair(id: String, cb: js.Function1[/* repeated */ js.Any, _]): js.Any = js.native
    
    def removeSecurityGroup(security_group_name: String, instance_id: String, cb: js.Function1[/* repeated */ js.Any, _]): js.Any = js.native
    
    def removeServer(id: String, cb: js.Function1[/* repeated */ js.Any, _]): js.Any = js.native
    
    def renameServer(id: String, name: String, cb: js.Function1[/* repeated */ js.Any, _]): js.Any = js.native
    
    var request: js.Any = js.native
    
    var request_id: js.Any = js.native
    
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
    
    var timeout: js.Any = js.native
    
    var token: js.Any = js.native
    
    var url: js.Any = js.native
    
    var user_name: js.Any = js.native
  }
  
  @JSImport("openstack-wrapper", "Octavia")
  @js.native
  class Octavia protected () extends StObject {
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
  
  @JSImport("openstack-wrapper", "getSimpleProject")
  @js.native
  def getSimpleProject(
    username: String,
    password: String,
    project_id: String,
    keystone_url: String,
    cb: js.Function1[/* repeated */ js.Any, _]
  ): Unit = js.native
  
  @js.native
  trait Project extends StObject {
    
    var general_token: String = js.native
    
    var glance: Glance = js.native
    
    var neutron: Neutron = js.native
    
    var nova: Nova = js.native
    
    var octavia: Octavia = js.native
    
    var project_token: String = js.native
  }
  object Project {
    
    @scala.inline
    def apply(
      general_token: String,
      glance: Glance,
      neutron: Neutron,
      nova: Nova,
      octavia: Octavia,
      project_token: String
    ): Project = {
      val __obj = js.Dynamic.literal(general_token = general_token.asInstanceOf[js.Any], glance = glance.asInstanceOf[js.Any], neutron = neutron.asInstanceOf[js.Any], nova = nova.asInstanceOf[js.Any], octavia = octavia.asInstanceOf[js.Any], project_token = project_token.asInstanceOf[js.Any])
      __obj.asInstanceOf[Project]
    }
    
    @scala.inline
    implicit class ProjectMutableBuilder[Self <: Project] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGeneral_token(value: String): Self = StObject.set(x, "general_token", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGlance(value: Glance): Self = StObject.set(x, "glance", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNeutron(value: Neutron): Self = StObject.set(x, "neutron", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNova(value: Nova): Self = StObject.set(x, "nova", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOctavia(value: Octavia): Self = StObject.set(x, "octavia", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProject_token(value: String): Self = StObject.set(x, "project_token", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait RequestOption extends StObject {
    
    var headers: js.UndefOr[js.Any] = js.native
    
    var json: js.UndefOr[js.Any] = js.native
    
    var metricLogger: js.UndefOr[js.Any] = js.native
    
    var metricRequestID: js.UndefOr[String] = js.native
    
    var metricUserName: js.UndefOr[String] = js.native
    
    var timeout: js.UndefOr[js.Any] = js.native
    
    var uri: js.UndefOr[String] = js.native
  }
  object RequestOption {
    
    @scala.inline
    def apply(): RequestOption = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RequestOption]
    }
    
    @scala.inline
    implicit class RequestOptionMutableBuilder[Self <: RequestOption] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHeaders(value: js.Any): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      @scala.inline
      def setJson(value: js.Any): Self = StObject.set(x, "json", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setJsonUndefined: Self = StObject.set(x, "json", js.undefined)
      
      @scala.inline
      def setMetricLogger(value: js.Any): Self = StObject.set(x, "metricLogger", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetricLoggerUndefined: Self = StObject.set(x, "metricLogger", js.undefined)
      
      @scala.inline
      def setMetricRequestID(value: String): Self = StObject.set(x, "metricRequestID", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetricRequestIDUndefined: Self = StObject.set(x, "metricRequestID", js.undefined)
      
      @scala.inline
      def setMetricUserName(value: String): Self = StObject.set(x, "metricUserName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetricUserNameUndefined: Self = StObject.set(x, "metricUserName", js.undefined)
      
      @scala.inline
      def setTimeout(value: js.Any): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
      
      @scala.inline
      def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUriUndefined: Self = StObject.set(x, "uri", js.undefined)
    }
  }
}
