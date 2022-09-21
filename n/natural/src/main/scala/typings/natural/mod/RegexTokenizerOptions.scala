package typings.natural.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RegexTokenizerOptions extends StObject {
  
  var discardEmpty: js.UndefOr[Boolean] = js.undefined
  
  var pattern: js.UndefOr[js.RegExp] = js.undefined
}
object RegexTokenizerOptions {
  
  inline def apply(): RegexTokenizerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RegexTokenizerOptions]
  }
  
  extension [Self <: RegexTokenizerOptions](x: Self) {
    
    inline def setDiscardEmpty(value: Boolean): Self = StObject.set(x, "discardEmpty", value.asInstanceOf[js.Any])
    
    inline def setDiscardEmptyUndefined: Self = StObject.set(x, "discardEmpty", js.undefined)
    
    inline def setPattern(value: js.RegExp): Self = StObject.set(x, "pattern", value.asInstanceOf[js.Any])
    
    inline def setPatternUndefined: Self = StObject.set(x, "pattern", js.undefined)
  }
}
