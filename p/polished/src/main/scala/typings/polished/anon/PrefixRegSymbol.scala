package typings.polished.anon

import typings.polished.polishedStrings.BackslashLeftparenthesis
import typings.polished.polishedStrings.Leftparenthesis
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PrefixRegSymbol extends StObject {
  
  var prefix: RightToLeftSymbol
  
  var regSymbol: BackslashLeftparenthesis
  
  var symbol: Leftparenthesis
}
object PrefixRegSymbol {
  
  inline def apply(prefix: RightToLeftSymbol): PrefixRegSymbol = {
    val __obj = js.Dynamic.literal(prefix = prefix.asInstanceOf[js.Any], regSymbol = "\\(", symbol = "(")
    __obj.asInstanceOf[PrefixRegSymbol]
  }
  
  extension [Self <: PrefixRegSymbol](x: Self) {
    
    inline def setPrefix(value: RightToLeftSymbol): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
    
    inline def setRegSymbol(value: BackslashLeftparenthesis): Self = StObject.set(x, "regSymbol", value.asInstanceOf[js.Any])
    
    inline def setSymbol(value: Leftparenthesis): Self = StObject.set(x, "symbol", value.asInstanceOf[js.Any])
  }
}
