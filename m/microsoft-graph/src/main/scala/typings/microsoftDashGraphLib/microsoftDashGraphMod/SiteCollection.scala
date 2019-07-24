package typings
package microsoftDashGraphLib.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SiteCollection extends js.Object {
  // The hostname for the site collection. Read-only.
  var hostname: js.UndefOr[java.lang.String] = js.undefined
  // If present, indicates that this is a root site collection in SharePoint. Read-only.
  var root: js.UndefOr[Root] = js.undefined
}

object SiteCollection {
  @scala.inline
  def apply(hostname: java.lang.String = null, root: Root = null): SiteCollection = {
    val __obj = js.Dynamic.literal()
    if (hostname != null) __obj.updateDynamic("hostname")(hostname)
    if (root != null) __obj.updateDynamic("root")(root)
    __obj.asInstanceOf[SiteCollection]
  }
}

