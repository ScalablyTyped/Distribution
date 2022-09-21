package typings.momentMini.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MomentCreationData extends StObject {
  
  var format: js.UndefOr[MomentFormatSpecification] = js.undefined
  
  var input: MomentInput
  
  var isUTC: Boolean
  
  var locale: Locale_
  
  var strict: js.UndefOr[Boolean] = js.undefined
}
object MomentCreationData {
  
  inline def apply(input: MomentInput, isUTC: Boolean, locale: Locale_): MomentCreationData = {
    val __obj = js.Dynamic.literal(input = input.asInstanceOf[js.Any], isUTC = isUTC.asInstanceOf[js.Any], locale = locale.asInstanceOf[js.Any])
    __obj.asInstanceOf[MomentCreationData]
  }
  
  extension [Self <: MomentCreationData](x: Self) {
    
    inline def setFormat(value: MomentFormatSpecification): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    inline def setFormatVarargs(value: (String | MomentBuiltinFormat)*): Self = StObject.set(x, "format", js.Array(value*))
    
    inline def setInput(value: MomentInput): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
    
    inline def setInputVarargs(value: (Double | String)*): Self = StObject.set(x, "input", js.Array(value*))
    
    inline def setIsUTC(value: Boolean): Self = StObject.set(x, "isUTC", value.asInstanceOf[js.Any])
    
    inline def setLocale(value: Locale_): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    
    inline def setStrict(value: Boolean): Self = StObject.set(x, "strict", value.asInstanceOf[js.Any])
    
    inline def setStrictUndefined: Self = StObject.set(x, "strict", js.undefined)
  }
}
