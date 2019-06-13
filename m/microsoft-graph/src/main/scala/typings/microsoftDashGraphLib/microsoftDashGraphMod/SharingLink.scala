package typings
package microsoftDashGraphLib.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SharingLink extends js.Object {
  /** The app the link is associated with. */
  var application: js.UndefOr[Identity] = js.undefined
  /**
    * The scope of the link represented by this permission. Value anonymous indicates the link is usable by anyone,
    * organization indicates the link is only usable for users signed into the same tenant.
    */
  var scope: js.UndefOr[java.lang.String] = js.undefined
  /** The type of the link created. */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
  /** A URL that opens the item in the browser on the OneDrive website. */
  var webUrl: js.UndefOr[java.lang.String] = js.undefined
}

object SharingLink {
  @scala.inline
  def apply(
    application: Identity = null,
    scope: java.lang.String = null,
    `type`: java.lang.String = null,
    webUrl: java.lang.String = null
  ): SharingLink = {
    val __obj = js.Dynamic.literal()
    if (application != null) __obj.updateDynamic("application")(application)
    if (scope != null) __obj.updateDynamic("scope")(scope)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (webUrl != null) __obj.updateDynamic("webUrl")(webUrl)
    __obj.asInstanceOf[SharingLink]
  }
}

