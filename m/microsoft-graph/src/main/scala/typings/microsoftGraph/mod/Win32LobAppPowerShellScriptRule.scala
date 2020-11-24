package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Win32LobAppPowerShellScriptRule extends Win32LobAppRule {
  
  // The script output comparison value. Do not specify a value if the rule is used for detection.
  var comparisonValue: js.UndefOr[NullableOption[String]] = js.native
  
  // The display name for the rule. Do not specify this value if the rule is used for detection.
  var displayName: js.UndefOr[NullableOption[String]] = js.native
  
  // A value indicating whether a signature check is enforced.
  var enforceSignatureCheck: js.UndefOr[Boolean] = js.native
  
  /**
    * The script output comparison operation type. Use NotConfigured (the default value) if the rule is used for detection.
    * Possible values are: notConfigured, string, dateTime, integer, float, version, boolean.
    */
  var operationType: js.UndefOr[Win32LobAppPowerShellScriptRuleOperationType] = js.native
  
  /**
    * The script output operator. Use NotConfigured (the default value) if the rule is used for detection. Possible values
    * are: notConfigured, equal, notEqual, greaterThan, greaterThanOrEqual, lessThan, lessThanOrEqual.
    */
  var operator: js.UndefOr[Win32LobAppRuleOperator] = js.native
  
  // A value indicating whether the script should run as 32-bit.
  var runAs32Bit: js.UndefOr[Boolean] = js.native
  
  /**
    * The execution context of the script. Do not specify this value if the rule is used for detection. Script detection
    * rules will run in the same context as the associated app install context.
    */
  var runAsAccount: js.UndefOr[NullableOption[RunAsAccountType]] = js.native
  
  // The base64-encoded script content.
  var scriptContent: js.UndefOr[NullableOption[String]] = js.native
}
object Win32LobAppPowerShellScriptRule {
  
  @scala.inline
  def apply(): Win32LobAppPowerShellScriptRule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Win32LobAppPowerShellScriptRule]
  }
  
  @scala.inline
  implicit class Win32LobAppPowerShellScriptRuleOps[Self <: Win32LobAppPowerShellScriptRule] (val x: Self) extends AnyVal {
    
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
    def setComparisonValue(value: NullableOption[String]): Self = this.set("comparisonValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteComparisonValue: Self = this.set("comparisonValue", js.undefined)
    
    @scala.inline
    def setComparisonValueNull: Self = this.set("comparisonValue", null)
    
    @scala.inline
    def setDisplayName(value: NullableOption[String]): Self = this.set("displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplayName: Self = this.set("displayName", js.undefined)
    
    @scala.inline
    def setDisplayNameNull: Self = this.set("displayName", null)
    
    @scala.inline
    def setEnforceSignatureCheck(value: Boolean): Self = this.set("enforceSignatureCheck", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnforceSignatureCheck: Self = this.set("enforceSignatureCheck", js.undefined)
    
    @scala.inline
    def setOperationType(value: Win32LobAppPowerShellScriptRuleOperationType): Self = this.set("operationType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOperationType: Self = this.set("operationType", js.undefined)
    
    @scala.inline
    def setOperator(value: Win32LobAppRuleOperator): Self = this.set("operator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOperator: Self = this.set("operator", js.undefined)
    
    @scala.inline
    def setRunAs32Bit(value: Boolean): Self = this.set("runAs32Bit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRunAs32Bit: Self = this.set("runAs32Bit", js.undefined)
    
    @scala.inline
    def setRunAsAccount(value: NullableOption[RunAsAccountType]): Self = this.set("runAsAccount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRunAsAccount: Self = this.set("runAsAccount", js.undefined)
    
    @scala.inline
    def setRunAsAccountNull: Self = this.set("runAsAccount", null)
    
    @scala.inline
    def setScriptContent(value: NullableOption[String]): Self = this.set("scriptContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScriptContent: Self = this.set("scriptContent", js.undefined)
    
    @scala.inline
    def setScriptContentNull: Self = this.set("scriptContent", null)
  }
}
