package typings.nodeJose.mod.JWA

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SignReturn extends js.Object {
  var data: Buffer = js.native
   // the data passed into the sign function
  var mac: Buffer = js.native
}

object SignReturn {
  @scala.inline
  def apply(data: Buffer, mac: Buffer): SignReturn = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], mac = mac.asInstanceOf[js.Any])
    __obj.asInstanceOf[SignReturn]
  }
  @scala.inline
  implicit class SignReturnOps[Self <: SignReturn] (val x: Self) extends AnyVal {
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
    def setData(value: Buffer): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def setMac(value: Buffer): Self = this.set("mac", value.asInstanceOf[js.Any])
  }
  
}

