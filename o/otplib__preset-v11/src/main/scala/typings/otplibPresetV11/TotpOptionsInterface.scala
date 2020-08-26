package typings.otplibPresetV11

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TotpOptionsInterface extends HotpOptionsInterface {
  var epoch: js.UndefOr[js.Any] = js.native
  var step: js.UndefOr[Double] = js.native
  var window: js.UndefOr[Double | js.Array[Double]] = js.native
}

object TotpOptionsInterface {
  @scala.inline
  def apply(): TotpOptionsInterface = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TotpOptionsInterface]
  }
  @scala.inline
  implicit class TotpOptionsInterfaceOps[Self <: TotpOptionsInterface] (val x: Self) extends AnyVal {
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
    def setEpoch(value: js.Any): Self = this.set("epoch", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEpoch: Self = this.set("epoch", js.undefined)
    @scala.inline
    def setStep(value: Double): Self = this.set("step", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStep: Self = this.set("step", js.undefined)
    @scala.inline
    def setWindowVarargs(value: Double*): Self = this.set("window", js.Array(value :_*))
    @scala.inline
    def setWindow(value: Double | js.Array[Double]): Self = this.set("window", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWindow: Self = this.set("window", js.undefined)
  }
  
}

