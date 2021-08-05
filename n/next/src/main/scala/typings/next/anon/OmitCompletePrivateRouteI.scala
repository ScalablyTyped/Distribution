package typings.next.anon

import typings.next.nextBooleans.`true`
import typings.next.routerMod.PrivateRouteInfo
import typings.react.mod.ComponentType
import typings.std.Error
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Omit<next.next/dist/next-server/lib/router/router.CompletePrivateRouteInfo, 'styleSheets'> & {  initial :true} */
trait OmitCompletePrivateRouteI
  extends StObject
     with PrivateRouteInfo {
  
  var Component: ComponentType[js.Object]
  
  var __N_SSG: js.UndefOr[Boolean] = js.undefined
  
  var __N_SSP: js.UndefOr[Boolean] = js.undefined
  
  var err: js.UndefOr[Error] = js.undefined
  
  var error: js.UndefOr[js.Any] = js.undefined
  
  var initial: `true`
  
  var props: js.UndefOr[Record[String, js.Any]] = js.undefined
}
object OmitCompletePrivateRouteI {
  
  inline def apply(Component: ComponentType[js.Object]): OmitCompletePrivateRouteI = {
    val __obj = js.Dynamic.literal(Component = Component.asInstanceOf[js.Any], initial = true)
    __obj.asInstanceOf[OmitCompletePrivateRouteI]
  }
  
  extension [Self <: OmitCompletePrivateRouteI](x: Self) {
    
    inline def setComponent(value: ComponentType[js.Object]): Self = StObject.set(x, "Component", value.asInstanceOf[js.Any])
    
    inline def setErr(value: Error): Self = StObject.set(x, "err", value.asInstanceOf[js.Any])
    
    inline def setErrUndefined: Self = StObject.set(x, "err", js.undefined)
    
    inline def setError(value: js.Any): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    inline def setInitial(value: `true`): Self = StObject.set(x, "initial", value.asInstanceOf[js.Any])
    
    inline def setProps(value: Record[String, js.Any]): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    
    inline def setPropsUndefined: Self = StObject.set(x, "props", js.undefined)
    
    inline def set__N_SSG(value: Boolean): Self = StObject.set(x, "__N_SSG", value.asInstanceOf[js.Any])
    
    inline def set__N_SSGUndefined: Self = StObject.set(x, "__N_SSG", js.undefined)
    
    inline def set__N_SSP(value: Boolean): Self = StObject.set(x, "__N_SSP", value.asInstanceOf[js.Any])
    
    inline def set__N_SSPUndefined: Self = StObject.set(x, "__N_SSP", js.undefined)
  }
}
