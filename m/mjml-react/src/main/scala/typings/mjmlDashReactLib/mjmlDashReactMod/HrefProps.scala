package typings
package mjmlDashReactLib.mjmlDashReactMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HrefProps extends js.Object {
  var href: js.UndefOr[java.lang.String] = js.undefined
  var rel: js.UndefOr[java.lang.String] = js.undefined
  var target: js.UndefOr[java.lang.String] = js.undefined
}

object HrefProps {
  @scala.inline
  def apply(href: java.lang.String = null, rel: java.lang.String = null, target: java.lang.String = null): HrefProps = {
    val __obj = js.Dynamic.literal()
    if (href != null) __obj.updateDynamic("href")(href)
    if (rel != null) __obj.updateDynamic("rel")(rel)
    if (target != null) __obj.updateDynamic("target")(target)
    __obj.asInstanceOf[HrefProps]
  }
}

