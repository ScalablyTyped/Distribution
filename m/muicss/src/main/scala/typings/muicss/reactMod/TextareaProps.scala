package typings.muicss.reactMod

import typings.react.reactMod.MouseEventHandler
import typings.react.reactMod.ReactNode
import typings.react.reactMod.Ref
import typings.react.reactMod.TextareaHTMLAttributes
import typings.std.HTMLInputElement
import typings.std.HTMLTextAreaElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextareaProps extends TextareaHTMLAttributes[HTMLTextAreaElement] {
  var floatingLabel: js.UndefOr[Boolean] = js.undefined
  var hint: js.UndefOr[String] = js.undefined
  var inputRef: js.UndefOr[Ref[HTMLTextAreaElement]] = js.undefined
  var invalid: js.UndefOr[Boolean] = js.undefined
  var label: js.UndefOr[ReactNode] = js.undefined
  var onLabelClick: js.UndefOr[MouseEventHandler[HTMLInputElement]] = js.undefined
}

object TextareaProps {
  @scala.inline
  def apply(
    TextareaHTMLAttributes: TextareaHTMLAttributes[HTMLTextAreaElement] = null,
    floatingLabel: js.UndefOr[Boolean] = js.undefined,
    hint: String = null,
    inputRef: Ref[HTMLTextAreaElement] = null,
    invalid: js.UndefOr[Boolean] = js.undefined,
    label: ReactNode = null,
    onLabelClick: MouseEventHandler[HTMLInputElement] = null
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

