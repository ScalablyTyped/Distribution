package typings.moment.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MomentLongDateFormat extends js.Object {
  var L: String = js.native
  var LL: String = js.native
  var LLL: String = js.native
  var LLLL: String = js.native
  var LT: String = js.native
  var LTS: String = js.native
  var l: js.UndefOr[String] = js.native
  var ll: js.UndefOr[String] = js.native
  var lll: js.UndefOr[String] = js.native
  var llll: js.UndefOr[String] = js.native
  var lt: js.UndefOr[String] = js.native
  var lts: js.UndefOr[String] = js.native
}

object MomentLongDateFormat {
  @scala.inline
  def apply(L: String, LL: String, LLL: String, LLLL: String, LT: String, LTS: String): MomentLongDateFormat = {
    val __obj = js.Dynamic.literal(L = L.asInstanceOf[js.Any], LL = LL.asInstanceOf[js.Any], LLL = LLL.asInstanceOf[js.Any], LLLL = LLLL.asInstanceOf[js.Any], LT = LT.asInstanceOf[js.Any], LTS = LTS.asInstanceOf[js.Any])
    __obj.asInstanceOf[MomentLongDateFormat]
  }
  @scala.inline
  implicit class MomentLongDateFormatOps[Self <: MomentLongDateFormat] (val x: Self) extends AnyVal {
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
    def setL(value: String): Self = this.set("L", value.asInstanceOf[js.Any])
    @scala.inline
    def setLL(value: String): Self = this.set("LL", value.asInstanceOf[js.Any])
    @scala.inline
    def setLLL(value: String): Self = this.set("LLL", value.asInstanceOf[js.Any])
    @scala.inline
    def setLLLL(value: String): Self = this.set("LLLL", value.asInstanceOf[js.Any])
    @scala.inline
    def setLT(value: String): Self = this.set("LT", value.asInstanceOf[js.Any])
    @scala.inline
    def setLTS(value: String): Self = this.set("LTS", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteL: Self = this.set("l", js.undefined)
    @scala.inline
    def deleteLl: Self = this.set("ll", js.undefined)
    @scala.inline
    def deleteLll: Self = this.set("lll", js.undefined)
    @scala.inline
    def deleteLlll: Self = this.set("llll", js.undefined)
    @scala.inline
    def deleteLt: Self = this.set("lt", js.undefined)
    @scala.inline
    def deleteLts: Self = this.set("lts", js.undefined)
  }
  
}

