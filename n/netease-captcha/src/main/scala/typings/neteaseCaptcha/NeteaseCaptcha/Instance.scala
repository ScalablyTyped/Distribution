package typings.neteaseCaptcha.NeteaseCaptcha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Instance extends js.Object {
  /**
    * Available when the mode is set to 'popup' - opens the popup to accept verification
    */
  var popUp: js.UndefOr[js.Function0[Unit]] = js.native
  /**
    * Destroy the current instance
    */
  def destroy(): Unit = js.native
  /**
    * Refresh the instance to get new verification information
    */
  def refresh(): Unit = js.native
}

object Instance {
  @scala.inline
  def apply(destroy: () => Unit, refresh: () => Unit): Instance = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), refresh = js.Any.fromFunction0(refresh))
    __obj.asInstanceOf[Instance]
  }
  @scala.inline
  implicit class InstanceOps[Self <: Instance] (val x: Self) extends AnyVal {
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
    def setDestroy(value: () => Unit): Self = this.set("destroy", js.Any.fromFunction0(value))
    @scala.inline
    def setRefresh(value: () => Unit): Self = this.set("refresh", js.Any.fromFunction0(value))
    @scala.inline
    def setPopUp(value: () => Unit): Self = this.set("popUp", js.Any.fromFunction0(value))
    @scala.inline
    def deletePopUp: Self = this.set("popUp", js.undefined)
  }
  
}

