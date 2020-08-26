package typings.p2.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RotationalLockEquationOptions extends js.Object {
  var angle: js.UndefOr[Double] = js.native
}

object RotationalLockEquationOptions {
  @scala.inline
  def apply(): RotationalLockEquationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RotationalLockEquationOptions]
  }
  @scala.inline
  implicit class RotationalLockEquationOptionsOps[Self <: RotationalLockEquationOptions] (val x: Self) extends AnyVal {
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
    def setAngle(value: Double): Self = this.set("angle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAngle: Self = this.set("angle", js.undefined)
  }
  
}

