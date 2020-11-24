package typings.maximMazurokGapiClientTrafficdirector.gapi.client.trafficdirector

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PerXdsConfig extends js.Object {
  
  var clusterConfig: js.UndefOr[ClustersConfigDump] = js.native
  
  var listenerConfig: js.UndefOr[ListenersConfigDump] = js.native
  
  var routeConfig: js.UndefOr[RoutesConfigDump] = js.native
  
  var scopedRouteConfig: js.UndefOr[ScopedRoutesConfigDump] = js.native
  
  var status: js.UndefOr[String] = js.native
}
object PerXdsConfig {
  
  @scala.inline
  def apply(): PerXdsConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PerXdsConfig]
  }
  
  @scala.inline
  implicit class PerXdsConfigOps[Self <: PerXdsConfig] (val x: Self) extends AnyVal {
    
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
    def setClusterConfig(value: ClustersConfigDump): Self = this.set("clusterConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClusterConfig: Self = this.set("clusterConfig", js.undefined)
    
    @scala.inline
    def setListenerConfig(value: ListenersConfigDump): Self = this.set("listenerConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteListenerConfig: Self = this.set("listenerConfig", js.undefined)
    
    @scala.inline
    def setRouteConfig(value: RoutesConfigDump): Self = this.set("routeConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRouteConfig: Self = this.set("routeConfig", js.undefined)
    
    @scala.inline
    def setScopedRouteConfig(value: ScopedRoutesConfigDump): Self = this.set("scopedRouteConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScopedRouteConfig: Self = this.set("scopedRouteConfig", js.undefined)
    
    @scala.inline
    def setStatus(value: String): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
  }
}
