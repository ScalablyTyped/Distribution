package typings.pkcs11js.Pkcs11Js

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MechanismInfo extends js.Object {
  var flags: Double = js.native
  var maxKeySize: Double = js.native
  var minKeySize: Double = js.native
}

object MechanismInfo {
  @scala.inline
  def apply(flags: Double, maxKeySize: Double, minKeySize: Double): MechanismInfo = {
    val __obj = js.Dynamic.literal(flags = flags.asInstanceOf[js.Any], maxKeySize = maxKeySize.asInstanceOf[js.Any], minKeySize = minKeySize.asInstanceOf[js.Any])
    __obj.asInstanceOf[MechanismInfo]
  }
  @scala.inline
  implicit class MechanismInfoOps[Self <: MechanismInfo] (val x: Self) extends AnyVal {
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
    def setFlags(value: Double): Self = this.set("flags", value.asInstanceOf[js.Any])
    @scala.inline
    def setMaxKeySize(value: Double): Self = this.set("maxKeySize", value.asInstanceOf[js.Any])
    @scala.inline
    def setMinKeySize(value: Double): Self = this.set("minKeySize", value.asInstanceOf[js.Any])
  }
  
}

