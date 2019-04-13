package typings
package muicssLib.reactMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InputProps
  extends reactLib.reactMod.InputHTMLAttributes[stdLib.HTMLInputElement] {
  var floatingLabel: js.UndefOr[scala.Boolean] = js.undefined
  var hint: js.UndefOr[java.lang.String] = js.undefined
  var inputRef: js.UndefOr[reactLib.reactMod.Ref[stdLib.HTMLInputElement]] = js.undefined
  var invalid: js.UndefOr[scala.Boolean] = js.undefined
  var label: js.UndefOr[reactLib.reactMod.ReactNode] = js.undefined
  var onLabelClick: js.UndefOr[reactLib.reactMod.MouseEventHandler[stdLib.HTMLInputElement]] = js.undefined
}

object InputProps {
  @scala.inline
  def apply(
    InputHTMLAttributes: reactLib.reactMod.InputHTMLAttributes[stdLib.HTMLInputElement] = null,
    floatingLabel: js.UndefOr[scala.Boolean] = js.undefined,
    hint: java.lang.String = null,
    inputRef: reactLib.reactMod.Ref[stdLib.HTMLInputElement] = null,
    invalid: js.UndefOr[scala.Boolean] = js.undefined,
    label: reactLib.reactMod.ReactNode = null,
    onLabelClick: reactLib.reactMod.MouseEventHandler[stdLib.HTMLInputElement] = null
  ): InputProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, InputHTMLAttributes)
    if (!js.isUndefined(floatingLabel)) __obj.updateDynamic("floatingLabel")(floatingLabel)
    if (hint != null) __obj.updateDynamic("hint")(hint)
    if (inputRef != null) __obj.updateDynamic("inputRef")(inputRef.asInstanceOf[js.Any])
    if (!js.isUndefined(invalid)) __obj.updateDynamic("invalid")(invalid)
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (onLabelClick != null) __obj.updateDynamic("onLabelClick")(onLabelClick)
    __obj.asInstanceOf[InputProps]
  }
}

