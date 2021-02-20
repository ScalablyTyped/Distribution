package typings.moment.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MomentParsingFlagsOpt extends StObject {
  
  var charsLeftOver: js.UndefOr[Double] = js.native
  
  var empty: js.UndefOr[Boolean] = js.native
  
  var invalidFormat: js.UndefOr[Boolean] = js.native
  
  var invalidMonth: js.UndefOr[String] = js.native
  
  var iso: js.UndefOr[Boolean] = js.native
  
  var meridiem: js.UndefOr[String] = js.native
  
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
  implicit class MomentParsingFlagsOptMutableBuilder[Self <: MomentParsingFlagsOpt] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCharsLeftOver(value: Double): Self = StObject.set(x, "charsLeftOver", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCharsLeftOverUndefined: Self = StObject.set(x, "charsLeftOver", js.undefined)
    
    @scala.inline
    def setEmpty(value: Boolean): Self = StObject.set(x, "empty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmptyUndefined: Self = StObject.set(x, "empty", js.undefined)
    
    @scala.inline
    def setInvalidFormat(value: Boolean): Self = StObject.set(x, "invalidFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInvalidFormatUndefined: Self = StObject.set(x, "invalidFormat", js.undefined)
    
    @scala.inline
    def setInvalidMonth(value: String): Self = StObject.set(x, "invalidMonth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInvalidMonthUndefined: Self = StObject.set(x, "invalidMonth", js.undefined)
    
    @scala.inline
    def setIso(value: Boolean): Self = StObject.set(x, "iso", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsoUndefined: Self = StObject.set(x, "iso", js.undefined)
    
    @scala.inline
    def setMeridiem(value: String): Self = StObject.set(x, "meridiem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMeridiemUndefined: Self = StObject.set(x, "meridiem", js.undefined)
    
    @scala.inline
    def setNullInput(value: Boolean): Self = StObject.set(x, "nullInput", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNullInputUndefined: Self = StObject.set(x, "nullInput", js.undefined)
    
    @scala.inline
    def setOverflow(value: Double): Self = StObject.set(x, "overflow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverflowUndefined: Self = StObject.set(x, "overflow", js.undefined)
    
    @scala.inline
    def setParsedDateParts(value: js.Array[_]): Self = StObject.set(x, "parsedDateParts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParsedDatePartsUndefined: Self = StObject.set(x, "parsedDateParts", js.undefined)
    
    @scala.inline
    def setParsedDatePartsVarargs(value: js.Any*): Self = StObject.set(x, "parsedDateParts", js.Array(value :_*))
    
    @scala.inline
    def setUnusedInput(value: js.Array[String]): Self = StObject.set(x, "unusedInput", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnusedInputUndefined: Self = StObject.set(x, "unusedInput", js.undefined)
    
    @scala.inline
    def setUnusedInputVarargs(value: String*): Self = StObject.set(x, "unusedInput", js.Array(value :_*))
    
    @scala.inline
    def setUnusedTokens(value: js.Array[String]): Self = StObject.set(x, "unusedTokens", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnusedTokensUndefined: Self = StObject.set(x, "unusedTokens", js.undefined)
    
    @scala.inline
    def setUnusedTokensVarargs(value: String*): Self = StObject.set(x, "unusedTokens", js.Array(value :_*))
    
    @scala.inline
    def setUserInvalidated(value: Boolean): Self = StObject.set(x, "userInvalidated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserInvalidatedUndefined: Self = StObject.set(x, "userInvalidated", js.undefined)
  }
}
