package typings.naverWhale.whale.contentSettings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetDetails extends js.Object {
  /** Optional. Whether to check the content settings for an incognito session. (default false)  */
  var incognito: js.UndefOr[Boolean] = js.native
  /** The primary URL for which the content setting should be retrieved. Note that the meaning of a primary URL depends on the content type. */
  var primaryUrl: String = js.native
  /** Optional. A more specific identifier of the type of content for which the settings should be retrieved.  */
  var resourceIdentifier: js.UndefOr[typings.chrome.chrome.contentSettings.ResourceIdentifier] = js.native
  /** Optional. The secondary URL for which the content setting should be retrieved. Defaults to the primary URL. Note that the meaning of a secondary URL depends on the content type, and not all content types use secondary URLs.  */
  var secondaryUrl: js.UndefOr[String] = js.native
}

object GetDetails {
  @scala.inline
  def apply(primaryUrl: String): GetDetails = {
    val __obj = js.Dynamic.literal(primaryUrl = primaryUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetDetails]
  }
  @scala.inline
  implicit class GetDetailsOps[Self <: GetDetails] (val x: Self) extends AnyVal {
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
    def setPrimaryUrl(value: String): Self = this.set("primaryUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def setIncognito(value: Boolean): Self = this.set("incognito", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIncognito: Self = this.set("incognito", js.undefined)
    @scala.inline
    def setResourceIdentifier(value: typings.chrome.chrome.contentSettings.ResourceIdentifier): Self = this.set("resourceIdentifier", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResourceIdentifier: Self = this.set("resourceIdentifier", js.undefined)
    @scala.inline
    def setSecondaryUrl(value: String): Self = this.set("secondaryUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSecondaryUrl: Self = this.set("secondaryUrl", js.undefined)
  }
  
}

