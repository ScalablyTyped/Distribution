package typings.next.routerMod

import typings.next.nextBooleans.`true`
import typings.next.pageLoaderMod.StyleSheetTuple
import typings.react.mod.ComponentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.next.anon.OmitCompletePrivateRouteI
  - typings.next.routerMod.CompletePrivateRouteInfo
*/
trait PrivateRouteInfo extends js.Object
object PrivateRouteInfo {
  
  @scala.inline
  def OmitCompletePrivateRouteI(Component: ComponentType[js.Object], initial: `true`): PrivateRouteInfo = {
    val __obj = js.Dynamic.literal(Component = Component.asInstanceOf[js.Any], initial = initial.asInstanceOf[js.Any])
    __obj.asInstanceOf[PrivateRouteInfo]
  }
  
  @scala.inline
  def CompletePrivateRouteInfo(Component: ComponentType[js.Object], styleSheets: js.Array[StyleSheetTuple]): PrivateRouteInfo = {
    val __obj = js.Dynamic.literal(Component = Component.asInstanceOf[js.Any], styleSheets = styleSheets.asInstanceOf[js.Any])
    __obj.asInstanceOf[PrivateRouteInfo]
  }
}
