package typings.postcssSelectorParser.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SmartQuoteMarkOptions extends PreferredQuoteMarkOptions {
  var smart: js.UndefOr[Boolean] = js.native
}

object SmartQuoteMarkOptions {
  @scala.inline
  def apply(): SmartQuoteMarkOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SmartQuoteMarkOptions]
  }
  @scala.inline
  implicit class SmartQuoteMarkOptionsOps[Self <: SmartQuoteMarkOptions] (val x: Self) extends AnyVal {
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
    def setSmart(value: Boolean): Self = this.set("smart", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSmart: Self = this.set("smart", js.undefined)
  }
  
}

