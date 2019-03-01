package typings
package muicssLib.reactMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextareaProps
  extends reactLib.reactMod.ReactNs.TextareaHTMLAttributes[reactLib.HTMLTextAreaElement] {
  var floatingLabel: js.UndefOr[scala.Boolean] = js.undefined
  var hint: js.UndefOr[java.lang.String] = js.undefined
  var inputRef: js.UndefOr[reactLib.reactMod.ReactNs.Ref[reactLib.HTMLTextAreaElement]] = js.undefined
  var invalid: js.UndefOr[scala.Boolean] = js.undefined
  var label: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  var onLabelClick: js.UndefOr[reactLib.reactMod.ReactNs.MouseEventHandler[reactLib.HTMLInputElement]] = js.undefined
}

object TextareaProps {
  @scala.inline
  def apply(
    TextareaHTMLAttributes: reactLib.reactMod.ReactNs.TextareaHTMLAttributes[reactLib.HTMLTextAreaElement] = null,
    floatingLabel: js.UndefOr[scala.Boolean] = js.undefined,
    hint: java.lang.String = null,
    inputRef: reactLib.reactMod.ReactNs.Ref[reactLib.HTMLTextAreaElement] = null,
    invalid: js.UndefOr[scala.Boolean] = js.undefined,
    label: reactLib.reactMod.ReactNs.ReactNode = null,
    onLabelClick: reactLib.reactMod.ReactNs.MouseEventHandler[reactLib.HTMLInputElement] = null
  ): TextareaProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, TextareaHTMLAttributes)
    if (!js.isUndefined(floatingLabel)) __obj.updateDynamic("floatingLabel")(floatingLabel)
    if (hint != null) __obj.updateDynamic("hint")(hint)
    if (inputRef != null) __obj.updateDynamic("inputRef")(inputRef.asInstanceOf[js.Any])
    if (!js.isUndefined(invalid)) __obj.updateDynamic("invalid")(invalid)
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (onLabelClick != null) __obj.updateDynamic("onLabelClick")(onLabelClick)
    __obj.asInstanceOf[TextareaProps]
  }
}

