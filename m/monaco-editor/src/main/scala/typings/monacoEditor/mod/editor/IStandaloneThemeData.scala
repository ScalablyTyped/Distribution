package typings.monacoEditor.mod.editor

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IStandaloneThemeData extends StObject {
  
  var base: BuiltinTheme
  
  var colors: IColors
  
  var encodedTokensColors: js.UndefOr[js.Array[String]] = js.undefined
  
  var inherit: Boolean
  
  var rules: js.Array[ITokenThemeRule]
}
object IStandaloneThemeData {
  
  inline def apply(base: BuiltinTheme, colors: IColors, inherit: Boolean, rules: js.Array[ITokenThemeRule]): IStandaloneThemeData = {
    val __obj = js.Dynamic.literal(base = base.asInstanceOf[js.Any], colors = colors.asInstanceOf[js.Any], inherit = inherit.asInstanceOf[js.Any], rules = rules.asInstanceOf[js.Any])
    __obj.asInstanceOf[IStandaloneThemeData]
  }
  
  extension [Self <: IStandaloneThemeData](x: Self) {
    
    inline def setBase(value: BuiltinTheme): Self = StObject.set(x, "base", value.asInstanceOf[js.Any])
    
    inline def setColors(value: IColors): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
    
    inline def setEncodedTokensColors(value: js.Array[String]): Self = StObject.set(x, "encodedTokensColors", value.asInstanceOf[js.Any])
    
    inline def setEncodedTokensColorsUndefined: Self = StObject.set(x, "encodedTokensColors", js.undefined)
    
    inline def setEncodedTokensColorsVarargs(value: String*): Self = StObject.set(x, "encodedTokensColors", js.Array(value :_*))
    
    inline def setInherit(value: Boolean): Self = StObject.set(x, "inherit", value.asInstanceOf[js.Any])
    
    inline def setRules(value: js.Array[ITokenThemeRule]): Self = StObject.set(x, "rules", value.asInstanceOf[js.Any])
    
    inline def setRulesVarargs(value: ITokenThemeRule*): Self = StObject.set(x, "rules", js.Array(value :_*))
  }
}
