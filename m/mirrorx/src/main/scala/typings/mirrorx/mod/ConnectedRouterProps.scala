package typings.mirrorx.mod

import typings.history.mod.History
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConnectedRouterProps[State] extends StObject {
  
  var history: js.UndefOr[History] = js.undefined
  
  var store: js.UndefOr[Any] = js.undefined
}
object ConnectedRouterProps {
  
  inline def apply[State](): ConnectedRouterProps[State] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConnectedRouterProps[State]]
  }
  
  extension [Self <: ConnectedRouterProps[?], State](x: Self & ConnectedRouterProps[State]) {
    
    inline def setHistory(value: History): Self = StObject.set(x, "history", value.asInstanceOf[js.Any])
    
    inline def setHistoryUndefined: Self = StObject.set(x, "history", js.undefined)
    
    inline def setStore(value: Any): Self = StObject.set(x, "store", value.asInstanceOf[js.Any])
    
    inline def setStoreUndefined: Self = StObject.set(x, "store", js.undefined)
  }
}
