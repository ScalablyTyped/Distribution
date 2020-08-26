package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ApplePushNotificationCertificate extends Entity {
  // Apple Id of the account used to create the MDM push certificate.
  var appleIdentifier: js.UndefOr[String] = js.native
  // Not yet documented
  var certificate: js.UndefOr[String] = js.native
  // The expiration date and time for Apple push notification certificate.
  var expirationDateTime: js.UndefOr[String] = js.native
  // Last modified date and time for Apple push notification certificate.
  var lastModifiedDateTime: js.UndefOr[String] = js.native
  // Topic Id.
  var topicIdentifier: js.UndefOr[String] = js.native
}

object ApplePushNotificationCertificate {
  @scala.inline
  def apply(): ApplePushNotificationCertificate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ApplePushNotificationCertificate]
  }
  @scala.inline
  implicit class ApplePushNotificationCertificateOps[Self <: ApplePushNotificationCertificate] (val x: Self) extends AnyVal {
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
    def setAppleIdentifier(value: String): Self = this.set("appleIdentifier", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAppleIdentifier: Self = this.set("appleIdentifier", js.undefined)
    @scala.inline
    def setCertificate(value: String): Self = this.set("certificate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCertificate: Self = this.set("certificate", js.undefined)
    @scala.inline
    def setExpirationDateTime(value: String): Self = this.set("expirationDateTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExpirationDateTime: Self = this.set("expirationDateTime", js.undefined)
    @scala.inline
    def setLastModifiedDateTime(value: String): Self = this.set("lastModifiedDateTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLastModifiedDateTime: Self = this.set("lastModifiedDateTime", js.undefined)
    @scala.inline
    def setTopicIdentifier(value: String): Self = this.set("topicIdentifier", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTopicIdentifier: Self = this.set("topicIdentifier", js.undefined)
  }
  
}

