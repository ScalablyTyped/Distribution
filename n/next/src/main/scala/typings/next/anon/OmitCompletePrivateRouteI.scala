package typings.next.anon

import typings.next.nextBooleans.`true`
import typings.next.routerMod.PrivateRouteInfo
import typings.react.mod.ComponentType
import typings.std.Error
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Omit<next.next/dist/next-server/lib/router/router.CompletePrivateRouteInfo, 'styleSheets'> & {  initial :true} */
@js.native
trait OmitCompletePrivateRouteI extends PrivateRouteInfo {
  
  var Component: ComponentType[js.Object] = js.native
  
  var __N_SSG: js.UndefOr[Boolean] = js.native
  
  var __N_SSP: js.UndefOr[Boolean] = js.native
  
  var err: js.UndefOr[Error] = js.native
  
  var error: js.UndefOr[js.Any] = js.native
  
  var initial: `true` = js.native
  
  var props: js.UndefOr[Record[String, _]] = js.native
}
object OmitCompletePrivateRouteI {
  
  @scala.inline
  def apply(Component: ComponentType[js.Object], initial: `true`): OmitCompletePrivateRouteI = {
    val __obj = js.Dynamic.literal(Component = Component.asInstanceOf[js.Any], initial = initial.asInstanceOf[js.Any])
    __obj.asInstanceOf[OmitCompletePrivateRouteI]
  }
  
  @scala.inline
  implicit class OmitCompletePrivateRouteIMutableBuilder[Self <: OmitCompletePrivateRouteI] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComponent(value: ComponentType[js.Object]): Self = StObject.set(x, "Component", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErr(value: Error): Self = StObject.set(x, "err", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrUndefined: Self = StObject.set(x, "err", js.undefined)
    
    @scala.inline
    def setError(value: js.Any): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    @scala.inline
    def setInitial(value: `true`): Self = StObject.set(x, "initial", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProps(value: Record[String, _]): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPropsUndefined: Self = StObject.set(x, "props", js.undefined)
    
    @scala.inline
    def set__N_SSG(value: Boolean): Self = StObject.set(x, "__N_SSG", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set__N_SSGUndefined: Self = StObject.set(x, "__N_SSG", js.undefined)
    
    @scala.inline
    def set__N_SSP(value: Boolean): Self = StObject.set(x, "__N_SSP", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set__N_SSPUndefined: Self = StObject.set(x, "__N_SSP", js.undefined)
  }
}
