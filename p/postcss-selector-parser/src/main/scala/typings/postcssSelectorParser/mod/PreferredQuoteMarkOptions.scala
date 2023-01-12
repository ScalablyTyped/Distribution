package typings.postcssSelectorParser.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PreferredQuoteMarkOptions extends StObject {
  
  var preferCurrentQuoteMark: js.UndefOr[Boolean] = js.undefined
  
  var quoteMark: js.UndefOr[QuoteMark] = js.undefined
}
object PreferredQuoteMarkOptions {
  
  inline def apply(): PreferredQuoteMarkOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PreferredQuoteMarkOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PreferredQuoteMarkOptions] (val x: Self) extends AnyVal {
    
    inline def setPreferCurrentQuoteMark(value: Boolean): Self = StObject.set(x, "preferCurrentQuoteMark", value.asInstanceOf[js.Any])
    
    inline def setPreferCurrentQuoteMarkUndefined: Self = StObject.set(x, "preferCurrentQuoteMark", js.undefined)
    
    inline def setQuoteMark(value: QuoteMark): Self = StObject.set(x, "quoteMark", value.asInstanceOf[js.Any])
    
    inline def setQuoteMarkNull: Self = StObject.set(x, "quoteMark", null)
    
    inline def setQuoteMarkUndefined: Self = StObject.set(x, "quoteMark", js.undefined)
  }
}
