package typings.pigpio.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Alert extends js.Object {
  /**
    * boolean specifying whether or not alert events are emitted when the GPIO changes state (optional, default false)
    */
  var alert: js.UndefOr[Boolean] = js.native
  /**
    * interrupt edge for inputs. RISING_EDGE, FALLING_EDGE, or EITHER_EDGE (optional, no default)
    */
  var edge: js.UndefOr[Double] = js.native
  /**
    * INPUT, OUTPUT, ALT0, ALT1, ALT2, ALT3, ALT4, or ALT5 (optional, no default)
    */
  var mode: js.UndefOr[Double] = js.native
  /**
    * PUD_OFF, PUD_DOWN, or PUD_UP (optional, no default)
    */
  var pullUpDown: js.UndefOr[Double] = js.native
  /**
    * interrupt timeout in milliseconds (optional, defaults to 0 meaning no timeout if edge specified)
    */
  var timeout: js.UndefOr[Double] = js.native
}

object Alert {
  @scala.inline
  def apply(): Alert = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Alert]
  }
  @scala.inline
  implicit class AlertOps[Self <: Alert] (val x: Self) extends AnyVal {
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
    def setAlert(value: Boolean): Self = this.set("alert", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlert: Self = this.set("alert", js.undefined)
    @scala.inline
    def setEdge(value: Double): Self = this.set("edge", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEdge: Self = this.set("edge", js.undefined)
    @scala.inline
    def setMode(value: Double): Self = this.set("mode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMode: Self = this.set("mode", js.undefined)
    @scala.inline
    def setPullUpDown(value: Double): Self = this.set("pullUpDown", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePullUpDown: Self = this.set("pullUpDown", js.undefined)
    @scala.inline
    def setTimeout(value: Double): Self = this.set("timeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimeout: Self = this.set("timeout", js.undefined)
  }
  
}

