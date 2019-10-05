package typings.muicss.reactMod

import typings.muicss.muicssStrings.left
import typings.muicss.muicssStrings.right
import typings.react.NativeMouseEvent
import typings.react.reactMod.HTMLAttributes
import typings.react.reactMod.MouseEvent
import typings.react.reactMod.MouseEventHandler
import typings.react.reactMod.ReactNode
import typings.std.HTMLDivElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DropdownProps extends HTMLAttributes[HTMLDivElement] {
  var alignMenu: js.UndefOr[left | right] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  var label: js.UndefOr[ReactNode] = js.undefined
  var onOutsideClick: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.undefined
  var size: js.UndefOr[String] = js.undefined
  var variant: js.UndefOr[String] = js.undefined
}

object DropdownProps {
  @scala.inline
  def apply(
    HTMLAttributes: HTMLAttributes[HTMLDivElement] = null,
    alignMenu: left | right = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    label: ReactNode = null,
    onOutsideClick: MouseEvent[HTMLDivElement, NativeMouseEvent] => Unit = null,
    size: String = null,
    variant: String = null
  ): DropdownProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, HTMLAttributes)
    if (alignMenu != null) __obj.updateDynamic("alignMenu")(alignMenu.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (onOutsideClick != null) __obj.updateDynamic("onOutsideClick")(js.Any.fromFunction1(onOutsideClick))
    if (size != null) __obj.updateDynamic("size")(size)
    if (variant != null) __obj.updateDynamic("variant")(variant)
    __obj.asInstanceOf[DropdownProps]
  }
}

