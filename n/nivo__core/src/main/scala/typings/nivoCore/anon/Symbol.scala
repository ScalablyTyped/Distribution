package typings.nivoCore.anon

import typings.react.mod.CSSProperties
import typings.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Symbol extends StObject {
  
  var symbol: Partial[Fill]
  
  var text: Partial[CSSProperties]
}
object Symbol {
  
  inline def apply(symbol: Partial[Fill], text: Partial[CSSProperties]): Symbol = {
    val __obj = js.Dynamic.literal(symbol = symbol.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[Symbol]
  }
  
  extension [Self <: Symbol](x: Self) {
    
    inline def setSymbol(value: Partial[Fill]): Self = StObject.set(x, "symbol", value.asInstanceOf[js.Any])
    
    inline def setText(value: Partial[CSSProperties]): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
  }
}
