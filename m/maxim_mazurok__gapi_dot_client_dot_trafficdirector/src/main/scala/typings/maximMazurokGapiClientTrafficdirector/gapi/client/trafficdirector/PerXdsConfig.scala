package typings.maximMazurokGapiClientTrafficdirector.gapi.client.trafficdirector

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PerXdsConfig extends StObject {
  
  var clusterConfig: js.UndefOr[ClustersConfigDump] = js.undefined
  
  var listenerConfig: js.UndefOr[ListenersConfigDump] = js.undefined
  
  var routeConfig: js.UndefOr[RoutesConfigDump] = js.undefined
  
  var scopedRouteConfig: js.UndefOr[ScopedRoutesConfigDump] = js.undefined
  
  var status: js.UndefOr[String] = js.undefined
}
object PerXdsConfig {
  
  inline def apply(): PerXdsConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PerXdsConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PerXdsConfig] (val x: Self) extends AnyVal {
    
    inline def setClusterConfig(value: ClustersConfigDump): Self = StObject.set(x, "clusterConfig", value.asInstanceOf[js.Any])
    
    inline def setClusterConfigUndefined: Self = StObject.set(x, "clusterConfig", js.undefined)
    
    inline def setListenerConfig(value: ListenersConfigDump): Self = StObject.set(x, "listenerConfig", value.asInstanceOf[js.Any])
    
    inline def setListenerConfigUndefined: Self = StObject.set(x, "listenerConfig", js.undefined)
    
    inline def setRouteConfig(value: RoutesConfigDump): Self = StObject.set(x, "routeConfig", value.asInstanceOf[js.Any])
    
    inline def setRouteConfigUndefined: Self = StObject.set(x, "routeConfig", js.undefined)
    
    inline def setScopedRouteConfig(value: ScopedRoutesConfigDump): Self = StObject.set(x, "scopedRouteConfig", value.asInstanceOf[js.Any])
    
    inline def setScopedRouteConfigUndefined: Self = StObject.set(x, "scopedRouteConfig", js.undefined)
    
    inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
