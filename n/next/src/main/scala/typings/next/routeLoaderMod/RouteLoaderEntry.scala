package typings.next.routeLoaderMod

import typings.react.mod.ComponentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.next.routeLoaderMod.LoadedRouteSuccess
  - typings.next.routeLoaderMod.LoadedRouteFailure
*/
trait RouteLoaderEntry extends js.Object
object RouteLoaderEntry {
  
  @scala.inline
  def LoadedRouteSuccess(component: ComponentType[js.Object], exports: js.Any, styles: js.Array[RouteStyleSheet]): RouteLoaderEntry = {
    val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], exports = exports.asInstanceOf[js.Any], styles = styles.asInstanceOf[js.Any])
    __obj.asInstanceOf[RouteLoaderEntry]
  }
  
  @scala.inline
  def LoadedRouteFailure(error: js.Any): RouteLoaderEntry = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any])
    __obj.asInstanceOf[RouteLoaderEntry]
  }
}
