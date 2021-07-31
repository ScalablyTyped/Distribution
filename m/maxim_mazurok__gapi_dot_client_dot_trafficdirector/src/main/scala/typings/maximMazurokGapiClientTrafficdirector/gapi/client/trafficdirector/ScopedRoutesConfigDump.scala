package typings.maximMazurokGapiClientTrafficdirector.gapi.client.trafficdirector

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScopedRoutesConfigDump extends StObject {
  
  /** The dynamically loaded scoped route configs. */
  var dynamicScopedRouteConfigs: js.UndefOr[js.Array[DynamicScopedRouteConfigs]] = js.undefined
  
  /** The statically loaded scoped route configs. */
  var inlineScopedRouteConfigs: js.UndefOr[js.Array[InlineScopedRouteConfigs]] = js.undefined
}
object ScopedRoutesConfigDump {
  
  @scala.inline
  def apply(): ScopedRoutesConfigDump = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScopedRoutesConfigDump]
  }
  
  @scala.inline
  implicit class ScopedRoutesConfigDumpMutableBuilder[Self <: ScopedRoutesConfigDump] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDynamicScopedRouteConfigs(value: js.Array[DynamicScopedRouteConfigs]): Self = StObject.set(x, "dynamicScopedRouteConfigs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDynamicScopedRouteConfigsUndefined: Self = StObject.set(x, "dynamicScopedRouteConfigs", js.undefined)
    
    @scala.inline
    def setDynamicScopedRouteConfigsVarargs(value: DynamicScopedRouteConfigs*): Self = StObject.set(x, "dynamicScopedRouteConfigs", js.Array(value :_*))
    
    @scala.inline
    def setInlineScopedRouteConfigs(value: js.Array[InlineScopedRouteConfigs]): Self = StObject.set(x, "inlineScopedRouteConfigs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInlineScopedRouteConfigsUndefined: Self = StObject.set(x, "inlineScopedRouteConfigs", js.undefined)
    
    @scala.inline
    def setInlineScopedRouteConfigsVarargs(value: InlineScopedRouteConfigs*): Self = StObject.set(x, "inlineScopedRouteConfigs", js.Array(value :_*))
  }
}
