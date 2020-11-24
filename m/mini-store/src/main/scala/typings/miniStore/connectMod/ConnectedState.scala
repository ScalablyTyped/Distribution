package typings.miniStore.connectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConnectedState[TStateProps, Store, TOwnProps] extends js.Object {
  
  var props: TOwnProps = js.native
  
  var store: Store = js.native
  
  var subscribed: TStateProps = js.native
}
object ConnectedState {
  
  @scala.inline
  def apply[TStateProps, Store, TOwnProps](props: TOwnProps, store: Store, subscribed: TStateProps): ConnectedState[TStateProps, Store, TOwnProps] = {
    val __obj = js.Dynamic.literal(props = props.asInstanceOf[js.Any], store = store.asInstanceOf[js.Any], subscribed = subscribed.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConnectedState[TStateProps, Store, TOwnProps]]
  }
  
  @scala.inline
  implicit class ConnectedStateOps[Self <: ConnectedState[_, _, _], TStateProps, Store, TOwnProps] (val x: Self with (ConnectedState[TStateProps, Store, TOwnProps])) extends AnyVal {
    
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
    def setProps(value: TOwnProps): Self = this.set("props", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStore(value: Store): Self = this.set("store", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubscribed(value: TStateProps): Self = this.set("subscribed", value.asInstanceOf[js.Any])
  }
}
