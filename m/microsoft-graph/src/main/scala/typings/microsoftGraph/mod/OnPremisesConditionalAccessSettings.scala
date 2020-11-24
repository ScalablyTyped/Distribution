package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OnPremisesConditionalAccessSettings extends Entity {
  
  // Indicates if on premises conditional access is enabled for this organization
  var enabled: js.UndefOr[Boolean] = js.native
  
  /**
    * User groups that will be exempt by on premises conditional access. All users in these groups will be exempt from the
    * conditional access policy.
    */
  var excludedGroups: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * User groups that will be targeted by on premises conditional access. All users in these groups will be required to have
    * mobile device managed and compliant for mail access.
    */
  var includedGroups: js.UndefOr[js.Array[String]] = js.native
  
  // Override the default access rule when allowing a device to ensure access is granted.
  var overrideDefaultRule: js.UndefOr[Boolean] = js.native
}
object OnPremisesConditionalAccessSettings {
  
  @scala.inline
  def apply(): OnPremisesConditionalAccessSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OnPremisesConditionalAccessSettings]
  }
  
  @scala.inline
  implicit class OnPremisesConditionalAccessSettingsOps[Self <: OnPremisesConditionalAccessSettings] (val x: Self) extends AnyVal {
    
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
    def setEnabled(value: Boolean): Self = this.set("enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnabled: Self = this.set("enabled", js.undefined)
    
    @scala.inline
    def setExcludedGroupsVarargs(value: String*): Self = this.set("excludedGroups", js.Array(value :_*))
    
    @scala.inline
    def setExcludedGroups(value: js.Array[String]): Self = this.set("excludedGroups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExcludedGroups: Self = this.set("excludedGroups", js.undefined)
    
    @scala.inline
    def setIncludedGroupsVarargs(value: String*): Self = this.set("includedGroups", js.Array(value :_*))
    
    @scala.inline
    def setIncludedGroups(value: js.Array[String]): Self = this.set("includedGroups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIncludedGroups: Self = this.set("includedGroups", js.undefined)
    
    @scala.inline
    def setOverrideDefaultRule(value: Boolean): Self = this.set("overrideDefaultRule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOverrideDefaultRule: Self = this.set("overrideDefaultRule", js.undefined)
  }
}
