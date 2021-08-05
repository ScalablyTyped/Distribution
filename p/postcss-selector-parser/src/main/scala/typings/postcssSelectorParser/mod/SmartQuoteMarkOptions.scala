package typings.postcssSelectorParser.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SmartQuoteMarkOptions
  extends StObject
     with PreferredQuoteMarkOptions {
  
  var smart: js.UndefOr[Boolean] = js.undefined
}
object SmartQuoteMarkOptions {
  
  inline def apply(): SmartQuoteMarkOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SmartQuoteMarkOptions]
  }
  
  extension [Self <: SmartQuoteMarkOptions](x: Self) {
    
    inline def setSmart(value: Boolean): Self = StObject.set(x, "smart", value.asInstanceOf[js.Any])
    
    inline def setSmartUndefined: Self = StObject.set(x, "smart", js.undefined)
  }
}
