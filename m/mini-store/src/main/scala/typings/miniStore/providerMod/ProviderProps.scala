package typings.miniStore.providerMod

import typings.miniStore.typesMod.Store
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProviderProps extends js.Object {
  var store: Store[js.Object] = js.native
}

object ProviderProps {
  @scala.inline
  def apply(store: Store[js.Object]): ProviderProps = {
    val __obj = js.Dynamic.literal(store = store.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProviderProps]
  }
  @scala.inline
  implicit class ProviderPropsOps[Self <: ProviderProps] (val x: Self) extends AnyVal {
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
    def setStore(value: Store[js.Object]): Self = this.set("store", value.asInstanceOf[js.Any])
  }
  
}

