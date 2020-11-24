package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Win32LobAppRegistryRule extends Win32LobAppRule {
  
  // A value indicating whether to search the 32-bit registry on 64-bit systems.
  var check32BitOn64System: js.UndefOr[Boolean] = js.native
  
  // The registry comparison value.
  var comparisonValue: js.UndefOr[NullableOption[String]] = js.native
  
  // The full path of the registry entry containing the value to detect.
  var keyPath: js.UndefOr[NullableOption[String]] = js.native
  
  // The registry operation type. Possible values are: notConfigured, exists, doesNotExist, string, integer, version.
  var operationType: js.UndefOr[Win32LobAppRegistryRuleOperationType] = js.native
  
  /**
    * The operator for registry detection. Possible values are: notConfigured, equal, notEqual, greaterThan,
    * greaterThanOrEqual, lessThan, lessThanOrEqual.
    */
  var operator: js.UndefOr[Win32LobAppRuleOperator] = js.native
  
  // The name of the registry value to detect.
  var valueName: js.UndefOr[NullableOption[String]] = js.native
}
object Win32LobAppRegistryRule {
  
  @scala.inline
  def apply(): Win32LobAppRegistryRule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Win32LobAppRegistryRule]
  }
  
  @scala.inline
  implicit class Win32LobAppRegistryRuleOps[Self <: Win32LobAppRegistryRule] (val x: Self) extends AnyVal {
    
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
    def setCheck32BitOn64System(value: Boolean): Self = this.set("check32BitOn64System", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCheck32BitOn64System: Self = this.set("check32BitOn64System", js.undefined)
    
    @scala.inline
    def setComparisonValue(value: NullableOption[String]): Self = this.set("comparisonValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteComparisonValue: Self = this.set("comparisonValue", js.undefined)
    
    @scala.inline
    def setComparisonValueNull: Self = this.set("comparisonValue", null)
    
    @scala.inline
    def setKeyPath(value: NullableOption[String]): Self = this.set("keyPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeyPath: Self = this.set("keyPath", js.undefined)
    
    @scala.inline
    def setKeyPathNull: Self = this.set("keyPath", null)
    
    @scala.inline
    def setOperationType(value: Win32LobAppRegistryRuleOperationType): Self = this.set("operationType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOperationType: Self = this.set("operationType", js.undefined)
    
    @scala.inline
    def setOperator(value: Win32LobAppRuleOperator): Self = this.set("operator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOperator: Self = this.set("operator", js.undefined)
    
    @scala.inline
    def setValueName(value: NullableOption[String]): Self = this.set("valueName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValueName: Self = this.set("valueName", js.undefined)
    
    @scala.inline
    def setValueNameNull: Self = this.set("valueName", null)
  }
}
