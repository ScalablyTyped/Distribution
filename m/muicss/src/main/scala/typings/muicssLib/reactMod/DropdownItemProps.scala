package typings
package muicssLib.reactMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DropdownItemProps
  extends reactLib.reactMod.LiHTMLAttributes[stdLib.HTMLLIElement] {
  var link: js.UndefOr[java.lang.String] = js.undefined
  var target: js.UndefOr[java.lang.String] = js.undefined
}

object DropdownItemProps {
  @scala.inline
  def apply(
    LiHTMLAttributes: reactLib.reactMod.LiHTMLAttributes[stdLib.HTMLLIElement] = null,
    link: java.lang.String = null,
    target: java.lang.String = null
  ): DropdownItemProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, LiHTMLAttributes)
    if (link != null) __obj.updateDynamic("link")(link)
    if (target != null) __obj.updateDynamic("target")(target)
    __obj.asInstanceOf[DropdownItemProps]
  }
}

