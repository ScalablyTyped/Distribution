package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnPremisesConditionalAccessSettings
  extends StObject
     with Entity {
  
  // Indicates if on premises conditional access is enabled for this organization
  var enabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * User groups that will be exempt by on premises conditional access. All users in these groups will be exempt from the
    * conditional access policy.
    */
  var excludedGroups: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * User groups that will be targeted by on premises conditional access. All users in these groups will be required to have
    * mobile device managed and compliant for mail access.
    */
  var includedGroups: js.UndefOr[js.Array[String]] = js.undefined
  
  // Override the default access rule when allowing a device to ensure access is granted.
  var overrideDefaultRule: js.UndefOr[Boolean] = js.undefined
}
object OnPremisesConditionalAccessSettings {
  
  @scala.inline
  def apply(): OnPremisesConditionalAccessSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OnPremisesConditionalAccessSettings]
  }
  
  @scala.inline
  implicit class OnPremisesConditionalAccessSettingsMutableBuilder[Self <: OnPremisesConditionalAccessSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    @scala.inline
    def setExcludedGroups(value: js.Array[String]): Self = StObject.set(x, "excludedGroups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExcludedGroupsUndefined: Self = StObject.set(x, "excludedGroups", js.undefined)
    
    @scala.inline
    def setExcludedGroupsVarargs(value: String*): Self = StObject.set(x, "excludedGroups", js.Array(value :_*))
    
    @scala.inline
    def setIncludedGroups(value: js.Array[String]): Self = StObject.set(x, "includedGroups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludedGroupsUndefined: Self = StObject.set(x, "includedGroups", js.undefined)
    
    @scala.inline
    def setIncludedGroupsVarargs(value: String*): Self = StObject.set(x, "includedGroups", js.Array(value :_*))
    
    @scala.inline
    def setOverrideDefaultRule(value: Boolean): Self = StObject.set(x, "overrideDefaultRule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverrideDefaultRuleUndefined: Self = StObject.set(x, "overrideDefaultRule", js.undefined)
  }
}
