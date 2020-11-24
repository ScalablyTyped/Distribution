package typings.maximMazurokGapiClientTrafficdirector.gapi.client.trafficdirector

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RoutesConfigDump extends js.Object {
  
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
  implicit class RoutesConfigDumpOps[Self <: RoutesConfigDump] (val x: Self) extends AnyVal {
    
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
    def setDynamicRouteConfigsVarargs(value: DynamicRouteConfig*): Self = this.set("dynamicRouteConfigs", js.Array(value :_*))
    
    @scala.inline
    def setDynamicRouteConfigs(value: js.Array[DynamicRouteConfig]): Self = this.set("dynamicRouteConfigs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDynamicRouteConfigs: Self = this.set("dynamicRouteConfigs", js.undefined)
    
    @scala.inline
    def setStaticRouteConfigsVarargs(value: StaticRouteConfig*): Self = this.set("staticRouteConfigs", js.Array(value :_*))
    
    @scala.inline
    def setStaticRouteConfigs(value: js.Array[StaticRouteConfig]): Self = this.set("staticRouteConfigs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStaticRouteConfigs: Self = this.set("staticRouteConfigs", js.undefined)
  }
}
