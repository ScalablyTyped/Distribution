package typings
package microsoftDashGraphLib.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExternalLink extends js.Object {
  /** The url of the link. */
  var href: js.UndefOr[java.lang.String] = js.undefined
}

object ExternalLink {
  @scala.inline
  def apply(href: java.lang.String = null): ExternalLink = {
    val __obj = js.Dynamic.literal()
    if (href != null) __obj.updateDynamic("href")(href)
    __obj.asInstanceOf[ExternalLink]
  }
}

