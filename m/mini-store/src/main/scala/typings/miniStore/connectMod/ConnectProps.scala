package typings.miniStore.connectMod

import typings.react.mod.Ref
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConnectProps extends js.Object {
  var miniStoreForwardedRef: Ref[_] = js.native
}

object ConnectProps {
  @scala.inline
  def apply(): ConnectProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConnectProps]
  }
  @scala.inline
  implicit class ConnectPropsOps[Self <: ConnectProps] (val x: Self) extends AnyVal {
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
    def setMiniStoreForwardedRefFunction1(value: /* instance */ _ | Null => Unit): Self = this.set("miniStoreForwardedRef", js.Any.fromFunction1(value))
    @scala.inline
    def setMiniStoreForwardedRef(value: Ref[_]): Self = this.set("miniStoreForwardedRef", value.asInstanceOf[js.Any])
    @scala.inline
    def setMiniStoreForwardedRefNull: Self = this.set("miniStoreForwardedRef", null)
  }
  
}

