package typings.moment.momentMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MomentParsingFlagsOpt extends js.Object {
  var charsLeftOver: js.UndefOr[Double] = js.native
  var empty: js.UndefOr[Boolean] = js.native
  var invalidFormat: js.UndefOr[Boolean] = js.native
  var invalidMonth: js.UndefOr[String] = js.native
  var iso: js.UndefOr[Boolean] = js.native
  var meridiem: js.UndefOr[String | Null] = js.native
  var nullInput: js.UndefOr[Boolean] = js.native
  var overflow: js.UndefOr[Double] = js.native
  var parsedDateParts: js.UndefOr[js.Array[_]] = js.native
  var unusedInput: js.UndefOr[js.Array[String]] = js.native
  var unusedTokens: js.UndefOr[js.Array[String]] = js.native
  var userInvalidated: js.UndefOr[Boolean] = js.native
}

object MomentParsingFlagsOpt {
  @scala.inline
  def apply(): MomentParsingFlagsOpt = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MomentParsingFlagsOpt]
  }
  @scala.inline
  implicit class MomentParsingFlagsOptOps[Self <: MomentParsingFlagsOpt] (val x: Self) extends AnyVal {
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
    def setCharsLeftOver(value: Double): Self = this.set("charsLeftOver", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCharsLeftOver: Self = this.set("charsLeftOver", js.undefined)
    @scala.inline
    def setEmpty(value: Boolean): Self = this.set("empty", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEmpty: Self = this.set("empty", js.undefined)
    @scala.inline
    def setInvalidFormat(value: Boolean): Self = this.set("invalidFormat", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInvalidFormat: Self = this.set("invalidFormat", js.undefined)
    @scala.inline
    def setInvalidMonth(value: String): Self = this.set("invalidMonth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInvalidMonth: Self = this.set("invalidMonth", js.undefined)
    @scala.inline
    def setIso(value: Boolean): Self = this.set("iso", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIso: Self = this.set("iso", js.undefined)
    @scala.inline
    def setMeridiem(value: String): Self = this.set("meridiem", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMeridiem: Self = this.set("meridiem", js.undefined)
    @scala.inline
    def setMeridiemNull: Self = this.set("meridiem", null)
    @scala.inline
    def setNullInput(value: Boolean): Self = this.set("nullInput", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNullInput: Self = this.set("nullInput", js.undefined)
    @scala.inline
    def setOverflow(value: Double): Self = this.set("overflow", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOverflow: Self = this.set("overflow", js.undefined)
    @scala.inline
    def setParsedDatePartsVarargs(value: js.Any*): Self = this.set("parsedDateParts", js.Array(value :_*))
    @scala.inline
    def setParsedDateParts(value: js.Array[_]): Self = this.set("parsedDateParts", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParsedDateParts: Self = this.set("parsedDateParts", js.undefined)
    @scala.inline
    def setUnusedInputVarargs(value: String*): Self = this.set("unusedInput", js.Array(value :_*))
    @scala.inline
    def setUnusedInput(value: js.Array[String]): Self = this.set("unusedInput", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUnusedInput: Self = this.set("unusedInput", js.undefined)
    @scala.inline
    def setUnusedTokensVarargs(value: String*): Self = this.set("unusedTokens", js.Array(value :_*))
    @scala.inline
    def setUnusedTokens(value: js.Array[String]): Self = this.set("unusedTokens", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUnusedTokens: Self = this.set("unusedTokens", js.undefined)
    @scala.inline
    def setUserInvalidated(value: Boolean): Self = this.set("userInvalidated", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUserInvalidated: Self = this.set("userInvalidated", js.undefined)
  }
  
}

