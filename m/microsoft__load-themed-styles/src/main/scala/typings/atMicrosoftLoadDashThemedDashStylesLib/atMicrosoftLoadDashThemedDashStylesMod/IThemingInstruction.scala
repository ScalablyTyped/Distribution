package typings
package atMicrosoftLoadDashThemedDashStylesLib.atMicrosoftLoadDashThemedDashStylesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IThemingInstruction extends js.Object {
  var defaultValue: js.UndefOr[java.lang.String] = js.undefined
  var rawString: js.UndefOr[java.lang.String] = js.undefined
  var theme: js.UndefOr[java.lang.String] = js.undefined
}

object IThemingInstruction {
  @scala.inline
  def apply(
    defaultValue: java.lang.String = null,
    rawString: java.lang.String = null,
    theme: java.lang.String = null
  ): IThemingInstruction = {
    val __obj = js.Dynamic.literal()
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue)
    if (rawString != null) __obj.updateDynamic("rawString")(rawString)
    if (theme != null) __obj.updateDynamic("theme")(theme)
    __obj.asInstanceOf[IThemingInstruction]
  }
}

