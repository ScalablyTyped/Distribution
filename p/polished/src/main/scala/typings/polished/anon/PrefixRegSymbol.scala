package typings.polished.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PrefixRegSymbol extends StObject {
  
  var prefix: FNotation
  
  var regSymbol: /* \( */ String
  
  var symbol: /* ( */ String
}
object PrefixRegSymbol {
  
  inline def apply(prefix: FNotation): PrefixRegSymbol = {
    val __obj = js.Dynamic.literal(prefix = prefix.asInstanceOf[js.Any], regSymbol = "\\(", symbol = "(")
    __obj.asInstanceOf[PrefixRegSymbol]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PrefixRegSymbol] (val x: Self) extends AnyVal {
    
    inline def setPrefix(value: FNotation): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
    
    inline def setRegSymbol(value: /* \( */ String): Self = StObject.set(x, "regSymbol", value.asInstanceOf[js.Any])
    
    inline def setSymbol(value: /* ( */ String): Self = StObject.set(x, "symbol", value.asInstanceOf[js.Any])
  }
}
