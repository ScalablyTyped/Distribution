package typings.pkcs11js.Pkcs11Js

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Mechanism extends js.Object {
  var mechanism: Double = js.native
  var parameter: js.UndefOr[Buffer | IParams] = js.native
}

object Mechanism {
  @scala.inline
  def apply(mechanism: Double): Mechanism = {
    val __obj = js.Dynamic.literal(mechanism = mechanism.asInstanceOf[js.Any])
    __obj.asInstanceOf[Mechanism]
  }
  @scala.inline
  implicit class MechanismOps[Self <: Mechanism] (val x: Self) extends AnyVal {
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
    def setMechanism(value: Double): Self = this.set("mechanism", value.asInstanceOf[js.Any])
    @scala.inline
    def setParameter(value: Buffer | IParams): Self = this.set("parameter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParameter: Self = this.set("parameter", js.undefined)
  }
  
}

