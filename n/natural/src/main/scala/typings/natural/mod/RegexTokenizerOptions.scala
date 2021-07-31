package typings.natural.mod

import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RegexTokenizerOptions extends StObject {
  
  var discardEmpty: js.UndefOr[Boolean] = js.undefined
  
  var pattern: js.UndefOr[RegExp] = js.undefined
}
object RegexTokenizerOptions {
  
  @scala.inline
  def apply(): RegexTokenizerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RegexTokenizerOptions]
  }
  
  @scala.inline
  implicit class RegexTokenizerOptionsMutableBuilder[Self <: RegexTokenizerOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDiscardEmpty(value: Boolean): Self = StObject.set(x, "discardEmpty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDiscardEmptyUndefined: Self = StObject.set(x, "discardEmpty", js.undefined)
    
    @scala.inline
    def setPattern(value: RegExp): Self = StObject.set(x, "pattern", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPatternUndefined: Self = StObject.set(x, "pattern", js.undefined)
  }
}
