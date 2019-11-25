package typings.microsoftDashGraph.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PrivacyProfile extends js.Object {
  // A valid smtp email address for the privacy statement contact. Not required.
  var contactEmail: js.UndefOr[String] = js.undefined
  /**
    * A valid URL format that begins with http:// or https://. Maximum length is 255 characters. The URL that directs to the
    * company's privacy statement. Not required.
    */
  var statementUrl: js.UndefOr[String] = js.undefined
}

object PrivacyProfile {
  @scala.inline
  def apply(contactEmail: String = null, statementUrl: String = null): PrivacyProfile = {
    val __obj = js.Dynamic.literal()
    if (contactEmail != null) __obj.updateDynamic("contactEmail")(contactEmail.asInstanceOf[js.Any])
    if (statementUrl != null) __obj.updateDynamic("statementUrl")(statementUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[PrivacyProfile]
  }
}

