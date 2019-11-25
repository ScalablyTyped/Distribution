package typings.monacoDashEditor.monacoDashEditorMod.editor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IStandaloneThemeData extends js.Object {
  var base: BuiltinTheme
  var colors: IColors
  var encodedTokensColors: js.UndefOr[js.Array[String]] = js.undefined
  var inherit: Boolean
  var rules: js.Array[ITokenThemeRule]
}

object IStandaloneThemeData {
  @scala.inline
  def apply(
    base: BuiltinTheme,
    colors: IColors,
    inherit: Boolean,
    rules: js.Array[ITokenThemeRule],
    encodedTokensColors: js.Array[String] = null
  ): IStandaloneThemeData = {
    val __obj = js.Dynamic.literal(base = base.asInstanceOf[js.Any], colors = colors.asInstanceOf[js.Any], inherit = inherit.asInstanceOf[js.Any], rules = rules.asInstanceOf[js.Any])
    if (encodedTokensColors != null) __obj.updateDynamic("encodedTokensColors")(encodedTokensColors.asInstanceOf[js.Any])
    __obj.asInstanceOf[IStandaloneThemeData]
  }
}

