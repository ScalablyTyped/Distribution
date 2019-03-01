package typings
package muicssLib.reactMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DropdownProps
  extends reactLib.reactMod.ReactNs.HTMLAttributes[reactLib.HTMLDivElement] {
  var alignMenu: js.UndefOr[muicssLib.muicssLibStrings.left | muicssLib.muicssLibStrings.right] = js.undefined
  var disabled: js.UndefOr[scala.Boolean] = js.undefined
  var label: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  var onOutsideClick: js.UndefOr[reactLib.reactMod.ReactNs.MouseEventHandler[reactLib.HTMLDivElement]] = js.undefined
  var size: js.UndefOr[java.lang.String] = js.undefined
  var variant: js.UndefOr[java.lang.String] = js.undefined
}

object DropdownProps {
  @scala.inline
  def apply(
    HTMLAttributes: reactLib.reactMod.ReactNs.HTMLAttributes[reactLib.HTMLDivElement] = null,
    alignMenu: muicssLib.muicssLibStrings.left | muicssLib.muicssLibStrings.right = null,
    disabled: js.UndefOr[scala.Boolean] = js.undefined,
    label: reactLib.reactMod.ReactNs.ReactNode = null,
    onOutsideClick: reactLib.reactMod.ReactNs.MouseEventHandler[reactLib.HTMLDivElement] = null,
    size: java.lang.String = null,
    variant: java.lang.String = null
  ): DropdownProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, HTMLAttributes)
    if (alignMenu != null) __obj.updateDynamic("alignMenu")(alignMenu.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (onOutsideClick != null) __obj.updateDynamic("onOutsideClick")(onOutsideClick)
    if (size != null) __obj.updateDynamic("size")(size)
    if (variant != null) __obj.updateDynamic("variant")(variant)
    __obj.asInstanceOf[DropdownProps]
  }
}

