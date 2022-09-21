package typings.openstackWrapper

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("openstack-wrapper", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("openstack-wrapper", "Glance")
  @js.native
  open class Glance protected () extends StObject {
    def this(endpoint_url: String, auth_token: String) = this()
    
    def getImage(id: Any, cb: js.Function1[/* repeated */ Any, Any]): Any = js.native
    
    def getRequestOptions(path: String, json_value: Any, extra_headers: Any): RequestOption = js.native
    
    def listImages(cb: js.Function1[/* repeated */ Any, Any]): Any = js.native
    
    var logger: Any = js.native
    
    var mangleObject: Any = js.native
    
    var mangler: Any = js.native
    
    def queueImage(data: Any, cb: js.Function1[/* repeated */ Any, Any]): Any = js.native
    
    def removeImage(id: Any, cb: js.Function1[/* repeated */ Any, Any]): Any = js.native
    
    var request: Any = js.native
    
    var request_id: Any = js.native
    
    def setLogger(logger: Any): Unit = js.native
    
    def setMangler(mangle_lib: Any): Unit = js.native
    
    def setRequest(request_lib: Any): Unit = js.native
    
    def setRequestID(request_id: Any): Unit = js.native
    
    def setTimeout(new_timeout: Any): Unit = js.native
    
    def setUserName(user_name: String): Unit = js.native
    
    var timeout: Any = js.native
    
    var token: Any = js.native
    
    def updateImage(id: Any, data: Any, cb: js.Function1[/* repeated */ Any, Any]): Any = js.native
    
    def uploadImage(id: Any, stream: Any, cb: js.Function1[/* repeated */ Any, Any]): Any = js.native
    
    var url: Any = js.native
    
    var user_name: Any = js.native
  }
  
  @JSImport("openstack-wrapper", "Keystone")
  @js.native
  open class Keystone protected () extends StObject {
    def this(endpoint_url: String) = this()
    
    def addRoleAssignment(
      project_token: Any,
      project_id: Any,
      entry_id: Any,
      entry_type: Any,
      role_id: Any,
      cb: js.Function1[/* repeated */ Any, Any]
    ): Any = js.native
    
    def getProjectByName(admin_access_token: Any, project_name: Any, cb: js.Function1[/* repeated */ Any, Any]): Any = js.native
    
    def getProjectToken(access_token: Any, project_id: Any, cb: js.Function1[/* repeated */ Any, Any]): Any = js.native
    
    def getProjectTokenByName(access_token: Any, domain_id: Any, project_name: String, cb: js.Function1[/* repeated */ Any, Any]): Any = js.native
    
    def getProjectTokenForReal(auth_data: Any, cb: js.Function1[/* repeated */ Any, Any]): Any = js.native
    
    def getRequestOptions(path: String, json_value: Any, extra_headers: Any): RequestOption = js.native
    
    def getToken(username: String, password: String, cb: js.Function1[/* repeated */ Any, Any]): Any = js.native
    
    def listMetaEnvironments(auth_token: Any, cb: js.Function1[/* repeated */ Any, Any]): Any = js.native
    
    def listMetaOwningGroups(auth_token: Any, cb: js.Function1[/* repeated */ Any, Any]): Any = js.native
    
    def listProjectMeta(project_token: Any, project_id: Any, cb: js.Function1[/* repeated */ Any, Any]): Any = js.native
    
    def listProjects(admin_access_token: Any, cb: js.Function1[/* repeated */ Any, Any]): Any = js.native
    
    def listRoleAssignments(project_token: Any, project_id: Any, cb: js.Function1[/* repeated */ Any, Any]): Any = js.native
    
    def listRoles(project_token: Any, cb: js.Function1[/* repeated */ Any, Any]): Any = js.native
    
    def listUserProjects(username: Any, access_token: Any, cb: js.Function1[/* repeated */ Any, Any]): Any = js.native
    
    var logger: Any = js.native
    
    var mangleObject: Any = js.native
    
    var mangler: Any = js.native
    
    def removeRoleAssignment(
      project_token: Any,
      project_id: Any,
      entry_id: Any,
      entry_type: Any,
      role_id: Any,
      cb: js.Function1[/* repeated */ Any, Any]
    ): Any = js.native
    
    var request: Any = js.native
    
    var request_id: Any = js.native
    
    def setLogger(logger: Any): Unit = js.native
    
    def setMangler(mangle_lib: Any): Unit = js.native
    
    def setRequest(request_lib: Any): Unit = js.native
    
    def setRequestID(request_id: Any): Unit = js.native
    
    def setTimeout(new_timeout: Any): Unit = js.native
    
    def setUserName(user_name: String): Unit = js.native
    
    var timeout: Any = js.native
    
    def updateProjectMeta(project_token: Any, project_id: Any, new_meta: Any, cb: js.Function1[/* repeated */ Any, Any]): Any = js.native
    
    var url: Any = js.native
    
    var user_name: Any = js.native
  }
  
  @JSImport("openstack-wrapper", "Neutron")
  @js.native
  open class Neutron protected () extends StObject {
    def this(endpoint_url: String, auth_token: String) = this()
    
    def createFloatingIp(floating_network_id: Any, cb: js.Function1[/* repeated */ Any, Any]): Any = js.native
    
    def createLBHealthMonitor(
      tenant_id: Any,
      `type`: Any,
      delay: Any,
      timeout: Any,
      max_retries: Any,
      pool_id: Any,
      data: Any,
      cb: js.Function1[/* repeated */ Any, Any]
    ): Any = js.native
    
    def createLBListener(
      tenant_id: Any,
      loadbalancer_id: Any,
      description: Any,
      protocol: Any,
      data: Any,
      cb: js.Function1[/* repeated */ Any, Any]
    ): Any = js.native
    
    def createLBPool(
      tenant_id: Any,
      protocol: Any,
      lb_algorithm: Any,
      listener_id: Any,
      data: Any,
      cb: js.Function1[/* repeated */ Any, Any]
    ): Any = js.native
    
    def createLBPoolMember(
      pool_id: Any,
      tenant_id: Any,
      address: Any,
      protocol_port: Any,
      data: Any,
      cb: js.Function1[/* repeated */ Any, Any]
    ): Any = js.native
    
    def createLoadBalancer(tenant_id: Any, vip_subnet_id: Any, cb: js.Function1[/* repeated */ Any, Any]): Any = js.native
    
    def createSecurityGroup(group_name: Any, data: Any, cb: js.Function1[/* repeated */ Any, Any]): Any = js.native
    
    def createSecurityGroupRule(group_id: Any, data: Any, cb: js.Function1[/* repeated */ Any, Any]): Any = js.native
    
    def getFloatingIp(ip_id: Any, cb: js.Function1[/* repeated */ Any, Any]): Any = js.native
    
    def getLBHealthMonitor(health_monitor_id: Any, cb: js.Function1[/* repeated */ Any, Any]): Any = js.native
    
    def getLBListener(lb_id: Any, cb: js.Function1[/* repeated */ Any, Any]): Any = js.native
    
    def getLBPool(pool_id: Any, cb: js.Function1[/* repeated */ Any, Any]): Any = js.native
    
    def getLBPoolMember(pool_id: Any, member_id: Any, cb: js.Function1[/* repeated */ Any, Any]): Any = js.native
    
    def getLBStats(lb_id: Any, cb: js.Function1[/* repeated */ Any, Any]): Any = js.native
    
    def getLoadBalancer(lb_id: Any, cb: js.Function1[/* repeated */ Any, Any]): Any = js.native
    
    def getNetwork(network_id: String, cb: js.Function1[/* repeated */ Any, Any]): Any = js.native
    
    def getPort(port_id: Any, cb: js.Function1[/* repeated */ Any, Any]): Any = js.native
    
    def getRequestOptions(path: String, json_value: Any, extra_headers: Any): RequestOption = js.native
    
    def getRouter(router_id: Any, cb: js.Function1[/* repeated */ Any, Any]): Any = js.native
    
    def getSecurityGroup(group_id: Any, cb: js.Function1[/* repeated */ Any, Any]): Any = js.native
    
    def getSecurityGroupRule(rule_id: Any, cb: js.Function1[/* repeated */ Any, Any]): Any = js.native
    
    def getSubnet(subnet_id: Any, cb: js.Function1[/* repeated */ Any, Any]): Any = js.native
    
    def listFloatingIps(options: Any, cb: js.Function1[/* repeated */ Any, Any]): Any = js.native
    
    def listLBHealthMonitors(cb: js.Function1[/* repeated */ Any, Any]): Any = js.native
    
    def listLBListeners(cb: js.Function1[/* repeated */ Any, Any]): Any = js.native
    
    def listLBPoolMembers(pool_id: Any, cb: js.Function1[/* repeated */ Any, Any]): Any = js.native
    
    def listLBPools(cb: js.Function1[/* repeated */ Any, Any]): Any = js.native
    
    def listLoadBalancers(cb: js.Function1[/* repeated */ Any, Any]): Any = js.native
    
    def listNetworks(cb: js.Function1[/* repeated */ Any, Any]): Any = js.native
    
    def listPorts(options: Any, cb: js.Function1[/* repeated */ Any, Any]): Any = js.native
    
    def listRouters(cb: js.Function1[/* repeated */ Any, Any]): Any = js.native
    
    def listSecurityGroupRules(cb: js.Function1[/* repeated */ Any, Any]): Any = js.native
    
    def listSecurityGroups(project_id: Any, cb: js.Function1[/* repeated */ Any, Any]): Any = js.native
    
    def listSubnets(cb: js.Function1[/* repeated */ Any, Any]): Any = js.native
    
    var logger: Any = js.native
    
    var mangleObject: Any = js.native
    
    var mangler: Any = js.native
    
    def removeFloatingIp(ip_id: Any, cb: js.Function1[/* repeated */ Any, Any]): Any = js.native
    
    def removeLBHealthMonitor(health_monitor_id: Any, cb: js.Function1[/* repeated */ Any, Any]): Any = js.native
    
    def removeLBListener(listener_id: Any, cb: js.Function1[/* repeated */ Any, Any]): Any = js.native
    
    def removeLBPool(pool_id: Any, cb: js.Function1[/* repeated */ Any, Any]): Any = js.native
    
    def removeLBPoolMember(pool_id: Any, member_id: Any, cb: js.Function1[/* repeated */ Any, Any]): Any = js.native
    
    def removeLoadBalancer(lb_id: Any, cb: js.Function1[/* repeated */ Any, Any]): Any = js.native
    
    def removeSecurityGroup(group_id: Any, cb: js.Function1[/* repeated */ Any, Any]): Any = js.native
    
    def removeSecurityGroupRule(rule_id: Any, cb: js.Function1[/* repeated */ Any, Any]): Any = js.native
    
    var request: Any = js.native
    
    var request_id: Any = js.native
    
    def setLogger(logger: Any): Unit = js.native
    
    def setMangler(mangle_lib: Any): Unit = js.native
    
    def setRequest(request_lib: Any): Unit = js.native
    
    def setRequestID(request_id: Any): Unit = js.native
    
    def setTimeout(new_timeout: Any): Unit = js.native
    
    def setUserName(user_name: String): Unit = js.native
    
    var timeout: Any = js.native
    
    var token: Any = js.native
    
    def updateFloatingIp(ip_id: Any, port_id: Any, cb: js.Function1[/* repeated */ Any, Any]): Any = js.native
    
    def updateLBHealthMonitor(health_monitor_id: Any, data: Any, cb: js.Function1[/* repeated */ Any, Any]): Any = js.native
    
    def updateLBListener(listener_id: Any, data: Any, cb: js.Function1[/* repeated */ Any, Any]): Any = js.native
    
    def updateLBPool(pool_id: Any, data: Any, cb: js.Function1[/* repeated */ Any, Any]): Any = js.native
    
    def updateLBPoolMember(pool_id: Any, member_id: Any, data: Any, cb: js.Function1[/* repeated */ Any, Any]): Any = js.native
    
    def updateLoadBalancer(lb_id: Any, data: Any, cb: js.Function1[/* repeated */ Any, Any]): Any = js.native
    
    def updatePort(port_id: Any, data: Any, cb: js.Function1[/* repeated */ Any, Any]): Any = js.native
    
    def updateSecurityGroup(group_id: Any, data: Any, cb: js.Function1[/* repeated */ Any, Any]): Any = js.native
    
    var url: Any = js.native
    
    var user_name: Any = js.native
  }
  
  @JSImport("openstack-wrapper", "Nova")
  @js.native
  open class Nova protected () extends StObject {
    def this(endpoint_url: String, auth_token: String) = this()
    
    def assignSecurityGroup(security_group_name: String, instance_id: String, cb: js.Function1[/* repeated */ Any, Any]): Any = js.native
    
    def associateFloatingIp(instance_id: Any, ip_address: Any, cb: js.Function1[/* repeated */ Any, Any]): Any = js.native
    
    def confirmResizeServer(id: String, cb: js.Function1[/* repeated */ Any, Any]): Any = js.native
    
    def createFloatingIp(data: Any, cb: js.Function1[/* repeated */ Any, Any]): Any = js.native
    
    def createKeyPair(name: String, public_key: Any, cb: js.Function1[/* repeated */ Any, Any]): Any = js.native
    
    def createServer(data: Any, cb: js.Function1[/* repeated */ Any, Any]): Any = js.native
    
    def createServerImage(id: String, data: Any, cb: js.Function1[/* repeated */ Any, Any]): Any = js.native
    
    def disassociateFloatingIp(instance_id: Any, ip_address: Any, cb: js.Function1[/* repeated */ Any, Any]): Any = js.native
    
    def forceRebootServer(id: String, cb: js.Function1[/* repeated */ Any, Any]): Any = js.native
    
    def getAvailabilityZone(id: String, cb: js.Function1[/* repeated */ Any, Any]): Any = js.native
    
    def getFlavor(id: String, cb: js.Function1[/* repeated */ Any, Any]): Any = js.native
    
    def getFloatingIp(id: String, cb: js.Function1[/* repeated */ Any, Any]): Any = js.native
    
    def getFloatingIpPool(id: String, cb: js.Function1[/* repeated */ Any, Any]): Any = js.native
    
    def getImageMetaData(id: String, cb: js.Function1[/* repeated */ Any, Any]): Any = js.native
    
    def getKeyPair(id: String, cb: js.Function1[/* repeated */ Any, Any]): Any = js.native
    
    def getQuotaSet(project_id: String, cb: js.Function1[/* repeated */ Any, Any]): Any = js.native
    
    def getRequestOptions(path: String, json_value: Any, extra_headers: Any): RequestOption = js.native
    
    def getServer(id: String, cb: js.Function1[/* repeated */ Any, Any]): Any = js.native
    
    def getServerConsoleURL(`type`: Any, id: String, cb: js.Function1[/* repeated */ Any, Any]): Any = js.native
    
    def getServerLog(id: String, length: Any, cb: js.Function1[/* repeated */ Any, Any]): Any = js.native
    
    def getTenantUsage(
      project_id: String,
      start_date_obj: Any,
      end_date_obj: Any,
      cb: js.Function1[/* repeated */ Any, Any]
    ): Any = js.native
    
    def listAvailabilityZones(cb: js.Function1[/* repeated */ Any, Any]): Any = js.native
    
    def listFlavors(cb: js.Function1[/* repeated */ Any, Any]): Any = js.native
    
    def listFloatingIpPools(cb: js.Function1[/* repeated */ Any, Any]): Any = js.native
    
    def listFloatingIps(cb: js.Function1[/* repeated */ Any, Any]): Any = js.native
    
    def listKeyPairs(cb: js.Function1[/* repeated */ Any, Any]): Any = js.native
    
    def listServers(cb: js.Function1[/* repeated */ Any, Any]): Any = js.native
    
    var logger: Any = js.native
    
    var mangleObject: Any = js.native
    
    var mangler: Any = js.native
    
    def pauseServer(id: String, cb: js.Function1[/* repeated */ Any, Any]): Any = js.native
    
    def rebootServer(id: String, cb: js.Function1[/* repeated */ Any, Any]): Any = js.native
    
    def removeFloatingIp(id: String, cb: js.Function1[/* repeated */ Any, Any]): Any = js.native
    
    def removeKeyPair(id: String, cb: js.Function1[/* repeated */ Any, Any]): Any = js.native
    
    def removeSecurityGroup(security_group_name: String, instance_id: String, cb: js.Function1[/* repeated */ Any, Any]): Any = js.native
    
    def removeServer(id: String, cb: js.Function1[/* repeated */ Any, Any]): Any = js.native
    
    def renameServer(id: String, name: String, cb: js.Function1[/* repeated */ Any, Any]): Any = js.native
    
    var request: Any = js.native
    
    var request_id: Any = js.native
    
    def resizeServer(id: String, flavor: Any, cb: js.Function1[/* repeated */ Any, Any]): Any = js.native
    
    def resumeServer(is: String, cb: js.Function1[/* repeated */ Any, Any]): Any = js.native
    
    def revertResizeServer(id: String, cb: js.Function1[/* repeated */ Any, Any]): Any = js.native
    
    def setImageMetaData(id: String, data: Any, cb: js.Function1[/* repeated */ Any, Any]): Any = js.native
    
    def setLogger(logger: Any): Unit = js.native
    
    def setMangler(mangle_lib: Any): Unit = js.native
    
    def setQuotaSet(project_id: String, data: Any, cb: js.Function1[/* repeated */ Any, Any]): Any = js.native
    
    def setRequest(request_lib: Any): Unit = js.native
    
    def setRequestID(request_id: Any): Unit = js.native
    
    def setServerMetadata(id: String, data: Any, cb: js.Function1[/* repeated */ Any, Any]): Any = js.native
    
    def setTimeout(new_timeout: Any): Unit = js.native
    
    def setUserName(user_name: String): Unit = js.native
    
    def startServer(id: String, cb: js.Function1[/* repeated */ Any, Any]): Any = js.native
    
    def stopServer(id: String, cb: js.Function1[/* repeated */ Any, Any]): Any = js.native
    
    def suspendServer(id: String, cb: js.Function1[/* repeated */ Any, Any]): Any = js.native
    
    var timeout: Any = js.native
    
    var token: Any = js.native
    
    var url: Any = js.native
    
    var user_name: Any = js.native
  }
  
  @JSImport("openstack-wrapper", "Octavia")
  @js.native
  open class Octavia protected () extends StObject {
    def this(endpoint_url: String, auth_token: String) = this()
    
    def createLBHealthMonitor(
      pool_id: String,
      `type`: Any,
      delay: Double,
      timeout: Double,
      max_retries: Double,
      data: Any,
      cb: js.Function1[/* repeated */ Any, Any]
    ): Any = js.native
    
    def createLBListener(loadbalancer_id: String, protocol: Any, data: Any, cb: js.Function1[/* repeated */ Any, Any]): Any = js.native
    
    def createLBPool(protocol: Any, lb_algorithm: Any, data: Any, cb: js.Function1[/* repeated */ Any, Any]): Any = js.native
    
    def createLBPoolMember(
      pool_id: String,
      address: Any,
      protocol_port: Any,
      data: Any,
      cb: js.Function1[/* repeated */ Any, Any]
    ): Any = js.native
    
    def createLoadBalancer(project_id: String, data: Any, cb: js.Function1[/* repeated */ Any, Any]): Any = js.native
    
    def getLBHealthMonitor(health_monitor_id: String, cb: js.Function1[/* repeated */ Any, Any]): Any = js.native
    
    def getLBListener(listener_id: String, cb: js.Function1[/* repeated */ Any, Any]): Any = js.native
    
    def getLBPool(pool_id: String, cb: js.Function1[/* repeated */ Any, Any]): Any = js.native
    
    def getLBPoolMember(pool_id: String, member_id: String, cb: js.Function1[/* repeated */ Any, Any]): Any = js.native
    
    def getLBStats(lb_id: String, cb: js.Function1[/* repeated */ Any, Any]): Any = js.native
    
    def getLoadBalancer(lb_id: String, cb: js.Function1[/* repeated */ Any, Any]): Any = js.native
    
    def getRequestOptions(path: String, json_value: Any): RequestOption = js.native
    
    def listLBHealthMonitors(cb: js.Function1[/* repeated */ Any, Any]): Any = js.native
    
    def listLBListeners(cb: js.Function1[/* repeated */ Any, Any]): Any = js.native
    
    def listLBPoolMembers(pool_id: String, cb: js.Function1[/* repeated */ Any, Any]): Any = js.native
    
    def listLBPools(cb: js.Function1[/* repeated */ Any, Any]): Any = js.native
    
    def listLoadBalancers(cb: js.Function1[/* repeated */ Any, Any]): Any = js.native
    
    var logger: Any = js.native
    
    def removeLBHealthMonitor(health_monitor_id: String, cb: js.Function1[/* repeated */ Any, Any]): Any = js.native
    
    def removeLBListener(listener_id: String, cb: js.Function1[/* repeated */ Any, Any]): Any = js.native
    
    def removeLBPool(pool_id: String, cb: js.Function1[/* repeated */ Any, Any]): Any = js.native
    
    def removeLBPoolMember(pool_id: String, member_id: String, cb: js.Function1[/* repeated */ Any, Any]): Any = js.native
    
    def removeLoadBalancer(lb_id: String, cb: js.Function1[/* repeated */ Any, Any]): Any = js.native
    
    var request_id: Any = js.native
    
    var retries: Double = js.native
    
    var retry_delay: Double = js.native
    
    def setLogger(logger: Any): Unit = js.native
    
    def setRequest(request_lib: Any): Unit = js.native
    
    def setRequestID(request_id: Any): Unit = js.native
    
    def setRetries(retries: Double): Unit = js.native
    
    def setRetryDelay(retry_delay: Double): Unit = js.native
    
    def setTimeout(new_timeout: Any): Unit = js.native
    
    def setUserName(user_name: String): Unit = js.native
    
    var timeout: Any = js.native
    
    var token: Any = js.native
    
    def updateLBHealthMonitor(health_monitor_id: String, data: Any, cb: js.Function1[/* repeated */ Any, Any]): Any = js.native
    
    def updateLBListener(listener_id: String, data: Any, cb: js.Function1[/* repeated */ Any, Any]): Any = js.native
    
    def updateLBPool(pool_id: String, data: Any, cb: js.Function1[/* repeated */ Any, Any]): Any = js.native
    
    def updateLBPoolMember(pool_id: String, member_id: String, data: Any, cb: js.Function1[/* repeated */ Any, Any]): Any = js.native
    
    def updateLoadBalancer(lb_id: String, data: Any, cb: js.Function1[/* repeated */ Any, Any]): Any = js.native
    
    var url: Any = js.native
    
    var user_name: String = js.native
  }
  
  inline def getSimpleProject(
    username: String,
    password: String,
    project_id: String,
    keystone_url: String,
    cb: js.Function1[/* repeated */ Any, Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("getSimpleProject")(username.asInstanceOf[js.Any], password.asInstanceOf[js.Any], project_id.asInstanceOf[js.Any], keystone_url.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  trait Project extends StObject {
    
    var general_token: String
    
    var glance: Glance
    
    var neutron: Neutron
    
    var nova: Nova
    
    var octavia: Octavia
    
    var project_token: String
  }
  object Project {
    
    inline def apply(
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
    
    extension [Self <: Project](x: Self) {
      
      inline def setGeneral_token(value: String): Self = StObject.set(x, "general_token", value.asInstanceOf[js.Any])
      
      inline def setGlance(value: Glance): Self = StObject.set(x, "glance", value.asInstanceOf[js.Any])
      
      inline def setNeutron(value: Neutron): Self = StObject.set(x, "neutron", value.asInstanceOf[js.Any])
      
      inline def setNova(value: Nova): Self = StObject.set(x, "nova", value.asInstanceOf[js.Any])
      
      inline def setOctavia(value: Octavia): Self = StObject.set(x, "octavia", value.asInstanceOf[js.Any])
      
      inline def setProject_token(value: String): Self = StObject.set(x, "project_token", value.asInstanceOf[js.Any])
    }
  }
  
  trait RequestOption extends StObject {
    
    var headers: js.UndefOr[Any] = js.undefined
    
    var json: js.UndefOr[Any] = js.undefined
    
    var metricLogger: js.UndefOr[Any] = js.undefined
    
    var metricRequestID: js.UndefOr[String] = js.undefined
    
    var metricUserName: js.UndefOr[String] = js.undefined
    
    var timeout: js.UndefOr[Any] = js.undefined
    
    var uri: js.UndefOr[String] = js.undefined
  }
  object RequestOption {
    
    inline def apply(): RequestOption = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RequestOption]
    }
    
    extension [Self <: RequestOption](x: Self) {
      
      inline def setHeaders(value: Any): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      inline def setJson(value: Any): Self = StObject.set(x, "json", value.asInstanceOf[js.Any])
      
      inline def setJsonUndefined: Self = StObject.set(x, "json", js.undefined)
      
      inline def setMetricLogger(value: Any): Self = StObject.set(x, "metricLogger", value.asInstanceOf[js.Any])
      
      inline def setMetricLoggerUndefined: Self = StObject.set(x, "metricLogger", js.undefined)
      
      inline def setMetricRequestID(value: String): Self = StObject.set(x, "metricRequestID", value.asInstanceOf[js.Any])
      
      inline def setMetricRequestIDUndefined: Self = StObject.set(x, "metricRequestID", js.undefined)
      
      inline def setMetricUserName(value: String): Self = StObject.set(x, "metricUserName", value.asInstanceOf[js.Any])
      
      inline def setMetricUserNameUndefined: Self = StObject.set(x, "metricUserName", js.undefined)
      
      inline def setTimeout(value: Any): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
      
      inline def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
      
      inline def setUriUndefined: Self = StObject.set(x, "uri", js.undefined)
    }
  }
}
