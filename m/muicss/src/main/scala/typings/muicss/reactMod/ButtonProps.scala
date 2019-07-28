package typings.muicss.reactMod

import typings.react.reactMod.ButtonHTMLAttributes
import typings.std.HTMLButtonElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ButtonProps extends ButtonHTMLAttributes[HTMLButtonElement] {
  var size: js.UndefOr[String] = js.undefined
  var variant: js.UndefOr[String] = js.undefined
}

object ButtonProps {
  @scala.inline
  def apply(
    ButtonHTMLAttributes: ButtonHTMLAttributes[HTMLButtonElement] = null,
    size: String = null,
    variant: String = null
  ): ButtonProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, ButtonHTMLAttributes)
    if (size != null) __obj.updateDynamic("size")(size)
    if (variant != null) __obj.updateDynamic("variant")(variant)
    __obj.asInstanceOf[ButtonProps]
  }
}

