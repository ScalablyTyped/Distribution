package typings.mirrorx.mod

import typings.history.mod.History
import typings.history.mod.LocationState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConnectedRouterProps[State] extends js.Object {
  
  var history: js.UndefOr[History[LocationState]] = js.native
  
  var store: js.UndefOr[js.Any] = js.native
}
object ConnectedRouterProps {
  
  @scala.inline
  def apply[State](): ConnectedRouterProps[State] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConnectedRouterProps[State]]
  }
  
  @scala.inline
  implicit class ConnectedRouterPropsOps[Self <: ConnectedRouterProps[_], State] (val x: Self with ConnectedRouterProps[State]) extends AnyVal {
    
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
    def setHistory(value: History[LocationState]): Self = this.set("history", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHistory: Self = this.set("history", js.undefined)
    
    @scala.inline
    def setStore(value: js.Any): Self = this.set("store", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStore: Self = this.set("store", js.undefined)
  }
}
