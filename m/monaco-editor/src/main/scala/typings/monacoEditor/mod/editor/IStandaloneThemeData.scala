package typings.monacoEditor.mod.editor

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IStandaloneThemeData extends StObject {
  
  var base: BuiltinTheme = js.native
  
  var colors: IColors = js.native
  
  var encodedTokensColors: js.UndefOr[js.Array[String]] = js.native
  
  var inherit: Boolean = js.native
  
  var rules: js.Array[ITokenThemeRule] = js.native
}
object IStandaloneThemeData {
  
  @scala.inline
  def apply(base: BuiltinTheme, colors: IColors, inherit: Boolean, rules: js.Array[ITokenThemeRule]): IStandaloneThemeData = {
    val __obj = js.Dynamic.literal(base = base.asInstanceOf[js.Any], colors = colors.asInstanceOf[js.Any], inherit = inherit.asInstanceOf[js.Any], rules = rules.asInstanceOf[js.Any])
    __obj.asInstanceOf[IStandaloneThemeData]
  }
  
  @scala.inline
  implicit class IStandaloneThemeDataMutableBuilder[Self <: IStandaloneThemeData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBase(value: BuiltinTheme): Self = StObject.set(x, "base", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColors(value: IColors): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEncodedTokensColors(value: js.Array[String]): Self = StObject.set(x, "encodedTokensColors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEncodedTokensColorsUndefined: Self = StObject.set(x, "encodedTokensColors", js.undefined)
    
    @scala.inline
    def setEncodedTokensColorsVarargs(value: String*): Self = StObject.set(x, "encodedTokensColors", js.Array(value :_*))
    
    @scala.inline
    def setInherit(value: Boolean): Self = StObject.set(x, "inherit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRules(value: js.Array[ITokenThemeRule]): Self = StObject.set(x, "rules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRulesVarargs(value: ITokenThemeRule*): Self = StObject.set(x, "rules", js.Array(value :_*))
  }
}
