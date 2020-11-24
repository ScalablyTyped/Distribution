package typings.next.buildMod

import typings.next.nextBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DynamicSsgRoute extends js.Object {
  
  var dataRoute: String = js.native
  
  var dataRouteRegex: String = js.native
  
  var fallback: String | Null | `false` = js.native
  
  var routeRegex: String = js.native
}
object DynamicSsgRoute {
  
  @scala.inline
  def apply(dataRoute: String, dataRouteRegex: String, routeRegex: String): DynamicSsgRoute = {
    val __obj = js.Dynamic.literal(dataRoute = dataRoute.asInstanceOf[js.Any], dataRouteRegex = dataRouteRegex.asInstanceOf[js.Any], routeRegex = routeRegex.asInstanceOf[js.Any])
    __obj.asInstanceOf[DynamicSsgRoute]
  }
  
  @scala.inline
  implicit class DynamicSsgRouteOps[Self <: DynamicSsgRoute] (val x: Self) extends AnyVal {
    
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
    def setDataRoute(value: String): Self = this.set("dataRoute", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataRouteRegex(value: String): Self = this.set("dataRouteRegex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRouteRegex(value: String): Self = this.set("routeRegex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFallback(value: String | `false`): Self = this.set("fallback", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFallbackNull: Self = this.set("fallback", null)
  }
}
