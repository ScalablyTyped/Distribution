package typings.moment.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MomentParsingFlags extends StObject {
  
  var charsLeftOver: Double
  
  var empty: Boolean
  
  // null
  var invalidFormat: Boolean
  
  var invalidMonth: String | Unit
  
  var iso: Boolean
  
  var meridiem: String | Unit
  
  var nullInput: Boolean
  
  var overflow: Double
  
  var parsedDateParts: js.Array[Any]
  
  var unusedInput: js.Array[String]
  
  var unusedTokens: js.Array[String]
  
  var userInvalidated: Boolean
}
object MomentParsingFlags {
  
  inline def apply(
    charsLeftOver: Double,
    empty: Boolean,
    invalidFormat: Boolean,
    invalidMonth: String | Unit,
    iso: Boolean,
    meridiem: String | Unit,
    nullInput: Boolean,
    overflow: Double,
    parsedDateParts: js.Array[Any],
    unusedInput: js.Array[String],
    unusedTokens: js.Array[String],
    userInvalidated: Boolean
  ): MomentParsingFlags = {
    val __obj = js.Dynamic.literal(charsLeftOver = charsLeftOver.asInstanceOf[js.Any], empty = empty.asInstanceOf[js.Any], invalidFormat = invalidFormat.asInstanceOf[js.Any], invalidMonth = invalidMonth.asInstanceOf[js.Any], iso = iso.asInstanceOf[js.Any], meridiem = meridiem.asInstanceOf[js.Any], nullInput = nullInput.asInstanceOf[js.Any], overflow = overflow.asInstanceOf[js.Any], parsedDateParts = parsedDateParts.asInstanceOf[js.Any], unusedInput = unusedInput.asInstanceOf[js.Any], unusedTokens = unusedTokens.asInstanceOf[js.Any], userInvalidated = userInvalidated.asInstanceOf[js.Any])
    __obj.asInstanceOf[MomentParsingFlags]
  }
  
  extension [Self <: MomentParsingFlags](x: Self) {
    
    inline def setCharsLeftOver(value: Double): Self = StObject.set(x, "charsLeftOver", value.asInstanceOf[js.Any])
    
    inline def setEmpty(value: Boolean): Self = StObject.set(x, "empty", value.asInstanceOf[js.Any])
    
    inline def setInvalidFormat(value: Boolean): Self = StObject.set(x, "invalidFormat", value.asInstanceOf[js.Any])
    
    inline def setInvalidMonth(value: String | Unit): Self = StObject.set(x, "invalidMonth", value.asInstanceOf[js.Any])
    
    inline def setIso(value: Boolean): Self = StObject.set(x, "iso", value.asInstanceOf[js.Any])
    
    inline def setMeridiem(value: String | Unit): Self = StObject.set(x, "meridiem", value.asInstanceOf[js.Any])
    
    inline def setNullInput(value: Boolean): Self = StObject.set(x, "nullInput", value.asInstanceOf[js.Any])
    
    inline def setOverflow(value: Double): Self = StObject.set(x, "overflow", value.asInstanceOf[js.Any])
    
    inline def setParsedDateParts(value: js.Array[Any]): Self = StObject.set(x, "parsedDateParts", value.asInstanceOf[js.Any])
    
    inline def setParsedDatePartsVarargs(value: Any*): Self = StObject.set(x, "parsedDateParts", js.Array(value*))
    
    inline def setUnusedInput(value: js.Array[String]): Self = StObject.set(x, "unusedInput", value.asInstanceOf[js.Any])
    
    inline def setUnusedInputVarargs(value: String*): Self = StObject.set(x, "unusedInput", js.Array(value*))
    
    inline def setUnusedTokens(value: js.Array[String]): Self = StObject.set(x, "unusedTokens", value.asInstanceOf[js.Any])
    
    inline def setUnusedTokensVarargs(value: String*): Self = StObject.set(x, "unusedTokens", js.Array(value*))
    
    inline def setUserInvalidated(value: Boolean): Self = StObject.set(x, "userInvalidated", value.asInstanceOf[js.Any])
  }
}
