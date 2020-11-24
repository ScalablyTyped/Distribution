package typings.maximMazurokGapiClientTrafficdirector.gapi.client.trafficdirector

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ScopedRoutesConfigDump extends js.Object {
  
  /** The dynamically loaded scoped route configs. */
  var dynamicScopedRouteConfigs: js.UndefOr[js.Array[DynamicScopedRouteConfigs]] = js.native
  
  /** The statically loaded scoped route configs. */
  var inlineScopedRouteConfigs: js.UndefOr[js.Array[InlineScopedRouteConfigs]] = js.native
}
object ScopedRoutesConfigDump {
  
  @scala.inline
  def apply(): ScopedRoutesConfigDump = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScopedRoutesConfigDump]
  }
  
  @scala.inline
  implicit class ScopedRoutesConfigDumpOps[Self <: ScopedRoutesConfigDump] (val x: Self) extends AnyVal {
    
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
    def setDynamicScopedRouteConfigsVarargs(value: DynamicScopedRouteConfigs*): Self = this.set("dynamicScopedRouteConfigs", js.Array(value :_*))
    
    @scala.inline
    def setDynamicScopedRouteConfigs(value: js.Array[DynamicScopedRouteConfigs]): Self = this.set("dynamicScopedRouteConfigs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDynamicScopedRouteConfigs: Self = this.set("dynamicScopedRouteConfigs", js.undefined)
    
    @scala.inline
    def setInlineScopedRouteConfigsVarargs(value: InlineScopedRouteConfigs*): Self = this.set("inlineScopedRouteConfigs", js.Array(value :_*))
    
    @scala.inline
    def setInlineScopedRouteConfigs(value: js.Array[InlineScopedRouteConfigs]): Self = this.set("inlineScopedRouteConfigs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInlineScopedRouteConfigs: Self = this.set("inlineScopedRouteConfigs", js.undefined)
  }
}
