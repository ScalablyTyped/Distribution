package typings.naverWhale.whale.contentSettings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SetDetails extends js.Object {
  /** The pattern for the primary URL. For details on the format of a pattern, see Content Setting Patterns. */
  var primaryPattern: String = js.native
  /** Optional. The resource identifier for the content type.  */
  var resourceIdentifier: js.UndefOr[typings.chrome.chrome.contentSettings.ResourceIdentifier] = js.native
  /** Optional. Where to set the setting (default: regular).  */
  var scope: js.UndefOr[typings.chrome.chrome.contentSettings.ScopeEnum] = js.native
  /** Optional. The pattern for the secondary URL. Defaults to matching all URLs. For details on the format of a pattern, see Content Setting Patterns.  */
  var secondaryPattern: js.UndefOr[String] = js.native
  /** The setting applied by this rule. See the description of the individual ContentSetting objects for the possible values. */
  var setting: js.Any = js.native
}

object SetDetails {
  @scala.inline
  def apply(primaryPattern: String, setting: js.Any): SetDetails = {
    val __obj = js.Dynamic.literal(primaryPattern = primaryPattern.asInstanceOf[js.Any], setting = setting.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetDetails]
  }
  @scala.inline
  implicit class SetDetailsOps[Self <: SetDetails] (val x: Self) extends AnyVal {
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
    def setPrimaryPattern(value: String): Self = this.set("primaryPattern", value.asInstanceOf[js.Any])
    @scala.inline
    def setSetting(value: js.Any): Self = this.set("setting", value.asInstanceOf[js.Any])
    @scala.inline
    def setResourceIdentifier(value: typings.chrome.chrome.contentSettings.ResourceIdentifier): Self = this.set("resourceIdentifier", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResourceIdentifier: Self = this.set("resourceIdentifier", js.undefined)
    @scala.inline
    def setScope(value: typings.chrome.chrome.contentSettings.ScopeEnum): Self = this.set("scope", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScope: Self = this.set("scope", js.undefined)
    @scala.inline
    def setSecondaryPattern(value: String): Self = this.set("secondaryPattern", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSecondaryPattern: Self = this.set("secondaryPattern", js.undefined)
  }
  
}

