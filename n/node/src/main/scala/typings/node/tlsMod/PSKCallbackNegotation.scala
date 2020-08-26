package typings.node.tlsMod

import typings.node.NodeJS.TypedArray
import typings.std.DataView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PSKCallbackNegotation extends js.Object {
  var identitty: String = js.native
  var psk: DataView | TypedArray = js.native
}

object PSKCallbackNegotation {
  @scala.inline
  def apply(identitty: String, psk: DataView | TypedArray): PSKCallbackNegotation = {
    val __obj = js.Dynamic.literal(identitty = identitty.asInstanceOf[js.Any], psk = psk.asInstanceOf[js.Any])
    __obj.asInstanceOf[PSKCallbackNegotation]
  }
  @scala.inline
  implicit class PSKCallbackNegotationOps[Self <: PSKCallbackNegotation] (val x: Self) extends AnyVal {
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
    def setIdentitty(value: String): Self = this.set("identitty", value.asInstanceOf[js.Any])
    @scala.inline
    def setPsk(value: DataView | TypedArray): Self = this.set("psk", value.asInstanceOf[js.Any])
  }
  
}

