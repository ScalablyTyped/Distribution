package typings.momentMini.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MomentParsingFlags extends js.Object {
  
  var charsLeftOver: Double = js.native
  
  var empty: Boolean = js.native
  
   // null
  var invalidFormat: Boolean = js.native
  
  var invalidMonth: String | Unit = js.native
  
  var iso: Boolean = js.native
  
  var meridiem: String | Unit = js.native
  
  var nullInput: Boolean = js.native
  
  var overflow: Double = js.native
  
  var parsedDateParts: js.Array[_] = js.native
  
  var unusedInput: js.Array[String] = js.native
  
  var unusedTokens: js.Array[String] = js.native
  
  var userInvalidated: Boolean = js.native
}
object MomentParsingFlags {
  
  @scala.inline
  def apply(
    charsLeftOver: Double,
    empty: Boolean,
    invalidFormat: Boolean,
    invalidMonth: String | Unit,
    iso: Boolean,
    meridiem: String | Unit,
    nullInput: Boolean,
    overflow: Double,
    parsedDateParts: js.Array[_],
    unusedInput: js.Array[String],
    unusedTokens: js.Array[String],
    userInvalidated: Boolean
  ): MomentParsingFlags = {
    val __obj = js.Dynamic.literal(charsLeftOver = charsLeftOver.asInstanceOf[js.Any], empty = empty.asInstanceOf[js.Any], invalidFormat = invalidFormat.asInstanceOf[js.Any], invalidMonth = invalidMonth.asInstanceOf[js.Any], iso = iso.asInstanceOf[js.Any], meridiem = meridiem.asInstanceOf[js.Any], nullInput = nullInput.asInstanceOf[js.Any], overflow = overflow.asInstanceOf[js.Any], parsedDateParts = parsedDateParts.asInstanceOf[js.Any], unusedInput = unusedInput.asInstanceOf[js.Any], unusedTokens = unusedTokens.asInstanceOf[js.Any], userInvalidated = userInvalidated.asInstanceOf[js.Any])
    __obj.asInstanceOf[MomentParsingFlags]
  }
  
  @scala.inline
  implicit class MomentParsingFlagsOps[Self <: MomentParsingFlags] (val x: Self) extends AnyVal {
    
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
    def setEmpty(value: Boolean): Self = this.set("empty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInvalidFormat(value: Boolean): Self = this.set("invalidFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInvalidMonth(value: String | Unit): Self = this.set("invalidMonth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIso(value: Boolean): Self = this.set("iso", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMeridiem(value: String | Unit): Self = this.set("meridiem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNullInput(value: Boolean): Self = this.set("nullInput", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverflow(value: Double): Self = this.set("overflow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParsedDatePartsVarargs(value: js.Any*): Self = this.set("parsedDateParts", js.Array(value :_*))
    
    @scala.inline
    def setParsedDateParts(value: js.Array[_]): Self = this.set("parsedDateParts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnusedInputVarargs(value: String*): Self = this.set("unusedInput", js.Array(value :_*))
    
    @scala.inline
    def setUnusedInput(value: js.Array[String]): Self = this.set("unusedInput", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnusedTokensVarargs(value: String*): Self = this.set("unusedTokens", js.Array(value :_*))
    
    @scala.inline
    def setUnusedTokens(value: js.Array[String]): Self = this.set("unusedTokens", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserInvalidated(value: Boolean): Self = this.set("userInvalidated", value.asInstanceOf[js.Any])
  }
}
