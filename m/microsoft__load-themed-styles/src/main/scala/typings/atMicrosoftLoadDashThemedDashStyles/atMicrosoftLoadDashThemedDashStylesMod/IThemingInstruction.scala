package typings.atMicrosoftLoadDashThemedDashStyles.atMicrosoftLoadDashThemedDashStylesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IThemingInstruction extends js.Object {
  var defaultValue: js.UndefOr[String] = js.undefined
  var rawString: js.UndefOr[String] = js.undefined
  var theme: js.UndefOr[String] = js.undefined
}

object IThemingInstruction {
  @scala.inline
  def apply(defaultValue: String = null, rawString: String = null, theme: String = null): IThemingInstruction = {
    val __obj = js.Dynamic.literal()
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue)
    if (rawString != null) __obj.updateDynamic("rawString")(rawString)
    if (theme != null) __obj.updateDynamic("theme")(theme)
    __obj.asInstanceOf[IThemingInstruction]
  }
}

