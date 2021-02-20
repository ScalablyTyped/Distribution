package typings.postcssSelectorParser.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PreferredQuoteMarkOptions extends StObject {
  
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
  implicit class PreferredQuoteMarkOptionsMutableBuilder[Self <: PreferredQuoteMarkOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPreferCurrentQuoteMark(value: Boolean): Self = StObject.set(x, "preferCurrentQuoteMark", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreferCurrentQuoteMarkUndefined: Self = StObject.set(x, "preferCurrentQuoteMark", js.undefined)
    
    @scala.inline
    def setQuoteMark(value: QuoteMark): Self = StObject.set(x, "quoteMark", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuoteMarkNull: Self = StObject.set(x, "quoteMark", null)
    
    @scala.inline
    def setQuoteMarkUndefined: Self = StObject.set(x, "quoteMark", js.undefined)
  }
}
