package typings.officeDashUiDashFabricDashReact.libComponentsPickersBasePickerDotTypesMod

import typings.react.reactMod.InputHTMLAttributes
import typings.std.HTMLInputElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IInputProps extends InputHTMLAttributes[HTMLInputElement] {
  /**
    * The default value to be visible when the autofill first created.
    * This is different than placeholder text because the placeholder text will disappear and re-appear. This
    * text persists until deleted or changed.
    */
  var defaultVisibleValue: js.UndefOr[String] = js.undefined
}

object IInputProps {
  @scala.inline
  def apply(
    InputHTMLAttributes: InputHTMLAttributes[HTMLInputElement] = null,
    `aria-label`: String = null,
    defaultVisibleValue: String = null
  ): IInputProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, InputHTMLAttributes)
    if (`aria-label` != null) __obj.updateDynamic("aria-label")(`aria-label`)
    if (defaultVisibleValue != null) __obj.updateDynamic("defaultVisibleValue")(defaultVisibleValue)
    __obj.asInstanceOf[IInputProps]
  }
}

