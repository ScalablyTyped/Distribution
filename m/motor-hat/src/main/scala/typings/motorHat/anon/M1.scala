package typings.motorHat.anon

import typings.motorHat.mod.MotorPins
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait M1 extends js.Object {
  var M1: MotorPins = js.native
  var M2: MotorPins = js.native
  var M3: MotorPins = js.native
  var M4: MotorPins = js.native
}

object M1 {
  @scala.inline
  def apply(M1: MotorPins, M2: MotorPins, M3: MotorPins, M4: MotorPins): M1 = {
    val __obj = js.Dynamic.literal(M1 = M1.asInstanceOf[js.Any], M2 = M2.asInstanceOf[js.Any], M3 = M3.asInstanceOf[js.Any], M4 = M4.asInstanceOf[js.Any])
    __obj.asInstanceOf[M1]
  }
  @scala.inline
  implicit class M1Ops[Self <: M1] (val x: Self) extends AnyVal {
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
    def setM1(value: MotorPins): Self = this.set("M1", value.asInstanceOf[js.Any])
    @scala.inline
    def setM2(value: MotorPins): Self = this.set("M2", value.asInstanceOf[js.Any])
    @scala.inline
    def setM3(value: MotorPins): Self = this.set("M3", value.asInstanceOf[js.Any])
    @scala.inline
    def setM4(value: MotorPins): Self = this.set("M4", value.asInstanceOf[js.Any])
  }
  
}

