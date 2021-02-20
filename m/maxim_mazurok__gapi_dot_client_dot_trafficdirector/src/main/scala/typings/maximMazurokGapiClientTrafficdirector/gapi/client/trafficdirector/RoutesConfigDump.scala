package typings.maximMazurokGapiClientTrafficdirector.gapi.client.trafficdirector

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RoutesConfigDump extends StObject {
  
  /** The dynamically loaded route configs. */
  var dynamicRouteConfigs: js.UndefOr[js.Array[DynamicRouteConfig]] = js.native
  
  /** The statically loaded route configs. */
  var staticRouteConfigs: js.UndefOr[js.Array[StaticRouteConfig]] = js.native
}
object RoutesConfigDump {
  
  @scala.inline
  def apply(): RoutesConfigDump = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RoutesConfigDump]
  }
  
  @scala.inline
  implicit class RoutesConfigDumpMutableBuilder[Self <: RoutesConfigDump] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDynamicRouteConfigs(value: js.Array[DynamicRouteConfig]): Self = StObject.set(x, "dynamicRouteConfigs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDynamicRouteConfigsUndefined: Self = StObject.set(x, "dynamicRouteConfigs", js.undefined)
    
    @scala.inline
    def setDynamicRouteConfigsVarargs(value: DynamicRouteConfig*): Self = StObject.set(x, "dynamicRouteConfigs", js.Array(value :_*))
    
    @scala.inline
    def setStaticRouteConfigs(value: js.Array[StaticRouteConfig]): Self = StObject.set(x, "staticRouteConfigs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStaticRouteConfigsUndefined: Self = StObject.set(x, "staticRouteConfigs", js.undefined)
    
    @scala.inline
    def setStaticRouteConfigsVarargs(value: StaticRouteConfig*): Self = StObject.set(x, "staticRouteConfigs", js.Array(value :_*))
  }
}
