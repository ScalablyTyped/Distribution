package typings.next.routeLoaderMod

import typings.react.mod.ComponentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LoadedRouteSuccess
  extends LoadedEntrypointSuccess
     with RouteLoaderEntry {
  
  var styles: js.Array[RouteStyleSheet] = js.native
}
object LoadedRouteSuccess {
  
  @scala.inline
  def apply(component: ComponentType[js.Object], exports: js.Any, styles: js.Array[RouteStyleSheet]): LoadedRouteSuccess = {
    val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], exports = exports.asInstanceOf[js.Any], styles = styles.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoadedRouteSuccess]
  }
  
  @scala.inline
  implicit class LoadedRouteSuccessOps[Self <: LoadedRouteSuccess] (val x: Self) extends AnyVal {
    
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
    def setStylesVarargs(value: RouteStyleSheet*): Self = this.set("styles", js.Array(value :_*))
    
    @scala.inline
    def setStyles(value: js.Array[RouteStyleSheet]): Self = this.set("styles", value.asInstanceOf[js.Any])
  }
}
