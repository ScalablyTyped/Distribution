package typings.monacoEditor.mod.editor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IStandaloneThemeData extends js.Object {
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
  implicit class IStandaloneThemeDataOps[Self <: IStandaloneThemeData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setBase(value: BuiltinTheme): Self = this.set("base", value.asInstanceOf[js.Any])
    @scala.inline
    def setColors(value: IColors): Self = this.set("colors", value.asInstanceOf[js.Any])
    @scala.inline
    def setInherit(value: Boolean): Self = this.set("inherit", value.asInstanceOf[js.Any])
    @scala.inline
    def setRulesVarargs(value: ITokenThemeRule*): Self = this.set("rules", js.Array(value :_*))
    @scala.inline
    def setRules(value: js.Array[ITokenThemeRule]): Self = this.set("rules", value.asInstanceOf[js.Any])
    @scala.inline
    def setEncodedTokensColorsVarargs(value: String*): Self = this.set("encodedTokensColors", js.Array(value :_*))
    @scala.inline
    def setEncodedTokensColors(value: js.Array[String]): Self = this.set("encodedTokensColors", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEncodedTokensColors: Self = this.set("encodedTokensColors", js.undefined)
  }
  
}

