package typings.muicss.reactMod

import typings.react.reactMod.LiHTMLAttributes
import typings.std.HTMLLIElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DropdownItemProps extends LiHTMLAttributes[HTMLLIElement] {
  var link: js.UndefOr[String] = js.undefined
  var target: js.UndefOr[String] = js.undefined
}

object DropdownItemProps {
  @scala.inline
  def apply(
    LiHTMLAttributes: LiHTMLAttributes[HTMLLIElement] = null,
    link: String = null,
    target: String = null
  ): DropdownItemProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, LiHTMLAttributes)
    if (link != null) __obj.updateDynamic("link")(link)
    if (target != null) __obj.updateDynamic("target")(target)
    __obj.asInstanceOf[DropdownItemProps]
  }
}

