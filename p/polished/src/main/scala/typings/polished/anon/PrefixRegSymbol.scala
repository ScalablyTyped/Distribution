package typings.polished.anon

import typings.polished.polishedStrings.BackslashLeftparenthesis
import typings.polished.polishedStrings.Leftparenthesis
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PrefixRegSymbol extends StObject {
  
  var prefix: RightToLeftSymbol = js.native
  
  var regSymbol: BackslashLeftparenthesis = js.native
  
  var symbol: Leftparenthesis = js.native
}
object PrefixRegSymbol {
  
  @scala.inline
  def apply(prefix: RightToLeftSymbol, regSymbol: BackslashLeftparenthesis, symbol: Leftparenthesis): PrefixRegSymbol = {
    val __obj = js.Dynamic.literal(prefix = prefix.asInstanceOf[js.Any], regSymbol = regSymbol.asInstanceOf[js.Any], symbol = symbol.asInstanceOf[js.Any])
    __obj.asInstanceOf[PrefixRegSymbol]
  }
  
  @scala.inline
  implicit class PrefixRegSymbolMutableBuilder[Self <: PrefixRegSymbol] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPrefix(value: RightToLeftSymbol): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegSymbol(value: BackslashLeftparenthesis): Self = StObject.set(x, "regSymbol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSymbol(value: Leftparenthesis): Self = StObject.set(x, "symbol", value.asInstanceOf[js.Any])
  }
}
