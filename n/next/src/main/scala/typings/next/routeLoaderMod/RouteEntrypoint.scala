package typings.next.routeLoaderMod

import typings.react.mod.ComponentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.next.routeLoaderMod.LoadedEntrypointSuccess
  - typings.next.routeLoaderMod.LoadedEntrypointFailure
*/
trait RouteEntrypoint extends js.Object
object RouteEntrypoint {
  
  @scala.inline
  def LoadedEntrypointSuccess(component: ComponentType[js.Object], exports: js.Any): RouteEntrypoint = {
    val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], exports = exports.asInstanceOf[js.Any])
    __obj.asInstanceOf[RouteEntrypoint]
  }
  
  @scala.inline
  def LoadedEntrypointFailure(error: js.Any): RouteEntrypoint = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any])
    __obj.asInstanceOf[RouteEntrypoint]
  }
}
