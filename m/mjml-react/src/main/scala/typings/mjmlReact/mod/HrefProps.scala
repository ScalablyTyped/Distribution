package typings.mjmlReact.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HrefProps extends js.Object {
  var href: js.UndefOr[String] = js.undefined
  var rel: js.UndefOr[String] = js.undefined
  var target: js.UndefOr[String] = js.undefined
}

object HrefProps {
  @scala.inline
  def apply(href: String = null, rel: String = null, target: String = null): HrefProps = {
    val __obj = js.Dynamic.literal()
    if (href != null) __obj.updateDynamic("href")(href.asInstanceOf[js.Any])
    if (rel != null) __obj.updateDynamic("rel")(rel.asInstanceOf[js.Any])
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    __obj.asInstanceOf[HrefProps]
  }
}

