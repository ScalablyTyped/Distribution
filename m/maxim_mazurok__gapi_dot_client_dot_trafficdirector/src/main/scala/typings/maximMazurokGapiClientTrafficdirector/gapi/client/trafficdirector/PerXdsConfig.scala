package typings.maximMazurokGapiClientTrafficdirector.gapi.client.trafficdirector

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PerXdsConfig extends StObject {
  
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
  implicit class PerXdsConfigMutableBuilder[Self <: PerXdsConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClusterConfig(value: ClustersConfigDump): Self = StObject.set(x, "clusterConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClusterConfigUndefined: Self = StObject.set(x, "clusterConfig", js.undefined)
    
    @scala.inline
    def setListenerConfig(value: ListenersConfigDump): Self = StObject.set(x, "listenerConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListenerConfigUndefined: Self = StObject.set(x, "listenerConfig", js.undefined)
    
    @scala.inline
    def setRouteConfig(value: RoutesConfigDump): Self = StObject.set(x, "routeConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRouteConfigUndefined: Self = StObject.set(x, "routeConfig", js.undefined)
    
    @scala.inline
    def setScopedRouteConfig(value: ScopedRoutesConfigDump): Self = StObject.set(x, "scopedRouteConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScopedRouteConfigUndefined: Self = StObject.set(x, "scopedRouteConfig", js.undefined)
    
    @scala.inline
    def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
