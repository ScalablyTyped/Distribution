package typings.postcssSelectorParser.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PreferredQuoteMarkOptions extends js.Object {
  var preferCurrentQuoteMark: js.UndefOr[Boolean] = js.native
  var quoteMark: js.UndefOr[QuoteMark] = js.native
}

object PreferredQuoteMarkOptions {
  @scala.inline
  def apply(): PreferredQuoteMarkOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PreferredQuoteMarkOptions]
  }
  @scala.inline
  implicit class PreferredQuoteMarkOptionsOps[Self <: PreferredQuoteMarkOptions] (val x: Self) extends AnyVal {
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
    def setPreferCurrentQuoteMark(value: Boolean): Self = this.set("preferCurrentQuoteMark", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePreferCurrentQuoteMark: Self = this.set("preferCurrentQuoteMark", js.undefined)
    @scala.inline
    def setQuoteMark(value: QuoteMark): Self = this.set("quoteMark", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQuoteMark: Self = this.set("quoteMark", js.undefined)
    @scala.inline
    def setQuoteMarkNull: Self = this.set("quoteMark", null)
  }
  
}

