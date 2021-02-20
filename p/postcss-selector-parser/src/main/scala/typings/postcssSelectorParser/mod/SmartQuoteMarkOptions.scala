package typings.postcssSelectorParser.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SmartQuoteMarkOptions extends PreferredQuoteMarkOptions {
  
  var smart: js.UndefOr[Boolean] = js.native
}
object SmartQuoteMarkOptions {
  
  @scala.inline
  def apply(): SmartQuoteMarkOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SmartQuoteMarkOptions]
  }
  
  @scala.inline
  implicit class SmartQuoteMarkOptionsMutableBuilder[Self <: SmartQuoteMarkOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSmart(value: Boolean): Self = StObject.set(x, "smart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSmartUndefined: Self = StObject.set(x, "smart", js.undefined)
  }
}
