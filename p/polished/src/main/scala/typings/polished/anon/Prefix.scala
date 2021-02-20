package typings.polished.anon

import typings.polished.polishedStrings.BackslashPlussign
import typings.polished.polishedStrings.Plussign
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Prefix extends StObject {
  
  var infix: RightToLeft = js.native
  
  var prefix: ArgCountF = js.native
  
  var regSymbol: BackslashPlussign = js.native
  
  var symbol: Plussign = js.native
}
object Prefix {
  
  @scala.inline
  def apply(infix: RightToLeft, prefix: ArgCountF, regSymbol: BackslashPlussign, symbol: Plussign): Prefix = {
    val __obj = js.Dynamic.literal(infix = infix.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any], regSymbol = regSymbol.asInstanceOf[js.Any], symbol = symbol.asInstanceOf[js.Any])
    __obj.asInstanceOf[Prefix]
  }
  
  @scala.inline
  implicit class PrefixMutableBuilder[Self <: Prefix] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInfix(value: RightToLeft): Self = StObject.set(x, "infix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrefix(value: ArgCountF): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegSymbol(value: BackslashPlussign): Self = StObject.set(x, "regSymbol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSymbol(value: Plussign): Self = StObject.set(x, "symbol", value.asInstanceOf[js.Any])
  }
}
