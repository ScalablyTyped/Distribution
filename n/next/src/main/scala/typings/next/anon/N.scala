package typings.next.anon

import typings.next.distSharedLibRouterRouterMod._HistoryState
import typings.next.nextBooleans.`false`
import typings.next.nextBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait N
  extends StObject
     with _HistoryState {
  
  var __N: js.UndefOr[`false`] = js.undefined
  
  var __NA: `true`
}
object N {
  
  inline def apply(): N = {
    val __obj = js.Dynamic.literal(__NA = true)
    __obj.asInstanceOf[N]
  }
  
  extension [Self <: N](x: Self) {
    
    inline def set__N(value: `false`): Self = StObject.set(x, "__N", value.asInstanceOf[js.Any])
    
    inline def set__NA(value: `true`): Self = StObject.set(x, "__NA", value.asInstanceOf[js.Any])
    
    inline def set__NUndefined: Self = StObject.set(x, "__N", js.undefined)
  }
}
