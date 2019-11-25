package typings.mjmlDashReact.mjmlDashReactMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MjmlFontProps extends js.Object {
  var href: js.UndefOr[String] = js.undefined
  var name: js.UndefOr[String] = js.undefined
}

object MjmlFontProps {
  @scala.inline
  def apply(href: String = null, name: String = null): MjmlFontProps = {
    val __obj = js.Dynamic.literal()
    if (href != null) __obj.updateDynamic("href")(href.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[MjmlFontProps]
  }
}

