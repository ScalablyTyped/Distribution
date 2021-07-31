package typings.mirrorx.mod

import typings.history.mod.History
import typings.history.mod.LocationState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConnectedRouterProps[State] extends StObject {
  
  var history: js.UndefOr[History[LocationState]] = js.undefined
  
  var store: js.UndefOr[js.Any] = js.undefined
}
object ConnectedRouterProps {
  
  @scala.inline
  def apply[State](): ConnectedRouterProps[State] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConnectedRouterProps[State]]
  }
  
  @scala.inline
  implicit class ConnectedRouterPropsMutableBuilder[Self <: ConnectedRouterProps[?], State] (val x: Self & ConnectedRouterProps[State]) extends AnyVal {
    
    @scala.inline
    def setHistory(value: History[LocationState]): Self = StObject.set(x, "history", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHistoryUndefined: Self = StObject.set(x, "history", js.undefined)
    
    @scala.inline
    def setStore(value: js.Any): Self = StObject.set(x, "store", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStoreUndefined: Self = StObject.set(x, "store", js.undefined)
  }
}
