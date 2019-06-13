package typings
package microsoftDashGraphLib.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ApplePushNotificationCertificate extends Entity {
  /** Apple Id of the account used to create the MDM push certificate. */
  var appleIdentifier: js.UndefOr[java.lang.String] = js.undefined
  /** Not yet documented */
  var certificate: js.UndefOr[java.lang.String] = js.undefined
  /** The expiration date and time for Apple push notification certificate. */
  var expirationDateTime: js.UndefOr[java.lang.String] = js.undefined
  /** Last modified date and time for Apple push notification certificate. */
  var lastModifiedDateTime: js.UndefOr[java.lang.String] = js.undefined
  /** Topic Id. */
  var topicIdentifier: js.UndefOr[java.lang.String] = js.undefined
}

object ApplePushNotificationCertificate {
  @scala.inline
  def apply(
    appleIdentifier: java.lang.String = null,
    certificate: java.lang.String = null,
    expirationDateTime: java.lang.String = null,
    id: java.lang.String = null,
    lastModifiedDateTime: java.lang.String = null,
    topicIdentifier: java.lang.String = null
  ): ApplePushNotificationCertificate = {
    val __obj = js.Dynamic.literal()
    if (appleIdentifier != null) __obj.updateDynamic("appleIdentifier")(appleIdentifier)
    if (certificate != null) __obj.updateDynamic("certificate")(certificate)
    if (expirationDateTime != null) __obj.updateDynamic("expirationDateTime")(expirationDateTime)
    if (id != null) __obj.updateDynamic("id")(id)
    if (lastModifiedDateTime != null) __obj.updateDynamic("lastModifiedDateTime")(lastModifiedDateTime)
    if (topicIdentifier != null) __obj.updateDynamic("topicIdentifier")(topicIdentifier)
    __obj.asInstanceOf[ApplePushNotificationCertificate]
  }
}

