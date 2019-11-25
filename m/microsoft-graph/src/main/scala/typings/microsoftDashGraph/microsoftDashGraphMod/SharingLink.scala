package typings.microsoftDashGraph.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SharingLink extends js.Object {
  // The app the link is associated with.
  var application: js.UndefOr[Identity] = js.undefined
  /**
    * The scope of the link represented by this permission. Value anonymous indicates the link is usable by anyone,
    * organization indicates the link is only usable for users signed into the same tenant.
    */
  var scope: js.UndefOr[String] = js.undefined
  // The type of the link created.
  var `type`: js.UndefOr[String] = js.undefined
  // A URL that opens the item in the browser on the OneDrive website.
  var webUrl: js.UndefOr[String] = js.undefined
}

object SharingLink {
  @scala.inline
  def apply(application: Identity = null, scope: String = null, `type`: String = null, webUrl: String = null): SharingLink = {
    val __obj = js.Dynamic.literal()
    if (application != null) __obj.updateDynamic("application")(application.asInstanceOf[js.Any])
    if (scope != null) __obj.updateDynamic("scope")(scope.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (webUrl != null) __obj.updateDynamic("webUrl")(webUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[SharingLink]
  }
}

