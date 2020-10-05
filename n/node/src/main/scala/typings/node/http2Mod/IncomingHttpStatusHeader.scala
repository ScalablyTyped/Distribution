package typings.node.http2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IncomingHttpStatusHeader extends js.Object {
  @JSName(":status")
  var Colonstatus: js.UndefOr[Double] = js.native
}

object IncomingHttpStatusHeader {
  @scala.inline
  def apply(): IncomingHttpStatusHeader = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IncomingHttpStatusHeader]
  }
  @scala.inline
  implicit class IncomingHttpStatusHeaderOps[Self <: IncomingHttpStatusHeader] (val x: Self) extends AnyVal {
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
    def setColonstatus(value: Double): Self = this.set(":status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColonstatus: Self = this.set(":status", js.undefined)
  }
  
}

