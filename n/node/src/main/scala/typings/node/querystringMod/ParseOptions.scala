package typings.node.querystringMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParseOptions extends js.Object {
  var decodeURIComponent: js.UndefOr[js.Function1[/* str */ String, String]] = js.native
  var maxKeys: js.UndefOr[Double] = js.native
}

object ParseOptions {
  @scala.inline
  def apply(): ParseOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParseOptions]
  }
  @scala.inline
  implicit class ParseOptionsOps[Self <: ParseOptions] (val x: Self) extends AnyVal {
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
    def setDecodeURIComponent(value: /* str */ String => String): Self = this.set("decodeURIComponent", js.Any.fromFunction1(value))
    @scala.inline
    def deleteDecodeURIComponent: Self = this.set("decodeURIComponent", js.undefined)
    @scala.inline
    def setMaxKeys(value: Double): Self = this.set("maxKeys", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxKeys: Self = this.set("maxKeys", js.undefined)
  }
  
}

