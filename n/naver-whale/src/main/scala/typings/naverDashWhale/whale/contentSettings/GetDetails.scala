package typings.naverDashWhale.whale.contentSettings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetDetails extends js.Object {
  /** Optional. Whether to check the content settings for an incognito session. (default false)  */
  var incognito: js.UndefOr[Boolean] = js.undefined
  /** The primary URL for which the content setting should be retrieved. Note that the meaning of a primary URL depends on the content type. */
  var primaryUrl: String
  /** Optional. A more specific identifier of the type of content for which the settings should be retrieved.  */
  var resourceIdentifier: js.UndefOr[typings.chrome.chrome.contentSettings.ResourceIdentifier] = js.undefined
  /** Optional. The secondary URL for which the content setting should be retrieved. Defaults to the primary URL. Note that the meaning of a secondary URL depends on the content type, and not all content types use secondary URLs.  */
  var secondaryUrl: js.UndefOr[String] = js.undefined
}

object GetDetails {
  @scala.inline
  def apply(
    primaryUrl: String,
    incognito: js.UndefOr[Boolean] = js.undefined,
    resourceIdentifier: typings.chrome.chrome.contentSettings.ResourceIdentifier = null,
    secondaryUrl: String = null
  ): GetDetails = {
    val __obj = js.Dynamic.literal(primaryUrl = primaryUrl)
    if (!js.isUndefined(incognito)) __obj.updateDynamic("incognito")(incognito)
    if (resourceIdentifier != null) __obj.updateDynamic("resourceIdentifier")(resourceIdentifier)
    if (secondaryUrl != null) __obj.updateDynamic("secondaryUrl")(secondaryUrl)
    __obj.asInstanceOf[GetDetails]
  }
}

