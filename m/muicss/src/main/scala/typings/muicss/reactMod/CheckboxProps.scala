package typings.muicss.reactMod

import typings.react.reactMod.HTMLAttributes
import typings.react.reactMod.ReactNode
import typings.std.HTMLDivElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CheckboxProps extends HTMLAttributes[HTMLDivElement] {
  var autoFocus: js.UndefOr[Boolean] = js.undefined
  var checked: js.UndefOr[Boolean] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  var form: js.UndefOr[String] = js.undefined
  var label: js.UndefOr[ReactNode] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var required: js.UndefOr[Boolean] = js.undefined
  var value: js.UndefOr[String | js.Array[String] | Double] = js.undefined
}

object CheckboxProps {
  @scala.inline
  def apply(
    HTMLAttributes: HTMLAttributes[HTMLDivElement] = null,
    autoFocus: js.UndefOr[Boolean] = js.undefined,
    checked: js.UndefOr[Boolean] = js.undefined,
    disabled: js.UndefOr[Boolean] = js.undefined,
    form: String = null,
    label: ReactNode = null,
    name: String = null,
    required: js.UndefOr[Boolean] = js.undefined,
    value: String | js.Array[String] | Double = null
  ): CheckboxProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, HTMLAttributes)
    if (!js.isUndefined(autoFocus)) __obj.updateDynamic("autoFocus")(autoFocus)
    if (!js.isUndefined(checked)) __obj.updateDynamic("checked")(checked)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (form != null) __obj.updateDynamic("form")(form)
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name)
    if (!js.isUndefined(required)) __obj.updateDynamic("required")(required)
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[CheckboxProps]
  }
}

