package typings.nlcst.mod

import typings.nlcst.nlcstStrings.SymbolNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Symbol
  extends StObject
     with Literal {
  
  @JSName("type")
  var type_Symbol: SymbolNode
}
object Symbol {
  
  inline def apply(value: Any): Symbol = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("SymbolNode")
    __obj.asInstanceOf[Symbol]
  }
  
  extension [Self <: Symbol](x: Self) {
    
    inline def setType(value: SymbolNode): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
