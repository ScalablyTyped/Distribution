package typings.momentMini.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MomentParsingFlags extends StObject {
  
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
  implicit class MomentParsingFlagsMutableBuilder[Self <: MomentParsingFlags] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCharsLeftOver(value: Double): Self = StObject.set(x, "charsLeftOver", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmpty(value: Boolean): Self = StObject.set(x, "empty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInvalidFormat(value: Boolean): Self = StObject.set(x, "invalidFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInvalidMonth(value: String | Unit): Self = StObject.set(x, "invalidMonth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIso(value: Boolean): Self = StObject.set(x, "iso", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMeridiem(value: String | Unit): Self = StObject.set(x, "meridiem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNullInput(value: Boolean): Self = StObject.set(x, "nullInput", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverflow(value: Double): Self = StObject.set(x, "overflow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParsedDateParts(value: js.Array[_]): Self = StObject.set(x, "parsedDateParts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParsedDatePartsVarargs(value: js.Any*): Self = StObject.set(x, "parsedDateParts", js.Array(value :_*))
    
    @scala.inline
    def setUnusedInput(value: js.Array[String]): Self = StObject.set(x, "unusedInput", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnusedInputVarargs(value: String*): Self = StObject.set(x, "unusedInput", js.Array(value :_*))
    
    @scala.inline
    def setUnusedTokens(value: js.Array[String]): Self = StObject.set(x, "unusedTokens", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnusedTokensVarargs(value: String*): Self = StObject.set(x, "unusedTokens", js.Array(value :_*))
    
    @scala.inline
    def setUserInvalidated(value: Boolean): Self = StObject.set(x, "userInvalidated", value.asInstanceOf[js.Any])
  }
}
