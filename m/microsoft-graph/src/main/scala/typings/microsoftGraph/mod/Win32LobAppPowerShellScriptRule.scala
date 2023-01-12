package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Win32LobAppPowerShellScriptRule
  extends StObject
     with Win32LobAppRule {
  
  // The script output comparison value. Do not specify a value if the rule is used for detection.
  var comparisonValue: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The display name for the rule. Do not specify this value if the rule is used for detection.
  var displayName: js.UndefOr[NullableOption[String]] = js.undefined
  
  // A value indicating whether a signature check is enforced.
  var enforceSignatureCheck: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The script output comparison operation type. Use NotConfigured (the default value) if the rule is used for detection.
    * Possible values are: notConfigured, string, dateTime, integer, float, version, boolean.
    */
  var operationType: js.UndefOr[Win32LobAppPowerShellScriptRuleOperationType] = js.undefined
  
  /**
    * The script output operator. Use NotConfigured (the default value) if the rule is used for detection. Possible values
    * are: notConfigured, equal, notEqual, greaterThan, greaterThanOrEqual, lessThan, lessThanOrEqual.
    */
  var operator: js.UndefOr[Win32LobAppRuleOperator] = js.undefined
  
  // A value indicating whether the script should run as 32-bit.
  var runAs32Bit: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The execution context of the script. Do not specify this value if the rule is used for detection. Script detection
    * rules will run in the same context as the associated app install context. Possible values are: system, user.
    */
  var runAsAccount: js.UndefOr[NullableOption[RunAsAccountType]] = js.undefined
  
  // The base64-encoded script content.
  var scriptContent: js.UndefOr[NullableOption[String]] = js.undefined
}
object Win32LobAppPowerShellScriptRule {
  
  inline def apply(): Win32LobAppPowerShellScriptRule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Win32LobAppPowerShellScriptRule]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Win32LobAppPowerShellScriptRule] (val x: Self) extends AnyVal {
    
    inline def setComparisonValue(value: NullableOption[String]): Self = StObject.set(x, "comparisonValue", value.asInstanceOf[js.Any])
    
    inline def setComparisonValueNull: Self = StObject.set(x, "comparisonValue", null)
    
    inline def setComparisonValueUndefined: Self = StObject.set(x, "comparisonValue", js.undefined)
    
    inline def setDisplayName(value: NullableOption[String]): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setEnforceSignatureCheck(value: Boolean): Self = StObject.set(x, "enforceSignatureCheck", value.asInstanceOf[js.Any])
    
    inline def setEnforceSignatureCheckUndefined: Self = StObject.set(x, "enforceSignatureCheck", js.undefined)
    
    inline def setOperationType(value: Win32LobAppPowerShellScriptRuleOperationType): Self = StObject.set(x, "operationType", value.asInstanceOf[js.Any])
    
    inline def setOperationTypeUndefined: Self = StObject.set(x, "operationType", js.undefined)
    
    inline def setOperator(value: Win32LobAppRuleOperator): Self = StObject.set(x, "operator", value.asInstanceOf[js.Any])
    
    inline def setOperatorUndefined: Self = StObject.set(x, "operator", js.undefined)
    
    inline def setRunAs32Bit(value: Boolean): Self = StObject.set(x, "runAs32Bit", value.asInstanceOf[js.Any])
    
    inline def setRunAs32BitUndefined: Self = StObject.set(x, "runAs32Bit", js.undefined)
    
    inline def setRunAsAccount(value: NullableOption[RunAsAccountType]): Self = StObject.set(x, "runAsAccount", value.asInstanceOf[js.Any])
    
    inline def setRunAsAccountNull: Self = StObject.set(x, "runAsAccount", null)
    
    inline def setRunAsAccountUndefined: Self = StObject.set(x, "runAsAccount", js.undefined)
    
    inline def setScriptContent(value: NullableOption[String]): Self = StObject.set(x, "scriptContent", value.asInstanceOf[js.Any])
    
    inline def setScriptContentNull: Self = StObject.set(x, "scriptContent", null)
    
    inline def setScriptContentUndefined: Self = StObject.set(x, "scriptContent", js.undefined)
  }
}
