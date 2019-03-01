package typings
package mjmlDashReactLib.mjmlDashReactMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MjmlFontProps extends js.Object {
  var href: js.UndefOr[java.lang.String] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
}

object MjmlFontProps {
  @scala.inline
  def apply(href: java.lang.String = null, name: java.lang.String = null): MjmlFontProps = {
    val __obj = js.Dynamic.literal()
    if (href != null) __obj.updateDynamic("href")(href)
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[MjmlFontProps]
  }
}

