package typings.polished.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait _empty extends StObject {
  
  @JSName("*")
  var Asterisk: Infix
  
  @JSName(",")
  var Comma: InfixRegSymbol
  
  @JSName("(")
  var Leftparenthesis: PrefixRegSymbol
  
  @JSName("+")
  var Plussign: Prefix
  
  @JSName(")")
  var Rightparenthesis: Postfix
  
  @JSName("/")
  var Slash: RegSymbol
  
  @JSName("-")
  var _dash: InfixPrefix
  
  var max: FuncRegSymbol
  
  var min: Func
}
object _empty {
  
  inline def apply(
    Asterisk: Infix,
    Comma: InfixRegSymbol,
    Leftparenthesis: PrefixRegSymbol,
    Plussign: Prefix,
    Rightparenthesis: Postfix,
    Slash: RegSymbol,
    _dash: InfixPrefix,
    max: FuncRegSymbol,
    min: Func
  ): _empty = {
    val __obj = js.Dynamic.literal(max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any])
    __obj.updateDynamic("*")(Asterisk.asInstanceOf[js.Any])
    __obj.updateDynamic(",")(Comma.asInstanceOf[js.Any])
    __obj.updateDynamic("(")(Leftparenthesis.asInstanceOf[js.Any])
    __obj.updateDynamic("+")(Plussign.asInstanceOf[js.Any])
    __obj.updateDynamic(")")(Rightparenthesis.asInstanceOf[js.Any])
    __obj.updateDynamic("/")(Slash.asInstanceOf[js.Any])
    __obj.updateDynamic("-")(_dash.asInstanceOf[js.Any])
    __obj.asInstanceOf[_empty]
  }
  
  extension [Self <: _empty](x: Self) {
    
    inline def setAsterisk(value: Infix): Self = StObject.set(x, "*", value.asInstanceOf[js.Any])
    
    inline def setComma(value: InfixRegSymbol): Self = StObject.set(x, ",", value.asInstanceOf[js.Any])
    
    inline def setLeftparenthesis(value: PrefixRegSymbol): Self = StObject.set(x, "(", value.asInstanceOf[js.Any])
    
    inline def setMax(value: FuncRegSymbol): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    inline def setMin(value: Func): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    inline def setPlussign(value: Prefix): Self = StObject.set(x, "+", value.asInstanceOf[js.Any])
    
    inline def setRightparenthesis(value: Postfix): Self = StObject.set(x, ")", value.asInstanceOf[js.Any])
    
    inline def setSlash(value: RegSymbol): Self = StObject.set(x, "/", value.asInstanceOf[js.Any])
    
    inline def set_dash(value: InfixPrefix): Self = StObject.set(x, "-", value.asInstanceOf[js.Any])
  }
}
