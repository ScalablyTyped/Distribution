package typings.next.anon

import typings.react.mod.ComponentType
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<next.next/dist/next-server/lib/router/router.CompletePrivateRouteInfo, 'Component' | 'err'> */
trait PickCompletePrivateRouteI extends StObject {
  
  var Component: ComponentType[js.Object]
  
  var err: js.UndefOr[Error] = js.undefined
}
object PickCompletePrivateRouteI {
  
  @scala.inline
  def apply(Component: ComponentType[js.Object]): PickCompletePrivateRouteI = {
    val __obj = js.Dynamic.literal(Component = Component.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickCompletePrivateRouteI]
  }
  
  @scala.inline
  implicit class PickCompletePrivateRouteIMutableBuilder[Self <: PickCompletePrivateRouteI] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComponent(value: ComponentType[js.Object]): Self = StObject.set(x, "Component", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErr(value: Error): Self = StObject.set(x, "err", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrUndefined: Self = StObject.set(x, "err", js.undefined)
  }
}
