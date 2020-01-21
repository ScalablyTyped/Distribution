package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SiteCollection extends js.Object {
  // The hostname for the site collection. Read-only.
  var hostname: js.UndefOr[String] = js.undefined
  // If present, indicates that this is a root site collection in SharePoint. Read-only.
  var root: js.UndefOr[Root] = js.undefined
}

object SiteCollection {
  @scala.inline
  def apply(hostname: String = null, root: Root = null): SiteCollection = {
    val __obj = js.Dynamic.literal()
    if (hostname != null) __obj.updateDynamic("hostname")(hostname.asInstanceOf[js.Any])
    if (root != null) __obj.updateDynamic("root")(root.asInstanceOf[js.Any])
    __obj.asInstanceOf[SiteCollection]
  }
}

