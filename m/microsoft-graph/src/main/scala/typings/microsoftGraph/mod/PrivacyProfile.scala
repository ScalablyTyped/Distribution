package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PrivacyProfile extends js.Object {
  // A valid smtp email address for the privacy statement contact. Not required.
  var contactEmail: js.UndefOr[String] = js.native
  /**
    * A valid URL format that begins with http:// or https://. Maximum length is 255 characters. The URL that directs to the
    * company's privacy statement. Not required.
    */
  var statementUrl: js.UndefOr[String] = js.native
}

object PrivacyProfile {
  @scala.inline
  def apply(): PrivacyProfile = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PrivacyProfile]
  }
  @scala.inline
  implicit class PrivacyProfileOps[Self <: PrivacyProfile] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setContactEmail(value: String): Self = this.set("contactEmail", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContactEmail: Self = this.set("contactEmail", js.undefined)
    @scala.inline
    def setStatementUrl(value: String): Self = this.set("statementUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatementUrl: Self = this.set("statementUrl", js.undefined)
  }
  
}

