package typings.miniStore.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StoreProp[S] extends js.Object {
  var store: Store[S] = js.native
}

object StoreProp {
  @scala.inline
  def apply[S](store: Store[S]): StoreProp[S] = {
    val __obj = js.Dynamic.literal(store = store.asInstanceOf[js.Any])
    __obj.asInstanceOf[StoreProp[S]]
  }
  @scala.inline
  implicit class StorePropOps[Self <: StoreProp[_], S] (val x: Self with StoreProp[S]) extends AnyVal {
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
    def setStore(value: Store[S]): Self = this.set("store", value.asInstanceOf[js.Any])
  }
  
}

